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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for contact details.
 * 
 * <p>Java-Klasse für ContactDetailsStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContactDetailsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactPerson" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.vdv.de/ojp}EmailAddressType" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.vdv.de/ojp}PhoneType" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.vdv.de/ojp}PhoneType" minOccurs="0"/&gt;
 *         &lt;element name="Url" type="{http://www.vdv.de/ojp}WebLinkStructure" minOccurs="0"/&gt;
 *         &lt;element name="FurtherDetails" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactDetailsStructure", propOrder = {
    "contactPerson",
    "email",
    "phone",
    "fax",
    "url",
    "furtherDetails"
})
public class ContactDetailsStructure {

    @XmlElement(name = "ContactPerson")
    protected InternationalTextStructure contactPerson;
    @XmlElement(name = "Email")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String email;
    @XmlElement(name = "Phone")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String phone;
    @XmlElement(name = "Fax")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fax;
    @XmlElement(name = "Url")
    protected WebLinkStructure url;
    @XmlElement(name = "FurtherDetails")
    protected InternationalTextStructure furtherDetails;

    /**
     * Ruft den Wert der contactPerson-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getContactPerson() {
        return contactPerson;
    }

    /**
     * Legt den Wert der contactPerson-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setContactPerson(InternationalTextStructure value) {
        this.contactPerson = value;
    }

    /**
     * Ruft den Wert der email-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Legt den Wert der email-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Ruft den Wert der phone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Legt den Wert der phone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Ruft den Wert der fax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Legt den Wert der fax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WebLinkStructure }
     *     
     */
    public WebLinkStructure getUrl() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLinkStructure }
     *     
     */
    public void setUrl(WebLinkStructure value) {
        this.url = value;
    }

    /**
     * Ruft den Wert der furtherDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getFurtherDetails() {
        return furtherDetails;
    }

    /**
     * Legt den Wert der furtherDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setFurtherDetails(InternationalTextStructure value) {
        this.furtherDetails = value;
    }

    public ContactDetailsStructure withContactPerson(InternationalTextStructure value) {
        setContactPerson(value);
        return this;
    }

    public ContactDetailsStructure withEmail(String value) {
        setEmail(value);
        return this;
    }

    public ContactDetailsStructure withPhone(String value) {
        setPhone(value);
        return this;
    }

    public ContactDetailsStructure withFax(String value) {
        setFax(value);
        return this;
    }

    public ContactDetailsStructure withUrl(WebLinkStructure value) {
        setUrl(value);
        return this;
    }

    public ContactDetailsStructure withFurtherDetails(InternationalTextStructure value) {
        setFurtherDetails(value);
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
