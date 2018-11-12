//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11-b140731.1112 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.10.22 alle 10:52:22 PM CEST 
//


package it.sogei.poste;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="NUMERO_DISTINTE_CONTROLLATE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DISTINTA_CONTROLLATA" type="{}DISTINTA_CONTROLLATA_EDE_TYPE" maxOccurs="unbounded"/>
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
    "numerodistintecontrollate",
    "distintacontrollata"
})
@XmlRootElement(name = "EDE")
public class EDE {

    @XmlElement(name = "HEADER", required = true)
    protected HEADERTYPE header;
    @XmlElement(name = "NUMERO_DISTINTE_CONTROLLATE")
    protected int numerodistintecontrollate;
    @XmlElement(name = "DISTINTA_CONTROLLATA", required = true)
    protected List<DISTINTACONTROLLATAEDETYPE> distintacontrollata;

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
     * Recupera il valore della proprietà numerodistintecontrollate.
     * 
     */
    public int getNUMERODISTINTECONTROLLATE() {
        return numerodistintecontrollate;
    }

    /**
     * Imposta il valore della proprietà numerodistintecontrollate.
     * 
     */
    public void setNUMERODISTINTECONTROLLATE(int value) {
        this.numerodistintecontrollate = value;
    }

    /**
     * Gets the value of the distintacontrollata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distintacontrollata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDISTINTACONTROLLATA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISTINTACONTROLLATAEDETYPE }
     * 
     * 
     */
    public List<DISTINTACONTROLLATAEDETYPE> getDISTINTACONTROLLATA() {
        if (distintacontrollata == null) {
            distintacontrollata = new ArrayList<DISTINTACONTROLLATAEDETYPE>();
        }
        return this.distintacontrollata;
    }

}
