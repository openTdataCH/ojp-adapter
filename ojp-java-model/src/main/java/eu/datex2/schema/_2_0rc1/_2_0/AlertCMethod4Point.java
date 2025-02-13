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
 * <p>Java-Klasse für AlertCMethod4Point complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AlertCMethod4Point"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}AlertCPoint"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCDirection" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCDirection"/&gt;
 *         &lt;element name="alertCMethod4PrimaryPointLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCMethod4PrimaryPointLocation"/&gt;
 *         &lt;element name="alertCMethod4PointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod4Point", propOrder = {
    "alertCDirection",
    "alertCMethod4PrimaryPointLocation",
    "alertCMethod4PointExtension"
})
public class AlertCMethod4Point
    extends AlertCPoint {

    @XmlElement(required = true)
    protected AlertCDirection alertCDirection;
    @XmlElement(required = true)
    protected AlertCMethod4PrimaryPointLocation alertCMethod4PrimaryPointLocation;
    protected ExtensionType alertCMethod4PointExtension;

    /**
     * Ruft den Wert der alertCDirection-Eigenschaft ab.
     *
     * @return possible object is {@link AlertCDirection }
     */
    public AlertCDirection getAlertCDirection() {
        return alertCDirection;
    }

    /**
     * Legt den Wert der alertCDirection-Eigenschaft fest.
     *
     * @param value allowed object is {@link AlertCDirection }
     */
    public void setAlertCDirection(AlertCDirection value) {
        this.alertCDirection = value;
    }

    /**
     * Ruft den Wert der alertCMethod4PrimaryPointLocation-Eigenschaft ab.
     *
     * @return possible object is {@link AlertCMethod4PrimaryPointLocation }
     */
    public AlertCMethod4PrimaryPointLocation getAlertCMethod4PrimaryPointLocation() {
        return alertCMethod4PrimaryPointLocation;
    }

    /**
     * Legt den Wert der alertCMethod4PrimaryPointLocation-Eigenschaft fest.
     *
     * @param value allowed object is {@link AlertCMethod4PrimaryPointLocation }
     */
    public void setAlertCMethod4PrimaryPointLocation(AlertCMethod4PrimaryPointLocation value) {
        this.alertCMethod4PrimaryPointLocation = value;
    }

    /**
     * Ruft den Wert der alertCMethod4PointExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getAlertCMethod4PointExtension() {
        return alertCMethod4PointExtension;
    }

    /**
     * Legt den Wert der alertCMethod4PointExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setAlertCMethod4PointExtension(ExtensionType value) {
        this.alertCMethod4PointExtension = value;
    }

    public AlertCMethod4Point withAlertCDirection(AlertCDirection value) {
        setAlertCDirection(value);
        return this;
    }

    public AlertCMethod4Point withAlertCMethod4PrimaryPointLocation(AlertCMethod4PrimaryPointLocation value) {
        setAlertCMethod4PrimaryPointLocation(value);
        return this;
    }

    public AlertCMethod4Point withAlertCMethod4PointExtension(ExtensionType value) {
        setAlertCMethod4PointExtension(value);
        return this;
    }

    @Override
    public AlertCMethod4Point withAlertCLocationCountryCode(String value) {
        setAlertCLocationCountryCode(value);
        return this;
    }

    @Override
    public AlertCMethod4Point withAlertCLocationTableNumber(String value) {
        setAlertCLocationTableNumber(value);
        return this;
    }

    @Override
    public AlertCMethod4Point withAlertCLocationTableVersion(String value) {
        setAlertCLocationTableVersion(value);
        return this;
    }

    @Override
    public AlertCMethod4Point withAlertCPointExtension(ExtensionType value) {
        setAlertCPointExtension(value);
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
