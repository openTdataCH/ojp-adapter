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
 * Type for Action Publish SITUATION To Web channel.
 * 
 * <p>Java-Klasse für PublishToWebActionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PublishToWebActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ParameterisedActionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Incidents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HomePage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Ticker" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SocialNetwork" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishToWebActionStructure", propOrder = {
    "incidents",
    "homePage",
    "ticker",
    "socialNetwork"
})
public class PublishToWebActionStructure
    extends ParameterisedActionStructure
{

    @XmlElement(name = "Incidents", defaultValue = "true")
    protected Boolean incidents;
    @XmlElement(name = "HomePage", defaultValue = "false")
    protected Boolean homePage;
    @XmlElement(name = "Ticker", defaultValue = "false")
    protected Boolean ticker;
    @XmlElement(name = "SocialNetwork")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> socialNetwork;

    /**
     * Ruft den Wert der incidents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncidents() {
        return incidents;
    }

    /**
     * Legt den Wert der incidents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncidents(Boolean value) {
        this.incidents = value;
    }

    /**
     * Ruft den Wert der homePage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHomePage() {
        return homePage;
    }

    /**
     * Legt den Wert der homePage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHomePage(Boolean value) {
        this.homePage = value;
    }

    /**
     * Ruft den Wert der ticker-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicker() {
        return ticker;
    }

    /**
     * Legt den Wert der ticker-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicker(Boolean value) {
        this.ticker = value;
    }

    /**
     * Gets the value of the socialNetwork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the socialNetwork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSocialNetwork() {
        if (socialNetwork == null) {
            socialNetwork = new ArrayList<String>();
        }
        return this.socialNetwork;
    }

    public PublishToWebActionStructure withIncidents(Boolean value) {
        setIncidents(value);
        return this;
    }

    public PublishToWebActionStructure withHomePage(Boolean value) {
        setHomePage(value);
        return this;
    }

    public PublishToWebActionStructure withTicker(Boolean value) {
        setTicker(value);
        return this;
    }

    public PublishToWebActionStructure withSocialNetwork(String... values) {
        if (values!= null) {
            for (String value: values) {
                getSocialNetwork().add(value);
            }
        }
        return this;
    }

    public PublishToWebActionStructure withSocialNetwork(Collection<String> values) {
        if (values!= null) {
            getSocialNetwork().addAll(values);
        }
        return this;
    }

    @Override
    public PublishToWebActionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    @Override
    public PublishToWebActionStructure withActionData(ActionDataStructure... values) {
        if (values!= null) {
            for (ActionDataStructure value: values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    @Override
    public PublishToWebActionStructure withActionData(Collection<ActionDataStructure> values) {
        if (values!= null) {
            getActionData().addAll(values);
        }
        return this;
    }

    @Override
    public PublishToWebActionStructure withPublicationWindow(ClosedTimestampRangeStructure... values) {
        if (values!= null) {
            for (ClosedTimestampRangeStructure value: values) {
                getPublicationWindow().add(value);
            }
        }
        return this;
    }

    @Override
    public PublishToWebActionStructure withPublicationWindow(Collection<ClosedTimestampRangeStructure> values) {
        if (values!= null) {
            getPublicationWindow().addAll(values);
        }
        return this;
    }

    @Override
    public PublishToWebActionStructure withActionStatus(ActionStatusEnumeration value) {
        setActionStatus(value);
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
