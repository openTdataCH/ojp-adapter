//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.ifopt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für AbstractProjection complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AbstractProjection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Features" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="GisFeatureRef" type="{http://www.ifopt.org.uk/ifopt}FeatureRefStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractProjection", propOrder = {
    "features"
})
@XmlSeeAlso({
    PointProjectionStructure.class,
    LinkProjectionStructure.class,
    ZoneProjectionStructure.class
})
public class AbstractProjection {

    @XmlElement(name = "Features")
    protected AbstractProjection.Features features;

    /**
     * Ruft den Wert der features-Eigenschaft ab.
     *
     * @return possible object is {@link AbstractProjection.Features }
     */
    public AbstractProjection.Features getFeatures() {
        return features;
    }

    /**
     * Legt den Wert der features-Eigenschaft fest.
     *
     * @param value allowed object is {@link AbstractProjection.Features }
     */
    public void setFeatures(AbstractProjection.Features value) {
        this.features = value;
    }

    public AbstractProjection withFeatures(AbstractProjection.Features value) {
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
     *         &lt;element name="GisFeatureRef" type="{http://www.ifopt.org.uk/ifopt}FeatureRefStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gisFeatureRef"
    })
    public static class Features {

        @XmlElement(name = "GisFeatureRef", required = true)
        protected List<FeatureRefStructure> gisFeatureRef;

        /**
         * Gets the value of the gisFeatureRef property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the gisFeatureRef property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGisFeatureRef().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link FeatureRefStructure }
         */
        public List<FeatureRefStructure> getGisFeatureRef() {
            if (gisFeatureRef == null) {
                gisFeatureRef = new ArrayList<FeatureRefStructure>();
            }
            return this.gisFeatureRef;
        }

        public AbstractProjection.Features withGisFeatureRef(FeatureRefStructure... values) {
            if (values != null) {
                for (FeatureRefStructure value : values) {
                    getGisFeatureRef().add(value);
                }
            }
            return this;
        }

        public AbstractProjection.Features withGisFeatureRef(Collection<FeatureRefStructure> values) {
            if (values != null) {
                getGisFeatureRef().addAll(values);
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
