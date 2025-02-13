//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package net.opengis.gml._3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * If a feature has a property which takes an array of geometry elements as its value, this is called a geometry array property. A generic type for such a geometry property is
 * GeometryArrayPropertyType. The elements are always contained inline in the array property, referencing geometry elements or arrays of geometry elements via XLinks is not supported.
 *
 * <p>Java-Klasse für GeometryArrayPropertyType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GeometryArrayPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractGeometry"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometryArrayPropertyType", propOrder = {
    "abstractGeometry"
})
public class GeometryArrayPropertyType {

    @XmlElementRef(name = "AbstractGeometry", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends AbstractGeometryType>> abstractGeometry;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the abstractGeometry property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the abstractGeometry property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractGeometry().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometricPrimitiveType }{@code >} {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >} {@link JAXBElement }{@code <}{@link LineStringType }{@code >} {@link JAXBElement }{@code <}{@link PointType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     */
    public List<JAXBElement<? extends AbstractGeometryType>> getAbstractGeometry() {
        if (abstractGeometry == null) {
            abstractGeometry = new ArrayList<JAXBElement<? extends AbstractGeometryType>>();
        }
        return this.abstractGeometry;
    }

    /**
     * Ruft den Wert der owns-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Legt den Wert der owns-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setOwns(Boolean value) {
        this.owns = value;
    }

    public GeometryArrayPropertyType withAbstractGeometry(JAXBElement<? extends AbstractGeometryType>... values) {
        if (values != null) {
            for (JAXBElement<? extends AbstractGeometryType> value : values) {
                getAbstractGeometry().add(value);
            }
        }
        return this;
    }

    public GeometryArrayPropertyType withAbstractGeometry(Collection<JAXBElement<? extends AbstractGeometryType>> values) {
        if (values != null) {
            getAbstractGeometry().addAll(values);
        }
        return this;
    }

    public GeometryArrayPropertyType withOwns(Boolean value) {
        setOwns(value);
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
