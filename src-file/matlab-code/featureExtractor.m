% FROM A GIVEN IMAGE FILE NAME IT COMPUTS ITS FEATURE VECTOR AND NUMBER OF OBJECTS PRESENT IN IT
% WHICH IS RETURNED AS RETURN VALUE

function [feature, elem_size] = featureExtractor(imgName)

image_orig = imread(imgName);
size_image = size(image_orig);
image_orig = double(image_orig);


% Choose different scales
% Segmentation parameter Q; Q small few segments, Q large may segments
Qlevels=2.^(8:-1:0);

% This creates the following list of Qs [32 16 8 4 2 1]
% Creates 9 segmentations
[maps, images]=srm(image_orig,Qlevels);

map = maps{8, 1};
image = images{8, 1};

no_elems = unique(map);
 
feature = struct('color', {}, 'shape', {}, 'texture', {});

count = 1;  %% Number of objects recognized till now..

 for i=1: size(no_elems)
    [X, Y] = find(map == no_elems(i,1));
    img = zeros(size_image(1:3));
    shape_img = zeros(size_image(1:3));
    
    for j= 1:size(X)
        img(X(j), Y(j), :) = image_orig(X(j), Y(j), :);
        shape_img(X(j), Y(j), :) = image(X(j), Y(j), :);
    end
    
    img = uint8(img);
    
    feature{1, i} = ObjectfeatureExtractor(img);
            
    count = count+1;
    
 end
 elem_size = count-1;
