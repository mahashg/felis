function initialLoaderFileUpdate(dbname, pathname)

filenames = get_file_list(pathname);

load(dbname);
leng = length(filenames); 

for i=1:leng
   fname = filenames{i};
   fhash = hash(imread(fname));
   repeat = find(ismember(filehash, fhash) == 1);

   if(numel(repeat) ~= 0)  %% Element is already present only its relocated..
       files{1, repeat} = fname;    
       save(dbname, 'files', 'filehash', 'Hists', 'objects', 'no');
   end     
end

end