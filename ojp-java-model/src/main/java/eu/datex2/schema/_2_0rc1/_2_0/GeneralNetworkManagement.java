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
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.Collection;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für GeneralNetworkManagement complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GeneralNetworkManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="generalNetworkManagementType" type="{http://datex2.eu/schema/2_0RC1/2_0}GeneralNetworkManagementTypeEnum"/&gt;
 *         &lt;element name="trafficManuallyDirectedBy" type="{http://datex2.eu/schema/2_0RC1/2_0}PersonCategoryEnum" minOccurs="0"/&gt;
 *         &lt;element name="generalNetworkManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralNetworkManagement", propOrder = {
    "generalNetworkManagementType",
    "trafficManuallyDirectedBy",
    "generalNetworkManagementExtension"
})
public class GeneralNetworkManagement
    extends NetworkManagement {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GeneralNetworkManagementTypeEnum generalNetworkManagementType;
    @XmlSchemaType(name = "string")
    protected PersonCategoryEnum trafficManuallyDirectedBy;
    protected ExtensionType generalNetworkManagementExtension;

    /**
     * Ruft den Wert der generalNetworkManagementType-Eigenschaft ab.
     *
     * @return possible object is {@link GeneralNetworkManagementTypeEnum }
     */
    public GeneralNetworkManagementTypeEnum getGeneralNetworkManagementType() {
        return generalNetworkManagementType;
    }

    /**
     * Legt den Wert der generalNetworkManagementType-Eigenschaft fest.
     *
     * @param value allowed object is {@link GeneralNetworkManagementTypeEnum }
     */
    public void setGeneralNetworkManagementType(GeneralNetworkManagementTypeEnum value) {
        this.generalNetworkManagementType = value;
    }

    /**
     * Ruft den Wert der trafficManuallyDirectedBy-Eigenschaft ab.
     *
     * @return possible object is {@link PersonCategoryEnum }
     */
    public PersonCategoryEnum getTrafficManuallyDirectedBy() {
        return trafficManuallyDirectedBy;
    }

    /**
     * Legt den Wert der trafficManuallyDirectedBy-Eigenschaft fest.
     *
     * @param value allowed object is {@link PersonCategoryEnum }
     */
    public void setTrafficManuallyDirectedBy(PersonCategoryEnum value) {
        this.trafficManuallyDirectedBy = value;
    }

    /**
     * Ruft den Wert der generalNetworkManagementExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getGeneralNetworkManagementExtension() {
        return generalNetworkManagementExtension;
    }

    /**
     * Legt den Wert der generalNetworkManagementExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setGeneralNetworkManagementExtension(ExtensionType value) {
        this.generalNetworkManagementExtension = value;
    }

    public GeneralNetworkManagement withGeneralNetworkManagementType(GeneralNetworkManagementTypeEnum value) {
        setGeneralNetworkManagementType(value);
        return this;
    }

    public GeneralNetworkManagement withTrafficManuallyDirectedBy(PersonCategoryEnum value) {
        setTrafficManuallyDirectedBy(value);
        return this;
    }

    public GeneralNetworkManagement withGeneralNetworkManagementExtension(ExtensionType value) {
        setGeneralNetworkManagementExtension(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withComplianceOption(ComplianceOptionEnum value) {
        setComplianceOption(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withApplicableForTrafficDirection(DirectionEnum... values) {
        if (values != null) {
            for (DirectionEnum value : values) {
                getApplicableForTrafficDirection().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralNetworkManagement withApplicableForTrafficDirection(Collection<DirectionEnum> values) {
        if (values != null) {
            getApplicableForTrafficDirection().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralNetworkManagement withApplicableForTrafficType(TrafficTypeEnum... values) {
        if (values != null) {
            for (TrafficTypeEnum value : values) {
                getApplicableForTrafficType().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralNetworkManagement withApplicableForTrafficType(Collection<TrafficTypeEnum> values) {
        if (values != null) {
            getApplicableForTrafficType().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralNetworkManagement withPlacesAtWhichApplicable(PlacesEnum... values) {
        if (values != null) {
            for (PlacesEnum value : values) {
                getPlacesAtWhichApplicable().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralNetworkManagement withPlacesAtWhichApplicable(Collection<PlacesEnum> values) {
        if (values != null) {
            getPlacesAtWhichApplicable().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralNetworkManagement withAutomaticallyInitiated(Boolean value) {
        setAutomaticallyInitiated(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withForVehiclesWithCharacteristicsOf(VehicleCharacteristics... values) {
        if (values != null) {
            for (VehicleCharacteristics value : values) {
                getForVehiclesWithCharacteristicsOf().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralNetworkManagement withForVehiclesWithCharacteristicsOf(Collection<VehicleCharacteristics> values) {
        if (values != null) {
            getForVehiclesWithCharacteristicsOf().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralNetworkManagement withNetworkManagementExtension(ExtensionType value) {
        setNetworkManagementExtension(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralNetworkManagement withGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralNetworkManagement withNonGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralNetworkManagement withNonGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralNetworkManagement withUrlLink(UrlLink... values) {
        if (values != null) {
            for (UrlLink value : values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralNetworkManagement withUrlLink(Collection<UrlLink> values) {
        if (values != null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralNetworkManagement withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public GeneralNetworkManagement withId(String value) {
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
