package com.raffo.servlet;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class MyTag extends TagSupport
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4929934658460540983L;

	/**
	 * L'attributo viene utilizzato per definire uno stile
	 */
	private String className;

	/**
	 * L'attributo viene utilizzato per definire il nome utente
	 */
	private String nome;

	/**
	 * Metodi getter and setter
	 */
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setNome(String value){
		this.nome = value;
	}

	public String getNome(){
		return(nome);
	}

	/**
	 * Il metodo viene invocato dal container quando viene incontrato il tag xml
	 */

	public int doStartTag() {
		try {
			//Recupero lo stream di output e scrivo il contenuto personalizzato
			JspWriter out = pageContext.getOut();

			//L'attributo className � definito obbligatorio nel tld
			out.println("<div class=\""+className+"\">");
			if (nome != null)
				out.println("Ciao <b>" + nome + "</b>, questo è il tuo primo <i>Custom Tag</i>");
			else
				out.println("Ciao a tutti!!");
		} catch (Exception e) {
			e.printStackTrace();
		}

		/**
		 * Non c'è contenuto da elaborare all'interno del tag
		 * quindi restituiamo il codice SKIP_BODY.
		 */

		return TagSupport.SKIP_BODY;
	}

	/**
	 * Il metodo viene invocato alla chiusura del tag
	 */

	public int doEndTag(){
		try {
			JspWriter out = pageContext.getOut();
			out.println("</div>");
		} catch (Exception e){
			e.printStackTrace();
		}

		//Continua a valutare il resto della pagina

		return TagSupport.EVAL_PAGE;
	}
}
