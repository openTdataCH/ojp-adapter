//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für RoadOperatorServiceDisruption complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoadOperatorServiceDisruption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NonRoadEventInformation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadOperatorServiceDisruptionType" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadOperatorServiceDisruptionTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="roadOperatorServiceDisruptionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadOperatorServiceDisruption", propOrder = {
    "roadOperatorServiceDisruptionType",
    "roadOperatorServiceDisruptionExtension"
})
public class RoadOperatorServiceDisruption
    extends NonRoadEventInformation
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<RoadOperatorServiceDisruptionTypeEnum> roadOperatorServiceDisruptionType;
    protected ExtensionType roadOperatorServiceDisruptionExtension;

    /**
     * Gets the value of the roadOperatorServiceDisruptionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the roadOperatorServiceDisruptionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadOperatorServiceDisruptionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadOperatorServiceDisruptionTypeEnum }
     * 
     * 
     */
    public List<RoadOperatorServiceDisruptionTypeEnum> getRoadOperatorServiceDisruptionType() {
        if (roadOperatorServiceDisruptionType == null) {
            roadOperatorServiceDisruptionType = new ArrayList<RoadOperatorServiceDisruptionTypeEnum>();
        }
        return this.roadOperatorServiceDisruptionType;
    }

    /**
     * Ruft den Wert der roadOperatorServiceDisruptionExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadOperatorServiceDisruptionExtension() {
        return roadOperatorServiceDisruptionExtension;
    }

    /**
     * Legt den Wert der roadOperatorServiceDisruptionExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadOperatorServiceDisruptionExtension(ExtensionType value) {
        this.roadOperatorServiceDisruptionExtension = value;
    }

    public RoadOperatorServiceDisruption withRoadOperatorServiceDisruptionType(RoadOperatorServiceDisruptionTypeEnum... values) {
        if (values!= null) {
            for (RoadOperatorServiceDisruptionTypeEnum value: values) {
                getRoadOperatorServiceDisruptionType().add(value);
            }
        }
        return this;
    }

    public RoadOperatorServiceDisruption withRoadOperatorServiceDisruptionType(Collection<RoadOperatorServiceDisruptionTypeEnum> values) {
        if (values!= null) {
            getRoadOperatorServiceDisruptionType().addAll(values);
        }
        return this;
    }

    public RoadOperatorServiceDisruption withRoadOperatorServiceDisruptionExtension(ExtensionType value) {
        setRoadOperatorServiceDisruptionExtension(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withNonRoadEventInformationExtension(ExtensionType value) {
        setNonRoadEventInformationExtension(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public RoadOperatorServiceDisruption withId(String value) {
        setId(value);
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
