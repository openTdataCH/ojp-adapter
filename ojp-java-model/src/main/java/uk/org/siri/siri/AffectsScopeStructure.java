//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import eu.datex2.schema._2_0rc1._2_0.AreaOfInterestEnum;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.ifopt.AccessModesEnumeration;

/**
 * Type for Location model for scope of SITUATION or effect.
 *
 * <p>Java-Klasse für AffectsScopeStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AffectsScopeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AreaOfInterest" type="{http://datex2.eu/schema/2_0RC1/2_0}AreaOfInterestEnum" minOccurs="0"/&gt;
 *         &lt;element name="Operators" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="AllOperators" type="{http://www.siri.org.uk/siri}EmptyType"/&gt;
 *                   &lt;element name="AffectedOperator" type="{http://www.siri.org.uk/siri}AffectedOperatorStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Networks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedNetwork" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.siri.org.uk/siri}AffectedNetworkStructure"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StopPoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedStopPoint" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StopPlaces" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedStopPlace" type="{http://www.siri.org.uk/siri}AffectedStopPlaceStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Places" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedPlace" type="{http://www.siri.org.uk/siri}AffectedPlaceStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VehicleJourneys" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedVehicleJourney" type="{http://www.siri.org.uk/siri}AffectedVehicleJourneyStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Vehicles" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedVehicle" type="{http://www.siri.org.uk/siri}AffectedVehicleStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Roads" type="{http://www.siri.org.uk/siri}AffectedRoadsStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectsScopeStructure", propOrder = {
    "areaOfInterest",
    "operators",
    "networks",
    "stopPoints",
    "stopPlaces",
    "places",
    "vehicleJourneys",
    "vehicles",
    "roads",
    "extensions"
})
public class AffectsScopeStructure {

    @XmlElement(name = "AreaOfInterest")
    @XmlSchemaType(name = "string")
    protected AreaOfInterestEnum areaOfInterest;
    @XmlElement(name = "Operators")
    protected AffectsScopeStructure.Operators operators;
    @XmlElement(name = "Networks")
    protected AffectsScopeStructure.Networks networks;
    @XmlElement(name = "StopPoints")
    protected AffectsScopeStructure.StopPoints stopPoints;
    @XmlElement(name = "StopPlaces")
    protected AffectsScopeStructure.StopPlaces stopPlaces;
    @XmlElement(name = "Places")
    protected AffectsScopeStructure.Places places;
    @XmlElement(name = "VehicleJourneys")
    protected AffectsScopeStructure.VehicleJourneys vehicleJourneys;
    @XmlElement(name = "Vehicles")
    protected AffectsScopeStructure.Vehicles vehicles;
    @XmlElement(name = "Roads")
    protected AffectedRoadsStructure roads;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der areaOfInterest-Eigenschaft ab.
     *
     * @return possible object is {@link AreaOfInterestEnum }
     */
    public AreaOfInterestEnum getAreaOfInterest() {
        return areaOfInterest;
    }

    /**
     * Legt den Wert der areaOfInterest-Eigenschaft fest.
     *
     * @param value allowed object is {@link AreaOfInterestEnum }
     */
    public void setAreaOfInterest(AreaOfInterestEnum value) {
        this.areaOfInterest = value;
    }

    /**
     * Ruft den Wert der operators-Eigenschaft ab.
     *
     * @return possible object is {@link AffectsScopeStructure.Operators }
     */
    public AffectsScopeStructure.Operators getOperators() {
        return operators;
    }

    /**
     * Legt den Wert der operators-Eigenschaft fest.
     *
     * @param value allowed object is {@link AffectsScopeStructure.Operators }
     */
    public void setOperators(AffectsScopeStructure.Operators value) {
        this.operators = value;
    }

    /**
     * Ruft den Wert der networks-Eigenschaft ab.
     *
     * @return possible object is {@link AffectsScopeStructure.Networks }
     */
    public AffectsScopeStructure.Networks getNetworks() {
        return networks;
    }

    /**
     * Legt den Wert der networks-Eigenschaft fest.
     *
     * @param value allowed object is {@link AffectsScopeStructure.Networks }
     */
    public void setNetworks(AffectsScopeStructure.Networks value) {
        this.networks = value;
    }

    /**
     * Ruft den Wert der stopPoints-Eigenschaft ab.
     *
     * @return possible object is {@link AffectsScopeStructure.StopPoints }
     */
    public AffectsScopeStructure.StopPoints getStopPoints() {
        return stopPoints;
    }

    /**
     * Legt den Wert der stopPoints-Eigenschaft fest.
     *
     * @param value allowed object is {@link AffectsScopeStructure.StopPoints }
     */
    public void setStopPoints(AffectsScopeStructure.StopPoints value) {
        this.stopPoints = value;
    }

    /**
     * Ruft den Wert der stopPlaces-Eigenschaft ab.
     *
     * @return possible object is {@link AffectsScopeStructure.StopPlaces }
     */
    public AffectsScopeStructure.StopPlaces getStopPlaces() {
        return stopPlaces;
    }

    /**
     * Legt den Wert der stopPlaces-Eigenschaft fest.
     *
     * @param value allowed object is {@link AffectsScopeStructure.StopPlaces }
     */
    public void setStopPlaces(AffectsScopeStructure.StopPlaces value) {
        this.stopPlaces = value;
    }

    /**
     * Ruft den Wert der places-Eigenschaft ab.
     *
     * @return possible object is {@link AffectsScopeStructure.Places }
     */
    public AffectsScopeStructure.Places getPlaces() {
        return places;
    }

    /**
     * Legt den Wert der places-Eigenschaft fest.
     *
     * @param value allowed object is {@link AffectsScopeStructure.Places }
     */
    public void setPlaces(AffectsScopeStructure.Places value) {
        this.places = value;
    }

    /**
     * Ruft den Wert der vehicleJourneys-Eigenschaft ab.
     *
     * @return possible object is {@link AffectsScopeStructure.VehicleJourneys }
     */
    public AffectsScopeStructure.VehicleJourneys getVehicleJourneys() {
        return vehicleJourneys;
    }

    /**
     * Legt den Wert der vehicleJourneys-Eigenschaft fest.
     *
     * @param value allowed object is {@link AffectsScopeStructure.VehicleJourneys }
     */
    public void setVehicleJourneys(AffectsScopeStructure.VehicleJourneys value) {
        this.vehicleJourneys = value;
    }

    /**
     * Ruft den Wert der vehicles-Eigenschaft ab.
     *
     * @return possible object is {@link AffectsScopeStructure.Vehicles }
     */
    public AffectsScopeStructure.Vehicles getVehicles() {
        return vehicles;
    }

    /**
     * Legt den Wert der vehicles-Eigenschaft fest.
     *
     * @param value allowed object is {@link AffectsScopeStructure.Vehicles }
     */
    public void setVehicles(AffectsScopeStructure.Vehicles value) {
        this.vehicles = value;
    }

    /**
     * Ruft den Wert der roads-Eigenschaft ab.
     *
     * @return possible object is {@link AffectedRoadsStructure }
     */
    public AffectedRoadsStructure getRoads() {
        return roads;
    }

    /**
     * Legt den Wert der roads-Eigenschaft fest.
     *
     * @param value allowed object is {@link AffectedRoadsStructure }
     */
    public void setRoads(AffectedRoadsStructure value) {
        this.roads = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionsStructure }
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionsStructure }
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public AffectsScopeStructure withAreaOfInterest(AreaOfInterestEnum value) {
        setAreaOfInterest(value);
        return this;
    }

    public AffectsScopeStructure withOperators(AffectsScopeStructure.Operators value) {
        setOperators(value);
        return this;
    }

    public AffectsScopeStructure withNetworks(AffectsScopeStructure.Networks value) {
        setNetworks(value);
        return this;
    }

    public AffectsScopeStructure withStopPoints(AffectsScopeStructure.StopPoints value) {
        setStopPoints(value);
        return this;
    }

    public AffectsScopeStructure withStopPlaces(AffectsScopeStructure.StopPlaces value) {
        setStopPlaces(value);
        return this;
    }

    public AffectsScopeStructure withPlaces(AffectsScopeStructure.Places value) {
        setPlaces(value);
        return this;
    }

    public AffectsScopeStructure withVehicleJourneys(AffectsScopeStructure.VehicleJourneys value) {
        setVehicleJourneys(value);
        return this;
    }

    public AffectsScopeStructure withVehicles(AffectsScopeStructure.Vehicles value) {
        setVehicles(value);
        return this;
    }

    public AffectsScopeStructure withRoads(AffectedRoadsStructure value) {
        setRoads(value);
        return this;
    }

    public AffectsScopeStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type. This is an extension method, produced by the 'ts' xjc plugin
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

    /**
     * <p>Java-Klasse für anonymous complex type.
     *
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AffectedNetwork" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.siri.org.uk/siri}AffectedNetworkStructure"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedNetwork"
    })
    public static class Networks {

        @XmlElement(name = "AffectedNetwork", required = true)
        protected List<AffectsScopeStructure.Networks.AffectedNetwork> affectedNetwork;

        /**
         * Gets the value of the affectedNetwork property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the affectedNetwork property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedNetwork().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link AffectsScopeStructure.Networks.AffectedNetwork }
         */
        public List<AffectsScopeStructure.Networks.AffectedNetwork> getAffectedNetwork() {
            if (affectedNetwork == null) {
                affectedNetwork = new ArrayList<AffectsScopeStructure.Networks.AffectedNetwork>();
            }
            return this.affectedNetwork;
        }

        public AffectsScopeStructure.Networks withAffectedNetwork(AffectsScopeStructure.Networks.AffectedNetwork... values) {
            if (values != null) {
                for (AffectsScopeStructure.Networks.AffectedNetwork value : values) {
                    getAffectedNetwork().add(value);
                }
            }
            return this;
        }

        public AffectsScopeStructure.Networks withAffectedNetwork(Collection<AffectsScopeStructure.Networks.AffectedNetwork> values) {
            if (values != null) {
                getAffectedNetwork().addAll(values);
            }
            return this;
        }

        /**
         * Generates a String representation of the contents of this type. This is an extension method, produced by the 'ts' xjc plugin
         */
        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
        }

        /**
         * <p>Java-Klasse für anonymous complex type.
         *
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.siri.org.uk/siri}AffectedNetworkStructure"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AffectedNetwork
            extends AffectedNetworkStructure {

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withAffectedOperator(AffectedOperatorStructure... values) {
                if (values != null) {
                    for (AffectedOperatorStructure value : values) {
                        getAffectedOperator().add(value);
                    }
                }
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withAffectedOperator(Collection<AffectedOperatorStructure> values) {
                if (values != null) {
                    getAffectedOperator().addAll(values);
                }
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withNetworkRef(NetworkRefStructure value) {
                setNetworkRef(value);
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withNetworkName(NaturalLanguageStringStructure... values) {
                if (values != null) {
                    for (NaturalLanguageStringStructure value : values) {
                        getNetworkName().add(value);
                    }
                }
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withNetworkName(Collection<NaturalLanguageStringStructure> values) {
                if (values != null) {
                    getNetworkName().addAll(values);
                }
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withRoutesAffected(NaturalLanguageStringStructure... values) {
                if (values != null) {
                    for (NaturalLanguageStringStructure value : values) {
                        getRoutesAffected().add(value);
                    }
                }
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withRoutesAffected(Collection<NaturalLanguageStringStructure> values) {
                if (values != null) {
                    getRoutesAffected().addAll(values);
                }
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withVehicleMode(VehicleModesOfTransportEnumeration value) {
                setVehicleMode(value);
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withAirSubmode(AirSubmodesOfTransportEnumeration value) {
                setAirSubmode(value);
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withBusSubmode(BusSubmodesOfTransportEnumeration value) {
                setBusSubmode(value);
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
                setCoachSubmode(value);
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
                setMetroSubmode(value);
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withRailSubmode(RailSubmodesOfTransportEnumeration value) {
                setRailSubmode(value);
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withTramSubmode(TramSubmodesOfTransportEnumeration value) {
                setTramSubmode(value);
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
                setWaterSubmode(value);
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withTelecabinSubmode(TelecabinSubmodesOfTransportEnumeration value) {
                setTelecabinSubmode(value);
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withAccessMode(AccessModesEnumeration value) {
                setAccessMode(value);
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withAllLines(String value) {
                setAllLines(value);
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withSelectedRoutes(AffectedRouteStructure... values) {
                if (values != null) {
                    for (AffectedRouteStructure value : values) {
                        getSelectedRoutes().add(value);
                    }
                }
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withSelectedRoutes(Collection<AffectedRouteStructure> values) {
                if (values != null) {
                    getSelectedRoutes().addAll(values);
                }
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withAffectedSection(AffectedSectionStructure... values) {
                if (values != null) {
                    for (AffectedSectionStructure value : values) {
                        getAffectedSection().add(value);
                    }
                }
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withAffectedSection(Collection<AffectedSectionStructure> values) {
                if (values != null) {
                    getAffectedSection().addAll(values);
                }
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withAffectedLine(AffectedLineStructure... values) {
                if (values != null) {
                    for (AffectedLineStructure value : values) {
                        getAffectedLine().add(value);
                    }
                }
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withAffectedLine(Collection<AffectedLineStructure> values) {
                if (values != null) {
                    getAffectedLine().addAll(values);
                }
                return this;
            }

            @Override
            public AffectsScopeStructure.Networks.AffectedNetwork withExtensions(ExtensionsStructure value) {
                setExtensions(value);
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

    }

    /**
     * <p>Java-Klasse für anonymous complex type.
     *
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="AllOperators" type="{http://www.siri.org.uk/siri}EmptyType"/&gt;
     *         &lt;element name="AffectedOperator" type="{http://www.siri.org.uk/siri}AffectedOperatorStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "allOperators",
        "affectedOperator"
    })
    public static class Operators {

        @XmlElement(name = "AllOperators")
        protected String allOperators;
        @XmlElement(name = "AffectedOperator")
        protected List<AffectedOperatorStructure> affectedOperator;

        /**
         * Ruft den Wert der allOperators-Eigenschaft ab.
         *
         * @return possible object is {@link String }
         */
        public String getAllOperators() {
            return allOperators;
        }

        /**
         * Legt den Wert der allOperators-Eigenschaft fest.
         *
         * @param value allowed object is {@link String }
         */
        public void setAllOperators(String value) {
            this.allOperators = value;
        }

        /**
         * Gets the value of the affectedOperator property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the affectedOperator property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedOperator().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link AffectedOperatorStructure }
         */
        public List<AffectedOperatorStructure> getAffectedOperator() {
            if (affectedOperator == null) {
                affectedOperator = new ArrayList<AffectedOperatorStructure>();
            }
            return this.affectedOperator;
        }

        public AffectsScopeStructure.Operators withAllOperators(String value) {
            setAllOperators(value);
            return this;
        }

        public AffectsScopeStructure.Operators withAffectedOperator(AffectedOperatorStructure... values) {
            if (values != null) {
                for (AffectedOperatorStructure value : values) {
                    getAffectedOperator().add(value);
                }
            }
            return this;
        }

        public AffectsScopeStructure.Operators withAffectedOperator(Collection<AffectedOperatorStructure> values) {
            if (values != null) {
                getAffectedOperator().addAll(values);
            }
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

    /**
     * <p>Java-Klasse für anonymous complex type.
     *
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AffectedPlace" type="{http://www.siri.org.uk/siri}AffectedPlaceStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedPlace"
    })
    public static class Places {

        @XmlElement(name = "AffectedPlace", required = true)
        protected List<AffectedPlaceStructure> affectedPlace;

        /**
         * Gets the value of the affectedPlace property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the affectedPlace property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedPlace().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link AffectedPlaceStructure }
         */
        public List<AffectedPlaceStructure> getAffectedPlace() {
            if (affectedPlace == null) {
                affectedPlace = new ArrayList<AffectedPlaceStructure>();
            }
            return this.affectedPlace;
        }

        public AffectsScopeStructure.Places withAffectedPlace(AffectedPlaceStructure... values) {
            if (values != null) {
                for (AffectedPlaceStructure value : values) {
                    getAffectedPlace().add(value);
                }
            }
            return this;
        }

        public AffectsScopeStructure.Places withAffectedPlace(Collection<AffectedPlaceStructure> values) {
            if (values != null) {
                getAffectedPlace().addAll(values);
            }
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

    /**
     * <p>Java-Klasse für anonymous complex type.
     *
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AffectedStopPlace" type="{http://www.siri.org.uk/siri}AffectedStopPlaceStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedStopPlace"
    })
    public static class StopPlaces {

        @XmlElement(name = "AffectedStopPlace", required = true)
        protected List<AffectedStopPlaceStructure> affectedStopPlace;

        /**
         * Gets the value of the affectedStopPlace property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the affectedStopPlace property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedStopPlace().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link AffectedStopPlaceStructure }
         */
        public List<AffectedStopPlaceStructure> getAffectedStopPlace() {
            if (affectedStopPlace == null) {
                affectedStopPlace = new ArrayList<AffectedStopPlaceStructure>();
            }
            return this.affectedStopPlace;
        }

        public AffectsScopeStructure.StopPlaces withAffectedStopPlace(AffectedStopPlaceStructure... values) {
            if (values != null) {
                for (AffectedStopPlaceStructure value : values) {
                    getAffectedStopPlace().add(value);
                }
            }
            return this;
        }

        public AffectsScopeStructure.StopPlaces withAffectedStopPlace(Collection<AffectedStopPlaceStructure> values) {
            if (values != null) {
                getAffectedStopPlace().addAll(values);
            }
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

    /**
     * <p>Java-Klasse für anonymous complex type.
     *
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AffectedStopPoint" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedStopPoint"
    })
    public static class StopPoints {

        @XmlElement(name = "AffectedStopPoint", required = true)
        protected List<AffectedStopPointStructure> affectedStopPoint;

        /**
         * Gets the value of the affectedStopPoint property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the affectedStopPoint property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedStopPoint().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link AffectedStopPointStructure }
         */
        public List<AffectedStopPointStructure> getAffectedStopPoint() {
            if (affectedStopPoint == null) {
                affectedStopPoint = new ArrayList<AffectedStopPointStructure>();
            }
            return this.affectedStopPoint;
        }

        public AffectsScopeStructure.StopPoints withAffectedStopPoint(AffectedStopPointStructure... values) {
            if (values != null) {
                for (AffectedStopPointStructure value : values) {
                    getAffectedStopPoint().add(value);
                }
            }
            return this;
        }

        public AffectsScopeStructure.StopPoints withAffectedStopPoint(Collection<AffectedStopPointStructure> values) {
            if (values != null) {
                getAffectedStopPoint().addAll(values);
            }
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

    /**
     * <p>Java-Klasse für anonymous complex type.
     *
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AffectedVehicleJourney" type="{http://www.siri.org.uk/siri}AffectedVehicleJourneyStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedVehicleJourney"
    })
    public static class VehicleJourneys {

        @XmlElement(name = "AffectedVehicleJourney", required = true)
        protected List<AffectedVehicleJourneyStructure> affectedVehicleJourney;

        /**
         * Gets the value of the affectedVehicleJourney property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the affectedVehicleJourney property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedVehicleJourney().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link AffectedVehicleJourneyStructure }
         */
        public List<AffectedVehicleJourneyStructure> getAffectedVehicleJourney() {
            if (affectedVehicleJourney == null) {
                affectedVehicleJourney = new ArrayList<AffectedVehicleJourneyStructure>();
            }
            return this.affectedVehicleJourney;
        }

        public AffectsScopeStructure.VehicleJourneys withAffectedVehicleJourney(AffectedVehicleJourneyStructure... values) {
            if (values != null) {
                for (AffectedVehicleJourneyStructure value : values) {
                    getAffectedVehicleJourney().add(value);
                }
            }
            return this;
        }

        public AffectsScopeStructure.VehicleJourneys withAffectedVehicleJourney(Collection<AffectedVehicleJourneyStructure> values) {
            if (values != null) {
                getAffectedVehicleJourney().addAll(values);
            }
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

    /**
     * <p>Java-Klasse für anonymous complex type.
     *
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AffectedVehicle" type="{http://www.siri.org.uk/siri}AffectedVehicleStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedVehicle"
    })
    public static class Vehicles {

        @XmlElement(name = "AffectedVehicle", required = true)
        protected List<AffectedVehicleStructure> affectedVehicle;

        /**
         * Gets the value of the affectedVehicle property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the affectedVehicle property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedVehicle().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link AffectedVehicleStructure }
         */
        public List<AffectedVehicleStructure> getAffectedVehicle() {
            if (affectedVehicle == null) {
                affectedVehicle = new ArrayList<AffectedVehicleStructure>();
            }
            return this.affectedVehicle;
        }

        public AffectsScopeStructure.Vehicles withAffectedVehicle(AffectedVehicleStructure... values) {
            if (values != null) {
                for (AffectedVehicleStructure value : values) {
                    getAffectedVehicle().add(value);
                }
            }
            return this;
        }

        public AffectsScopeStructure.Vehicles withAffectedVehicle(Collection<AffectedVehicleStructure> values) {
            if (values != null) {
                getAffectedVehicle().addAll(values);
            }
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

}
