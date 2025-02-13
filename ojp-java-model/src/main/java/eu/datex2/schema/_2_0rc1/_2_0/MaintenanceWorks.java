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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für MaintenanceWorks complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="MaintenanceWorks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Roadworks"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadMaintenanceType" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadMaintenanceTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="maintenanceWorksExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceWorks", propOrder = {
    "roadMaintenanceType",
    "maintenanceWorksExtension"
})
public class MaintenanceWorks
    extends Roadworks {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<RoadMaintenanceTypeEnum> roadMaintenanceType;
    protected ExtensionType maintenanceWorksExtension;

    /**
     * Gets the value of the roadMaintenanceType property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the roadMaintenanceType property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadMaintenanceType().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link RoadMaintenanceTypeEnum }
     */
    public List<RoadMaintenanceTypeEnum> getRoadMaintenanceType() {
        if (roadMaintenanceType == null) {
            roadMaintenanceType = new ArrayList<RoadMaintenanceTypeEnum>();
        }
        return this.roadMaintenanceType;
    }

    /**
     * Ruft den Wert der maintenanceWorksExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getMaintenanceWorksExtension() {
        return maintenanceWorksExtension;
    }

    /**
     * Legt den Wert der maintenanceWorksExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setMaintenanceWorksExtension(ExtensionType value) {
        this.maintenanceWorksExtension = value;
    }

    public MaintenanceWorks withRoadMaintenanceType(RoadMaintenanceTypeEnum... values) {
        if (values != null) {
            for (RoadMaintenanceTypeEnum value : values) {
                getRoadMaintenanceType().add(value);
            }
        }
        return this;
    }

    public MaintenanceWorks withRoadMaintenanceType(Collection<RoadMaintenanceTypeEnum> values) {
        if (values != null) {
            getRoadMaintenanceType().addAll(values);
        }
        return this;
    }

    public MaintenanceWorks withMaintenanceWorksExtension(ExtensionType value) {
        setMaintenanceWorksExtension(value);
        return this;
    }

    @Override
    public MaintenanceWorks withRoadworksDuration(RoadworksDurationEnum value) {
        setRoadworksDuration(value);
        return this;
    }

    @Override
    public MaintenanceWorks withRoadworksScale(RoadworksScaleEnum value) {
        setRoadworksScale(value);
        return this;
    }

    @Override
    public MaintenanceWorks withUnderTraffic(Boolean value) {
        setUnderTraffic(value);
        return this;
    }

    @Override
    public MaintenanceWorks withUrgentRoadworks(Boolean value) {
        setUrgentRoadworks(value);
        return this;
    }

    @Override
    public MaintenanceWorks withMobility(Mobility value) {
        setMobility(value);
        return this;
    }

    @Override
    public MaintenanceWorks withSubjects(Subjects value) {
        setSubjects(value);
        return this;
    }

    @Override
    public MaintenanceWorks withMaintenanceVehicles(MaintenanceVehicles value) {
        setMaintenanceVehicles(value);
        return this;
    }

    @Override
    public MaintenanceWorks withRoadworksExtension(ExtensionType value) {
        setRoadworksExtension(value);
        return this;
    }

    @Override
    public MaintenanceWorks withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    @Override
    public MaintenanceWorks withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    @Override
    public MaintenanceWorks withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public MaintenanceWorks withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public MaintenanceWorks withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public MaintenanceWorks withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public MaintenanceWorks withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public MaintenanceWorks withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public MaintenanceWorks withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public MaintenanceWorks withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public MaintenanceWorks withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public MaintenanceWorks withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public MaintenanceWorks withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public MaintenanceWorks withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public MaintenanceWorks withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public MaintenanceWorks withGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public MaintenanceWorks withGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public MaintenanceWorks withNonGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public MaintenanceWorks withNonGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public MaintenanceWorks withUrlLink(UrlLink... values) {
        if (values != null) {
            for (UrlLink value : values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public MaintenanceWorks withUrlLink(Collection<UrlLink> values) {
        if (values != null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public MaintenanceWorks withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public MaintenanceWorks withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public MaintenanceWorks withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public MaintenanceWorks withId(String value) {
        setId(value);
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
