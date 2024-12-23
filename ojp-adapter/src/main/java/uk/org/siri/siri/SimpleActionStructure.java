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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for list of SITUATIONs.
 * 
 * <p>Java-Klasse für SimpleActionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SimpleActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionStatus" type="{http://www.siri.org.uk/siri}ActionStatusEnumeration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleActionStructure", propOrder = {
    "actionStatus"
})
@XmlSeeAlso({
    ParameterisedActionStructure.class
})
public class SimpleActionStructure {

    @XmlElement(name = "ActionStatus", defaultValue = "open")
    @XmlSchemaType(name = "NMTOKEN")
    protected ActionStatusEnumeration actionStatus;

    /**
     * Ruft den Wert der actionStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActionStatusEnumeration }
     *     
     */
    public ActionStatusEnumeration getActionStatus() {
        return actionStatus;
    }

    /**
     * Legt den Wert der actionStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionStatusEnumeration }
     *     
     */
    public void setActionStatus(ActionStatusEnumeration value) {
        this.actionStatus = value;
    }

    public SimpleActionStructure withActionStatus(ActionStatusEnumeration value) {
        setActionStatus(value);
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
