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
 * <p>Java-Klasse für GeneralInstructionToRoadUsers complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GeneralInstructionToRoadUsers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="generalInstructionToRoadUsersType" type="{http://datex2.eu/schema/2_0RC1/2_0}GeneralInstructionToRoadUsersTypeEnum"/&gt;
 *         &lt;element name="generalInstructionToRoadUsersExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralInstructionToRoadUsers", propOrder = {
    "generalInstructionToRoadUsersType",
    "generalInstructionToRoadUsersExtension"
})
public class GeneralInstructionToRoadUsers
    extends NetworkManagement {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GeneralInstructionToRoadUsersTypeEnum generalInstructionToRoadUsersType;
    protected ExtensionType generalInstructionToRoadUsersExtension;

    /**
     * Ruft den Wert der generalInstructionToRoadUsersType-Eigenschaft ab.
     *
     * @return possible object is {@link GeneralInstructionToRoadUsersTypeEnum }
     */
    public GeneralInstructionToRoadUsersTypeEnum getGeneralInstructionToRoadUsersType() {
        return generalInstructionToRoadUsersType;
    }

    /**
     * Legt den Wert der generalInstructionToRoadUsersType-Eigenschaft fest.
     *
     * @param value allowed object is {@link GeneralInstructionToRoadUsersTypeEnum }
     */
    public void setGeneralInstructionToRoadUsersType(GeneralInstructionToRoadUsersTypeEnum value) {
        this.generalInstructionToRoadUsersType = value;
    }

    /**
     * Ruft den Wert der generalInstructionToRoadUsersExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getGeneralInstructionToRoadUsersExtension() {
        return generalInstructionToRoadUsersExtension;
    }

    /**
     * Legt den Wert der generalInstructionToRoadUsersExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setGeneralInstructionToRoadUsersExtension(ExtensionType value) {
        this.generalInstructionToRoadUsersExtension = value;
    }

    public GeneralInstructionToRoadUsers withGeneralInstructionToRoadUsersType(GeneralInstructionToRoadUsersTypeEnum value) {
        setGeneralInstructionToRoadUsersType(value);
        return this;
    }

    public GeneralInstructionToRoadUsers withGeneralInstructionToRoadUsersExtension(ExtensionType value) {
        setGeneralInstructionToRoadUsersExtension(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withComplianceOption(ComplianceOptionEnum value) {
        setComplianceOption(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withApplicableForTrafficDirection(DirectionEnum... values) {
        if (values != null) {
            for (DirectionEnum value : values) {
                getApplicableForTrafficDirection().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withApplicableForTrafficDirection(Collection<DirectionEnum> values) {
        if (values != null) {
            getApplicableForTrafficDirection().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withApplicableForTrafficType(TrafficTypeEnum... values) {
        if (values != null) {
            for (TrafficTypeEnum value : values) {
                getApplicableForTrafficType().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withApplicableForTrafficType(Collection<TrafficTypeEnum> values) {
        if (values != null) {
            getApplicableForTrafficType().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withPlacesAtWhichApplicable(PlacesEnum... values) {
        if (values != null) {
            for (PlacesEnum value : values) {
                getPlacesAtWhichApplicable().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withPlacesAtWhichApplicable(Collection<PlacesEnum> values) {
        if (values != null) {
            getPlacesAtWhichApplicable().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withAutomaticallyInitiated(Boolean value) {
        setAutomaticallyInitiated(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withForVehiclesWithCharacteristicsOf(VehicleCharacteristics... values) {
        if (values != null) {
            for (VehicleCharacteristics value : values) {
                getForVehiclesWithCharacteristicsOf().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withForVehiclesWithCharacteristicsOf(Collection<VehicleCharacteristics> values) {
        if (values != null) {
            getForVehiclesWithCharacteristicsOf().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withNetworkManagementExtension(ExtensionType value) {
        setNetworkManagementExtension(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withNonGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withNonGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withUrlLink(UrlLink... values) {
        if (values != null) {
            for (UrlLink value : values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withUrlLink(Collection<UrlLink> values) {
        if (values != null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public GeneralInstructionToRoadUsers withId(String value) {
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
