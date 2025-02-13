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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * A property that has a point as its value domain may either be an appropriate geometry element encapsulated in an element of this type or an XLink reference to a remote geometry element (where
 * remote includes geometry elements located elsewhere in the same document). Either the reference or the contained element shall be given, but neither both nor none.
 *
 * <p>Java-Klasse für PointPropertyType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PointPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}Point"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointPropertyType", propOrder = {
    "point"
})
public class PointPropertyType {

    @XmlElement(name = "Point")
    protected PointType point;
    @XmlAttribute(name = "nilReason")
    protected List<String> nilReason;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Ruft den Wert der point-Eigenschaft ab.
     *
     * @return possible object is {@link PointType }
     */
    public PointType getPoint() {
        return point;
    }

    /**
     * Legt den Wert der point-Eigenschaft fest.
     *
     * @param value allowed object is {@link PointType }
     */
    public void setPoint(PointType value) {
        this.point = value;
    }

    /**
     * Gets the value of the nilReason property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the nilReason property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
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

    public PointPropertyType withPoint(PointType value) {
        setPoint(value);
        return this;
    }

    public PointPropertyType withNilReason(String... values) {
        if (values != null) {
            for (String value : values) {
                getNilReason().add(value);
            }
        }
        return this;
    }

    public PointPropertyType withNilReason(Collection<String> values) {
        if (values != null) {
            getNilReason().addAll(values);
        }
        return this;
    }

    public PointPropertyType withOwns(Boolean value) {
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
