//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für LocationByReference complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="LocationByReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Location"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedLocationReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/&gt;
 *         &lt;element name="locationByReferenceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationByReference", propOrder = {
    "predefinedLocationReference",
    "locationByReferenceExtension"
})
public class LocationByReference
    extends Location {

    @XmlElement(required = true)
    protected String predefinedLocationReference;
    protected ExtensionType locationByReferenceExtension;

    /**
     * Ruft den Wert der predefinedLocationReference-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getPredefinedLocationReference() {
        return predefinedLocationReference;
    }

    /**
     * Legt den Wert der predefinedLocationReference-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setPredefinedLocationReference(String value) {
        this.predefinedLocationReference = value;
    }

    /**
     * Ruft den Wert der locationByReferenceExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getLocationByReferenceExtension() {
        return locationByReferenceExtension;
    }

    /**
     * Legt den Wert der locationByReferenceExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setLocationByReferenceExtension(ExtensionType value) {
        this.locationByReferenceExtension = value;
    }

    public LocationByReference withPredefinedLocationReference(String value) {
        setPredefinedLocationReference(value);
        return this;
    }

    public LocationByReference withLocationByReferenceExtension(ExtensionType value) {
        setLocationByReferenceExtension(value);
        return this;
    }

    @Override
    public LocationByReference withExternalReferencing(ExternalReferencing... values) {
        if (values != null) {
            for (ExternalReferencing value : values) {
                getExternalReferencing().add(value);
            }
        }
        return this;
    }

    @Override
    public LocationByReference withExternalReferencing(Collection<ExternalReferencing> values) {
        if (values != null) {
            getExternalReferencing().addAll(values);
        }
        return this;
    }

    @Override
    public LocationByReference withLocationForDisplay(PointCoordinates value) {
        setLocationForDisplay(value);
        return this;
    }

    @Override
    public LocationByReference withLocationExtension(ExtensionType value) {
        setLocationExtension(value);
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
