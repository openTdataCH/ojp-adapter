//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.ifopt.acsb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for of a specific SUITABILITY.
 * 
 * <p>Java-Klasse für SuitabilityStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SuitabilityStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Suitable" type="{http://www.ifopt.org.uk/acsb}SuitabilityEnumeration"/&gt;
 *         &lt;element name="UserNeed" type="{http://www.ifopt.org.uk/acsb}UserNeedStructure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuitabilityStructure", propOrder = {
    "suitable",
    "userNeed"
})
public class SuitabilityStructure {

    @XmlElement(name = "Suitable", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected SuitabilityEnumeration suitable;
    @XmlElement(name = "UserNeed", required = true)
    protected UserNeedStructure userNeed;

    /**
     * Ruft den Wert der suitable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SuitabilityEnumeration }
     *     
     */
    public SuitabilityEnumeration getSuitable() {
        return suitable;
    }

    /**
     * Legt den Wert der suitable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SuitabilityEnumeration }
     *     
     */
    public void setSuitable(SuitabilityEnumeration value) {
        this.suitable = value;
    }

    /**
     * Ruft den Wert der userNeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserNeedStructure }
     *     
     */
    public UserNeedStructure getUserNeed() {
        return userNeed;
    }

    /**
     * Legt den Wert der userNeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserNeedStructure }
     *     
     */
    public void setUserNeed(UserNeedStructure value) {
        this.userNeed = value;
    }

    public SuitabilityStructure withSuitable(SuitabilityEnumeration value) {
        setSuitable(value);
        return this;
    }

    public SuitabilityStructure withUserNeed(UserNeedStructure value) {
        setUserNeed(value);
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
