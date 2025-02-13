//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.ifopt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for PROJECTION as a geospatial zone.
 *
 * <p>Java-Klasse für ZoneProjectionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ZoneProjectionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}AbstractProjection"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Boundary" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.ifopt.org.uk/ifopt}PointProjection" maxOccurs="unbounded" minOccurs="3"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneProjectionStructure", propOrder = {
    "boundary"
})
public class ZoneProjectionStructure
    extends AbstractProjection {

    @XmlElement(name = "Boundary", required = true)
    protected List<ZoneProjectionStructure.Boundary> boundary;

    /**
     * Gets the value of the boundary property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the boundary property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundary().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ZoneProjectionStructure.Boundary }
     */
    public List<ZoneProjectionStructure.Boundary> getBoundary() {
        if (boundary == null) {
            boundary = new ArrayList<ZoneProjectionStructure.Boundary>();
        }
        return this.boundary;
    }

    public ZoneProjectionStructure withBoundary(ZoneProjectionStructure.Boundary... values) {
        if (values != null) {
            for (ZoneProjectionStructure.Boundary value : values) {
                getBoundary().add(value);
            }
        }
        return this;
    }

    public ZoneProjectionStructure withBoundary(Collection<ZoneProjectionStructure.Boundary> values) {
        if (values != null) {
            getBoundary().addAll(values);
        }
        return this;
    }

    @Override
    public ZoneProjectionStructure withFeatures(AbstractProjection.Features value) {
        setFeatures(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type. This is an extension method, produced by the 'ts' xjc plugin
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

    /**
     * <p>Java-Klasse für anonymous complex type.
     *
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.ifopt.org.uk/ifopt}PointProjection" maxOccurs="unbounded" minOccurs="3"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pointProjection"
    })
    public static class Boundary {

        @XmlElement(name = "PointProjection", required = true)
        protected List<PointProjectionStructure> pointProjection;

        /**
         * Gets the value of the pointProjection property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the pointProjection property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPointProjection().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link PointProjectionStructure }
         */
        public List<PointProjectionStructure> getPointProjection() {
            if (pointProjection == null) {
                pointProjection = new ArrayList<PointProjectionStructure>();
            }
            return this.pointProjection;
        }

        public ZoneProjectionStructure.Boundary withPointProjection(PointProjectionStructure... values) {
            if (values != null) {
                for (PointProjectionStructure value : values) {
                    getPointProjection().add(value);
                }
            }
            return this;
        }

        public ZoneProjectionStructure.Boundary withPointProjection(Collection<PointProjectionStructure> values) {
            if (values != null) {
                getPointProjection().addAll(values);
            }
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

}
