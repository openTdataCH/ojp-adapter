//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Estimation of CO2 emissions.
 * 
 * <p>Java-Klasse für EmissionCO2Structure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EmissionCO2Structure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KilogramPerPersonKm"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ConfidenceLevel" type="{http://www.vdv.de/ojp}Percentage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmissionCO2Structure", propOrder = {
    "kilogramPerPersonKm",
    "confidenceLevel"
})
public class EmissionCO2Structure {

    @XmlElement(name = "KilogramPerPersonKm")
    protected float kilogramPerPersonKm;
    @XmlElement(name = "ConfidenceLevel")
    protected BigDecimal confidenceLevel;

    /**
     * Ruft den Wert der kilogramPerPersonKm-Eigenschaft ab.
     * 
     */
    public float getKilogramPerPersonKm() {
        return kilogramPerPersonKm;
    }

    /**
     * Legt den Wert der kilogramPerPersonKm-Eigenschaft fest.
     * 
     */
    public void setKilogramPerPersonKm(float value) {
        this.kilogramPerPersonKm = value;
    }

    /**
     * Ruft den Wert der confidenceLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConfidenceLevel() {
        return confidenceLevel;
    }

    /**
     * Legt den Wert der confidenceLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConfidenceLevel(BigDecimal value) {
        this.confidenceLevel = value;
    }

    public EmissionCO2Structure withKilogramPerPersonKm(float value) {
        setKilogramPerPersonKm(value);
        return this;
    }

    public EmissionCO2Structure withConfidenceLevel(BigDecimal value) {
        setConfidenceLevel(value);
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
