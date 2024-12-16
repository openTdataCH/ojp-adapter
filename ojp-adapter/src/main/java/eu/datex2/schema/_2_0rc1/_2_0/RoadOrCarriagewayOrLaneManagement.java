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
 * <p>Java-Klasse für RoadOrCarriagewayOrLaneManagement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoadOrCarriagewayOrLaneManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadOrCarriagewayOrLaneManagementType" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadOrCarriagewayOrLaneManagementTypeEnum"/&gt;
 *         &lt;element name="minimumCarOccupancy" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="specifiedCarriageway" type="{http://datex2.eu/schema/2_0RC1/2_0}CarriagewayEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="specifiedLane" type="{http://datex2.eu/schema/2_0RC1/2_0}LaneEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="roadOrCarriagewayOrLaneManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadOrCarriagewayOrLaneManagement", propOrder = {
    "roadOrCarriagewayOrLaneManagementType",
    "minimumCarOccupancy",
    "specifiedCarriageway",
    "specifiedLane",
    "roadOrCarriagewayOrLaneManagementExtension"
})
public class RoadOrCarriagewayOrLaneManagement
    extends NetworkManagement
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RoadOrCarriagewayOrLaneManagementTypeEnum roadOrCarriagewayOrLaneManagementType;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumCarOccupancy;
    @XmlSchemaType(name = "string")
    protected List<CarriagewayEnum> specifiedCarriageway;
    @XmlSchemaType(name = "string")
    protected List<LaneEnum> specifiedLane;
    protected ExtensionType roadOrCarriagewayOrLaneManagementExtension;

    /**
     * Ruft den Wert der roadOrCarriagewayOrLaneManagementType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoadOrCarriagewayOrLaneManagementTypeEnum }
     *     
     */
    public RoadOrCarriagewayOrLaneManagementTypeEnum getRoadOrCarriagewayOrLaneManagementType() {
        return roadOrCarriagewayOrLaneManagementType;
    }

    /**
     * Legt den Wert der roadOrCarriagewayOrLaneManagementType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadOrCarriagewayOrLaneManagementTypeEnum }
     *     
     */
    public void setRoadOrCarriagewayOrLaneManagementType(RoadOrCarriagewayOrLaneManagementTypeEnum value) {
        this.roadOrCarriagewayOrLaneManagementType = value;
    }

    /**
     * Ruft den Wert der minimumCarOccupancy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumCarOccupancy() {
        return minimumCarOccupancy;
    }

    /**
     * Legt den Wert der minimumCarOccupancy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumCarOccupancy(BigInteger value) {
        this.minimumCarOccupancy = value;
    }

    /**
     * Gets the value of the specifiedCarriageway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedCarriageway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedCarriageway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarriagewayEnum }
     * 
     * 
     */
    public List<CarriagewayEnum> getSpecifiedCarriageway() {
        if (specifiedCarriageway == null) {
            specifiedCarriageway = new ArrayList<CarriagewayEnum>();
        }
        return this.specifiedCarriageway;
    }

    /**
     * Gets the value of the specifiedLane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedLane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedLane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaneEnum }
     * 
     * 
     */
    public List<LaneEnum> getSpecifiedLane() {
        if (specifiedLane == null) {
            specifiedLane = new ArrayList<LaneEnum>();
        }
        return this.specifiedLane;
    }

    /**
     * Ruft den Wert der roadOrCarriagewayOrLaneManagementExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadOrCarriagewayOrLaneManagementExtension() {
        return roadOrCarriagewayOrLaneManagementExtension;
    }

    /**
     * Legt den Wert der roadOrCarriagewayOrLaneManagementExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadOrCarriagewayOrLaneManagementExtension(ExtensionType value) {
        this.roadOrCarriagewayOrLaneManagementExtension = value;
    }

    public RoadOrCarriagewayOrLaneManagement withRoadOrCarriagewayOrLaneManagementType(RoadOrCarriagewayOrLaneManagementTypeEnum value) {
        setRoadOrCarriagewayOrLaneManagementType(value);
        return this;
    }

    public RoadOrCarriagewayOrLaneManagement withMinimumCarOccupancy(BigInteger value) {
        setMinimumCarOccupancy(value);
        return this;
    }

    public RoadOrCarriagewayOrLaneManagement withSpecifiedCarriageway(CarriagewayEnum... values) {
        if (values!= null) {
            for (CarriagewayEnum value: values) {
                getSpecifiedCarriageway().add(value);
            }
        }
        return this;
    }

    public RoadOrCarriagewayOrLaneManagement withSpecifiedCarriageway(Collection<CarriagewayEnum> values) {
        if (values!= null) {
            getSpecifiedCarriageway().addAll(values);
        }
        return this;
    }

    public RoadOrCarriagewayOrLaneManagement withSpecifiedLane(LaneEnum... values) {
        if (values!= null) {
            for (LaneEnum value: values) {
                getSpecifiedLane().add(value);
            }
        }
        return this;
    }

    public RoadOrCarriagewayOrLaneManagement withSpecifiedLane(Collection<LaneEnum> values) {
        if (values!= null) {
            getSpecifiedLane().addAll(values);
        }
        return this;
    }

    public RoadOrCarriagewayOrLaneManagement withRoadOrCarriagewayOrLaneManagementExtension(ExtensionType value) {
        setRoadOrCarriagewayOrLaneManagementExtension(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withComplianceOption(ComplianceOptionEnum value) {
        setComplianceOption(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withApplicableForTrafficDirection(DirectionEnum... values) {
        if (values!= null) {
            for (DirectionEnum value: values) {
                getApplicableForTrafficDirection().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withApplicableForTrafficDirection(Collection<DirectionEnum> values) {
        if (values!= null) {
            getApplicableForTrafficDirection().addAll(values);
        }
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withApplicableForTrafficType(TrafficTypeEnum... values) {
        if (values!= null) {
            for (TrafficTypeEnum value: values) {
                getApplicableForTrafficType().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withApplicableForTrafficType(Collection<TrafficTypeEnum> values) {
        if (values!= null) {
            getApplicableForTrafficType().addAll(values);
        }
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withPlacesAtWhichApplicable(PlacesEnum... values) {
        if (values!= null) {
            for (PlacesEnum value: values) {
                getPlacesAtWhichApplicable().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withPlacesAtWhichApplicable(Collection<PlacesEnum> values) {
        if (values!= null) {
            getPlacesAtWhichApplicable().addAll(values);
        }
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withAutomaticallyInitiated(Boolean value) {
        setAutomaticallyInitiated(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withForVehiclesWithCharacteristicsOf(VehicleCharacteristics... values) {
        if (values!= null) {
            for (VehicleCharacteristics value: values) {
                getForVehiclesWithCharacteristicsOf().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withForVehiclesWithCharacteristicsOf(Collection<VehicleCharacteristics> values) {
        if (values!= null) {
            getForVehiclesWithCharacteristicsOf().addAll(values);
        }
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withNetworkManagementExtension(ExtensionType value) {
        setNetworkManagementExtension(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public RoadOrCarriagewayOrLaneManagement withId(String value) {
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
