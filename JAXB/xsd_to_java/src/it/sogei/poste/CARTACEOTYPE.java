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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CARTACEO_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CARTACEO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROGR_MAZZETTA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUM_RACCOMANDATA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUM_DOCUMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_SPEDIZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_OGGETTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IDENTIFICATIVO" type="{}IDENTIFICATIVO_TYPE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CARTACEO_TYPE", propOrder = {
    "progrmazzetta",
    "numraccomandata",
    "numdocumento",
    "tipospedizione",
    "tipooggetto",
    "identificativo"
})
public class CARTACEOTYPE {

    @XmlElement(name = "PROGR_MAZZETTA")
    protected int progrmazzetta;
    @XmlElement(name = "NUM_RACCOMANDATA", required = true)
    protected String numraccomandata;
    @XmlElement(name = "NUM_DOCUMENTO", required = true)
    protected String numdocumento;
    @XmlElement(name = "TIPO_SPEDIZIONE", required = true)
    protected String tipospedizione;
    @XmlElement(name = "TIPO_OGGETTO", required = true)
    protected String tipooggetto;
    @XmlElement(name = "IDENTIFICATIVO", required = true)
    protected IDENTIFICATIVOTYPE identificativo;

    /**
     * Recupera il valore della proprietà progrmazzetta.
     * 
     */
    public int getPROGRMAZZETTA() {
        return progrmazzetta;
    }

    /**
     * Imposta il valore della proprietà progrmazzetta.
     * 
     */
    public void setPROGRMAZZETTA(int value) {
        this.progrmazzetta = value;
    }

    /**
     * Recupera il valore della proprietà numraccomandata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMRACCOMANDATA() {
        return numraccomandata;
    }

    /**
     * Imposta il valore della proprietà numraccomandata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMRACCOMANDATA(String value) {
        this.numraccomandata = value;
    }

    /**
     * Recupera il valore della proprietà numdocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMDOCUMENTO() {
        return numdocumento;
    }

    /**
     * Imposta il valore della proprietà numdocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMDOCUMENTO(String value) {
        this.numdocumento = value;
    }

    /**
     * Recupera il valore della proprietà tipospedizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOSPEDIZIONE() {
        return tipospedizione;
    }

    /**
     * Imposta il valore della proprietà tipospedizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOSPEDIZIONE(String value) {
        this.tipospedizione = value;
    }

    /**
     * Recupera il valore della proprietà tipooggetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOOGGETTO() {
        return tipooggetto;
    }

    /**
     * Imposta il valore della proprietà tipooggetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOOGGETTO(String value) {
        this.tipooggetto = value;
    }

    /**
     * Recupera il valore della proprietà identificativo.
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFICATIVOTYPE }
     *     
     */
    public IDENTIFICATIVOTYPE getIDENTIFICATIVO() {
        return identificativo;
    }

    /**
     * Imposta il valore della proprietà identificativo.
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFICATIVOTYPE }
     *     
     */
    public void setIDENTIFICATIVO(IDENTIFICATIVOTYPE value) {
        this.identificativo = value;
    }

}
