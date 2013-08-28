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
import java.util.*;

/**
 * The <code>Felis</code> class provides a Java interface to the M-functions
 * from the files:
 * <pre>
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\initialLoaderFileUpdate.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\loadIntoDB.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\ObjectSearchingInterface.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\searchImageHist.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\showAllImages.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a <code>Felis</code> instance 
 * when it is no longer needed to ensure that native resources allocated by this class 
 * are properly freed.
 * @version 0.0
 */
public class Felis extends MWComponentInstance<Felis>
{
    /**
     * Tracks all instances of this class to ensure their dispose method is
     * called on shutdown.
     */
    private static final Set<Disposable> sInstances = new HashSet<Disposable>();

    /**
     * Maintains information used in calling the <code>initialLoaderFileUpdate</code> 
     *M-function.
     */
    private static final MWFunctionSignature sInitialLoaderFileUpdateSignature =
        new MWFunctionSignature(/* max outputs = */ 0,
                                /* has varargout = */ false,
                                /* function name = */ "initialLoaderFileUpdate",
                                /* max inputs = */ 2,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>loadIntoDB</code> M-function.
     */
    private static final MWFunctionSignature sLoadIntoDBSignature =
        new MWFunctionSignature(/* max outputs = */ 0,
                                /* has varargout = */ false,
                                /* function name = */ "loadIntoDB",
                                /* max inputs = */ 2,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>ObjectSearchingInterface</code> 
     *M-function.
     */
    private static final MWFunctionSignature sObjectSearchingInterfaceSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "ObjectSearchingInterface",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>searchImageHist</code> M-function.
     */
    private static final MWFunctionSignature sSearchImageHistSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "searchImageHist",
                                /* max inputs = */ 3,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>showAllImages</code> M-function.
     */
    private static final MWFunctionSignature sShowAllImagesSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "showAllImages",
                                /* max inputs = */ 1,
                                /* has varargin = */ false);

    /**
     * Shared initialization implementation - private
     */
    private Felis (final MWMCR mcr) throws MWException
    {
        super(mcr);
        // add this to sInstances
        synchronized(Felis.class) {
            sInstances.add(this);
        }
    }

    /**
     * Constructs a new instance of the <code>Felis</code> class.
     */
    public Felis() throws MWException
    {
        this(FelisMCRFactory.newInstance());
    }
    
    private static MWComponentOptions getPathToComponentOptions(String path)
    {
        MWComponentOptions options = new MWComponentOptions(new MWCtfExtractLocation(path),
                                                            new MWCtfDirectorySource(path));
        return options;
    }
    
    /**
     * @deprecated Please use the constructor {@link #Felis(MWComponentOptions componentOptions)}.
     * The <code>com.mathworks.toolbox.javabuilder.MWComponentOptions</code> class provides API to set the
     * path to the component.
     * @param pathToComponent Path to component directory.
     */
    public Felis(String pathToComponent) throws MWException
    {
        this(FelisMCRFactory.newInstance(getPathToComponentOptions(pathToComponent)));
    }
    
    /**
     * Constructs a new instance of the <code>Felis</code> class. Use this constructor to 
     * specify the options required to instantiate this component.  The options will be 
     * specific to the instance of this component being created.
     * @param componentOptions Options specific to the component.
     */
    public Felis(MWComponentOptions componentOptions) throws MWException
    {
        this(FelisMCRFactory.newInstance(componentOptions));
    }
    
    /** Frees native resources associated with this object */
    public void dispose()
    {
        try {
            super.dispose();
        } finally {
            synchronized(Felis.class) {
                sInstances.remove(this);
            }
        }
    }
  
    /**
     * Invokes the first m-function specified by MCC, with any arguments given on
     * the command line, and prints the result.
     */
    public static void main (String[] args)
    {
        try {
            MWMCR mcr = FelisMCRFactory.newInstance();
            mcr.runMain( sInitialLoaderFileUpdateSignature, args);
            mcr.dispose();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    /**
     * Calls dispose method for each outstanding instance of this class.
     */
    public static void disposeAllInstances()
    {
        synchronized(Felis.class) {
            for (Disposable i : sInstances) i.dispose();
            sInstances.clear();
        }
    }

    /**
     * Provides the interface for calling the <code>initialLoaderFileUpdate</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void initialLoaderFileUpdate(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sInitialLoaderFileUpdateSignature);
    }

    /**
     * Provides the interface for calling the <code>initialLoaderFileUpdate</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void initialLoaderFileUpdate(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sInitialLoaderFileUpdateSignature);
    }

    /**
     * Provides the standard interface for calling the <code>initialLoaderFileUpdate</code>
     * M-function with 2 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] initialLoaderFileUpdate(Object... rhs) throws MWException
    {
        Object[] lhs = new Object[0];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sInitialLoaderFileUpdateSignature), 
                    sInitialLoaderFileUpdateSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>loadIntoDB</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void loadIntoDB(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sLoadIntoDBSignature);
    }

    /**
     * Provides the interface for calling the <code>loadIntoDB</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void loadIntoDB(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sLoadIntoDBSignature);
    }

    /**
     * Provides the standard interface for calling the <code>loadIntoDB</code>
     * M-function with 2 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] loadIntoDB(Object... rhs) throws MWException
    {
        Object[] lhs = new Object[0];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sLoadIntoDBSignature), 
                    sLoadIntoDBSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>ObjectSearchingInterface</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % Read Image
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void ObjectSearchingInterface(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sObjectSearchingInterfaceSignature);
    }

    /**
     * Provides the interface for calling the <code>ObjectSearchingInterface</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % Read Image
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void ObjectSearchingInterface(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sObjectSearchingInterfaceSignature);
    }

    /**
     * Provides the standard interface for calling the <code>ObjectSearchingInterface</code>
     * M-function with 6 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % Read Image
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] ObjectSearchingInterface(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sObjectSearchingInterfaceSignature), 
                    sObjectSearchingInterfaceSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>searchImageHist</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % compute (normalized) eucledean distance for all hist bins:
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void searchImageHist(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sSearchImageHistSignature);
    }

    /**
     * Provides the interface for calling the <code>searchImageHist</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % compute (normalized) eucledean distance for all hist bins:
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void searchImageHist(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sSearchImageHistSignature);
    }

    /**
     * Provides the standard interface for calling the <code>searchImageHist</code>
     * M-function with 3 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % compute (normalized) eucledean distance for all hist bins:
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] searchImageHist(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sSearchImageHistSignature), 
                    sSearchImageHistSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>showAllImages</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void showAllImages(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sShowAllImagesSignature);
    }

    /**
     * Provides the interface for calling the <code>showAllImages</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void showAllImages(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sShowAllImagesSignature);
    }

    /**
     * Provides the standard interface for calling the <code>showAllImages</code>
     * M-function with 1 input argument.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] showAllImages(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sShowAllImagesSignature), 
                    sShowAllImagesSignature);
        return lhs;
    }
}
