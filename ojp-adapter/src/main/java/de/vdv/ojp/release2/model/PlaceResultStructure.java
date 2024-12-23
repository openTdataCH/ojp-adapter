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
import uk.org.siri.siri.ParticipantRefStructure;


/**
 * <p>Java-Klasse für PlaceResultStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PlaceResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCondition" type="{http://www.vdv.de/ojp}OJPErrorStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Place" type="{http://www.vdv.de/ojp}PlaceStructure"/&gt;
 *         &lt;element name="Complete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Probability" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="System" type="{http://www.siri.org.uk/siri}ParticipantRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="Operators" type="{http://www.vdv.de/ojp}OperatorRefs_RelStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceResultStructure", propOrder = {
    "errorCondition",
    "place",
    "complete",
    "probability",
    "system",
    "operators"
})
public class PlaceResultStructure {

    @XmlElement(name = "ErrorCondition")
    protected List<OJPErrorStructure> errorCondition;
    @XmlElement(name = "Place", required = true)
    protected PlaceStructure place;
    @XmlElement(name = "Complete")
    protected boolean complete;
    @XmlElement(name = "Probability")
    protected Float probability;
    @XmlElement(name = "System")
    protected ParticipantRefStructure system;
    @XmlElement(name = "Operators")
    protected OperatorRefs_RelStructure operators;

    /**
     * Gets the value of the errorCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the errorCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OJPErrorStructure }
     * 
     * 
     */
    public List<OJPErrorStructure> getErrorCondition() {
        if (errorCondition == null) {
            errorCondition = new ArrayList<OJPErrorStructure>();
        }
        return this.errorCondition;
    }

    /**
     * Ruft den Wert der place-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceStructure }
     *     
     */
    public PlaceStructure getPlace() {
        return place;
    }

    /**
     * Legt den Wert der place-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceStructure }
     *     
     */
    public void setPlace(PlaceStructure value) {
        this.place = value;
    }

    /**
     * Ruft den Wert der complete-Eigenschaft ab.
     * 
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * Legt den Wert der complete-Eigenschaft fest.
     * 
     */
    public void setComplete(boolean value) {
        this.complete = value;
    }

    /**
     * Ruft den Wert der probability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProbability() {
        return probability;
    }

    /**
     * Legt den Wert der probability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProbability(Float value) {
        this.probability = value;
    }

    /**
     * Ruft den Wert der system-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getSystem() {
        return system;
    }

    /**
     * Legt den Wert der system-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setSystem(ParticipantRefStructure value) {
        this.system = value;
    }

    /**
     * Ruft den Wert der operators-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefs_RelStructure }
     *     
     */
    public OperatorRefs_RelStructure getOperators() {
        return operators;
    }

    /**
     * Legt den Wert der operators-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefs_RelStructure }
     *     
     */
    public void setOperators(OperatorRefs_RelStructure value) {
        this.operators = value;
    }

    public PlaceResultStructure withErrorCondition(OJPErrorStructure... values) {
        if (values!= null) {
            for (OJPErrorStructure value: values) {
                getErrorCondition().add(value);
            }
        }
        return this;
    }

    public PlaceResultStructure withErrorCondition(Collection<OJPErrorStructure> values) {
        if (values!= null) {
            getErrorCondition().addAll(values);
        }
        return this;
    }

    public PlaceResultStructure withPlace(PlaceStructure value) {
        setPlace(value);
        return this;
    }

    public PlaceResultStructure withComplete(boolean value) {
        setComplete(value);
        return this;
    }

    public PlaceResultStructure withProbability(Float value) {
        setProbability(value);
        return this;
    }

    public PlaceResultStructure withSystem(ParticipantRefStructure value) {
        setSystem(value);
        return this;
    }

    public PlaceResultStructure withOperators(OperatorRefs_RelStructure value) {
        setOperators(value);
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
