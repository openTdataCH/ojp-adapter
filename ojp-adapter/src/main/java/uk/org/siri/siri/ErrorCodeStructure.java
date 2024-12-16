//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for Error Code.
 * 
 * <p>Java-Klasse für ErrorCodeStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ErrorCodeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorCodeStructure", propOrder = {
    "errorText"
})
@XmlSeeAlso({
    OtherErrorStructure.class,
    UnapprovedKeyAccessStructure.class,
    UnknownParticipantErrorStructure.class,
    UnknownEndpointErrorStructure.class,
    EndpointDeniedAccessStructure.class,
    EndpointNotAvailableAccessStructure.class,
    ServiceNotAvailableErrorStructure.class,
    CapabilityNotSupportedErrorStructure.class,
    BeyondDataHorizonErrorStructure.class,
    AccessNotAllowedErrorStructure.class,
    NoInfoForTopicErrorStructure.class,
    InvalidDataReferencesErrorStructure.class,
    ParametersIgnoredErrorStructure.class,
    UnknownExtensionsErrorStructure.class,
    AllowedResourceUsageExceededErrorStructure.class,
    UnknownSubscriberErrorStructure.class,
    UnknownSubscriptionErrorStructure.class
})
public class ErrorCodeStructure {

    @XmlElement(name = "ErrorText")
    protected String errorText;
    @XmlAttribute(name = "number")
    protected BigInteger number;

    /**
     * Ruft den Wert der errorText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Legt den Wert der errorText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    /**
     * Ruft den Wert der number-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Legt den Wert der number-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    public ErrorCodeStructure withErrorText(String value) {
        setErrorText(value);
        return this;
    }

    public ErrorCodeStructure withNumber(BigInteger value) {
        setNumber(value);
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
