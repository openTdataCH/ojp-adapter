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
import eu.datex2.schema._2_0rc1._2_0.SituationRecord;
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
 * <p>Java-Klasse für RoadSituationElementStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoadSituationElementStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}SituationElementStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}RoadSituationBodyGroup"/&gt;
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
@XmlType(name = "RoadSituationElementStructure", propOrder = {
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
    "situationRecord",
    "extensions"
})
public class RoadSituationElementStructure
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
    protected RoadSituationElementStructure.Repetitions repetitions;
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
    protected RoadSituationElementStructure.SecondaryReasons secondaryReasons;
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
    protected RoadSituationElementStructure.Images images;
    @XmlElement(name = "InfoLinks")
    protected RoadSituationElementStructure.InfoLinks infoLinks;
    @XmlElement(name = "Affects")
    protected AffectsScopeStructure affects;
    @XmlElement(name = "Consequences")
    protected PtConsequencesStructure consequences;
    @XmlElement(name = "PublishingActions")
    protected ActionsStructure publishingActions;
    @XmlElement(name = "SituationRecord")
    protected SituationRecord situationRecord;
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
     *     {@link RoadSituationElementStructure.Repetitions }
     *     
     */
    public RoadSituationElementStructure.Repetitions getRepetitions() {
        return repetitions;
    }

    /**
     * Legt den Wert der repetitions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadSituationElementStructure.Repetitions }
     *     
     */
    public void setRepetitions(RoadSituationElementStructure.Repetitions value) {
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
     *     {@link RoadSituationElementStructure.SecondaryReasons }
     *     
     */
    public RoadSituationElementStructure.SecondaryReasons getSecondaryReasons() {
        return secondaryReasons;
    }

    /**
     * Legt den Wert der secondaryReasons-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadSituationElementStructure.SecondaryReasons }
     *     
     */
    public void setSecondaryReasons(RoadSituationElementStructure.SecondaryReasons value) {
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
     *     {@link RoadSituationElementStructure.Images }
     *     
     */
    public RoadSituationElementStructure.Images getImages() {
        return images;
    }

    /**
     * Legt den Wert der images-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadSituationElementStructure.Images }
     *     
     */
    public void setImages(RoadSituationElementStructure.Images value) {
        this.images = value;
    }

    /**
     * Ruft den Wert der infoLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoadSituationElementStructure.InfoLinks }
     *     
     */
    public RoadSituationElementStructure.InfoLinks getInfoLinks() {
        return infoLinks;
    }

    /**
     * Legt den Wert der infoLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadSituationElementStructure.InfoLinks }
     *     
     */
    public void setInfoLinks(RoadSituationElementStructure.InfoLinks value) {
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
     * Ruft den Wert der situationRecord-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SituationRecord }
     *     
     */
    public SituationRecord getSituationRecord() {
        return situationRecord;
    }

    /**
     * Legt den Wert der situationRecord-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRecord }
     *     
     */
    public void setSituationRecord(SituationRecord value) {
        this.situationRecord = value;
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

    public RoadSituationElementStructure withVerification(VerificationStatusEnumeration value) {
        setVerification(value);
        return this;
    }

    public RoadSituationElementStructure withProgress(WorkflowStatusEnumeration value) {
        setProgress(value);
        return this;
    }

    public RoadSituationElementStructure withQualityIndex(QualityIndexEnumeration value) {
        setQualityIndex(value);
        return this;
    }

    public RoadSituationElementStructure withReality(InformationStatusEnum value) {
        setReality(value);
        return this;
    }

    public RoadSituationElementStructure withLikelihood(ProbabilityOfOccurrenceEnum value) {
        setLikelihood(value);
        return this;
    }

    public RoadSituationElementStructure withPublication(String... values) {
        if (values!= null) {
            for (String value: values) {
                getPublication().add(value);
            }
        }
        return this;
    }

    public RoadSituationElementStructure withPublication(Collection<String> values) {
        if (values!= null) {
            getPublication().addAll(values);
        }
        return this;
    }

    public RoadSituationElementStructure withValidityPeriod(HalfOpenTimestampOutputRangeStructure... values) {
        if (values!= null) {
            for (HalfOpenTimestampOutputRangeStructure value: values) {
                getValidityPeriod().add(value);
            }
        }
        return this;
    }

    public RoadSituationElementStructure withValidityPeriod(Collection<HalfOpenTimestampOutputRangeStructure> values) {
        if (values!= null) {
            getValidityPeriod().addAll(values);
        }
        return this;
    }

    public RoadSituationElementStructure withRepetitions(RoadSituationElementStructure.Repetitions value) {
        setRepetitions(value);
        return this;
    }

    public RoadSituationElementStructure withPublicationWindow(HalfOpenTimestampOutputRangeStructure... values) {
        if (values!= null) {
            for (HalfOpenTimestampOutputRangeStructure value: values) {
                getPublicationWindow().add(value);
            }
        }
        return this;
    }

    public RoadSituationElementStructure withPublicationWindow(Collection<HalfOpenTimestampOutputRangeStructure> values) {
        if (values!= null) {
            getPublicationWindow().addAll(values);
        }
        return this;
    }

    public RoadSituationElementStructure withAlertCause(AlertCauseEnumeration value) {
        setAlertCause(value);
        return this;
    }

    public RoadSituationElementStructure withUnknownReason(String value) {
        setUnknownReason(value);
        return this;
    }

    public RoadSituationElementStructure withMiscellaneousReason(String value) {
        setMiscellaneousReason(value);
        return this;
    }

    public RoadSituationElementStructure withPersonnelReason(String value) {
        setPersonnelReason(value);
        return this;
    }

    public RoadSituationElementStructure withEquipmentReason(String value) {
        setEquipmentReason(value);
        return this;
    }

    public RoadSituationElementStructure withEnvironmentReason(String value) {
        setEnvironmentReason(value);
        return this;
    }

    public RoadSituationElementStructure withUndefinedReason(String value) {
        setUndefinedReason(value);
        return this;
    }

    public RoadSituationElementStructure withMiscellaneousSubReason(String value) {
        setMiscellaneousSubReason(value);
        return this;
    }

    public RoadSituationElementStructure withPersonnelSubReason(String value) {
        setPersonnelSubReason(value);
        return this;
    }

    public RoadSituationElementStructure withEquipmentSubReason(String value) {
        setEquipmentSubReason(value);
        return this;
    }

    public RoadSituationElementStructure withEnvironmentSubReason(String value) {
        setEnvironmentSubReason(value);
        return this;
    }

    public RoadSituationElementStructure withPublicEventReason(PublicEventTypeEnum value) {
        setPublicEventReason(value);
        return this;
    }

    public RoadSituationElementStructure withReasonName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getReasonName().add(value);
            }
        }
        return this;
    }

    public RoadSituationElementStructure withReasonName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getReasonName().addAll(values);
        }
        return this;
    }

    public RoadSituationElementStructure withSeverity(SeverityEnumeration value) {
        setSeverity(value);
        return this;
    }

    public RoadSituationElementStructure withPriority(BigInteger value) {
        setPriority(value);
        return this;
    }

    public RoadSituationElementStructure withSensitivity(SensitivityEnumeration value) {
        setSensitivity(value);
        return this;
    }

    public RoadSituationElementStructure withAudience(AudienceEnumeration value) {
        setAudience(value);
        return this;
    }

    public RoadSituationElementStructure withScopeType(ScopeTypeEnumeration value) {
        setScopeType(value);
        return this;
    }

    public RoadSituationElementStructure withReportType(ReportTypeEnumeration value) {
        setReportType(value);
        return this;
    }

    public RoadSituationElementStructure withPlanned(Boolean value) {
        setPlanned(value);
        return this;
    }

    public RoadSituationElementStructure withKeywords(String... values) {
        if (values!= null) {
            for (String value: values) {
                getKeywords().add(value);
            }
        }
        return this;
    }

    public RoadSituationElementStructure withKeywords(Collection<String> values) {
        if (values!= null) {
            getKeywords().addAll(values);
        }
        return this;
    }

    public RoadSituationElementStructure withSecondaryReasons(RoadSituationElementStructure.SecondaryReasons value) {
        setSecondaryReasons(value);
        return this;
    }

    public RoadSituationElementStructure withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    public RoadSituationElementStructure withSummary(DefaultedTextStructure... values) {
        if (values!= null) {
            for (DefaultedTextStructure value: values) {
                getSummary().add(value);
            }
        }
        return this;
    }

    public RoadSituationElementStructure withSummary(Collection<DefaultedTextStructure> values) {
        if (values!= null) {
            getSummary().addAll(values);
        }
        return this;
    }

    public RoadSituationElementStructure withDescription(DefaultedTextStructure... values) {
        if (values!= null) {
            for (DefaultedTextStructure value: values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    public RoadSituationElementStructure withDescription(Collection<DefaultedTextStructure> values) {
        if (values!= null) {
            getDescription().addAll(values);
        }
        return this;
    }

    public RoadSituationElementStructure withDetail(DefaultedTextStructure... values) {
        if (values!= null) {
            for (DefaultedTextStructure value: values) {
                getDetail().add(value);
            }
        }
        return this;
    }

    public RoadSituationElementStructure withDetail(Collection<DefaultedTextStructure> values) {
        if (values!= null) {
            getDetail().addAll(values);
        }
        return this;
    }

    public RoadSituationElementStructure withAdvice(DefaultedTextStructure... values) {
        if (values!= null) {
            for (DefaultedTextStructure value: values) {
                getAdvice().add(value);
            }
        }
        return this;
    }

    public RoadSituationElementStructure withAdvice(Collection<DefaultedTextStructure> values) {
        if (values!= null) {
            getAdvice().addAll(values);
        }
        return this;
    }

    public RoadSituationElementStructure withInternal(DefaultedTextStructure value) {
        setInternal(value);
        return this;
    }

    public RoadSituationElementStructure withImages(RoadSituationElementStructure.Images value) {
        setImages(value);
        return this;
    }

    public RoadSituationElementStructure withInfoLinks(RoadSituationElementStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    public RoadSituationElementStructure withAffects(AffectsScopeStructure value) {
        setAffects(value);
        return this;
    }

    public RoadSituationElementStructure withConsequences(PtConsequencesStructure value) {
        setConsequences(value);
        return this;
    }

    public RoadSituationElementStructure withPublishingActions(ActionsStructure value) {
        setPublishingActions(value);
        return this;
    }

    public RoadSituationElementStructure withSituationRecord(SituationRecord value) {
        setSituationRecord(value);
        return this;
    }

    public RoadSituationElementStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public RoadSituationElementStructure withReferences(ReferencesStructure value) {
        setReferences(value);
        return this;
    }

    @Override
    public RoadSituationElementStructure withSource(SituationSourceStructure value) {
        setSource(value);
        return this;
    }

    @Override
    public RoadSituationElementStructure withVersionedAtTime(ZonedDateTime value) {
        setVersionedAtTime(value);
        return this;
    }

    @Override
    public RoadSituationElementStructure withCreationTime(ZonedDateTime value) {
        setCreationTime(value);
        return this;
    }

    @Override
    public RoadSituationElementStructure withCountryRef(CountryRefStructure value) {
        setCountryRef(value);
        return this;
    }

    @Override
    public RoadSituationElementStructure withParticipantRef(ParticipantRefStructure value) {
        setParticipantRef(value);
        return this;
    }

    @Override
    public RoadSituationElementStructure withSituationNumber(EntryQualifierStructure value) {
        setSituationNumber(value);
        return this;
    }

    @Override
    public RoadSituationElementStructure withUpdateCountryRef(CountryRefStructure value) {
        setUpdateCountryRef(value);
        return this;
    }

    @Override
    public RoadSituationElementStructure withUpdateParticipantRef(ParticipantRefStructure value) {
        setUpdateParticipantRef(value);
        return this;
    }

    @Override
    public RoadSituationElementStructure withVersion(SituationVersion value) {
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


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Image" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.siri.org.uk/siri}ImageStructure"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "image"
    })
    public static class Images {

        @XmlElement(name = "Image", required = true)
        protected List<RoadSituationElementStructure.Images.Image> image;

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
         * {@link RoadSituationElementStructure.Images.Image }
         * 
         * 
         */
        public List<RoadSituationElementStructure.Images.Image> getImage() {
            if (image == null) {
                image = new ArrayList<RoadSituationElementStructure.Images.Image>();
            }
            return this.image;
        }

        public RoadSituationElementStructure.Images withImage(RoadSituationElementStructure.Images.Image... values) {
            if (values!= null) {
                for (RoadSituationElementStructure.Images.Image value: values) {
                    getImage().add(value);
                }
            }
            return this;
        }

        public RoadSituationElementStructure.Images withImage(Collection<RoadSituationElementStructure.Images.Image> values) {
            if (values!= null) {
                getImage().addAll(values);
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


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.siri.org.uk/siri}ImageStructure"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Image
            extends ImageStructure
        {


            @Override
            public RoadSituationElementStructure.Images.Image withImageRef(String value) {
                setImageRef(value);
                return this;
            }

            @Override
            public RoadSituationElementStructure.Images.Image withImageBinary(byte[] value) {
                setImageBinary(value);
                return this;
            }

            @Override
            public RoadSituationElementStructure.Images.Image withImageContent(ImageContentEnumeration value) {
                setImageContent(value);
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

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="InfoLink" type="{http://www.siri.org.uk/siri}InfoLinkStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "infoLink"
    })
    public static class InfoLinks {

        @XmlElement(name = "InfoLink", required = true)
        protected List<InfoLinkStructure> infoLink;

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

        public RoadSituationElementStructure.InfoLinks withInfoLink(InfoLinkStructure... values) {
            if (values!= null) {
                for (InfoLinkStructure value: values) {
                    getInfoLink().add(value);
                }
            }
            return this;
        }

        public RoadSituationElementStructure.InfoLinks withInfoLink(Collection<InfoLinkStructure> values) {
            if (values!= null) {
                getInfoLink().addAll(values);
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


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.siri.org.uk/siri}DayType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dayType"
    })
    public static class Repetitions {

        @XmlElement(name = "DayType", required = true, defaultValue = "everyDay")
        @XmlSchemaType(name = "NMTOKEN")
        protected List<DayTypeEnumeration> dayType;

        /**
         * Gets the value of the dayType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the dayType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDayType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DayTypeEnumeration }
         * 
         * 
         */
        public List<DayTypeEnumeration> getDayType() {
            if (dayType == null) {
                dayType = new ArrayList<DayTypeEnumeration>();
            }
            return this.dayType;
        }

        public RoadSituationElementStructure.Repetitions withDayType(DayTypeEnumeration... values) {
            if (values!= null) {
                for (DayTypeEnumeration value: values) {
                    getDayType().add(value);
                }
            }
            return this;
        }

        public RoadSituationElementStructure.Repetitions withDayType(Collection<DayTypeEnumeration> values) {
            if (values!= null) {
                getDayType().addAll(values);
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


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;element name="Reason"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;group ref="{http://www.siri.org.uk/siri}ReasonGroup"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reason"
    })
    public static class SecondaryReasons {

        @XmlElement(name = "Reason", required = true)
        protected List<RoadSituationElementStructure.SecondaryReasons.Reason> reason;

        /**
         * Gets the value of the reason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the reason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoadSituationElementStructure.SecondaryReasons.Reason }
         * 
         * 
         */
        public List<RoadSituationElementStructure.SecondaryReasons.Reason> getReason() {
            if (reason == null) {
                reason = new ArrayList<RoadSituationElementStructure.SecondaryReasons.Reason>();
            }
            return this.reason;
        }

        public RoadSituationElementStructure.SecondaryReasons withReason(RoadSituationElementStructure.SecondaryReasons.Reason... values) {
            if (values!= null) {
                for (RoadSituationElementStructure.SecondaryReasons.Reason value: values) {
                    getReason().add(value);
                }
            }
            return this;
        }

        public RoadSituationElementStructure.SecondaryReasons withReason(Collection<RoadSituationElementStructure.SecondaryReasons.Reason> values) {
            if (values!= null) {
                getReason().addAll(values);
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


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;group ref="{http://www.siri.org.uk/siri}ReasonGroup"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
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
            "reasonName"
        })
        public static class Reason {

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

            public RoadSituationElementStructure.SecondaryReasons.Reason withAlertCause(AlertCauseEnumeration value) {
                setAlertCause(value);
                return this;
            }

            public RoadSituationElementStructure.SecondaryReasons.Reason withUnknownReason(String value) {
                setUnknownReason(value);
                return this;
            }

            public RoadSituationElementStructure.SecondaryReasons.Reason withMiscellaneousReason(String value) {
                setMiscellaneousReason(value);
                return this;
            }

            public RoadSituationElementStructure.SecondaryReasons.Reason withPersonnelReason(String value) {
                setPersonnelReason(value);
                return this;
            }

            public RoadSituationElementStructure.SecondaryReasons.Reason withEquipmentReason(String value) {
                setEquipmentReason(value);
                return this;
            }

            public RoadSituationElementStructure.SecondaryReasons.Reason withEnvironmentReason(String value) {
                setEnvironmentReason(value);
                return this;
            }

            public RoadSituationElementStructure.SecondaryReasons.Reason withUndefinedReason(String value) {
                setUndefinedReason(value);
                return this;
            }

            public RoadSituationElementStructure.SecondaryReasons.Reason withMiscellaneousSubReason(String value) {
                setMiscellaneousSubReason(value);
                return this;
            }

            public RoadSituationElementStructure.SecondaryReasons.Reason withPersonnelSubReason(String value) {
                setPersonnelSubReason(value);
                return this;
            }

            public RoadSituationElementStructure.SecondaryReasons.Reason withEquipmentSubReason(String value) {
                setEquipmentSubReason(value);
                return this;
            }

            public RoadSituationElementStructure.SecondaryReasons.Reason withEnvironmentSubReason(String value) {
                setEnvironmentSubReason(value);
                return this;
            }

            public RoadSituationElementStructure.SecondaryReasons.Reason withPublicEventReason(PublicEventTypeEnum value) {
                setPublicEventReason(value);
                return this;
            }

            public RoadSituationElementStructure.SecondaryReasons.Reason withReasonName(NaturalLanguageStringStructure... values) {
                if (values!= null) {
                    for (NaturalLanguageStringStructure value: values) {
                        getReasonName().add(value);
                    }
                }
                return this;
            }

            public RoadSituationElementStructure.SecondaryReasons.Reason withReasonName(Collection<NaturalLanguageStringStructure> values) {
                if (values!= null) {
                    getReasonName().addAll(values);
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

    }

}
