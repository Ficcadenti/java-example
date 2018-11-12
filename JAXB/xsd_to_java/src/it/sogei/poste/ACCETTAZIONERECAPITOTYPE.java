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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ACCETTAZIONE_RECAPITO_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ACCETTAZIONE_RECAPITO_TYPE">
 *   &lt;complexContent>
 *     &lt;extension base="{}DISTINTA_TYPE">
 *       &lt;sequence>
 *         &lt;element name="CODICE_RECAPITISTA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUMERO_DOCUMENTI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DETTAGLIO" type="{}DETTAGLIO_RCA_TYPE" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACCETTAZIONE_RECAPITO_TYPE", propOrder = {
    "codicerecapitista",
    "numerodocumenti",
    "dettaglio"
})
public class ACCETTAZIONERECAPITOTYPE
    extends DISTINTATYPE
{

    @XmlElement(name = "CODICE_RECAPITISTA", required = true)
    protected String codicerecapitista;
    @XmlElement(name = "NUMERO_DOCUMENTI")
    protected int numerodocumenti;
    @XmlElement(name = "DETTAGLIO", required = true)
    protected List<DETTAGLIORCATYPE> dettaglio;

    /**
     * Recupera il valore della proprietà codicerecapitista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICERECAPITISTA() {
        return codicerecapitista;
    }

    /**
     * Imposta il valore della proprietà codicerecapitista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICERECAPITISTA(String value) {
        this.codicerecapitista = value;
    }

    /**
     * Recupera il valore della proprietà numerodocumenti.
     * 
     */
    public int getNUMERODOCUMENTI() {
        return numerodocumenti;
    }

    /**
     * Imposta il valore della proprietà numerodocumenti.
     * 
     */
    public void setNUMERODOCUMENTI(int value) {
        this.numerodocumenti = value;
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
     * {@link DETTAGLIORCATYPE }
     * 
     * 
     */
    public List<DETTAGLIORCATYPE> getDETTAGLIO() {
        if (dettaglio == null) {
            dettaglio = new ArrayList<DETTAGLIORCATYPE>();
        }
        return this.dettaglio;
    }

}
