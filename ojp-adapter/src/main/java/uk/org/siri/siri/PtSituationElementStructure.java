//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import eu.datex2.schema._2_0rc1._2_0.InformationStatusEnum;
import eu.datex2.schema._2_0rc1._2_0.ProbabilityOfOccurrenceEnum;
import eu.datex2.schema._2_0rc1._2_0.PublicEventTypeEnum;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.ifopt.CountryRefStructure;


/**
 * Type for individual PT SITUATION.
 * 
 * <p>Java-Klasse für PtSituationElementStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PtSituationElementStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}SituationElementStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}PtSituationBodyGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtSituationElementStructure", propOrder = {
    "verification",
    "progress",
    "qualityIndex",
    "reality",
    "likelihood",
    "publication",
    "validityPeriod",
    "repetitions",
    "publicationWindow",
    "alertCause",
    "unknownReason",
    "miscellaneousReason",
    "personnelReason",
    "equipmentReason",
    "environmentReason",
    "undefinedReason",
    "miscellaneousSubReason",
    "personnelSubReason",
    "equipmentSubReason",
    "environmentSubReason",
    "publicEventReason",
    "reasonName",
    "severity",
    "priority",
    "sensitivity",
    "audience",
    "scopeType",
    "reportType",
    "planned",
    "keywords",
    "secondaryReasons",
    "language",
    "summary",
    "description",
    "detail",
    "advice",
    "internal",
    "images",
    "infoLinks",
    "affects",
    "consequences",
    "publishingActions",
    "extensions"
})
public class PtSituationElementStructure
    extends SituationElementStructure
{

    @XmlElement(name = "Verification")
    protected VerificationStatusEnumeration verification;
    @XmlElement(name = "Progress", defaultValue = "open")
    @XmlSchemaType(name = "NMTOKEN")
    protected WorkflowStatusEnumeration progress;
    @XmlElement(name = "QualityIndex", defaultValue = "reliable")
    @XmlSchemaType(name = "NMTOKEN")
    protected QualityIndexEnumeration qualityIndex;
    @XmlElement(name = "Reality")
    @XmlSchemaType(name = "string")
    protected InformationStatusEnum reality;
    @XmlElement(name = "Likelihood")
    @XmlSchemaType(name = "string")
    protected ProbabilityOfOccurrenceEnum likelihood;
    @XmlElement(name = "Publication")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected List<String> publication;
    @XmlElement(name = "ValidityPeriod", required = true)
    protected List<HalfOpenTimestampOutputRangeStructure> validityPeriod;
    @XmlElement(name = "Repetitions")
    protected uk.org.siri.siri.RoadSituationElementStructure.Repetitions repetitions;
    @XmlElement(name = "PublicationWindow")
    protected List<HalfOpenTimestampOutputRangeStructure> publicationWindow;
    @XmlElement(name = "AlertCause")
    @XmlSchemaType(name = "NMTOKEN")
    protected AlertCauseEnumeration alertCause;
    @XmlElement(name = "UnknownReason")
    protected String unknownReason;
    @XmlElement(name = "MiscellaneousReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String miscellaneousReason;
    @XmlElement(name = "PersonnelReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String personnelReason;
    @XmlElement(name = "EquipmentReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String equipmentReason;
    @XmlElement(name = "EnvironmentReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String environmentReason;
    @XmlElement(name = "UndefinedReason")
    protected String undefinedReason;
    @XmlElement(name = "MiscellaneousSubReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String miscellaneousSubReason;
    @XmlElement(name = "PersonnelSubReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String personnelSubReason;
    @XmlElement(name = "EquipmentSubReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String equipmentSubReason;
    @XmlElement(name = "EnvironmentSubReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String environmentSubReason;
    @XmlElement(name = "PublicEventReason")
    @XmlSchemaType(name = "string")
    protected PublicEventTypeEnum publicEventReason;
    @XmlElement(name = "ReasonName")
    protected List<NaturalLanguageStringStructure> reasonName;
    @XmlElement(name = "Severity", defaultValue = "normal")
    @XmlSchemaType(name = "NMTOKEN")
    protected SeverityEnumeration severity;
    @XmlElement(name = "Priority")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger priority;
    @XmlElement(name = "Sensitivity")
    @XmlSchemaType(name = "NMTOKEN")
    protected SensitivityEnumeration sensitivity;
    @XmlElement(name = "Audience", defaultValue = "public")
    @XmlSchemaType(name = "NMTOKEN")
    protected AudienceEnumeration audience;
    @XmlElement(name = "ScopeType")
    protected ScopeTypeEnumeration scopeType;
    @XmlElement(name = "ReportType", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected ReportTypeEnumeration reportType;
    @XmlElement(name = "Planned", defaultValue = "false")
    protected Boolean planned;
    @XmlList
    @XmlElement(name = "Keywords")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> keywords;
    @XmlElement(name = "SecondaryReasons")
    protected uk.org.siri.siri.RoadSituationElementStructure.SecondaryReasons secondaryReasons;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "Summary")
    protected List<DefaultedTextStructure> summary;
    @XmlElement(name = "Description")
    protected List<DefaultedTextStructure> description;
    @XmlElement(name = "Detail")
    protected List<DefaultedTextStructure> detail;
    @XmlElement(name = "Advice")
    protected List<DefaultedTextStructure> advice;
    @XmlElement(name = "Internal")
    protected DefaultedTextStructure internal;
    @XmlElement(name = "Images")
    protected uk.org.siri.siri.RoadSituationElementStructure.Images images;
    @XmlElement(name = "InfoLinks")
    protected uk.org.siri.siri.RoadSituationElementStructure.InfoLinks infoLinks;
    @XmlElement(name = "Affects")
    protected AffectsScopeStructure affects;
    @XmlElement(name = "Consequences")
    protected PtConsequencesStructure consequences;
    @XmlElement(name = "PublishingActions")
    protected ActionsStructure publishingActions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der verification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VerificationStatusEnumeration }
     *     
     */
    public VerificationStatusEnumeration getVerification() {
        return verification;
    }

    /**
     * Legt den Wert der verification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationStatusEnumeration }
     *     
     */
    public void setVerification(VerificationStatusEnumeration value) {
        this.verification = value;
    }

    /**
     * Ruft den Wert der progress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowStatusEnumeration }
     *     
     */
    public WorkflowStatusEnumeration getProgress() {
        return progress;
    }

    /**
     * Legt den Wert der progress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowStatusEnumeration }
     *     
     */
    public void setProgress(WorkflowStatusEnumeration value) {
        this.progress = value;
    }

    /**
     * Ruft den Wert der qualityIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QualityIndexEnumeration }
     *     
     */
    public QualityIndexEnumeration getQualityIndex() {
        return qualityIndex;
    }

    /**
     * Legt den Wert der qualityIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityIndexEnumeration }
     *     
     */
    public void setQualityIndex(QualityIndexEnumeration value) {
        this.qualityIndex = value;
    }

    /**
     * Ruft den Wert der reality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InformationStatusEnum }
     *     
     */
    public InformationStatusEnum getReality() {
        return reality;
    }

    /**
     * Legt den Wert der reality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationStatusEnum }
     *     
     */
    public void setReality(InformationStatusEnum value) {
        this.reality = value;
    }

    /**
     * Ruft den Wert der likelihood-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public ProbabilityOfOccurrenceEnum getLikelihood() {
        return likelihood;
    }

    /**
     * Legt den Wert der likelihood-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public void setLikelihood(ProbabilityOfOccurrenceEnum value) {
        this.likelihood = value;
    }

    /**
     * Gets the value of the publication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the publication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPublication() {
        if (publication == null) {
            publication = new ArrayList<String>();
        }
        return this.publication;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the validityPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HalfOpenTimestampOutputRangeStructure }
     * 
     * 
     */
    public List<HalfOpenTimestampOutputRangeStructure> getValidityPeriod() {
        if (validityPeriod == null) {
            validityPeriod = new ArrayList<HalfOpenTimestampOutputRangeStructure>();
        }
        return this.validityPeriod;
    }

    /**
     * Ruft den Wert der repetitions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link uk.org.siri.siri.RoadSituationElementStructure.Repetitions }
     *     
     */
    public uk.org.siri.siri.RoadSituationElementStructure.Repetitions getRepetitions() {
        return repetitions;
    }

    /**
     * Legt den Wert der repetitions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link uk.org.siri.siri.RoadSituationElementStructure.Repetitions }
     *     
     */
    public void setRepetitions(uk.org.siri.siri.RoadSituationElementStructure.Repetitions value) {
        this.repetitions = value;
    }

    /**
     * Gets the value of the publicationWindow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the publicationWindow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicationWindow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HalfOpenTimestampOutputRangeStructure }
     * 
     * 
     */
    public List<HalfOpenTimestampOutputRangeStructure> getPublicationWindow() {
        if (publicationWindow == null) {
            publicationWindow = new ArrayList<HalfOpenTimestampOutputRangeStructure>();
        }
        return this.publicationWindow;
    }

    /**
     * Ruft den Wert der alertCause-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlertCauseEnumeration }
     *     
     */
    public AlertCauseEnumeration getAlertCause() {
        return alertCause;
    }

    /**
     * Legt den Wert der alertCause-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCauseEnumeration }
     *     
     */
    public void setAlertCause(AlertCauseEnumeration value) {
        this.alertCause = value;
    }

    /**
     * DEPRECATED since SIRI 2.1 - use only AlertCause.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknownReason() {
        return unknownReason;
    }

    /**
     * Legt den Wert der unknownReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknownReason(String value) {
        this.unknownReason = value;
    }

    /**
     * DEPRECATED since SIRI 2.1 - use only AlertCause.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscellaneousReason() {
        return miscellaneousReason;
    }

    /**
     * Legt den Wert der miscellaneousReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscellaneousReason(String value) {
        this.miscellaneousReason = value;
    }

    /**
     * DEPRECATED since SIRI 2.1 - use only AlertCause.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelReason() {
        return personnelReason;
    }

    /**
     * Legt den Wert der personnelReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelReason(String value) {
        this.personnelReason = value;
    }

    /**
     * DEPRECATED since SIRI 2.1 - use only AlertCause.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentReason() {
        return equipmentReason;
    }

    /**
     * Legt den Wert der equipmentReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentReason(String value) {
        this.equipmentReason = value;
    }

    /**
     * DEPRECATED since SIRI 2.1 - use only AlertCause.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentReason() {
        return environmentReason;
    }

    /**
     * Legt den Wert der environmentReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentReason(String value) {
        this.environmentReason = value;
    }

    /**
     * DEPRECATED since SIRI 2.1 - use only AlertCause.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndefinedReason() {
        return undefinedReason;
    }

    /**
     * Legt den Wert der undefinedReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndefinedReason(String value) {
        this.undefinedReason = value;
    }

    /**
     * Ruft den Wert der miscellaneousSubReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscellaneousSubReason() {
        return miscellaneousSubReason;
    }

    /**
     * Legt den Wert der miscellaneousSubReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscellaneousSubReason(String value) {
        this.miscellaneousSubReason = value;
    }

    /**
     * Ruft den Wert der personnelSubReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelSubReason() {
        return personnelSubReason;
    }

    /**
     * Legt den Wert der personnelSubReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelSubReason(String value) {
        this.personnelSubReason = value;
    }

    /**
     * Ruft den Wert der equipmentSubReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentSubReason() {
        return equipmentSubReason;
    }

    /**
     * Legt den Wert der equipmentSubReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentSubReason(String value) {
        this.equipmentSubReason = value;
    }

    /**
     * Ruft den Wert der environmentSubReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentSubReason() {
        return environmentSubReason;
    }

    /**
     * Legt den Wert der environmentSubReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentSubReason(String value) {
        this.environmentSubReason = value;
    }

    /**
     * Ruft den Wert der publicEventReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public PublicEventTypeEnum getPublicEventReason() {
        return publicEventReason;
    }

    /**
     * Legt den Wert der publicEventReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public void setPublicEventReason(PublicEventTypeEnum value) {
        this.publicEventReason = value;
    }

    /**
     * Gets the value of the reasonName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the reasonName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getReasonName() {
        if (reasonName == null) {
            reasonName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.reasonName;
    }

    /**
     * Ruft den Wert der severity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SeverityEnumeration }
     *     
     */
    public SeverityEnumeration getSeverity() {
        return severity;
    }

    /**
     * Legt den Wert der severity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityEnumeration }
     *     
     */
    public void setSeverity(SeverityEnumeration value) {
        this.severity = value;
    }

    /**
     * Ruft den Wert der priority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Legt den Wert der priority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Ruft den Wert der sensitivity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SensitivityEnumeration }
     *     
     */
    public SensitivityEnumeration getSensitivity() {
        return sensitivity;
    }

    /**
     * Legt den Wert der sensitivity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitivityEnumeration }
     *     
     */
    public void setSensitivity(SensitivityEnumeration value) {
        this.sensitivity = value;
    }

    /**
     * Ruft den Wert der audience-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AudienceEnumeration }
     *     
     */
    public AudienceEnumeration getAudience() {
        return audience;
    }

    /**
     * Legt den Wert der audience-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceEnumeration }
     *     
     */
    public void setAudience(AudienceEnumeration value) {
        this.audience = value;
    }

    /**
     * Ruft den Wert der scopeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScopeTypeEnumeration }
     *     
     */
    public ScopeTypeEnumeration getScopeType() {
        return scopeType;
    }

    /**
     * Legt den Wert der scopeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeTypeEnumeration }
     *     
     */
    public void setScopeType(ScopeTypeEnumeration value) {
        this.scopeType = value;
    }

    /**
     * Ruft den Wert der reportType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReportTypeEnumeration }
     *     
     */
    public ReportTypeEnumeration getReportType() {
        return reportType;
    }

    /**
     * Legt den Wert der reportType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportTypeEnumeration }
     *     
     */
    public void setReportType(ReportTypeEnumeration value) {
        this.reportType = value;
    }

    /**
     * Ruft den Wert der planned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanned() {
        return planned;
    }

    /**
     * Legt den Wert der planned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanned(Boolean value) {
        this.planned = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<String>();
        }
        return this.keywords;
    }

    /**
     * Ruft den Wert der secondaryReasons-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link uk.org.siri.siri.RoadSituationElementStructure.SecondaryReasons }
     *     
     */
    public uk.org.siri.siri.RoadSituationElementStructure.SecondaryReasons getSecondaryReasons() {
        return secondaryReasons;
    }

    /**
     * Legt den Wert der secondaryReasons-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link uk.org.siri.siri.RoadSituationElementStructure.SecondaryReasons }
     *     
     */
    public void setSecondaryReasons(uk.org.siri.siri.RoadSituationElementStructure.SecondaryReasons value) {
        this.secondaryReasons = value;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the summary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultedTextStructure }
     * 
     * 
     */
    public List<DefaultedTextStructure> getSummary() {
        if (summary == null) {
            summary = new ArrayList<DefaultedTextStructure>();
        }
        return this.summary;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultedTextStructure }
     * 
     * 
     */
    public List<DefaultedTextStructure> getDescription() {
        if (description == null) {
            description = new ArrayList<DefaultedTextStructure>();
        }
        return this.description;
    }

    /**
     * Gets the value of the detail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the detail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultedTextStructure }
     * 
     * 
     */
    public List<DefaultedTextStructure> getDetail() {
        if (detail == null) {
            detail = new ArrayList<DefaultedTextStructure>();
        }
        return this.detail;
    }

    /**
     * Gets the value of the advice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the advice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultedTextStructure }
     * 
     * 
     */
    public List<DefaultedTextStructure> getAdvice() {
        if (advice == null) {
            advice = new ArrayList<DefaultedTextStructure>();
        }
        return this.advice;
    }

    /**
     * Ruft den Wert der internal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DefaultedTextStructure }
     *     
     */
    public DefaultedTextStructure getInternal() {
        return internal;
    }

    /**
     * Legt den Wert der internal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultedTextStructure }
     *     
     */
    public void setInternal(DefaultedTextStructure value) {
        this.internal = value;
    }

    /**
     * Ruft den Wert der images-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link uk.org.siri.siri.RoadSituationElementStructure.Images }
     *     
     */
    public uk.org.siri.siri.RoadSituationElementStructure.Images getImages() {
        return images;
    }

    /**
     * Legt den Wert der images-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link uk.org.siri.siri.RoadSituationElementStructure.Images }
     *     
     */
    public void setImages(uk.org.siri.siri.RoadSituationElementStructure.Images value) {
        this.images = value;
    }

    /**
     * Ruft den Wert der infoLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link uk.org.siri.siri.RoadSituationElementStructure.InfoLinks }
     *     
     */
    public uk.org.siri.siri.RoadSituationElementStructure.InfoLinks getInfoLinks() {
        return infoLinks;
    }

    /**
     * Legt den Wert der infoLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link uk.org.siri.siri.RoadSituationElementStructure.InfoLinks }
     *     
     */
    public void setInfoLinks(uk.org.siri.siri.RoadSituationElementStructure.InfoLinks value) {
        this.infoLinks = value;
    }

    /**
     * Ruft den Wert der affects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure }
     *     
     */
    public AffectsScopeStructure getAffects() {
        return affects;
    }

    /**
     * Legt den Wert der affects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure }
     *     
     */
    public void setAffects(AffectsScopeStructure value) {
        this.affects = value;
    }

    /**
     * Ruft den Wert der consequences-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PtConsequencesStructure }
     *     
     */
    public PtConsequencesStructure getConsequences() {
        return consequences;
    }

    /**
     * Legt den Wert der consequences-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PtConsequencesStructure }
     *     
     */
    public void setConsequences(PtConsequencesStructure value) {
        this.consequences = value;
    }

    /**
     * Ruft den Wert der publishingActions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActionsStructure }
     *     
     */
    public ActionsStructure getPublishingActions() {
        return publishingActions;
    }

    /**
     * Legt den Wert der publishingActions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsStructure }
     *     
     */
    public void setPublishingActions(ActionsStructure value) {
        this.publishingActions = value;
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

    public PtSituationElementStructure withVerification(VerificationStatusEnumeration value) {
        setVerification(value);
        return this;
    }

    public PtSituationElementStructure withProgress(WorkflowStatusEnumeration value) {
        setProgress(value);
        return this;
    }

    public PtSituationElementStructure withQualityIndex(QualityIndexEnumeration value) {
        setQualityIndex(value);
        return this;
    }

    public PtSituationElementStructure withReality(InformationStatusEnum value) {
        setReality(value);
        return this;
    }

    public PtSituationElementStructure withLikelihood(ProbabilityOfOccurrenceEnum value) {
        setLikelihood(value);
        return this;
    }

    public PtSituationElementStructure withPublication(String... values) {
        if (values!= null) {
            for (String value: values) {
                getPublication().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withPublication(Collection<String> values) {
        if (values!= null) {
            getPublication().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withValidityPeriod(HalfOpenTimestampOutputRangeStructure... values) {
        if (values!= null) {
            for (HalfOpenTimestampOutputRangeStructure value: values) {
                getValidityPeriod().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withValidityPeriod(Collection<HalfOpenTimestampOutputRangeStructure> values) {
        if (values!= null) {
            getValidityPeriod().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withRepetitions(uk.org.siri.siri.RoadSituationElementStructure.Repetitions value) {
        setRepetitions(value);
        return this;
    }

    public PtSituationElementStructure withPublicationWindow(HalfOpenTimestampOutputRangeStructure... values) {
        if (values!= null) {
            for (HalfOpenTimestampOutputRangeStructure value: values) {
                getPublicationWindow().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withPublicationWindow(Collection<HalfOpenTimestampOutputRangeStructure> values) {
        if (values!= null) {
            getPublicationWindow().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withAlertCause(AlertCauseEnumeration value) {
        setAlertCause(value);
        return this;
    }

    public PtSituationElementStructure withUnknownReason(String value) {
        setUnknownReason(value);
        return this;
    }

    public PtSituationElementStructure withMiscellaneousReason(String value) {
        setMiscellaneousReason(value);
        return this;
    }

    public PtSituationElementStructure withPersonnelReason(String value) {
        setPersonnelReason(value);
        return this;
    }

    public PtSituationElementStructure withEquipmentReason(String value) {
        setEquipmentReason(value);
        return this;
    }

    public PtSituationElementStructure withEnvironmentReason(String value) {
        setEnvironmentReason(value);
        return this;
    }

    public PtSituationElementStructure withUndefinedReason(String value) {
        setUndefinedReason(value);
        return this;
    }

    public PtSituationElementStructure withMiscellaneousSubReason(String value) {
        setMiscellaneousSubReason(value);
        return this;
    }

    public PtSituationElementStructure withPersonnelSubReason(String value) {
        setPersonnelSubReason(value);
        return this;
    }

    public PtSituationElementStructure withEquipmentSubReason(String value) {
        setEquipmentSubReason(value);
        return this;
    }

    public PtSituationElementStructure withEnvironmentSubReason(String value) {
        setEnvironmentSubReason(value);
        return this;
    }

    public PtSituationElementStructure withPublicEventReason(PublicEventTypeEnum value) {
        setPublicEventReason(value);
        return this;
    }

    public PtSituationElementStructure withReasonName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getReasonName().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withReasonName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getReasonName().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withSeverity(SeverityEnumeration value) {
        setSeverity(value);
        return this;
    }

    public PtSituationElementStructure withPriority(BigInteger value) {
        setPriority(value);
        return this;
    }

    public PtSituationElementStructure withSensitivity(SensitivityEnumeration value) {
        setSensitivity(value);
        return this;
    }

    public PtSituationElementStructure withAudience(AudienceEnumeration value) {
        setAudience(value);
        return this;
    }

    public PtSituationElementStructure withScopeType(ScopeTypeEnumeration value) {
        setScopeType(value);
        return this;
    }

    public PtSituationElementStructure withReportType(ReportTypeEnumeration value) {
        setReportType(value);
        return this;
    }

    public PtSituationElementStructure withPlanned(Boolean value) {
        setPlanned(value);
        return this;
    }

    public PtSituationElementStructure withKeywords(String... values) {
        if (values!= null) {
            for (String value: values) {
                getKeywords().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withKeywords(Collection<String> values) {
        if (values!= null) {
            getKeywords().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withSecondaryReasons(uk.org.siri.siri.RoadSituationElementStructure.SecondaryReasons value) {
        setSecondaryReasons(value);
        return this;
    }

    public PtSituationElementStructure withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    public PtSituationElementStructure withSummary(DefaultedTextStructure... values) {
        if (values!= null) {
            for (DefaultedTextStructure value: values) {
                getSummary().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withSummary(Collection<DefaultedTextStructure> values) {
        if (values!= null) {
            getSummary().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withDescription(DefaultedTextStructure... values) {
        if (values!= null) {
            for (DefaultedTextStructure value: values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withDescription(Collection<DefaultedTextStructure> values) {
        if (values!= null) {
            getDescription().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withDetail(DefaultedTextStructure... values) {
        if (values!= null) {
            for (DefaultedTextStructure value: values) {
                getDetail().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withDetail(Collection<DefaultedTextStructure> values) {
        if (values!= null) {
            getDetail().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withAdvice(DefaultedTextStructure... values) {
        if (values!= null) {
            for (DefaultedTextStructure value: values) {
                getAdvice().add(value);
            }
        }
        return this;
    }

    public PtSituationElementStructure withAdvice(Collection<DefaultedTextStructure> values) {
        if (values!= null) {
            getAdvice().addAll(values);
        }
        return this;
    }

    public PtSituationElementStructure withInternal(DefaultedTextStructure value) {
        setInternal(value);
        return this;
    }

    public PtSituationElementStructure withImages(uk.org.siri.siri.RoadSituationElementStructure.Images value) {
        setImages(value);
        return this;
    }

    public PtSituationElementStructure withInfoLinks(uk.org.siri.siri.RoadSituationElementStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    public PtSituationElementStructure withAffects(AffectsScopeStructure value) {
        setAffects(value);
        return this;
    }

    public PtSituationElementStructure withConsequences(PtConsequencesStructure value) {
        setConsequences(value);
        return this;
    }

    public PtSituationElementStructure withPublishingActions(ActionsStructure value) {
        setPublishingActions(value);
        return this;
    }

    public PtSituationElementStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withReferences(ReferencesStructure value) {
        setReferences(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withSource(SituationSourceStructure value) {
        setSource(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withVersionedAtTime(ZonedDateTime value) {
        setVersionedAtTime(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withCreationTime(ZonedDateTime value) {
        setCreationTime(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withCountryRef(CountryRefStructure value) {
        setCountryRef(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withParticipantRef(ParticipantRefStructure value) {
        setParticipantRef(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withSituationNumber(EntryQualifierStructure value) {
        setSituationNumber(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withUpdateCountryRef(CountryRefStructure value) {
        setUpdateCountryRef(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withUpdateParticipantRef(ParticipantRefStructure value) {
        setUpdateParticipantRef(value);
        return this;
    }

    @Override
    public PtSituationElementStructure withVersion(SituationVersion value) {
        setVersion(value);
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
