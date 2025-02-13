//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;

/**
 * <p>Java-Klasse für Exchange complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Exchange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="changedFlag" type="{http://datex2.eu/schema/2_0RC1/2_0}ChangedFlagEnum" minOccurs="0"/&gt;
 *         &lt;element name="clientIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="deliveryBreak" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="denyReason" type="{http://datex2.eu/schema/2_0RC1/2_0}DenyReasonEnum" minOccurs="0"/&gt;
 *         &lt;element name="historicalStartDate" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="historicalStopDate" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="keepAlive" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="requestType" type="{http://datex2.eu/schema/2_0RC1/2_0}RequestTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="response" type="{http://datex2.eu/schema/2_0RC1/2_0}ResponseEnum" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionReference" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="supplierIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}InternationalIdentifier"/&gt;
 *         &lt;element name="target" type="{http://datex2.eu/schema/2_0RC1/2_0}Target" minOccurs="0"/&gt;
 *         &lt;element name="subscription" type="{http://datex2.eu/schema/2_0RC1/2_0}Subscription" minOccurs="0"/&gt;
 *         &lt;element name="filterReference" type="{http://datex2.eu/schema/2_0RC1/2_0}FilterReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="catalogueReference" type="{http://datex2.eu/schema/2_0RC1/2_0}CatalogueReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="exchangeExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exchange", propOrder = {
    "changedFlag",
    "clientIdentification",
    "deliveryBreak",
    "denyReason",
    "historicalStartDate",
    "historicalStopDate",
    "keepAlive",
    "requestType",
    "response",
    "subscriptionReference",
    "supplierIdentification",
    "target",
    "subscription",
    "filterReference",
    "catalogueReference",
    "exchangeExtension"
})
public class Exchange {

    @XmlSchemaType(name = "string")
    protected ChangedFlagEnum changedFlag;
    protected String clientIdentification;
    protected Boolean deliveryBreak;
    @XmlSchemaType(name = "string")
    protected DenyReasonEnum denyReason;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime historicalStartDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime historicalStopDate;
    protected Boolean keepAlive;
    @XmlSchemaType(name = "string")
    protected RequestTypeEnum requestType;
    @XmlSchemaType(name = "string")
    protected ResponseEnum response;
    protected String subscriptionReference;
    @XmlElement(required = true)
    protected InternationalIdentifier supplierIdentification;
    protected Target target;
    protected Subscription subscription;
    protected List<FilterReference> filterReference;
    protected List<CatalogueReference> catalogueReference;
    protected ExtensionType exchangeExtension;

    /**
     * Ruft den Wert der changedFlag-Eigenschaft ab.
     *
     * @return possible object is {@link ChangedFlagEnum }
     */
    public ChangedFlagEnum getChangedFlag() {
        return changedFlag;
    }

    /**
     * Legt den Wert der changedFlag-Eigenschaft fest.
     *
     * @param value allowed object is {@link ChangedFlagEnum }
     */
    public void setChangedFlag(ChangedFlagEnum value) {
        this.changedFlag = value;
    }

    /**
     * Ruft den Wert der clientIdentification-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getClientIdentification() {
        return clientIdentification;
    }

    /**
     * Legt den Wert der clientIdentification-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setClientIdentification(String value) {
        this.clientIdentification = value;
    }

    /**
     * Ruft den Wert der deliveryBreak-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isDeliveryBreak() {
        return deliveryBreak;
    }

    /**
     * Legt den Wert der deliveryBreak-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setDeliveryBreak(Boolean value) {
        this.deliveryBreak = value;
    }

    /**
     * Ruft den Wert der denyReason-Eigenschaft ab.
     *
     * @return possible object is {@link DenyReasonEnum }
     */
    public DenyReasonEnum getDenyReason() {
        return denyReason;
    }

    /**
     * Legt den Wert der denyReason-Eigenschaft fest.
     *
     * @param value allowed object is {@link DenyReasonEnum }
     */
    public void setDenyReason(DenyReasonEnum value) {
        this.denyReason = value;
    }

    /**
     * Ruft den Wert der historicalStartDate-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getHistoricalStartDate() {
        return historicalStartDate;
    }

    /**
     * Legt den Wert der historicalStartDate-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setHistoricalStartDate(ZonedDateTime value) {
        this.historicalStartDate = value;
    }

    /**
     * Ruft den Wert der historicalStopDate-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getHistoricalStopDate() {
        return historicalStopDate;
    }

    /**
     * Legt den Wert der historicalStopDate-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setHistoricalStopDate(ZonedDateTime value) {
        this.historicalStopDate = value;
    }

    /**
     * Ruft den Wert der keepAlive-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isKeepAlive() {
        return keepAlive;
    }

    /**
     * Legt den Wert der keepAlive-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setKeepAlive(Boolean value) {
        this.keepAlive = value;
    }

    /**
     * Ruft den Wert der requestType-Eigenschaft ab.
     *
     * @return possible object is {@link RequestTypeEnum }
     */
    public RequestTypeEnum getRequestType() {
        return requestType;
    }

    /**
     * Legt den Wert der requestType-Eigenschaft fest.
     *
     * @param value allowed object is {@link RequestTypeEnum }
     */
    public void setRequestType(RequestTypeEnum value) {
        this.requestType = value;
    }

    /**
     * Ruft den Wert der response-Eigenschaft ab.
     *
     * @return possible object is {@link ResponseEnum }
     */
    public ResponseEnum getResponse() {
        return response;
    }

    /**
     * Legt den Wert der response-Eigenschaft fest.
     *
     * @param value allowed object is {@link ResponseEnum }
     */
    public void setResponse(ResponseEnum value) {
        this.response = value;
    }

    /**
     * Ruft den Wert der subscriptionReference-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getSubscriptionReference() {
        return subscriptionReference;
    }

    /**
     * Legt den Wert der subscriptionReference-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setSubscriptionReference(String value) {
        this.subscriptionReference = value;
    }

    /**
     * Ruft den Wert der supplierIdentification-Eigenschaft ab.
     *
     * @return possible object is {@link InternationalIdentifier }
     */
    public InternationalIdentifier getSupplierIdentification() {
        return supplierIdentification;
    }

    /**
     * Legt den Wert der supplierIdentification-Eigenschaft fest.
     *
     * @param value allowed object is {@link InternationalIdentifier }
     */
    public void setSupplierIdentification(InternationalIdentifier value) {
        this.supplierIdentification = value;
    }

    /**
     * Ruft den Wert der target-Eigenschaft ab.
     *
     * @return possible object is {@link Target }
     */
    public Target getTarget() {
        return target;
    }

    /**
     * Legt den Wert der target-Eigenschaft fest.
     *
     * @param value allowed object is {@link Target }
     */
    public void setTarget(Target value) {
        this.target = value;
    }

    /**
     * Ruft den Wert der subscription-Eigenschaft ab.
     *
     * @return possible object is {@link Subscription }
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Legt den Wert der subscription-Eigenschaft fest.
     *
     * @param value allowed object is {@link Subscription }
     */
    public void setSubscription(Subscription value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the filterReference property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the filterReference property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterReference().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FilterReference }
     */
    public List<FilterReference> getFilterReference() {
        if (filterReference == null) {
            filterReference = new ArrayList<FilterReference>();
        }
        return this.filterReference;
    }

    /**
     * Gets the value of the catalogueReference property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the catalogueReference property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalogueReference().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link CatalogueReference }
     */
    public List<CatalogueReference> getCatalogueReference() {
        if (catalogueReference == null) {
            catalogueReference = new ArrayList<CatalogueReference>();
        }
        return this.catalogueReference;
    }

    /**
     * Ruft den Wert der exchangeExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getExchangeExtension() {
        return exchangeExtension;
    }

    /**
     * Legt den Wert der exchangeExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setExchangeExtension(ExtensionType value) {
        this.exchangeExtension = value;
    }

    public Exchange withChangedFlag(ChangedFlagEnum value) {
        setChangedFlag(value);
        return this;
    }

    public Exchange withClientIdentification(String value) {
        setClientIdentification(value);
        return this;
    }

    public Exchange withDeliveryBreak(Boolean value) {
        setDeliveryBreak(value);
        return this;
    }

    public Exchange withDenyReason(DenyReasonEnum value) {
        setDenyReason(value);
        return this;
    }

    public Exchange withHistoricalStartDate(ZonedDateTime value) {
        setHistoricalStartDate(value);
        return this;
    }

    public Exchange withHistoricalStopDate(ZonedDateTime value) {
        setHistoricalStopDate(value);
        return this;
    }

    public Exchange withKeepAlive(Boolean value) {
        setKeepAlive(value);
        return this;
    }

    public Exchange withRequestType(RequestTypeEnum value) {
        setRequestType(value);
        return this;
    }

    public Exchange withResponse(ResponseEnum value) {
        setResponse(value);
        return this;
    }

    public Exchange withSubscriptionReference(String value) {
        setSubscriptionReference(value);
        return this;
    }

    public Exchange withSupplierIdentification(InternationalIdentifier value) {
        setSupplierIdentification(value);
        return this;
    }

    public Exchange withTarget(Target value) {
        setTarget(value);
        return this;
    }

    public Exchange withSubscription(Subscription value) {
        setSubscription(value);
        return this;
    }

    public Exchange withFilterReference(FilterReference... values) {
        if (values != null) {
            for (FilterReference value : values) {
                getFilterReference().add(value);
            }
        }
        return this;
    }

    public Exchange withFilterReference(Collection<FilterReference> values) {
        if (values != null) {
            getFilterReference().addAll(values);
        }
        return this;
    }

    public Exchange withCatalogueReference(CatalogueReference... values) {
        if (values != null) {
            for (CatalogueReference value : values) {
                getCatalogueReference().add(value);
            }
        }
        return this;
    }

    public Exchange withCatalogueReference(Collection<CatalogueReference> values) {
        if (values != null) {
            getCatalogueReference().addAll(values);
        }
        return this;
    }

    public Exchange withExchangeExtension(ExtensionType value) {
        setExchangeExtension(value);
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
