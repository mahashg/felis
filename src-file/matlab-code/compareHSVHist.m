% Takes HSV Histogram of two images and returns the similarity between the two..

function [Similarity] = compareHSVHist(Hist1, Hist2)

range = 0.0:0.1:1.0;
rangeNew = 0.0:0.05:1.0;
[x,y,z]    = meshgrid(range);
[x2,y2,z2] = meshgrid(rangeNew);

% decision thresholds:
t = 0.010;
t2 = 0.8;

Hist1 = interp3(x,y,z,Hist1,x2,y2,z2);
Hist2 = interp3(x,y,z,Hist2,x2,y2,z2);
DIFF = abs(Hist1-Hist2) ./ Hist1;

DIFF(isnan(DIFF)) = 0; 
DIFF(isinf(DIFF)) = 1; 

DIFF2 = DIFF(Hist1 > t & Hist1 < t2);

% keep distance values for which the corresponding query image's values
% are larger than the predefined threshold:    
DIFF = DIFF(Hist1>t);

% keep error values which are smaller than 1:
L2 = length(DIFF2);

Similarity = length(DIFF) * mean(DIFF2)/ (L2^2);
