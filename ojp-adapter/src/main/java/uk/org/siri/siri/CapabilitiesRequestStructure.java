//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for Requests for capabilities of the current system.
 * 
 * <p>Java-Klasse für CapabilitiesRequestStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}RequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AbstractFunctionalServiceCapabilitiesRequest"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.1" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesRequestStructure", propOrder = {
    "abstractFunctionalServiceCapabilitiesRequest"
})
public class CapabilitiesRequestStructure
    extends RequestStructure
{

    @XmlElement(name = "AbstractFunctionalServiceCapabilitiesRequest", required = true)
    protected AbstractServiceRequestStructure abstractFunctionalServiceCapabilitiesRequest;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Ruft den Wert der abstractFunctionalServiceCapabilitiesRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractServiceRequestStructure }
     *     
     */
    public AbstractServiceRequestStructure getAbstractFunctionalServiceCapabilitiesRequest() {
        return abstractFunctionalServiceCapabilitiesRequest;
    }

    /**
     * Legt den Wert der abstractFunctionalServiceCapabilitiesRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractServiceRequestStructure }
     *     
     */
    public void setAbstractFunctionalServiceCapabilitiesRequest(AbstractServiceRequestStructure value) {
        this.abstractFunctionalServiceCapabilitiesRequest = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.1";
        } else {
            return version;
        }
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public CapabilitiesRequestStructure withAbstractFunctionalServiceCapabilitiesRequest(AbstractServiceRequestStructure value) {
        setAbstractFunctionalServiceCapabilitiesRequest(value);
        return this;
    }

    public CapabilitiesRequestStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public CapabilitiesRequestStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public CapabilitiesRequestStructure withRequestorRef(ParticipantRefStructure value) {
        setRequestorRef(value);
        return this;
    }

    @Override
    public CapabilitiesRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public CapabilitiesRequestStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public CapabilitiesRequestStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public CapabilitiesRequestStructure withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    @Override
    public CapabilitiesRequestStructure withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    @Override
    public CapabilitiesRequestStructure withRequestTimestamp(ZonedDateTime value) {
        setRequestTimestamp(value);
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
