//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.math.BigInteger;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;


/**
 * Configurable context for requests. Intended Primarily as a documentation mechanism.
 * 
 * <p>Java-Klasse für ServiceRequestContextStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceRequestContextStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceEndpointAddressGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ClientEndpointAddressGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ReferenceContextGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}TemporalContextGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DeliveryContextGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ResourceContextGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}PredictionMethodGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequestContextStructure", propOrder = {
    "checkStatusAddress",
    "subscribeAddress",
    "manageSubscriptionAddress",
    "getDataAddress",
    "statusResponseAddress",
    "subscriberAddress",
    "notifyAddress",
    "consumerAddress",
    "dataNameSpaces",
    "language",
    "wgsDecimalDegrees",
    "gmlCoordinateFormat",
    "distanceUnits",
    "velocityUnits",
    "dataHorizon",
    "requestTimeout",
    "deliveryMethod",
    "multipartDespatch",
    "confirmDelivery",
    "maximimumNumberOfSubscriptions",
    "allowedPredictors",
    "predictionFunction"
})
public class ServiceRequestContextStructure {

    @XmlElement(name = "CheckStatusAddress")
    @XmlSchemaType(name = "anyURI")
    protected String checkStatusAddress;
    @XmlElement(name = "SubscribeAddress")
    @XmlSchemaType(name = "anyURI")
    protected String subscribeAddress;
    @XmlElement(name = "ManageSubscriptionAddress")
    @XmlSchemaType(name = "anyURI")
    protected String manageSubscriptionAddress;
    @XmlElement(name = "GetDataAddress")
    @XmlSchemaType(name = "anyURI")
    protected String getDataAddress;
    @XmlElement(name = "StatusResponseAddress")
    @XmlSchemaType(name = "anyURI")
    protected String statusResponseAddress;
    @XmlElement(name = "SubscriberAddress")
    @XmlSchemaType(name = "anyURI")
    protected String subscriberAddress;
    @XmlElement(name = "NotifyAddress")
    @XmlSchemaType(name = "anyURI")
    protected String notifyAddress;
    @XmlElement(name = "ConsumerAddress")
    @XmlSchemaType(name = "anyURI")
    protected String consumerAddress;
    @XmlElement(name = "DataNameSpaces")
    protected DataNameSpacesStructure dataNameSpaces;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected List<String> language;
    @XmlElement(name = "WgsDecimalDegrees")
    protected String wgsDecimalDegrees;
    @XmlElement(name = "GmlCoordinateFormat")
    protected String gmlCoordinateFormat;
    @XmlElement(name = "DistanceUnits")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String distanceUnits;
    @XmlElement(name = "VelocityUnits")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String velocityUnits;
    @XmlElement(name = "DataHorizon", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration dataHorizon;
    @XmlElement(name = "RequestTimeout", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration requestTimeout;
    @XmlElement(name = "DeliveryMethod", defaultValue = "direct")
    @XmlSchemaType(name = "NMTOKEN")
    protected DeliveryMethodEnumeration deliveryMethod;
    @XmlElement(name = "MultipartDespatch")
    protected Boolean multipartDespatch;
    @XmlElement(name = "ConfirmDelivery", defaultValue = "false")
    protected Boolean confirmDelivery;
    @XmlElement(name = "MaximimumNumberOfSubscriptions")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximimumNumberOfSubscriptions;
    @XmlElement(name = "AllowedPredictors", defaultValue = "anyone")
    @XmlSchemaType(name = "NMTOKEN")
    protected PredictorsEnumeration allowedPredictors;
    @XmlElement(name = "PredictionFunction")
    protected String predictionFunction;

    /**
     * Ruft den Wert der checkStatusAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckStatusAddress() {
        return checkStatusAddress;
    }

    /**
     * Legt den Wert der checkStatusAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckStatusAddress(String value) {
        this.checkStatusAddress = value;
    }

    /**
     * Ruft den Wert der subscribeAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscribeAddress() {
        return subscribeAddress;
    }

    /**
     * Legt den Wert der subscribeAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscribeAddress(String value) {
        this.subscribeAddress = value;
    }

    /**
     * Ruft den Wert der manageSubscriptionAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageSubscriptionAddress() {
        return manageSubscriptionAddress;
    }

    /**
     * Legt den Wert der manageSubscriptionAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageSubscriptionAddress(String value) {
        this.manageSubscriptionAddress = value;
    }

    /**
     * Ruft den Wert der getDataAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDataAddress() {
        return getDataAddress;
    }

    /**
     * Legt den Wert der getDataAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDataAddress(String value) {
        this.getDataAddress = value;
    }

    /**
     * Ruft den Wert der statusResponseAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusResponseAddress() {
        return statusResponseAddress;
    }

    /**
     * Legt den Wert der statusResponseAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusResponseAddress(String value) {
        this.statusResponseAddress = value;
    }

    /**
     * Ruft den Wert der subscriberAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberAddress() {
        return subscriberAddress;
    }

    /**
     * Legt den Wert der subscriberAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberAddress(String value) {
        this.subscriberAddress = value;
    }

    /**
     * Ruft den Wert der notifyAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyAddress() {
        return notifyAddress;
    }

    /**
     * Legt den Wert der notifyAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyAddress(String value) {
        this.notifyAddress = value;
    }

    /**
     * Ruft den Wert der consumerAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerAddress() {
        return consumerAddress;
    }

    /**
     * Legt den Wert der consumerAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerAddress(String value) {
        this.consumerAddress = value;
    }

    /**
     * Ruft den Wert der dataNameSpaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataNameSpacesStructure }
     *     
     */
    public DataNameSpacesStructure getDataNameSpaces() {
        return dataNameSpaces;
    }

    /**
     * Legt den Wert der dataNameSpaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataNameSpacesStructure }
     *     
     */
    public void setDataNameSpaces(DataNameSpacesStructure value) {
        this.dataNameSpaces = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLanguage() {
        if (language == null) {
            language = new ArrayList<String>();
        }
        return this.language;
    }

    /**
     * Ruft den Wert der wgsDecimalDegrees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWgsDecimalDegrees() {
        return wgsDecimalDegrees;
    }

    /**
     * Legt den Wert der wgsDecimalDegrees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWgsDecimalDegrees(String value) {
        this.wgsDecimalDegrees = value;
    }

    /**
     * Ruft den Wert der gmlCoordinateFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmlCoordinateFormat() {
        return gmlCoordinateFormat;
    }

    /**
     * Legt den Wert der gmlCoordinateFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmlCoordinateFormat(String value) {
        this.gmlCoordinateFormat = value;
    }

    /**
     * Ruft den Wert der distanceUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnits() {
        return distanceUnits;
    }

    /**
     * Legt den Wert der distanceUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnits(String value) {
        this.distanceUnits = value;
    }

    /**
     * Ruft den Wert der velocityUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocityUnits() {
        return velocityUnits;
    }

    /**
     * Legt den Wert der velocityUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocityUnits(String value) {
        this.velocityUnits = value;
    }

    /**
     * Ruft den Wert der dataHorizon-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getDataHorizon() {
        return dataHorizon;
    }

    /**
     * Legt den Wert der dataHorizon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataHorizon(Duration value) {
        this.dataHorizon = value;
    }

    /**
     * Ruft den Wert der requestTimeout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getRequestTimeout() {
        return requestTimeout;
    }

    /**
     * Legt den Wert der requestTimeout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTimeout(Duration value) {
        this.requestTimeout = value;
    }

    /**
     * Ruft den Wert der deliveryMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryMethodEnumeration }
     *     
     */
    public DeliveryMethodEnumeration getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Legt den Wert der deliveryMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryMethodEnumeration }
     *     
     */
    public void setDeliveryMethod(DeliveryMethodEnumeration value) {
        this.deliveryMethod = value;
    }

    /**
     * Ruft den Wert der multipartDespatch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipartDespatch() {
        return multipartDespatch;
    }

    /**
     * Legt den Wert der multipartDespatch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipartDespatch(Boolean value) {
        this.multipartDespatch = value;
    }

    /**
     * Ruft den Wert der confirmDelivery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfirmDelivery() {
        return confirmDelivery;
    }

    /**
     * Legt den Wert der confirmDelivery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfirmDelivery(Boolean value) {
        this.confirmDelivery = value;
    }

    /**
     * Ruft den Wert der maximimumNumberOfSubscriptions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximimumNumberOfSubscriptions() {
        return maximimumNumberOfSubscriptions;
    }

    /**
     * Legt den Wert der maximimumNumberOfSubscriptions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximimumNumberOfSubscriptions(BigInteger value) {
        this.maximimumNumberOfSubscriptions = value;
    }

    /**
     * Ruft den Wert der allowedPredictors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PredictorsEnumeration }
     *     
     */
    public PredictorsEnumeration getAllowedPredictors() {
        return allowedPredictors;
    }

    /**
     * Legt den Wert der allowedPredictors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictorsEnumeration }
     *     
     */
    public void setAllowedPredictors(PredictorsEnumeration value) {
        this.allowedPredictors = value;
    }

    /**
     * Ruft den Wert der predictionFunction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredictionFunction() {
        return predictionFunction;
    }

    /**
     * Legt den Wert der predictionFunction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredictionFunction(String value) {
        this.predictionFunction = value;
    }

    public ServiceRequestContextStructure withCheckStatusAddress(String value) {
        setCheckStatusAddress(value);
        return this;
    }

    public ServiceRequestContextStructure withSubscribeAddress(String value) {
        setSubscribeAddress(value);
        return this;
    }

    public ServiceRequestContextStructure withManageSubscriptionAddress(String value) {
        setManageSubscriptionAddress(value);
        return this;
    }

    public ServiceRequestContextStructure withGetDataAddress(String value) {
        setGetDataAddress(value);
        return this;
    }

    public ServiceRequestContextStructure withStatusResponseAddress(String value) {
        setStatusResponseAddress(value);
        return this;
    }

    public ServiceRequestContextStructure withSubscriberAddress(String value) {
        setSubscriberAddress(value);
        return this;
    }

    public ServiceRequestContextStructure withNotifyAddress(String value) {
        setNotifyAddress(value);
        return this;
    }

    public ServiceRequestContextStructure withConsumerAddress(String value) {
        setConsumerAddress(value);
        return this;
    }

    public ServiceRequestContextStructure withDataNameSpaces(DataNameSpacesStructure value) {
        setDataNameSpaces(value);
        return this;
    }

    public ServiceRequestContextStructure withLanguage(String... values) {
        if (values!= null) {
            for (String value: values) {
                getLanguage().add(value);
            }
        }
        return this;
    }

    public ServiceRequestContextStructure withLanguage(Collection<String> values) {
        if (values!= null) {
            getLanguage().addAll(values);
        }
        return this;
    }

    public ServiceRequestContextStructure withWgsDecimalDegrees(String value) {
        setWgsDecimalDegrees(value);
        return this;
    }

    public ServiceRequestContextStructure withGmlCoordinateFormat(String value) {
        setGmlCoordinateFormat(value);
        return this;
    }

    public ServiceRequestContextStructure withDistanceUnits(String value) {
        setDistanceUnits(value);
        return this;
    }

    public ServiceRequestContextStructure withVelocityUnits(String value) {
        setVelocityUnits(value);
        return this;
    }

    public ServiceRequestContextStructure withDataHorizon(Duration value) {
        setDataHorizon(value);
        return this;
    }

    public ServiceRequestContextStructure withRequestTimeout(Duration value) {
        setRequestTimeout(value);
        return this;
    }

    public ServiceRequestContextStructure withDeliveryMethod(DeliveryMethodEnumeration value) {
        setDeliveryMethod(value);
        return this;
    }

    public ServiceRequestContextStructure withMultipartDespatch(Boolean value) {
        setMultipartDespatch(value);
        return this;
    }

    public ServiceRequestContextStructure withConfirmDelivery(Boolean value) {
        setConfirmDelivery(value);
        return this;
    }

    public ServiceRequestContextStructure withMaximimumNumberOfSubscriptions(BigInteger value) {
        setMaximimumNumberOfSubscriptions(value);
        return this;
    }

    public ServiceRequestContextStructure withAllowedPredictors(PredictorsEnumeration value) {
        setAllowedPredictors(value);
        return this;
    }

    public ServiceRequestContextStructure withPredictionFunction(String value) {
        setPredictionFunction(value);
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
