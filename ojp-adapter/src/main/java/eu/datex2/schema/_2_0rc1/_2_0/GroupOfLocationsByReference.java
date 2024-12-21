//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für GroupOfLocationsByReference complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupOfLocationsByReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfLocations"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedLocationSetReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/&gt;
 *         &lt;element name="groupOfLocationsByReferenceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfLocationsByReference", propOrder = {
    "predefinedLocationSetReference",
    "groupOfLocationsByReferenceExtension"
})
public class GroupOfLocationsByReference
    extends GroupOfLocations
{

    @XmlElement(required = true)
    protected String predefinedLocationSetReference;
    protected ExtensionType groupOfLocationsByReferenceExtension;

    /**
     * Ruft den Wert der predefinedLocationSetReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredefinedLocationSetReference() {
        return predefinedLocationSetReference;
    }

    /**
     * Legt den Wert der predefinedLocationSetReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredefinedLocationSetReference(String value) {
        this.predefinedLocationSetReference = value;
    }

    /**
     * Ruft den Wert der groupOfLocationsByReferenceExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfLocationsByReferenceExtension() {
        return groupOfLocationsByReferenceExtension;
    }

    /**
     * Legt den Wert der groupOfLocationsByReferenceExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfLocationsByReferenceExtension(ExtensionType value) {
        this.groupOfLocationsByReferenceExtension = value;
    }

    public GroupOfLocationsByReference withPredefinedLocationSetReference(String value) {
        setPredefinedLocationSetReference(value);
        return this;
    }

    public GroupOfLocationsByReference withGroupOfLocationsByReferenceExtension(ExtensionType value) {
        setGroupOfLocationsByReferenceExtension(value);
        return this;
    }

    @Override
    public GroupOfLocationsByReference withGroupOfLocationsExtension(ExtensionType value) {
        setGroupOfLocationsExtension(value);
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
