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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Direct position instances hold the coordinates for a position within some coordinate reference system (CRS). Since direct positions, as data types, will often be included in larger objects (such as
 * geometry elements) that have references to CRS, the srsName attribute will in general be missing, if this particular direct position is included in a larger element with such a reference to a CRS.
 * In this case, the CRS is implicitly assumed to take on the value of the containing object's CRS. if no srsName attribute is given, the CRS shall be specified as part of the larger context this
 * geometry element is part of, typically a geometric object like a point, curve, etc.
 *
 * <p>Java-Klasse für DirectPositionType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="DirectPositionType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.opengis.net/gml/3.2&gt;doubleList"&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}SRSReferenceGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectPositionType", propOrder = {
    "value"
})
@XmlSeeAlso({
    VectorType.class
})
public class DirectPositionType {

    @XmlValue
    protected List<Double> value;
    @XmlAttribute(name = "srsName")
    @XmlSchemaType(name = "anyURI")
    protected String srsName;
    @XmlAttribute(name = "srsDimension")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger srsDimension;

    /**
     * A type for a list of values of the respective simple type.Gets the value of the value property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the value property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Double }
     */
    public List<Double> getValue() {
        if (value == null) {
            value = new ArrayList<Double>();
        }
        return this.value;
    }

    /**
     * Ruft den Wert der srsName-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Legt den Wert der srsName-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    /**
     * Ruft den Wert der srsDimension-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getSrsDimension() {
        return srsDimension;
    }

    /**
     * Legt den Wert der srsDimension-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setSrsDimension(BigInteger value) {
        this.srsDimension = value;
    }

    public DirectPositionType withValue(Double... values) {
        if (values != null) {
            for (Double value : values) {
                getValue().add(value);
            }
        }
        return this;
    }

    public DirectPositionType withValue(Collection<Double> values) {
        if (values != null) {
            getValue().addAll(values);
        }
        return this;
    }

    public DirectPositionType withSrsName(String value) {
        setSrsName(value);
        return this;
    }

    public DirectPositionType withSrsDimension(BigInteger value) {
        setSrsDimension(value);
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
