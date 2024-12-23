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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Combinations of MODE and MODE OF OPERATION that should be covered as monomodal trips (or for the ACCESS LEGs). If no MODE OF OPERATION is added usually "own" is assumed. But the trip planner may add other relevant results (e.g., sharing, if sensible trips are possible).
 * 
 * <p>Java-Klasse für ItModesStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ItModesStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonalMode" type="{http://www.vdv.de/ojp}PersonalModesEnumeration"/&gt;
 *         &lt;element name="PersonalModeOfOperation" type="{http://www.vdv.de/ojp}PersonalModesOfOperationEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AlternativeModeOfOperation" type="{http://www.vdv.de/ojp}AlternativeModesOfOperationEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItModesStructure", propOrder = {
    "personalMode",
    "personalModeOfOperation",
    "alternativeModeOfOperation"
})
public class ItModesStructure {

    @XmlElement(name = "PersonalMode", required = true)
    @XmlSchemaType(name = "string")
    protected PersonalModesEnumeration personalMode;
    @XmlElement(name = "PersonalModeOfOperation")
    @XmlSchemaType(name = "string")
    protected List<PersonalModesOfOperationEnumeration> personalModeOfOperation;
    @XmlElement(name = "AlternativeModeOfOperation")
    @XmlSchemaType(name = "string")
    protected List<AlternativeModesOfOperationEnumeration> alternativeModeOfOperation;

    /**
     * Ruft den Wert der personalMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PersonalModesEnumeration }
     *     
     */
    public PersonalModesEnumeration getPersonalMode() {
        return personalMode;
    }

    /**
     * Legt den Wert der personalMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalModesEnumeration }
     *     
     */
    public void setPersonalMode(PersonalModesEnumeration value) {
        this.personalMode = value;
    }

    /**
     * Gets the value of the personalModeOfOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the personalModeOfOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalModeOfOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalModesOfOperationEnumeration }
     * 
     * 
     */
    public List<PersonalModesOfOperationEnumeration> getPersonalModeOfOperation() {
        if (personalModeOfOperation == null) {
            personalModeOfOperation = new ArrayList<PersonalModesOfOperationEnumeration>();
        }
        return this.personalModeOfOperation;
    }

    /**
     * Gets the value of the alternativeModeOfOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeModeOfOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeModeOfOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternativeModesOfOperationEnumeration }
     * 
     * 
     */
    public List<AlternativeModesOfOperationEnumeration> getAlternativeModeOfOperation() {
        if (alternativeModeOfOperation == null) {
            alternativeModeOfOperation = new ArrayList<AlternativeModesOfOperationEnumeration>();
        }
        return this.alternativeModeOfOperation;
    }

    public ItModesStructure withPersonalMode(PersonalModesEnumeration value) {
        setPersonalMode(value);
        return this;
    }

    public ItModesStructure withPersonalModeOfOperation(PersonalModesOfOperationEnumeration... values) {
        if (values!= null) {
            for (PersonalModesOfOperationEnumeration value: values) {
                getPersonalModeOfOperation().add(value);
            }
        }
        return this;
    }

    public ItModesStructure withPersonalModeOfOperation(Collection<PersonalModesOfOperationEnumeration> values) {
        if (values!= null) {
            getPersonalModeOfOperation().addAll(values);
        }
        return this;
    }

    public ItModesStructure withAlternativeModeOfOperation(AlternativeModesOfOperationEnumeration... values) {
        if (values!= null) {
            for (AlternativeModesOfOperationEnumeration value: values) {
                getAlternativeModeOfOperation().add(value);
            }
        }
        return this;
    }

    public ItModesStructure withAlternativeModeOfOperation(Collection<AlternativeModesOfOperationEnumeration> values) {
        if (values!= null) {
            getAlternativeModeOfOperation().addAll(values);
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
