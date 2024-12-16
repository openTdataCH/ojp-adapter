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
 * <p>Java-Klasse für AlertCMethod4Linear complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod4Linear"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLinear"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCDirection" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCDirection"/&gt;
 *         &lt;element name="alertCMethod4PrimaryPointLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCMethod4PrimaryPointLocation"/&gt;
 *         &lt;element name="alertCMethod4SecondaryPointLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCMethod4SecondaryPointLocation"/&gt;
 *         &lt;element name="alertCMethod4LinearExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod4Linear", propOrder = {
    "alertCDirection",
    "alertCMethod4PrimaryPointLocation",
    "alertCMethod4SecondaryPointLocation",
    "alertCMethod4LinearExtension"
})
public class AlertCMethod4Linear
    extends AlertCLinear
{

    @XmlElement(required = true)
    protected AlertCDirection alertCDirection;
    @XmlElement(required = true)
    protected AlertCMethod4PrimaryPointLocation alertCMethod4PrimaryPointLocation;
    @XmlElement(required = true)
    protected AlertCMethod4SecondaryPointLocation alertCMethod4SecondaryPointLocation;
    protected ExtensionType alertCMethod4LinearExtension;

    /**
     * Ruft den Wert der alertCDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlertCDirection }
     *     
     */
    public AlertCDirection getAlertCDirection() {
        return alertCDirection;
    }

    /**
     * Legt den Wert der alertCDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCDirection }
     *     
     */
    public void setAlertCDirection(AlertCDirection value) {
        this.alertCDirection = value;
    }

    /**
     * Ruft den Wert der alertCMethod4PrimaryPointLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlertCMethod4PrimaryPointLocation }
     *     
     */
    public AlertCMethod4PrimaryPointLocation getAlertCMethod4PrimaryPointLocation() {
        return alertCMethod4PrimaryPointLocation;
    }

    /**
     * Legt den Wert der alertCMethod4PrimaryPointLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCMethod4PrimaryPointLocation }
     *     
     */
    public void setAlertCMethod4PrimaryPointLocation(AlertCMethod4PrimaryPointLocation value) {
        this.alertCMethod4PrimaryPointLocation = value;
    }

    /**
     * Ruft den Wert der alertCMethod4SecondaryPointLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlertCMethod4SecondaryPointLocation }
     *     
     */
    public AlertCMethod4SecondaryPointLocation getAlertCMethod4SecondaryPointLocation() {
        return alertCMethod4SecondaryPointLocation;
    }

    /**
     * Legt den Wert der alertCMethod4SecondaryPointLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCMethod4SecondaryPointLocation }
     *     
     */
    public void setAlertCMethod4SecondaryPointLocation(AlertCMethod4SecondaryPointLocation value) {
        this.alertCMethod4SecondaryPointLocation = value;
    }

    /**
     * Ruft den Wert der alertCMethod4LinearExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCMethod4LinearExtension() {
        return alertCMethod4LinearExtension;
    }

    /**
     * Legt den Wert der alertCMethod4LinearExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCMethod4LinearExtension(ExtensionType value) {
        this.alertCMethod4LinearExtension = value;
    }

    public AlertCMethod4Linear withAlertCDirection(AlertCDirection value) {
        setAlertCDirection(value);
        return this;
    }

    public AlertCMethod4Linear withAlertCMethod4PrimaryPointLocation(AlertCMethod4PrimaryPointLocation value) {
        setAlertCMethod4PrimaryPointLocation(value);
        return this;
    }

    public AlertCMethod4Linear withAlertCMethod4SecondaryPointLocation(AlertCMethod4SecondaryPointLocation value) {
        setAlertCMethod4SecondaryPointLocation(value);
        return this;
    }

    public AlertCMethod4Linear withAlertCMethod4LinearExtension(ExtensionType value) {
        setAlertCMethod4LinearExtension(value);
        return this;
    }

    @Override
    public AlertCMethod4Linear withAlertCLocationCountryCode(String value) {
        setAlertCLocationCountryCode(value);
        return this;
    }

    @Override
    public AlertCMethod4Linear withAlertCLocationTableNumber(String value) {
        setAlertCLocationTableNumber(value);
        return this;
    }

    @Override
    public AlertCMethod4Linear withAlertCLocationTableVersion(String value) {
        setAlertCLocationTableVersion(value);
        return this;
    }

    @Override
    public AlertCMethod4Linear withAlertCLinearExtension(ExtensionType value) {
        setAlertCLinearExtension(value);
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
