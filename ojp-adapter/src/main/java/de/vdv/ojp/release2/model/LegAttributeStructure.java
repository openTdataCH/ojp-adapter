//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.math.BigInteger;
import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.AllFacilitiesFeatureStructure;


/**
 * Attributes that are not valid on the whole service, but only on section of a TRIP made on a single MODE without interchange between boarding and alighting (facilities available on a specified (part of a) Leg of a VEHICLE JOURNEY)
 * 
 * <p>Java-Klasse für LegAttributeStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LegAttributeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.vdv.de/ojp}GeneralAttributeStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromStopSeqNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="ToStopSeqNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegAttributeStructure", propOrder = {
    "fromStopSeqNumber",
    "toStopSeqNumber"
})
public class LegAttributeStructure
    extends GeneralAttributeStructure
{

    @XmlElement(name = "FromStopSeqNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fromStopSeqNumber;
    @XmlElement(name = "ToStopSeqNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger toStopSeqNumber;

    /**
     * Ruft den Wert der fromStopSeqNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFromStopSeqNumber() {
        return fromStopSeqNumber;
    }

    /**
     * Legt den Wert der fromStopSeqNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFromStopSeqNumber(BigInteger value) {
        this.fromStopSeqNumber = value;
    }

    /**
     * Ruft den Wert der toStopSeqNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getToStopSeqNumber() {
        return toStopSeqNumber;
    }

    /**
     * Legt den Wert der toStopSeqNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setToStopSeqNumber(BigInteger value) {
        this.toStopSeqNumber = value;
    }

    public LegAttributeStructure withFromStopSeqNumber(BigInteger value) {
        setFromStopSeqNumber(value);
        return this;
    }

    public LegAttributeStructure withToStopSeqNumber(BigInteger value) {
        setToStopSeqNumber(value);
        return this;
    }

    @Override
    public LegAttributeStructure withUserText(InternationalTextStructure value) {
        setUserText(value);
        return this;
    }

    @Override
    public LegAttributeStructure withCode(String value) {
        setCode(value);
        return this;
    }

    @Override
    public LegAttributeStructure withKey(String value) {
        setKey(value);
        return this;
    }

    @Override
    public LegAttributeStructure withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public LegAttributeStructure withFacility(AllFacilitiesFeatureStructure... values) {
        if (values!= null) {
            for (AllFacilitiesFeatureStructure value: values) {
                getFacility().add(value);
            }
        }
        return this;
    }

    @Override
    public LegAttributeStructure withFacility(Collection<AllFacilitiesFeatureStructure> values) {
        if (values!= null) {
            getFacility().addAll(values);
        }
        return this;
    }

    @Override
    public LegAttributeStructure withMandatory(Boolean value) {
        setMandatory(value);
        return this;
    }

    @Override
    public LegAttributeStructure withImportance(Integer value) {
        setImportance(value);
        return this;
    }

    @Override
    public LegAttributeStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public LegAttributeStructure withMimeType(String value) {
        setMimeType(value);
        return this;
    }

    @Override
    public LegAttributeStructure withEmbeddable(Boolean value) {
        setEmbeddable(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}
