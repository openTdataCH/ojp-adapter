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
 * Type for boarding restrictions.
 *
 * <p>Java-Klasse für BoardingStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="BoardingStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrivalBoardingActivity" type="{http://www.siri.org.uk/siri}ArrivalBoardingActivityEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="DepartureBoardingActivity" type="{http://www.siri.org.uk/siri}DepartureBoardingActivityEnumeration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoardingStructure", propOrder = {
    "arrivalBoardingActivity",
    "departureBoardingActivity"
})
public class BoardingStructure {

    @XmlElement(name = "ArrivalBoardingActivity", defaultValue = "alighting")
    @XmlSchemaType(name = "NMTOKEN")
    protected ArrivalBoardingActivityEnumeration arrivalBoardingActivity;
    @XmlElement(name = "DepartureBoardingActivity", defaultValue = "boarding")
    @XmlSchemaType(name = "NMTOKEN")
    protected DepartureBoardingActivityEnumeration departureBoardingActivity;

    /**
     * Ruft den Wert der arrivalBoardingActivity-Eigenschaft ab.
     *
     * @return possible object is {@link ArrivalBoardingActivityEnumeration }
     */
    public ArrivalBoardingActivityEnumeration getArrivalBoardingActivity() {
        return arrivalBoardingActivity;
    }

    /**
     * Legt den Wert der arrivalBoardingActivity-Eigenschaft fest.
     *
     * @param value allowed object is {@link ArrivalBoardingActivityEnumeration }
     */
    public void setArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        this.arrivalBoardingActivity = value;
    }

    /**
     * Ruft den Wert der departureBoardingActivity-Eigenschaft ab.
     *
     * @return possible object is {@link DepartureBoardingActivityEnumeration }
     */
    public DepartureBoardingActivityEnumeration getDepartureBoardingActivity() {
        return departureBoardingActivity;
    }

    /**
     * Legt den Wert der departureBoardingActivity-Eigenschaft fest.
     *
     * @param value allowed object is {@link DepartureBoardingActivityEnumeration }
     */
    public void setDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        this.departureBoardingActivity = value;
    }

    public BoardingStructure withArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        setArrivalBoardingActivity(value);
        return this;
    }

    public BoardingStructure withDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        setDepartureBoardingActivity(value);
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
