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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for reference to a FEATURE.
 *
 * <p>Java-Klasse für FeatureRefStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="FeatureRefStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeatureIdRef" type="{http://www.ifopt.org.uk/ifopt}FeatureIdRefStructure"/&gt;
 *         &lt;element name="FeatureType" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureRefStructure", propOrder = {
    "featureIdRef",
    "featureType"
})
public class FeatureRefStructure {

    @XmlElement(name = "FeatureIdRef", required = true)
    protected FeatureIdRefStructure featureIdRef;
    @XmlElement(name = "FeatureType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String featureType;

    /**
     * Ruft den Wert der featureIdRef-Eigenschaft ab.
     *
     * @return possible object is {@link FeatureIdRefStructure }
     */
    public FeatureIdRefStructure getFeatureIdRef() {
        return featureIdRef;
    }

    /**
     * Legt den Wert der featureIdRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link FeatureIdRefStructure }
     */
    public void setFeatureIdRef(FeatureIdRefStructure value) {
        this.featureIdRef = value;
    }

    /**
     * Ruft den Wert der featureType-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * Legt den Wert der featureType-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setFeatureType(String value) {
        this.featureType = value;
    }

    public FeatureRefStructure withFeatureIdRef(FeatureIdRefStructure value) {
        setFeatureIdRef(value);
        return this;
    }

    public FeatureRefStructure withFeatureType(String value) {
        setFeatureType(value);
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
