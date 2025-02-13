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
import jakarta.xml.bind.annotation.XmlType;
import java.util.Collection;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for Notify user by other means.
 *
 * <p>Java-Klasse für NotifyUserActionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="NotifyUserActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}PushedActionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WorkgroupRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyUserActionStructure", propOrder = {
    "workgroupRef",
    "userName",
    "userRef"
})
public class NotifyUserActionStructure
    extends PushedActionStructure {

    @XmlElement(name = "WorkgroupRef")
    protected String workgroupRef;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "UserRef")
    protected String userRef;

    /**
     * Ruft den Wert der workgroupRef-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getWorkgroupRef() {
        return workgroupRef;
    }

    /**
     * Legt den Wert der workgroupRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setWorkgroupRef(String value) {
        this.workgroupRef = value;
    }

    /**
     * Ruft den Wert der userName-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Legt den Wert der userName-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Ruft den Wert der userRef-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getUserRef() {
        return userRef;
    }

    /**
     * Legt den Wert der userRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setUserRef(String value) {
        this.userRef = value;
    }

    public NotifyUserActionStructure withWorkgroupRef(String value) {
        setWorkgroupRef(value);
        return this;
    }

    public NotifyUserActionStructure withUserName(String value) {
        setUserName(value);
        return this;
    }

    public NotifyUserActionStructure withUserRef(String value) {
        setUserRef(value);
        return this;
    }

    @Override
    public NotifyUserActionStructure withBeforeNotices(PushedActionStructure.BeforeNotices value) {
        setBeforeNotices(value);
        return this;
    }

    @Override
    public NotifyUserActionStructure withClearNotice(Boolean value) {
        setClearNotice(value);
        return this;
    }

    @Override
    public NotifyUserActionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    @Override
    public NotifyUserActionStructure withActionData(ActionDataStructure... values) {
        if (values != null) {
            for (ActionDataStructure value : values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    @Override
    public NotifyUserActionStructure withActionData(Collection<ActionDataStructure> values) {
        if (values != null) {
            getActionData().addAll(values);
        }
        return this;
    }

    @Override
    public NotifyUserActionStructure withPublicationWindow(ClosedTimestampRangeStructure... values) {
        if (values != null) {
            for (ClosedTimestampRangeStructure value : values) {
                getPublicationWindow().add(value);
            }
        }
        return this;
    }

    @Override
    public NotifyUserActionStructure withPublicationWindow(Collection<ClosedTimestampRangeStructure> values) {
        if (values != null) {
            getPublicationWindow().addAll(values);
        }
        return this;
    }

    @Override
    public NotifyUserActionStructure withActionStatus(ActionStatusEnumeration value) {
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
