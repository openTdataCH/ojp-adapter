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
 * <p>Java-Klasse für FilterReference complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="FilterReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deleteFilter" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="filterOperationApproved" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="keyFilterReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/&gt;
 *         &lt;element name="filterReferenceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterReference", propOrder = {
    "deleteFilter",
    "filterOperationApproved",
    "keyFilterReference",
    "filterReferenceExtension"
})
public class FilterReference {

    protected Boolean deleteFilter;
    protected Boolean filterOperationApproved;
    @XmlElement(required = true)
    protected String keyFilterReference;
    protected ExtensionType filterReferenceExtension;

    /**
     * Ruft den Wert der deleteFilter-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isDeleteFilter() {
        return deleteFilter;
    }

    /**
     * Legt den Wert der deleteFilter-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setDeleteFilter(Boolean value) {
        this.deleteFilter = value;
    }

    /**
     * Ruft den Wert der filterOperationApproved-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isFilterOperationApproved() {
        return filterOperationApproved;
    }

    /**
     * Legt den Wert der filterOperationApproved-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setFilterOperationApproved(Boolean value) {
        this.filterOperationApproved = value;
    }

    /**
     * Ruft den Wert der keyFilterReference-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getKeyFilterReference() {
        return keyFilterReference;
    }

    /**
     * Legt den Wert der keyFilterReference-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setKeyFilterReference(String value) {
        this.keyFilterReference = value;
    }

    /**
     * Ruft den Wert der filterReferenceExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getFilterReferenceExtension() {
        return filterReferenceExtension;
    }

    /**
     * Legt den Wert der filterReferenceExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setFilterReferenceExtension(ExtensionType value) {
        this.filterReferenceExtension = value;
    }

    public FilterReference withDeleteFilter(Boolean value) {
        setDeleteFilter(value);
        return this;
    }

    public FilterReference withFilterOperationApproved(Boolean value) {
        setFilterOperationApproved(value);
        return this;
    }

    public FilterReference withKeyFilterReference(String value) {
        setKeyFilterReference(value);
        return this;
    }

    public FilterReference withFilterReferenceExtension(ExtensionType value) {
        setFilterReferenceExtension(value);
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
