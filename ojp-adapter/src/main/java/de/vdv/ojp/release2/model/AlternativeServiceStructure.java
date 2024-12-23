//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.time.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;
import uk.org.siri.siri.OperatorRefStructure;


/**
 * Service that provides shared vehicles (The Transmodel MODE OF OPERATION is VEHICLE SHARING; other related Transmodel concepts: ALTERNATIVE MODE LEG.SINGLE JOURNEY.COMMON.VEHICLE SERVICE.TRANSPORT ORGANISATION).
 * 
 * <p>Java-Klasse für AlternativeServiceStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AlternativeServiceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperatorRef" type="{http://www.siri.org.uk/siri}OperatorRefStructure"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}AlternativeServiceUsageGroup" minOccurs="0"/&gt;
 *         &lt;element name="InfoUrl" type="{http://www.vdv.de/ojp}WebLinkStructure" minOccurs="0"/&gt;
 *         &lt;element name="Restricted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictionNote" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeServiceStructure", propOrder = {
    "operatorRef",
    "name",
    "timeBufferBefore",
    "timeBufferAfter",
    "infoUrl",
    "restricted",
    "restrictionNote"
})
public class AlternativeServiceStructure {

    @XmlElement(name = "OperatorRef", required = true)
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "TimeBufferBefore", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration timeBufferBefore;
    @XmlElement(name = "TimeBufferAfter", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration timeBufferAfter;
    @XmlElement(name = "InfoUrl")
    protected WebLinkStructure infoUrl;
    @XmlElement(name = "Restricted")
    protected Boolean restricted;
    @XmlElement(name = "RestrictionNote")
    protected InternationalTextStructure restrictionNote;

    /**
     * Ruft den Wert der operatorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Legt den Wert der operatorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der timeBufferBefore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getTimeBufferBefore() {
        return timeBufferBefore;
    }

    /**
     * Legt den Wert der timeBufferBefore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeBufferBefore(Duration value) {
        this.timeBufferBefore = value;
    }

    /**
     * Ruft den Wert der timeBufferAfter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getTimeBufferAfter() {
        return timeBufferAfter;
    }

    /**
     * Legt den Wert der timeBufferAfter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeBufferAfter(Duration value) {
        this.timeBufferAfter = value;
    }

    /**
     * Ruft den Wert der infoUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WebLinkStructure }
     *     
     */
    public WebLinkStructure getInfoUrl() {
        return infoUrl;
    }

    /**
     * Legt den Wert der infoUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLinkStructure }
     *     
     */
    public void setInfoUrl(WebLinkStructure value) {
        this.infoUrl = value;
    }

    /**
     * Ruft den Wert der restricted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestricted() {
        return restricted;
    }

    /**
     * Legt den Wert der restricted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestricted(Boolean value) {
        this.restricted = value;
    }

    /**
     * Ruft den Wert der restrictionNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getRestrictionNote() {
        return restrictionNote;
    }

    /**
     * Legt den Wert der restrictionNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setRestrictionNote(InternationalTextStructure value) {
        this.restrictionNote = value;
    }

    public AlternativeServiceStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public AlternativeServiceStructure withName(String value) {
        setName(value);
        return this;
    }

    public AlternativeServiceStructure withTimeBufferBefore(Duration value) {
        setTimeBufferBefore(value);
        return this;
    }

    public AlternativeServiceStructure withTimeBufferAfter(Duration value) {
        setTimeBufferAfter(value);
        return this;
    }

    public AlternativeServiceStructure withInfoUrl(WebLinkStructure value) {
        setInfoUrl(value);
        return this;
    }

    public AlternativeServiceStructure withRestricted(Boolean value) {
        setRestricted(value);
        return this;
    }

    public AlternativeServiceStructure withRestrictionNote(InternationalTextStructure value) {
        setRestrictionNote(value);
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
