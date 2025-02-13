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
 * Indicates whether passengers have access to adjacent TRAINs or TRAIN COMPONENTs within a COMPOUND TRAIN, i.e., whether passage between those wagons/coaches is possible. (since SIRI 2.1)
 *
 * <p>Java-Klasse für PassageBetweenTrainsStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PassageBetweenTrainsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}TrainRef"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}TrainComponentRef" minOccurs="0"/&gt;
 *         &lt;element name="PassageIsPossible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassageBetweenTrainsStructure", propOrder = {
    "trainRef",
    "trainComponentRef",
    "passageIsPossible"
})
public class PassageBetweenTrainsStructure {

    @XmlElement(name = "TrainRef", required = true)
    protected TrainRefStructure trainRef;
    @XmlElement(name = "TrainComponentRef")
    protected TrainComponentRefStructure trainComponentRef;
    @XmlElement(name = "PassageIsPossible")
    protected boolean passageIsPossible;

    /**
     * Ruft den Wert der trainRef-Eigenschaft ab.
     *
     * @return possible object is {@link TrainRefStructure }
     */
    public TrainRefStructure getTrainRef() {
        return trainRef;
    }

    /**
     * Legt den Wert der trainRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link TrainRefStructure }
     */
    public void setTrainRef(TrainRefStructure value) {
        this.trainRef = value;
    }

    /**
     * Ruft den Wert der trainComponentRef-Eigenschaft ab.
     *
     * @return possible object is {@link TrainComponentRefStructure }
     */
    public TrainComponentRefStructure getTrainComponentRef() {
        return trainComponentRef;
    }

    /**
     * Legt den Wert der trainComponentRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link TrainComponentRefStructure }
     */
    public void setTrainComponentRef(TrainComponentRefStructure value) {
        this.trainComponentRef = value;
    }

    /**
     * Ruft den Wert der passageIsPossible-Eigenschaft ab.
     */
    public boolean isPassageIsPossible() {
        return passageIsPossible;
    }

    /**
     * Legt den Wert der passageIsPossible-Eigenschaft fest.
     */
    public void setPassageIsPossible(boolean value) {
        this.passageIsPossible = value;
    }

    public PassageBetweenTrainsStructure withTrainRef(TrainRefStructure value) {
        setTrainRef(value);
        return this;
    }

    public PassageBetweenTrainsStructure withTrainComponentRef(TrainComponentRefStructure value) {
        setTrainComponentRef(value);
        return this;
    }

    public PassageBetweenTrainsStructure withPassageIsPossible(boolean value) {
        setPassageIsPossible(value);
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
