//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.ZonedDateTime;
import eu.datex2.schema._2_0rc1._2_0.SourceTypeEnum;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;
import uk.org.ifopt.ifopt.CountryRefStructure;


/**
 * Type for a source, i.e. provider of information.
 * 
 * <p>Java-Klasse für SituationSourceStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SituationSourceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Country" type="{http://www.ifopt.org.uk/ifopt}CountryRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="SourceType" type="{http://www.siri.org.uk/siri}SituationSourceTypeEnumeration"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationSourceDetailsGroup"/&gt;
 *         &lt;element name="SourceMethod" type="{http://datex2.eu/schema/2_0RC1/2_0}SourceTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="AgentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/&gt;
 *         &lt;element name="SourceRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeOfCommunication" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExternalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceFile" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationSourceStructure", propOrder = {
    "country",
    "sourceType",
    "email",
    "phone",
    "fax",
    "web",
    "other",
    "sourceMethod",
    "agentReference",
    "name",
    "sourceRole",
    "timeOfCommunication",
    "externalCode",
    "sourceFile",
    "extensions"
})
public class SituationSourceStructure {

    @XmlElement(name = "Country")
    protected CountryRefStructure country;
    @XmlElement(name = "SourceType", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected SituationSourceTypeEnumeration sourceType;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Web")
    @XmlSchemaType(name = "anyURI")
    protected String web;
    @XmlElement(name = "Other")
    protected String other;
    @XmlElement(name = "SourceMethod")
    @XmlSchemaType(name = "string")
    protected SourceTypeEnum sourceMethod;
    @XmlElement(name = "AgentReference")
    protected String agentReference;
    @XmlElement(name = "Name")
    protected NaturalLanguageStringStructure name;
    @XmlElement(name = "SourceRole")
    protected String sourceRole;
    @XmlElement(name = "TimeOfCommunication", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime timeOfCommunication;
    @XmlElement(name = "ExternalCode")
    protected String externalCode;
    @XmlElement(name = "SourceFile")
    @XmlSchemaType(name = "anyURI")
    protected String sourceFile;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der country-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryRefStructure }
     *     
     */
    public CountryRefStructure getCountry() {
        return country;
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRefStructure }
     *     
     */
    public void setCountry(CountryRefStructure value) {
        this.country = value;
    }

    /**
     * Ruft den Wert der sourceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SituationSourceTypeEnumeration }
     *     
     */
    public SituationSourceTypeEnumeration getSourceType() {
        return sourceType;
    }

    /**
     * Legt den Wert der sourceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationSourceTypeEnumeration }
     *     
     */
    public void setSourceType(SituationSourceTypeEnumeration value) {
        this.sourceType = value;
    }

    /**
     * Ruft den Wert der email-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Legt den Wert der email-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Ruft den Wert der phone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Legt den Wert der phone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Ruft den Wert der fax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Legt den Wert der fax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Ruft den Wert der web-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeb() {
        return web;
    }

    /**
     * Legt den Wert der web-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeb(String value) {
        this.web = value;
    }

    /**
     * Ruft den Wert der other-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Legt den Wert der other-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    /**
     * Ruft den Wert der sourceMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SourceTypeEnum }
     *     
     */
    public SourceTypeEnum getSourceMethod() {
        return sourceMethod;
    }

    /**
     * Legt den Wert der sourceMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTypeEnum }
     *     
     */
    public void setSourceMethod(SourceTypeEnum value) {
        this.sourceMethod = value;
    }

    /**
     * Ruft den Wert der agentReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentReference() {
        return agentReference;
    }

    /**
     * Legt den Wert der agentReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentReference(String value) {
        this.agentReference = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setName(NaturalLanguageStringStructure value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der sourceRole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRole() {
        return sourceRole;
    }

    /**
     * Legt den Wert der sourceRole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRole(String value) {
        this.sourceRole = value;
    }

    /**
     * Ruft den Wert der timeOfCommunication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getTimeOfCommunication() {
        return timeOfCommunication;
    }

    /**
     * Legt den Wert der timeOfCommunication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfCommunication(ZonedDateTime value) {
        this.timeOfCommunication = value;
    }

    /**
     * Ruft den Wert der externalCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCode() {
        return externalCode;
    }

    /**
     * Legt den Wert der externalCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCode(String value) {
        this.externalCode = value;
    }

    /**
     * Ruft den Wert der sourceFile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFile() {
        return sourceFile;
    }

    /**
     * Legt den Wert der sourceFile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFile(String value) {
        this.sourceFile = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public SituationSourceStructure withCountry(CountryRefStructure value) {
        setCountry(value);
        return this;
    }

    public SituationSourceStructure withSourceType(SituationSourceTypeEnumeration value) {
        setSourceType(value);
        return this;
    }

    public SituationSourceStructure withEmail(String value) {
        setEmail(value);
        return this;
    }

    public SituationSourceStructure withPhone(String value) {
        setPhone(value);
        return this;
    }

    public SituationSourceStructure withFax(String value) {
        setFax(value);
        return this;
    }

    public SituationSourceStructure withWeb(String value) {
        setWeb(value);
        return this;
    }

    public SituationSourceStructure withOther(String value) {
        setOther(value);
        return this;
    }

    public SituationSourceStructure withSourceMethod(SourceTypeEnum value) {
        setSourceMethod(value);
        return this;
    }

    public SituationSourceStructure withAgentReference(String value) {
        setAgentReference(value);
        return this;
    }

    public SituationSourceStructure withName(NaturalLanguageStringStructure value) {
        setName(value);
        return this;
    }

    public SituationSourceStructure withSourceRole(String value) {
        setSourceRole(value);
        return this;
    }

    public SituationSourceStructure withTimeOfCommunication(ZonedDateTime value) {
        setTimeOfCommunication(value);
        return this;
    }

    public SituationSourceStructure withExternalCode(String value) {
        setExternalCode(value);
        return this;
    }

    public SituationSourceStructure withSourceFile(String value) {
        setSourceFile(value);
        return this;
    }

    public SituationSourceStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
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
