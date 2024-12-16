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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Classification of vehicle energy type. See Transmodel TypeOfFuel. (since SIRI 2.1)
 * 
 * <p>Java-Klasse für TypeOfVehicleFuelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TypeOfVehicleFuelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeOfFuel" type="{http://www.siri.org.uk/siri}TypeOfFuelEnumeration"/&gt;
 *         &lt;element name="OtherTypeOfFuel" type="{http://www.siri.org.uk/siri}TypeOfValueStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeOfVehicleFuelStructure", propOrder = {
    "typeOfFuel",
    "otherTypeOfFuel"
})
public class TypeOfVehicleFuelStructure {

    @XmlElement(name = "TypeOfFuel", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected TypeOfFuelEnumeration typeOfFuel;
    @XmlElement(name = "OtherTypeOfFuel")
    protected TypeOfValueStructure otherTypeOfFuel;

    /**
     * Ruft den Wert der typeOfFuel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFuelEnumeration }
     *     
     */
    public TypeOfFuelEnumeration getTypeOfFuel() {
        return typeOfFuel;
    }

    /**
     * Legt den Wert der typeOfFuel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFuelEnumeration }
     *     
     */
    public void setTypeOfFuel(TypeOfFuelEnumeration value) {
        this.typeOfFuel = value;
    }

    /**
     * Ruft den Wert der otherTypeOfFuel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfValueStructure }
     *     
     */
    public TypeOfValueStructure getOtherTypeOfFuel() {
        return otherTypeOfFuel;
    }

    /**
     * Legt den Wert der otherTypeOfFuel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfValueStructure }
     *     
     */
    public void setOtherTypeOfFuel(TypeOfValueStructure value) {
        this.otherTypeOfFuel = value;
    }

    public TypeOfVehicleFuelStructure withTypeOfFuel(TypeOfFuelEnumeration value) {
        setTypeOfFuel(value);
        return this;
    }

    public TypeOfVehicleFuelStructure withOtherTypeOfFuel(TypeOfValueStructure value) {
        setOtherTypeOfFuel(value);
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
