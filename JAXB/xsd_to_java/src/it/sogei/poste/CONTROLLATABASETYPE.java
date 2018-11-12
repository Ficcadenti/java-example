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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per CONTROLLATA_BASE_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CONTROLLATA_BASE_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDENTIFICATIVO_FILE_ESITI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="28"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_CREAZIONE_FILE_ESITI" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="IDENTIF_FILE_CONTROLLATO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="28"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_ESITO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUMERO_DETTAGLI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DETTAGLIO" type="{}DETTAGLIO_TYPE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTROLLATA_BASE_TYPE", propOrder = {
    "identificativofileesiti",
    "datacreazionefileesiti",
    "identiffilecontrollato",
    "tipoesito",
    "numerodettagli",
    "dettaglio"
})
@XmlSeeAlso({
    DISTINTACONTROLLATAEDETYPE.class
})
public class CONTROLLATABASETYPE {

    @XmlElement(name = "IDENTIFICATIVO_FILE_ESITI", required = true)
    protected String identificativofileesiti;
    @XmlElement(name = "DATA_CREAZIONE_FILE_ESITI", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datacreazionefileesiti;
    @XmlElement(name = "IDENTIF_FILE_CONTROLLATO", required = true)
    protected String identiffilecontrollato;
    @XmlElement(name = "TIPO_ESITO", required = true)
    protected String tipoesito;
    @XmlElement(name = "NUMERO_DETTAGLI")
    protected int numerodettagli;
    @XmlElement(name = "DETTAGLIO")
    protected List<DETTAGLIOTYPE> dettaglio;

    /**
     * Recupera il valore della proprietà identificativofileesiti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFICATIVOFILEESITI() {
        return identificativofileesiti;
    }

    /**
     * Imposta il valore della proprietà identificativofileesiti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFICATIVOFILEESITI(String value) {
        this.identificativofileesiti = value;
    }

    /**
     * Recupera il valore della proprietà datacreazionefileesiti.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATACREAZIONEFILEESITI() {
        return datacreazionefileesiti;
    }

    /**
     * Imposta il valore della proprietà datacreazionefileesiti.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATACREAZIONEFILEESITI(XMLGregorianCalendar value) {
        this.datacreazionefileesiti = value;
    }

    /**
     * Recupera il valore della proprietà identiffilecontrollato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFFILECONTROLLATO() {
        return identiffilecontrollato;
    }

    /**
     * Imposta il valore della proprietà identiffilecontrollato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFFILECONTROLLATO(String value) {
        this.identiffilecontrollato = value;
    }

    /**
     * Recupera il valore della proprietà tipoesito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOESITO() {
        return tipoesito;
    }

    /**
     * Imposta il valore della proprietà tipoesito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOESITO(String value) {
        this.tipoesito = value;
    }

    /**
     * Recupera il valore della proprietà numerodettagli.
     * 
     */
    public int getNUMERODETTAGLI() {
        return numerodettagli;
    }

    /**
     * Imposta il valore della proprietà numerodettagli.
     * 
     */
    public void setNUMERODETTAGLI(int value) {
        this.numerodettagli = value;
    }

    /**
     * Gets the value of the dettaglio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettaglio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDETTAGLIO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DETTAGLIOTYPE }
     * 
     * 
     */
    public List<DETTAGLIOTYPE> getDETTAGLIO() {
        if (dettaglio == null) {
            dettaglio = new ArrayList<DETTAGLIOTYPE>();
        }
        return this.dettaglio;
    }

}
