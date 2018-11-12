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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DOCUMENTO_DI_TRASPORTO_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DOCUMENTO_DI_TRASPORTO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROGRESSIVO_DOCUMENTO_DI_TRASPORTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_DDT" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="COMMITTENTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IDENTIFICATIVO_FILE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="28"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_CREAZIONE_FILE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="LOTTO_TERRITORIALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPOLOGIA_CONTENUTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUM_TOT_PALLET">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUM_TOT_SCATOLE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUM_TOT_CARTACEI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PALLET" type="{}PALLET_TYPE" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOCUMENTO_DI_TRASPORTO_TYPE", propOrder = {
    "progressivodocumentoditrasporto",
    "dataddt",
    "committente",
    "identificativofile",
    "datacreazionefile",
    "lottoterritoriale",
    "tipologiacontenuto",
    "numtotpallet",
    "numtotscatole",
    "numtotcartacei",
    "pallet"
})
public class DOCUMENTODITRASPORTOTYPE {

    @XmlElement(name = "PROGRESSIVO_DOCUMENTO_DI_TRASPORTO", required = true)
    protected String progressivodocumentoditrasporto;
    @XmlElement(name = "DATA_DDT", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataddt;
    @XmlElement(name = "COMMITTENTE", required = true)
    protected String committente;
    @XmlElement(name = "IDENTIFICATIVO_FILE", required = true)
    protected String identificativofile;
    @XmlElement(name = "DATA_CREAZIONE_FILE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datacreazionefile;
    @XmlElement(name = "LOTTO_TERRITORIALE", required = true)
    protected String lottoterritoriale;
    @XmlElement(name = "TIPOLOGIA_CONTENUTO", required = true)
    protected String tipologiacontenuto;
    @XmlElement(name = "NUM_TOT_PALLET")
    protected int numtotpallet;
    @XmlElement(name = "NUM_TOT_SCATOLE")
    protected int numtotscatole;
    @XmlElement(name = "NUM_TOT_CARTACEI")
    protected int numtotcartacei;
    @XmlElement(name = "PALLET", required = true)
    protected List<PALLETTYPE> pallet;

    /**
     * Recupera il valore della proprietà progressivodocumentoditrasporto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROGRESSIVODOCUMENTODITRASPORTO() {
        return progressivodocumentoditrasporto;
    }

    /**
     * Imposta il valore della proprietà progressivodocumentoditrasporto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROGRESSIVODOCUMENTODITRASPORTO(String value) {
        this.progressivodocumentoditrasporto = value;
    }

    /**
     * Recupera il valore della proprietà dataddt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATADDT() {
        return dataddt;
    }

    /**
     * Imposta il valore della proprietà dataddt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATADDT(XMLGregorianCalendar value) {
        this.dataddt = value;
    }

    /**
     * Recupera il valore della proprietà committente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMITTENTE() {
        return committente;
    }

    /**
     * Imposta il valore della proprietà committente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMITTENTE(String value) {
        this.committente = value;
    }

    /**
     * Recupera il valore della proprietà identificativofile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFICATIVOFILE() {
        return identificativofile;
    }

    /**
     * Imposta il valore della proprietà identificativofile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFICATIVOFILE(String value) {
        this.identificativofile = value;
    }

    /**
     * Recupera il valore della proprietà datacreazionefile.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATACREAZIONEFILE() {
        return datacreazionefile;
    }

    /**
     * Imposta il valore della proprietà datacreazionefile.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATACREAZIONEFILE(XMLGregorianCalendar value) {
        this.datacreazionefile = value;
    }

    /**
     * Recupera il valore della proprietà lottoterritoriale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOTTOTERRITORIALE() {
        return lottoterritoriale;
    }

    /**
     * Imposta il valore della proprietà lottoterritoriale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOTTOTERRITORIALE(String value) {
        this.lottoterritoriale = value;
    }

    /**
     * Recupera il valore della proprietà tipologiacontenuto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOLOGIACONTENUTO() {
        return tipologiacontenuto;
    }

    /**
     * Imposta il valore della proprietà tipologiacontenuto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOLOGIACONTENUTO(String value) {
        this.tipologiacontenuto = value;
    }

    /**
     * Recupera il valore della proprietà numtotpallet.
     * 
     */
    public int getNUMTOTPALLET() {
        return numtotpallet;
    }

    /**
     * Imposta il valore della proprietà numtotpallet.
     * 
     */
    public void setNUMTOTPALLET(int value) {
        this.numtotpallet = value;
    }

    /**
     * Recupera il valore della proprietà numtotscatole.
     * 
     */
    public int getNUMTOTSCATOLE() {
        return numtotscatole;
    }

    /**
     * Imposta il valore della proprietà numtotscatole.
     * 
     */
    public void setNUMTOTSCATOLE(int value) {
        this.numtotscatole = value;
    }

    /**
     * Recupera il valore della proprietà numtotcartacei.
     * 
     */
    public int getNUMTOTCARTACEI() {
        return numtotcartacei;
    }

    /**
     * Imposta il valore della proprietà numtotcartacei.
     * 
     */
    public void setNUMTOTCARTACEI(int value) {
        this.numtotcartacei = value;
    }

    /**
     * Gets the value of the pallet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pallet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPALLET().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PALLETTYPE }
     * 
     * 
     */
    public List<PALLETTYPE> getPALLET() {
        if (pallet == null) {
            pallet = new ArrayList<PALLETTYPE>();
        }
        return this.pallet;
    }

}
