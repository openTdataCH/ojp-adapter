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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;
import uk.org.ifopt.ifopt.CountryRefStructure;


/**
 * Type for loggable Entry.
 * 
 * <p>Java-Klasse für SituationElementStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SituationElementStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSituationElementStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationInfoGroup"/&gt;
 *         &lt;element name="VersionedAtTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationElementStructure", propOrder = {
    "references",
    "source",
    "versionedAtTime"
})
@XmlSeeAlso({
    PtSituationElementStructure.class,
    RoadSituationElementStructure.class
})
public class SituationElementStructure
    extends AbstractSituationElementStructure
{

    @XmlElement(name = "References")
    protected ReferencesStructure references;
    @XmlElement(name = "Source", required = true)
    protected SituationSourceStructure source;
    @XmlElement(name = "VersionedAtTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime versionedAtTime;

    /**
     * Ruft den Wert der references-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferencesStructure }
     *     
     */
    public ReferencesStructure getReferences() {
        return references;
    }

    /**
     * Legt den Wert der references-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencesStructure }
     *     
     */
    public void setReferences(ReferencesStructure value) {
        this.references = value;
    }

    /**
     * Ruft den Wert der source-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SituationSourceStructure }
     *     
     */
    public SituationSourceStructure getSource() {
        return source;
    }

    /**
     * Legt den Wert der source-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationSourceStructure }
     *     
     */
    public void setSource(SituationSourceStructure value) {
        this.source = value;
    }

    /**
     * Ruft den Wert der versionedAtTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getVersionedAtTime() {
        return versionedAtTime;
    }

    /**
     * Legt den Wert der versionedAtTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionedAtTime(ZonedDateTime value) {
        this.versionedAtTime = value;
    }

    public SituationElementStructure withReferences(ReferencesStructure value) {
        setReferences(value);
        return this;
    }

    public SituationElementStructure withSource(SituationSourceStructure value) {
        setSource(value);
        return this;
    }

    public SituationElementStructure withVersionedAtTime(ZonedDateTime value) {
        setVersionedAtTime(value);
        return this;
    }

    @Override
    public SituationElementStructure withCreationTime(ZonedDateTime value) {
        setCreationTime(value);
        return this;
    }

    @Override
    public SituationElementStructure withCountryRef(CountryRefStructure value) {
        setCountryRef(value);
        return this;
    }

    @Override
    public SituationElementStructure withParticipantRef(ParticipantRefStructure value) {
        setParticipantRef(value);
        return this;
    }

    @Override
    public SituationElementStructure withSituationNumber(EntryQualifierStructure value) {
        setSituationNumber(value);
        return this;
    }

    @Override
    public SituationElementStructure withUpdateCountryRef(CountryRefStructure value) {
        setUpdateCountryRef(value);
        return this;
    }

    @Override
    public SituationElementStructure withUpdateParticipantRef(ParticipantRefStructure value) {
        setUpdateParticipantRef(value);
        return this;
    }

    @Override
    public SituationElementStructure withVersion(SituationVersion value) {
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
