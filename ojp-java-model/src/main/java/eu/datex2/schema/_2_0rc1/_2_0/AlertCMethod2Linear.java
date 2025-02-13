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
 * <p>Java-Klasse für AlertCMethod2Linear complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AlertCMethod2Linear"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLinear"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCDirection" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCDirection"/&gt;
 *         &lt;element name="alertCMethod2PrimaryPointLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCMethod2PrimaryPointLocation"/&gt;
 *         &lt;element name="alertCMethod2SecondaryPointLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCMethod2SecondaryPointLocation"/&gt;
 *         &lt;element name="alertCMethod2LinearExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod2Linear", propOrder = {
    "alertCDirection",
    "alertCMethod2PrimaryPointLocation",
    "alertCMethod2SecondaryPointLocation",
    "alertCMethod2LinearExtension"
})
public class AlertCMethod2Linear
    extends AlertCLinear {

    @XmlElement(required = true)
    protected AlertCDirection alertCDirection;
    @XmlElement(required = true)
    protected AlertCMethod2PrimaryPointLocation alertCMethod2PrimaryPointLocation;
    @XmlElement(required = true)
    protected AlertCMethod2SecondaryPointLocation alertCMethod2SecondaryPointLocation;
    protected ExtensionType alertCMethod2LinearExtension;

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
     * Ruft den Wert der alertCMethod2PrimaryPointLocation-Eigenschaft ab.
     *
     * @return possible object is {@link AlertCMethod2PrimaryPointLocation }
     */
    public AlertCMethod2PrimaryPointLocation getAlertCMethod2PrimaryPointLocation() {
        return alertCMethod2PrimaryPointLocation;
    }

    /**
     * Legt den Wert der alertCMethod2PrimaryPointLocation-Eigenschaft fest.
     *
     * @param value allowed object is {@link AlertCMethod2PrimaryPointLocation }
     */
    public void setAlertCMethod2PrimaryPointLocation(AlertCMethod2PrimaryPointLocation value) {
        this.alertCMethod2PrimaryPointLocation = value;
    }

    /**
     * Ruft den Wert der alertCMethod2SecondaryPointLocation-Eigenschaft ab.
     *
     * @return possible object is {@link AlertCMethod2SecondaryPointLocation }
     */
    public AlertCMethod2SecondaryPointLocation getAlertCMethod2SecondaryPointLocation() {
        return alertCMethod2SecondaryPointLocation;
    }

    /**
     * Legt den Wert der alertCMethod2SecondaryPointLocation-Eigenschaft fest.
     *
     * @param value allowed object is {@link AlertCMethod2SecondaryPointLocation }
     */
    public void setAlertCMethod2SecondaryPointLocation(AlertCMethod2SecondaryPointLocation value) {
        this.alertCMethod2SecondaryPointLocation = value;
    }

    /**
     * Ruft den Wert der alertCMethod2LinearExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getAlertCMethod2LinearExtension() {
        return alertCMethod2LinearExtension;
    }

    /**
     * Legt den Wert der alertCMethod2LinearExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setAlertCMethod2LinearExtension(ExtensionType value) {
        this.alertCMethod2LinearExtension = value;
    }

    public AlertCMethod2Linear withAlertCDirection(AlertCDirection value) {
        setAlertCDirection(value);
        return this;
    }

    public AlertCMethod2Linear withAlertCMethod2PrimaryPointLocation(AlertCMethod2PrimaryPointLocation value) {
        setAlertCMethod2PrimaryPointLocation(value);
        return this;
    }

    public AlertCMethod2Linear withAlertCMethod2SecondaryPointLocation(AlertCMethod2SecondaryPointLocation value) {
        setAlertCMethod2SecondaryPointLocation(value);
        return this;
    }

    public AlertCMethod2Linear withAlertCMethod2LinearExtension(ExtensionType value) {
        setAlertCMethod2LinearExtension(value);
        return this;
    }

    @Override
    public AlertCMethod2Linear withAlertCLocationCountryCode(String value) {
        setAlertCLocationCountryCode(value);
        return this;
    }

    @Override
    public AlertCMethod2Linear withAlertCLocationTableNumber(String value) {
        setAlertCLocationTableNumber(value);
        return this;
    }

    @Override
    public AlertCMethod2Linear withAlertCLocationTableVersion(String value) {
        setAlertCLocationTableVersion(value);
        return this;
    }

    @Override
    public AlertCMethod2Linear withAlertCLinearExtension(ExtensionType value) {
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
