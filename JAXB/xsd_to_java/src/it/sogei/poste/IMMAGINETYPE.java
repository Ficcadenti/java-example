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
 * <p>Classe Java per IMMAGINE_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IMMAGINE_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NOME_IMMAGINE_FRONTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HASH_CODE_FRONTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NOME_IMMAGINE_RETRO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HASH_CODE_RETRO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_IMMAGINE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUM_ID_SCATOLA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PROGRESSIVO_CARTACEO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
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
@XmlType(name = "IMMAGINE_TYPE", propOrder = {
    "nomeimmaginefronte",
    "hashcodefronte",
    "nomeimmagineretro",
    "hashcoderetro",
    "tipoimmagine",
    "numidscatola",
    "progressivocartaceo",
    "identificativo"
})
public class IMMAGINETYPE {

    @XmlElement(name = "NOME_IMMAGINE_FRONTE", required = true)
    protected String nomeimmaginefronte;
    @XmlElement(name = "HASH_CODE_FRONTE", required = true)
    protected String hashcodefronte;
    @XmlElement(name = "NOME_IMMAGINE_RETRO", required = true)
    protected String nomeimmagineretro;
    @XmlElement(name = "HASH_CODE_RETRO", required = true)
    protected String hashcoderetro;
    @XmlElement(name = "TIPO_IMMAGINE", required = true)
    protected String tipoimmagine;
    @XmlElement(name = "NUM_ID_SCATOLA", required = true)
    protected String numidscatola;
    @XmlElement(name = "PROGRESSIVO_CARTACEO", required = true)
    protected String progressivocartaceo;
    @XmlElement(name = "IDENTIFICATIVO", required = true)
    protected IDENTIFICATIVOTYPE identificativo;

    /**
     * Recupera il valore della proprietà nomeimmaginefronte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEIMMAGINEFRONTE() {
        return nomeimmaginefronte;
    }

    /**
     * Imposta il valore della proprietà nomeimmaginefronte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEIMMAGINEFRONTE(String value) {
        this.nomeimmaginefronte = value;
    }

    /**
     * Recupera il valore della proprietà hashcodefronte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHASHCODEFRONTE() {
        return hashcodefronte;
    }

    /**
     * Imposta il valore della proprietà hashcodefronte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHASHCODEFRONTE(String value) {
        this.hashcodefronte = value;
    }

    /**
     * Recupera il valore della proprietà nomeimmagineretro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEIMMAGINERETRO() {
        return nomeimmagineretro;
    }

    /**
     * Imposta il valore della proprietà nomeimmagineretro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEIMMAGINERETRO(String value) {
        this.nomeimmagineretro = value;
    }

    /**
     * Recupera il valore della proprietà hashcoderetro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHASHCODERETRO() {
        return hashcoderetro;
    }

    /**
     * Imposta il valore della proprietà hashcoderetro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHASHCODERETRO(String value) {
        this.hashcoderetro = value;
    }

    /**
     * Recupera il valore della proprietà tipoimmagine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOIMMAGINE() {
        return tipoimmagine;
    }

    /**
     * Imposta il valore della proprietà tipoimmagine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOIMMAGINE(String value) {
        this.tipoimmagine = value;
    }

    /**
     * Recupera il valore della proprietà numidscatola.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMIDSCATOLA() {
        return numidscatola;
    }

    /**
     * Imposta il valore della proprietà numidscatola.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMIDSCATOLA(String value) {
        this.numidscatola = value;
    }

    /**
     * Recupera il valore della proprietà progressivocartaceo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROGRESSIVOCARTACEO() {
        return progressivocartaceo;
    }

    /**
     * Imposta il valore della proprietà progressivocartaceo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROGRESSIVOCARTACEO(String value) {
        this.progressivocartaceo = value;
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
