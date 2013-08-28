% This function is used to select all the filenames present in the image
% database...

function [filename] = showAllImages(dbname)
  load(dbname);
  
  filename = files;
end