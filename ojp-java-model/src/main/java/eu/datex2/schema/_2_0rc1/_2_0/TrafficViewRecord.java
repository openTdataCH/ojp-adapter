//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für TrafficViewRecord complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TrafficViewRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recordSequenceNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="trafficElement" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficElement" minOccurs="0"/&gt;
 *         &lt;element name="operatorAction" type="{http://datex2.eu/schema/2_0RC1/2_0}OperatorAction" minOccurs="0"/&gt;
 *         &lt;element name="elaboratedData" type="{http://datex2.eu/schema/2_0RC1/2_0}ElaboratedData" minOccurs="0"/&gt;
 *         &lt;element name="urlLink" type="{http://datex2.eu/schema/2_0RC1/2_0}UrlLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="trafficViewRecordExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficViewRecord", propOrder = {
    "recordSequenceNumber",
    "trafficElement",
    "operatorAction",
    "elaboratedData",
    "urlLink",
    "trafficViewRecordExtension"
})
public class TrafficViewRecord {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger recordSequenceNumber;
    protected TrafficElement trafficElement;
    protected OperatorAction operatorAction;
    protected ElaboratedData elaboratedData;
    protected List<UrlLink> urlLink;
    protected ExtensionType trafficViewRecordExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Ruft den Wert der recordSequenceNumber-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getRecordSequenceNumber() {
        return recordSequenceNumber;
    }

    /**
     * Legt den Wert der recordSequenceNumber-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setRecordSequenceNumber(BigInteger value) {
        this.recordSequenceNumber = value;
    }

    /**
     * Ruft den Wert der trafficElement-Eigenschaft ab.
     *
     * @return possible object is {@link TrafficElement }
     */
    public TrafficElement getTrafficElement() {
        return trafficElement;
    }

    /**
     * Legt den Wert der trafficElement-Eigenschaft fest.
     *
     * @param value allowed object is {@link TrafficElement }
     */
    public void setTrafficElement(TrafficElement value) {
        this.trafficElement = value;
    }

    /**
     * Ruft den Wert der operatorAction-Eigenschaft ab.
     *
     * @return possible object is {@link OperatorAction }
     */
    public OperatorAction getOperatorAction() {
        return operatorAction;
    }

    /**
     * Legt den Wert der operatorAction-Eigenschaft fest.
     *
     * @param value allowed object is {@link OperatorAction }
     */
    public void setOperatorAction(OperatorAction value) {
        this.operatorAction = value;
    }

    /**
     * Ruft den Wert der elaboratedData-Eigenschaft ab.
     *
     * @return possible object is {@link ElaboratedData }
     */
    public ElaboratedData getElaboratedData() {
        return elaboratedData;
    }

    /**
     * Legt den Wert der elaboratedData-Eigenschaft fest.
     *
     * @param value allowed object is {@link ElaboratedData }
     */
    public void setElaboratedData(ElaboratedData value) {
        this.elaboratedData = value;
    }

    /**
     * Gets the value of the urlLink property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the urlLink property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlLink().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link UrlLink }
     */
    public List<UrlLink> getUrlLink() {
        if (urlLink == null) {
            urlLink = new ArrayList<UrlLink>();
        }
        return this.urlLink;
    }

    /**
     * Ruft den Wert der trafficViewRecordExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getTrafficViewRecordExtension() {
        return trafficViewRecordExtension;
    }

    /**
     * Legt den Wert der trafficViewRecordExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setTrafficViewRecordExtension(ExtensionType value) {
        this.trafficViewRecordExtension = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    public TrafficViewRecord withRecordSequenceNumber(BigInteger value) {
        setRecordSequenceNumber(value);
        return this;
    }

    public TrafficViewRecord withTrafficElement(TrafficElement value) {
        setTrafficElement(value);
        return this;
    }

    public TrafficViewRecord withOperatorAction(OperatorAction value) {
        setOperatorAction(value);
        return this;
    }

    public TrafficViewRecord withElaboratedData(ElaboratedData value) {
        setElaboratedData(value);
        return this;
    }

    public TrafficViewRecord withUrlLink(UrlLink... values) {
        if (values != null) {
            for (UrlLink value : values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    public TrafficViewRecord withUrlLink(Collection<UrlLink> values) {
        if (values != null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    public TrafficViewRecord withTrafficViewRecordExtension(ExtensionType value) {
        setTrafficViewRecordExtension(value);
        return this;
    }

    public TrafficViewRecord withId(String value) {
        setId(value);
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
