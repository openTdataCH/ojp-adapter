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
 * <p>Java-Klasse für AlertCArea complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AlertCArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCLocationCountryCode" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="alertCLocationTableNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="alertCLocationTableVersion" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="areaLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLocation"/&gt;
 *         &lt;element name="alertCAreaExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCArea", propOrder = {
    "alertCLocationCountryCode",
    "alertCLocationTableNumber",
    "alertCLocationTableVersion",
    "areaLocation",
    "alertCAreaExtension"
})
public class AlertCArea {

    @XmlElement(required = true)
    protected String alertCLocationCountryCode;
    @XmlElement(required = true)
    protected String alertCLocationTableNumber;
    @XmlElement(required = true)
    protected String alertCLocationTableVersion;
    @XmlElement(required = true)
    protected AlertCLocation areaLocation;
    protected ExtensionType alertCAreaExtension;

    /**
     * Ruft den Wert der alertCLocationCountryCode-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getAlertCLocationCountryCode() {
        return alertCLocationCountryCode;
    }

    /**
     * Legt den Wert der alertCLocationCountryCode-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setAlertCLocationCountryCode(String value) {
        this.alertCLocationCountryCode = value;
    }

    /**
     * Ruft den Wert der alertCLocationTableNumber-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getAlertCLocationTableNumber() {
        return alertCLocationTableNumber;
    }

    /**
     * Legt den Wert der alertCLocationTableNumber-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setAlertCLocationTableNumber(String value) {
        this.alertCLocationTableNumber = value;
    }

    /**
     * Ruft den Wert der alertCLocationTableVersion-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getAlertCLocationTableVersion() {
        return alertCLocationTableVersion;
    }

    /**
     * Legt den Wert der alertCLocationTableVersion-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setAlertCLocationTableVersion(String value) {
        this.alertCLocationTableVersion = value;
    }

    /**
     * Ruft den Wert der areaLocation-Eigenschaft ab.
     *
     * @return possible object is {@link AlertCLocation }
     */
    public AlertCLocation getAreaLocation() {
        return areaLocation;
    }

    /**
     * Legt den Wert der areaLocation-Eigenschaft fest.
     *
     * @param value allowed object is {@link AlertCLocation }
     */
    public void setAreaLocation(AlertCLocation value) {
        this.areaLocation = value;
    }

    /**
     * Ruft den Wert der alertCAreaExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getAlertCAreaExtension() {
        return alertCAreaExtension;
    }

    /**
     * Legt den Wert der alertCAreaExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setAlertCAreaExtension(ExtensionType value) {
        this.alertCAreaExtension = value;
    }

    public AlertCArea withAlertCLocationCountryCode(String value) {
        setAlertCLocationCountryCode(value);
        return this;
    }

    public AlertCArea withAlertCLocationTableNumber(String value) {
        setAlertCLocationTableNumber(value);
        return this;
    }

    public AlertCArea withAlertCLocationTableVersion(String value) {
        setAlertCLocationTableVersion(value);
        return this;
    }

    public AlertCArea withAreaLocation(AlertCLocation value) {
        setAreaLocation(value);
        return this;
    }

    public AlertCArea withAlertCAreaExtension(ExtensionType value) {
        setAlertCAreaExtension(value);
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
