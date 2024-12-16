//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

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
 * Stop-related Fare information.
 * 
 * <p>Java-Klasse für StopFareResultStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StopFareResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TariffZoneListInArea" type="{http://www.vdv.de/ojp}TariffZoneListInAreaStructure" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopFareResultStructure", propOrder = {
    "tariffZoneListInArea",
    "extension"
})
public class StopFareResultStructure {

    @XmlElement(name = "TariffZoneListInArea", required = true)
    protected List<TariffZoneListInAreaStructure> tariffZoneListInArea;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Gets the value of the tariffZoneListInArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tariffZoneListInArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffZoneListInArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffZoneListInAreaStructure }
     * 
     * 
     */
    public List<TariffZoneListInAreaStructure> getTariffZoneListInArea() {
        if (tariffZoneListInArea == null) {
            tariffZoneListInArea = new ArrayList<TariffZoneListInAreaStructure>();
        }
        return this.tariffZoneListInArea;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public StopFareResultStructure withTariffZoneListInArea(TariffZoneListInAreaStructure... values) {
        if (values!= null) {
            for (TariffZoneListInAreaStructure value: values) {
                getTariffZoneListInArea().add(value);
            }
        }
        return this;
    }

    public StopFareResultStructure withTariffZoneListInArea(Collection<TariffZoneListInAreaStructure> values) {
        if (values!= null) {
            getTariffZoneListInArea().addAll(values);
        }
        return this;
    }

    public StopFareResultStructure withExtension(Object value) {
        setExtension(value);
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
