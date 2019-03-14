
package org.altervista.fabriziocelli.wsClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "TestWS", targetNamespace = "http://fabriziocelli.altervista.org/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TestWS {

	/**
	 * 
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String getLanguages();

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String getTermcodeByTerm(@WebParam(name = "arg0", partName = "arg0") String arg0);

}