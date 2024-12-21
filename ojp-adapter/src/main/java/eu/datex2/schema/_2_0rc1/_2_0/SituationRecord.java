//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * <p>Java-Klasse für SituationRecord complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SituationRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="situationRecordCreationReference" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="situationRecordCreationTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/&gt;
 *         &lt;element name="situationRecordObservationTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="situationRecordVersion" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="situationRecordVersionTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/&gt;
 *         &lt;element name="situationRecordFirstSupplierVersionTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="confidentialityOverride" type="{http://datex2.eu/schema/2_0RC1/2_0}ConfidentialityValueEnum" minOccurs="0"/&gt;
 *         &lt;element name="probabilityOfOccurrence" type="{http://datex2.eu/schema/2_0RC1/2_0}ProbabilityOfOccurrenceEnum"/&gt;
 *         &lt;element name="source" type="{http://datex2.eu/schema/2_0RC1/2_0}Source" minOccurs="0"/&gt;
 *         &lt;element name="validity" type="{http://datex2.eu/schema/2_0RC1/2_0}Validity"/&gt;
 *         &lt;element name="impact" type="{http://datex2.eu/schema/2_0RC1/2_0}Impact" minOccurs="0"/&gt;
 *         &lt;element name="cause" type="{http://datex2.eu/schema/2_0RC1/2_0}Cause" minOccurs="0"/&gt;
 *         &lt;element name="generalPublicComment" type="{http://datex2.eu/schema/2_0RC1/2_0}Comment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nonGeneralPublicComment" type="{http://datex2.eu/schema/2_0RC1/2_0}Comment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="urlLink" type="{http://datex2.eu/schema/2_0RC1/2_0}UrlLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="groupOfLocations" type="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfLocations"/&gt;
 *         &lt;element name="management" type="{http://datex2.eu/schema/2_0RC1/2_0}Management" minOccurs="0"/&gt;
 *         &lt;element name="situationRecordExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationRecord", propOrder = {
    "situationRecordCreationReference",
    "situationRecordCreationTime",
    "situationRecordObservationTime",
    "situationRecordVersion",
    "situationRecordVersionTime",
    "situationRecordFirstSupplierVersionTime",
    "confidentialityOverride",
    "probabilityOfOccurrence",
    "source",
    "validity",
    "impact",
    "cause",
    "generalPublicComment",
    "nonGeneralPublicComment",
    "urlLink",
    "groupOfLocations",
    "management",
    "situationRecordExtension"
})
@XmlSeeAlso({
    GenericSituationRecord.class,
    NonRoadEventInformation.class,
    TrafficElement.class,
    OperatorAction.class
})
public abstract class SituationRecord {

    protected String situationRecordCreationReference;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime situationRecordCreationTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime situationRecordObservationTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger situationRecordVersion;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime situationRecordVersionTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime situationRecordFirstSupplierVersionTime;
    @XmlSchemaType(name = "string")
    protected ConfidentialityValueEnum confidentialityOverride;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ProbabilityOfOccurrenceEnum probabilityOfOccurrence;
    protected Source source;
    @XmlElement(required = true)
    protected Validity validity;
    protected Impact impact;
    protected Cause cause;
    protected List<Comment> generalPublicComment;
    protected List<Comment> nonGeneralPublicComment;
    protected List<UrlLink> urlLink;
    @XmlElement(required = true)
    protected GroupOfLocations groupOfLocations;
    protected Management management;
    protected ExtensionType situationRecordExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Ruft den Wert der situationRecordCreationReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituationRecordCreationReference() {
        return situationRecordCreationReference;
    }

    /**
     * Legt den Wert der situationRecordCreationReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationRecordCreationReference(String value) {
        this.situationRecordCreationReference = value;
    }

    /**
     * Ruft den Wert der situationRecordCreationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getSituationRecordCreationTime() {
        return situationRecordCreationTime;
    }

    /**
     * Legt den Wert der situationRecordCreationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationRecordCreationTime(ZonedDateTime value) {
        this.situationRecordCreationTime = value;
    }

    /**
     * Ruft den Wert der situationRecordObservationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getSituationRecordObservationTime() {
        return situationRecordObservationTime;
    }

    /**
     * Legt den Wert der situationRecordObservationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationRecordObservationTime(ZonedDateTime value) {
        this.situationRecordObservationTime = value;
    }

    /**
     * Ruft den Wert der situationRecordVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSituationRecordVersion() {
        return situationRecordVersion;
    }

    /**
     * Legt den Wert der situationRecordVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSituationRecordVersion(BigInteger value) {
        this.situationRecordVersion = value;
    }

    /**
     * Ruft den Wert der situationRecordVersionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getSituationRecordVersionTime() {
        return situationRecordVersionTime;
    }

    /**
     * Legt den Wert der situationRecordVersionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationRecordVersionTime(ZonedDateTime value) {
        this.situationRecordVersionTime = value;
    }

    /**
     * Ruft den Wert der situationRecordFirstSupplierVersionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getSituationRecordFirstSupplierVersionTime() {
        return situationRecordFirstSupplierVersionTime;
    }

    /**
     * Legt den Wert der situationRecordFirstSupplierVersionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        this.situationRecordFirstSupplierVersionTime = value;
    }

    /**
     * Ruft den Wert der confidentialityOverride-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public ConfidentialityValueEnum getConfidentialityOverride() {
        return confidentialityOverride;
    }

    /**
     * Legt den Wert der confidentialityOverride-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public void setConfidentialityOverride(ConfidentialityValueEnum value) {
        this.confidentialityOverride = value;
    }

    /**
     * Ruft den Wert der probabilityOfOccurrence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public ProbabilityOfOccurrenceEnum getProbabilityOfOccurrence() {
        return probabilityOfOccurrence;
    }

    /**
     * Legt den Wert der probabilityOfOccurrence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public void setProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        this.probabilityOfOccurrence = value;
    }

    /**
     * Ruft den Wert der source-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Legt den Wert der source-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * Ruft den Wert der validity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Validity }
     *     
     */
    public Validity getValidity() {
        return validity;
    }

    /**
     * Legt den Wert der validity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Validity }
     *     
     */
    public void setValidity(Validity value) {
        this.validity = value;
    }

    /**
     * Ruft den Wert der impact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Impact }
     *     
     */
    public Impact getImpact() {
        return impact;
    }

    /**
     * Legt den Wert der impact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Impact }
     *     
     */
    public void setImpact(Impact value) {
        this.impact = value;
    }

    /**
     * Ruft den Wert der cause-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Cause }
     *     
     */
    public Cause getCause() {
        return cause;
    }

    /**
     * Legt den Wert der cause-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Cause }
     *     
     */
    public void setCause(Cause value) {
        this.cause = value;
    }

    /**
     * Gets the value of the generalPublicComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the generalPublicComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralPublicComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getGeneralPublicComment() {
        if (generalPublicComment == null) {
            generalPublicComment = new ArrayList<Comment>();
        }
        return this.generalPublicComment;
    }

    /**
     * Gets the value of the nonGeneralPublicComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nonGeneralPublicComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonGeneralPublicComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getNonGeneralPublicComment() {
        if (nonGeneralPublicComment == null) {
            nonGeneralPublicComment = new ArrayList<Comment>();
        }
        return this.nonGeneralPublicComment;
    }

    /**
     * Gets the value of the urlLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the urlLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlLink }
     * 
     * 
     */
    public List<UrlLink> getUrlLink() {
        if (urlLink == null) {
            urlLink = new ArrayList<UrlLink>();
        }
        return this.urlLink;
    }

    /**
     * Ruft den Wert der groupOfLocations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getGroupOfLocations() {
        return groupOfLocations;
    }

    /**
     * Legt den Wert der groupOfLocations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setGroupOfLocations(GroupOfLocations value) {
        this.groupOfLocations = value;
    }

    /**
     * Ruft den Wert der management-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Management }
     *     
     */
    public Management getManagement() {
        return management;
    }

    /**
     * Legt den Wert der management-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Management }
     *     
     */
    public void setManagement(Management value) {
        this.management = value;
    }

    /**
     * Ruft den Wert der situationRecordExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSituationRecordExtension() {
        return situationRecordExtension;
    }

    /**
     * Legt den Wert der situationRecordExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSituationRecordExtension(ExtensionType value) {
        this.situationRecordExtension = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public SituationRecord withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    public SituationRecord withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    public SituationRecord withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    public SituationRecord withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    public SituationRecord withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    public SituationRecord withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    public SituationRecord withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    public SituationRecord withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    public SituationRecord withSource(Source value) {
        setSource(value);
        return this;
    }

    public SituationRecord withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    public SituationRecord withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    public SituationRecord withCause(Cause value) {
        setCause(value);
        return this;
    }

    public SituationRecord withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    public SituationRecord withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    public SituationRecord withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    public SituationRecord withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    public SituationRecord withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    public SituationRecord withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    public SituationRecord withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    public SituationRecord withManagement(Management value) {
        setManagement(value);
        return this;
    }

    public SituationRecord withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    public SituationRecord withId(String value) {
        setId(value);
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
