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
 * <p>Java-Klasse für RoadsideServiceDisruption complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoadsideServiceDisruption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NonRoadEventInformation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadsideServiceDisruptionType" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideServiceDisruptionTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="roadsideServiceDisruptionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideServiceDisruption", propOrder = {
    "roadsideServiceDisruptionType",
    "roadsideServiceDisruptionExtension"
})
public class RoadsideServiceDisruption
    extends NonRoadEventInformation
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<RoadsideServiceDisruptionTypeEnum> roadsideServiceDisruptionType;
    protected ExtensionType roadsideServiceDisruptionExtension;

    /**
     * Gets the value of the roadsideServiceDisruptionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the roadsideServiceDisruptionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadsideServiceDisruptionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadsideServiceDisruptionTypeEnum }
     * 
     * 
     */
    public List<RoadsideServiceDisruptionTypeEnum> getRoadsideServiceDisruptionType() {
        if (roadsideServiceDisruptionType == null) {
            roadsideServiceDisruptionType = new ArrayList<RoadsideServiceDisruptionTypeEnum>();
        }
        return this.roadsideServiceDisruptionType;
    }

    /**
     * Ruft den Wert der roadsideServiceDisruptionExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadsideServiceDisruptionExtension() {
        return roadsideServiceDisruptionExtension;
    }

    /**
     * Legt den Wert der roadsideServiceDisruptionExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadsideServiceDisruptionExtension(ExtensionType value) {
        this.roadsideServiceDisruptionExtension = value;
    }

    public RoadsideServiceDisruption withRoadsideServiceDisruptionType(RoadsideServiceDisruptionTypeEnum... values) {
        if (values!= null) {
            for (RoadsideServiceDisruptionTypeEnum value: values) {
                getRoadsideServiceDisruptionType().add(value);
            }
        }
        return this;
    }

    public RoadsideServiceDisruption withRoadsideServiceDisruptionType(Collection<RoadsideServiceDisruptionTypeEnum> values) {
        if (values!= null) {
            getRoadsideServiceDisruptionType().addAll(values);
        }
        return this;
    }

    public RoadsideServiceDisruption withRoadsideServiceDisruptionExtension(ExtensionType value) {
        setRoadsideServiceDisruptionExtension(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withNonRoadEventInformationExtension(ExtensionType value) {
        setNonRoadEventInformationExtension(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadsideServiceDisruption withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public RoadsideServiceDisruption withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadsideServiceDisruption withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public RoadsideServiceDisruption withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadsideServiceDisruption withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public RoadsideServiceDisruption withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public RoadsideServiceDisruption withId(String value) {
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
