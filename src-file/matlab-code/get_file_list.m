% From a given directory name it computs the file list of all images..
function flist = get_file_list(pathname)
    flist = {};
    
	fileextension = {'.JPG', '.JPEG', '.JPE', 'JFIF', '.BMP', '.DIB', '.PNG', '.GIF', '.TIF', '.TIFF'};
    
	% crop trailing '/'
    if pathname(end) == '/'
      pathname = pathname(1:end-1);
    end
	
    % get contents of path
    d = dir( pathname );
    for iter = 1:length(d)
      token = d(iter).name;
      % skip this and up directory
      if ( strcmp(token, '.') || strcmp(token,'..') )
        continue
      end
      % if item is directory, enter it
      if d(iter).isdir == 1
        subdir = strcat( pathname, '/', token );
        sublist = get_file_list( subdir );
        % append directory files
        flist = [flist sublist];
      else
          [~, ~, ext, ~] = fileparts(token);
          flag = 0;
          for fexind = 1:length(fileextension)
              if(strcmpi(ext, fileextension{fexind}))
                  flag = 1;
                  break;
              end
          end
          if (flag == 1)
            fname = strcat( pathname, '/', token );
            flist = [flist fname];
          end
      end
    end
  end
