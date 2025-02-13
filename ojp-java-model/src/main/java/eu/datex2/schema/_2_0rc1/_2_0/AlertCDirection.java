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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für AlertCDirection complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AlertCDirection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCDirectionCoded" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCDirectionEnum"/&gt;
 *         &lt;element name="alertCDirectionNamed" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="alertCDirectionSense" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="alertCDirectionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCDirection", propOrder = {
    "alertCDirectionCoded",
    "alertCDirectionNamed",
    "alertCDirectionSense",
    "alertCDirectionExtension"
})
public class AlertCDirection {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AlertCDirectionEnum alertCDirectionCoded;
    protected MultilingualString alertCDirectionNamed;
    protected Boolean alertCDirectionSense;
    protected ExtensionType alertCDirectionExtension;

    /**
     * Ruft den Wert der alertCDirectionCoded-Eigenschaft ab.
     *
     * @return possible object is {@link AlertCDirectionEnum }
     */
    public AlertCDirectionEnum getAlertCDirectionCoded() {
        return alertCDirectionCoded;
    }

    /**
     * Legt den Wert der alertCDirectionCoded-Eigenschaft fest.
     *
     * @param value allowed object is {@link AlertCDirectionEnum }
     */
    public void setAlertCDirectionCoded(AlertCDirectionEnum value) {
        this.alertCDirectionCoded = value;
    }

    /**
     * Ruft den Wert der alertCDirectionNamed-Eigenschaft ab.
     *
     * @return possible object is {@link MultilingualString }
     */
    public MultilingualString getAlertCDirectionNamed() {
        return alertCDirectionNamed;
    }

    /**
     * Legt den Wert der alertCDirectionNamed-Eigenschaft fest.
     *
     * @param value allowed object is {@link MultilingualString }
     */
    public void setAlertCDirectionNamed(MultilingualString value) {
        this.alertCDirectionNamed = value;
    }

    /**
     * Ruft den Wert der alertCDirectionSense-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isAlertCDirectionSense() {
        return alertCDirectionSense;
    }

    /**
     * Legt den Wert der alertCDirectionSense-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setAlertCDirectionSense(Boolean value) {
        this.alertCDirectionSense = value;
    }

    /**
     * Ruft den Wert der alertCDirectionExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getAlertCDirectionExtension() {
        return alertCDirectionExtension;
    }

    /**
     * Legt den Wert der alertCDirectionExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setAlertCDirectionExtension(ExtensionType value) {
        this.alertCDirectionExtension = value;
    }

    public AlertCDirection withAlertCDirectionCoded(AlertCDirectionEnum value) {
        setAlertCDirectionCoded(value);
        return this;
    }

    public AlertCDirection withAlertCDirectionNamed(MultilingualString value) {
        setAlertCDirectionNamed(value);
        return this;
    }

    public AlertCDirection withAlertCDirectionSense(Boolean value) {
        setAlertCDirectionSense(value);
        return this;
    }

    public AlertCDirection withAlertCDirectionExtension(ExtensionType value) {
        setAlertCDirectionExtension(value);
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
