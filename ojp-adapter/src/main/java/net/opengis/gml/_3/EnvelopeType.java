//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package net.opengis.gml._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für EnvelopeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnvelopeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="lowerCorner" type="{http://www.opengis.net/gml/3.2}DirectPositionType"/&gt;
 *           &lt;element name="upperCorner" type="{http://www.opengis.net/gml/3.2}DirectPositionType"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}pos" maxOccurs="2" minOccurs="2"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}SRSReferenceGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvelopeType", propOrder = {
    "lowerCorner",
    "upperCorner",
    "pos"
})
public class EnvelopeType {

    protected DirectPositionType lowerCorner;
    protected DirectPositionType upperCorner;
    protected List<DirectPositionType> pos;
    @XmlAttribute(name = "srsName")
    @XmlSchemaType(name = "anyURI")
    protected String srsName;
    @XmlAttribute(name = "srsDimension")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger srsDimension;

    /**
     * Ruft den Wert der lowerCorner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getLowerCorner() {
        return lowerCorner;
    }

    /**
     * Legt den Wert der lowerCorner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setLowerCorner(DirectPositionType value) {
        this.lowerCorner = value;
    }

    /**
     * Ruft den Wert der upperCorner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getUpperCorner() {
        return upperCorner;
    }

    /**
     * Legt den Wert der upperCorner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setUpperCorner(DirectPositionType value) {
        this.upperCorner = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectPositionType }
     * 
     * 
     */
    public List<DirectPositionType> getPos() {
        if (pos == null) {
            pos = new ArrayList<DirectPositionType>();
        }
        return this.pos;
    }

    /**
     * Ruft den Wert der srsName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Legt den Wert der srsName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    /**
     * Ruft den Wert der srsDimension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSrsDimension() {
        return srsDimension;
    }

    /**
     * Legt den Wert der srsDimension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSrsDimension(BigInteger value) {
        this.srsDimension = value;
    }

    public EnvelopeType withLowerCorner(DirectPositionType value) {
        setLowerCorner(value);
        return this;
    }

    public EnvelopeType withUpperCorner(DirectPositionType value) {
        setUpperCorner(value);
        return this;
    }

    public EnvelopeType withPos(DirectPositionType... values) {
        if (values!= null) {
            for (DirectPositionType value: values) {
                getPos().add(value);
            }
        }
        return this;
    }

    public EnvelopeType withPos(Collection<DirectPositionType> values) {
        if (values!= null) {
            getPos().addAll(values);
        }
        return this;
    }

    public EnvelopeType withSrsName(String value) {
        setSrsName(value);
        return this;
    }

    public EnvelopeType withSrsDimension(BigInteger value) {
        setSrsDimension(value);
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
