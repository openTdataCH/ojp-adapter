//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.acsb;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for of a specific need.
 *
 * <p>Java-Klasse für UserNeedStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="UserNeedStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/acsb}UserNeedGroup"/&gt;
 *         &lt;element name="Excluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NeedRanking" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Extensions" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserNeedStructure", propOrder = {
    "mobilityNeed",
    "psychosensoryNeed",
    "medicalNeed",
    "encumbranceNeed",
    "excluded",
    "needRanking",
    "extensions"
})
public class UserNeedStructure {

    @XmlElement(name = "MobilityNeed")
    @XmlSchemaType(name = "NMTOKEN")
    protected MobilityEnumeration mobilityNeed;
    @XmlElement(name = "PsychosensoryNeed")
    @XmlSchemaType(name = "NMTOKEN")
    protected PyschosensoryNeedEnumeration psychosensoryNeed;
    @XmlElement(name = "MedicalNeed")
    protected MedicalNeedEnumeration medicalNeed;
    @XmlElement(name = "EncumbranceNeed")
    @XmlSchemaType(name = "NMTOKEN")
    protected EncumbranceEnumeration encumbranceNeed;
    @XmlElement(name = "Excluded")
    protected Boolean excluded;
    @XmlElement(name = "NeedRanking")
    protected BigInteger needRanking;
    @XmlElement(name = "Extensions")
    protected Object extensions;

    /**
     * Ruft den Wert der mobilityNeed-Eigenschaft ab.
     *
     * @return possible object is {@link MobilityEnumeration }
     */
    public MobilityEnumeration getMobilityNeed() {
        return mobilityNeed;
    }

    /**
     * Legt den Wert der mobilityNeed-Eigenschaft fest.
     *
     * @param value allowed object is {@link MobilityEnumeration }
     */
    public void setMobilityNeed(MobilityEnumeration value) {
        this.mobilityNeed = value;
    }

    /**
     * Ruft den Wert der psychosensoryNeed-Eigenschaft ab.
     *
     * @return possible object is {@link PyschosensoryNeedEnumeration }
     */
    public PyschosensoryNeedEnumeration getPsychosensoryNeed() {
        return psychosensoryNeed;
    }

    /**
     * Legt den Wert der psychosensoryNeed-Eigenschaft fest.
     *
     * @param value allowed object is {@link PyschosensoryNeedEnumeration }
     */
    public void setPsychosensoryNeed(PyschosensoryNeedEnumeration value) {
        this.psychosensoryNeed = value;
    }

    /**
     * Ruft den Wert der medicalNeed-Eigenschaft ab.
     *
     * @return possible object is {@link MedicalNeedEnumeration }
     */
    public MedicalNeedEnumeration getMedicalNeed() {
        return medicalNeed;
    }

    /**
     * Legt den Wert der medicalNeed-Eigenschaft fest.
     *
     * @param value allowed object is {@link MedicalNeedEnumeration }
     */
    public void setMedicalNeed(MedicalNeedEnumeration value) {
        this.medicalNeed = value;
    }

    /**
     * Ruft den Wert der encumbranceNeed-Eigenschaft ab.
     *
     * @return possible object is {@link EncumbranceEnumeration }
     */
    public EncumbranceEnumeration getEncumbranceNeed() {
        return encumbranceNeed;
    }

    /**
     * Legt den Wert der encumbranceNeed-Eigenschaft fest.
     *
     * @param value allowed object is {@link EncumbranceEnumeration }
     */
    public void setEncumbranceNeed(EncumbranceEnumeration value) {
        this.encumbranceNeed = value;
    }

    /**
     * Ruft den Wert der excluded-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isExcluded() {
        return excluded;
    }

    /**
     * Legt den Wert der excluded-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setExcluded(Boolean value) {
        this.excluded = value;
    }

    /**
     * Ruft den Wert der needRanking-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getNeedRanking() {
        return needRanking;
    }

    /**
     * Legt den Wert der needRanking-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setNeedRanking(BigInteger value) {
        this.needRanking = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     *
     * @return possible object is {@link Object }
     */
    public Object getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     *
     * @param value allowed object is {@link Object }
     */
    public void setExtensions(Object value) {
        this.extensions = value;
    }

    public UserNeedStructure withMobilityNeed(MobilityEnumeration value) {
        setMobilityNeed(value);
        return this;
    }

    public UserNeedStructure withPsychosensoryNeed(PyschosensoryNeedEnumeration value) {
        setPsychosensoryNeed(value);
        return this;
    }

    public UserNeedStructure withMedicalNeed(MedicalNeedEnumeration value) {
        setMedicalNeed(value);
        return this;
    }

    public UserNeedStructure withEncumbranceNeed(EncumbranceEnumeration value) {
        setEncumbranceNeed(value);
        return this;
    }

    public UserNeedStructure withExcluded(Boolean value) {
        setExcluded(value);
        return this;
    }

    public UserNeedStructure withNeedRanking(BigInteger value) {
        setNeedRanking(value);
        return this;
    }

    public UserNeedStructure withExtensions(Object value) {
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

}
