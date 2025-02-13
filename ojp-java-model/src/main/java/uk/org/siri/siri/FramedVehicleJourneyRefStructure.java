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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for identifer of a VEHICLE JOURNEY within data Horizon of a service.
 *
 * <p>Java-Klasse für FramedVehicleJourneyRefStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="FramedVehicleJourneyRefStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataFrameRef" type="{http://www.siri.org.uk/siri}DataFrameRefStructure"/&gt;
 *         &lt;element name="DatedVehicleJourneyRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FramedVehicleJourneyRefStructure", propOrder = {
    "dataFrameRef",
    "datedVehicleJourneyRef"
})
public class FramedVehicleJourneyRefStructure {

    @XmlElement(name = "DataFrameRef", required = true)
    protected DataFrameRefStructure dataFrameRef;
    @XmlElement(name = "DatedVehicleJourneyRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String datedVehicleJourneyRef;

    /**
     * Ruft den Wert der dataFrameRef-Eigenschaft ab.
     *
     * @return possible object is {@link DataFrameRefStructure }
     */
    public DataFrameRefStructure getDataFrameRef() {
        return dataFrameRef;
    }

    /**
     * Legt den Wert der dataFrameRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link DataFrameRefStructure }
     */
    public void setDataFrameRef(DataFrameRefStructure value) {
        this.dataFrameRef = value;
    }

    /**
     * Ruft den Wert der datedVehicleJourneyRef-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getDatedVehicleJourneyRef() {
        return datedVehicleJourneyRef;
    }

    /**
     * Legt den Wert der datedVehicleJourneyRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setDatedVehicleJourneyRef(String value) {
        this.datedVehicleJourneyRef = value;
    }

    public FramedVehicleJourneyRefStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    public FramedVehicleJourneyRefStructure withDatedVehicleJourneyRef(String value) {
        setDatedVehicleJourneyRef(value);
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
