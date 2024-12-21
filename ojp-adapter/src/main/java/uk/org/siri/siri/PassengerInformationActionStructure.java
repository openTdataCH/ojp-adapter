//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * <p>Java-Klasse für PassengerInformationActionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerInformationActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ParameterisedActionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionRef" type="{http://www.siri.org.uk/siri}EntryQualifierStructure"/&gt;
 *         &lt;element name="RecordedAtTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Version" type="{http://www.siri.org.uk/siri}SituationVersion" minOccurs="0"/&gt;
 *         &lt;element name="SourceRef" type="{http://www.siri.org.uk/siri}ParticipantRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="OwnerRef" type="{http://www.siri.org.uk/siri}OrganisationRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="Perspective" type="{http://www.siri.org.uk/siri}PerspectiveEnumeration" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ActionPriority" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="TextualContent" type="{http://www.siri.org.uk/siri}TextualContentStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerInformationActionStructure", propOrder = {
    "actionRef",
    "recordedAtTime",
    "version",
    "sourceRef",
    "ownerRef",
    "perspective",
    "actionPriority",
    "textualContent"
})
public class PassengerInformationActionStructure
    extends ParameterisedActionStructure
{

    @XmlElement(name = "ActionRef", required = true)
    protected EntryQualifierStructure actionRef;
    @XmlElement(name = "RecordedAtTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime recordedAtTime;
    @XmlElement(name = "Version")
    protected SituationVersion version;
    @XmlElement(name = "SourceRef")
    protected ParticipantRefStructure sourceRef;
    @XmlElement(name = "OwnerRef")
    protected OrganisationRefStructure ownerRef;
    @XmlElement(name = "Perspective", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected List<PerspectiveEnumeration> perspective;
    @XmlElement(name = "ActionPriority")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger actionPriority;
    @XmlElement(name = "TextualContent", required = true)
    protected List<TextualContentStructure> textualContent;

    /**
     * Ruft den Wert der actionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntryQualifierStructure }
     *     
     */
    public EntryQualifierStructure getActionRef() {
        return actionRef;
    }

    /**
     * Legt den Wert der actionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryQualifierStructure }
     *     
     */
    public void setActionRef(EntryQualifierStructure value) {
        this.actionRef = value;
    }

    /**
     * Ruft den Wert der recordedAtTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getRecordedAtTime() {
        return recordedAtTime;
    }

    /**
     * Legt den Wert der recordedAtTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordedAtTime(ZonedDateTime value) {
        this.recordedAtTime = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SituationVersion }
     *     
     */
    public SituationVersion getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationVersion }
     *     
     */
    public void setVersion(SituationVersion value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der sourceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getSourceRef() {
        return sourceRef;
    }

    /**
     * Legt den Wert der sourceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setSourceRef(ParticipantRefStructure value) {
        this.sourceRef = value;
    }

    /**
     * Ruft den Wert der ownerRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationRefStructure }
     *     
     */
    public OrganisationRefStructure getOwnerRef() {
        return ownerRef;
    }

    /**
     * Legt den Wert der ownerRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationRefStructure }
     *     
     */
    public void setOwnerRef(OrganisationRefStructure value) {
        this.ownerRef = value;
    }

    /**
     * Gets the value of the perspective property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the perspective property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerspective().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerspectiveEnumeration }
     * 
     * 
     */
    public List<PerspectiveEnumeration> getPerspective() {
        if (perspective == null) {
            perspective = new ArrayList<PerspectiveEnumeration>();
        }
        return this.perspective;
    }

    /**
     * Ruft den Wert der actionPriority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActionPriority() {
        return actionPriority;
    }

    /**
     * Legt den Wert der actionPriority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActionPriority(BigInteger value) {
        this.actionPriority = value;
    }

    /**
     * Gets the value of the textualContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the textualContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextualContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextualContentStructure }
     * 
     * 
     */
    public List<TextualContentStructure> getTextualContent() {
        if (textualContent == null) {
            textualContent = new ArrayList<TextualContentStructure>();
        }
        return this.textualContent;
    }

    public PassengerInformationActionStructure withActionRef(EntryQualifierStructure value) {
        setActionRef(value);
        return this;
    }

    public PassengerInformationActionStructure withRecordedAtTime(ZonedDateTime value) {
        setRecordedAtTime(value);
        return this;
    }

    public PassengerInformationActionStructure withVersion(SituationVersion value) {
        setVersion(value);
        return this;
    }

    public PassengerInformationActionStructure withSourceRef(ParticipantRefStructure value) {
        setSourceRef(value);
        return this;
    }

    public PassengerInformationActionStructure withOwnerRef(OrganisationRefStructure value) {
        setOwnerRef(value);
        return this;
    }

    public PassengerInformationActionStructure withPerspective(PerspectiveEnumeration... values) {
        if (values!= null) {
            for (PerspectiveEnumeration value: values) {
                getPerspective().add(value);
            }
        }
        return this;
    }

    public PassengerInformationActionStructure withPerspective(Collection<PerspectiveEnumeration> values) {
        if (values!= null) {
            getPerspective().addAll(values);
        }
        return this;
    }

    public PassengerInformationActionStructure withActionPriority(BigInteger value) {
        setActionPriority(value);
        return this;
    }

    public PassengerInformationActionStructure withTextualContent(TextualContentStructure... values) {
        if (values!= null) {
            for (TextualContentStructure value: values) {
                getTextualContent().add(value);
            }
        }
        return this;
    }

    public PassengerInformationActionStructure withTextualContent(Collection<TextualContentStructure> values) {
        if (values!= null) {
            getTextualContent().addAll(values);
        }
        return this;
    }

    @Override
    public PassengerInformationActionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    @Override
    public PassengerInformationActionStructure withActionData(ActionDataStructure... values) {
        if (values!= null) {
            for (ActionDataStructure value: values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    @Override
    public PassengerInformationActionStructure withActionData(Collection<ActionDataStructure> values) {
        if (values!= null) {
            getActionData().addAll(values);
        }
        return this;
    }

    @Override
    public PassengerInformationActionStructure withPublicationWindow(ClosedTimestampRangeStructure... values) {
        if (values!= null) {
            for (ClosedTimestampRangeStructure value: values) {
                getPublicationWindow().add(value);
            }
        }
        return this;
    }

    @Override
    public PassengerInformationActionStructure withPublicationWindow(Collection<ClosedTimestampRangeStructure> values) {
        if (values!= null) {
            getPublicationWindow().addAll(values);
        }
        return this;
    }

    @Override
    public PassengerInformationActionStructure withActionStatus(ActionStatusEnumeration value) {
        setActionStatus(value);
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
