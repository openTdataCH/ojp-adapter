//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.ifopt.AccessModesEnumeration;

/**
 * Type for information about the parts of the network affected by an incident. If not explicitly overridden, modes and submodes will be defaulted to any values present in the general context.
 *
 * <p>Java-Klasse für AffectedNetworkStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AffectedNetworkStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AffectedOperator" type="{http://www.siri.org.uk/siri}AffectedOperatorStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NetworkRef" type="{http://www.siri.org.uk/siri}NetworkRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="NetworkName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RoutesAffected" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}AffectedModeGroup"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AllLines" type="{http://www.siri.org.uk/siri}EmptyType"/&gt;
 *           &lt;element name="SelectedRoutes" type="{http://www.siri.org.uk/siri}AffectedRouteStructure" maxOccurs="unbounded"/&gt;
 *           &lt;element name="AffectedSection" type="{http://www.siri.org.uk/siri}AffectedSectionStructure" maxOccurs="unbounded"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="AffectedLine" type="{http://www.siri.org.uk/siri}AffectedLineStructure" maxOccurs="unbounded"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedNetworkStructure", propOrder = {
    "affectedOperator",
    "networkRef",
    "networkName",
    "routesAffected",
    "vehicleMode",
    "airSubmode",
    "busSubmode",
    "coachSubmode",
    "metroSubmode",
    "railSubmode",
    "tramSubmode",
    "waterSubmode",
    "telecabinSubmode",
    "accessMode",
    "allLines",
    "selectedRoutes",
    "affectedSection",
    "affectedLine",
    "extensions"
})
@XmlSeeAlso({
    uk.org.siri.siri.AffectsScopeStructure.Networks.AffectedNetwork.class
})
public class AffectedNetworkStructure {

    @XmlElement(name = "AffectedOperator")
    protected List<AffectedOperatorStructure> affectedOperator;
    @XmlElement(name = "NetworkRef")
    protected NetworkRefStructure networkRef;
    @XmlElement(name = "NetworkName")
    protected List<NaturalLanguageStringStructure> networkName;
    @XmlElement(name = "RoutesAffected")
    protected List<NaturalLanguageStringStructure> routesAffected;
    @XmlElement(name = "VehicleMode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected VehicleModesOfTransportEnumeration vehicleMode;
    @XmlElement(name = "AirSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AirSubmodesOfTransportEnumeration airSubmode;
    @XmlElement(name = "BusSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected BusSubmodesOfTransportEnumeration busSubmode;
    @XmlElement(name = "CoachSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected CoachSubmodesOfTransportEnumeration coachSubmode;
    @XmlElement(name = "MetroSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected MetroSubmodesOfTransportEnumeration metroSubmode;
    @XmlElement(name = "RailSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected RailSubmodesOfTransportEnumeration railSubmode;
    @XmlElement(name = "TramSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TramSubmodesOfTransportEnumeration tramSubmode;
    @XmlElement(name = "WaterSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected WaterSubmodesOfTransportEnumeration waterSubmode;
    @XmlElement(name = "TelecabinSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TelecabinSubmodesOfTransportEnumeration telecabinSubmode;
    @XmlElement(name = "AccessMode")
    @XmlSchemaType(name = "string")
    protected AccessModesEnumeration accessMode;
    @XmlElement(name = "AllLines")
    protected String allLines;
    @XmlElement(name = "SelectedRoutes")
    protected List<AffectedRouteStructure> selectedRoutes;
    @XmlElement(name = "AffectedSection")
    protected List<AffectedSectionStructure> affectedSection;
    @XmlElement(name = "AffectedLine")
    protected List<AffectedLineStructure> affectedLine;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the affectedOperator property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the affectedOperator property.
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

    /**
     * Ruft den Wert der networkRef-Eigenschaft ab.
     *
     * @return possible object is {@link NetworkRefStructure }
     */
    public NetworkRefStructure getNetworkRef() {
        return networkRef;
    }

    /**
     * Legt den Wert der networkRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link NetworkRefStructure }
     */
    public void setNetworkRef(NetworkRefStructure value) {
        this.networkRef = value;
    }

    /**
     * Gets the value of the networkName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the networkName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getNetworkName() {
        if (networkName == null) {
            networkName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.networkName;
    }

    /**
     * Gets the value of the routesAffected property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the routesAffected property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutesAffected().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getRoutesAffected() {
        if (routesAffected == null) {
            routesAffected = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.routesAffected;
    }

    /**
     * Ruft den Wert der vehicleMode-Eigenschaft ab.
     *
     * @return possible object is {@link VehicleModesOfTransportEnumeration }
     */
    public VehicleModesOfTransportEnumeration getVehicleMode() {
        return vehicleMode;
    }

    /**
     * Legt den Wert der vehicleMode-Eigenschaft fest.
     *
     * @param value allowed object is {@link VehicleModesOfTransportEnumeration }
     */
    public void setVehicleMode(VehicleModesOfTransportEnumeration value) {
        this.vehicleMode = value;
    }

    /**
     * Ruft den Wert der airSubmode-Eigenschaft ab.
     *
     * @return possible object is {@link AirSubmodesOfTransportEnumeration }
     */
    public AirSubmodesOfTransportEnumeration getAirSubmode() {
        return airSubmode;
    }

    /**
     * Legt den Wert der airSubmode-Eigenschaft fest.
     *
     * @param value allowed object is {@link AirSubmodesOfTransportEnumeration }
     */
    public void setAirSubmode(AirSubmodesOfTransportEnumeration value) {
        this.airSubmode = value;
    }

    /**
     * Ruft den Wert der busSubmode-Eigenschaft ab.
     *
     * @return possible object is {@link BusSubmodesOfTransportEnumeration }
     */
    public BusSubmodesOfTransportEnumeration getBusSubmode() {
        return busSubmode;
    }

    /**
     * Legt den Wert der busSubmode-Eigenschaft fest.
     *
     * @param value allowed object is {@link BusSubmodesOfTransportEnumeration }
     */
    public void setBusSubmode(BusSubmodesOfTransportEnumeration value) {
        this.busSubmode = value;
    }

    /**
     * Ruft den Wert der coachSubmode-Eigenschaft ab.
     *
     * @return possible object is {@link CoachSubmodesOfTransportEnumeration }
     */
    public CoachSubmodesOfTransportEnumeration getCoachSubmode() {
        return coachSubmode;
    }

    /**
     * Legt den Wert der coachSubmode-Eigenschaft fest.
     *
     * @param value allowed object is {@link CoachSubmodesOfTransportEnumeration }
     */
    public void setCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
        this.coachSubmode = value;
    }

    /**
     * Ruft den Wert der metroSubmode-Eigenschaft ab.
     *
     * @return possible object is {@link MetroSubmodesOfTransportEnumeration }
     */
    public MetroSubmodesOfTransportEnumeration getMetroSubmode() {
        return metroSubmode;
    }

    /**
     * Legt den Wert der metroSubmode-Eigenschaft fest.
     *
     * @param value allowed object is {@link MetroSubmodesOfTransportEnumeration }
     */
    public void setMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
        this.metroSubmode = value;
    }

    /**
     * Ruft den Wert der railSubmode-Eigenschaft ab.
     *
     * @return possible object is {@link RailSubmodesOfTransportEnumeration }
     */
    public RailSubmodesOfTransportEnumeration getRailSubmode() {
        return railSubmode;
    }

    /**
     * Legt den Wert der railSubmode-Eigenschaft fest.
     *
     * @param value allowed object is {@link RailSubmodesOfTransportEnumeration }
     */
    public void setRailSubmode(RailSubmodesOfTransportEnumeration value) {
        this.railSubmode = value;
    }

    /**
     * Ruft den Wert der tramSubmode-Eigenschaft ab.
     *
     * @return possible object is {@link TramSubmodesOfTransportEnumeration }
     */
    public TramSubmodesOfTransportEnumeration getTramSubmode() {
        return tramSubmode;
    }

    /**
     * Legt den Wert der tramSubmode-Eigenschaft fest.
     *
     * @param value allowed object is {@link TramSubmodesOfTransportEnumeration }
     */
    public void setTramSubmode(TramSubmodesOfTransportEnumeration value) {
        this.tramSubmode = value;
    }

    /**
     * Ruft den Wert der waterSubmode-Eigenschaft ab.
     *
     * @return possible object is {@link WaterSubmodesOfTransportEnumeration }
     */
    public WaterSubmodesOfTransportEnumeration getWaterSubmode() {
        return waterSubmode;
    }

    /**
     * Legt den Wert der waterSubmode-Eigenschaft fest.
     *
     * @param value allowed object is {@link WaterSubmodesOfTransportEnumeration }
     */
    public void setWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
        this.waterSubmode = value;
    }

    /**
     * Ruft den Wert der telecabinSubmode-Eigenschaft ab.
     *
     * @return possible object is {@link TelecabinSubmodesOfTransportEnumeration }
     */
    public TelecabinSubmodesOfTransportEnumeration getTelecabinSubmode() {
        return telecabinSubmode;
    }

    /**
     * Legt den Wert der telecabinSubmode-Eigenschaft fest.
     *
     * @param value allowed object is {@link TelecabinSubmodesOfTransportEnumeration }
     */
    public void setTelecabinSubmode(TelecabinSubmodesOfTransportEnumeration value) {
        this.telecabinSubmode = value;
    }

    /**
     * Ruft den Wert der accessMode-Eigenschaft ab.
     *
     * @return possible object is {@link AccessModesEnumeration }
     */
    public AccessModesEnumeration getAccessMode() {
        return accessMode;
    }

    /**
     * Legt den Wert der accessMode-Eigenschaft fest.
     *
     * @param value allowed object is {@link AccessModesEnumeration }
     */
    public void setAccessMode(AccessModesEnumeration value) {
        this.accessMode = value;
    }

    /**
     * Ruft den Wert der allLines-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getAllLines() {
        return allLines;
    }

    /**
     * Legt den Wert der allLines-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setAllLines(String value) {
        this.allLines = value;
    }

    /**
     * Gets the value of the selectedRoutes property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the selectedRoutes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedRoutes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link AffectedRouteStructure }
     */
    public List<AffectedRouteStructure> getSelectedRoutes() {
        if (selectedRoutes == null) {
            selectedRoutes = new ArrayList<AffectedRouteStructure>();
        }
        return this.selectedRoutes;
    }

    /**
     * Gets the value of the affectedSection property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the affectedSection property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedSection().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link AffectedSectionStructure }
     */
    public List<AffectedSectionStructure> getAffectedSection() {
        if (affectedSection == null) {
            affectedSection = new ArrayList<AffectedSectionStructure>();
        }
        return this.affectedSection;
    }

    /**
     * Gets the value of the affectedLine property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the affectedLine property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedLine().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link AffectedLineStructure }
     */
    public List<AffectedLineStructure> getAffectedLine() {
        if (affectedLine == null) {
            affectedLine = new ArrayList<AffectedLineStructure>();
        }
        return this.affectedLine;
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

    public AffectedNetworkStructure withAffectedOperator(AffectedOperatorStructure... values) {
        if (values != null) {
            for (AffectedOperatorStructure value : values) {
                getAffectedOperator().add(value);
            }
        }
        return this;
    }

    public AffectedNetworkStructure withAffectedOperator(Collection<AffectedOperatorStructure> values) {
        if (values != null) {
            getAffectedOperator().addAll(values);
        }
        return this;
    }

    public AffectedNetworkStructure withNetworkRef(NetworkRefStructure value) {
        setNetworkRef(value);
        return this;
    }

    public AffectedNetworkStructure withNetworkName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getNetworkName().add(value);
            }
        }
        return this;
    }

    public AffectedNetworkStructure withNetworkName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getNetworkName().addAll(values);
        }
        return this;
    }

    public AffectedNetworkStructure withRoutesAffected(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getRoutesAffected().add(value);
            }
        }
        return this;
    }

    public AffectedNetworkStructure withRoutesAffected(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getRoutesAffected().addAll(values);
        }
        return this;
    }

    public AffectedNetworkStructure withVehicleMode(VehicleModesOfTransportEnumeration value) {
        setVehicleMode(value);
        return this;
    }

    public AffectedNetworkStructure withAirSubmode(AirSubmodesOfTransportEnumeration value) {
        setAirSubmode(value);
        return this;
    }

    public AffectedNetworkStructure withBusSubmode(BusSubmodesOfTransportEnumeration value) {
        setBusSubmode(value);
        return this;
    }

    public AffectedNetworkStructure withCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
        setCoachSubmode(value);
        return this;
    }

    public AffectedNetworkStructure withMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
        setMetroSubmode(value);
        return this;
    }

    public AffectedNetworkStructure withRailSubmode(RailSubmodesOfTransportEnumeration value) {
        setRailSubmode(value);
        return this;
    }

    public AffectedNetworkStructure withTramSubmode(TramSubmodesOfTransportEnumeration value) {
        setTramSubmode(value);
        return this;
    }

    public AffectedNetworkStructure withWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
        setWaterSubmode(value);
        return this;
    }

    public AffectedNetworkStructure withTelecabinSubmode(TelecabinSubmodesOfTransportEnumeration value) {
        setTelecabinSubmode(value);
        return this;
    }

    public AffectedNetworkStructure withAccessMode(AccessModesEnumeration value) {
        setAccessMode(value);
        return this;
    }

    public AffectedNetworkStructure withAllLines(String value) {
        setAllLines(value);
        return this;
    }

    public AffectedNetworkStructure withSelectedRoutes(AffectedRouteStructure... values) {
        if (values != null) {
            for (AffectedRouteStructure value : values) {
                getSelectedRoutes().add(value);
            }
        }
        return this;
    }

    public AffectedNetworkStructure withSelectedRoutes(Collection<AffectedRouteStructure> values) {
        if (values != null) {
            getSelectedRoutes().addAll(values);
        }
        return this;
    }

    public AffectedNetworkStructure withAffectedSection(AffectedSectionStructure... values) {
        if (values != null) {
            for (AffectedSectionStructure value : values) {
                getAffectedSection().add(value);
            }
        }
        return this;
    }

    public AffectedNetworkStructure withAffectedSection(Collection<AffectedSectionStructure> values) {
        if (values != null) {
            getAffectedSection().addAll(values);
        }
        return this;
    }

    public AffectedNetworkStructure withAffectedLine(AffectedLineStructure... values) {
        if (values != null) {
            for (AffectedLineStructure value : values) {
                getAffectedLine().add(value);
            }
        }
        return this;
    }

    public AffectedNetworkStructure withAffectedLine(Collection<AffectedLineStructure> values) {
        if (values != null) {
            getAffectedLine().addAll(values);
        }
        return this;
    }

    public AffectedNetworkStructure withExtensions(ExtensionsStructure value) {
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
