//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für D2LogicalModel complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="D2LogicalModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exchange" type="{http://datex2.eu/schema/2_0RC1/2_0}Exchange"/&gt;
 *         &lt;element name="payloadPublication" type="{http://datex2.eu/schema/2_0RC1/2_0}PayloadPublication" minOccurs="0"/&gt;
 *         &lt;element name="d2LogicalModelExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="modelBaseVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="2.0RC1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D2LogicalModel", propOrder = {
    "exchange",
    "payloadPublication",
    "d2LogicalModelExtension"
})
public class D2LogicalModel {

    @XmlElement(required = true)
    protected Exchange exchange;
    protected PayloadPublication payloadPublication;
    protected ExtensionType d2LogicalModelExtension;
    @XmlAttribute(name = "modelBaseVersion", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String modelBaseVersion;

    /**
     * Ruft den Wert der exchange-Eigenschaft ab.
     *
     * @return possible object is {@link Exchange }
     */
    public Exchange getExchange() {
        return exchange;
    }

    /**
     * Legt den Wert der exchange-Eigenschaft fest.
     *
     * @param value allowed object is {@link Exchange }
     */
    public void setExchange(Exchange value) {
        this.exchange = value;
    }

    /**
     * Ruft den Wert der payloadPublication-Eigenschaft ab.
     *
     * @return possible object is {@link PayloadPublication }
     */
    public PayloadPublication getPayloadPublication() {
        return payloadPublication;
    }

    /**
     * Legt den Wert der payloadPublication-Eigenschaft fest.
     *
     * @param value allowed object is {@link PayloadPublication }
     */
    public void setPayloadPublication(PayloadPublication value) {
        this.payloadPublication = value;
    }

    /**
     * Ruft den Wert der d2LogicalModelExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getD2LogicalModelExtension() {
        return d2LogicalModelExtension;
    }

    /**
     * Legt den Wert der d2LogicalModelExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setD2LogicalModelExtension(ExtensionType value) {
        this.d2LogicalModelExtension = value;
    }

    /**
     * Ruft den Wert der modelBaseVersion-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getModelBaseVersion() {
        if (modelBaseVersion == null) {
            return "2.0RC1";
        } else {
            return modelBaseVersion;
        }
    }

    /**
     * Legt den Wert der modelBaseVersion-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setModelBaseVersion(String value) {
        this.modelBaseVersion = value;
    }

    public D2LogicalModel withExchange(Exchange value) {
        setExchange(value);
        return this;
    }

    public D2LogicalModel withPayloadPublication(PayloadPublication value) {
        setPayloadPublication(value);
        return this;
    }

    public D2LogicalModel withD2LogicalModelExtension(ExtensionType value) {
        setD2LogicalModelExtension(value);
        return this;
    }

    public D2LogicalModel withModelBaseVersion(String value) {
        setModelBaseVersion(value);
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
