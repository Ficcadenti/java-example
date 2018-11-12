//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11-b140731.1112 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.10.22 alle 10:52:22 PM CEST 
//


package it.sogei.poste;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HEADER" type="{}HEADER_TYPE"/>
 *         &lt;element name="ELENCO_CAP_NON_GESTITI" type="{}ELENCO_CAP_NON_GESTITI_TYPE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "elencocapnongestiti"
})
@XmlRootElement(name = "CAP")
public class CAP {

    @XmlElement(name = "HEADER", required = true)
    protected HEADERTYPE header;
    @XmlElement(name = "ELENCO_CAP_NON_GESTITI", required = true)
    protected ELENCOCAPNONGESTITITYPE elencocapnongestiti;

    /**
     * Recupera il valore della proprietà header.
     * 
     * @return
     *     possible object is
     *     {@link HEADERTYPE }
     *     
     */
    public HEADERTYPE getHEADER() {
        return header;
    }

    /**
     * Imposta il valore della proprietà header.
     * 
     * @param value
     *     allowed object is
     *     {@link HEADERTYPE }
     *     
     */
    public void setHEADER(HEADERTYPE value) {
        this.header = value;
    }

    /**
     * Recupera il valore della proprietà elencocapnongestiti.
     * 
     * @return
     *     possible object is
     *     {@link ELENCOCAPNONGESTITITYPE }
     *     
     */
    public ELENCOCAPNONGESTITITYPE getELENCOCAPNONGESTITI() {
        return elencocapnongestiti;
    }

    /**
     * Imposta il valore della proprietà elencocapnongestiti.
     * 
     * @param value
     *     allowed object is
     *     {@link ELENCOCAPNONGESTITITYPE }
     *     
     */
    public void setELENCOCAPNONGESTITI(ELENCOCAPNONGESTITITYPE value) {
        this.elencocapnongestiti = value;
    }

}
