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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for a TRAIN IN COMPOUND TRAIN. (since SIRI 2.1)
 *
 * <p>Java-Klasse für TrainInCompoundTrainStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TrainInCompoundTrainStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrainInCompoundTrainCode" type="{http://www.siri.org.uk/siri}TrainInCompoundTrainCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}TrainInCompoundTrainGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainInCompoundTrainStructure", propOrder = {
    "trainInCompoundTrainCode",
    "order",
    "label",
    "description",
    "trainRef",
    "train",
    "originRef",
    "originName",
    "originShortName",
    "destinationDisplayAtOrigin",
    "via",
    "destinationRef",
    "destinationName",
    "destinationShortName",
    "originDisplayAtDestination",
    "reversedOrientation",
    "passages"
})
public class TrainInCompoundTrainStructure {

    @XmlElement(name = "TrainInCompoundTrainCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String trainInCompoundTrainCode;
    @XmlElement(name = "Order", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "Label")
    protected NaturalLanguageStringStructure label;
    @XmlElement(name = "Description")
    protected NaturalLanguageStringStructure description;
    @XmlElement(name = "TrainRef")
    protected TrainRefStructure trainRef;
    @XmlElement(name = "Train")
    protected TrainStructure train;
    @XmlElement(name = "OriginRef")
    protected JourneyPlaceRefStructure originRef;
    @XmlElement(name = "OriginName")
    protected List<NaturalLanguagePlaceNameStructure> originName;
    @XmlElement(name = "OriginShortName")
    protected List<NaturalLanguagePlaceNameStructure> originShortName;
    @XmlElement(name = "DestinationDisplayAtOrigin")
    protected List<NaturalLanguagePlaceNameStructure> destinationDisplayAtOrigin;
    @XmlElement(name = "Via")
    protected List<ViaNameStructure> via;
    @XmlElement(name = "DestinationRef")
    protected DestinationRefStructure destinationRef;
    @XmlElement(name = "DestinationName")
    protected List<NaturalLanguageStringStructure> destinationName;
    @XmlElement(name = "DestinationShortName")
    protected List<NaturalLanguagePlaceNameStructure> destinationShortName;
    @XmlElement(name = "OriginDisplayAtDestination")
    protected List<NaturalLanguagePlaceNameStructure> originDisplayAtDestination;
    @XmlElement(name = "ReversedOrientation", defaultValue = "false")
    protected Boolean reversedOrientation;
    @XmlElement(name = "Passages")
    protected TrainInCompoundTrainStructure.Passages passages;

    /**
     * Ruft den Wert der trainInCompoundTrainCode-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getTrainInCompoundTrainCode() {
        return trainInCompoundTrainCode;
    }

    /**
     * Legt den Wert der trainInCompoundTrainCode-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setTrainInCompoundTrainCode(String value) {
        this.trainInCompoundTrainCode = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setLabel(NaturalLanguageStringStructure value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setDescription(NaturalLanguageStringStructure value) {
        this.description = value;
    }

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
     * Ruft den Wert der train-Eigenschaft ab.
     *
     * @return possible object is {@link TrainStructure }
     */
    public TrainStructure getTrain() {
        return train;
    }

    /**
     * Legt den Wert der train-Eigenschaft fest.
     *
     * @param value allowed object is {@link TrainStructure }
     */
    public void setTrain(TrainStructure value) {
        this.train = value;
    }

    /**
     * Ruft den Wert der originRef-Eigenschaft ab.
     *
     * @return possible object is {@link JourneyPlaceRefStructure }
     */
    public JourneyPlaceRefStructure getOriginRef() {
        return originRef;
    }

    /**
     * Legt den Wert der originRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link JourneyPlaceRefStructure }
     */
    public void setOriginRef(JourneyPlaceRefStructure value) {
        this.originRef = value;
    }

    /**
     * Gets the value of the originName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the originName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguagePlaceNameStructure }
     */
    public List<NaturalLanguagePlaceNameStructure> getOriginName() {
        if (originName == null) {
            originName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.originName;
    }

    /**
     * Gets the value of the originShortName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the originShortName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginShortName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguagePlaceNameStructure }
     */
    public List<NaturalLanguagePlaceNameStructure> getOriginShortName() {
        if (originShortName == null) {
            originShortName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.originShortName;
    }

    /**
     * Gets the value of the destinationDisplayAtOrigin property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the destinationDisplayAtOrigin property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationDisplayAtOrigin().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguagePlaceNameStructure }
     */
    public List<NaturalLanguagePlaceNameStructure> getDestinationDisplayAtOrigin() {
        if (destinationDisplayAtOrigin == null) {
            destinationDisplayAtOrigin = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.destinationDisplayAtOrigin;
    }

    /**
     * Gets the value of the via property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the via property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVia().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ViaNameStructure }
     */
    public List<ViaNameStructure> getVia() {
        if (via == null) {
            via = new ArrayList<ViaNameStructure>();
        }
        return this.via;
    }

    /**
     * Reference to a DESTINATION.
     *
     * @return possible object is {@link DestinationRefStructure }
     */
    public DestinationRefStructure getDestinationRef() {
        return destinationRef;
    }

    /**
     * Legt den Wert der destinationRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link DestinationRefStructure }
     */
    public void setDestinationRef(DestinationRefStructure value) {
        this.destinationRef = value;
    }

    /**
     * Gets the value of the destinationName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the destinationName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getDestinationName() {
        if (destinationName == null) {
            destinationName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.destinationName;
    }

    /**
     * Gets the value of the destinationShortName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the destinationShortName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationShortName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguagePlaceNameStructure }
     */
    public List<NaturalLanguagePlaceNameStructure> getDestinationShortName() {
        if (destinationShortName == null) {
            destinationShortName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.destinationShortName;
    }

    /**
     * Gets the value of the originDisplayAtDestination property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the originDisplayAtDestination property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDisplayAtDestination().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguagePlaceNameStructure }
     */
    public List<NaturalLanguagePlaceNameStructure> getOriginDisplayAtDestination() {
        if (originDisplayAtDestination == null) {
            originDisplayAtDestination = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.originDisplayAtDestination;
    }

    /**
     * Ruft den Wert der reversedOrientation-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isReversedOrientation() {
        return reversedOrientation;
    }

    /**
     * Legt den Wert der reversedOrientation-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setReversedOrientation(Boolean value) {
        this.reversedOrientation = value;
    }

    /**
     * Ruft den Wert der passages-Eigenschaft ab.
     *
     * @return possible object is {@link TrainInCompoundTrainStructure.Passages }
     */
    public TrainInCompoundTrainStructure.Passages getPassages() {
        return passages;
    }

    /**
     * Legt den Wert der passages-Eigenschaft fest.
     *
     * @param value allowed object is {@link TrainInCompoundTrainStructure.Passages }
     */
    public void setPassages(TrainInCompoundTrainStructure.Passages value) {
        this.passages = value;
    }

    public TrainInCompoundTrainStructure withTrainInCompoundTrainCode(String value) {
        setTrainInCompoundTrainCode(value);
        return this;
    }

    public TrainInCompoundTrainStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    public TrainInCompoundTrainStructure withLabel(NaturalLanguageStringStructure value) {
        setLabel(value);
        return this;
    }

    public TrainInCompoundTrainStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    public TrainInCompoundTrainStructure withTrainRef(TrainRefStructure value) {
        setTrainRef(value);
        return this;
    }

    public TrainInCompoundTrainStructure withTrain(TrainStructure value) {
        setTrain(value);
        return this;
    }

    public TrainInCompoundTrainStructure withOriginRef(JourneyPlaceRefStructure value) {
        setOriginRef(value);
        return this;
    }

    public TrainInCompoundTrainStructure withOriginName(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getOriginName().add(value);
            }
        }
        return this;
    }

    public TrainInCompoundTrainStructure withOriginName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getOriginName().addAll(values);
        }
        return this;
    }

    public TrainInCompoundTrainStructure withOriginShortName(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getOriginShortName().add(value);
            }
        }
        return this;
    }

    public TrainInCompoundTrainStructure withOriginShortName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getOriginShortName().addAll(values);
        }
        return this;
    }

    public TrainInCompoundTrainStructure withDestinationDisplayAtOrigin(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getDestinationDisplayAtOrigin().add(value);
            }
        }
        return this;
    }

    public TrainInCompoundTrainStructure withDestinationDisplayAtOrigin(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getDestinationDisplayAtOrigin().addAll(values);
        }
        return this;
    }

    public TrainInCompoundTrainStructure withVia(ViaNameStructure... values) {
        if (values != null) {
            for (ViaNameStructure value : values) {
                getVia().add(value);
            }
        }
        return this;
    }

    public TrainInCompoundTrainStructure withVia(Collection<ViaNameStructure> values) {
        if (values != null) {
            getVia().addAll(values);
        }
        return this;
    }

    public TrainInCompoundTrainStructure withDestinationRef(DestinationRefStructure value) {
        setDestinationRef(value);
        return this;
    }

    public TrainInCompoundTrainStructure withDestinationName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getDestinationName().add(value);
            }
        }
        return this;
    }

    public TrainInCompoundTrainStructure withDestinationName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getDestinationName().addAll(values);
        }
        return this;
    }

    public TrainInCompoundTrainStructure withDestinationShortName(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getDestinationShortName().add(value);
            }
        }
        return this;
    }

    public TrainInCompoundTrainStructure withDestinationShortName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getDestinationShortName().addAll(values);
        }
        return this;
    }

    public TrainInCompoundTrainStructure withOriginDisplayAtDestination(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getOriginDisplayAtDestination().add(value);
            }
        }
        return this;
    }

    public TrainInCompoundTrainStructure withOriginDisplayAtDestination(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getOriginDisplayAtDestination().addAll(values);
        }
        return this;
    }

    public TrainInCompoundTrainStructure withReversedOrientation(Boolean value) {
        setReversedOrientation(value);
        return this;
    }

    public TrainInCompoundTrainStructure withPassages(TrainInCompoundTrainStructure.Passages value) {
        setPassages(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type. This is an extension method, produced by the 'ts' xjc plugin
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

    /**
     * <p>Java-Klasse für anonymous complex type.
     *
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PassageBetweenTrains" type="{http://www.siri.org.uk/siri}PassageBetweenTrainsStructure" maxOccurs="2"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "passageBetweenTrains"
    })
    public static class Passages {

        @XmlElement(name = "PassageBetweenTrains", required = true)
        protected List<PassageBetweenTrainsStructure> passageBetweenTrains;

        /**
         * Gets the value of the passageBetweenTrains property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the passageBetweenTrains property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassageBetweenTrains().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link PassageBetweenTrainsStructure }
         */
        public List<PassageBetweenTrainsStructure> getPassageBetweenTrains() {
            if (passageBetweenTrains == null) {
                passageBetweenTrains = new ArrayList<PassageBetweenTrainsStructure>();
            }
            return this.passageBetweenTrains;
        }

        public TrainInCompoundTrainStructure.Passages withPassageBetweenTrains(PassageBetweenTrainsStructure... values) {
            if (values != null) {
                for (PassageBetweenTrainsStructure value : values) {
                    getPassageBetweenTrains().add(value);
                }
            }
            return this;
        }

        public TrainInCompoundTrainStructure.Passages withPassageBetweenTrains(Collection<PassageBetweenTrainsStructure> values) {
            if (values != null) {
                getPassageBetweenTrains().addAll(values);
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

}
