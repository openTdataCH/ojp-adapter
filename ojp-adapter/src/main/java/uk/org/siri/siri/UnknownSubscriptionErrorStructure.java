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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for Error: Subscription not found.
 * 
 * <p>Java-Klasse für UnknownSubscriptionErrorStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UnknownSubscriptionErrorStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ErrorCodeStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscriptionCode" type="{http://www.siri.org.uk/siri}SubscriptionQualifierStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownSubscriptionErrorStructure", propOrder = {
    "subscriptionCode"
})
public class UnknownSubscriptionErrorStructure
    extends ErrorCodeStructure
{

    @XmlElement(name = "SubscriptionCode")
    protected SubscriptionQualifierStructure subscriptionCode;

    /**
     * Ruft den Wert der subscriptionCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionQualifierStructure }
     *     
     */
    public SubscriptionQualifierStructure getSubscriptionCode() {
        return subscriptionCode;
    }

    /**
     * Legt den Wert der subscriptionCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionQualifierStructure }
     *     
     */
    public void setSubscriptionCode(SubscriptionQualifierStructure value) {
        this.subscriptionCode = value;
    }

    public UnknownSubscriptionErrorStructure withSubscriptionCode(SubscriptionQualifierStructure value) {
        setSubscriptionCode(value);
        return this;
    }

    @Override
    public UnknownSubscriptionErrorStructure withErrorText(String value) {
        setErrorText(value);
        return this;
    }

    @Override
    public UnknownSubscriptionErrorStructure withNumber(BigInteger value) {
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
