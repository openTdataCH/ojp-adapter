//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * [a more clearly defined equivalent of TARIFF ZONE in TM and NeTEx] A ZONE used to define a zonal fare structure in a zone-counting or zone-matrix system.
 * 
 * <p>Java-Klasse für TariffZoneStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TariffZoneStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}TariffZoneRef"/&gt;
 *         &lt;element name="TariffZoneText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffZoneStructure", propOrder = {
    "tariffZoneRef",
    "tariffZoneText"
})
public class TariffZoneStructure {

    @XmlElement(name = "TariffZoneRef", required = true)
    protected TariffZoneRefStructure tariffZoneRef;
    @XmlElement(name = "TariffZoneText", required = true)
    protected String tariffZoneText;

    /**
     * Ruft den Wert der tariffZoneRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefStructure }
     *     
     */
    public TariffZoneRefStructure getTariffZoneRef() {
        return tariffZoneRef;
    }

    /**
     * Legt den Wert der tariffZoneRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefStructure }
     *     
     */
    public void setTariffZoneRef(TariffZoneRefStructure value) {
        this.tariffZoneRef = value;
    }

    /**
     * Ruft den Wert der tariffZoneText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffZoneText() {
        return tariffZoneText;
    }

    /**
     * Legt den Wert der tariffZoneText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffZoneText(String value) {
        this.tariffZoneText = value;
    }

    public TariffZoneStructure withTariffZoneRef(TariffZoneRefStructure value) {
        setTariffZoneRef(value);
        return this;
    }

    public TariffZoneStructure withTariffZoneText(String value) {
        setTariffZoneText(value);
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
