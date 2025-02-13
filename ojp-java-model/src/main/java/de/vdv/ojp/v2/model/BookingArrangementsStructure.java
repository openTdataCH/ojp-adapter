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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Duration;
import java.time.LocalTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;
import org.rutebanken.util.LocalTimeISO8601XmlAdapter;

/**
 * Type for BOOKING ARRANGEMENTs modified from NeTEx.
 *
 * <p>Java-Klasse für BookingArrangementsStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="BookingArrangementsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.vdv.de/ojp}BookingArrangementsGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingArrangementsStructure", propOrder = {
    "bookingContact",
    "bookingMethods",
    "bookingAccess",
    "bookWhen",
    "buyWhen",
    "latestBookingTime",
    "minimumBookingPeriod",
    "maximumBookingPeriod",
    "bookingUrl",
    "bookingNotes",
    "extension"
})
public class BookingArrangementsStructure {

    @XmlElement(name = "BookingContact")
    protected ContactDetailsStructure bookingContact;
    @XmlElement(name = "BookingMethods")
    protected BookingMethodListOfEnumerations bookingMethods;
    @XmlElement(name = "BookingAccess")
    @XmlSchemaType(name = "string")
    protected BookingAccessEnumeration bookingAccess;
    @XmlElement(name = "BookWhen")
    @XmlSchemaType(name = "normalizedString")
    protected PurchaseWhenEnumeration bookWhen;
    @XmlElement(name = "BuyWhen")
    protected PurchaseMomentListOfEnumerations buyWhen;
    @XmlElement(name = "LatestBookingTime", type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime latestBookingTime;
    @XmlElement(name = "MinimumBookingPeriod", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration minimumBookingPeriod;
    @XmlElement(name = "MaximumBookingPeriod", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumBookingPeriod;
    @XmlElement(name = "BookingUrl")
    protected WebLinkStructure bookingUrl;
    @XmlElement(name = "BookingNotes")
    protected BookingNotesStructure bookingNotes;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Ruft den Wert der bookingContact-Eigenschaft ab.
     *
     * @return possible object is {@link ContactDetailsStructure }
     */
    public ContactDetailsStructure getBookingContact() {
        return bookingContact;
    }

    /**
     * Legt den Wert der bookingContact-Eigenschaft fest.
     *
     * @param value allowed object is {@link ContactDetailsStructure }
     */
    public void setBookingContact(ContactDetailsStructure value) {
        this.bookingContact = value;
    }

    /**
     * Ruft den Wert der bookingMethods-Eigenschaft ab.
     *
     * @return possible object is {@link BookingMethodListOfEnumerations }
     */
    public BookingMethodListOfEnumerations getBookingMethods() {
        return bookingMethods;
    }

    /**
     * Legt den Wert der bookingMethods-Eigenschaft fest.
     *
     * @param value allowed object is {@link BookingMethodListOfEnumerations }
     */
    public void setBookingMethods(BookingMethodListOfEnumerations value) {
        this.bookingMethods = value;
    }

    /**
     * Ruft den Wert der bookingAccess-Eigenschaft ab.
     *
     * @return possible object is {@link BookingAccessEnumeration }
     */
    public BookingAccessEnumeration getBookingAccess() {
        return bookingAccess;
    }

    /**
     * Legt den Wert der bookingAccess-Eigenschaft fest.
     *
     * @param value allowed object is {@link BookingAccessEnumeration }
     */
    public void setBookingAccess(BookingAccessEnumeration value) {
        this.bookingAccess = value;
    }

    /**
     * Ruft den Wert der bookWhen-Eigenschaft ab.
     *
     * @return possible object is {@link PurchaseWhenEnumeration }
     */
    public PurchaseWhenEnumeration getBookWhen() {
        return bookWhen;
    }

    /**
     * Legt den Wert der bookWhen-Eigenschaft fest.
     *
     * @param value allowed object is {@link PurchaseWhenEnumeration }
     */
    public void setBookWhen(PurchaseWhenEnumeration value) {
        this.bookWhen = value;
    }

    /**
     * Ruft den Wert der buyWhen-Eigenschaft ab.
     *
     * @return possible object is {@link PurchaseMomentListOfEnumerations }
     */
    public PurchaseMomentListOfEnumerations getBuyWhen() {
        return buyWhen;
    }

    /**
     * Legt den Wert der buyWhen-Eigenschaft fest.
     *
     * @param value allowed object is {@link PurchaseMomentListOfEnumerations }
     */
    public void setBuyWhen(PurchaseMomentListOfEnumerations value) {
        this.buyWhen = value;
    }

    /**
     * Ruft den Wert der latestBookingTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public LocalTime getLatestBookingTime() {
        return latestBookingTime;
    }

    /**
     * Legt den Wert der latestBookingTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setLatestBookingTime(LocalTime value) {
        this.latestBookingTime = value;
    }

    /**
     * Ruft den Wert der minimumBookingPeriod-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getMinimumBookingPeriod() {
        return minimumBookingPeriod;
    }

    /**
     * Legt den Wert der minimumBookingPeriod-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setMinimumBookingPeriod(Duration value) {
        this.minimumBookingPeriod = value;
    }

    /**
     * Ruft den Wert der maximumBookingPeriod-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getMaximumBookingPeriod() {
        return maximumBookingPeriod;
    }

    /**
     * Legt den Wert der maximumBookingPeriod-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setMaximumBookingPeriod(Duration value) {
        this.maximumBookingPeriod = value;
    }

    /**
     * Ruft den Wert der bookingUrl-Eigenschaft ab.
     *
     * @return possible object is {@link WebLinkStructure }
     */
    public WebLinkStructure getBookingUrl() {
        return bookingUrl;
    }

    /**
     * Legt den Wert der bookingUrl-Eigenschaft fest.
     *
     * @param value allowed object is {@link WebLinkStructure }
     */
    public void setBookingUrl(WebLinkStructure value) {
        this.bookingUrl = value;
    }

    /**
     * Ruft den Wert der bookingNotes-Eigenschaft ab.
     *
     * @return possible object is {@link BookingNotesStructure }
     */
    public BookingNotesStructure getBookingNotes() {
        return bookingNotes;
    }

    /**
     * Legt den Wert der bookingNotes-Eigenschaft fest.
     *
     * @param value allowed object is {@link BookingNotesStructure }
     */
    public void setBookingNotes(BookingNotesStructure value) {
        this.bookingNotes = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     *
     * @return possible object is {@link Object }
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     *
     * @param value allowed object is {@link Object }
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public BookingArrangementsStructure withBookingContact(ContactDetailsStructure value) {
        setBookingContact(value);
        return this;
    }

    public BookingArrangementsStructure withBookingMethods(BookingMethodListOfEnumerations value) {
        setBookingMethods(value);
        return this;
    }

    public BookingArrangementsStructure withBookingAccess(BookingAccessEnumeration value) {
        setBookingAccess(value);
        return this;
    }

    public BookingArrangementsStructure withBookWhen(PurchaseWhenEnumeration value) {
        setBookWhen(value);
        return this;
    }

    public BookingArrangementsStructure withBuyWhen(PurchaseMomentListOfEnumerations value) {
        setBuyWhen(value);
        return this;
    }

    public BookingArrangementsStructure withLatestBookingTime(LocalTime value) {
        setLatestBookingTime(value);
        return this;
    }

    public BookingArrangementsStructure withMinimumBookingPeriod(Duration value) {
        setMinimumBookingPeriod(value);
        return this;
    }

    public BookingArrangementsStructure withMaximumBookingPeriod(Duration value) {
        setMaximumBookingPeriod(value);
        return this;
    }

    public BookingArrangementsStructure withBookingUrl(WebLinkStructure value) {
        setBookingUrl(value);
        return this;
    }

    public BookingArrangementsStructure withBookingNotes(BookingNotesStructure value) {
        setBookingNotes(value);
        return this;
    }

    public BookingArrangementsStructure withExtension(Object value) {
        setExtension(value);
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
