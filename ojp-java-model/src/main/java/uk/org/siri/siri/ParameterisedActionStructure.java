//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for parameterised, i.e. user definable, actions.
 *
 * <p>Java-Klasse für ParameterisedActionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ParameterisedActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}SimpleActionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/&gt;
 *         &lt;element name="ActionData" type="{http://www.siri.org.uk/siri}ActionDataStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PublicationWindow" type="{http://www.siri.org.uk/siri}ClosedTimestampRangeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterisedActionStructure", propOrder = {
    "description",
    "actionData",
    "publicationWindow"
})
@XmlSeeAlso({
    PublishToWebActionStructure.class,
    PublishToMobileActionStructure.class,
    PublishToDisplayActionStructure.class,
    PublishToTvActionStructure.class,
    PassengerInformationActionStructure.class,
    PushedActionStructure.class,
    ManualActionStructure.class
})
public class ParameterisedActionStructure
    extends SimpleActionStructure {

    @XmlElement(name = "Description")
    protected NaturalLanguageStringStructure description;
    @XmlElement(name = "ActionData")
    protected List<ActionDataStructure> actionData;
    @XmlElement(name = "PublicationWindow")
    protected List<ClosedTimestampRangeStructure> publicationWindow;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setDescription(NaturalLanguageStringStructure value) {
        this.description = value;
    }

    /**
     * Gets the value of the actionData property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the actionData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ActionDataStructure }
     */
    public List<ActionDataStructure> getActionData() {
        if (actionData == null) {
            actionData = new ArrayList<ActionDataStructure>();
        }
        return this.actionData;
    }

    /**
     * Gets the value of the publicationWindow property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the publicationWindow property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicationWindow().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ClosedTimestampRangeStructure }
     */
    public List<ClosedTimestampRangeStructure> getPublicationWindow() {
        if (publicationWindow == null) {
            publicationWindow = new ArrayList<ClosedTimestampRangeStructure>();
        }
        return this.publicationWindow;
    }

    public ParameterisedActionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    public ParameterisedActionStructure withActionData(ActionDataStructure... values) {
        if (values != null) {
            for (ActionDataStructure value : values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    public ParameterisedActionStructure withActionData(Collection<ActionDataStructure> values) {
        if (values != null) {
            getActionData().addAll(values);
        }
        return this;
    }

    public ParameterisedActionStructure withPublicationWindow(ClosedTimestampRangeStructure... values) {
        if (values != null) {
            for (ClosedTimestampRangeStructure value : values) {
                getPublicationWindow().add(value);
            }
        }
        return this;
    }

    public ParameterisedActionStructure withPublicationWindow(Collection<ClosedTimestampRangeStructure> values) {
        if (values != null) {
            getPublicationWindow().addAll(values);
        }
        return this;
    }

    @Override
    public ParameterisedActionStructure withActionStatus(ActionStatusEnumeration value) {
        setActionStatus(value);
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
