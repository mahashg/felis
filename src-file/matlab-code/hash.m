% Treats input as a data and uses java class to calculate MD 5 Hash which is 128 bit and returns.
% this function is used to keep track of image even if it is moved to another location or renamed..

function h = hash(inp)

inp=inp(:);

% convert strings and logicals into uint8 format
if ischar(inp) || islogical(inp)
    inp=uint8(inp);
else % convert everything else into uint8 format without loss of data
    inp=typecast(inp,'uint8');
end

% create hash
x=java.security.MessageDigest.getInstance('MD5');
x.update(inp);
h=typecast(x.digest,'uint8');
h=dec2hex(h)';
if(size(h,1))==1 % remote possibility: all hash bytes < 128, so pad:
    h=[repmat('0',[1 size(h,2)]);h];
end
h=lower(h(:)');
clear x
return