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
import java.math.BigInteger;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für AlertCLocation complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AlertCLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCLocationName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="specificLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLocationCode"/&gt;
 *         &lt;element name="alertCLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCLocation", propOrder = {
    "alertCLocationName",
    "specificLocation",
    "alertCLocationExtension"
})
public class AlertCLocation {

    protected MultilingualString alertCLocationName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger specificLocation;
    protected ExtensionType alertCLocationExtension;

    /**
     * Ruft den Wert der alertCLocationName-Eigenschaft ab.
     *
     * @return possible object is {@link MultilingualString }
     */
    public MultilingualString getAlertCLocationName() {
        return alertCLocationName;
    }

    /**
     * Legt den Wert der alertCLocationName-Eigenschaft fest.
     *
     * @param value allowed object is {@link MultilingualString }
     */
    public void setAlertCLocationName(MultilingualString value) {
        this.alertCLocationName = value;
    }

    /**
     * Ruft den Wert der specificLocation-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getSpecificLocation() {
        return specificLocation;
    }

    /**
     * Legt den Wert der specificLocation-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setSpecificLocation(BigInteger value) {
        this.specificLocation = value;
    }

    /**
     * Ruft den Wert der alertCLocationExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getAlertCLocationExtension() {
        return alertCLocationExtension;
    }

    /**
     * Legt den Wert der alertCLocationExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setAlertCLocationExtension(ExtensionType value) {
        this.alertCLocationExtension = value;
    }

    public AlertCLocation withAlertCLocationName(MultilingualString value) {
        setAlertCLocationName(value);
        return this;
    }

    public AlertCLocation withSpecificLocation(BigInteger value) {
        setSpecificLocation(value);
        return this;
    }

    public AlertCLocation withAlertCLocationExtension(ExtensionType value) {
        setAlertCLocationExtension(value);
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
