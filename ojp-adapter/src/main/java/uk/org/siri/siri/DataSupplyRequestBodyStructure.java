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
 * Type for Body of Data Supply Request. Used in WSDL.
 * 
 * <p>Java-Klasse für DataSupplyRequestBodyStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataSupplyRequestBodyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DataSupplyTopicGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSupplyRequestBodyStructure", propOrder = {
    "notificationRef",
    "allData"
})
public class DataSupplyRequestBodyStructure {

    @XmlElement(name = "NotificationRef")
    protected MessageRefStructure notificationRef;
    @XmlElement(name = "AllData", defaultValue = "false")
    protected Boolean allData;

    /**
     * Ruft den Wert der notificationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageRefStructure }
     *     
     */
    public MessageRefStructure getNotificationRef() {
        return notificationRef;
    }

    /**
     * Legt den Wert der notificationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageRefStructure }
     *     
     */
    public void setNotificationRef(MessageRefStructure value) {
        this.notificationRef = value;
    }

    /**
     * Ruft den Wert der allData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllData() {
        return allData;
    }

    /**
     * Legt den Wert der allData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllData(Boolean value) {
        this.allData = value;
    }

    public DataSupplyRequestBodyStructure withNotificationRef(MessageRefStructure value) {
        setNotificationRef(value);
        return this;
    }

    public DataSupplyRequestBodyStructure withAllData(Boolean value) {
        setAllData(value);
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
