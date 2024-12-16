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
 * Type for Information on casualties.
 * 
 * <p>Java-Klasse für CasualtiesStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CasualtiesStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOfDeaths" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfInjured" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CasualtiesStructure", propOrder = {
    "numberOfDeaths",
    "numberOfInjured"
})
public class CasualtiesStructure {

    @XmlElement(name = "NumberOfDeaths")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfDeaths;
    @XmlElement(name = "NumberOfInjured")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfInjured;

    /**
     * Ruft den Wert der numberOfDeaths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDeaths() {
        return numberOfDeaths;
    }

    /**
     * Legt den Wert der numberOfDeaths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDeaths(BigInteger value) {
        this.numberOfDeaths = value;
    }

    /**
     * Ruft den Wert der numberOfInjured-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfInjured() {
        return numberOfInjured;
    }

    /**
     * Legt den Wert der numberOfInjured-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfInjured(BigInteger value) {
        this.numberOfInjured = value;
    }

    public CasualtiesStructure withNumberOfDeaths(BigInteger value) {
        setNumberOfDeaths(value);
        return this;
    }

    public CasualtiesStructure withNumberOfInjured(BigInteger value) {
        setNumberOfInjured(value);
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
