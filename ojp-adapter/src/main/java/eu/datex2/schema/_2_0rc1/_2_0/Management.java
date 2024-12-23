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
 * <p>Java-Klasse für Management complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Management"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lifeCycleManagement" type="{http://datex2.eu/schema/2_0RC1/2_0}LifeCycleManagement" minOccurs="0"/&gt;
 *         &lt;element name="filterExitManagement" type="{http://datex2.eu/schema/2_0RC1/2_0}FilterExitManagement" minOccurs="0"/&gt;
 *         &lt;element name="managementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Management", propOrder = {
    "lifeCycleManagement",
    "filterExitManagement",
    "managementExtension"
})
public class Management {

    protected LifeCycleManagement lifeCycleManagement;
    protected FilterExitManagement filterExitManagement;
    protected ExtensionType managementExtension;

    /**
     * Ruft den Wert der lifeCycleManagement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleManagement }
     *     
     */
    public LifeCycleManagement getLifeCycleManagement() {
        return lifeCycleManagement;
    }

    /**
     * Legt den Wert der lifeCycleManagement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleManagement }
     *     
     */
    public void setLifeCycleManagement(LifeCycleManagement value) {
        this.lifeCycleManagement = value;
    }

    /**
     * Ruft den Wert der filterExitManagement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FilterExitManagement }
     *     
     */
    public FilterExitManagement getFilterExitManagement() {
        return filterExitManagement;
    }

    /**
     * Legt den Wert der filterExitManagement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterExitManagement }
     *     
     */
    public void setFilterExitManagement(FilterExitManagement value) {
        this.filterExitManagement = value;
    }

    /**
     * Ruft den Wert der managementExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getManagementExtension() {
        return managementExtension;
    }

    /**
     * Legt den Wert der managementExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setManagementExtension(ExtensionType value) {
        this.managementExtension = value;
    }

    public Management withLifeCycleManagement(LifeCycleManagement value) {
        setLifeCycleManagement(value);
        return this;
    }

    public Management withFilterExitManagement(FilterExitManagement value) {
        setFilterExitManagement(value);
        return this;
    }

    public Management withManagementExtension(ExtensionType value) {
        setManagementExtension(value);
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
