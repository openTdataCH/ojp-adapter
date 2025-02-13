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
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.ifopt.LinkProjectionStructure;
import uk.org.ifopt.ifopt.StopPlaceRefStructure;

/**
 * Type for information about the SECTIONs affected by a SITUATION.
 *
 * <p>Java-Klasse für AffectedSectionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AffectedSectionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="SectionRef" type="{http://www.siri.org.uk/siri}SectionRefStructure" minOccurs="0"/&gt;
 *           &lt;element name="IndirectSectionRef"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;choice&gt;
 *                       &lt;element name="FirstStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure"/&gt;
 *                       &lt;element name="FirstStopPlaceRef" type="{http://www.ifopt.org.uk/ifopt}StopPlaceRefStructure"/&gt;
 *                       &lt;element name="FirstQuayRef" type="{http://www.siri.org.uk/siri}QuayRefStructure"/&gt;
 *                     &lt;/choice&gt;
 *                     &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *                       &lt;element name="IntermediateStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure"/&gt;
 *                       &lt;element name="IntermediateStopPlaceRef" type="{http://www.ifopt.org.uk/ifopt}StopPlaceRefStructure"/&gt;
 *                       &lt;element name="IntermediateQuayRef" type="{http://www.siri.org.uk/siri}QuayRefStructure"/&gt;
 *                     &lt;/choice&gt;
 *                     &lt;choice&gt;
 *                       &lt;element name="LastStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure"/&gt;
 *                       &lt;element name="LastStopPlaceRef" type="{http://www.ifopt.org.uk/ifopt}StopPlaceRefStructure"/&gt;
 *                       &lt;element name="LastQuayRef" type="{http://www.siri.org.uk/siri}QuayRefStructure"/&gt;
 *                     &lt;/choice&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ProjectionGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedSectionStructure", propOrder = {
    "sectionRef",
    "indirectSectionRef",
    "linkProjection",
    "offset",
    "extensions"
})
public class AffectedSectionStructure {

    @XmlElement(name = "SectionRef")
    protected SectionRefStructure sectionRef;
    @XmlElement(name = "IndirectSectionRef")
    protected AffectedSectionStructure.IndirectSectionRef indirectSectionRef;
    @XmlElement(name = "LinkProjection")
    protected LinkProjectionStructure linkProjection;
    @XmlElement(name = "Offset")
    protected OffsetStructure offset;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der sectionRef-Eigenschaft ab.
     *
     * @return possible object is {@link SectionRefStructure }
     */
    public SectionRefStructure getSectionRef() {
        return sectionRef;
    }

    /**
     * Legt den Wert der sectionRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link SectionRefStructure }
     */
    public void setSectionRef(SectionRefStructure value) {
        this.sectionRef = value;
    }

    /**
     * Ruft den Wert der indirectSectionRef-Eigenschaft ab.
     *
     * @return possible object is {@link AffectedSectionStructure.IndirectSectionRef }
     */
    public AffectedSectionStructure.IndirectSectionRef getIndirectSectionRef() {
        return indirectSectionRef;
    }

    /**
     * Legt den Wert der indirectSectionRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link AffectedSectionStructure.IndirectSectionRef }
     */
    public void setIndirectSectionRef(AffectedSectionStructure.IndirectSectionRef value) {
        this.indirectSectionRef = value;
    }

    /**
     * Ruft den Wert der linkProjection-Eigenschaft ab.
     *
     * @return possible object is {@link LinkProjectionStructure }
     */
    public LinkProjectionStructure getLinkProjection() {
        return linkProjection;
    }

    /**
     * Legt den Wert der linkProjection-Eigenschaft fest.
     *
     * @param value allowed object is {@link LinkProjectionStructure }
     */
    public void setLinkProjection(LinkProjectionStructure value) {
        this.linkProjection = value;
    }

    /**
     * Ruft den Wert der offset-Eigenschaft ab.
     *
     * @return possible object is {@link OffsetStructure }
     */
    public OffsetStructure getOffset() {
        return offset;
    }

    /**
     * Legt den Wert der offset-Eigenschaft fest.
     *
     * @param value allowed object is {@link OffsetStructure }
     */
    public void setOffset(OffsetStructure value) {
        this.offset = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionsStructure }
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionsStructure }
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public AffectedSectionStructure withSectionRef(SectionRefStructure value) {
        setSectionRef(value);
        return this;
    }

    public AffectedSectionStructure withIndirectSectionRef(AffectedSectionStructure.IndirectSectionRef value) {
        setIndirectSectionRef(value);
        return this;
    }

    public AffectedSectionStructure withLinkProjection(LinkProjectionStructure value) {
        setLinkProjection(value);
        return this;
    }

    public AffectedSectionStructure withOffset(OffsetStructure value) {
        setOffset(value);
        return this;
    }

    public AffectedSectionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
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
     *         &lt;choice&gt;
     *           &lt;element name="FirstStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure"/&gt;
     *           &lt;element name="FirstStopPlaceRef" type="{http://www.ifopt.org.uk/ifopt}StopPlaceRefStructure"/&gt;
     *           &lt;element name="FirstQuayRef" type="{http://www.siri.org.uk/siri}QuayRefStructure"/&gt;
     *         &lt;/choice&gt;
     *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;element name="IntermediateStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure"/&gt;
     *           &lt;element name="IntermediateStopPlaceRef" type="{http://www.ifopt.org.uk/ifopt}StopPlaceRefStructure"/&gt;
     *           &lt;element name="IntermediateQuayRef" type="{http://www.siri.org.uk/siri}QuayRefStructure"/&gt;
     *         &lt;/choice&gt;
     *         &lt;choice&gt;
     *           &lt;element name="LastStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure"/&gt;
     *           &lt;element name="LastStopPlaceRef" type="{http://www.ifopt.org.uk/ifopt}StopPlaceRefStructure"/&gt;
     *           &lt;element name="LastQuayRef" type="{http://www.siri.org.uk/siri}QuayRefStructure"/&gt;
     *         &lt;/choice&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "firstStopPointRef",
        "firstStopPlaceRef",
        "firstQuayRef",
        "intermediateStopPointRefOrIntermediateStopPlaceRefOrIntermediateQuayRef",
        "lastStopPointRef",
        "lastStopPlaceRef",
        "lastQuayRef"
    })
    public static class IndirectSectionRef {

        @XmlElement(name = "FirstStopPointRef")
        protected StopPointRefStructure firstStopPointRef;
        @XmlElement(name = "FirstStopPlaceRef")
        protected StopPlaceRefStructure firstStopPlaceRef;
        @XmlElement(name = "FirstQuayRef")
        protected QuayRefStructure firstQuayRef;
        @XmlElements({
            @XmlElement(name = "IntermediateStopPointRef", type = StopPointRefStructure.class),
            @XmlElement(name = "IntermediateStopPlaceRef", type = StopPlaceRefStructure.class),
            @XmlElement(name = "IntermediateQuayRef", type = QuayRefStructure.class)
        })
        protected List<Object> intermediateStopPointRefOrIntermediateStopPlaceRefOrIntermediateQuayRef;
        @XmlElement(name = "LastStopPointRef")
        protected StopPointRefStructure lastStopPointRef;
        @XmlElement(name = "LastStopPlaceRef")
        protected StopPlaceRefStructure lastStopPlaceRef;
        @XmlElement(name = "LastQuayRef")
        protected QuayRefStructure lastQuayRef;

        /**
         * Ruft den Wert der firstStopPointRef-Eigenschaft ab.
         *
         * @return possible object is {@link StopPointRefStructure }
         */
        public StopPointRefStructure getFirstStopPointRef() {
            return firstStopPointRef;
        }

        /**
         * Legt den Wert der firstStopPointRef-Eigenschaft fest.
         *
         * @param value allowed object is {@link StopPointRefStructure }
         */
        public void setFirstStopPointRef(StopPointRefStructure value) {
            this.firstStopPointRef = value;
        }

        /**
         * Ruft den Wert der firstStopPlaceRef-Eigenschaft ab.
         *
         * @return possible object is {@link StopPlaceRefStructure }
         */
        public StopPlaceRefStructure getFirstStopPlaceRef() {
            return firstStopPlaceRef;
        }

        /**
         * Legt den Wert der firstStopPlaceRef-Eigenschaft fest.
         *
         * @param value allowed object is {@link StopPlaceRefStructure }
         */
        public void setFirstStopPlaceRef(StopPlaceRefStructure value) {
            this.firstStopPlaceRef = value;
        }

        /**
         * Ruft den Wert der firstQuayRef-Eigenschaft ab.
         *
         * @return possible object is {@link QuayRefStructure }
         */
        public QuayRefStructure getFirstQuayRef() {
            return firstQuayRef;
        }

        /**
         * Legt den Wert der firstQuayRef-Eigenschaft fest.
         *
         * @param value allowed object is {@link QuayRefStructure }
         */
        public void setFirstQuayRef(QuayRefStructure value) {
            this.firstQuayRef = value;
        }

        /**
         * Gets the value of the intermediateStopPointRefOrIntermediateStopPlaceRefOrIntermediateQuayRef property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the intermediateStopPointRefOrIntermediateStopPlaceRefOrIntermediateQuayRef property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIntermediateStopPointRefOrIntermediateStopPlaceRefOrIntermediateQuayRef().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link StopPlaceRefStructure } {@link QuayRefStructure } {@link StopPointRefStructure }
         */
        public List<Object> getIntermediateStopPointRefOrIntermediateStopPlaceRefOrIntermediateQuayRef() {
            if (intermediateStopPointRefOrIntermediateStopPlaceRefOrIntermediateQuayRef == null) {
                intermediateStopPointRefOrIntermediateStopPlaceRefOrIntermediateQuayRef = new ArrayList<Object>();
            }
            return this.intermediateStopPointRefOrIntermediateStopPlaceRefOrIntermediateQuayRef;
        }

        /**
         * Ruft den Wert der lastStopPointRef-Eigenschaft ab.
         *
         * @return possible object is {@link StopPointRefStructure }
         */
        public StopPointRefStructure getLastStopPointRef() {
            return lastStopPointRef;
        }

        /**
         * Legt den Wert der lastStopPointRef-Eigenschaft fest.
         *
         * @param value allowed object is {@link StopPointRefStructure }
         */
        public void setLastStopPointRef(StopPointRefStructure value) {
            this.lastStopPointRef = value;
        }

        /**
         * Ruft den Wert der lastStopPlaceRef-Eigenschaft ab.
         *
         * @return possible object is {@link StopPlaceRefStructure }
         */
        public StopPlaceRefStructure getLastStopPlaceRef() {
            return lastStopPlaceRef;
        }

        /**
         * Legt den Wert der lastStopPlaceRef-Eigenschaft fest.
         *
         * @param value allowed object is {@link StopPlaceRefStructure }
         */
        public void setLastStopPlaceRef(StopPlaceRefStructure value) {
            this.lastStopPlaceRef = value;
        }

        /**
         * Ruft den Wert der lastQuayRef-Eigenschaft ab.
         *
         * @return possible object is {@link QuayRefStructure }
         */
        public QuayRefStructure getLastQuayRef() {
            return lastQuayRef;
        }

        /**
         * Legt den Wert der lastQuayRef-Eigenschaft fest.
         *
         * @param value allowed object is {@link QuayRefStructure }
         */
        public void setLastQuayRef(QuayRefStructure value) {
            this.lastQuayRef = value;
        }

        public AffectedSectionStructure.IndirectSectionRef withFirstStopPointRef(StopPointRefStructure value) {
            setFirstStopPointRef(value);
            return this;
        }

        public AffectedSectionStructure.IndirectSectionRef withFirstStopPlaceRef(StopPlaceRefStructure value) {
            setFirstStopPlaceRef(value);
            return this;
        }

        public AffectedSectionStructure.IndirectSectionRef withFirstQuayRef(QuayRefStructure value) {
            setFirstQuayRef(value);
            return this;
        }

        public AffectedSectionStructure.IndirectSectionRef withIntermediateStopPointRefOrIntermediateStopPlaceRefOrIntermediateQuayRef(Object... values) {
            if (values != null) {
                for (Object value : values) {
                    getIntermediateStopPointRefOrIntermediateStopPlaceRefOrIntermediateQuayRef().add(value);
                }
            }
            return this;
        }

        public AffectedSectionStructure.IndirectSectionRef withIntermediateStopPointRefOrIntermediateStopPlaceRefOrIntermediateQuayRef(Collection<Object> values) {
            if (values != null) {
                getIntermediateStopPointRefOrIntermediateStopPlaceRefOrIntermediateQuayRef().addAll(values);
            }
            return this;
        }

        public AffectedSectionStructure.IndirectSectionRef withLastStopPointRef(StopPointRefStructure value) {
            setLastStopPointRef(value);
            return this;
        }

        public AffectedSectionStructure.IndirectSectionRef withLastStopPlaceRef(StopPlaceRefStructure value) {
            setLastStopPlaceRef(value);
            return this;
        }

        public AffectedSectionStructure.IndirectSectionRef withLastQuayRef(QuayRefStructure value) {
            setLastQuayRef(value);
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
