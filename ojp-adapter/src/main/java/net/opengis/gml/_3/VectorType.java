//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package net.opengis.gml._3;

import java.math.BigInteger;
import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * For some applications the components of the position may be adjusted to yield a unit vector.
 * 
 * <p>Java-Klasse für VectorType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VectorType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;http://www.opengis.net/gml/3.2&gt;DirectPositionType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VectorType")
public class VectorType
    extends DirectPositionType
{


    @Override
    public VectorType withValue(Double... values) {
        if (values!= null) {
            for (Double value: values) {
                getValue().add(value);
            }
        }
        return this;
    }

    @Override
    public VectorType withValue(Collection<Double> values) {
        if (values!= null) {
            getValue().addAll(values);
        }
        return this;
    }

    @Override
    public VectorType withSrsName(String value) {
        setSrsName(value);
        return this;
    }

    @Override
    public VectorType withSrsDimension(BigInteger value) {
        setSrsDimension(value);
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
