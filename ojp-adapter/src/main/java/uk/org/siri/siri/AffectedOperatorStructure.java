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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for Annotated reference to an OPERATOR affected by a SITUATION.
 * 
 * <p>Java-Klasse für AffectedOperatorStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AffectedOperatorStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperatorRef" type="{http://www.siri.org.uk/siri}OperatorRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="OperatorName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OperatorShortName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OperationalUnitRef" type="{http://www.siri.org.uk/siri}OperationalUnitRefStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AffectedOperatorStructure", propOrder = {
    "operatorRef",
    "operatorName",
    "operatorShortName",
    "operationalUnitRef",
    "extensions"
})
public class AffectedOperatorStructure {

    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "OperatorName")
    protected List<NaturalLanguageStringStructure> operatorName;
    @XmlElement(name = "OperatorShortName")
    protected List<NaturalLanguageStringStructure> operatorShortName;
    @XmlElement(name = "OperationalUnitRef")
    protected List<OperationalUnitRefStructure> operationalUnitRef;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der operatorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Legt den Wert der operatorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Gets the value of the operatorName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the operatorName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatorName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getOperatorName() {
        if (operatorName == null) {
            operatorName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.operatorName;
    }

    /**
     * Gets the value of the operatorShortName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the operatorShortName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatorShortName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getOperatorShortName() {
        if (operatorShortName == null) {
            operatorShortName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.operatorShortName;
    }

    /**
     * Gets the value of the operationalUnitRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the operationalUnitRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationalUnitRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationalUnitRefStructure }
     * 
     * 
     */
    public List<OperationalUnitRefStructure> getOperationalUnitRef() {
        if (operationalUnitRef == null) {
            operationalUnitRef = new ArrayList<OperationalUnitRefStructure>();
        }
        return this.operationalUnitRef;
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

    public AffectedOperatorStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public AffectedOperatorStructure withOperatorName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getOperatorName().add(value);
            }
        }
        return this;
    }

    public AffectedOperatorStructure withOperatorName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getOperatorName().addAll(values);
        }
        return this;
    }

    public AffectedOperatorStructure withOperatorShortName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getOperatorShortName().add(value);
            }
        }
        return this;
    }

    public AffectedOperatorStructure withOperatorShortName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getOperatorShortName().addAll(values);
        }
        return this;
    }

    public AffectedOperatorStructure withOperationalUnitRef(OperationalUnitRefStructure... values) {
        if (values!= null) {
            for (OperationalUnitRefStructure value: values) {
                getOperationalUnitRef().add(value);
            }
        }
        return this;
    }

    public AffectedOperatorStructure withOperationalUnitRef(Collection<OperationalUnitRefStructure> values) {
        if (values!= null) {
            getOperationalUnitRef().addAll(values);
        }
        return this;
    }

    public AffectedOperatorStructure withExtensions(ExtensionsStructure value) {
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
