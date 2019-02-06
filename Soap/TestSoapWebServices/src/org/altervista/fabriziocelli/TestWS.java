package org.altervista.fabriziocelli;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public class TestWS {

	/**
	 * Get all available languages
	 * @return
	 */
	@WebMethod
	public String getLanguages (){
		return "{en, fr, it}";
	}


	/**
	 * Returns the termcode
	 * @param searchTerm
	 * @return the termcode
	 */
	@WebMethod
	public String getTermcodeByTerm(String searchTerm) {
		return searchTerm;
	}





}
