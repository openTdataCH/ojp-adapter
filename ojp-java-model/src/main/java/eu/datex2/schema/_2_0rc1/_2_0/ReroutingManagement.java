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
 * <p>Java-Klasse für ReroutingManagement complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ReroutingManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reroutingManagementType" type="{http://datex2.eu/schema/2_0RC1/2_0}ReroutingManagementTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="reroutingItineraryDescription" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="signedRerouting" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="entry" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="exit" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="roadOrJunctionNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="alternativeRoute" type="{http://datex2.eu/schema/2_0RC1/2_0}Itinerary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reroutingManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReroutingManagement", propOrder = {
    "reroutingManagementType",
    "reroutingItineraryDescription",
    "signedRerouting",
    "entry",
    "exit",
    "roadOrJunctionNumber",
    "alternativeRoute",
    "reroutingManagementExtension"
})
public class ReroutingManagement
    extends NetworkManagement {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<ReroutingManagementTypeEnum> reroutingManagementType;
    protected MultilingualString reroutingItineraryDescription;
    protected Boolean signedRerouting;
    protected String entry;
    protected String exit;
    protected String roadOrJunctionNumber;
    protected List<Itinerary> alternativeRoute;
    protected ExtensionType reroutingManagementExtension;

    /**
     * Gets the value of the reroutingManagementType property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the reroutingManagementType property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReroutingManagementType().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ReroutingManagementTypeEnum }
     */
    public List<ReroutingManagementTypeEnum> getReroutingManagementType() {
        if (reroutingManagementType == null) {
            reroutingManagementType = new ArrayList<ReroutingManagementTypeEnum>();
        }
        return this.reroutingManagementType;
    }

    /**
     * Ruft den Wert der reroutingItineraryDescription-Eigenschaft ab.
     *
     * @return possible object is {@link MultilingualString }
     */
    public MultilingualString getReroutingItineraryDescription() {
        return reroutingItineraryDescription;
    }

    /**
     * Legt den Wert der reroutingItineraryDescription-Eigenschaft fest.
     *
     * @param value allowed object is {@link MultilingualString }
     */
    public void setReroutingItineraryDescription(MultilingualString value) {
        this.reroutingItineraryDescription = value;
    }

    /**
     * Ruft den Wert der signedRerouting-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isSignedRerouting() {
        return signedRerouting;
    }

    /**
     * Legt den Wert der signedRerouting-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setSignedRerouting(Boolean value) {
        this.signedRerouting = value;
    }

    /**
     * Ruft den Wert der entry-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getEntry() {
        return entry;
    }

    /**
     * Legt den Wert der entry-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setEntry(String value) {
        this.entry = value;
    }

    /**
     * Ruft den Wert der exit-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getExit() {
        return exit;
    }

    /**
     * Legt den Wert der exit-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setExit(String value) {
        this.exit = value;
    }

    /**
     * Ruft den Wert der roadOrJunctionNumber-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getRoadOrJunctionNumber() {
        return roadOrJunctionNumber;
    }

    /**
     * Legt den Wert der roadOrJunctionNumber-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setRoadOrJunctionNumber(String value) {
        this.roadOrJunctionNumber = value;
    }

    /**
     * Gets the value of the alternativeRoute property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the alternativeRoute property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeRoute().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Itinerary }
     */
    public List<Itinerary> getAlternativeRoute() {
        if (alternativeRoute == null) {
            alternativeRoute = new ArrayList<Itinerary>();
        }
        return this.alternativeRoute;
    }

    /**
     * Ruft den Wert der reroutingManagementExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getReroutingManagementExtension() {
        return reroutingManagementExtension;
    }

    /**
     * Legt den Wert der reroutingManagementExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setReroutingManagementExtension(ExtensionType value) {
        this.reroutingManagementExtension = value;
    }

    public ReroutingManagement withReroutingManagementType(ReroutingManagementTypeEnum... values) {
        if (values != null) {
            for (ReroutingManagementTypeEnum value : values) {
                getReroutingManagementType().add(value);
            }
        }
        return this;
    }

    public ReroutingManagement withReroutingManagementType(Collection<ReroutingManagementTypeEnum> values) {
        if (values != null) {
            getReroutingManagementType().addAll(values);
        }
        return this;
    }

    public ReroutingManagement withReroutingItineraryDescription(MultilingualString value) {
        setReroutingItineraryDescription(value);
        return this;
    }

    public ReroutingManagement withSignedRerouting(Boolean value) {
        setSignedRerouting(value);
        return this;
    }

    public ReroutingManagement withEntry(String value) {
        setEntry(value);
        return this;
    }

    public ReroutingManagement withExit(String value) {
        setExit(value);
        return this;
    }

    public ReroutingManagement withRoadOrJunctionNumber(String value) {
        setRoadOrJunctionNumber(value);
        return this;
    }

    public ReroutingManagement withAlternativeRoute(Itinerary... values) {
        if (values != null) {
            for (Itinerary value : values) {
                getAlternativeRoute().add(value);
            }
        }
        return this;
    }

    public ReroutingManagement withAlternativeRoute(Collection<Itinerary> values) {
        if (values != null) {
            getAlternativeRoute().addAll(values);
        }
        return this;
    }

    public ReroutingManagement withReroutingManagementExtension(ExtensionType value) {
        setReroutingManagementExtension(value);
        return this;
    }

    @Override
    public ReroutingManagement withComplianceOption(ComplianceOptionEnum value) {
        setComplianceOption(value);
        return this;
    }

    @Override
    public ReroutingManagement withApplicableForTrafficDirection(DirectionEnum... values) {
        if (values != null) {
            for (DirectionEnum value : values) {
                getApplicableForTrafficDirection().add(value);
            }
        }
        return this;
    }

    @Override
    public ReroutingManagement withApplicableForTrafficDirection(Collection<DirectionEnum> values) {
        if (values != null) {
            getApplicableForTrafficDirection().addAll(values);
        }
        return this;
    }

    @Override
    public ReroutingManagement withApplicableForTrafficType(TrafficTypeEnum... values) {
        if (values != null) {
            for (TrafficTypeEnum value : values) {
                getApplicableForTrafficType().add(value);
            }
        }
        return this;
    }

    @Override
    public ReroutingManagement withApplicableForTrafficType(Collection<TrafficTypeEnum> values) {
        if (values != null) {
            getApplicableForTrafficType().addAll(values);
        }
        return this;
    }

    @Override
    public ReroutingManagement withPlacesAtWhichApplicable(PlacesEnum... values) {
        if (values != null) {
            for (PlacesEnum value : values) {
                getPlacesAtWhichApplicable().add(value);
            }
        }
        return this;
    }

    @Override
    public ReroutingManagement withPlacesAtWhichApplicable(Collection<PlacesEnum> values) {
        if (values != null) {
            getPlacesAtWhichApplicable().addAll(values);
        }
        return this;
    }

    @Override
    public ReroutingManagement withAutomaticallyInitiated(Boolean value) {
        setAutomaticallyInitiated(value);
        return this;
    }

    @Override
    public ReroutingManagement withForVehiclesWithCharacteristicsOf(VehicleCharacteristics... values) {
        if (values != null) {
            for (VehicleCharacteristics value : values) {
                getForVehiclesWithCharacteristicsOf().add(value);
            }
        }
        return this;
    }

    @Override
    public ReroutingManagement withForVehiclesWithCharacteristicsOf(Collection<VehicleCharacteristics> values) {
        if (values != null) {
            getForVehiclesWithCharacteristicsOf().addAll(values);
        }
        return this;
    }

    @Override
    public ReroutingManagement withNetworkManagementExtension(ExtensionType value) {
        setNetworkManagementExtension(value);
        return this;
    }

    @Override
    public ReroutingManagement withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    @Override
    public ReroutingManagement withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    @Override
    public ReroutingManagement withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public ReroutingManagement withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public ReroutingManagement withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public ReroutingManagement withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public ReroutingManagement withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public ReroutingManagement withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public ReroutingManagement withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public ReroutingManagement withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public ReroutingManagement withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public ReroutingManagement withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public ReroutingManagement withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public ReroutingManagement withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public ReroutingManagement withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public ReroutingManagement withGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public ReroutingManagement withGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public ReroutingManagement withNonGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public ReroutingManagement withNonGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public ReroutingManagement withUrlLink(UrlLink... values) {
        if (values != null) {
            for (UrlLink value : values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public ReroutingManagement withUrlLink(Collection<UrlLink> values) {
        if (values != null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public ReroutingManagement withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public ReroutingManagement withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public ReroutingManagement withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public ReroutingManagement withId(String value) {
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
