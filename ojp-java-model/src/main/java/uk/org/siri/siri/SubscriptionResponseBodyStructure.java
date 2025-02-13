//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;

/**
 * Type for Body of Subscription Response. Used in WSDL.
 *
 * <p>Java-Klasse für SubscriptionResponseBodyStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SubscriptionResponseBodyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ResponseStatus" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SubscriptionManagerAddress" type="{http://www.siri.org.uk/siri}EndpointAddress" minOccurs="0"/&gt;
 *         &lt;element name="ServiceStartedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionResponseBodyStructure", propOrder = {
    "responseStatus",
    "subscriptionManagerAddress",
    "serviceStartedTime"
})
public class SubscriptionResponseBodyStructure {

    @XmlElement(name = "ResponseStatus", required = true)
    protected List<StatusResponseStructure> responseStatus;
    @XmlElement(name = "SubscriptionManagerAddress")
    @XmlSchemaType(name = "anyURI")
    protected String subscriptionManagerAddress;
    @XmlElement(name = "ServiceStartedTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime serviceStartedTime;

    /**
     * Gets the value of the responseStatus property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the responseStatus property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseStatus().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link StatusResponseStructure }
     */
    public List<StatusResponseStructure> getResponseStatus() {
        if (responseStatus == null) {
            responseStatus = new ArrayList<StatusResponseStructure>();
        }
        return this.responseStatus;
    }

    /**
     * Ruft den Wert der subscriptionManagerAddress-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getSubscriptionManagerAddress() {
        return subscriptionManagerAddress;
    }

    /**
     * Legt den Wert der subscriptionManagerAddress-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setSubscriptionManagerAddress(String value) {
        this.subscriptionManagerAddress = value;
    }

    /**
     * Ruft den Wert der serviceStartedTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getServiceStartedTime() {
        return serviceStartedTime;
    }

    /**
     * Legt den Wert der serviceStartedTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setServiceStartedTime(ZonedDateTime value) {
        this.serviceStartedTime = value;
    }

    public SubscriptionResponseBodyStructure withResponseStatus(StatusResponseStructure... values) {
        if (values != null) {
            for (StatusResponseStructure value : values) {
                getResponseStatus().add(value);
            }
        }
        return this;
    }

    public SubscriptionResponseBodyStructure withResponseStatus(Collection<StatusResponseStructure> values) {
        if (values != null) {
            getResponseStatus().addAll(values);
        }
        return this;
    }

    public SubscriptionResponseBodyStructure withSubscriptionManagerAddress(String value) {
        setSubscriptionManagerAddress(value);
        return this;
    }

    public SubscriptionResponseBodyStructure withServiceStartedTime(ZonedDateTime value) {
        setServiceStartedTime(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type. This is an extension method, produced by the 'ts' xjc plugin
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}
