% Function used to compare image histogram from all the database and return nResults object as return value

function[filenames] = searchImageHist(modelName, imageName, nResults)

load(modelName);
Hist = getImageHists(imageName);

Nfiles = length(Hists);

t = 0.010;
t2 = 0.8;

range = 0.0:0.1:1.0;
rangeNew = 0.0:0.05:1.0;
[x,y,z]    = meshgrid(range);
[x2,y2,z2] = meshgrid(rangeNew);

Hist = interp3(x,y,z,Hist,x2,y2,z2);

Similarity = zeros(Nfiles, 1);

for (i=1:Nfiles) % for each file in database:
    
    % compute (normalized) eucledean distance for all hist bins:
    HistT = interp3(x,y,z,Hists{i},x2,y2,z2);
    DIFF = abs(Hist-HistT) ./ Hist;
    
    % keep distance values for which the corresponding query image's values
    % are larger than the predefined threshold:    
    DIFF = DIFF(Hist>t);
    
    % keep error values which are smaller than 1:
    DIFF2 = DIFF(DIFF<t2);
    L2 = length(DIFF2);
    
    % compute the similarity meaasure:
    Similarity(i) = length(DIFF) * mean(DIFF2) / (L2^2);
    
    % (interface): plot images with small similarity measures:
    plotThres = 0.5 * 10 / length(DIFF);
end

% find the nResult "closest" images:
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