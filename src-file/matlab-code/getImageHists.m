% For a given Image file name, it computes the HSV histogram which is a 11X11X11 Matrix

function [Hist] = getImageHists(imageName, ~)

% read RGB data:
RGB = imread(imageName);
RGBt = RGB;
RGB = rgb2hsv(RGB);

% get image size:
[M,N, ttt] = size(RGB);

range = 0.0:0.1:1.0;

Hist = zeros(length(range),length(range),length(range));

if(ttt == 3)	%% FOR STD RGB IMAGE
    for i=1:M
        for j=1:N
            nn1 = round(RGB(i,j,1) * 10)+1;
            nn2 = round(RGB(i,j,2) * 10)+1;        
            nn3 = round(RGB(i,j,3) * 10)+1;
        
            Hist(nn1, nn2, nn3) = Hist(nn1, nn2, nn3) + 1;
        
        end
    end
else		%% FOR BLACK & WHITE IMAGE
    for i=1:M
        for j=1:N    
            nn1 = round(RGB(i,j,1) * 10)+1;        
            Hist(nn1, 1, 1) = Hist(nn1, 1, 1) + 1;
        
        end
    end
end

Hist = Hist / (M*N);