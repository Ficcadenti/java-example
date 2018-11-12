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
 * <p>Classe Java per RENDICONTAZIONE_CONSEGNA_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RENDICONTAZIONE_CONSEGNA_TYPE">
 *   &lt;complexContent>
 *     &lt;extension base="{}DISTINTA_TYPE">
 *       &lt;sequence>
 *         &lt;element name="ID_FUSIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NOME_LOTTO_S">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_PRESA_IN_CARICO_RECAPITO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="FLAG_TIPO_POSTALIZZAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUMERO_DETTAGLI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DETTAGLIO" type="{}DETTAGLIO_RED_TYPE" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RENDICONTAZIONE_CONSEGNA_TYPE", propOrder = {
    "idfusione",
    "nomelottos",
    "datapresaincaricorecapito",
    "flagtipopostalizzazione",
    "numerodettagli",
    "dettaglio"
})
public class RENDICONTAZIONECONSEGNATYPE
    extends DISTINTATYPE
{

    @XmlElement(name = "ID_FUSIONE", required = true)
    protected String idfusione;
    @XmlElement(name = "NOME_LOTTO_S", required = true)
    protected String nomelottos;
    @XmlElement(name = "DATA_PRESA_IN_CARICO_RECAPITO", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datapresaincaricorecapito;
    @XmlElement(name = "FLAG_TIPO_POSTALIZZAZIONE", required = true)
    protected String flagtipopostalizzazione;
    @XmlElement(name = "NUMERO_DETTAGLI")
    protected int numerodettagli;
    @XmlElement(name = "DETTAGLIO", required = true)
    protected List<DETTAGLIOREDTYPE> dettaglio;

    /**
     * Recupera il valore della proprietà idfusione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDFUSIONE() {
        return idfusione;
    }

    /**
     * Imposta il valore della proprietà idfusione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDFUSIONE(String value) {
        this.idfusione = value;
    }

    /**
     * Recupera il valore della proprietà nomelottos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMELOTTOS() {
        return nomelottos;
    }

    /**
     * Imposta il valore della proprietà nomelottos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMELOTTOS(String value) {
        this.nomelottos = value;
    }

    /**
     * Recupera il valore della proprietà datapresaincaricorecapito.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAPRESAINCARICORECAPITO() {
        return datapresaincaricorecapito;
    }

    /**
     * Imposta il valore della proprietà datapresaincaricorecapito.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAPRESAINCARICORECAPITO(XMLGregorianCalendar value) {
        this.datapresaincaricorecapito = value;
    }

    /**
     * Recupera il valore della proprietà flagtipopostalizzazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGTIPOPOSTALIZZAZIONE() {
        return flagtipopostalizzazione;
    }

    /**
     * Imposta il valore della proprietà flagtipopostalizzazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGTIPOPOSTALIZZAZIONE(String value) {
        this.flagtipopostalizzazione = value;
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
     * {@link DETTAGLIOREDTYPE }
     * 
     * 
     */
    public List<DETTAGLIOREDTYPE> getDETTAGLIO() {
        if (dettaglio == null) {
            dettaglio = new ArrayList<DETTAGLIOREDTYPE>();
        }
        return this.dettaglio;
    }

}
