//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.ParticipantRefStructure;


/**
 * [TMv6] A type of PLACE providing the topographical context when searching for or presenting travel information, for example as the origin or destination of a trip. It may be of any size (e.g., County,City, Town, Village) and of different specificity (e.g., Greater London, London, West End, Westminster, St James's).
 * 
 * <p>Java-Klasse für TopographicPlaceStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TopographicPlaceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TopographicPlaceCode" type="{http://www.vdv.de/ojp}TopographicPlaceCodeType"/&gt;
 *         &lt;element name="TopographicPlaceName" type="{http://www.vdv.de/ojp}InternationalTextStructure"/&gt;
 *         &lt;element name="PrivateCode" type="{http://www.vdv.de/ojp}PrivateCodeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ParentRef" type="{http://www.vdv.de/ojp}TopographicPlaceRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="ReferredSystem" type="{http://www.siri.org.uk/siri}ParticipantRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="Area" type="{http://www.vdv.de/ojp}AreaStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopographicPlaceStructure", propOrder = {
    "topographicPlaceCode",
    "topographicPlaceName",
    "privateCode",
    "parentRef",
    "referredSystem",
    "area"
})
public class TopographicPlaceStructure {

    @XmlElement(name = "TopographicPlaceCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String topographicPlaceCode;
    @XmlElement(name = "TopographicPlaceName", required = true)
    protected InternationalTextStructure topographicPlaceName;
    @XmlElement(name = "PrivateCode")
    protected List<PrivateCodeStructure> privateCode;
    @XmlElement(name = "ParentRef")
    protected TopographicPlaceRefStructure parentRef;
    @XmlElement(name = "ReferredSystem")
    protected ParticipantRefStructure referredSystem;
    @XmlElement(name = "Area")
    protected AreaStructure area;

    /**
     * Ruft den Wert der topographicPlaceCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopographicPlaceCode() {
        return topographicPlaceCode;
    }

    /**
     * Legt den Wert der topographicPlaceCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopographicPlaceCode(String value) {
        this.topographicPlaceCode = value;
    }

    /**
     * Ruft den Wert der topographicPlaceName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getTopographicPlaceName() {
        return topographicPlaceName;
    }

    /**
     * Legt den Wert der topographicPlaceName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setTopographicPlaceName(InternationalTextStructure value) {
        this.topographicPlaceName = value;
    }

    /**
     * Gets the value of the privateCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the privateCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivateCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivateCodeStructure }
     * 
     * 
     */
    public List<PrivateCodeStructure> getPrivateCode() {
        if (privateCode == null) {
            privateCode = new ArrayList<PrivateCodeStructure>();
        }
        return this.privateCode;
    }

    /**
     * Ruft den Wert der parentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public TopographicPlaceRefStructure getParentRef() {
        return parentRef;
    }

    /**
     * Legt den Wert der parentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public void setParentRef(TopographicPlaceRefStructure value) {
        this.parentRef = value;
    }

    /**
     * Ruft den Wert der referredSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getReferredSystem() {
        return referredSystem;
    }

    /**
     * Legt den Wert der referredSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setReferredSystem(ParticipantRefStructure value) {
        this.referredSystem = value;
    }

    /**
     * Ruft den Wert der area-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaStructure }
     *     
     */
    public AreaStructure getArea() {
        return area;
    }

    /**
     * Legt den Wert der area-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaStructure }
     *     
     */
    public void setArea(AreaStructure value) {
        this.area = value;
    }

    public TopographicPlaceStructure withTopographicPlaceCode(String value) {
        setTopographicPlaceCode(value);
        return this;
    }

    public TopographicPlaceStructure withTopographicPlaceName(InternationalTextStructure value) {
        setTopographicPlaceName(value);
        return this;
    }

    public TopographicPlaceStructure withPrivateCode(PrivateCodeStructure... values) {
        if (values!= null) {
            for (PrivateCodeStructure value: values) {
                getPrivateCode().add(value);
            }
        }
        return this;
    }

    public TopographicPlaceStructure withPrivateCode(Collection<PrivateCodeStructure> values) {
        if (values!= null) {
            getPrivateCode().addAll(values);
        }
        return this;
    }

    public TopographicPlaceStructure withParentRef(TopographicPlaceRefStructure value) {
        setParentRef(value);
        return this;
    }

    public TopographicPlaceStructure withReferredSystem(ParticipantRefStructure value) {
        setReferredSystem(value);
        return this;
    }

    public TopographicPlaceStructure withArea(AreaStructure value) {
        setArea(value);
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
