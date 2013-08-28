package felis2.codes;

import com.mathworks.toolbox.javabuilder.*;
import felis.*;

public class Feature {
    private static String DBName = "newDB2.mat";

    public static String getDBName(){ return DBName ; }
    public static void setDBName(String db){ DBName = db; }
    
    public static void updateDB(String pathname){
        Felis f;
        if(pathname == null)
            return ;

         try{
            f = new Felis();
            f.initialLoaderFileUpdate(DBName, pathname);         
         }catch(Exception e){
             e.printStackTrace();
         }finally{
                Felis.disposeAllInstances();
         }
     }

    public static void loadIntoDB(String pathname) {
        Felis f;
        if(pathname == null)
            return ;

        try{
            f = new Felis();

            try{
                f.loadIntoDB(DBName, pathname);
            }catch(Exception e){
                return;
            }finally{
                Felis.disposeAllInstances();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static String[] searchByImage(String pathname){
       Felis f;
        if(pathname == null)
            return null;
        try{
            f = new Felis();

            Object[] o = f.searchImageHist(1, DBName, pathname, Setting.getNoResult());
            MWCellArray x = (MWCellArray)o[0];
            String[] result = new String[x.numberOfElements()];

            for(int i=0; i<result.length ; ++i){
                MWArray arr = x.getCell(new int[]{i+1,1});
                result[i] = arr.toString();
            }
            return result;
        }catch(Exception e){
            Felis.disposeAllInstances();
            e.printStackTrace();
        }finally{
            Felis.disposeAllInstances();
        }
        return null;
    }

    public static String[] searchByObject(String pathname){
        Felis f;
        if(pathname == null)
            return null;
        try{
            f = new Felis();

            Object[] o = f.ObjectSearchingInterface(1, DBName, pathname, Setting.getNoResult(), Setting.getColorFactor(), Setting.getShapeFactor(),Setting.getTextureFactor());
            MWCellArray x = (MWCellArray)o[0];
            String[] result = new String[x.numberOfElements()];

            for(int i=0; i<result.length ; ++i){
                MWArray arr = x.getCell(new int[]{i+1,1});
                result[i] = arr.toString();
            }
            
            return result;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            Felis.disposeAllInstances();
        }
        return null;
    }

    public static String[] showAll(){
        Felis f;
        try{
            f = new Felis();

            Object[] o = f.showAllImages(1, DBName);
            MWCellArray x = (MWCellArray)o[0];
            String[] result = new String[x.numberOfElements()];

            for(int i=0; i<result.length ; ++i){
                MWArray arr = x.getCell(new int[]{i+1, 1});
                result[i] = arr.toString();
            }
            
            return result;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            Felis.disposeAllInstances();
        }
        return null;
    }
}
