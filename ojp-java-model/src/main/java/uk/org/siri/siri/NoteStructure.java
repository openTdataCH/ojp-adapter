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
 * DataType for a NOTICe.
 *
 * <p>Java-Klasse für NoteStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="NoteStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationSimpleRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationFullRef" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoteStructure", propOrder = {
    "situationRef",
    "situationSimpleRef",
    "situationFullRef",
    "note"
})
public class NoteStructure {

    @XmlElement(name = "SituationRef")
    protected SituationRefStructure situationRef;
    @XmlElement(name = "SituationSimpleRef")
    protected SituationSimpleRefStructure situationSimpleRef;
    @XmlElement(name = "SituationFullRef")
    protected SituationFullRefStructure situationFullRef;
    @XmlElement(name = "Note")
    protected NaturalLanguageStringStructure note;

    /**
     * Ruft den Wert der situationRef-Eigenschaft ab.
     *
     * @return possible object is {@link SituationRefStructure }
     */
    public SituationRefStructure getSituationRef() {
        return situationRef;
    }

    /**
     * Legt den Wert der situationRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link SituationRefStructure }
     */
    public void setSituationRef(SituationRefStructure value) {
        this.situationRef = value;
    }

    /**
     * Ruft den Wert der situationSimpleRef-Eigenschaft ab.
     *
     * @return possible object is {@link SituationSimpleRefStructure }
     */
    public SituationSimpleRefStructure getSituationSimpleRef() {
        return situationSimpleRef;
    }

    /**
     * Legt den Wert der situationSimpleRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link SituationSimpleRefStructure }
     */
    public void setSituationSimpleRef(SituationSimpleRefStructure value) {
        this.situationSimpleRef = value;
    }

    /**
     * Ruft den Wert der situationFullRef-Eigenschaft ab.
     *
     * @return possible object is {@link SituationFullRefStructure }
     */
    public SituationFullRefStructure getSituationFullRef() {
        return situationFullRef;
    }

    /**
     * Legt den Wert der situationFullRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link SituationFullRefStructure }
     */
    public void setSituationFullRef(SituationFullRefStructure value) {
        this.situationFullRef = value;
    }

    /**
     * Ruft den Wert der note-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getNote() {
        return note;
    }

    /**
     * Legt den Wert der note-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setNote(NaturalLanguageStringStructure value) {
        this.note = value;
    }

    public NoteStructure withSituationRef(SituationRefStructure value) {
        setSituationRef(value);
        return this;
    }

    public NoteStructure withSituationSimpleRef(SituationSimpleRefStructure value) {
        setSituationSimpleRef(value);
        return this;
    }

    public NoteStructure withSituationFullRef(SituationFullRefStructure value) {
        setSituationFullRef(value);
        return this;
    }

    public NoteStructure withNote(NaturalLanguageStringStructure value) {
        setNote(value);
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
