//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.ifopt.ifopt;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * Abstract Type for a versioned object.
 * 
 * <p>Java-Klasse für VersionedObjectStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VersionedObjectStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.ifopt.org.uk/ifopt}RequiredModificationDetailsGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionedObjectStructure")
@XmlSeeAlso({
    DataManagedObjectStructure.class
})
public abstract class VersionedObjectStructure {

    @XmlAttribute(name = "created", required = true)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime created;
    @XmlAttribute(name = "lastUpdated", required = true)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime lastUpdated;
    @XmlAttribute(name = "modification")
    protected ModificationEnumeration modification;
    @XmlAttribute(name = "version")
    protected BigInteger version;
    @XmlAttribute(name = "status")
    protected StatusEnumeration status;

    /**
     * Ruft den Wert der created-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getCreated() {
        return created;
    }

    /**
     * Legt den Wert der created-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(ZonedDateTime value) {
        this.created = value;
    }

    /**
     * Ruft den Wert der lastUpdated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Legt den Wert der lastUpdated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdated(ZonedDateTime value) {
        this.lastUpdated = value;
    }

    /**
     * Ruft den Wert der modification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ModificationEnumeration }
     *     
     */
    public ModificationEnumeration getModification() {
        if (modification == null) {
            return ModificationEnumeration.NEW;
        } else {
            return modification;
        }
    }

    /**
     * Legt den Wert der modification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationEnumeration }
     *     
     */
    public void setModification(ModificationEnumeration value) {
        this.modification = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatusEnumeration }
     *     
     */
    public StatusEnumeration getStatus() {
        if (status == null) {
            return StatusEnumeration.ACTIVE;
        } else {
            return status;
        }
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusEnumeration }
     *     
     */
    public void setStatus(StatusEnumeration value) {
        this.status = value;
    }

    public VersionedObjectStructure withCreated(ZonedDateTime value) {
        setCreated(value);
        return this;
    }

    public VersionedObjectStructure withLastUpdated(ZonedDateTime value) {
        setLastUpdated(value);
        return this;
    }

    public VersionedObjectStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    public VersionedObjectStructure withVersion(BigInteger value) {
        setVersion(value);
        return this;
    }

    public VersionedObjectStructure withStatus(StatusEnumeration value) {
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

}
