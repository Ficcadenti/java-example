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
 * <p>Classe Java per FILE_RICEVUTO_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FILE_RICEVUTO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NOME_FLUSSO_RIC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_FLUSSO_RIC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_ORA_RICEZIONE_FLUSSO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="HASH_CODE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="27"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FILE_RICEVUTO_TYPE", propOrder = {
    "nomeflussoric",
    "tipoflussoric",
    "dataoraricezioneflusso",
    "hashcode"
})
public class FILERICEVUTOTYPE {

    @XmlElement(name = "NOME_FLUSSO_RIC", required = true)
    protected String nomeflussoric;
    @XmlElement(name = "TIPO_FLUSSO_RIC", required = true)
    protected String tipoflussoric;
    @XmlElement(name = "DATA_ORA_RICEZIONE_FLUSSO", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataoraricezioneflusso;
    @XmlElement(name = "HASH_CODE", required = true)
    protected String hashcode;

    /**
     * Recupera il valore della proprietà nomeflussoric.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEFLUSSORIC() {
        return nomeflussoric;
    }

    /**
     * Imposta il valore della proprietà nomeflussoric.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEFLUSSORIC(String value) {
        this.nomeflussoric = value;
    }

    /**
     * Recupera il valore della proprietà tipoflussoric.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOFLUSSORIC() {
        return tipoflussoric;
    }

    /**
     * Imposta il valore della proprietà tipoflussoric.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOFLUSSORIC(String value) {
        this.tipoflussoric = value;
    }

    /**
     * Recupera il valore della proprietà dataoraricezioneflusso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAORARICEZIONEFLUSSO() {
        return dataoraricezioneflusso;
    }

    /**
     * Imposta il valore della proprietà dataoraricezioneflusso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAORARICEZIONEFLUSSO(XMLGregorianCalendar value) {
        this.dataoraricezioneflusso = value;
    }

    /**
     * Recupera il valore della proprietà hashcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHASHCODE() {
        return hashcode;
    }

    /**
     * Imposta il valore della proprietà hashcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHASHCODE(String value) {
        this.hashcode = value;
    }

}
