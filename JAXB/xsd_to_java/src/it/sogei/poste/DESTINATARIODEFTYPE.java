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
 * <p>Classe Java per DESTINATARIO_DEF_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DESTINATARIO_DEF_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RIGA1_DESTINATARIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RIGA2_AGGIUNTIVE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RIGA3_EDIFICIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RIGA4_INDIRIZZO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RIGA5_LOCALITA" type="{}LOCALITA_TYPE"/>
 *         &lt;element name="RIGA6_STATO_ESTERO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DESTINATARIO_DEF_TYPE", propOrder = {
    "riga1DESTINATARIO",
    "riga2AGGIUNTIVE",
    "riga3EDIFICIO",
    "riga4INDIRIZZO",
    "riga5LOCALITA",
    "riga6STATOESTERO"
})
public class DESTINATARIODEFTYPE {

    @XmlElement(name = "RIGA1_DESTINATARIO", required = true)
    protected String riga1DESTINATARIO;
    @XmlElement(name = "RIGA2_AGGIUNTIVE", required = true)
    protected String riga2AGGIUNTIVE;
    @XmlElement(name = "RIGA3_EDIFICIO", required = true)
    protected String riga3EDIFICIO;
    @XmlElement(name = "RIGA4_INDIRIZZO", required = true)
    protected String riga4INDIRIZZO;
    @XmlElement(name = "RIGA5_LOCALITA", required = true)
    protected LOCALITATYPE riga5LOCALITA;
    @XmlElement(name = "RIGA6_STATO_ESTERO", required = true)
    protected String riga6STATOESTERO;

    /**
     * Recupera il valore della proprietà riga1DESTINATARIO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIGA1DESTINATARIO() {
        return riga1DESTINATARIO;
    }

    /**
     * Imposta il valore della proprietà riga1DESTINATARIO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIGA1DESTINATARIO(String value) {
        this.riga1DESTINATARIO = value;
    }

    /**
     * Recupera il valore della proprietà riga2AGGIUNTIVE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIGA2AGGIUNTIVE() {
        return riga2AGGIUNTIVE;
    }

    /**
     * Imposta il valore della proprietà riga2AGGIUNTIVE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIGA2AGGIUNTIVE(String value) {
        this.riga2AGGIUNTIVE = value;
    }

    /**
     * Recupera il valore della proprietà riga3EDIFICIO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIGA3EDIFICIO() {
        return riga3EDIFICIO;
    }

    /**
     * Imposta il valore della proprietà riga3EDIFICIO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIGA3EDIFICIO(String value) {
        this.riga3EDIFICIO = value;
    }

    /**
     * Recupera il valore della proprietà riga4INDIRIZZO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIGA4INDIRIZZO() {
        return riga4INDIRIZZO;
    }

    /**
     * Imposta il valore della proprietà riga4INDIRIZZO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIGA4INDIRIZZO(String value) {
        this.riga4INDIRIZZO = value;
    }

    /**
     * Recupera il valore della proprietà riga5LOCALITA.
     * 
     * @return
     *     possible object is
     *     {@link LOCALITATYPE }
     *     
     */
    public LOCALITATYPE getRIGA5LOCALITA() {
        return riga5LOCALITA;
    }

    /**
     * Imposta il valore della proprietà riga5LOCALITA.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCALITATYPE }
     *     
     */
    public void setRIGA5LOCALITA(LOCALITATYPE value) {
        this.riga5LOCALITA = value;
    }

    /**
     * Recupera il valore della proprietà riga6STATOESTERO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIGA6STATOESTERO() {
        return riga6STATOESTERO;
    }

    /**
     * Imposta il valore della proprietà riga6STATOESTERO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIGA6STATOESTERO(String value) {
        this.riga6STATOESTERO = value;
    }

}
