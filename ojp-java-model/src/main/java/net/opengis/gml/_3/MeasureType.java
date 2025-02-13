//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package net.opengis.gml._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * gml:MeasureType supports recording an amount encoded as a value of XML Schema double, together with a units of measure indicated by an attribute uom, short for "units of measure". The value of the
 * uom attribute identifies a reference system for the amount, usually a ratio or interval scale.
 *
 * <p>Java-Klasse für MeasureType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="MeasureType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;double"&gt;
 *       &lt;attribute name="uom" use="required" type="{http://www.opengis.net/gml/3.2}UomIdentifier" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureType", propOrder = {
    "value"
})
public class MeasureType {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "uom", required = true)
    protected String uom;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     */
    public double getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der uom-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getUom() {
        return uom;
    }

    /**
     * Legt den Wert der uom-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setUom(String value) {
        this.uom = value;
    }

    public MeasureType withValue(double value) {
        setValue(value);
        return this;
    }

    public MeasureType withUom(String value) {
        setUom(value);
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
