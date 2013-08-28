package felis2.codes;


public class Setting {
    private static int queryWidth = 200, queryHeight = 200;
    private static int frameWidth = 1000, frameHeight = 750;
    private static int columnCount = 8;
    private static int resultWidth = 100, resultHeight = 100;
    private static int nResults = 50;
    private static double colorFact = 0.5, shapeFact = 0.5, textureFact = 0.5;
    private static String query;
    private static boolean setLogGeneration;
    
    public static void setQueryWidth(int size){ Setting.queryWidth = size; }
    public static int getQueryWidth(){ return Setting.queryWidth; }

    public static void setQueryHeight(int size){ Setting.queryHeight = size; }
    public static  int getQueryHeight(){ return Setting.queryHeight; }

    public static  void setResultWidth(int size){ Setting.resultWidth = size; }
    public static  int getResultWidth(){ return Setting.resultWidth; }

    public static  void setResultHeight(int size){ Setting.resultHeight = size; }
    public static  int getResultHeight(){ return Setting.resultHeight; }

    public static  void setFrameWidth(int size){ Setting.frameWidth = size; }
    public static  int getFrameWidth(){ return Setting.frameWidth; }

    public static  void setFrameHeight(int size){ Setting.frameHeight = size; }
    public static  int getFrameHeight(){ return Setting.frameHeight; }

    public static  void setNoResult(int size){ Setting.nResults = size; }
    public static  int getNoResult(){ return Setting.nResults; }

    public static  void setColumnCount(int size){ Setting.columnCount = size; }
    public static  int getColumnCount(){ return Setting.columnCount; }

    public static  void setColorFactor(double size){ Setting.colorFact = size; }
    public static  double getColorFactor(){ return Setting.colorFact; }

    public static  void setShapeFactor(double size){ Setting.shapeFact = size; }
    public static  double getShapeFactor(){ return Setting.shapeFact; }

    public static  void setTextureFactor(double size){ Setting.textureFact = size; }
    public static  double getTextureFactor(){ return Setting.textureFact; }

    public static void setQueryString(String size){ Setting.query = size;}
    public static String getQueryString(){ return Setting.query; }

    public static void setLogGeneration(boolean val){ Setting.setLogGeneration = val;}
    public static boolean getLogGeneration(){ return Setting.setLogGeneration; }
}
