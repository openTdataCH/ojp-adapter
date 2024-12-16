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
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.VehicleRefStructure;


/**
 * Filter for Vehicles
 * 
 * <p>Java-Klasse für VehicleFilterStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleFilterStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehicleRef" type="{http://www.siri.org.uk/siri}VehicleRefStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TrainNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleFilterStructure", propOrder = {
    "exclude",
    "vehicleRef",
    "trainNumber"
})
public class VehicleFilterStructure {

    @XmlElement(name = "Exclude", defaultValue = "true")
    protected Boolean exclude;
    @XmlElement(name = "VehicleRef")
    protected List<VehicleRefStructure> vehicleRef;
    @XmlElement(name = "TrainNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> trainNumber;

    /**
     * Ruft den Wert der exclude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclude() {
        return exclude;
    }

    /**
     * Legt den Wert der exclude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclude(Boolean value) {
        this.exclude = value;
    }

    /**
     * Gets the value of the vehicleRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRefStructure }
     * 
     * 
     */
    public List<VehicleRefStructure> getVehicleRef() {
        if (vehicleRef == null) {
            vehicleRef = new ArrayList<VehicleRefStructure>();
        }
        return this.vehicleRef;
    }

    /**
     * Gets the value of the trainNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the trainNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTrainNumber() {
        if (trainNumber == null) {
            trainNumber = new ArrayList<String>();
        }
        return this.trainNumber;
    }

    public VehicleFilterStructure withExclude(Boolean value) {
        setExclude(value);
        return this;
    }

    public VehicleFilterStructure withVehicleRef(VehicleRefStructure... values) {
        if (values!= null) {
            for (VehicleRefStructure value: values) {
                getVehicleRef().add(value);
            }
        }
        return this;
    }

    public VehicleFilterStructure withVehicleRef(Collection<VehicleRefStructure> values) {
        if (values!= null) {
            getVehicleRef().addAll(values);
        }
        return this;
    }

    public VehicleFilterStructure withTrainNumber(String... values) {
        if (values!= null) {
            for (String value: values) {
                getTrainNumber().add(value);
            }
        }
        return this;
    }

    public VehicleFilterStructure withTrainNumber(Collection<String> values) {
        if (values!= null) {
            getTrainNumber().addAll(values);
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
