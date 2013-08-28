% This function takes an entire image shows it to user and takes input as an object and searches the list of similar images containing same object
% Result is returned to calling function in the form of search result

function [filenames] = ObjectSearchingInterface(dbname, imgName, nResult, colFact, shaFact, texact)

% Read Image
orig_img = double(imread(imgName));

% Perform Image Segmentation
Qlevels = 2.^(8:-1:0);
[maps, im] = srm(orig_img, Qlevels);

% Read co-oridinate of object and hence read the object
figure(1), imshow(uint8(im{9,1}));
[xcord ycord] = ginput(1);

close all;
xcord = uint8(xcord);
ycord = uint8(ycord);

% Read the object
ind = maps{9,1}(xcord, ycord);
[x y] = find(maps{9,1} == ind);

% Create IFV extractable object represeentation
img = zeros(size(orig_img));
    
for j= 1:size(x)
        img(x(j), y(j), :) = orig_img(x(j), y(j), :);
end
img = uint8(img);

% Search Similar Objects
filenames =searchObjects( dbname, img, nResult, colFact, shaFact, texact);

end