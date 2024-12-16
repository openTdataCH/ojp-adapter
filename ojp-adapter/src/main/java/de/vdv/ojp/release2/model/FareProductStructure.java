//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.math.BigDecimal;
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
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;
import uk.org.siri.siri.FareClassEnumeration;


/**
 * [related to FARE PRODUCT in TM and NeTEx] different FARE PRODUCTs that may be available with related information
 * 
 * <p>Java-Klasse für FareProductStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareProductStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FareProductId" type="{http://www.vdv.de/ojp}FareProductIdType"/&gt;
 *         &lt;element name="FareProductName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareAuthorityGroup"/&gt;
 *         &lt;element name="ProtoProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareProductPriceGroup"/&gt;
 *         &lt;element name="FareQuota" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareProductValidityGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareProductBookingGroup"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareProductStructure", propOrder = {
    "fareProductId",
    "fareProductName",
    "fareAuthorityRef",
    "fareAuthorityText",
    "protoProduct",
    "price",
    "netPrice",
    "currency",
    "vatRate",
    "fareQuota",
    "fareClass",
    "requiredCard",
    "validFor",
    "validityDuration",
    "validityDurationText",
    "validityTariffZones",
    "validityAreaText",
    "infoUrl",
    "saleUrl",
    "bookingArrangements",
    "extension"
})
public class FareProductStructure {

    @XmlElement(name = "FareProductId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String fareProductId;
    @XmlElement(name = "FareProductName", required = true)
    protected String fareProductName;
    @XmlElement(name = "FareAuthorityRef", required = true)
    protected FareAuthorityRefStructure fareAuthorityRef;
    @XmlElement(name = "FareAuthorityText", required = true)
    protected String fareAuthorityText;
    @XmlElement(name = "ProtoProduct", defaultValue = "false")
    protected Boolean protoProduct;
    @XmlElement(name = "Price")
    protected BigDecimal price;
    @XmlElement(name = "NetPrice")
    protected BigDecimal netPrice;
    @XmlElement(name = "Currency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String currency;
    @XmlElement(name = "VatRate")
    protected BigDecimal vatRate;
    @XmlElement(name = "FareQuota")
    protected BigInteger fareQuota;
    @XmlElement(name = "FareClass")
    @XmlSchemaType(name = "NMTOKEN")
    protected FareClassEnumeration fareClass;
    @XmlElement(name = "RequiredCard")
    protected List<EntitlementProductStructure> requiredCard;
    @XmlElement(name = "ValidFor")
    @XmlSchemaType(name = "string")
    protected List<PassengerCategoryEnumeration> validFor;
    @XmlElement(name = "ValidityDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration validityDuration;
    @XmlElement(name = "ValidityDurationText")
    protected InternationalTextStructure validityDurationText;
    @XmlElement(name = "ValidityTariffZones")
    protected List<TariffZoneListInAreaStructure> validityTariffZones;
    @XmlElement(name = "ValidityAreaText")
    protected InternationalTextStructure validityAreaText;
    @XmlElement(name = "InfoUrl")
    protected List<WebLinkStructure> infoUrl;
    @XmlElement(name = "SaleUrl")
    protected List<WebLinkStructure> saleUrl;
    @XmlElement(name = "BookingArrangements")
    protected List<BookingArrangementsContainerStructure> bookingArrangements;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Ruft den Wert der fareProductId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareProductId() {
        return fareProductId;
    }

    /**
     * Legt den Wert der fareProductId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareProductId(String value) {
        this.fareProductId = value;
    }

    /**
     * Ruft den Wert der fareProductName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareProductName() {
        return fareProductName;
    }

    /**
     * Legt den Wert der fareProductName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareProductName(String value) {
        this.fareProductName = value;
    }

    /**
     * Ruft den Wert der fareAuthorityRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareAuthorityRefStructure }
     *     
     */
    public FareAuthorityRefStructure getFareAuthorityRef() {
        return fareAuthorityRef;
    }

    /**
     * Legt den Wert der fareAuthorityRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareAuthorityRefStructure }
     *     
     */
    public void setFareAuthorityRef(FareAuthorityRefStructure value) {
        this.fareAuthorityRef = value;
    }

    /**
     * Ruft den Wert der fareAuthorityText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareAuthorityText() {
        return fareAuthorityText;
    }

    /**
     * Legt den Wert der fareAuthorityText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareAuthorityText(String value) {
        this.fareAuthorityText = value;
    }

    /**
     * Ruft den Wert der protoProduct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProtoProduct() {
        return protoProduct;
    }

    /**
     * Legt den Wert der protoProduct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtoProduct(Boolean value) {
        this.protoProduct = value;
    }

    /**
     * Ruft den Wert der price-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Legt den Wert der price-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Ruft den Wert der netPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetPrice() {
        return netPrice;
    }

    /**
     * Legt den Wert der netPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetPrice(BigDecimal value) {
        this.netPrice = value;
    }

    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Legt den Wert der currency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Ruft den Wert der vatRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatRate() {
        return vatRate;
    }

    /**
     * Legt den Wert der vatRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatRate(BigDecimal value) {
        this.vatRate = value;
    }

    /**
     * Ruft den Wert der fareQuota-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFareQuota() {
        return fareQuota;
    }

    /**
     * Legt den Wert der fareQuota-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFareQuota(BigInteger value) {
        this.fareQuota = value;
    }

    /**
     * Ruft den Wert der fareClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareClassEnumeration }
     *     
     */
    public FareClassEnumeration getFareClass() {
        return fareClass;
    }

    /**
     * Legt den Wert der fareClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareClassEnumeration }
     *     
     */
    public void setFareClass(FareClassEnumeration value) {
        this.fareClass = value;
    }

    /**
     * Gets the value of the requiredCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the requiredCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntitlementProductStructure }
     * 
     * 
     */
    public List<EntitlementProductStructure> getRequiredCard() {
        if (requiredCard == null) {
            requiredCard = new ArrayList<EntitlementProductStructure>();
        }
        return this.requiredCard;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the validFor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidFor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCategoryEnumeration }
     * 
     * 
     */
    public List<PassengerCategoryEnumeration> getValidFor() {
        if (validFor == null) {
            validFor = new ArrayList<PassengerCategoryEnumeration>();
        }
        return this.validFor;
    }

    /**
     * Ruft den Wert der validityDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getValidityDuration() {
        return validityDuration;
    }

    /**
     * Legt den Wert der validityDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityDuration(Duration value) {
        this.validityDuration = value;
    }

    /**
     * Ruft den Wert der validityDurationText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getValidityDurationText() {
        return validityDurationText;
    }

    /**
     * Legt den Wert der validityDurationText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setValidityDurationText(InternationalTextStructure value) {
        this.validityDurationText = value;
    }

    /**
     * Gets the value of the validityTariffZones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the validityTariffZones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityTariffZones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffZoneListInAreaStructure }
     * 
     * 
     */
    public List<TariffZoneListInAreaStructure> getValidityTariffZones() {
        if (validityTariffZones == null) {
            validityTariffZones = new ArrayList<TariffZoneListInAreaStructure>();
        }
        return this.validityTariffZones;
    }

    /**
     * Ruft den Wert der validityAreaText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getValidityAreaText() {
        return validityAreaText;
    }

    /**
     * Legt den Wert der validityAreaText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setValidityAreaText(InternationalTextStructure value) {
        this.validityAreaText = value;
    }

    /**
     * Gets the value of the infoUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the infoUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebLinkStructure }
     * 
     * 
     */
    public List<WebLinkStructure> getInfoUrl() {
        if (infoUrl == null) {
            infoUrl = new ArrayList<WebLinkStructure>();
        }
        return this.infoUrl;
    }

    /**
     * Gets the value of the saleUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the saleUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebLinkStructure }
     * 
     * 
     */
    public List<WebLinkStructure> getSaleUrl() {
        if (saleUrl == null) {
            saleUrl = new ArrayList<WebLinkStructure>();
        }
        return this.saleUrl;
    }

    /**
     * Gets the value of the bookingArrangements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bookingArrangements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingArrangements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingArrangementsContainerStructure }
     * 
     * 
     */
    public List<BookingArrangementsContainerStructure> getBookingArrangements() {
        if (bookingArrangements == null) {
            bookingArrangements = new ArrayList<BookingArrangementsContainerStructure>();
        }
        return this.bookingArrangements;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public FareProductStructure withFareProductId(String value) {
        setFareProductId(value);
        return this;
    }

    public FareProductStructure withFareProductName(String value) {
        setFareProductName(value);
        return this;
    }

    public FareProductStructure withFareAuthorityRef(FareAuthorityRefStructure value) {
        setFareAuthorityRef(value);
        return this;
    }

    public FareProductStructure withFareAuthorityText(String value) {
        setFareAuthorityText(value);
        return this;
    }

    public FareProductStructure withProtoProduct(Boolean value) {
        setProtoProduct(value);
        return this;
    }

    public FareProductStructure withPrice(BigDecimal value) {
        setPrice(value);
        return this;
    }

    public FareProductStructure withNetPrice(BigDecimal value) {
        setNetPrice(value);
        return this;
    }

    public FareProductStructure withCurrency(String value) {
        setCurrency(value);
        return this;
    }

    public FareProductStructure withVatRate(BigDecimal value) {
        setVatRate(value);
        return this;
    }

    public FareProductStructure withFareQuota(BigInteger value) {
        setFareQuota(value);
        return this;
    }

    public FareProductStructure withFareClass(FareClassEnumeration value) {
        setFareClass(value);
        return this;
    }

    public FareProductStructure withRequiredCard(EntitlementProductStructure... values) {
        if (values!= null) {
            for (EntitlementProductStructure value: values) {
                getRequiredCard().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withRequiredCard(Collection<EntitlementProductStructure> values) {
        if (values!= null) {
            getRequiredCard().addAll(values);
        }
        return this;
    }

    public FareProductStructure withValidFor(PassengerCategoryEnumeration... values) {
        if (values!= null) {
            for (PassengerCategoryEnumeration value: values) {
                getValidFor().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withValidFor(Collection<PassengerCategoryEnumeration> values) {
        if (values!= null) {
            getValidFor().addAll(values);
        }
        return this;
    }

    public FareProductStructure withValidityDuration(Duration value) {
        setValidityDuration(value);
        return this;
    }

    public FareProductStructure withValidityDurationText(InternationalTextStructure value) {
        setValidityDurationText(value);
        return this;
    }

    public FareProductStructure withValidityTariffZones(TariffZoneListInAreaStructure... values) {
        if (values!= null) {
            for (TariffZoneListInAreaStructure value: values) {
                getValidityTariffZones().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withValidityTariffZones(Collection<TariffZoneListInAreaStructure> values) {
        if (values!= null) {
            getValidityTariffZones().addAll(values);
        }
        return this;
    }

    public FareProductStructure withValidityAreaText(InternationalTextStructure value) {
        setValidityAreaText(value);
        return this;
    }

    public FareProductStructure withInfoUrl(WebLinkStructure... values) {
        if (values!= null) {
            for (WebLinkStructure value: values) {
                getInfoUrl().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withInfoUrl(Collection<WebLinkStructure> values) {
        if (values!= null) {
            getInfoUrl().addAll(values);
        }
        return this;
    }

    public FareProductStructure withSaleUrl(WebLinkStructure... values) {
        if (values!= null) {
            for (WebLinkStructure value: values) {
                getSaleUrl().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withSaleUrl(Collection<WebLinkStructure> values) {
        if (values!= null) {
            getSaleUrl().addAll(values);
        }
        return this;
    }

    public FareProductStructure withBookingArrangements(BookingArrangementsContainerStructure... values) {
        if (values!= null) {
            for (BookingArrangementsContainerStructure value: values) {
                getBookingArrangements().add(value);
            }
        }
        return this;
    }

    public FareProductStructure withBookingArrangements(Collection<BookingArrangementsContainerStructure> values) {
        if (values!= null) {
            getBookingArrangements().addAll(values);
        }
        return this;
    }

    public FareProductStructure withExtension(Object value) {
        setExtension(value);
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
