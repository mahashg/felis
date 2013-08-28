% This function for initial loading of an image into database..
% This function loads the specified database if present otherwise creates an empty database.
% For each image present in the pathname, its Hash, Path, Image Histogram (HSV based) and object feature 
% i.e. color, shape & texture are evaluated and are stored in the database..
%
function loadIntoDB(dbname, pathname)

if(isdir(pathname))
    filenames = get_file_list(pathname);
else
    filenames{1} = pathname;
end

if(exist(dbname) == 0)
     files = cell(0);
     filehash = cell(0);
     Hists = cell(0);
     objects = cell(0);
     no = cell(0);
     
     save(dbname, 'files', 'filehash', 'Hists', 'objects', 'no');   %% Create an empty Database...
end
 
load(dbname);

for i= 1: length(filenames)    
    fname = filenames{i};
    fhash = hash(imread(fname));
  
    repeat = find(ismember(filehash, fhash) == 1);  %%... Check if the file is already in the database or not..
    
    if(numel(repeat) == 0)  %% No Repeat.. File Not already in database
        
        leng = length(Hists);    %%.. No of elements in the database..
        next = leng+1; %% index of new data to be inserted..
        
        Hists{next, 1} = getImageHists(fname);  %%.. Imae Histogram..        
        files{next, 1} = fname; %%.. File name
        filehash{next, 1} = fhash; %%.. File Hash.
        [objects{next, 1}, no{next, 1}] = featureExtractor(fname);    %% Object Features & no of objects in Image
   
       save(dbname, 'files', 'filehash', 'Hists', 'objects', 'no');
     else  %% Element is already present only its relocated..
         files{1, repeat} = fname;    %%.. Update file location entry in database...
     end
   
end
