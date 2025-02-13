//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.AbstractDiscoveryDeliveryStructure;
import uk.org.siri.siri.CapabilitiesResponseStructure;
import uk.org.siri.siri.CheckStatusResponseStructure;
import uk.org.siri.siri.DataReadyResponseStructure;
import uk.org.siri.siri.DataReceivedResponseStructure;
import uk.org.siri.siri.ServiceDelivery;
import uk.org.siri.siri.SubscriptionResponseStructure;
import uk.org.siri.siri.TerminateSubscriptionResponseStructure;

/**
 * Type for OJP Response - Groups individual functional responses.
 *
 * <p>Java-Klasse für OJPResponseStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="OJPResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ResponseGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJPResponseStructure", propOrder = {
    "subscriptionResponse",
    "terminateSubscriptionResponse",
    "dataReadyAcknowledgement",
    "serviceDelivery",
    "dataReceivedAcknowledgement",
    "checkStatusResponse",
    "capabilitiesResponse",
    "abstractDiscoveryDelivery"
})
public class OJPResponseStructure {

    @XmlElement(name = "SubscriptionResponse", namespace = "http://www.siri.org.uk/siri")
    protected SubscriptionResponseStructure subscriptionResponse;
    @XmlElement(name = "TerminateSubscriptionResponse", namespace = "http://www.siri.org.uk/siri")
    protected TerminateSubscriptionResponseStructure terminateSubscriptionResponse;
    @XmlElement(name = "DataReadyAcknowledgement", namespace = "http://www.siri.org.uk/siri")
    protected DataReadyResponseStructure dataReadyAcknowledgement;
    @XmlElement(name = "ServiceDelivery", namespace = "http://www.siri.org.uk/siri")
    protected ServiceDelivery serviceDelivery;
    @XmlElement(name = "DataReceivedAcknowledgement", namespace = "http://www.siri.org.uk/siri")
    protected DataReceivedResponseStructure dataReceivedAcknowledgement;
    @XmlElement(name = "CheckStatusResponse", namespace = "http://www.siri.org.uk/siri")
    protected CheckStatusResponseStructure checkStatusResponse;
    @XmlElement(name = "CapabilitiesResponse", namespace = "http://www.siri.org.uk/siri")
    protected CapabilitiesResponseStructure capabilitiesResponse;
    @XmlElement(name = "AbstractDiscoveryDelivery", namespace = "http://www.siri.org.uk/siri")
    protected AbstractDiscoveryDeliveryStructure abstractDiscoveryDelivery;

    /**
     * Ruft den Wert der subscriptionResponse-Eigenschaft ab.
     *
     * @return possible object is {@link SubscriptionResponseStructure }
     */
    public SubscriptionResponseStructure getSubscriptionResponse() {
        return subscriptionResponse;
    }

    /**
     * Legt den Wert der subscriptionResponse-Eigenschaft fest.
     *
     * @param value allowed object is {@link SubscriptionResponseStructure }
     */
    public void setSubscriptionResponse(SubscriptionResponseStructure value) {
        this.subscriptionResponse = value;
    }

    /**
     * Ruft den Wert der terminateSubscriptionResponse-Eigenschaft ab.
     *
     * @return possible object is {@link TerminateSubscriptionResponseStructure }
     */
    public TerminateSubscriptionResponseStructure getTerminateSubscriptionResponse() {
        return terminateSubscriptionResponse;
    }

    /**
     * Legt den Wert der terminateSubscriptionResponse-Eigenschaft fest.
     *
     * @param value allowed object is {@link TerminateSubscriptionResponseStructure }
     */
    public void setTerminateSubscriptionResponse(TerminateSubscriptionResponseStructure value) {
        this.terminateSubscriptionResponse = value;
    }

    /**
     * Ruft den Wert der dataReadyAcknowledgement-Eigenschaft ab.
     *
     * @return possible object is {@link DataReadyResponseStructure }
     */
    public DataReadyResponseStructure getDataReadyAcknowledgement() {
        return dataReadyAcknowledgement;
    }

    /**
     * Legt den Wert der dataReadyAcknowledgement-Eigenschaft fest.
     *
     * @param value allowed object is {@link DataReadyResponseStructure }
     */
    public void setDataReadyAcknowledgement(DataReadyResponseStructure value) {
        this.dataReadyAcknowledgement = value;
    }

    /**
     * Ruft den Wert der serviceDelivery-Eigenschaft ab.
     *
     * @return possible object is {@link ServiceDelivery }
     */
    public ServiceDelivery getServiceDelivery() {
        return serviceDelivery;
    }

    /**
     * Legt den Wert der serviceDelivery-Eigenschaft fest.
     *
     * @param value allowed object is {@link ServiceDelivery }
     */
    public void setServiceDelivery(ServiceDelivery value) {
        this.serviceDelivery = value;
    }

    /**
     * Ruft den Wert der dataReceivedAcknowledgement-Eigenschaft ab.
     *
     * @return possible object is {@link DataReceivedResponseStructure }
     */
    public DataReceivedResponseStructure getDataReceivedAcknowledgement() {
        return dataReceivedAcknowledgement;
    }

    /**
     * Legt den Wert der dataReceivedAcknowledgement-Eigenschaft fest.
     *
     * @param value allowed object is {@link DataReceivedResponseStructure }
     */
    public void setDataReceivedAcknowledgement(DataReceivedResponseStructure value) {
        this.dataReceivedAcknowledgement = value;
    }

    /**
     * Ruft den Wert der checkStatusResponse-Eigenschaft ab.
     *
     * @return possible object is {@link CheckStatusResponseStructure }
     */
    public CheckStatusResponseStructure getCheckStatusResponse() {
        return checkStatusResponse;
    }

    /**
     * Legt den Wert der checkStatusResponse-Eigenschaft fest.
     *
     * @param value allowed object is {@link CheckStatusResponseStructure }
     */
    public void setCheckStatusResponse(CheckStatusResponseStructure value) {
        this.checkStatusResponse = value;
    }

    /**
     * Responses with the capabilities of an implementation. Answers a CapabilityRequest.
     *
     * @return possible object is {@link CapabilitiesResponseStructure }
     */
    public CapabilitiesResponseStructure getCapabilitiesResponse() {
        return capabilitiesResponse;
    }

    /**
     * Legt den Wert der capabilitiesResponse-Eigenschaft fest.
     *
     * @param value allowed object is {@link CapabilitiesResponseStructure }
     */
    public void setCapabilitiesResponse(CapabilitiesResponseStructure value) {
        this.capabilitiesResponse = value;
    }

    /**
     * Ruft den Wert der abstractDiscoveryDelivery-Eigenschaft ab.
     *
     * @return possible object is {@link AbstractDiscoveryDeliveryStructure }
     */
    public AbstractDiscoveryDeliveryStructure getAbstractDiscoveryDelivery() {
        return abstractDiscoveryDelivery;
    }

    /**
     * Legt den Wert der abstractDiscoveryDelivery-Eigenschaft fest.
     *
     * @param value allowed object is {@link AbstractDiscoveryDeliveryStructure }
     */
    public void setAbstractDiscoveryDelivery(AbstractDiscoveryDeliveryStructure value) {
        this.abstractDiscoveryDelivery = value;
    }

    public OJPResponseStructure withSubscriptionResponse(SubscriptionResponseStructure value) {
        setSubscriptionResponse(value);
        return this;
    }

    public OJPResponseStructure withTerminateSubscriptionResponse(TerminateSubscriptionResponseStructure value) {
        setTerminateSubscriptionResponse(value);
        return this;
    }

    public OJPResponseStructure withDataReadyAcknowledgement(DataReadyResponseStructure value) {
        setDataReadyAcknowledgement(value);
        return this;
    }

    public OJPResponseStructure withServiceDelivery(ServiceDelivery value) {
        setServiceDelivery(value);
        return this;
    }

    public OJPResponseStructure withDataReceivedAcknowledgement(DataReceivedResponseStructure value) {
        setDataReceivedAcknowledgement(value);
        return this;
    }

    public OJPResponseStructure withCheckStatusResponse(CheckStatusResponseStructure value) {
        setCheckStatusResponse(value);
        return this;
    }

    public OJPResponseStructure withCapabilitiesResponse(CapabilitiesResponseStructure value) {
        setCapabilitiesResponse(value);
        return this;
    }

    public OJPResponseStructure withAbstractDiscoveryDelivery(AbstractDiscoveryDeliveryStructure value) {
        setAbstractDiscoveryDelivery(value);
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
