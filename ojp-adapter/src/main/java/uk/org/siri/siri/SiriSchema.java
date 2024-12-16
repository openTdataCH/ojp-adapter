//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für SiriSchema complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SiriSchema"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}RequestGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ResponseGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="2.1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiriSchema", propOrder = {
    "serviceRequest",
    "subscriptionRequest",
    "terminateSubscriptionRequest",
    "dataReadyNotification",
    "dataSupplyRequest",
    "checkStatusRequest",
    "heartbeatNotification",
    "capabilitiesRequest",
    "abstractDiscoveryRequest",
    "subscriptionResponse",
    "terminateSubscriptionResponse",
    "dataReadyAcknowledgement",
    "serviceDelivery",
    "dataReceivedAcknowledgement",
    "checkStatusResponse",
    "capabilitiesResponse",
    "abstractDiscoveryDelivery",
    "extensions"
})
public class SiriSchema {

    @XmlElement(name = "ServiceRequest")
    protected ServiceRequest serviceRequest;
    @XmlElement(name = "SubscriptionRequest")
    protected SubscriptionRequest subscriptionRequest;
    @XmlElement(name = "TerminateSubscriptionRequest")
    protected TerminateSubscriptionRequestStructure terminateSubscriptionRequest;
    @XmlElement(name = "DataReadyNotification")
    protected DataReadyRequestStructure dataReadyNotification;
    @XmlElement(name = "DataSupplyRequest")
    protected DataSupplyRequestStructure dataSupplyRequest;
    @XmlElement(name = "CheckStatusRequest")
    protected CheckStatusRequestStructure checkStatusRequest;
    @XmlElement(name = "HeartbeatNotification")
    protected HeartbeatNotificationStructure heartbeatNotification;
    @XmlElement(name = "CapabilitiesRequest")
    protected CapabilitiesRequestStructure capabilitiesRequest;
    @XmlElement(name = "AbstractDiscoveryRequest")
    protected AbstractDiscoveryRequestStructure abstractDiscoveryRequest;
    @XmlElement(name = "SubscriptionResponse")
    protected SubscriptionResponseStructure subscriptionResponse;
    @XmlElement(name = "TerminateSubscriptionResponse")
    protected TerminateSubscriptionResponseStructure terminateSubscriptionResponse;
    @XmlElement(name = "DataReadyAcknowledgement")
    protected DataReadyResponseStructure dataReadyAcknowledgement;
    @XmlElement(name = "ServiceDelivery")
    protected ServiceDelivery serviceDelivery;
    @XmlElement(name = "DataReceivedAcknowledgement")
    protected DataReceivedResponseStructure dataReceivedAcknowledgement;
    @XmlElement(name = "CheckStatusResponse")
    protected CheckStatusResponseStructure checkStatusResponse;
    @XmlElement(name = "CapabilitiesResponse")
    protected CapabilitiesResponseStructure capabilitiesResponse;
    @XmlElement(name = "AbstractDiscoveryDelivery")
    protected AbstractDiscoveryDeliveryStructure abstractDiscoveryDelivery;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String version;

    /**
     * Ruft den Wert der serviceRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequest }
     *     
     */
    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    /**
     * Legt den Wert der serviceRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequest }
     *     
     */
    public void setServiceRequest(ServiceRequest value) {
        this.serviceRequest = value;
    }

    /**
     * Ruft den Wert der subscriptionRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionRequest }
     *     
     */
    public SubscriptionRequest getSubscriptionRequest() {
        return subscriptionRequest;
    }

    /**
     * Legt den Wert der subscriptionRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionRequest }
     *     
     */
    public void setSubscriptionRequest(SubscriptionRequest value) {
        this.subscriptionRequest = value;
    }

    /**
     * Ruft den Wert der terminateSubscriptionRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TerminateSubscriptionRequestStructure }
     *     
     */
    public TerminateSubscriptionRequestStructure getTerminateSubscriptionRequest() {
        return terminateSubscriptionRequest;
    }

    /**
     * Legt den Wert der terminateSubscriptionRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateSubscriptionRequestStructure }
     *     
     */
    public void setTerminateSubscriptionRequest(TerminateSubscriptionRequestStructure value) {
        this.terminateSubscriptionRequest = value;
    }

    /**
     * Ruft den Wert der dataReadyNotification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataReadyRequestStructure }
     *     
     */
    public DataReadyRequestStructure getDataReadyNotification() {
        return dataReadyNotification;
    }

    /**
     * Legt den Wert der dataReadyNotification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReadyRequestStructure }
     *     
     */
    public void setDataReadyNotification(DataReadyRequestStructure value) {
        this.dataReadyNotification = value;
    }

    /**
     * Ruft den Wert der dataSupplyRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataSupplyRequestStructure }
     *     
     */
    public DataSupplyRequestStructure getDataSupplyRequest() {
        return dataSupplyRequest;
    }

    /**
     * Legt den Wert der dataSupplyRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSupplyRequestStructure }
     *     
     */
    public void setDataSupplyRequest(DataSupplyRequestStructure value) {
        this.dataSupplyRequest = value;
    }

    /**
     * Ruft den Wert der checkStatusRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusRequestStructure }
     *     
     */
    public CheckStatusRequestStructure getCheckStatusRequest() {
        return checkStatusRequest;
    }

    /**
     * Legt den Wert der checkStatusRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusRequestStructure }
     *     
     */
    public void setCheckStatusRequest(CheckStatusRequestStructure value) {
        this.checkStatusRequest = value;
    }

    /**
     * Ruft den Wert der heartbeatNotification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeartbeatNotificationStructure }
     *     
     */
    public HeartbeatNotificationStructure getHeartbeatNotification() {
        return heartbeatNotification;
    }

    /**
     * Legt den Wert der heartbeatNotification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartbeatNotificationStructure }
     *     
     */
    public void setHeartbeatNotification(HeartbeatNotificationStructure value) {
        this.heartbeatNotification = value;
    }

    /**
     * Ruft den Wert der capabilitiesRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesRequestStructure }
     *     
     */
    public CapabilitiesRequestStructure getCapabilitiesRequest() {
        return capabilitiesRequest;
    }

    /**
     * Legt den Wert der capabilitiesRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesRequestStructure }
     *     
     */
    public void setCapabilitiesRequest(CapabilitiesRequestStructure value) {
        this.capabilitiesRequest = value;
    }

    /**
     * Ruft den Wert der abstractDiscoveryRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractDiscoveryRequestStructure }
     *     
     */
    public AbstractDiscoveryRequestStructure getAbstractDiscoveryRequest() {
        return abstractDiscoveryRequest;
    }

    /**
     * Legt den Wert der abstractDiscoveryRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractDiscoveryRequestStructure }
     *     
     */
    public void setAbstractDiscoveryRequest(AbstractDiscoveryRequestStructure value) {
        this.abstractDiscoveryRequest = value;
    }

    /**
     * Ruft den Wert der subscriptionResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionResponseStructure }
     *     
     */
    public SubscriptionResponseStructure getSubscriptionResponse() {
        return subscriptionResponse;
    }

    /**
     * Legt den Wert der subscriptionResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionResponseStructure }
     *     
     */
    public void setSubscriptionResponse(SubscriptionResponseStructure value) {
        this.subscriptionResponse = value;
    }

    /**
     * Ruft den Wert der terminateSubscriptionResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TerminateSubscriptionResponseStructure }
     *     
     */
    public TerminateSubscriptionResponseStructure getTerminateSubscriptionResponse() {
        return terminateSubscriptionResponse;
    }

    /**
     * Legt den Wert der terminateSubscriptionResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateSubscriptionResponseStructure }
     *     
     */
    public void setTerminateSubscriptionResponse(TerminateSubscriptionResponseStructure value) {
        this.terminateSubscriptionResponse = value;
    }

    /**
     * Ruft den Wert der dataReadyAcknowledgement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataReadyResponseStructure }
     *     
     */
    public DataReadyResponseStructure getDataReadyAcknowledgement() {
        return dataReadyAcknowledgement;
    }

    /**
     * Legt den Wert der dataReadyAcknowledgement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReadyResponseStructure }
     *     
     */
    public void setDataReadyAcknowledgement(DataReadyResponseStructure value) {
        this.dataReadyAcknowledgement = value;
    }

    /**
     * Ruft den Wert der serviceDelivery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDelivery }
     *     
     */
    public ServiceDelivery getServiceDelivery() {
        return serviceDelivery;
    }

    /**
     * Legt den Wert der serviceDelivery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDelivery }
     *     
     */
    public void setServiceDelivery(ServiceDelivery value) {
        this.serviceDelivery = value;
    }

    /**
     * Ruft den Wert der dataReceivedAcknowledgement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataReceivedResponseStructure }
     *     
     */
    public DataReceivedResponseStructure getDataReceivedAcknowledgement() {
        return dataReceivedAcknowledgement;
    }

    /**
     * Legt den Wert der dataReceivedAcknowledgement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReceivedResponseStructure }
     *     
     */
    public void setDataReceivedAcknowledgement(DataReceivedResponseStructure value) {
        this.dataReceivedAcknowledgement = value;
    }

    /**
     * Ruft den Wert der checkStatusResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusResponseStructure }
     *     
     */
    public CheckStatusResponseStructure getCheckStatusResponse() {
        return checkStatusResponse;
    }

    /**
     * Legt den Wert der checkStatusResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusResponseStructure }
     *     
     */
    public void setCheckStatusResponse(CheckStatusResponseStructure value) {
        this.checkStatusResponse = value;
    }

    /**
     * Responses with the capabilities of an implementation. Answers a CapabilityRequest.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesResponseStructure }
     *     
     */
    public CapabilitiesResponseStructure getCapabilitiesResponse() {
        return capabilitiesResponse;
    }

    /**
     * Legt den Wert der capabilitiesResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesResponseStructure }
     *     
     */
    public void setCapabilitiesResponse(CapabilitiesResponseStructure value) {
        this.capabilitiesResponse = value;
    }

    /**
     * Ruft den Wert der abstractDiscoveryDelivery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractDiscoveryDeliveryStructure }
     *     
     */
    public AbstractDiscoveryDeliveryStructure getAbstractDiscoveryDelivery() {
        return abstractDiscoveryDelivery;
    }

    /**
     * Legt den Wert der abstractDiscoveryDelivery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractDiscoveryDeliveryStructure }
     *     
     */
    public void setAbstractDiscoveryDelivery(AbstractDiscoveryDeliveryStructure value) {
        this.abstractDiscoveryDelivery = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.1";
        } else {
            return version;
        }
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public SiriSchema withServiceRequest(ServiceRequest value) {
        setServiceRequest(value);
        return this;
    }

    public SiriSchema withSubscriptionRequest(SubscriptionRequest value) {
        setSubscriptionRequest(value);
        return this;
    }

    public SiriSchema withTerminateSubscriptionRequest(TerminateSubscriptionRequestStructure value) {
        setTerminateSubscriptionRequest(value);
        return this;
    }

    public SiriSchema withDataReadyNotification(DataReadyRequestStructure value) {
        setDataReadyNotification(value);
        return this;
    }

    public SiriSchema withDataSupplyRequest(DataSupplyRequestStructure value) {
        setDataSupplyRequest(value);
        return this;
    }

    public SiriSchema withCheckStatusRequest(CheckStatusRequestStructure value) {
        setCheckStatusRequest(value);
        return this;
    }

    public SiriSchema withHeartbeatNotification(HeartbeatNotificationStructure value) {
        setHeartbeatNotification(value);
        return this;
    }

    public SiriSchema withCapabilitiesRequest(CapabilitiesRequestStructure value) {
        setCapabilitiesRequest(value);
        return this;
    }

    public SiriSchema withAbstractDiscoveryRequest(AbstractDiscoveryRequestStructure value) {
        setAbstractDiscoveryRequest(value);
        return this;
    }

    public SiriSchema withSubscriptionResponse(SubscriptionResponseStructure value) {
        setSubscriptionResponse(value);
        return this;
    }

    public SiriSchema withTerminateSubscriptionResponse(TerminateSubscriptionResponseStructure value) {
        setTerminateSubscriptionResponse(value);
        return this;
    }

    public SiriSchema withDataReadyAcknowledgement(DataReadyResponseStructure value) {
        setDataReadyAcknowledgement(value);
        return this;
    }

    public SiriSchema withServiceDelivery(ServiceDelivery value) {
        setServiceDelivery(value);
        return this;
    }

    public SiriSchema withDataReceivedAcknowledgement(DataReceivedResponseStructure value) {
        setDataReceivedAcknowledgement(value);
        return this;
    }

    public SiriSchema withCheckStatusResponse(CheckStatusResponseStructure value) {
        setCheckStatusResponse(value);
        return this;
    }

    public SiriSchema withCapabilitiesResponse(CapabilitiesResponseStructure value) {
        setCapabilitiesResponse(value);
        return this;
    }

    public SiriSchema withAbstractDiscoveryDelivery(AbstractDiscoveryDeliveryStructure value) {
        setAbstractDiscoveryDelivery(value);
        return this;
    }

    public SiriSchema withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    public SiriSchema withVersion(String value) {
        setVersion(value);
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
