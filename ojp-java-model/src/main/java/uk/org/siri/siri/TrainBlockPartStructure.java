//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.math.BigInteger;
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
 * Type for BLOCK part elements of VEHICLE JOURNEY.
 *
 * <p>Java-Klasse für TrainBlockPartStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TrainBlockPartStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOfBlockParts" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="TrainPartRef" type="{http://www.siri.org.uk/siri}TrainPartRefStructure"/&gt;
 *         &lt;element name="PositionOfTrainBlockPart" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainBlockPartStructure", propOrder = {
    "numberOfBlockParts",
    "trainPartRef",
    "positionOfTrainBlockPart"
})
public class TrainBlockPartStructure {

    @XmlElement(name = "NumberOfBlockParts", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfBlockParts;
    @XmlElement(name = "TrainPartRef", required = true)
    protected TrainPartRefStructure trainPartRef;
    @XmlElement(name = "PositionOfTrainBlockPart")
    protected List<NaturalLanguageStringStructure> positionOfTrainBlockPart;

    /**
     * Ruft den Wert der numberOfBlockParts-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getNumberOfBlockParts() {
        return numberOfBlockParts;
    }

    /**
     * Legt den Wert der numberOfBlockParts-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setNumberOfBlockParts(BigInteger value) {
        this.numberOfBlockParts = value;
    }

    /**
     * Ruft den Wert der trainPartRef-Eigenschaft ab.
     *
     * @return possible object is {@link TrainPartRefStructure }
     */
    public TrainPartRefStructure getTrainPartRef() {
        return trainPartRef;
    }

    /**
     * Legt den Wert der trainPartRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link TrainPartRefStructure }
     */
    public void setTrainPartRef(TrainPartRefStructure value) {
        this.trainPartRef = value;
    }

    /**
     * Gets the value of the positionOfTrainBlockPart property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the positionOfTrainBlockPart property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionOfTrainBlockPart().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getPositionOfTrainBlockPart() {
        if (positionOfTrainBlockPart == null) {
            positionOfTrainBlockPart = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.positionOfTrainBlockPart;
    }

    public TrainBlockPartStructure withNumberOfBlockParts(BigInteger value) {
        setNumberOfBlockParts(value);
        return this;
    }

    public TrainBlockPartStructure withTrainPartRef(TrainPartRefStructure value) {
        setTrainPartRef(value);
        return this;
    }

    public TrainBlockPartStructure withPositionOfTrainBlockPart(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getPositionOfTrainBlockPart().add(value);
            }
        }
        return this;
    }

    public TrainBlockPartStructure withPositionOfTrainBlockPart(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getPositionOfTrainBlockPart().addAll(values);
        }
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
