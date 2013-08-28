% For a given object, computes its HSV hist 

function [Hist] = getHSVHist(imageName)

% read RGB data:
RGB = imageName;
RGB = rgb2hsv(RGB);

% get image size:
[M,N,~] = size(RGB);

range = 0.0:0.1:1.0;

Hist = zeros(length(range),length(range),length(range));

for i=1:M
    for j=1:N        
        nn1 = round(RGB(i,j,1) * 10)+1;
        nn2 = round(RGB(i,j,2) * 10)+1;        
        nn3 = round(RGB(i,j,3) * 10)+1;
        
        Hist(nn1, nn2, nn3) = Hist(nn1, nn2, nn3) + 1;
        
    end
end

Hist = Hist / (M*N);