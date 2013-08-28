/*
 * MATLAB Compiler: 4.13 (R2010a)
 * Date: Mon Mar 07 08:07:53 2011
 * Arguments: "-B" "macro_default" "-W" "java:felis,Main" "-T" "link:lib" "-d" 
 * "C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for 
 * FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\felis\\src" "-w" 
 * "enable:specified_file_mismatch" "-w" "enable:repeated_file" "-w" 
 * "enable:switch_ignored" "-w" "enable:missing_lib_sentinel" "-w" "enable:demo_license" 
 * "-v" "class{Main:C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New 
 * DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final 
 * Code\\blog\\compareHSVHist.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\compareShape.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\compareTexture.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\featureExtractor.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\get_file_list.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\getHSVHist.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\getImageHists.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\getShape.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\getTexture.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\hash.m,C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New 
 * DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final 
 * Code\\blog\\initialLoaderFileUpdate.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\loadIntoDB.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\makelinear.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\ObjectfeatureExtractor.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\ObjectSearchingInterface.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\searchImageHist.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\searchObjects.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\showAllImages.m,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\srm.m,C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New 
 * DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final 
 * Code\\blog\\srm_boundarygradient.mexw32,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\srm_boundarylen.mexw32,C:\\Documents and Settings\\Dinesh\\My 
 * Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi 
 * Final Code\\blog\\srm_imgGrad.m}" 
 */

package felis;

import com.mathworks.toolbox.javabuilder.pooling.Poolable;
import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * The <code>MainRemote</code> class provides a Java RMI-compliant interface to the 
 * M-functions from the files:
 * <pre>
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\compareHSVHist.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\compareShape.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\compareTexture.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\featureExtractor.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\get_file_list.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\getHSVHist.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\getImageHists.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\getShape.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\getTexture.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\hash.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\initialLoaderFileUpdate.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\loadIntoDB.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\makelinear.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\ObjectfeatureExtractor.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\ObjectSearchingInterface.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\searchImageHist.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\searchObjects.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\showAllImages.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\srm.m
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\srm_boundarygradient.mexw32
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\srm_boundarylen.mexw32
 *  C:\\Documents and Settings\\Dinesh\\My Documents\\MATLAB\\New DataType for FELIS\\DataTypesDemoComp\\Dowloaded Code\\Semi Final Code\\blog\\srm_imgGrad.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a <code>MainRemote</code> 
 * instance when it is no longer needed to ensure that native resources allocated by this 
 * class are properly freed, and the server-side proxy is unexported.  (Failure to call 
 * dispose may result in server-side threads not being properly shut down, which often 
 * appears as a hang.)  
 *
 * This interface is designed to be used together with 
 * <code>com.mathworks.toolbox.javabuilder.remoting.RemoteProxy</code> to automatically 
 * generate RMI server proxy objects for instances of felis.Main.
 */
public interface MainRemote extends Poolable
{
    /**
     * Provides the standard interface for calling the <code>compareHSVHist</code> 
     * M-function with 2 input arguments.  
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
     * % decision thresholds:
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
    public Object[] compareHSVHist(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>compareShape</code> 
     * M-function with 2 input arguments.  
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
    public Object[] compareShape(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>compareTexture</code> 
     * M-function with 2 input arguments.  
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
    public Object[] compareTexture(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>featureExtractor</code> 
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
     * M-documentation as provided by the author of the M function:
     * <pre>
     * % Choose different scales
     * % Segmentation parameter Q; Q small few segments, Q large may segments
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
    public Object[] featureExtractor(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>get_file_list</code> 
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
     * M-documentation as provided by the author of the M function:
     * <pre>
     * % get contents of path
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
    public Object[] get_file_list(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>getHSVHist</code> M-function 
     * with 1 input argument.  
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
     * % read RGB data:
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
    public Object[] getHSVHist(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>getImageHists</code> 
     * M-function with 2 input arguments.  
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
     * % read RGB data:
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
    public Object[] getImageHists(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>getShape</code> M-function 
     * with 1 input argument.  
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
     * % normalise
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
    public Object[] getShape(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>getTexture</code> M-function 
     * with 1 input argument.  
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
     * % getting the size of the input image
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
    public Object[] getTexture(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>hash</code> M-function with 
     * 1 input argument.  
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
     * % convert strings and logicals into uint8 format
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
    public Object[] hash(int nargout, Object... rhs) throws RemoteException;
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
     * Provides the standard interface for calling the <code>makelinear</code> M-function 
     * with 1 input argument.  
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
    public Object[] makelinear(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the 
     * <code>ObjectfeatureExtractor</code> M-function with 1 input argument.  
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
    public Object[] ObjectfeatureExtractor(int nargout, Object... rhs) throws RemoteException;
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
     * Provides the standard interface for calling the <code>searchObjects</code> 
     * M-function with 6 input arguments.  
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
    public Object[] searchObjects(int nargout, Object... rhs) throws RemoteException;
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
    /**
     * Provides the standard interface for calling the <code>srm</code> M-function with 2 
     * input arguments.  
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
     * % Smoothing the image, comment this line if you work on clean or synthetic images
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
    public Object[] srm(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>srm_boundarygradient</code> 
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
    public Object[] srm_boundarygradient(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>srm_boundarylen</code> 
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
    public Object[] srm_boundarylen(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>srm_imgGrad</code> 
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
     * M-documentation as provided by the author of the M function:
     * <pre>
     * % This function outputs the x-derivative and y-derivative of the
     * % input I. If I is 3D, then derivatives of each channel are
     * % available in xd and yd.
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
    public Object[] srm_imgGrad(int nargout, Object... rhs) throws RemoteException;
  
    /** Frees native resources associated with the remote server object */
    void dispose() throws RemoteException;
}
