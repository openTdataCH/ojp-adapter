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
 * <p>Java-Klasse für AlertCLinearByCode complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AlertCLinearByCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLinear"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCDirection" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCDirection"/&gt;
 *         &lt;element name="locationCodeForLinearLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLocation"/&gt;
 *         &lt;element name="alertCLinearByCodeExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCLinearByCode", propOrder = {
    "alertCDirection",
    "locationCodeForLinearLocation",
    "alertCLinearByCodeExtension"
})
public class AlertCLinearByCode
    extends AlertCLinear {

    @XmlElement(required = true)
    protected AlertCDirection alertCDirection;
    @XmlElement(required = true)
    protected AlertCLocation locationCodeForLinearLocation;
    protected ExtensionType alertCLinearByCodeExtension;

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
     * Ruft den Wert der locationCodeForLinearLocation-Eigenschaft ab.
     *
     * @return possible object is {@link AlertCLocation }
     */
    public AlertCLocation getLocationCodeForLinearLocation() {
        return locationCodeForLinearLocation;
    }

    /**
     * Legt den Wert der locationCodeForLinearLocation-Eigenschaft fest.
     *
     * @param value allowed object is {@link AlertCLocation }
     */
    public void setLocationCodeForLinearLocation(AlertCLocation value) {
        this.locationCodeForLinearLocation = value;
    }

    /**
     * Ruft den Wert der alertCLinearByCodeExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getAlertCLinearByCodeExtension() {
        return alertCLinearByCodeExtension;
    }

    /**
     * Legt den Wert der alertCLinearByCodeExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setAlertCLinearByCodeExtension(ExtensionType value) {
        this.alertCLinearByCodeExtension = value;
    }

    public AlertCLinearByCode withAlertCDirection(AlertCDirection value) {
        setAlertCDirection(value);
        return this;
    }

    public AlertCLinearByCode withLocationCodeForLinearLocation(AlertCLocation value) {
        setLocationCodeForLinearLocation(value);
        return this;
    }

    public AlertCLinearByCode withAlertCLinearByCodeExtension(ExtensionType value) {
        setAlertCLinearByCodeExtension(value);
        return this;
    }

    @Override
    public AlertCLinearByCode withAlertCLocationCountryCode(String value) {
        setAlertCLocationCountryCode(value);
        return this;
    }

    @Override
    public AlertCLinearByCode withAlertCLocationTableNumber(String value) {
        setAlertCLocationTableNumber(value);
        return this;
    }

    @Override
    public AlertCLinearByCode withAlertCLocationTableVersion(String value) {
        setAlertCLocationTableVersion(value);
        return this;
    }

    @Override
    public AlertCLinearByCode withAlertCLinearExtension(ExtensionType value) {
        setAlertCLinearExtension(value);
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
