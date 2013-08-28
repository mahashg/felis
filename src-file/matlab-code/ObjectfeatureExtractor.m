function [feature] = ObjectfeatureExtractor(img)
   
feature.color = getHSVHist(img);
feature.texture = getTexture(img);
feature.shape = getShape(img);
            
end

