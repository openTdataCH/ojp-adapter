//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für FilterExitManagement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FilterExitManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filterEnd" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean"/&gt;
 *         &lt;element name="filterOutOfRange" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean"/&gt;
 *         &lt;element name="filterExitManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterExitManagement", propOrder = {
    "filterEnd",
    "filterOutOfRange",
    "filterExitManagementExtension"
})
public class FilterExitManagement {

    protected boolean filterEnd;
    protected boolean filterOutOfRange;
    protected ExtensionType filterExitManagementExtension;

    /**
     * Ruft den Wert der filterEnd-Eigenschaft ab.
     * 
     */
    public boolean isFilterEnd() {
        return filterEnd;
    }

    /**
     * Legt den Wert der filterEnd-Eigenschaft fest.
     * 
     */
    public void setFilterEnd(boolean value) {
        this.filterEnd = value;
    }

    /**
     * Ruft den Wert der filterOutOfRange-Eigenschaft ab.
     * 
     */
    public boolean isFilterOutOfRange() {
        return filterOutOfRange;
    }

    /**
     * Legt den Wert der filterOutOfRange-Eigenschaft fest.
     * 
     */
    public void setFilterOutOfRange(boolean value) {
        this.filterOutOfRange = value;
    }

    /**
     * Ruft den Wert der filterExitManagementExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getFilterExitManagementExtension() {
        return filterExitManagementExtension;
    }

    /**
     * Legt den Wert der filterExitManagementExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setFilterExitManagementExtension(ExtensionType value) {
        this.filterExitManagementExtension = value;
    }

    public FilterExitManagement withFilterEnd(boolean value) {
        setFilterEnd(value);
        return this;
    }

    public FilterExitManagement withFilterOutOfRange(boolean value) {
        setFilterOutOfRange(value);
        return this;
    }

    public FilterExitManagement withFilterExitManagementExtension(ExtensionType value) {
        setFilterExitManagementExtension(value);
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
