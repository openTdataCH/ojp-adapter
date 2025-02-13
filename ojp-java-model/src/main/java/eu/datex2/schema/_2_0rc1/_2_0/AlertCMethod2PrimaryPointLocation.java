//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für AlertCMethod2PrimaryPointLocation complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AlertCMethod2PrimaryPointLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLocation"/&gt;
 *         &lt;element name="alertCMethod2PrimaryPointLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod2PrimaryPointLocation", propOrder = {
    "alertCLocation",
    "alertCMethod2PrimaryPointLocationExtension"
})
public class AlertCMethod2PrimaryPointLocation {

    @XmlElement(required = true)
    protected AlertCLocation alertCLocation;
    protected ExtensionType alertCMethod2PrimaryPointLocationExtension;

    /**
     * Ruft den Wert der alertCLocation-Eigenschaft ab.
     *
     * @return possible object is {@link AlertCLocation }
     */
    public AlertCLocation getAlertCLocation() {
        return alertCLocation;
    }

    /**
     * Legt den Wert der alertCLocation-Eigenschaft fest.
     *
     * @param value allowed object is {@link AlertCLocation }
     */
    public void setAlertCLocation(AlertCLocation value) {
        this.alertCLocation = value;
    }

    /**
     * Ruft den Wert der alertCMethod2PrimaryPointLocationExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getAlertCMethod2PrimaryPointLocationExtension() {
        return alertCMethod2PrimaryPointLocationExtension;
    }

    /**
     * Legt den Wert der alertCMethod2PrimaryPointLocationExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setAlertCMethod2PrimaryPointLocationExtension(ExtensionType value) {
        this.alertCMethod2PrimaryPointLocationExtension = value;
    }

    public AlertCMethod2PrimaryPointLocation withAlertCLocation(AlertCLocation value) {
        setAlertCLocation(value);
        return this;
    }

    public AlertCMethod2PrimaryPointLocation withAlertCMethod2PrimaryPointLocationExtension(ExtensionType value) {
        setAlertCMethod2PrimaryPointLocationExtension(value);
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
