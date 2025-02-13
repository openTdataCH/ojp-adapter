//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Structure providing response contexts related to journeys, containing collections of places and situations (from Transmodel "view" these are all implementation related aspects of the physical
 * model).
 *
 * <p>Java-Klasse für ResponseContextStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ResponseContextStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Operators" type="{http://www.vdv.de/ojp}Operators_RelStructure" minOccurs="0"/&gt;
 *         &lt;element name="Places" type="{http://www.vdv.de/ojp}PlacesStructure" minOccurs="0"/&gt;
 *         &lt;element name="Situations" type="{http://www.vdv.de/ojp}SituationsStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseContextStructure", propOrder = {
    "operators",
    "places",
    "situations"
})
public class ResponseContextStructure {

    @XmlElement(name = "Operators")
    protected Operators_RelStructure operators;
    @XmlElement(name = "Places")
    protected PlacesStructure places;
    @XmlElement(name = "Situations")
    protected SituationsStructure situations;

    /**
     * Ruft den Wert der operators-Eigenschaft ab.
     *
     * @return possible object is {@link Operators_RelStructure }
     */
    public Operators_RelStructure getOperators() {
        return operators;
    }

    /**
     * Legt den Wert der operators-Eigenschaft fest.
     *
     * @param value allowed object is {@link Operators_RelStructure }
     */
    public void setOperators(Operators_RelStructure value) {
        this.operators = value;
    }

    /**
     * Ruft den Wert der places-Eigenschaft ab.
     *
     * @return possible object is {@link PlacesStructure }
     */
    public PlacesStructure getPlaces() {
        return places;
    }

    /**
     * Legt den Wert der places-Eigenschaft fest.
     *
     * @param value allowed object is {@link PlacesStructure }
     */
    public void setPlaces(PlacesStructure value) {
        this.places = value;
    }

    /**
     * Ruft den Wert der situations-Eigenschaft ab.
     *
     * @return possible object is {@link SituationsStructure }
     */
    public SituationsStructure getSituations() {
        return situations;
    }

    /**
     * Legt den Wert der situations-Eigenschaft fest.
     *
     * @param value allowed object is {@link SituationsStructure }
     */
    public void setSituations(SituationsStructure value) {
        this.situations = value;
    }

    public ResponseContextStructure withOperators(Operators_RelStructure value) {
        setOperators(value);
        return this;
    }

    public ResponseContextStructure withPlaces(PlacesStructure value) {
        setPlaces(value);
        return this;
    }

    public ResponseContextStructure withSituations(SituationsStructure value) {
        setSituations(value);
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
