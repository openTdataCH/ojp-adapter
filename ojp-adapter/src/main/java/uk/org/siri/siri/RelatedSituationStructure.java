//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;
import uk.org.ifopt.ifopt.CountryRefStructure;


/**
 * Type for a reference.
 * 
 * <p>Java-Klasse für RelatedSituationStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RelatedSituationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationSharedIdentityGroup"/&gt;
 *         &lt;element name="ExternalReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelatedAs" type="{http://www.siri.org.uk/siri}RelatedToEnumeration" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedSituationStructure", propOrder = {
    "creationTime",
    "countryRef",
    "participantRef",
    "situationNumber",
    "updateCountryRef",
    "updateParticipantRef",
    "version",
    "externalReference",
    "relatedAs",
    "extensions"
})
public class RelatedSituationStructure {

    @XmlElement(name = "CreationTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime creationTime;
    @XmlElement(name = "CountryRef")
    protected CountryRefStructure countryRef;
    @XmlElement(name = "ParticipantRef")
    protected ParticipantRefStructure participantRef;
    @XmlElement(name = "SituationNumber", required = true)
    protected EntryQualifierStructure situationNumber;
    @XmlElement(name = "UpdateCountryRef")
    protected CountryRefStructure updateCountryRef;
    @XmlElement(name = "UpdateParticipantRef")
    protected ParticipantRefStructure updateParticipantRef;
    @XmlElement(name = "Version")
    protected SituationVersion version;
    @XmlElement(name = "ExternalReference")
    protected String externalReference;
    @XmlElement(name = "RelatedAs")
    @XmlSchemaType(name = "NMTOKEN")
    protected RelatedToEnumeration relatedAs;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der creationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getCreationTime() {
        return creationTime;
    }

    /**
     * Legt den Wert der creationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTime(ZonedDateTime value) {
        this.creationTime = value;
    }

    /**
     * Ruft den Wert der countryRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryRefStructure }
     *     
     */
    public CountryRefStructure getCountryRef() {
        return countryRef;
    }

    /**
     * Legt den Wert der countryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRefStructure }
     *     
     */
    public void setCountryRef(CountryRefStructure value) {
        this.countryRef = value;
    }

    /**
     * Ruft den Wert der participantRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getParticipantRef() {
        return participantRef;
    }

    /**
     * Legt den Wert der participantRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setParticipantRef(ParticipantRefStructure value) {
        this.participantRef = value;
    }

    /**
     * Unique identifier of SITUATION within a Participant. Excludes any version number.
     * 
     * @return
     *     possible object is
     *     {@link EntryQualifierStructure }
     *     
     */
    public EntryQualifierStructure getSituationNumber() {
        return situationNumber;
    }

    /**
     * Legt den Wert der situationNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryQualifierStructure }
     *     
     */
    public void setSituationNumber(EntryQualifierStructure value) {
        this.situationNumber = value;
    }

    /**
     * Ruft den Wert der updateCountryRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryRefStructure }
     *     
     */
    public CountryRefStructure getUpdateCountryRef() {
        return updateCountryRef;
    }

    /**
     * Legt den Wert der updateCountryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRefStructure }
     *     
     */
    public void setUpdateCountryRef(CountryRefStructure value) {
        this.updateCountryRef = value;
    }

    /**
     * Ruft den Wert der updateParticipantRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getUpdateParticipantRef() {
        return updateParticipantRef;
    }

    /**
     * Legt den Wert der updateParticipantRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setUpdateParticipantRef(ParticipantRefStructure value) {
        this.updateParticipantRef = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SituationVersion }
     *     
     */
    public SituationVersion getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationVersion }
     *     
     */
    public void setVersion(SituationVersion value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der externalReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Legt den Wert der externalReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Ruft den Wert der relatedAs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RelatedToEnumeration }
     *     
     */
    public RelatedToEnumeration getRelatedAs() {
        return relatedAs;
    }

    /**
     * Legt den Wert der relatedAs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedToEnumeration }
     *     
     */
    public void setRelatedAs(RelatedToEnumeration value) {
        this.relatedAs = value;
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

    public RelatedSituationStructure withCreationTime(ZonedDateTime value) {
        setCreationTime(value);
        return this;
    }

    public RelatedSituationStructure withCountryRef(CountryRefStructure value) {
        setCountryRef(value);
        return this;
    }

    public RelatedSituationStructure withParticipantRef(ParticipantRefStructure value) {
        setParticipantRef(value);
        return this;
    }

    public RelatedSituationStructure withSituationNumber(EntryQualifierStructure value) {
        setSituationNumber(value);
        return this;
    }

    public RelatedSituationStructure withUpdateCountryRef(CountryRefStructure value) {
        setUpdateCountryRef(value);
        return this;
    }

    public RelatedSituationStructure withUpdateParticipantRef(ParticipantRefStructure value) {
        setUpdateParticipantRef(value);
        return this;
    }

    public RelatedSituationStructure withVersion(SituationVersion value) {
        setVersion(value);
        return this;
    }

    public RelatedSituationStructure withExternalReference(String value) {
        setExternalReference(value);
        return this;
    }

    public RelatedSituationStructure withRelatedAs(RelatedToEnumeration value) {
        setRelatedAs(value);
        return this;
    }

    public RelatedSituationStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
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
