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
 * List of fare zones within the area of a Fare Authority.
 * 
 * <p>Java-Klasse für TariffZoneListInAreaStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TariffZoneListInAreaStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareAuthorityGroup"/&gt;
 *         &lt;element name="TariffZone" type="{http://www.vdv.de/ojp}TariffZoneStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffZoneListInAreaStructure", propOrder = {
    "fareAuthorityRef",
    "fareAuthorityText",
    "tariffZone"
})
public class TariffZoneListInAreaStructure {

    @XmlElement(name = "FareAuthorityRef", required = true)
    protected FareAuthorityRefStructure fareAuthorityRef;
    @XmlElement(name = "FareAuthorityText", required = true)
    protected String fareAuthorityText;
    @XmlElement(name = "TariffZone", required = true)
    protected List<TariffZoneStructure> tariffZone;

    /**
     * Ruft den Wert der fareAuthorityRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareAuthorityRefStructure }
     *     
     */
    public FareAuthorityRefStructure getFareAuthorityRef() {
        return fareAuthorityRef;
    }

    /**
     * Legt den Wert der fareAuthorityRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareAuthorityRefStructure }
     *     
     */
    public void setFareAuthorityRef(FareAuthorityRefStructure value) {
        this.fareAuthorityRef = value;
    }

    /**
     * Ruft den Wert der fareAuthorityText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareAuthorityText() {
        return fareAuthorityText;
    }

    /**
     * Legt den Wert der fareAuthorityText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareAuthorityText(String value) {
        this.fareAuthorityText = value;
    }

    /**
     * Gets the value of the tariffZone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tariffZone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffZoneStructure }
     * 
     * 
     */
    public List<TariffZoneStructure> getTariffZone() {
        if (tariffZone == null) {
            tariffZone = new ArrayList<TariffZoneStructure>();
        }
        return this.tariffZone;
    }

    public TariffZoneListInAreaStructure withFareAuthorityRef(FareAuthorityRefStructure value) {
        setFareAuthorityRef(value);
        return this;
    }

    public TariffZoneListInAreaStructure withFareAuthorityText(String value) {
        setFareAuthorityText(value);
        return this;
    }

    public TariffZoneListInAreaStructure withTariffZone(TariffZoneStructure... values) {
        if (values!= null) {
            for (TariffZoneStructure value: values) {
                getTariffZone().add(value);
            }
        }
        return this;
    }

    public TariffZoneListInAreaStructure withTariffZone(Collection<TariffZoneStructure> values) {
        if (values!= null) {
            getTariffZone().addAll(values);
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
