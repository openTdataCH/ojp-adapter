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
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.ifopt.AccessModesEnumeration;

/**
 * Type for TRANSPORT MODEs affecetd by a SITUATION.
 *
 * <p>Java-Klasse für AffectedModesStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AffectedModesStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AllModes" type="{http://www.siri.org.uk/siri}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="Mode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;group ref="{http://www.siri.org.uk/siri}AffectedModeGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedModesStructure", propOrder = {
    "allModes",
    "mode"
})
public class AffectedModesStructure {

    @XmlElement(name = "AllModes")
    protected String allModes;
    @XmlElement(name = "Mode")
    protected List<AffectedModesStructure.Mode> mode;

    /**
     * Ruft den Wert der allModes-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getAllModes() {
        return allModes;
    }

    /**
     * Legt den Wert der allModes-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setAllModes(String value) {
        this.allModes = value;
    }

    /**
     * Gets the value of the mode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the mode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link AffectedModesStructure.Mode }
     */
    public List<AffectedModesStructure.Mode> getMode() {
        if (mode == null) {
            mode = new ArrayList<AffectedModesStructure.Mode>();
        }
        return this.mode;
    }

    public AffectedModesStructure withAllModes(String value) {
        setAllModes(value);
        return this;
    }

    public AffectedModesStructure withMode(AffectedModesStructure.Mode... values) {
        if (values != null) {
            for (AffectedModesStructure.Mode value : values) {
                getMode().add(value);
            }
        }
        return this;
    }

    public AffectedModesStructure withMode(Collection<AffectedModesStructure.Mode> values) {
        if (values != null) {
            getMode().addAll(values);
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;group ref="{http://www.siri.org.uk/siri}AffectedModeGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vehicleMode",
        "airSubmode",
        "busSubmode",
        "coachSubmode",
        "metroSubmode",
        "railSubmode",
        "tramSubmode",
        "waterSubmode",
        "telecabinSubmode",
        "accessMode"
    })
    public static class Mode {

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

        public AffectedModesStructure.Mode withVehicleMode(VehicleModesOfTransportEnumeration value) {
            setVehicleMode(value);
            return this;
        }

        public AffectedModesStructure.Mode withAirSubmode(AirSubmodesOfTransportEnumeration value) {
            setAirSubmode(value);
            return this;
        }

        public AffectedModesStructure.Mode withBusSubmode(BusSubmodesOfTransportEnumeration value) {
            setBusSubmode(value);
            return this;
        }

        public AffectedModesStructure.Mode withCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
            setCoachSubmode(value);
            return this;
        }

        public AffectedModesStructure.Mode withMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
            setMetroSubmode(value);
            return this;
        }

        public AffectedModesStructure.Mode withRailSubmode(RailSubmodesOfTransportEnumeration value) {
            setRailSubmode(value);
            return this;
        }

        public AffectedModesStructure.Mode withTramSubmode(TramSubmodesOfTransportEnumeration value) {
            setTramSubmode(value);
            return this;
        }

        public AffectedModesStructure.Mode withWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
            setWaterSubmode(value);
            return this;
        }

        public AffectedModesStructure.Mode withTelecabinSubmode(TelecabinSubmodesOfTransportEnumeration value) {
            setTelecabinSubmode(value);
            return this;
        }

        public AffectedModesStructure.Mode withAccessMode(AccessModesEnumeration value) {
            setAccessMode(value);
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
