//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für MaintenanceVehicles complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="MaintenanceVehicles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfMaintenanceVehicles" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="maintenanceVehicleActions" type="{http://datex2.eu/schema/2_0RC1/2_0}MaintenanceVehicleActionsEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="maintenanceVehiclesExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceVehicles", propOrder = {
    "numberOfMaintenanceVehicles",
    "maintenanceVehicleActions",
    "maintenanceVehiclesExtension"
})
public class MaintenanceVehicles {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfMaintenanceVehicles;
    @XmlSchemaType(name = "string")
    protected List<MaintenanceVehicleActionsEnum> maintenanceVehicleActions;
    protected ExtensionType maintenanceVehiclesExtension;

    /**
     * Ruft den Wert der numberOfMaintenanceVehicles-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getNumberOfMaintenanceVehicles() {
        return numberOfMaintenanceVehicles;
    }

    /**
     * Legt den Wert der numberOfMaintenanceVehicles-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setNumberOfMaintenanceVehicles(BigInteger value) {
        this.numberOfMaintenanceVehicles = value;
    }

    /**
     * Gets the value of the maintenanceVehicleActions property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the maintenanceVehicleActions property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaintenanceVehicleActions().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link MaintenanceVehicleActionsEnum }
     */
    public List<MaintenanceVehicleActionsEnum> getMaintenanceVehicleActions() {
        if (maintenanceVehicleActions == null) {
            maintenanceVehicleActions = new ArrayList<MaintenanceVehicleActionsEnum>();
        }
        return this.maintenanceVehicleActions;
    }

    /**
     * Ruft den Wert der maintenanceVehiclesExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getMaintenanceVehiclesExtension() {
        return maintenanceVehiclesExtension;
    }

    /**
     * Legt den Wert der maintenanceVehiclesExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setMaintenanceVehiclesExtension(ExtensionType value) {
        this.maintenanceVehiclesExtension = value;
    }

    public MaintenanceVehicles withNumberOfMaintenanceVehicles(BigInteger value) {
        setNumberOfMaintenanceVehicles(value);
        return this;
    }

    public MaintenanceVehicles withMaintenanceVehicleActions(MaintenanceVehicleActionsEnum... values) {
        if (values != null) {
            for (MaintenanceVehicleActionsEnum value : values) {
                getMaintenanceVehicleActions().add(value);
            }
        }
        return this;
    }

    public MaintenanceVehicles withMaintenanceVehicleActions(Collection<MaintenanceVehicleActionsEnum> values) {
        if (values != null) {
            getMaintenanceVehicleActions().addAll(values);
        }
        return this;
    }

    public MaintenanceVehicles withMaintenanceVehiclesExtension(ExtensionType value) {
        setMaintenanceVehiclesExtension(value);
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
