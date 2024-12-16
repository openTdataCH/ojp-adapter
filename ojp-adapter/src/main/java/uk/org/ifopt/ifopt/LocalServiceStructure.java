//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.ifopt.ifopt;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.NaturalLanguageStringStructure;
import uk.org.siri.siri.ServiceFeatureRefStructure;


/**
 * Type for LOCAL SERVICE.
 * 
 * <p>Java-Klasse für LocalServiceStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LocalServiceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}InstalledEquipmentStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}LocalServiceGroup"/&gt;
 *         &lt;element ref="{http://www.ifopt.org.uk/ifopt}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalServiceStructure", propOrder = {
    "validityConditions",
    "featureRefs",
    "extensions"
})
public class LocalServiceStructure
    extends InstalledEquipmentStructure
{

    @XmlElement(name = "ValidityConditions")
    protected ValidityConditionsStructure validityConditions;
    @XmlElement(name = "FeatureRefs")
    protected LocalServiceStructure.FeatureRefs featureRefs;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * Ruft den Wert der validityConditions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidityConditionsStructure }
     *     
     */
    public ValidityConditionsStructure getValidityConditions() {
        return validityConditions;
    }

    /**
     * Legt den Wert der validityConditions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityConditionsStructure }
     *     
     */
    public void setValidityConditions(ValidityConditionsStructure value) {
        this.validityConditions = value;
    }

    /**
     * Ruft den Wert der featureRefs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocalServiceStructure.FeatureRefs }
     *     
     */
    public LocalServiceStructure.FeatureRefs getFeatureRefs() {
        return featureRefs;
    }

    /**
     * Legt den Wert der featureRefs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalServiceStructure.FeatureRefs }
     *     
     */
    public void setFeatureRefs(LocalServiceStructure.FeatureRefs value) {
        this.featureRefs = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    public LocalServiceStructure withValidityConditions(ValidityConditionsStructure value) {
        setValidityConditions(value);
        return this;
    }

    public LocalServiceStructure withFeatureRefs(LocalServiceStructure.FeatureRefs value) {
        setFeatureRefs(value);
        return this;
    }

    public LocalServiceStructure withExtensions(Extensions value) {
        setExtensions(value);
        return this;
    }

    @Override
    public LocalServiceStructure withEquipmentId(String value) {
        setEquipmentId(value);
        return this;
    }

    @Override
    public LocalServiceStructure withEquipmentName(NaturalLanguageStringStructure value) {
        setEquipmentName(value);
        return this;
    }

    @Override
    public LocalServiceStructure withTypeOfEquipment(EquipmentTypeRefStructure value) {
        setTypeOfEquipment(value);
        return this;
    }

    @Override
    public LocalServiceStructure withManagedByAreaRef(AdministrativeAreaRefStructure value) {
        setManagedByAreaRef(value);
        return this;
    }

    @Override
    public LocalServiceStructure withInfoLinks(InfoLinksStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public LocalServiceStructure withCreated(ZonedDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public LocalServiceStructure withLastUpdated(ZonedDateTime value) {
        setLastUpdated(value);
        return this;
    }

    @Override
    public LocalServiceStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public LocalServiceStructure withVersion(BigInteger value) {
        setVersion(value);
        return this;
    }

    @Override
    public LocalServiceStructure withStatus(StatusEnumeration value) {
        setStatus(value);
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
     *         &lt;element name="FeatureRef" type="{http://www.siri.org.uk/siri}ServiceFeatureRefStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "featureRef"
    })
    public static class FeatureRefs {

        @XmlElement(name = "FeatureRef")
        protected List<ServiceFeatureRefStructure> featureRef;

        /**
         * Gets the value of the featureRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the featureRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeatureRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceFeatureRefStructure }
         * 
         * 
         */
        public List<ServiceFeatureRefStructure> getFeatureRef() {
            if (featureRef == null) {
                featureRef = new ArrayList<ServiceFeatureRefStructure>();
            }
            return this.featureRef;
        }

        public LocalServiceStructure.FeatureRefs withFeatureRef(ServiceFeatureRefStructure... values) {
            if (values!= null) {
                for (ServiceFeatureRefStructure value: values) {
                    getFeatureRef().add(value);
                }
            }
            return this;
        }

        public LocalServiceStructure.FeatureRefs withFeatureRef(Collection<ServiceFeatureRefStructure> values) {
            if (values!= null) {
                getFeatureRef().addAll(values);
            }
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

}
