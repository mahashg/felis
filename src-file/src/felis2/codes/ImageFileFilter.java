/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package felis2.codes;

import java.io.File;

public class ImageFileFilter extends javax.swing.filechooser.FileFilter{
    private final String[] fileExtension ={".JPG", ".JPEG", ".JPE", ".JFIF", ".BMP", ".DIB", ".PNG", ".GIF", ".TIF", ".TIFF"};

    @Override
    public boolean accept(File pathname) {        
        if(pathname.isDirectory())
            return true;
        
        for(int i=0; i<fileExtension.length ; ++i){
            if(pathname.getName().toUpperCase().endsWith(fileExtension[i])){
                return true;
            }
        }
        return false;
    }


    @Override
    public String getDescription() {
        return "Image Files";
    }
}
