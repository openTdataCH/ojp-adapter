//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.ExtensionsStructure;

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
 *           &lt;element ref="{http://www.vdv.de/ojp}OJPRequest"/&gt;
 *           &lt;element ref="{http://www.vdv.de/ojp}OJPResponse"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="2.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ojpRequest",
    "ojpResponse",
    "extensions"
})
@XmlRootElement(name = "OJP")
public class OJP {

    @XmlElement(name = "OJPRequest")
    protected OJPRequestStructure ojpRequest;
    @XmlElement(name = "OJPResponse")
    protected OJPResponseStructure ojpResponse;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String version;

    /**
     * Ruft den Wert der ojpRequest-Eigenschaft ab.
     *
     * @return possible object is {@link OJPRequestStructure }
     */
    public OJPRequestStructure getOJPRequest() {
        return ojpRequest;
    }

    /**
     * Legt den Wert der ojpRequest-Eigenschaft fest.
     *
     * @param value allowed object is {@link OJPRequestStructure }
     */
    public void setOJPRequest(OJPRequestStructure value) {
        this.ojpRequest = value;
    }

    /**
     * Ruft den Wert der ojpResponse-Eigenschaft ab.
     *
     * @return possible object is {@link OJPResponseStructure }
     */
    public OJPResponseStructure getOJPResponse() {
        return ojpResponse;
    }

    /**
     * Legt den Wert der ojpResponse-Eigenschaft fest.
     *
     * @param value allowed object is {@link OJPResponseStructure }
     */
    public void setOJPResponse(OJPResponseStructure value) {
        this.ojpResponse = value;
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

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public OJP withOJPRequest(OJPRequestStructure value) {
        setOJPRequest(value);
        return this;
    }

    public OJP withOJPResponse(OJPResponseStructure value) {
        setOJPResponse(value);
        return this;
    }

    public OJP withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    public OJP withVersion(String value) {
        setVersion(value);
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
