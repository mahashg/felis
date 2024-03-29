/*
 * MATLAB Compiler: 4.13 (R2010a)
 * Date: Fri Mar 18 01:41:57 2011
 * Arguments: "-B" "macro_default" "-W" "java:felis,Felis" "-T" "link:lib" "-d" 
 * "C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\felis\\src" "-w" 
 * "enable:specified_file_mismatch" "-w" "enable:repeated_file" "-w" 
 * "enable:switch_ignored" "-w" "enable:missing_lib_sentinel" "-w" "enable:demo_license" 
 * "-v" "class{Felis:C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\FELIS\\initialLoaderFileUpdate.m,C:\\Documents and 
 * Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\loadIntoDB.m,C:\\Documents and 
 * Settings\\Dinesh\\My 
 * Documents\\MATLAB\\FELIS\\ObjectSearchingInterface.m,C:\\Documents and 
 * Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\searchImageHist.m,C:\\Documents and 
 * Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\showAllImages.m}" "-a" "C:\\Documents 
 * and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\compareHSVHist.m" "-a" 
 * "C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\compareShape.m" "-a" 
 * "C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\compareTexture.m" 
 * "-a" "C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\FELIS\\featureExtractor.m" "-a" "C:\\Documents and 
 * Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\get_file_list.m" "-a" "C:\\Documents 
 * and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\getHSVHist.m" "-a" "C:\\Documents 
 * and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\getImageHists.m" "-a" 
 * "C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\getShape.m" "-a" 
 * "C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\getTexture.m" "-a" 
 * "C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\hash.m" "-a" 
 * "C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\makelinear.m" "-a" 
 * "C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\FELIS\\ObjectfeatureExtractor.m" "-a" "C:\\Documents and 
 * Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\searchObjects.m" "-a" "C:\\Documents 
 * and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\srm.m" "-a" "C:\\Documents and 
 * Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\srm_boundarygradient.mexw32" "-a" 
 * "C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\FELIS\\srm_boundarylen.mexw32" "-a" "C:\\Documents and 
 * Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\srm_imgGrad.m" 
 */

package felis;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class FelisMCRFactory
{
    /** Application key data */
    private static final byte[] sSessionKey = 
        { 49, 57, 70, 50, 53, 49, 69, 57, 68, 68, 67, 51, 66, 66, 54, 66, 54, 56, 50, 69, 
        65, 55, 65, 68, 48, 56, 48, 55, 69, 49, 55, 67, 52, 66, 66, 55, 69, 51, 55, 54, 
        48, 50, 69, 67, 69, 48, 68, 52, 55, 55, 67, 53, 49, 53, 51, 51, 52, 54, 65, 50, 
        68, 66, 49, 49, 55, 67, 53, 54, 68, 69, 48, 51, 67, 52, 55, 56, 66, 65, 70, 57, 
        56, 68, 52, 51, 65, 53, 49, 66, 49, 51, 51, 53, 65, 70, 68, 65, 55, 51, 70, 52, 
        65, 67, 66, 55, 49, 70, 66, 68, 51, 69, 67, 53, 55, 69, 69, 54, 53, 54, 48, 53, 
        56, 57, 50, 65, 55, 51, 70, 68, 53, 66, 49, 51, 69, 49, 51, 70, 53, 69, 54, 52, 
        70, 69, 50, 55, 56, 52, 67, 68, 56, 53, 52, 48, 67, 50, 53, 49, 49, 51, 67, 54, 
        68, 69, 57, 54, 66, 49, 52, 68, 54, 69, 67, 48, 54, 52, 48, 48, 54, 65, 50, 57, 
        50, 50, 53, 53, 48, 67, 50, 69, 54, 51, 70, 55, 65, 51, 66, 57, 56, 70, 68, 56, 
        56, 70, 48, 49, 65, 65, 66, 67, 69, 50, 68, 48, 66, 49, 50, 48, 54, 69, 48, 49, 
        69, 48, 67, 65, 50, 69, 57, 69, 50, 55, 67, 69, 48, 50, 67, 68, 69, 69, 50, 54, 
        54, 49, 55, 48, 51, 53, 68, 53, 48, 48, 69, 55, 56, 48, 66, 66 };
    
    /** Public key data */
    private static final byte[] sPublicKey = 
        { 51, 48, 56, 49, 57, 68, 51, 48, 48, 68, 48, 54, 48, 57, 50, 65, 56, 54, 52, 56, 
        56, 54, 70, 55, 48, 68, 48, 49, 48, 49, 48, 49, 48, 53, 48, 48, 48, 51, 56, 49, 
        56, 66, 48, 48, 51, 48, 56, 49, 56, 55, 48, 50, 56, 49, 56, 49, 48, 48, 67, 52, 
        57, 67, 65, 67, 51, 52, 69, 68, 49, 51, 65, 53, 50, 48, 54, 53, 56, 70, 54, 70, 
        56, 69, 48, 49, 51, 56, 67, 52, 51, 49, 53, 66, 52, 51, 49, 53, 50, 55, 55, 69, 
        68, 51, 70, 55, 68, 65, 69, 53, 51, 48, 57, 57, 68, 66, 48, 56, 69, 69, 53, 56, 
        57, 70, 56, 48, 52, 68, 52, 66, 57, 56, 49, 51, 50, 54, 65, 53, 50, 67, 67, 69, 
        52, 51, 56, 50, 69, 57, 70, 50, 66, 52, 68, 48, 56, 53, 69, 66, 57, 53, 48, 67, 
        55, 65, 66, 49, 50, 69, 68, 69, 50, 68, 52, 49, 50, 57, 55, 56, 50, 48, 69, 54, 
        51, 55, 55, 65, 53, 70, 69, 66, 53, 54, 56, 57, 68, 52, 69, 54, 48, 51, 50, 70, 
        54, 48, 67, 52, 51, 48, 55, 52, 65, 48, 52, 67, 50, 54, 65, 66, 55, 50, 70, 53, 
        52, 66, 53, 49, 66, 66, 52, 54, 48, 53, 55, 56, 55, 56, 53, 66, 49, 57, 57, 48, 
        49, 52, 51, 49, 52, 65, 54, 53, 70, 48, 57, 48, 66, 54, 49, 70, 67, 50, 48, 49, 
        54, 57, 52, 53, 51, 66, 53, 56, 70, 67, 56, 66, 65, 52, 51, 69, 54, 55, 55, 54, 
        69, 66, 55, 69, 67, 68, 51, 49, 55, 56, 66, 53, 54, 65, 66, 48, 70, 65, 48, 54, 
        68, 68, 54, 52, 57, 54, 55, 67, 66, 49, 52, 57, 69, 53, 48, 50, 48, 49, 49, 49 };
    
    /** Component's MATLAB path */
    private static final String[] sMatlabPath = 
        { "felis/",
          "$TOOLBOXDEPLOYDIR/",
          "$TOOLBOXMATLABDIR/general/",
          "$TOOLBOXMATLABDIR/ops/",
          "$TOOLBOXMATLABDIR/lang/",
          "$TOOLBOXMATLABDIR/elmat/",
          "$TOOLBOXMATLABDIR/randfun/",
          "$TOOLBOXMATLABDIR/elfun/",
          "$TOOLBOXMATLABDIR/specfun/",
          "$TOOLBOXMATLABDIR/matfun/",
          "$TOOLBOXMATLABDIR/datafun/",
          "$TOOLBOXMATLABDIR/polyfun/",
          "$TOOLBOXMATLABDIR/funfun/",
          "$TOOLBOXMATLABDIR/sparfun/",
          "$TOOLBOXMATLABDIR/scribe/",
          "$TOOLBOXMATLABDIR/graph2d/",
          "$TOOLBOXMATLABDIR/graph3d/",
          "$TOOLBOXMATLABDIR/specgraph/",
          "$TOOLBOXMATLABDIR/graphics/",
          "$TOOLBOXMATLABDIR/uitools/",
          "$TOOLBOXMATLABDIR/strfun/",
          "$TOOLBOXMATLABDIR/imagesci/",
          "$TOOLBOXMATLABDIR/iofun/",
          "$TOOLBOXMATLABDIR/audiovideo/",
          "$TOOLBOXMATLABDIR/timefun/",
          "$TOOLBOXMATLABDIR/datatypes/",
          "$TOOLBOXMATLABDIR/verctrl/",
          "$TOOLBOXMATLABDIR/codetools/",
          "$TOOLBOXMATLABDIR/helptools/",
          "$TOOLBOXMATLABDIR/winfun/",
          "$TOOLBOXMATLABDIR/winfun/net/",
          "$TOOLBOXMATLABDIR/demos/",
          "$TOOLBOXMATLABDIR/timeseries/",
          "$TOOLBOXMATLABDIR/hds/",
          "$TOOLBOXMATLABDIR/guide/",
          "$TOOLBOXMATLABDIR/plottools/",
          "toolbox/local/",
          "$TOOLBOXMATLABDIR/datamanager/",
          "toolbox/compiler/",
          "toolbox/images/colorspaces/",
          "toolbox/images/images/",
          "toolbox/images/imuitools/",
          "toolbox/images/iptformats/",
          "toolbox/images/iptutils/",
          "toolbox/shared/imageslib/" };
    
    /** Items to be added to component's class path */
    private static final String[] sClassPath = 
        { "java/jar/toolbox/images.jar" };
    
    /** Items to be added to component's lib path */
    private static final String[] sLibraryPath =
        { "bin/win32/" };
    
    /** MCR instance-specific runtime options */
    private static final String[] sApplicationOptions =
        {};
    
    /** MCR global runtime options */
    private static final String[] sRuntimeOptions = {};
    
    /** Runtime warning states */
    private static final String[] sSetWarningState = 
        { "off:MATLAB:dispatcher:nameConflict" };
    
    /** Component's preference directory */
    private static final String sComponentPrefDir = "felis_9A24F5F26A99B057808DE21665AB053D";
    
    /** Component name */
    private static final String sComponentName = "felis";
    
    /** Pointer to native component-data structure */
    private static final NativeComponentData sComponentData = 
        new NativeComponentData(
            createComponentData(
                MWMCR.findComponentParentDirOnClassPath(
                    sComponentName, 
                    "felis"
                )
            )
        );
    
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(FelisMCRFactory.class)
        );
    
    /** Creates a native component-data structure */
    static NativePtr createComponentData(String pathToComponent)
    {
        try {
            return MWMCR.getNativeMCR().mclCreateComponentData(
                sPublicKey, 
                sComponentName, 
                "",
                sSessionKey,
                sMatlabPath,
                sClassPath,
                sLibraryPath,
                sApplicationOptions,
                sRuntimeOptions,
                sComponentPrefDir,
                pathToComponent,
                sSetWarningState
            );
        }
        catch (MWException e) {
            return NativePtr.NULL;
        }
    }
    
    private FelisMCRFactory()
    {
        // Never called.
    }
    
    public static MWMCR newInstance(MWComponentOptions componentOptions) throws MWException
    {
        if (null == componentOptions.getCtfSource()) {
            componentOptions = new MWComponentOptions(componentOptions);
            componentOptions.setCtfSource(sDefaultComponentOptions.getCtfSource());
        }
        return MWMCR.newInstance(
            sComponentData, 
            componentOptions, 
            FelisMCRFactory.class, 
            sComponentName, 
            new int[]{7,13}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
