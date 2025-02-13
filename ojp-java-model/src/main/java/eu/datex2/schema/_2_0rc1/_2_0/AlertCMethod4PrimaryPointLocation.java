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
 * <p>Java-Klasse für AlertCMethod4PrimaryPointLocation complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AlertCMethod4PrimaryPointLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLocation"/&gt;
 *         &lt;element name="offsetDistance" type="{http://datex2.eu/schema/2_0RC1/2_0}OffsetDistance"/&gt;
 *         &lt;element name="alertCMethod4PrimaryPointLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod4PrimaryPointLocation", propOrder = {
    "alertCLocation",
    "offsetDistance",
    "alertCMethod4PrimaryPointLocationExtension"
})
public class AlertCMethod4PrimaryPointLocation {

    @XmlElement(required = true)
    protected AlertCLocation alertCLocation;
    @XmlElement(required = true)
    protected OffsetDistance offsetDistance;
    protected ExtensionType alertCMethod4PrimaryPointLocationExtension;

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
     * Ruft den Wert der offsetDistance-Eigenschaft ab.
     *
     * @return possible object is {@link OffsetDistance }
     */
    public OffsetDistance getOffsetDistance() {
        return offsetDistance;
    }

    /**
     * Legt den Wert der offsetDistance-Eigenschaft fest.
     *
     * @param value allowed object is {@link OffsetDistance }
     */
    public void setOffsetDistance(OffsetDistance value) {
        this.offsetDistance = value;
    }

    /**
     * Ruft den Wert der alertCMethod4PrimaryPointLocationExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getAlertCMethod4PrimaryPointLocationExtension() {
        return alertCMethod4PrimaryPointLocationExtension;
    }

    /**
     * Legt den Wert der alertCMethod4PrimaryPointLocationExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setAlertCMethod4PrimaryPointLocationExtension(ExtensionType value) {
        this.alertCMethod4PrimaryPointLocationExtension = value;
    }

    public AlertCMethod4PrimaryPointLocation withAlertCLocation(AlertCLocation value) {
        setAlertCLocation(value);
        return this;
    }

    public AlertCMethod4PrimaryPointLocation withOffsetDistance(OffsetDistance value) {
        setOffsetDistance(value);
        return this;
    }

    public AlertCMethod4PrimaryPointLocation withAlertCMethod4PrimaryPointLocationExtension(ExtensionType value) {
        setAlertCMethod4PrimaryPointLocationExtension(value);
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
