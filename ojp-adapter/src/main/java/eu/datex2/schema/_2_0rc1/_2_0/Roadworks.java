//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für Roadworks complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Roadworks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}OperatorAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadworksDuration" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadworksDurationEnum" minOccurs="0"/&gt;
 *         &lt;element name="roadworksScale" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadworksScaleEnum" minOccurs="0"/&gt;
 *         &lt;element name="underTraffic" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="urgentRoadworks" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="mobility" type="{http://datex2.eu/schema/2_0RC1/2_0}Mobility" minOccurs="0"/&gt;
 *         &lt;element name="subjects" type="{http://datex2.eu/schema/2_0RC1/2_0}Subjects" minOccurs="0"/&gt;
 *         &lt;element name="maintenanceVehicles" type="{http://datex2.eu/schema/2_0RC1/2_0}MaintenanceVehicles" minOccurs="0"/&gt;
 *         &lt;element name="roadworksExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Roadworks", propOrder = {
    "roadworksDuration",
    "roadworksScale",
    "underTraffic",
    "urgentRoadworks",
    "mobility",
    "subjects",
    "maintenanceVehicles",
    "roadworksExtension"
})
@XmlSeeAlso({
    ConstructionWorks.class,
    MaintenanceWorks.class
})
public abstract class Roadworks
    extends OperatorAction
{

    @XmlSchemaType(name = "string")
    protected RoadworksDurationEnum roadworksDuration;
    @XmlSchemaType(name = "string")
    protected RoadworksScaleEnum roadworksScale;
    protected Boolean underTraffic;
    protected Boolean urgentRoadworks;
    protected Mobility mobility;
    protected Subjects subjects;
    protected MaintenanceVehicles maintenanceVehicles;
    protected ExtensionType roadworksExtension;

    /**
     * Ruft den Wert der roadworksDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoadworksDurationEnum }
     *     
     */
    public RoadworksDurationEnum getRoadworksDuration() {
        return roadworksDuration;
    }

    /**
     * Legt den Wert der roadworksDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadworksDurationEnum }
     *     
     */
    public void setRoadworksDuration(RoadworksDurationEnum value) {
        this.roadworksDuration = value;
    }

    /**
     * Ruft den Wert der roadworksScale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoadworksScaleEnum }
     *     
     */
    public RoadworksScaleEnum getRoadworksScale() {
        return roadworksScale;
    }

    /**
     * Legt den Wert der roadworksScale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadworksScaleEnum }
     *     
     */
    public void setRoadworksScale(RoadworksScaleEnum value) {
        this.roadworksScale = value;
    }

    /**
     * Ruft den Wert der underTraffic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnderTraffic() {
        return underTraffic;
    }

    /**
     * Legt den Wert der underTraffic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnderTraffic(Boolean value) {
        this.underTraffic = value;
    }

    /**
     * Ruft den Wert der urgentRoadworks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrgentRoadworks() {
        return urgentRoadworks;
    }

    /**
     * Legt den Wert der urgentRoadworks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrgentRoadworks(Boolean value) {
        this.urgentRoadworks = value;
    }

    /**
     * Ruft den Wert der mobility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Mobility }
     *     
     */
    public Mobility getMobility() {
        return mobility;
    }

    /**
     * Legt den Wert der mobility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Mobility }
     *     
     */
    public void setMobility(Mobility value) {
        this.mobility = value;
    }

    /**
     * Ruft den Wert der subjects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Subjects }
     *     
     */
    public Subjects getSubjects() {
        return subjects;
    }

    /**
     * Legt den Wert der subjects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Subjects }
     *     
     */
    public void setSubjects(Subjects value) {
        this.subjects = value;
    }

    /**
     * Ruft den Wert der maintenanceVehicles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceVehicles }
     *     
     */
    public MaintenanceVehicles getMaintenanceVehicles() {
        return maintenanceVehicles;
    }

    /**
     * Legt den Wert der maintenanceVehicles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceVehicles }
     *     
     */
    public void setMaintenanceVehicles(MaintenanceVehicles value) {
        this.maintenanceVehicles = value;
    }

    /**
     * Ruft den Wert der roadworksExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadworksExtension() {
        return roadworksExtension;
    }

    /**
     * Legt den Wert der roadworksExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadworksExtension(ExtensionType value) {
        this.roadworksExtension = value;
    }

    public Roadworks withRoadworksDuration(RoadworksDurationEnum value) {
        setRoadworksDuration(value);
        return this;
    }

    public Roadworks withRoadworksScale(RoadworksScaleEnum value) {
        setRoadworksScale(value);
        return this;
    }

    public Roadworks withUnderTraffic(Boolean value) {
        setUnderTraffic(value);
        return this;
    }

    public Roadworks withUrgentRoadworks(Boolean value) {
        setUrgentRoadworks(value);
        return this;
    }

    public Roadworks withMobility(Mobility value) {
        setMobility(value);
        return this;
    }

    public Roadworks withSubjects(Subjects value) {
        setSubjects(value);
        return this;
    }

    public Roadworks withMaintenanceVehicles(MaintenanceVehicles value) {
        setMaintenanceVehicles(value);
        return this;
    }

    public Roadworks withRoadworksExtension(ExtensionType value) {
        setRoadworksExtension(value);
        return this;
    }

    @Override
    public Roadworks withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    @Override
    public Roadworks withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    @Override
    public Roadworks withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public Roadworks withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public Roadworks withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public Roadworks withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public Roadworks withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public Roadworks withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public Roadworks withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public Roadworks withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public Roadworks withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public Roadworks withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public Roadworks withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public Roadworks withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public Roadworks withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public Roadworks withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public Roadworks withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public Roadworks withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public Roadworks withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public Roadworks withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public Roadworks withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public Roadworks withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public Roadworks withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public Roadworks withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public Roadworks withId(String value) {
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
