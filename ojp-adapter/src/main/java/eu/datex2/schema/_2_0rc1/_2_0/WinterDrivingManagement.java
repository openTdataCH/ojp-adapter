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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für WinterDrivingManagement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WinterDrivingManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="winterEquipmentManagementType" type="{http://datex2.eu/schema/2_0RC1/2_0}WinterEquipmentManagementTypeEnum"/&gt;
 *         &lt;element name="winterDrivingManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WinterDrivingManagement", propOrder = {
    "winterEquipmentManagementType",
    "winterDrivingManagementExtension"
})
public class WinterDrivingManagement
    extends NetworkManagement
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected WinterEquipmentManagementTypeEnum winterEquipmentManagementType;
    protected ExtensionType winterDrivingManagementExtension;

    /**
     * Ruft den Wert der winterEquipmentManagementType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WinterEquipmentManagementTypeEnum }
     *     
     */
    public WinterEquipmentManagementTypeEnum getWinterEquipmentManagementType() {
        return winterEquipmentManagementType;
    }

    /**
     * Legt den Wert der winterEquipmentManagementType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WinterEquipmentManagementTypeEnum }
     *     
     */
    public void setWinterEquipmentManagementType(WinterEquipmentManagementTypeEnum value) {
        this.winterEquipmentManagementType = value;
    }

    /**
     * Ruft den Wert der winterDrivingManagementExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWinterDrivingManagementExtension() {
        return winterDrivingManagementExtension;
    }

    /**
     * Legt den Wert der winterDrivingManagementExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWinterDrivingManagementExtension(ExtensionType value) {
        this.winterDrivingManagementExtension = value;
    }

    public WinterDrivingManagement withWinterEquipmentManagementType(WinterEquipmentManagementTypeEnum value) {
        setWinterEquipmentManagementType(value);
        return this;
    }

    public WinterDrivingManagement withWinterDrivingManagementExtension(ExtensionType value) {
        setWinterDrivingManagementExtension(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withComplianceOption(ComplianceOptionEnum value) {
        setComplianceOption(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withApplicableForTrafficDirection(DirectionEnum... values) {
        if (values!= null) {
            for (DirectionEnum value: values) {
                getApplicableForTrafficDirection().add(value);
            }
        }
        return this;
    }

    @Override
    public WinterDrivingManagement withApplicableForTrafficDirection(Collection<DirectionEnum> values) {
        if (values!= null) {
            getApplicableForTrafficDirection().addAll(values);
        }
        return this;
    }

    @Override
    public WinterDrivingManagement withApplicableForTrafficType(TrafficTypeEnum... values) {
        if (values!= null) {
            for (TrafficTypeEnum value: values) {
                getApplicableForTrafficType().add(value);
            }
        }
        return this;
    }

    @Override
    public WinterDrivingManagement withApplicableForTrafficType(Collection<TrafficTypeEnum> values) {
        if (values!= null) {
            getApplicableForTrafficType().addAll(values);
        }
        return this;
    }

    @Override
    public WinterDrivingManagement withPlacesAtWhichApplicable(PlacesEnum... values) {
        if (values!= null) {
            for (PlacesEnum value: values) {
                getPlacesAtWhichApplicable().add(value);
            }
        }
        return this;
    }

    @Override
    public WinterDrivingManagement withPlacesAtWhichApplicable(Collection<PlacesEnum> values) {
        if (values!= null) {
            getPlacesAtWhichApplicable().addAll(values);
        }
        return this;
    }

    @Override
    public WinterDrivingManagement withAutomaticallyInitiated(Boolean value) {
        setAutomaticallyInitiated(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withForVehiclesWithCharacteristicsOf(VehicleCharacteristics... values) {
        if (values!= null) {
            for (VehicleCharacteristics value: values) {
                getForVehiclesWithCharacteristicsOf().add(value);
            }
        }
        return this;
    }

    @Override
    public WinterDrivingManagement withForVehiclesWithCharacteristicsOf(Collection<VehicleCharacteristics> values) {
        if (values!= null) {
            getForVehiclesWithCharacteristicsOf().addAll(values);
        }
        return this;
    }

    @Override
    public WinterDrivingManagement withNetworkManagementExtension(ExtensionType value) {
        setNetworkManagementExtension(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public WinterDrivingManagement withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public WinterDrivingManagement withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public WinterDrivingManagement withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public WinterDrivingManagement withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public WinterDrivingManagement withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public WinterDrivingManagement withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public WinterDrivingManagement withId(String value) {
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
