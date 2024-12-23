//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.math.BigInteger;
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
 * Type for TRAIN COMPONENT. (since SIRI 2.1)
 * 
 * <p>Java-Klasse für TrainComponentStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrainComponentStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrainComponentCode" type="{http://www.siri.org.uk/siri}TrainComponentCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}TrainComponentGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainComponentStructure", propOrder = {
    "trainComponentCode",
    "order",
    "label",
    "description",
    "trainElementRef",
    "trainElement",
    "reversedOrientation"
})
public class TrainComponentStructure {

    @XmlElement(name = "TrainComponentCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String trainComponentCode;
    @XmlElement(name = "Order", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "Label")
    protected NaturalLanguageStringStructure label;
    @XmlElement(name = "Description")
    protected NaturalLanguageStringStructure description;
    @XmlElement(name = "TrainElementRef")
    protected TrainElementRefStructure trainElementRef;
    @XmlElement(name = "TrainElement")
    protected TrainElementStructure trainElement;
    @XmlElement(name = "ReversedOrientation", defaultValue = "false")
    protected Boolean reversedOrientation;

    /**
     * Ruft den Wert der trainComponentCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainComponentCode() {
        return trainComponentCode;
    }

    /**
     * Legt den Wert der trainComponentCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainComponentCode(String value) {
        this.trainComponentCode = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setLabel(NaturalLanguageStringStructure value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDescription(NaturalLanguageStringStructure value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der trainElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainElementRefStructure }
     *     
     */
    public TrainElementRefStructure getTrainElementRef() {
        return trainElementRef;
    }

    /**
     * Legt den Wert der trainElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainElementRefStructure }
     *     
     */
    public void setTrainElementRef(TrainElementRefStructure value) {
        this.trainElementRef = value;
    }

    /**
     * Ruft den Wert der trainElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainElementStructure }
     *     
     */
    public TrainElementStructure getTrainElement() {
        return trainElement;
    }

    /**
     * Legt den Wert der trainElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainElementStructure }
     *     
     */
    public void setTrainElement(TrainElementStructure value) {
        this.trainElement = value;
    }

    /**
     * Ruft den Wert der reversedOrientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversedOrientation() {
        return reversedOrientation;
    }

    /**
     * Legt den Wert der reversedOrientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversedOrientation(Boolean value) {
        this.reversedOrientation = value;
    }

    public TrainComponentStructure withTrainComponentCode(String value) {
        setTrainComponentCode(value);
        return this;
    }

    public TrainComponentStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    public TrainComponentStructure withLabel(NaturalLanguageStringStructure value) {
        setLabel(value);
        return this;
    }

    public TrainComponentStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    public TrainComponentStructure withTrainElementRef(TrainElementRefStructure value) {
        setTrainElementRef(value);
        return this;
    }

    public TrainComponentStructure withTrainElement(TrainElementStructure value) {
        setTrainElement(value);
        return this;
    }

    public TrainComponentStructure withReversedOrientation(Boolean value) {
        setReversedOrientation(value);
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
