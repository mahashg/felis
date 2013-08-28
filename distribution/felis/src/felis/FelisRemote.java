/*
 * MATLAB Compiler: 4.13 (R2010a)
 * Date: Fri Mar 18 01:41:58 2011
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

import com.mathworks.toolbox.javabuilder.pooling.Poolable;
import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * The <code>FelisRemote</code> class provides a Java RMI-compliant interface to the 
 * M-functions from the files:
 * <pre>
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\initialLoaderFileUpdate.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\loadIntoDB.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\ObjectSearchingInterface.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\searchImageHist.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\FELIS\\showAllImages.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a <code>FelisRemote</code> 
 * instance when it is no longer needed to ensure that native resources allocated by this 
 * class are properly freed, and the server-side proxy is unexported.  (Failure to call 
 * dispose may result in server-side threads not being properly shut down, which often 
 * appears as a hang.)  
 *
 * This interface is designed to be used together with 
 * <code>com.mathworks.toolbox.javabuilder.remoting.RemoteProxy</code> to automatically 
 * generate RMI server proxy objects for instances of felis.Felis.
 */
public interface FelisRemote extends Poolable
{
    /**
     * Provides the standard interface for calling the 
     * <code>initialLoaderFileUpdate</code> M-function with 2 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * No usage documentation is available for this function.  (To fix this, the function 
     * author should insert a help comment at the beginning of their M code.  See the 
     * MATLAB documentation for more details.)
     *
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] initialLoaderFileUpdate(Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>loadIntoDB</code> M-function 
     * with 2 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * No usage documentation is available for this function.  (To fix this, the function 
     * author should insert a help comment at the beginning of their M code.  See the 
     * MATLAB documentation for more details.)
     *
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] loadIntoDB(Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the 
     * <code>ObjectSearchingInterface</code> M-function with 6 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * % Read Image
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] ObjectSearchingInterface(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>searchImageHist</code> 
     * M-function with 3 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * % compute (normalized) eucledean distance for all hist bins:
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] searchImageHist(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>showAllImages</code> 
     * M-function with 1 input argument.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * No usage documentation is available for this function.  (To fix this, the function 
     * author should insert a help comment at the beginning of their M code.  See the 
     * MATLAB documentation for more details.)
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] showAllImages(int nargout, Object... rhs) throws RemoteException;
  
    /** Frees native resources associated with the remote server object */
    void dispose() throws RemoteException;
}
