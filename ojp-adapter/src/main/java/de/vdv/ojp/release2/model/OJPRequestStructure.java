//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.AbstractDiscoveryRequestStructure;
import uk.org.siri.siri.CapabilitiesRequestStructure;
import uk.org.siri.siri.CheckStatusRequestStructure;
import uk.org.siri.siri.DataReadyRequestStructure;
import uk.org.siri.siri.DataSupplyRequestStructure;
import uk.org.siri.siri.HeartbeatNotificationStructure;
import uk.org.siri.siri.ServiceRequest;
import uk.org.siri.siri.SubscriptionRequest;
import uk.org.siri.siri.TerminateSubscriptionRequestStructure;


/**
 * Type for OJP Request - Groups individual functional requests.
 * 
 * <p>Java-Klasse für OJPRequestStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OJPRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}RequestGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJPRequestStructure", propOrder = {
    "serviceRequest",
    "subscriptionRequest",
    "terminateSubscriptionRequest",
    "dataReadyNotification",
    "dataSupplyRequest",
    "checkStatusRequest",
    "heartbeatNotification",
    "capabilitiesRequest",
    "abstractDiscoveryRequest"
})
public class OJPRequestStructure {

    @XmlElement(name = "ServiceRequest", namespace = "http://www.siri.org.uk/siri")
    protected ServiceRequest serviceRequest;
    @XmlElement(name = "SubscriptionRequest", namespace = "http://www.siri.org.uk/siri")
    protected SubscriptionRequest subscriptionRequest;
    @XmlElement(name = "TerminateSubscriptionRequest", namespace = "http://www.siri.org.uk/siri")
    protected TerminateSubscriptionRequestStructure terminateSubscriptionRequest;
    @XmlElement(name = "DataReadyNotification", namespace = "http://www.siri.org.uk/siri")
    protected DataReadyRequestStructure dataReadyNotification;
    @XmlElement(name = "DataSupplyRequest", namespace = "http://www.siri.org.uk/siri")
    protected DataSupplyRequestStructure dataSupplyRequest;
    @XmlElement(name = "CheckStatusRequest", namespace = "http://www.siri.org.uk/siri")
    protected CheckStatusRequestStructure checkStatusRequest;
    @XmlElement(name = "HeartbeatNotification", namespace = "http://www.siri.org.uk/siri")
    protected HeartbeatNotificationStructure heartbeatNotification;
    @XmlElement(name = "CapabilitiesRequest", namespace = "http://www.siri.org.uk/siri")
    protected CapabilitiesRequestStructure capabilitiesRequest;
    @XmlElement(name = "AbstractDiscoveryRequest", namespace = "http://www.siri.org.uk/siri")
    protected AbstractDiscoveryRequestStructure abstractDiscoveryRequest;

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

    public OJPRequestStructure withServiceRequest(ServiceRequest value) {
        setServiceRequest(value);
        return this;
    }

    public OJPRequestStructure withSubscriptionRequest(SubscriptionRequest value) {
        setSubscriptionRequest(value);
        return this;
    }

    public OJPRequestStructure withTerminateSubscriptionRequest(TerminateSubscriptionRequestStructure value) {
        setTerminateSubscriptionRequest(value);
        return this;
    }

    public OJPRequestStructure withDataReadyNotification(DataReadyRequestStructure value) {
        setDataReadyNotification(value);
        return this;
    }

    public OJPRequestStructure withDataSupplyRequest(DataSupplyRequestStructure value) {
        setDataSupplyRequest(value);
        return this;
    }

    public OJPRequestStructure withCheckStatusRequest(CheckStatusRequestStructure value) {
        setCheckStatusRequest(value);
        return this;
    }

    public OJPRequestStructure withHeartbeatNotification(HeartbeatNotificationStructure value) {
        setHeartbeatNotification(value);
        return this;
    }

    public OJPRequestStructure withCapabilitiesRequest(CapabilitiesRequestStructure value) {
        setCapabilitiesRequest(value);
        return this;
    }

    public OJPRequestStructure withAbstractDiscoveryRequest(AbstractDiscoveryRequestStructure value) {
        setAbstractDiscoveryRequest(value);
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
