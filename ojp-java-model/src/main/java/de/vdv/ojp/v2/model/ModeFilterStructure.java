//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.AirSubmodesOfTransportEnumeration;
import uk.org.siri.siri.BusSubmodesOfTransportEnumeration;
import uk.org.siri.siri.CoachSubmodesOfTransportEnumeration;
import uk.org.siri.siri.FunicularSubmodesOfTransportEnumeration;
import uk.org.siri.siri.MetroSubmodesOfTransportEnumeration;
import uk.org.siri.siri.RailSubmodesOfTransportEnumeration;
import uk.org.siri.siri.TelecabinSubmodesOfTransportEnumeration;
import uk.org.siri.siri.TramSubmodesOfTransportEnumeration;
import uk.org.siri.siri.VehicleModesOfTransportEnumeration;
import uk.org.siri.siri.WaterSubmodesOfTransportEnumeration;

/**
 * List of MODE to exclude or include.
 *
 * <p>Java-Klasse für ModeFilterStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ModeFilterStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PtMode" type="{http://www.siri.org.uk/siri}VehicleModesOfTransportEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PersonalMode" type="{http://www.vdv.de/ojp}PersonalModesEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}PtModeChoiceGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModeFilterStructure", propOrder = {
    "exclude",
    "ptMode",
    "personalMode",
    "ptModeChoiceGroup"
})
public class ModeFilterStructure {

    @XmlElement(name = "Exclude", defaultValue = "true")
    protected Boolean exclude;
    @XmlElement(name = "PtMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<VehicleModesOfTransportEnumeration> ptMode;
    @XmlElement(name = "PersonalMode")
    @XmlSchemaType(name = "string")
    protected List<PersonalModesEnumeration> personalMode;
    @XmlElements({
        @XmlElement(name = "AirSubmode", namespace = "http://www.siri.org.uk/siri", type = AirSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "BusSubmode", namespace = "http://www.siri.org.uk/siri", type = BusSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "CoachSubmode", namespace = "http://www.siri.org.uk/siri", type = CoachSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "FunicularSubmode", namespace = "http://www.siri.org.uk/siri", type = FunicularSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "MetroSubmode", namespace = "http://www.siri.org.uk/siri", type = MetroSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "TramSubmode", namespace = "http://www.siri.org.uk/siri", type = TramSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "TelecabinSubmode", namespace = "http://www.siri.org.uk/siri", type = TelecabinSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "RailSubmode", namespace = "http://www.siri.org.uk/siri", type = RailSubmodesOfTransportEnumeration.class, defaultValue = "unknown"),
        @XmlElement(name = "WaterSubmode", namespace = "http://www.siri.org.uk/siri", type = WaterSubmodesOfTransportEnumeration.class, defaultValue = "unknown")
    })
    protected List<Object> ptModeChoiceGroup;

    /**
     * Ruft den Wert der exclude-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isExclude() {
        return exclude;
    }

    /**
     * Legt den Wert der exclude-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setExclude(Boolean value) {
        this.exclude = value;
    }

    /**
     * Gets the value of the ptMode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the ptMode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtMode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link VehicleModesOfTransportEnumeration }
     */
    public List<VehicleModesOfTransportEnumeration> getPtMode() {
        if (ptMode == null) {
            ptMode = new ArrayList<VehicleModesOfTransportEnumeration>();
        }
        return this.ptMode;
    }

    /**
     * Gets the value of the personalMode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the personalMode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalMode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link PersonalModesEnumeration }
     */
    public List<PersonalModesEnumeration> getPersonalMode() {
        if (personalMode == null) {
            personalMode = new ArrayList<PersonalModesEnumeration>();
        }
        return this.personalMode;
    }

    /**
     * Gets the value of the ptModeChoiceGroup property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the ptModeChoiceGroup property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtModeChoiceGroup().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link AirSubmodesOfTransportEnumeration } {@link BusSubmodesOfTransportEnumeration } {@link CoachSubmodesOfTransportEnumeration }
     * {@link FunicularSubmodesOfTransportEnumeration } {@link MetroSubmodesOfTransportEnumeration } {@link RailSubmodesOfTransportEnumeration } {@link TelecabinSubmodesOfTransportEnumeration }
     * {@link TramSubmodesOfTransportEnumeration } {@link WaterSubmodesOfTransportEnumeration }
     */
    public List<Object> getPtModeChoiceGroup() {
        if (ptModeChoiceGroup == null) {
            ptModeChoiceGroup = new ArrayList<Object>();
        }
        return this.ptModeChoiceGroup;
    }

    public ModeFilterStructure withExclude(Boolean value) {
        setExclude(value);
        return this;
    }

    public ModeFilterStructure withPtMode(VehicleModesOfTransportEnumeration... values) {
        if (values != null) {
            for (VehicleModesOfTransportEnumeration value : values) {
                getPtMode().add(value);
            }
        }
        return this;
    }

    public ModeFilterStructure withPtMode(Collection<VehicleModesOfTransportEnumeration> values) {
        if (values != null) {
            getPtMode().addAll(values);
        }
        return this;
    }

    public ModeFilterStructure withPersonalMode(PersonalModesEnumeration... values) {
        if (values != null) {
            for (PersonalModesEnumeration value : values) {
                getPersonalMode().add(value);
            }
        }
        return this;
    }

    public ModeFilterStructure withPersonalMode(Collection<PersonalModesEnumeration> values) {
        if (values != null) {
            getPersonalMode().addAll(values);
        }
        return this;
    }

    public ModeFilterStructure withPtModeChoiceGroup(Object... values) {
        if (values != null) {
            for (Object value : values) {
                getPtModeChoiceGroup().add(value);
            }
        }
        return this;
    }

    public ModeFilterStructure withPtModeChoiceGroup(Collection<Object> values) {
        if (values != null) {
            getPtModeChoiceGroup().addAll(values);
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
