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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für NetworkManagement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}OperatorAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="complianceOption" type="{http://datex2.eu/schema/2_0RC1/2_0}ComplianceOptionEnum"/&gt;
 *         &lt;element name="applicableForTrafficDirection" type="{http://datex2.eu/schema/2_0RC1/2_0}DirectionEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="applicableForTrafficType" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="placesAtWhichApplicable" type="{http://datex2.eu/schema/2_0RC1/2_0}PlacesEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="automaticallyInitiated" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="forVehiclesWithCharacteristicsOf" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleCharacteristics" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="networkManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagement", propOrder = {
    "complianceOption",
    "applicableForTrafficDirection",
    "applicableForTrafficType",
    "placesAtWhichApplicable",
    "automaticallyInitiated",
    "forVehiclesWithCharacteristicsOf",
    "networkManagementExtension"
})
@XmlSeeAlso({
    GeneralInstructionToRoadUsers.class,
    GeneralNetworkManagement.class,
    ReroutingManagement.class,
    RoadOrCarriagewayOrLaneManagement.class,
    SpeedManagement.class,
    WinterDrivingManagement.class
})
public abstract class NetworkManagement
    extends OperatorAction
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ComplianceOptionEnum complianceOption;
    @XmlSchemaType(name = "string")
    protected List<DirectionEnum> applicableForTrafficDirection;
    @XmlSchemaType(name = "string")
    protected List<TrafficTypeEnum> applicableForTrafficType;
    @XmlSchemaType(name = "string")
    protected List<PlacesEnum> placesAtWhichApplicable;
    protected Boolean automaticallyInitiated;
    protected List<VehicleCharacteristics> forVehiclesWithCharacteristicsOf;
    protected ExtensionType networkManagementExtension;

    /**
     * Ruft den Wert der complianceOption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceOptionEnum }
     *     
     */
    public ComplianceOptionEnum getComplianceOption() {
        return complianceOption;
    }

    /**
     * Legt den Wert der complianceOption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceOptionEnum }
     *     
     */
    public void setComplianceOption(ComplianceOptionEnum value) {
        this.complianceOption = value;
    }

    /**
     * Gets the value of the applicableForTrafficDirection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the applicableForTrafficDirection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableForTrafficDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectionEnum }
     * 
     * 
     */
    public List<DirectionEnum> getApplicableForTrafficDirection() {
        if (applicableForTrafficDirection == null) {
            applicableForTrafficDirection = new ArrayList<DirectionEnum>();
        }
        return this.applicableForTrafficDirection;
    }

    /**
     * Gets the value of the applicableForTrafficType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the applicableForTrafficType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableForTrafficType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficTypeEnum }
     * 
     * 
     */
    public List<TrafficTypeEnum> getApplicableForTrafficType() {
        if (applicableForTrafficType == null) {
            applicableForTrafficType = new ArrayList<TrafficTypeEnum>();
        }
        return this.applicableForTrafficType;
    }

    /**
     * Gets the value of the placesAtWhichApplicable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the placesAtWhichApplicable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlacesAtWhichApplicable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlacesEnum }
     * 
     * 
     */
    public List<PlacesEnum> getPlacesAtWhichApplicable() {
        if (placesAtWhichApplicable == null) {
            placesAtWhichApplicable = new ArrayList<PlacesEnum>();
        }
        return this.placesAtWhichApplicable;
    }

    /**
     * Ruft den Wert der automaticallyInitiated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticallyInitiated() {
        return automaticallyInitiated;
    }

    /**
     * Legt den Wert der automaticallyInitiated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticallyInitiated(Boolean value) {
        this.automaticallyInitiated = value;
    }

    /**
     * Gets the value of the forVehiclesWithCharacteristicsOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the forVehiclesWithCharacteristicsOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForVehiclesWithCharacteristicsOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleCharacteristics }
     * 
     * 
     */
    public List<VehicleCharacteristics> getForVehiclesWithCharacteristicsOf() {
        if (forVehiclesWithCharacteristicsOf == null) {
            forVehiclesWithCharacteristicsOf = new ArrayList<VehicleCharacteristics>();
        }
        return this.forVehiclesWithCharacteristicsOf;
    }

    /**
     * Ruft den Wert der networkManagementExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNetworkManagementExtension() {
        return networkManagementExtension;
    }

    /**
     * Legt den Wert der networkManagementExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNetworkManagementExtension(ExtensionType value) {
        this.networkManagementExtension = value;
    }

    public NetworkManagement withComplianceOption(ComplianceOptionEnum value) {
        setComplianceOption(value);
        return this;
    }

    public NetworkManagement withApplicableForTrafficDirection(DirectionEnum... values) {
        if (values!= null) {
            for (DirectionEnum value: values) {
                getApplicableForTrafficDirection().add(value);
            }
        }
        return this;
    }

    public NetworkManagement withApplicableForTrafficDirection(Collection<DirectionEnum> values) {
        if (values!= null) {
            getApplicableForTrafficDirection().addAll(values);
        }
        return this;
    }

    public NetworkManagement withApplicableForTrafficType(TrafficTypeEnum... values) {
        if (values!= null) {
            for (TrafficTypeEnum value: values) {
                getApplicableForTrafficType().add(value);
            }
        }
        return this;
    }

    public NetworkManagement withApplicableForTrafficType(Collection<TrafficTypeEnum> values) {
        if (values!= null) {
            getApplicableForTrafficType().addAll(values);
        }
        return this;
    }

    public NetworkManagement withPlacesAtWhichApplicable(PlacesEnum... values) {
        if (values!= null) {
            for (PlacesEnum value: values) {
                getPlacesAtWhichApplicable().add(value);
            }
        }
        return this;
    }

    public NetworkManagement withPlacesAtWhichApplicable(Collection<PlacesEnum> values) {
        if (values!= null) {
            getPlacesAtWhichApplicable().addAll(values);
        }
        return this;
    }

    public NetworkManagement withAutomaticallyInitiated(Boolean value) {
        setAutomaticallyInitiated(value);
        return this;
    }

    public NetworkManagement withForVehiclesWithCharacteristicsOf(VehicleCharacteristics... values) {
        if (values!= null) {
            for (VehicleCharacteristics value: values) {
                getForVehiclesWithCharacteristicsOf().add(value);
            }
        }
        return this;
    }

    public NetworkManagement withForVehiclesWithCharacteristicsOf(Collection<VehicleCharacteristics> values) {
        if (values!= null) {
            getForVehiclesWithCharacteristicsOf().addAll(values);
        }
        return this;
    }

    public NetworkManagement withNetworkManagementExtension(ExtensionType value) {
        setNetworkManagementExtension(value);
        return this;
    }

    @Override
    public NetworkManagement withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    @Override
    public NetworkManagement withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    @Override
    public NetworkManagement withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public NetworkManagement withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public NetworkManagement withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public NetworkManagement withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public NetworkManagement withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public NetworkManagement withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public NetworkManagement withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public NetworkManagement withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public NetworkManagement withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public NetworkManagement withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public NetworkManagement withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public NetworkManagement withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public NetworkManagement withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public NetworkManagement withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public NetworkManagement withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public NetworkManagement withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public NetworkManagement withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public NetworkManagement withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public NetworkManagement withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public NetworkManagement withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public NetworkManagement withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public NetworkManagement withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public NetworkManagement withId(String value) {
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
