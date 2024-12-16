//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

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
 * <p>Java-Klasse für Subscription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Subscription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deleteSubscription" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="deliveryInterval" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="operatingMode" type="{http://datex2.eu/schema/2_0RC1/2_0}OperatingModeEnum"/&gt;
 *         &lt;element name="subscriptionStartTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/&gt;
 *         &lt;element name="subscriptionState" type="{http://datex2.eu/schema/2_0RC1/2_0}SubscriptionStateEnum"/&gt;
 *         &lt;element name="subscriptionStopTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="updateMethod" type="{http://datex2.eu/schema/2_0RC1/2_0}UpdateMethodEnum"/&gt;
 *         &lt;element name="target" type="{http://datex2.eu/schema/2_0RC1/2_0}Target" maxOccurs="unbounded"/&gt;
 *         &lt;element name="filterReference" type="{http://datex2.eu/schema/2_0RC1/2_0}FilterReference" minOccurs="0"/&gt;
 *         &lt;element name="catalogueReference" type="{http://datex2.eu/schema/2_0RC1/2_0}CatalogueReference" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscription", propOrder = {
    "deleteSubscription",
    "deliveryInterval",
    "operatingMode",
    "subscriptionStartTime",
    "subscriptionState",
    "subscriptionStopTime",
    "updateMethod",
    "target",
    "filterReference",
    "catalogueReference",
    "subscriptionExtension"
})
public class Subscription {

    protected Boolean deleteSubscription;
    protected Float deliveryInterval;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OperatingModeEnum operatingMode;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime subscriptionStartTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SubscriptionStateEnum subscriptionState;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime subscriptionStopTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UpdateMethodEnum updateMethod;
    @XmlElement(required = true)
    protected List<Target> target;
    protected FilterReference filterReference;
    protected CatalogueReference catalogueReference;
    protected ExtensionType subscriptionExtension;

    /**
     * Ruft den Wert der deleteSubscription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteSubscription() {
        return deleteSubscription;
    }

    /**
     * Legt den Wert der deleteSubscription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteSubscription(Boolean value) {
        this.deleteSubscription = value;
    }

    /**
     * Ruft den Wert der deliveryInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeliveryInterval() {
        return deliveryInterval;
    }

    /**
     * Legt den Wert der deliveryInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeliveryInterval(Float value) {
        this.deliveryInterval = value;
    }

    /**
     * Ruft den Wert der operatingMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatingModeEnum }
     *     
     */
    public OperatingModeEnum getOperatingMode() {
        return operatingMode;
    }

    /**
     * Legt den Wert der operatingMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingModeEnum }
     *     
     */
    public void setOperatingMode(OperatingModeEnum value) {
        this.operatingMode = value;
    }

    /**
     * Ruft den Wert der subscriptionStartTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getSubscriptionStartTime() {
        return subscriptionStartTime;
    }

    /**
     * Legt den Wert der subscriptionStartTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionStartTime(ZonedDateTime value) {
        this.subscriptionStartTime = value;
    }

    /**
     * Ruft den Wert der subscriptionState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionStateEnum }
     *     
     */
    public SubscriptionStateEnum getSubscriptionState() {
        return subscriptionState;
    }

    /**
     * Legt den Wert der subscriptionState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionStateEnum }
     *     
     */
    public void setSubscriptionState(SubscriptionStateEnum value) {
        this.subscriptionState = value;
    }

    /**
     * Ruft den Wert der subscriptionStopTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getSubscriptionStopTime() {
        return subscriptionStopTime;
    }

    /**
     * Legt den Wert der subscriptionStopTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionStopTime(ZonedDateTime value) {
        this.subscriptionStopTime = value;
    }

    /**
     * Ruft den Wert der updateMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMethodEnum }
     *     
     */
    public UpdateMethodEnum getUpdateMethod() {
        return updateMethod;
    }

    /**
     * Legt den Wert der updateMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMethodEnum }
     *     
     */
    public void setUpdateMethod(UpdateMethodEnum value) {
        this.updateMethod = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the target property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Target }
     * 
     * 
     */
    public List<Target> getTarget() {
        if (target == null) {
            target = new ArrayList<Target>();
        }
        return this.target;
    }

    /**
     * Ruft den Wert der filterReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FilterReference }
     *     
     */
    public FilterReference getFilterReference() {
        return filterReference;
    }

    /**
     * Legt den Wert der filterReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterReference }
     *     
     */
    public void setFilterReference(FilterReference value) {
        this.filterReference = value;
    }

    /**
     * Ruft den Wert der catalogueReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueReference }
     *     
     */
    public CatalogueReference getCatalogueReference() {
        return catalogueReference;
    }

    /**
     * Legt den Wert der catalogueReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueReference }
     *     
     */
    public void setCatalogueReference(CatalogueReference value) {
        this.catalogueReference = value;
    }

    /**
     * Ruft den Wert der subscriptionExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSubscriptionExtension() {
        return subscriptionExtension;
    }

    /**
     * Legt den Wert der subscriptionExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSubscriptionExtension(ExtensionType value) {
        this.subscriptionExtension = value;
    }

    public Subscription withDeleteSubscription(Boolean value) {
        setDeleteSubscription(value);
        return this;
    }

    public Subscription withDeliveryInterval(Float value) {
        setDeliveryInterval(value);
        return this;
    }

    public Subscription withOperatingMode(OperatingModeEnum value) {
        setOperatingMode(value);
        return this;
    }

    public Subscription withSubscriptionStartTime(ZonedDateTime value) {
        setSubscriptionStartTime(value);
        return this;
    }

    public Subscription withSubscriptionState(SubscriptionStateEnum value) {
        setSubscriptionState(value);
        return this;
    }

    public Subscription withSubscriptionStopTime(ZonedDateTime value) {
        setSubscriptionStopTime(value);
        return this;
    }

    public Subscription withUpdateMethod(UpdateMethodEnum value) {
        setUpdateMethod(value);
        return this;
    }

    public Subscription withTarget(Target... values) {
        if (values!= null) {
            for (Target value: values) {
                getTarget().add(value);
            }
        }
        return this;
    }

    public Subscription withTarget(Collection<Target> values) {
        if (values!= null) {
            getTarget().addAll(values);
        }
        return this;
    }

    public Subscription withFilterReference(FilterReference value) {
        setFilterReference(value);
        return this;
    }

    public Subscription withCatalogueReference(CatalogueReference value) {
        setCatalogueReference(value);
        return this;
    }

    public Subscription withSubscriptionExtension(ExtensionType value) {
        setSubscriptionExtension(value);
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
