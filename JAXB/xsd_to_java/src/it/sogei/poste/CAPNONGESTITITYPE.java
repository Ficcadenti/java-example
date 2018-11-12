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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per CAP_NON_GESTITI_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CAP_NON_GESTITI_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AREA_DESTINAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_VARIAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_EFFETTO_VARIAZIONE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAP_NON_GESTITI_TYPE", propOrder = {
    "cap",
    "areadestinazione",
    "tipovariazione",
    "dataeffettovariazione"
})
public class CAPNONGESTITITYPE {

    @XmlElement(name = "CAP", required = true)
    protected String cap;
    @XmlElement(name = "AREA_DESTINAZIONE", required = true)
    protected String areadestinazione;
    @XmlElement(name = "TIPO_VARIAZIONE", required = true)
    protected String tipovariazione;
    @XmlElement(name = "DATA_EFFETTO_VARIAZIONE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataeffettovariazione;

    /**
     * Recupera il valore della proprietà cap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAP() {
        return cap;
    }

    /**
     * Imposta il valore della proprietà cap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAP(String value) {
        this.cap = value;
    }

    /**
     * Recupera il valore della proprietà areadestinazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAREADESTINAZIONE() {
        return areadestinazione;
    }

    /**
     * Imposta il valore della proprietà areadestinazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAREADESTINAZIONE(String value) {
        this.areadestinazione = value;
    }

    /**
     * Recupera il valore della proprietà tipovariazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOVARIAZIONE() {
        return tipovariazione;
    }

    /**
     * Imposta il valore della proprietà tipovariazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOVARIAZIONE(String value) {
        this.tipovariazione = value;
    }

    /**
     * Recupera il valore della proprietà dataeffettovariazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAEFFETTOVARIAZIONE() {
        return dataeffettovariazione;
    }

    /**
     * Imposta il valore della proprietà dataeffettovariazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAEFFETTOVARIAZIONE(XMLGregorianCalendar value) {
        this.dataeffettovariazione = value;
    }

}
