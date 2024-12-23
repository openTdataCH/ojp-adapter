//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Used to specify that a travel group has booked a section of the vehicle for a part of the journey, and if so under what name. (since SIRI 2.1)
 * 
 * <p>Java-Klasse für GroupReservationStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupReservationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NameOfGroup" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure"/&gt;
 *         &lt;element name="NumberOfReservedSeats" type="{http://www.siri.org.uk/siri}NumberOfPassengers"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupReservationStructure", propOrder = {
    "nameOfGroup",
    "numberOfReservedSeats"
})
public class GroupReservationStructure {

    @XmlElement(name = "NameOfGroup", required = true)
    protected NaturalLanguageStringStructure nameOfGroup;
    @XmlElement(name = "NumberOfReservedSeats", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfReservedSeats;

    /**
     * Ruft den Wert der nameOfGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getNameOfGroup() {
        return nameOfGroup;
    }

    /**
     * Legt den Wert der nameOfGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setNameOfGroup(NaturalLanguageStringStructure value) {
        this.nameOfGroup = value;
    }

    /**
     * Ruft den Wert der numberOfReservedSeats-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfReservedSeats() {
        return numberOfReservedSeats;
    }

    /**
     * Legt den Wert der numberOfReservedSeats-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfReservedSeats(BigInteger value) {
        this.numberOfReservedSeats = value;
    }

    public GroupReservationStructure withNameOfGroup(NaturalLanguageStringStructure value) {
        setNameOfGroup(value);
        return this;
    }

    public GroupReservationStructure withNumberOfReservedSeats(BigInteger value) {
        setNumberOfReservedSeats(value);
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
