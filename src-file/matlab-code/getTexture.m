function F = getTexture(image)

output_bits=1;
input_bits=8;
theta=45;
d=205;


% getting the size of the input image

im_final=floor(double(image)/(2^output_bits));
[im_final_x im_final_y]=size(im_final);

% setting the size of the co-occurence matrices depending on the grey level depth
CO_size=2^input_bits/(2^output_bits);
SGLD=zeros(CO_size,CO_size);
      
      
switch theta
   case {0}
     for i=1:im_final_x
       for j=1:(im_final_y-d)
          SGLD(im_final(i,j)+1,im_final(i,j+d)+1)=SGLD(im_final(i,j)+1,im_final(i,j+d)+1)+1;
       end
     end
     
   case {45}
      for i=(1+d):im_final_x
        for j=1:(im_final_y-d)
          SGLD(im_final(i,j)+1,im_final(i-d,j+d)+1)=SGLD(im_final(i,j)+1,im_final(i-d,j+d)+1)+1;
        end
      end

   case {90}
      for i=(1+d):im_final_x
        for j=1:im_final_y
          SGLD(im_final(i,j)+1,im_final(i-d,j)+1)=SGLD(im_final(i,j)+1,im_final(i-d,j)+1)+1;
        end
      end

   case {135}
      for i=(1+d):im_final_x
        for j=(1+d):im_final_y
          SGLD(im_final(i,j)+1,im_final(i-d,j-d)+1)=SGLD(im_final(i,j)+1,im_final(i-d,j-d)+1)+1;
        end
      end
end
   
% make the SGLD matrix symmetric by adding it's transpose to it
SGLD=SGLD+SGLD';

% normalize the SGLD matrix to values between 0 and 1
SGLD=SGLD/sum(sum(SGLD));    
    

% *****************************************************
% Calculating the texture features from the SGLD matrix
% *****************************************************

foo=SGLD;

% Entropy 
F.Entropy=sum(sum(-((full(spfun(@log2,foo))).*foo)));

% Energy:
F.Energy=sum(sum(foo.*foo));

% Inertia:
[i,j,v]=find(foo);
F.Inertia=sum((((i-1)-(j-1)).*((i-1)-(j-1))).*v);

% Inverse differnece moment:
F.Inverse_Diff_Moment=sum((1./(1+(((i-1)-(j-1)).*((i-1)-(j-1))))).*v);

% Correlation:
[m,n]=size(foo);

px=sum(foo,2);
[i,~,v]=find(px);
mu_x=sum((i-1).*v);
sigma_x=sum((((i-1)-mu_x).^2).*v);
h_x=sum(sum(-((full(spfun(@log2,px))).*px)));
temp1=repmat(px,[1 m]);

py=sum(foo,1);
[~,j,v]=find(py);
mu_y=sum((j-1).*v);
sigma_y=sum((((j-1)-mu_y).^2).*v);
h_y=sum(sum(-((full(spfun(@log2,py))).*py)));
temp2=repmat(py,[n 1]);


[i,j,v]=find(foo);
F.Correlation=(sum(((i-1)-mu_x).*((j-1)-mu_y).*v))/sqrt(sigma_x*sigma_y);

% Information measures of correlation 1 and 2:
foo1=-(foo.*(((temp1.*temp2)==0)-1));
foo2=-((temp1.*temp2).*((foo1==0)-1));
[~,~,v1]=find(foo1);
[~,~,v2]=find(foo2);
h1=sum((sum(-(v1.*(log2(v2))))));

F.Info_Corr_1=(F.Entropy-h1)/max(h_x,h_y);
[~,~,v]=find(temp1.*temp2);
h2=sum((sum(-(v.*(log2(v))))));
F.Info_Corr_2=sqrt((1-exp(-2*(h2-F.Entropy))));

% Sum average, variance and entropy:
[i,j,v]=find(foo);
k=i+j-1;
pk_sum=zeros(max(k),1);
for l=min(k):max(k)
  pk_sum(l)=sum(v(k==l));
end

[i,~,v]=find(pk_sum);
F.Sum_Avg=sum((i-1).*v);
F.Sum_Var=sum((((i-1)-F.Sum_Avg).^2).*v);
F.Sum_Entropy=sum(-((full(spfun(@log2,pk_sum))).*pk_sum));
 
% Difference average, variance and entropy:
[i,j,v]=find(foo);
k=abs(i-j);
pk_diff=zeros(max(k)+1,1);
for l=min(k):max(k)
   pk_diff(l+1)=sum(v(k==l));
end

[i,~,v]=find(pk_diff);
F.Diff_Avg=sum((i-1).*v);
F.Diff_Var=sum((((i-1)-F.Diff_Avg).^2).*v);
F.Diff_Entropy=sum(-((full(spfun(@log2,pk_diff))).*pk_diff));    