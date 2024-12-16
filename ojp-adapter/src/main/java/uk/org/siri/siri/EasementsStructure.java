//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

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


/**
 * Type for easement info.
 * 
 * <p>Java-Klasse für EasementsStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EasementsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TicketRestrictions" type="{http://www.siri.org.uk/siri}TicketRestrictionEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="Easement" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EasementRef" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EasementsStructure", propOrder = {
    "ticketRestrictions",
    "easement",
    "easementRef"
})
public class EasementsStructure {

    @XmlElement(name = "TicketRestrictions")
    @XmlSchemaType(name = "NMTOKEN")
    protected TicketRestrictionEnumeration ticketRestrictions;
    @XmlElement(name = "Easement")
    protected List<NaturalLanguageStringStructure> easement;
    @XmlElement(name = "EasementRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String easementRef;

    /**
     * Ruft den Wert der ticketRestrictions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TicketRestrictionEnumeration }
     *     
     */
    public TicketRestrictionEnumeration getTicketRestrictions() {
        return ticketRestrictions;
    }

    /**
     * Legt den Wert der ticketRestrictions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketRestrictionEnumeration }
     *     
     */
    public void setTicketRestrictions(TicketRestrictionEnumeration value) {
        this.ticketRestrictions = value;
    }

    /**
     * Gets the value of the easement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the easement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEasement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getEasement() {
        if (easement == null) {
            easement = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.easement;
    }

    /**
     * Ruft den Wert der easementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEasementRef() {
        return easementRef;
    }

    /**
     * Legt den Wert der easementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEasementRef(String value) {
        this.easementRef = value;
    }

    public EasementsStructure withTicketRestrictions(TicketRestrictionEnumeration value) {
        setTicketRestrictions(value);
        return this;
    }

    public EasementsStructure withEasement(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getEasement().add(value);
            }
        }
        return this;
    }

    public EasementsStructure withEasement(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getEasement().addAll(values);
        }
        return this;
    }

    public EasementsStructure withEasementRef(String value) {
        setEasementRef(value);
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
