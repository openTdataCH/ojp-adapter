//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for a circular area centered around a point that may be expressed in concrete WGS 84 Coordinates or any gml compatible point coordinates format. (since SIRI 2.1)
 *
 * <p>Java-Klasse für CircularAreaStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CircularAreaStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}LocationStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Radius" type="{http://www.siri.org.uk/siri}DistanceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CircularAreaStructure", propOrder = {
    "radius"
})
public class CircularAreaStructure
    extends LocationStructure {

    @XmlElement(name = "Radius")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger radius;

    /**
     * Ruft den Wert der radius-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getRadius() {
        return radius;
    }

    /**
     * Legt den Wert der radius-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setRadius(BigInteger value) {
        this.radius = value;
    }

    public CircularAreaStructure withRadius(BigInteger value) {
        setRadius(value);
        return this;
    }

    @Override
    public CircularAreaStructure withLongitude(BigDecimal value) {
        setLongitude(value);
        return this;
    }

    @Override
    public CircularAreaStructure withLatitude(BigDecimal value) {
        setLatitude(value);
        return this;
    }

    @Override
    public CircularAreaStructure withAltitude(BigDecimal value) {
        setAltitude(value);
        return this;
    }

    @Override
    public CircularAreaStructure withCoordinates(CoordinatesStructure value) {
        setCoordinates(value);
        return this;
    }

    @Override
    public CircularAreaStructure withPrecision(BigInteger value) {
        setPrecision(value);
        return this;
    }

    @Override
    public CircularAreaStructure withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public CircularAreaStructure withSrsName(String value) {
        setSrsName(value);
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
