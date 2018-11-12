//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11-b140731.1112 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.10.12 alle 11:21:55 PM CEST 
//


package it.raffo.jaxb;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.raffo.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.raffo.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hrp }
     * 
     */
    public Hrp createHrp() {
        return new Hrp();
    }

    /**
     * Create an instance of {@link Curriculum }
     * 
     */
    public Curriculum createCurriculum() {
        return new Curriculum();
    }

    /**
     * Create an instance of {@link Output }
     * 
     */
    public Output createOutput() {
        return new Output();
    }

    /**
     * Create an instance of {@link Template }
     * 
     */
    public Template createTemplate() {
        return new Template();
    }

    /**
     * Create an instance of {@link Utente }
     * 
     */
    public Utente createUtente() {
        return new Utente();
    }

    /**
     * Create an instance of {@link ResultTemplate }
     * 
     */
    public ResultTemplate createResultTemplate() {
        return new ResultTemplate();
    }

    /**
     * Create an instance of {@link Token }
     * 
     */
    public Token createToken() {
        return new Token();
    }

}
