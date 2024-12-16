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
 * Type for PROJECTION as a geospatial polyline.
 * 
 * <p>Java-Klasse für LinkProjectionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LinkProjectionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}AbstractProjection"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Line" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.ifopt.org.uk/ifopt}PointProjection" maxOccurs="unbounded" minOccurs="2"/&gt;
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
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkProjectionStructure", propOrder = {
    "line"
})
public class LinkProjectionStructure
    extends AbstractProjection
{

    @XmlElement(name = "Line")
    protected LinkProjectionStructure.Line line;

    /**
     * Ruft den Wert der line-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinkProjectionStructure.Line }
     *     
     */
    public LinkProjectionStructure.Line getLine() {
        return line;
    }

    /**
     * Legt den Wert der line-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkProjectionStructure.Line }
     *     
     */
    public void setLine(LinkProjectionStructure.Line value) {
        this.line = value;
    }

    public LinkProjectionStructure withLine(LinkProjectionStructure.Line value) {
        setLine(value);
        return this;
    }

    @Override
    public LinkProjectionStructure withFeatures(AbstractProjection.Features value) {
        setFeatures(value);
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
     *         &lt;element ref="{http://www.ifopt.org.uk/ifopt}PointProjection" maxOccurs="unbounded" minOccurs="2"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pointProjection"
    })
    public static class Line {

        @XmlElement(name = "PointProjection", required = true)
        protected List<PointProjectionStructure> pointProjection;

        /**
         * Gets the value of the pointProjection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
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
         * Objects of the following type(s) are allowed in the list
         * {@link PointProjectionStructure }
         * 
         * 
         */
        public List<PointProjectionStructure> getPointProjection() {
            if (pointProjection == null) {
                pointProjection = new ArrayList<PointProjectionStructure>();
            }
            return this.pointProjection;
        }

        public LinkProjectionStructure.Line withPointProjection(PointProjectionStructure... values) {
            if (values!= null) {
                for (PointProjectionStructure value: values) {
                    getPointProjection().add(value);
                }
            }
            return this;
        }

        public LinkProjectionStructure.Line withPointProjection(Collection<PointProjectionStructure> values) {
            if (values!= null) {
                getPointProjection().addAll(values);
            }
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

}
