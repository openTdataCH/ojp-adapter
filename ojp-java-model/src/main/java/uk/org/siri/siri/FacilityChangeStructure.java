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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for change to equipment availability. Basic structure defined in the first 1.0 SIRI XSd.
 *
 * <p>Java-Klasse für FacilityChangeStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="FacilityChangeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentAvailability" type="{http://www.siri.org.uk/siri}EquipmentAvailabilityStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/&gt;
 *         &lt;element name="MobilityDisruption" type="{http://www.siri.org.uk/siri}MobilityDisruptionStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityChangeStructure", propOrder = {
    "equipmentAvailability",
    "situationRef",
    "mobilityDisruption"
})
public class FacilityChangeStructure {

    @XmlElement(name = "EquipmentAvailability")
    protected EquipmentAvailabilityStructure equipmentAvailability;
    @XmlElement(name = "SituationRef")
    protected SituationRefStructure situationRef;
    @XmlElement(name = "MobilityDisruption")
    protected MobilityDisruptionStructure mobilityDisruption;

    /**
     * Ruft den Wert der equipmentAvailability-Eigenschaft ab.
     *
     * @return possible object is {@link EquipmentAvailabilityStructure }
     */
    public EquipmentAvailabilityStructure getEquipmentAvailability() {
        return equipmentAvailability;
    }

    /**
     * Legt den Wert der equipmentAvailability-Eigenschaft fest.
     *
     * @param value allowed object is {@link EquipmentAvailabilityStructure }
     */
    public void setEquipmentAvailability(EquipmentAvailabilityStructure value) {
        this.equipmentAvailability = value;
    }

    /**
     * Ruft den Wert der situationRef-Eigenschaft ab.
     *
     * @return possible object is {@link SituationRefStructure }
     */
    public SituationRefStructure getSituationRef() {
        return situationRef;
    }

    /**
     * Legt den Wert der situationRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link SituationRefStructure }
     */
    public void setSituationRef(SituationRefStructure value) {
        this.situationRef = value;
    }

    /**
     * Ruft den Wert der mobilityDisruption-Eigenschaft ab.
     *
     * @return possible object is {@link MobilityDisruptionStructure }
     */
    public MobilityDisruptionStructure getMobilityDisruption() {
        return mobilityDisruption;
    }

    /**
     * Legt den Wert der mobilityDisruption-Eigenschaft fest.
     *
     * @param value allowed object is {@link MobilityDisruptionStructure }
     */
    public void setMobilityDisruption(MobilityDisruptionStructure value) {
        this.mobilityDisruption = value;
    }

    public FacilityChangeStructure withEquipmentAvailability(EquipmentAvailabilityStructure value) {
        setEquipmentAvailability(value);
        return this;
    }

    public FacilityChangeStructure withSituationRef(SituationRefStructure value) {
        setSituationRef(value);
        return this;
    }

    public FacilityChangeStructure withMobilityDisruption(MobilityDisruptionStructure value) {
        setMobilityDisruption(value);
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
