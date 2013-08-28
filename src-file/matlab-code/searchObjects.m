% For given object specified by imageName it is searched into modelName & each feature is given a specific
% Weight which is measured by colFact, shaFact & texFact. nResults in the number of similiar objects which 
% user expects to obtain from given query.
% Return value is the list of path of most similar nResults obtained by comparison

function[filenames] = searchObjects(modelName, imageName, nResults, colFact, shaFact, texFact)

load(modelName);


Nfiles = length(Hists);

colSimilarity = ones(Nfiles, 1);
shaSimilarity = zeros(Nfiles, 1);
texSimilarity = zeros(Nfiles, 1);
Similarity = zeros(Nfiles, 1);

feature = ObjectfeatureExtractor(imageName);

for i= 1:Nfiles
    noObj = no{i};
    
    for j= 1: noObj
        colTemp = objects{i,1}{1,j}.color;
        shaTemp = objects{i,1}{1,j}.shape;
        texTemp = objects{i,1}{1,j}.texture;
        
        colsim = compareHSVHist(feature.color, colTemp);
        colSimilarity(i, 1) = min(colsim, colSimilarity(i, 1));
        
        shasim = compareShape(feature.shape, shaTemp);
        shaSimilarity(i, 1) = max(shasim, shaSimilarity(i, 1));
        
        texsim = compareTexture(feature.texture, texTemp);
        texSimilarity(i, 1) = min(texsim, texSimilarity(i, 1));
    end    
end

minshape = max(shaSimilarity(:,1));

for i= 1: Nfiles
    shaSimilarity(i, 1) = minshape - shaSimilarity(i, 1);
    Similarity(i, 1) = colSimilarity(i, 1)*colFact + shaSimilarity(i, 1)*shaFact + texSimilarity(i, 1)*texFact; 
end

[~, ISorted] = sort(Similarity);

filenames = cell(nResults, 1);
count = 1;
for i=1:Nfiles
    x = files{ISorted(i)};
    if(exist(x, 'file'))
        filenames {count, 1} = x;
        count = count+1;
    end
    if(count > nResults)
        break;
    end
end

end