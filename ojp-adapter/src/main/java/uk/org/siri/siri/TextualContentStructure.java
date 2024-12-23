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
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für TextualContentStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TextualContentStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TextualContentSize" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ActionsGroup" minOccurs="0"/&gt;
 *         &lt;element name="SummaryContent" type="{http://www.siri.org.uk/siri}SummaryContentStructure"/&gt;
 *         &lt;element name="ReasonContent" type="{http://www.siri.org.uk/siri}ReasonContentStructure" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionContent" type="{http://www.siri.org.uk/siri}DescriptionContentStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConsequenceContent" type="{http://www.siri.org.uk/siri}ConsequenceContentStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RecommendationContent" type="{http://www.siri.org.uk/siri}RecommendationContentStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DurationContent" type="{http://www.siri.org.uk/siri}DurationContentStructure" minOccurs="0"/&gt;
 *         &lt;element name="RemarkContent" type="{http://www.siri.org.uk/siri}RemarkContentStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InfoLink" type="{http://www.siri.org.uk/siri}InfoLinkStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Image" type="{http://www.siri.org.uk/siri}ImageStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Internal" type="{http://www.siri.org.uk/siri}DefaultedTextStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextualContentStructure", propOrder = {
    "textualContentSize",
    "publishToWebAction",
    "publishToMobileAction",
    "publishToTvAction",
    "publishToAlertsAction",
    "publishToDisplayAction",
    "manualAction",
    "notifyByEmailAction",
    "notifyBySmsAction",
    "notifyByPagerAction",
    "notifyUserAction",
    "summaryContent",
    "reasonContent",
    "descriptionContent",
    "consequenceContent",
    "recommendationContent",
    "durationContent",
    "remarkContent",
    "infoLink",
    "image",
    "internal"
})
public class TextualContentStructure {

    @XmlList
    @XmlElement(name = "TextualContentSize")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> textualContentSize;
    @XmlElement(name = "PublishToWebAction")
    protected List<PublishToWebActionStructure> publishToWebAction;
    @XmlElement(name = "PublishToMobileAction")
    protected List<PublishToMobileActionStructure> publishToMobileAction;
    @XmlElement(name = "PublishToTvAction")
    protected List<PublishToTvActionStructure> publishToTvAction;
    @XmlElement(name = "PublishToAlertsAction")
    protected List<PublishToAlertsActionStructure> publishToAlertsAction;
    @XmlElement(name = "PublishToDisplayAction")
    protected List<PublishToDisplayActionStructure> publishToDisplayAction;
    @XmlElement(name = "ManualAction")
    protected List<ManualAction> manualAction;
    @XmlElement(name = "NotifyByEmailAction")
    protected List<NotifyByEmailActionStructure> notifyByEmailAction;
    @XmlElement(name = "NotifyBySmsAction")
    protected List<NotifyBySmsActionStructure> notifyBySmsAction;
    @XmlElement(name = "NotifyByPagerAction")
    protected List<NotifyByPagerActionStructure> notifyByPagerAction;
    @XmlElement(name = "NotifyUserAction")
    protected List<NotifyUserActionStructure> notifyUserAction;
    @XmlElement(name = "SummaryContent", required = true)
    protected SummaryContentStructure summaryContent;
    @XmlElement(name = "ReasonContent")
    protected ReasonContentStructure reasonContent;
    @XmlElement(name = "DescriptionContent")
    protected List<DescriptionContentStructure> descriptionContent;
    @XmlElement(name = "ConsequenceContent")
    protected List<ConsequenceContentStructure> consequenceContent;
    @XmlElement(name = "RecommendationContent")
    protected List<RecommendationContentStructure> recommendationContent;
    @XmlElement(name = "DurationContent")
    protected DurationContentStructure durationContent;
    @XmlElement(name = "RemarkContent")
    protected List<RemarkContentStructure> remarkContent;
    @XmlElement(name = "InfoLink")
    protected List<InfoLinkStructure> infoLink;
    @XmlElement(name = "Image")
    protected List<ImageStructure> image;
    @XmlElement(name = "Internal")
    protected List<DefaultedTextStructure> internal;

    /**
     * Gets the value of the textualContentSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the textualContentSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextualContentSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTextualContentSize() {
        if (textualContentSize == null) {
            textualContentSize = new ArrayList<String>();
        }
        return this.textualContentSize;
    }

    /**
     * Gets the value of the publishToWebAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the publishToWebAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishToWebAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishToWebActionStructure }
     * 
     * 
     */
    public List<PublishToWebActionStructure> getPublishToWebAction() {
        if (publishToWebAction == null) {
            publishToWebAction = new ArrayList<PublishToWebActionStructure>();
        }
        return this.publishToWebAction;
    }

    /**
     * Gets the value of the publishToMobileAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the publishToMobileAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishToMobileAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishToMobileActionStructure }
     * 
     * 
     */
    public List<PublishToMobileActionStructure> getPublishToMobileAction() {
        if (publishToMobileAction == null) {
            publishToMobileAction = new ArrayList<PublishToMobileActionStructure>();
        }
        return this.publishToMobileAction;
    }

    /**
     * Gets the value of the publishToTvAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the publishToTvAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishToTvAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishToTvActionStructure }
     * 
     * 
     */
    public List<PublishToTvActionStructure> getPublishToTvAction() {
        if (publishToTvAction == null) {
            publishToTvAction = new ArrayList<PublishToTvActionStructure>();
        }
        return this.publishToTvAction;
    }

    /**
     * Gets the value of the publishToAlertsAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the publishToAlertsAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishToAlertsAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishToAlertsActionStructure }
     * 
     * 
     */
    public List<PublishToAlertsActionStructure> getPublishToAlertsAction() {
        if (publishToAlertsAction == null) {
            publishToAlertsAction = new ArrayList<PublishToAlertsActionStructure>();
        }
        return this.publishToAlertsAction;
    }

    /**
     * Gets the value of the publishToDisplayAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the publishToDisplayAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishToDisplayAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishToDisplayActionStructure }
     * 
     * 
     */
    public List<PublishToDisplayActionStructure> getPublishToDisplayAction() {
        if (publishToDisplayAction == null) {
            publishToDisplayAction = new ArrayList<PublishToDisplayActionStructure>();
        }
        return this.publishToDisplayAction;
    }

    /**
     * Gets the value of the manualAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the manualAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManualAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManualAction }
     * 
     * 
     */
    public List<ManualAction> getManualAction() {
        if (manualAction == null) {
            manualAction = new ArrayList<ManualAction>();
        }
        return this.manualAction;
    }

    /**
     * Gets the value of the notifyByEmailAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the notifyByEmailAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyByEmailAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifyByEmailActionStructure }
     * 
     * 
     */
    public List<NotifyByEmailActionStructure> getNotifyByEmailAction() {
        if (notifyByEmailAction == null) {
            notifyByEmailAction = new ArrayList<NotifyByEmailActionStructure>();
        }
        return this.notifyByEmailAction;
    }

    /**
     * Gets the value of the notifyBySmsAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the notifyBySmsAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyBySmsAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifyBySmsActionStructure }
     * 
     * 
     */
    public List<NotifyBySmsActionStructure> getNotifyBySmsAction() {
        if (notifyBySmsAction == null) {
            notifyBySmsAction = new ArrayList<NotifyBySmsActionStructure>();
        }
        return this.notifyBySmsAction;
    }

    /**
     * Gets the value of the notifyByPagerAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the notifyByPagerAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyByPagerAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifyByPagerActionStructure }
     * 
     * 
     */
    public List<NotifyByPagerActionStructure> getNotifyByPagerAction() {
        if (notifyByPagerAction == null) {
            notifyByPagerAction = new ArrayList<NotifyByPagerActionStructure>();
        }
        return this.notifyByPagerAction;
    }

    /**
     * Gets the value of the notifyUserAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the notifyUserAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyUserAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifyUserActionStructure }
     * 
     * 
     */
    public List<NotifyUserActionStructure> getNotifyUserAction() {
        if (notifyUserAction == null) {
            notifyUserAction = new ArrayList<NotifyUserActionStructure>();
        }
        return this.notifyUserAction;
    }

    /**
     * Ruft den Wert der summaryContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SummaryContentStructure }
     *     
     */
    public SummaryContentStructure getSummaryContent() {
        return summaryContent;
    }

    /**
     * Legt den Wert der summaryContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryContentStructure }
     *     
     */
    public void setSummaryContent(SummaryContentStructure value) {
        this.summaryContent = value;
    }

    /**
     * Ruft den Wert der reasonContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReasonContentStructure }
     *     
     */
    public ReasonContentStructure getReasonContent() {
        return reasonContent;
    }

    /**
     * Legt den Wert der reasonContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonContentStructure }
     *     
     */
    public void setReasonContent(ReasonContentStructure value) {
        this.reasonContent = value;
    }

    /**
     * Gets the value of the descriptionContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionContentStructure }
     * 
     * 
     */
    public List<DescriptionContentStructure> getDescriptionContent() {
        if (descriptionContent == null) {
            descriptionContent = new ArrayList<DescriptionContentStructure>();
        }
        return this.descriptionContent;
    }

    /**
     * Gets the value of the consequenceContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the consequenceContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsequenceContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsequenceContentStructure }
     * 
     * 
     */
    public List<ConsequenceContentStructure> getConsequenceContent() {
        if (consequenceContent == null) {
            consequenceContent = new ArrayList<ConsequenceContentStructure>();
        }
        return this.consequenceContent;
    }

    /**
     * Gets the value of the recommendationContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the recommendationContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendationContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecommendationContentStructure }
     * 
     * 
     */
    public List<RecommendationContentStructure> getRecommendationContent() {
        if (recommendationContent == null) {
            recommendationContent = new ArrayList<RecommendationContentStructure>();
        }
        return this.recommendationContent;
    }

    /**
     * Ruft den Wert der durationContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DurationContentStructure }
     *     
     */
    public DurationContentStructure getDurationContent() {
        return durationContent;
    }

    /**
     * Legt den Wert der durationContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationContentStructure }
     *     
     */
    public void setDurationContent(DurationContentStructure value) {
        this.durationContent = value;
    }

    /**
     * Gets the value of the remarkContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the remarkContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarkContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkContentStructure }
     * 
     * 
     */
    public List<RemarkContentStructure> getRemarkContent() {
        if (remarkContent == null) {
            remarkContent = new ArrayList<RemarkContentStructure>();
        }
        return this.remarkContent;
    }

    /**
     * Gets the value of the infoLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the infoLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoLinkStructure }
     * 
     * 
     */
    public List<InfoLinkStructure> getInfoLink() {
        if (infoLink == null) {
            infoLink = new ArrayList<InfoLinkStructure>();
        }
        return this.infoLink;
    }

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageStructure }
     * 
     * 
     */
    public List<ImageStructure> getImage() {
        if (image == null) {
            image = new ArrayList<ImageStructure>();
        }
        return this.image;
    }

    /**
     * Gets the value of the internal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the internal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultedTextStructure }
     * 
     * 
     */
    public List<DefaultedTextStructure> getInternal() {
        if (internal == null) {
            internal = new ArrayList<DefaultedTextStructure>();
        }
        return this.internal;
    }

    public TextualContentStructure withTextualContentSize(String... values) {
        if (values!= null) {
            for (String value: values) {
                getTextualContentSize().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withTextualContentSize(Collection<String> values) {
        if (values!= null) {
            getTextualContentSize().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withPublishToWebAction(PublishToWebActionStructure... values) {
        if (values!= null) {
            for (PublishToWebActionStructure value: values) {
                getPublishToWebAction().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withPublishToWebAction(Collection<PublishToWebActionStructure> values) {
        if (values!= null) {
            getPublishToWebAction().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withPublishToMobileAction(PublishToMobileActionStructure... values) {
        if (values!= null) {
            for (PublishToMobileActionStructure value: values) {
                getPublishToMobileAction().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withPublishToMobileAction(Collection<PublishToMobileActionStructure> values) {
        if (values!= null) {
            getPublishToMobileAction().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withPublishToTvAction(PublishToTvActionStructure... values) {
        if (values!= null) {
            for (PublishToTvActionStructure value: values) {
                getPublishToTvAction().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withPublishToTvAction(Collection<PublishToTvActionStructure> values) {
        if (values!= null) {
            getPublishToTvAction().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withPublishToAlertsAction(PublishToAlertsActionStructure... values) {
        if (values!= null) {
            for (PublishToAlertsActionStructure value: values) {
                getPublishToAlertsAction().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withPublishToAlertsAction(Collection<PublishToAlertsActionStructure> values) {
        if (values!= null) {
            getPublishToAlertsAction().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withPublishToDisplayAction(PublishToDisplayActionStructure... values) {
        if (values!= null) {
            for (PublishToDisplayActionStructure value: values) {
                getPublishToDisplayAction().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withPublishToDisplayAction(Collection<PublishToDisplayActionStructure> values) {
        if (values!= null) {
            getPublishToDisplayAction().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withManualAction(ManualAction... values) {
        if (values!= null) {
            for (ManualAction value: values) {
                getManualAction().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withManualAction(Collection<ManualAction> values) {
        if (values!= null) {
            getManualAction().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withNotifyByEmailAction(NotifyByEmailActionStructure... values) {
        if (values!= null) {
            for (NotifyByEmailActionStructure value: values) {
                getNotifyByEmailAction().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withNotifyByEmailAction(Collection<NotifyByEmailActionStructure> values) {
        if (values!= null) {
            getNotifyByEmailAction().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withNotifyBySmsAction(NotifyBySmsActionStructure... values) {
        if (values!= null) {
            for (NotifyBySmsActionStructure value: values) {
                getNotifyBySmsAction().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withNotifyBySmsAction(Collection<NotifyBySmsActionStructure> values) {
        if (values!= null) {
            getNotifyBySmsAction().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withNotifyByPagerAction(NotifyByPagerActionStructure... values) {
        if (values!= null) {
            for (NotifyByPagerActionStructure value: values) {
                getNotifyByPagerAction().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withNotifyByPagerAction(Collection<NotifyByPagerActionStructure> values) {
        if (values!= null) {
            getNotifyByPagerAction().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withNotifyUserAction(NotifyUserActionStructure... values) {
        if (values!= null) {
            for (NotifyUserActionStructure value: values) {
                getNotifyUserAction().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withNotifyUserAction(Collection<NotifyUserActionStructure> values) {
        if (values!= null) {
            getNotifyUserAction().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withSummaryContent(SummaryContentStructure value) {
        setSummaryContent(value);
        return this;
    }

    public TextualContentStructure withReasonContent(ReasonContentStructure value) {
        setReasonContent(value);
        return this;
    }

    public TextualContentStructure withDescriptionContent(DescriptionContentStructure... values) {
        if (values!= null) {
            for (DescriptionContentStructure value: values) {
                getDescriptionContent().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withDescriptionContent(Collection<DescriptionContentStructure> values) {
        if (values!= null) {
            getDescriptionContent().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withConsequenceContent(ConsequenceContentStructure... values) {
        if (values!= null) {
            for (ConsequenceContentStructure value: values) {
                getConsequenceContent().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withConsequenceContent(Collection<ConsequenceContentStructure> values) {
        if (values!= null) {
            getConsequenceContent().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withRecommendationContent(RecommendationContentStructure... values) {
        if (values!= null) {
            for (RecommendationContentStructure value: values) {
                getRecommendationContent().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withRecommendationContent(Collection<RecommendationContentStructure> values) {
        if (values!= null) {
            getRecommendationContent().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withDurationContent(DurationContentStructure value) {
        setDurationContent(value);
        return this;
    }

    public TextualContentStructure withRemarkContent(RemarkContentStructure... values) {
        if (values!= null) {
            for (RemarkContentStructure value: values) {
                getRemarkContent().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withRemarkContent(Collection<RemarkContentStructure> values) {
        if (values!= null) {
            getRemarkContent().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withInfoLink(InfoLinkStructure... values) {
        if (values!= null) {
            for (InfoLinkStructure value: values) {
                getInfoLink().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withInfoLink(Collection<InfoLinkStructure> values) {
        if (values!= null) {
            getInfoLink().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withImage(ImageStructure... values) {
        if (values!= null) {
            for (ImageStructure value: values) {
                getImage().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withImage(Collection<ImageStructure> values) {
        if (values!= null) {
            getImage().addAll(values);
        }
        return this;
    }

    public TextualContentStructure withInternal(DefaultedTextStructure... values) {
        if (values!= null) {
            for (DefaultedTextStructure value: values) {
                getInternal().add(value);
            }
        }
        return this;
    }

    public TextualContentStructure withInternal(Collection<DefaultedTextStructure> values) {
        if (values!= null) {
            getInternal().addAll(values);
        }
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
