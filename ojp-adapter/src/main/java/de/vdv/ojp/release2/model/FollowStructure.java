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
 * <p>Java-Klasse für FollowStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FollowStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FollowSignName" type="{http://www.vdv.de/ojp}InternationalTextStructure"/&gt;
 *         &lt;element name="FollowRoadName" type="{http://www.vdv.de/ojp}InternationalTextStructure"/&gt;
 *         &lt;element name="FollowDirectionName" type="{http://www.vdv.de/ojp}InternationalTextStructure"/&gt;
 *         &lt;element name="FollowExit" type="{http://www.vdv.de/ojp}InternationalTextStructure"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FollowStructure", propOrder = {
    "followSignName",
    "followRoadName",
    "followDirectionName",
    "followExit"
})
public class FollowStructure {

    @XmlElement(name = "FollowSignName")
    protected InternationalTextStructure followSignName;
    @XmlElement(name = "FollowRoadName")
    protected InternationalTextStructure followRoadName;
    @XmlElement(name = "FollowDirectionName")
    protected InternationalTextStructure followDirectionName;
    @XmlElement(name = "FollowExit")
    protected InternationalTextStructure followExit;

    /**
     * Ruft den Wert der followSignName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getFollowSignName() {
        return followSignName;
    }

    /**
     * Legt den Wert der followSignName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setFollowSignName(InternationalTextStructure value) {
        this.followSignName = value;
    }

    /**
     * Ruft den Wert der followRoadName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getFollowRoadName() {
        return followRoadName;
    }

    /**
     * Legt den Wert der followRoadName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setFollowRoadName(InternationalTextStructure value) {
        this.followRoadName = value;
    }

    /**
     * Ruft den Wert der followDirectionName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getFollowDirectionName() {
        return followDirectionName;
    }

    /**
     * Legt den Wert der followDirectionName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setFollowDirectionName(InternationalTextStructure value) {
        this.followDirectionName = value;
    }

    /**
     * Ruft den Wert der followExit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getFollowExit() {
        return followExit;
    }

    /**
     * Legt den Wert der followExit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setFollowExit(InternationalTextStructure value) {
        this.followExit = value;
    }

    public FollowStructure withFollowSignName(InternationalTextStructure value) {
        setFollowSignName(value);
        return this;
    }

    public FollowStructure withFollowRoadName(InternationalTextStructure value) {
        setFollowRoadName(value);
        return this;
    }

    public FollowStructure withFollowDirectionName(InternationalTextStructure value) {
        setFollowDirectionName(value);
        return this;
    }

    public FollowStructure withFollowExit(InternationalTextStructure value) {
        setFollowExit(value);
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
