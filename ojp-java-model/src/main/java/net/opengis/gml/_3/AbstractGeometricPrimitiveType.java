//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package net.opengis.gml._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import java.util.Collection;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * gml:AbstractGeometricPrimitiveType is the abstract root type of the geometric primitives. A geometric primitive is a geometric object that is not decomposed further into other primitives in the
 * system. All primitives are oriented in the direction implied by the sequence of their coordinate tuples.
 *
 * <p>Java-Klasse für AbstractGeometricPrimitiveType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AbstractGeometricPrimitiveType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeometryType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeometricPrimitiveType")
@XmlSeeAlso({
    PointType.class,
    AbstractCurveType.class,
    AbstractSurfaceType.class
})
public abstract class AbstractGeometricPrimitiveType
    extends AbstractGeometryType {

    @Override
    public AbstractGeometricPrimitiveType withSrsName(String value) {
        setSrsName(value);
        return this;
    }

    @Override
    public AbstractGeometricPrimitiveType withSrsDimension(BigInteger value) {
        setSrsDimension(value);
        return this;
    }

    @Override
    public AbstractGeometricPrimitiveType withDescriptionReference(ReferenceType value) {
        setDescriptionReference(value);
        return this;
    }

    @Override
    public AbstractGeometricPrimitiveType withIdentifier(CodeWithAuthorityType value) {
        setIdentifier(value);
        return this;
    }

    @Override
    public AbstractGeometricPrimitiveType withName(CodeType... values) {
        if (values != null) {
            for (CodeType value : values) {
                getName().add(value);
            }
        }
        return this;
    }

    @Override
    public AbstractGeometricPrimitiveType withName(Collection<CodeType> values) {
        if (values != null) {
            getName().addAll(values);
        }
        return this;
    }

    @Override
    public AbstractGeometricPrimitiveType withId(String value) {
        setId(value);
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
