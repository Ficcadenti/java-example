//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11-b140731.1112 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.10.12 alle 11:21:55 PM CEST 
//


package it.raffo.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per modulo.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="modulo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FACEBOOK"/>
 *     &lt;enumeration value="LINKEDIN"/>
 *     &lt;enumeration value="ANALISI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "modulo")
@XmlEnum
public enum Modulo {

    FACEBOOK,
    LINKEDIN,
    ANALISI;

    public String value() {
        return name();
    }

    public static Modulo fromValue(String v) {
        return valueOf(v);
    }

}
