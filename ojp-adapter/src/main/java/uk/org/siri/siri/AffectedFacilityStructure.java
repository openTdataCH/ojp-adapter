//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

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
 * Type for information about a FACILITY affected by an SITUATION. (since SIRI 2.0)
 * 
 * <p>Java-Klasse für AffectedFacilityStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AffectedFacilityStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FacilityRef" minOccurs="0"/&gt;
 *         &lt;element name="StartStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="EndStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="FacilityName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FacilityStatus" type="{http://www.siri.org.uk/siri}FacilityStatusEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedFacilityStructure", propOrder = {
    "facilityRef",
    "startStopPointRef",
    "endStopPointRef",
    "facilityName",
    "facilityStatus",
    "extensions"
})
public class AffectedFacilityStructure {

    @XmlElement(name = "FacilityRef")
    protected FacilityRefStructure facilityRef;
    @XmlElement(name = "StartStopPointRef")
    protected StopPointRefStructure startStopPointRef;
    @XmlElement(name = "EndStopPointRef")
    protected StopPointRefStructure endStopPointRef;
    @XmlElement(name = "FacilityName")
    protected List<NaturalLanguageStringStructure> facilityName;
    @XmlElement(name = "FacilityStatus")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<FacilityStatusEnumeration> facilityStatus;
    @XmlElement(name = "Extensions")
    protected List<ExtensionsStructure> extensions;

    /**
     * Ruft den Wert der facilityRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FacilityRefStructure }
     *     
     */
    public FacilityRefStructure getFacilityRef() {
        return facilityRef;
    }

    /**
     * Legt den Wert der facilityRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityRefStructure }
     *     
     */
    public void setFacilityRef(FacilityRefStructure value) {
        this.facilityRef = value;
    }

    /**
     * Ruft den Wert der startStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStartStopPointRef() {
        return startStopPointRef;
    }

    /**
     * Legt den Wert der startStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStartStopPointRef(StopPointRefStructure value) {
        this.startStopPointRef = value;
    }

    /**
     * Ruft den Wert der endStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getEndStopPointRef() {
        return endStopPointRef;
    }

    /**
     * Legt den Wert der endStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setEndStopPointRef(StopPointRefStructure value) {
        this.endStopPointRef = value;
    }

    /**
     * Gets the value of the facilityName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the facilityName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getFacilityName() {
        if (facilityName == null) {
            facilityName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.facilityName;
    }

    /**
     * Gets the value of the facilityStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the facilityStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityStatusEnumeration }
     * 
     * 
     */
    public List<FacilityStatusEnumeration> getFacilityStatus() {
        if (facilityStatus == null) {
            facilityStatus = new ArrayList<FacilityStatusEnumeration>();
        }
        return this.facilityStatus;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionsStructure }
     * 
     * 
     */
    public List<ExtensionsStructure> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<ExtensionsStructure>();
        }
        return this.extensions;
    }

    public AffectedFacilityStructure withFacilityRef(FacilityRefStructure value) {
        setFacilityRef(value);
        return this;
    }

    public AffectedFacilityStructure withStartStopPointRef(StopPointRefStructure value) {
        setStartStopPointRef(value);
        return this;
    }

    public AffectedFacilityStructure withEndStopPointRef(StopPointRefStructure value) {
        setEndStopPointRef(value);
        return this;
    }

    public AffectedFacilityStructure withFacilityName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getFacilityName().add(value);
            }
        }
        return this;
    }

    public AffectedFacilityStructure withFacilityName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getFacilityName().addAll(values);
        }
        return this;
    }

    public AffectedFacilityStructure withFacilityStatus(FacilityStatusEnumeration... values) {
        if (values!= null) {
            for (FacilityStatusEnumeration value: values) {
                getFacilityStatus().add(value);
            }
        }
        return this;
    }

    public AffectedFacilityStructure withFacilityStatus(Collection<FacilityStatusEnumeration> values) {
        if (values!= null) {
            getFacilityStatus().addAll(values);
        }
        return this;
    }

    public AffectedFacilityStructure withExtensions(ExtensionsStructure... values) {
        if (values!= null) {
            for (ExtensionsStructure value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    public AffectedFacilityStructure withExtensions(Collection<ExtensionsStructure> values) {
        if (values!= null) {
            getExtensions().addAll(values);
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
