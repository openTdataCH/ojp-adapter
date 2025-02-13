//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Summary information about Facility. Used in DISCOVERY.
 *
 * <p>Java-Klasse für AnnotatedFacilityStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AnnotatedFacilityStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FacilityRef"/&gt;
 *         &lt;element name="Monitored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Facility" type="{http://www.siri.org.uk/siri}FacilityStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotatedFacilityStructure", propOrder = {
    "facilityRef",
    "monitored",
    "facility"
})
public class AnnotatedFacilityStructure {

    @XmlElement(name = "FacilityRef", required = true)
    protected FacilityRefStructure facilityRef;
    @XmlElement(name = "Monitored", defaultValue = "true")
    protected Boolean monitored;
    @XmlElement(name = "Facility")
    protected FacilityStructure facility;

    /**
     * Ruft den Wert der facilityRef-Eigenschaft ab.
     *
     * @return possible object is {@link FacilityRefStructure }
     */
    public FacilityRefStructure getFacilityRef() {
        return facilityRef;
    }

    /**
     * Legt den Wert der facilityRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link FacilityRefStructure }
     */
    public void setFacilityRef(FacilityRefStructure value) {
        this.facilityRef = value;
    }

    /**
     * Ruft den Wert der monitored-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Legt den Wert der monitored-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

    /**
     * Ruft den Wert der facility-Eigenschaft ab.
     *
     * @return possible object is {@link FacilityStructure }
     */
    public FacilityStructure getFacility() {
        return facility;
    }

    /**
     * Legt den Wert der facility-Eigenschaft fest.
     *
     * @param value allowed object is {@link FacilityStructure }
     */
    public void setFacility(FacilityStructure value) {
        this.facility = value;
    }

    public AnnotatedFacilityStructure withFacilityRef(FacilityRefStructure value) {
        setFacilityRef(value);
        return this;
    }

    public AnnotatedFacilityStructure withMonitored(Boolean value) {
        setMonitored(value);
        return this;
    }

    public AnnotatedFacilityStructure withFacility(FacilityStructure value) {
        setFacility(value);
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
