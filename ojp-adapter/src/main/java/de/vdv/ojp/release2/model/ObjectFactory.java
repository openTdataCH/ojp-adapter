//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;
import uk.org.siri.siri.DataFrameRefStructure;
import uk.org.siri.siri.OperatorRefStructure;
import uk.org.siri.siri.ParticipantRefStructure;
import uk.org.siri.siri.ProductCategoryRefStructure;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.vdv.ojp.release2.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AvailabilityProblemType_QNAME = new QName("http://www.vdv.de/ojp", "AvailabilityProblemType");
    private final static QName _ErrorType_QNAME = new QName("http://www.vdv.de/ojp", "ErrorType");
    private final static QName _OJPError_QNAME = new QName("http://www.vdv.de/ojp", "OJPError");
    private final static QName _ParticipantRef_QNAME = new QName("http://www.vdv.de/ojp", "ParticipantRef");
    private final static QName _OperatorRef_QNAME = new QName("http://www.vdv.de/ojp", "OperatorRef");
    private final static QName _ProductCategoryRef_QNAME = new QName("http://www.vdv.de/ojp", "ProductCategoryRef");
    private final static QName _JourneyRef_QNAME = new QName("http://www.vdv.de/ojp", "JourneyRef");
    private final static QName _OwnerRef_QNAME = new QName("http://www.vdv.de/ojp", "OwnerRef");
    private final static QName _OperatingDayRef_QNAME = new QName("http://www.vdv.de/ojp", "OperatingDayRef");
    private final static QName _FareAuthorityRef_QNAME = new QName("http://www.vdv.de/ojp", "FareAuthorityRef");
    private final static QName _TariffZoneRef_QNAME = new QName("http://www.vdv.de/ojp", "TariffZoneRef");
    private final static QName _FareProductRef_QNAME = new QName("http://www.vdv.de/ojp", "FareProductRef");
    private final static QName _FareProblemType_QNAME = new QName("http://www.vdv.de/ojp", "FareProblemType");
    private final static QName _LineInformationProblemType_QNAME = new QName("http://www.vdv.de/ojp", "LineInformationProblemType");
    private final static QName _StopPlaceRef_QNAME = new QName("http://www.vdv.de/ojp", "StopPlaceRef");
    private final static QName _TopographicPlaceRef_QNAME = new QName("http://www.vdv.de/ojp", "TopographicPlaceRef");
    private final static QName _PointOfInterestRef_QNAME = new QName("http://www.vdv.de/ojp", "PointOfInterestRef");
    private final static QName _AddressRef_QNAME = new QName("http://www.vdv.de/ojp", "AddressRef");
    private final static QName _LocationProblemType_QNAME = new QName("http://www.vdv.de/ojp", "LocationProblemType");
    private final static QName _ExchangePointsProblemType_QNAME = new QName("http://www.vdv.de/ojp", "ExchangePointsProblemType");
    private final static QName _OJPFareRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPFareRequest");
    private final static QName _OJPFareDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPFareDelivery");
    private final static QName _OJPLocationInformationRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPLocationInformationRequest");
    private final static QName _OJPLocationInformationDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPLocationInformationDelivery");
    private final static QName _OJPExchangePointsRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPExchangePointsRequest");
    private final static QName _OJPExchangePointsDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPExchangePointsDelivery");
    private final static QName _OJPStopEventRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPStopEventRequest");
    private final static QName _OJPStopEventDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPStopEventDelivery");
    private final static QName _OJPTripInfoRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPTripInfoRequest");
    private final static QName _OJPTripInfoDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPTripInfoDelivery");
    private final static QName _OJPTripRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPTripRequest");
    private final static QName _OJPTripDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPTripDelivery");
    private final static QName _OJPMultiPointTripRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPMultiPointTripRequest");
    private final static QName _OJPMultiPointTripDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPMultiPointTripDelivery");
    private final static QName _OJPStatusRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPStatusRequest");
    private final static QName _OJPStatusDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPStatusDelivery");
    private final static QName _OJPTripRefineRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPTripRefineRequest");
    private final static QName _OJPTripRefineDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPTripRefineDelivery");
    private final static QName _OJPAvailabilityRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPAvailabilityRequest");
    private final static QName _OJPAvailabilityDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPAvailabilityDelivery");
    private final static QName _OJPLineInformationRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPLineInformationRequest");
    private final static QName _OJPLineInformationDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPLineInformationDelivery");
    private final static QName _OJPTripChangeRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPTripChangeRequest");
    private final static QName _OJPTripChangeDelivery_QNAME = new QName("http://www.vdv.de/ojp", "OJPTripChangeDelivery");
    private final static QName _OJPGenericProblemType_QNAME = new QName("http://www.vdv.de/ojp", "OJPGenericProblemType");
    private final static QName _SituationFullRef_QNAME = new QName("http://www.vdv.de/ojp", "SituationFullRef");
    private final static QName _StopEventProblemType_QNAME = new QName("http://www.vdv.de/ojp", "StopEventProblemType");
    private final static QName _TripInfoProblemType_QNAME = new QName("http://www.vdv.de/ojp", "TripInfoProblemType");
    private final static QName _TripProblemType_QNAME = new QName("http://www.vdv.de/ojp", "TripProblemType");
    private final static QName _TripChangeProblemType_QNAME = new QName("http://www.vdv.de/ojp", "TripChangeProblemType");
    private final static QName _StatusProblemType_QNAME = new QName("http://www.vdv.de/ojp", "StatusProblemType");
    private final static QName _OJPStatusResponse_QNAME = new QName("http://www.vdv.de/ojp", "OJPStatusResponse");
    private final static QName _OJPRequest_QNAME = new QName("http://www.vdv.de/ojp", "OJPRequest");
    private final static QName _OJPResponse_QNAME = new QName("http://www.vdv.de/ojp", "OJPResponse");
    private final static QName _TripFareResultStructureFromLegIdRef_QNAME = new QName("http://www.vdv.de/ojp", "FromLegIdRef");
    private final static QName _TripFareResultStructureToLegIdRef_QNAME = new QName("http://www.vdv.de/ojp", "ToLegIdRef");
    private final static QName _OJPStatusResponseStructureDataFrameRef_QNAME = new QName("http://www.vdv.de/ojp", "DataFrameRef");
    private final static QName _OJPStatusResponseStructureCalcTime_QNAME = new QName("http://www.vdv.de/ojp", "CalcTime");
    private final static QName _OJPStatusResponseStructureErrorCondition_QNAME = new QName("http://www.vdv.de/ojp", "ErrorCondition");
    private final static QName _OJPStatusResponseStructureServiceStarted_QNAME = new QName("http://www.vdv.de/ojp", "ServiceStarted");
    private final static QName _OJPStatusResponseStructureServiceReady_QNAME = new QName("http://www.vdv.de/ojp", "ServiceReady");
    private final static QName _OJPStatusResponseStructureLastTimetableUpdate_QNAME = new QName("http://www.vdv.de/ojp", "LastTimetableUpdate");
    private final static QName _OJPStatusResponseStructureServerBuildVersion_QNAME = new QName("http://www.vdv.de/ojp", "ServerBuildVersion");
    private final static QName _OJPTripChangeDeliveryStructureTripResponseContext_QNAME = new QName("http://www.vdv.de/ojp", "TripResponseContext");
    private final static QName _OJPTripChangeDeliveryStructureTripResult_QNAME = new QName("http://www.vdv.de/ojp", "TripResult");
    private final static QName _OJPAvailabilityDeliveryStructureAvailabilityResponseContext_QNAME = new QName("http://www.vdv.de/ojp", "AvailabilityResponseContext");
    private final static QName _OJPAvailabilityDeliveryStructureAvailabilityResult_QNAME = new QName("http://www.vdv.de/ojp", "AvailabilityResult");
    private final static QName _OJPAvailabilityDeliveryStructureExtension_QNAME = new QName("http://www.vdv.de/ojp", "Extension");
    private final static QName _OJPAvailabilityRequestStructurePublicTransport_QNAME = new QName("http://www.vdv.de/ojp", "PublicTransport");
    private final static QName _OJPAvailabilityRequestStructureMobilityUser_QNAME = new QName("http://www.vdv.de/ojp", "MobilityUser");
    private final static QName _OJPAvailabilityRequestStructureEarliestDepartureTime_QNAME = new QName("http://www.vdv.de/ojp", "EarliestDepartureTime");
    private final static QName _OJPAvailabilityRequestStructureLatestArrivalTime_QNAME = new QName("http://www.vdv.de/ojp", "LatestArrivalTime");
    private final static QName _OJPTripRefineDeliveryStructureUnknownLegRef_QNAME = new QName("http://www.vdv.de/ojp", "UnknownLegRef");
    private final static QName _OJPMultiPointTripDeliveryStructureMultiPointType_QNAME = new QName("http://www.vdv.de/ojp", "MultiPointType");
    private final static QName _OJPMultiPointTripDeliveryStructureMultiPointTripResponseContext_QNAME = new QName("http://www.vdv.de/ojp", "MultiPointTripResponseContext");
    private final static QName _OJPMultiPointTripDeliveryStructureMultiPointTripResult_QNAME = new QName("http://www.vdv.de/ojp", "MultiPointTripResult");
    private final static QName _OJPTripInfoDeliveryStructureTripInfoResponseContext_QNAME = new QName("http://www.vdv.de/ojp", "TripInfoResponseContext");
    private final static QName _OJPTripInfoDeliveryStructureTripInfoResult_QNAME = new QName("http://www.vdv.de/ojp", "TripInfoResult");
    private final static QName _OJPTripInfoRequestStructureTrainNumber_QNAME = new QName("http://www.vdv.de/ojp", "TrainNumber");
    private final static QName _OJPTripInfoRequestStructureTimeOfOperation_QNAME = new QName("http://www.vdv.de/ojp", "TimeOfOperation");
    private final static QName _OJPTripInfoRequestStructureParams_QNAME = new QName("http://www.vdv.de/ojp", "Params");
    private final static QName _OJPStopEventDeliveryStructureStopEventResponseContext_QNAME = new QName("http://www.vdv.de/ojp", "StopEventResponseContext");
    private final static QName _OJPStopEventDeliveryStructureStopEventResult_QNAME = new QName("http://www.vdv.de/ojp", "StopEventResult");
    private final static QName _OJPExchangePointsDeliveryStructureExchangePointsResponseContext_QNAME = new QName("http://www.vdv.de/ojp", "ExchangePointsResponseContext");
    private final static QName _OJPExchangePointsDeliveryStructureContinueAt_QNAME = new QName("http://www.vdv.de/ojp", "ContinueAt");
    private final static QName _OJPExchangePointsDeliveryStructureExchangePointsResult_QNAME = new QName("http://www.vdv.de/ojp", "ExchangePointsResult");
    private final static QName _OJPLocationInformationDeliveryStructureLocationInformationResponseContext_QNAME = new QName("http://www.vdv.de/ojp", "LocationInformationResponseContext");
    private final static QName _OJPLocationInformationDeliveryStructurePlaceResult_QNAME = new QName("http://www.vdv.de/ojp", "PlaceResult");
    private final static QName _OJPFareDeliveryStructureFareResponseContext_QNAME = new QName("http://www.vdv.de/ojp", "FareResponseContext");
    private final static QName _OJPFareDeliveryStructureFareResult_QNAME = new QName("http://www.vdv.de/ojp", "FareResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.vdv.ojp.release2.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OJPErrorStructure }
     * 
     */
    public OJPErrorStructure createOJPErrorStructure() {
        return new OJPErrorStructure();
    }

    /**
     * Create an instance of {@link JourneyRefStructure }
     * 
     */
    public JourneyRefStructure createJourneyRefStructure() {
        return new JourneyRefStructure();
    }

    /**
     * Create an instance of {@link OwnerRefStructure }
     * 
     */
    public OwnerRefStructure createOwnerRefStructure() {
        return new OwnerRefStructure();
    }

    /**
     * Create an instance of {@link OperatingDayRefStructure }
     * 
     */
    public OperatingDayRefStructure createOperatingDayRefStructure() {
        return new OperatingDayRefStructure();
    }

    /**
     * Create an instance of {@link FareAuthorityRefStructure }
     * 
     */
    public FareAuthorityRefStructure createFareAuthorityRefStructure() {
        return new FareAuthorityRefStructure();
    }

    /**
     * Create an instance of {@link TariffZoneRefStructure }
     * 
     */
    public TariffZoneRefStructure createTariffZoneRefStructure() {
        return new TariffZoneRefStructure();
    }

    /**
     * Create an instance of {@link FareProductRefStructure }
     * 
     */
    public FareProductRefStructure createFareProductRefStructure() {
        return new FareProductRefStructure();
    }

    /**
     * Create an instance of {@link StopPlaceRefStructure }
     * 
     */
    public StopPlaceRefStructure createStopPlaceRefStructure() {
        return new StopPlaceRefStructure();
    }

    /**
     * Create an instance of {@link TopographicPlaceRefStructure }
     * 
     */
    public TopographicPlaceRefStructure createTopographicPlaceRefStructure() {
        return new TopographicPlaceRefStructure();
    }

    /**
     * Create an instance of {@link PointOfInterestRefStructure }
     * 
     */
    public PointOfInterestRefStructure createPointOfInterestRefStructure() {
        return new PointOfInterestRefStructure();
    }

    /**
     * Create an instance of {@link AddressRefStructure }
     * 
     */
    public AddressRefStructure createAddressRefStructure() {
        return new AddressRefStructure();
    }

    /**
     * Create an instance of {@link OJPFareRequestStructure }
     * 
     */
    public OJPFareRequestStructure createOJPFareRequestStructure() {
        return new OJPFareRequestStructure();
    }

    /**
     * Create an instance of {@link OJPFareDeliveryStructure }
     * 
     */
    public OJPFareDeliveryStructure createOJPFareDeliveryStructure() {
        return new OJPFareDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPLocationInformationRequestStructure }
     * 
     */
    public OJPLocationInformationRequestStructure createOJPLocationInformationRequestStructure() {
        return new OJPLocationInformationRequestStructure();
    }

    /**
     * Create an instance of {@link OJPLocationInformationDeliveryStructure }
     * 
     */
    public OJPLocationInformationDeliveryStructure createOJPLocationInformationDeliveryStructure() {
        return new OJPLocationInformationDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPExchangePointsRequestStructure }
     * 
     */
    public OJPExchangePointsRequestStructure createOJPExchangePointsRequestStructure() {
        return new OJPExchangePointsRequestStructure();
    }

    /**
     * Create an instance of {@link OJPExchangePointsDeliveryStructure }
     * 
     */
    public OJPExchangePointsDeliveryStructure createOJPExchangePointsDeliveryStructure() {
        return new OJPExchangePointsDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPStopEventRequestStructure }
     * 
     */
    public OJPStopEventRequestStructure createOJPStopEventRequestStructure() {
        return new OJPStopEventRequestStructure();
    }

    /**
     * Create an instance of {@link OJPStopEventDeliveryStructure }
     * 
     */
    public OJPStopEventDeliveryStructure createOJPStopEventDeliveryStructure() {
        return new OJPStopEventDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPTripInfoRequestStructure }
     * 
     */
    public OJPTripInfoRequestStructure createOJPTripInfoRequestStructure() {
        return new OJPTripInfoRequestStructure();
    }

    /**
     * Create an instance of {@link OJPTripInfoDeliveryStructure }
     * 
     */
    public OJPTripInfoDeliveryStructure createOJPTripInfoDeliveryStructure() {
        return new OJPTripInfoDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPTripRequestStructure }
     * 
     */
    public OJPTripRequestStructure createOJPTripRequestStructure() {
        return new OJPTripRequestStructure();
    }

    /**
     * Create an instance of {@link OJPTripDeliveryStructure }
     * 
     */
    public OJPTripDeliveryStructure createOJPTripDeliveryStructure() {
        return new OJPTripDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPMultiPointTripRequestStructure }
     * 
     */
    public OJPMultiPointTripRequestStructure createOJPMultiPointTripRequestStructure() {
        return new OJPMultiPointTripRequestStructure();
    }

    /**
     * Create an instance of {@link OJPMultiPointTripDeliveryStructure }
     * 
     */
    public OJPMultiPointTripDeliveryStructure createOJPMultiPointTripDeliveryStructure() {
        return new OJPMultiPointTripDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPStatusRequestStructure }
     * 
     */
    public OJPStatusRequestStructure createOJPStatusRequestStructure() {
        return new OJPStatusRequestStructure();
    }

    /**
     * Create an instance of {@link OJPStatusDeliveryStructure }
     * 
     */
    public OJPStatusDeliveryStructure createOJPStatusDeliveryStructure() {
        return new OJPStatusDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPTripRefineRequestStructure }
     * 
     */
    public OJPTripRefineRequestStructure createOJPTripRefineRequestStructure() {
        return new OJPTripRefineRequestStructure();
    }

    /**
     * Create an instance of {@link OJPTripRefineDeliveryStructure }
     * 
     */
    public OJPTripRefineDeliveryStructure createOJPTripRefineDeliveryStructure() {
        return new OJPTripRefineDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPAvailabilityRequestStructure }
     * 
     */
    public OJPAvailabilityRequestStructure createOJPAvailabilityRequestStructure() {
        return new OJPAvailabilityRequestStructure();
    }

    /**
     * Create an instance of {@link OJPAvailabilityDeliveryStructure }
     * 
     */
    public OJPAvailabilityDeliveryStructure createOJPAvailabilityDeliveryStructure() {
        return new OJPAvailabilityDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPLineInformationRequestStructure }
     * 
     */
    public OJPLineInformationRequestStructure createOJPLineInformationRequestStructure() {
        return new OJPLineInformationRequestStructure();
    }

    /**
     * Create an instance of {@link OJPLineInformationDeliveryStructure }
     * 
     */
    public OJPLineInformationDeliveryStructure createOJPLineInformationDeliveryStructure() {
        return new OJPLineInformationDeliveryStructure();
    }

    /**
     * Create an instance of {@link OJPTripChangeRequestStructure }
     * 
     */
    public OJPTripChangeRequestStructure createOJPTripChangeRequestStructure() {
        return new OJPTripChangeRequestStructure();
    }

    /**
     * Create an instance of {@link OJPTripChangeDeliveryStructure }
     * 
     */
    public OJPTripChangeDeliveryStructure createOJPTripChangeDeliveryStructure() {
        return new OJPTripChangeDeliveryStructure();
    }

    /**
     * Create an instance of {@link SituationFullRefStructure }
     * 
     */
    public SituationFullRefStructure createSituationFullRefStructure() {
        return new SituationFullRefStructure();
    }

    /**
     * Create an instance of {@link OJPStatusResponseStructure }
     * 
     */
    public OJPStatusResponseStructure createOJPStatusResponseStructure() {
        return new OJPStatusResponseStructure();
    }

    /**
     * Create an instance of {@link OJP }
     * 
     */
    public OJP createOJP() {
        return new OJP();
    }

    /**
     * Create an instance of {@link OJPRequestStructure }
     * 
     */
    public OJPRequestStructure createOJPRequestStructure() {
        return new OJPRequestStructure();
    }

    /**
     * Create an instance of {@link OJPResponseStructure }
     * 
     */
    public OJPResponseStructure createOJPResponseStructure() {
        return new OJPResponseStructure();
    }

    /**
     * Create an instance of {@link BookingPTLegStructure }
     * 
     */
    public BookingPTLegStructure createBookingPTLegStructure() {
        return new BookingPTLegStructure();
    }

    /**
     * Create an instance of {@link BookingUserStructure }
     * 
     */
    public BookingUserStructure createBookingUserStructure() {
        return new BookingUserStructure();
    }

    /**
     * Create an instance of {@link ProvisionedCallAtPlaceStructure }
     * 
     */
    public ProvisionedCallAtPlaceStructure createProvisionedCallAtPlaceStructure() {
        return new ProvisionedCallAtPlaceStructure();
    }

    /**
     * Create an instance of {@link AvailabilityResultStructure }
     * 
     */
    public AvailabilityResultStructure createAvailabilityResultStructure() {
        return new AvailabilityResultStructure();
    }

    /**
     * Create an instance of {@link BookableServiceItemStructure }
     * 
     */
    public BookableServiceItemStructure createBookableServiceItemStructure() {
        return new BookableServiceItemStructure();
    }

    /**
     * Create an instance of {@link PrivateCodeStructure }
     * 
     */
    public PrivateCodeStructure createPrivateCodeStructure() {
        return new PrivateCodeStructure();
    }

    /**
     * Create an instance of {@link LinearShapeStructure }
     * 
     */
    public LinearShapeStructure createLinearShapeStructure() {
        return new LinearShapeStructure();
    }

    /**
     * Create an instance of {@link AreaStructure }
     * 
     */
    public AreaStructure createAreaStructure() {
        return new AreaStructure();
    }

    /**
     * Create an instance of {@link OperatorRefs_RelStructure }
     * 
     */
    public OperatorRefs_RelStructure createOperatorRefs_RelStructure() {
        return new OperatorRefs_RelStructure();
    }

    /**
     * Create an instance of {@link OperatorFilterStructure }
     * 
     */
    public OperatorFilterStructure createOperatorFilterStructure() {
        return new OperatorFilterStructure();
    }

    /**
     * Create an instance of {@link LineDirectionFilterStructure }
     * 
     */
    public LineDirectionFilterStructure createLineDirectionFilterStructure() {
        return new LineDirectionFilterStructure();
    }

    /**
     * Create an instance of {@link VehicleFilterStructure }
     * 
     */
    public VehicleFilterStructure createVehicleFilterStructure() {
        return new VehicleFilterStructure();
    }

    /**
     * Create an instance of {@link AlternativeServiceStructure }
     * 
     */
    public AlternativeServiceStructure createAlternativeServiceStructure() {
        return new AlternativeServiceStructure();
    }

    /**
     * Create an instance of {@link OperatingDaysStructure }
     * 
     */
    public OperatingDaysStructure createOperatingDaysStructure() {
        return new OperatingDaysStructure();
    }

    /**
     * Create an instance of {@link WeekdayTimePeriodStructure }
     * 
     */
    public WeekdayTimePeriodStructure createWeekdayTimePeriodStructure() {
        return new WeekdayTimePeriodStructure();
    }

    /**
     * Create an instance of {@link GeneralAttributeStructure }
     * 
     */
    public GeneralAttributeStructure createGeneralAttributeStructure() {
        return new GeneralAttributeStructure();
    }

    /**
     * Create an instance of {@link EmissionCO2Structure }
     * 
     */
    public EmissionCO2Structure createEmissionCO2Structure() {
        return new EmissionCO2Structure();
    }

    /**
     * Create an instance of {@link StopFareRequestStructure }
     * 
     */
    public StopFareRequestStructure createStopFareRequestStructure() {
        return new StopFareRequestStructure();
    }

    /**
     * Create an instance of {@link PlaceFareRequestStructure }
     * 
     */
    public PlaceFareRequestStructure createPlaceFareRequestStructure() {
        return new PlaceFareRequestStructure();
    }

    /**
     * Create an instance of {@link StaticFareRequestStructure }
     * 
     */
    public StaticFareRequestStructure createStaticFareRequestStructure() {
        return new StaticFareRequestStructure();
    }

    /**
     * Create an instance of {@link TripFareRequestStructure }
     * 
     */
    public TripFareRequestStructure createTripFareRequestStructure() {
        return new TripFareRequestStructure();
    }

    /**
     * Create an instance of {@link MultiTripFareRequestStructure }
     * 
     */
    public MultiTripFareRequestStructure createMultiTripFareRequestStructure() {
        return new MultiTripFareRequestStructure();
    }

    /**
     * Create an instance of {@link FareResultStructure }
     * 
     */
    public FareResultStructure createFareResultStructure() {
        return new FareResultStructure();
    }

    /**
     * Create an instance of {@link StopFareResultStructure }
     * 
     */
    public StopFareResultStructure createStopFareResultStructure() {
        return new StopFareResultStructure();
    }

    /**
     * Create an instance of {@link PlaceFareResultStructure }
     * 
     */
    public PlaceFareResultStructure createPlaceFareResultStructure() {
        return new PlaceFareResultStructure();
    }

    /**
     * Create an instance of {@link StaticFareResultStructure }
     * 
     */
    public StaticFareResultStructure createStaticFareResultStructure() {
        return new StaticFareResultStructure();
    }

    /**
     * Create an instance of {@link TripFareProductReferenceStructure }
     * 
     */
    public TripFareProductReferenceStructure createTripFareProductReferenceStructure() {
        return new TripFareProductReferenceStructure();
    }

    /**
     * Create an instance of {@link MultiTripFareResultStructure }
     * 
     */
    public MultiTripFareResultStructure createMultiTripFareResultStructure() {
        return new MultiTripFareResultStructure();
    }

    /**
     * Create an instance of {@link BookingNotesStructure }
     * 
     */
    public BookingNotesStructure createBookingNotesStructure() {
        return new BookingNotesStructure();
    }

    /**
     * Create an instance of {@link TariffZoneStructure }
     * 
     */
    public TariffZoneStructure createTariffZoneStructure() {
        return new TariffZoneStructure();
    }

    /**
     * Create an instance of {@link TariffZoneListInAreaStructure }
     * 
     */
    public TariffZoneListInAreaStructure createTariffZoneListInAreaStructure() {
        return new TariffZoneListInAreaStructure();
    }

    /**
     * Create an instance of {@link TariffZoneRefListStructure }
     * 
     */
    public TariffZoneRefListStructure createTariffZoneRefListStructure() {
        return new TariffZoneRefListStructure();
    }

    /**
     * Create an instance of {@link ContactDetailsStructure }
     * 
     */
    public ContactDetailsStructure createContactDetailsStructure() {
        return new ContactDetailsStructure();
    }

    /**
     * Create an instance of {@link BookingMethodListOfEnumerations }
     * 
     */
    public BookingMethodListOfEnumerations createBookingMethodListOfEnumerations() {
        return new BookingMethodListOfEnumerations();
    }

    /**
     * Create an instance of {@link PurchaseMomentListOfEnumerations }
     * 
     */
    public PurchaseMomentListOfEnumerations createPurchaseMomentListOfEnumerations() {
        return new PurchaseMomentListOfEnumerations();
    }

    /**
     * Create an instance of {@link BookingProcessListOfEnumerations }
     * 
     */
    public BookingProcessListOfEnumerations createBookingProcessListOfEnumerations() {
        return new BookingProcessListOfEnumerations();
    }

    /**
     * Create an instance of {@link GroupBookingListOfEnumerations }
     * 
     */
    public GroupBookingListOfEnumerations createGroupBookingListOfEnumerations() {
        return new GroupBookingListOfEnumerations();
    }

    /**
     * Create an instance of {@link BookingArrangementsStructure }
     * 
     */
    public BookingArrangementsStructure createBookingArrangementsStructure() {
        return new BookingArrangementsStructure();
    }

    /**
     * Create an instance of {@link BookingArrangementsContainerStructure }
     * 
     */
    public BookingArrangementsContainerStructure createBookingArrangementsContainerStructure() {
        return new BookingArrangementsContainerStructure();
    }

    /**
     * Create an instance of {@link EntitlementProductListStructure }
     * 
     */
    public EntitlementProductListStructure createEntitlementProductListStructure() {
        return new EntitlementProductListStructure();
    }

    /**
     * Create an instance of {@link EntitlementProductStructure }
     * 
     */
    public EntitlementProductStructure createEntitlementProductStructure() {
        return new EntitlementProductStructure();
    }

    /**
     * Create an instance of {@link FareProductStructure }
     * 
     */
    public FareProductStructure createFareProductStructure() {
        return new FareProductStructure();
    }

    /**
     * Create an instance of {@link TripFareResultStructure }
     * 
     */
    public TripFareResultStructure createTripFareResultStructure() {
        return new TripFareResultStructure();
    }

    /**
     * Create an instance of {@link FarePassengerStructure }
     * 
     */
    public FarePassengerStructure createFarePassengerStructure() {
        return new FarePassengerStructure();
    }

    /**
     * Create an instance of {@link FareParamStructure }
     * 
     */
    public FareParamStructure createFareParamStructure() {
        return new FareParamStructure();
    }

    /**
     * Create an instance of {@link ServiceViaPointStructure }
     * 
     */
    public ServiceViaPointStructure createServiceViaPointStructure() {
        return new ServiceViaPointStructure();
    }

    /**
     * Create an instance of {@link ProductCategoryStructure }
     * 
     */
    public ProductCategoryStructure createProductCategoryStructure() {
        return new ProductCategoryStructure();
    }

    /**
     * Create an instance of {@link TripViaStructure }
     * 
     */
    public TripViaStructure createTripViaStructure() {
        return new TripViaStructure();
    }

    /**
     * Create an instance of {@link ParallelServiceStructure }
     * 
     */
    public ParallelServiceStructure createParallelServiceStructure() {
        return new ParallelServiceStructure();
    }

    /**
     * Create an instance of {@link DatedJourneyStructure }
     * 
     */
    public DatedJourneyStructure createDatedJourneyStructure() {
        return new DatedJourneyStructure();
    }

    /**
     * Create an instance of {@link TripLocationStructure }
     * 
     */
    public TripLocationStructure createTripLocationStructure() {
        return new TripLocationStructure();
    }

    /**
     * Create an instance of {@link ServiceArrivalStructure }
     * 
     */
    public ServiceArrivalStructure createServiceArrivalStructure() {
        return new ServiceArrivalStructure();
    }

    /**
     * Create an instance of {@link ServiceDepartureStructure }
     * 
     */
    public ServiceDepartureStructure createServiceDepartureStructure() {
        return new ServiceDepartureStructure();
    }

    /**
     * Create an instance of {@link CallAtStopStructure }
     * 
     */
    public CallAtStopStructure createCallAtStopStructure() {
        return new CallAtStopStructure();
    }

    /**
     * Create an instance of {@link ContinuousServiceStructure }
     * 
     */
    public ContinuousServiceStructure createContinuousServiceStructure() {
        return new ContinuousServiceStructure();
    }

    /**
     * Create an instance of {@link VehiclePositionStructure }
     * 
     */
    public VehiclePositionStructure createVehiclePositionStructure() {
        return new VehiclePositionStructure();
    }

    /**
     * Create an instance of {@link PlaceContextStructure }
     * 
     */
    public PlaceContextStructure createPlaceContextStructure() {
        return new PlaceContextStructure();
    }

    /**
     * Create an instance of {@link LegAttributeStructure }
     * 
     */
    public LegAttributeStructure createLegAttributeStructure() {
        return new LegAttributeStructure();
    }

    /**
     * Create an instance of {@link LegTrackStructure }
     * 
     */
    public LegTrackStructure createLegTrackStructure() {
        return new LegTrackStructure();
    }

    /**
     * Create an instance of {@link TrackSectionStructure }
     * 
     */
    public TrackSectionStructure createTrackSectionStructure() {
        return new TrackSectionStructure();
    }

    /**
     * Create an instance of {@link LineResultStructure }
     * 
     */
    public LineResultStructure createLineResultStructure() {
        return new LineResultStructure();
    }

    /**
     * Create an instance of {@link IndividualTransportOptionStructure }
     * 
     */
    public IndividualTransportOptionStructure createIndividualTransportOptionStructure() {
        return new IndividualTransportOptionStructure();
    }

    /**
     * Create an instance of {@link ModeStructure }
     * 
     */
    public ModeStructure createModeStructure() {
        return new ModeStructure();
    }

    /**
     * Create an instance of {@link ModeFilterStructure }
     * 
     */
    public ModeFilterStructure createModeFilterStructure() {
        return new ModeFilterStructure();
    }

    /**
     * Create an instance of {@link ModeAndModeOfOperationFilterStructure }
     * 
     */
    public ModeAndModeOfOperationFilterStructure createModeAndModeOfOperationFilterStructure() {
        return new ModeAndModeOfOperationFilterStructure();
    }

    /**
     * Create an instance of {@link ItModesStructure }
     * 
     */
    public ItModesStructure createItModesStructure() {
        return new ItModesStructure();
    }

    /**
     * Create an instance of {@link InitialLocationInputStructure }
     * 
     */
    public InitialLocationInputStructure createInitialLocationInputStructure() {
        return new InitialLocationInputStructure();
    }

    /**
     * Create an instance of {@link PlaceParamStructure }
     * 
     */
    public PlaceParamStructure createPlaceParamStructure() {
        return new PlaceParamStructure();
    }

    /**
     * Create an instance of {@link GeoRestrictionsStructure }
     * 
     */
    public GeoRestrictionsStructure createGeoRestrictionsStructure() {
        return new GeoRestrictionsStructure();
    }

    /**
     * Create an instance of {@link GeoCircleStructure }
     * 
     */
    public GeoCircleStructure createGeoCircleStructure() {
        return new GeoCircleStructure();
    }

    /**
     * Create an instance of {@link GeoRectangleStructure }
     * 
     */
    public GeoRectangleStructure createGeoRectangleStructure() {
        return new GeoRectangleStructure();
    }

    /**
     * Create an instance of {@link GeoAreaStructure }
     * 
     */
    public GeoAreaStructure createGeoAreaStructure() {
        return new GeoAreaStructure();
    }

    /**
     * Create an instance of {@link PlaceResultStructure }
     * 
     */
    public PlaceResultStructure createPlaceResultStructure() {
        return new PlaceResultStructure();
    }

    /**
     * Create an instance of {@link ExchangePointsParamStructure }
     * 
     */
    public ExchangePointsParamStructure createExchangePointsParamStructure() {
        return new ExchangePointsParamStructure();
    }

    /**
     * Create an instance of {@link ExchangePointsResultStructure }
     * 
     */
    public ExchangePointsResultStructure createExchangePointsResultStructure() {
        return new ExchangePointsResultStructure();
    }

    /**
     * Create an instance of {@link StopPointStructure }
     * 
     */
    public StopPointStructure createStopPointStructure() {
        return new StopPointStructure();
    }

    /**
     * Create an instance of {@link StopPlaceStructure }
     * 
     */
    public StopPlaceStructure createStopPlaceStructure() {
        return new StopPlaceStructure();
    }

    /**
     * Create an instance of {@link AccessModesListOfEnumerations }
     * 
     */
    public AccessModesListOfEnumerations createAccessModesListOfEnumerations() {
        return new AccessModesListOfEnumerations();
    }

    /**
     * Create an instance of {@link TopographicPlaceStructure }
     * 
     */
    public TopographicPlaceStructure createTopographicPlaceStructure() {
        return new TopographicPlaceStructure();
    }

    /**
     * Create an instance of {@link PointOfInterestStructure }
     * 
     */
    public PointOfInterestStructure createPointOfInterestStructure() {
        return new PointOfInterestStructure();
    }

    /**
     * Create an instance of {@link PointOfInterestCategoryStructure }
     * 
     */
    public PointOfInterestCategoryStructure createPointOfInterestCategoryStructure() {
        return new PointOfInterestCategoryStructure();
    }

    /**
     * Create an instance of {@link PointOfInterestAdditionalInformationStructure }
     * 
     */
    public PointOfInterestAdditionalInformationStructure createPointOfInterestAdditionalInformationStructure() {
        return new PointOfInterestAdditionalInformationStructure();
    }

    /**
     * Create an instance of {@link CategoryKeyValueType }
     * 
     */
    public CategoryKeyValueType createCategoryKeyValueType() {
        return new CategoryKeyValueType();
    }

    /**
     * Create an instance of {@link OsmTagStructure }
     * 
     */
    public OsmTagStructure createOsmTagStructure() {
        return new OsmTagStructure();
    }

    /**
     * Create an instance of {@link PointOfInterestFilterStructure }
     * 
     */
    public PointOfInterestFilterStructure createPointOfInterestFilterStructure() {
        return new PointOfInterestFilterStructure();
    }

    /**
     * Create an instance of {@link AddressStructure }
     * 
     */
    public AddressStructure createAddressStructure() {
        return new AddressStructure();
    }

    /**
     * Create an instance of {@link PlaceStructure }
     * 
     */
    public PlaceStructure createPlaceStructure() {
        return new PlaceStructure();
    }

    /**
     * Create an instance of {@link PlaceRefStructure }
     * 
     */
    public PlaceRefStructure createPlaceRefStructure() {
        return new PlaceRefStructure();
    }

    /**
     * Create an instance of {@link AbstractOJPServiceRequestStructure }
     * 
     */
    public AbstractOJPServiceRequestStructure createAbstractOJPServiceRequestStructure() {
        return new AbstractOJPServiceRequestStructure();
    }

    /**
     * Create an instance of {@link PlacesStructure }
     * 
     */
    public PlacesStructure createPlacesStructure() {
        return new PlacesStructure();
    }

    /**
     * Create an instance of {@link Operators_RelStructure }
     * 
     */
    public Operators_RelStructure createOperators_RelStructure() {
        return new Operators_RelStructure();
    }

    /**
     * Create an instance of {@link ResponseContextStructure }
     * 
     */
    public ResponseContextStructure createResponseContextStructure() {
        return new ResponseContextStructure();
    }

    /**
     * Create an instance of {@link SituationsStructure }
     * 
     */
    public SituationsStructure createSituationsStructure() {
        return new SituationsStructure();
    }

    /**
     * Create an instance of {@link SituationRefList }
     * 
     */
    public SituationRefList createSituationRefList() {
        return new SituationRefList();
    }

    /**
     * Create an instance of {@link StopEventParamStructure }
     * 
     */
    public StopEventParamStructure createStopEventParamStructure() {
        return new StopEventParamStructure();
    }

    /**
     * Create an instance of {@link StopEventResultStructure }
     * 
     */
    public StopEventResultStructure createStopEventResultStructure() {
        return new StopEventResultStructure();
    }

    /**
     * Create an instance of {@link StopEventStructure }
     * 
     */
    public StopEventStructure createStopEventStructure() {
        return new StopEventStructure();
    }

    /**
     * Create an instance of {@link CallAtNearStopStructure }
     * 
     */
    public CallAtNearStopStructure createCallAtNearStopStructure() {
        return new CallAtNearStopStructure();
    }

    /**
     * Create an instance of {@link TripInfoParamStructure }
     * 
     */
    public TripInfoParamStructure createTripInfoParamStructure() {
        return new TripInfoParamStructure();
    }

    /**
     * Create an instance of {@link TripInfoResultStructure }
     * 
     */
    public TripInfoResultStructure createTripInfoResultStructure() {
        return new TripInfoResultStructure();
    }

    /**
     * Create an instance of {@link TripParamStructure }
     * 
     */
    public TripParamStructure createTripParamStructure() {
        return new TripParamStructure();
    }

    /**
     * Create an instance of {@link NotViaStructure }
     * 
     */
    public NotViaStructure createNotViaStructure() {
        return new NotViaStructure();
    }

    /**
     * Create an instance of {@link NoChangeAtStructure }
     * 
     */
    public NoChangeAtStructure createNoChangeAtStructure() {
        return new NoChangeAtStructure();
    }

    /**
     * Create an instance of {@link TariffzoneFilterStructure }
     * 
     */
    public TariffzoneFilterStructure createTariffzoneFilterStructure() {
        return new TariffzoneFilterStructure();
    }

    /**
     * Create an instance of {@link TripResultStructure }
     * 
     */
    public TripResultStructure createTripResultStructure() {
        return new TripResultStructure();
    }

    /**
     * Create an instance of {@link TripSummaryStructure }
     * 
     */
    public TripSummaryStructure createTripSummaryStructure() {
        return new TripSummaryStructure();
    }

    /**
     * Create an instance of {@link TripStructure }
     * 
     */
    public TripStructure createTripStructure() {
        return new TripStructure();
    }

    /**
     * Create an instance of {@link LegStructure }
     * 
     */
    public LegStructure createLegStructure() {
        return new LegStructure();
    }

    /**
     * Create an instance of {@link TimedLegStructure }
     * 
     */
    public TimedLegStructure createTimedLegStructure() {
        return new TimedLegStructure();
    }

    /**
     * Create an instance of {@link TransferLegStructure }
     * 
     */
    public TransferLegStructure createTransferLegStructure() {
        return new TransferLegStructure();
    }

    /**
     * Create an instance of {@link ContinuousLegStructure }
     * 
     */
    public ContinuousLegStructure createContinuousLegStructure() {
        return new ContinuousLegStructure();
    }

    /**
     * Create an instance of {@link LegBoardStructure }
     * 
     */
    public LegBoardStructure createLegBoardStructure() {
        return new LegBoardStructure();
    }

    /**
     * Create an instance of {@link LegAlightStructure }
     * 
     */
    public LegAlightStructure createLegAlightStructure() {
        return new LegAlightStructure();
    }

    /**
     * Create an instance of {@link LegIntermediateStructure }
     * 
     */
    public LegIntermediateStructure createLegIntermediateStructure() {
        return new LegIntermediateStructure();
    }

    /**
     * Create an instance of {@link PathGuidanceStructure }
     * 
     */
    public PathGuidanceStructure createPathGuidanceStructure() {
        return new PathGuidanceStructure();
    }

    /**
     * Create an instance of {@link PathGuidanceSectionStructure }
     * 
     */
    public PathGuidanceSectionStructure createPathGuidanceSectionStructure() {
        return new PathGuidanceSectionStructure();
    }

    /**
     * Create an instance of {@link FollowStructure }
     * 
     */
    public FollowStructure createFollowStructure() {
        return new FollowStructure();
    }

    /**
     * Create an instance of {@link PathLinkStructure }
     * 
     */
    public PathLinkStructure createPathLinkStructure() {
        return new PathLinkStructure();
    }

    /**
     * Create an instance of {@link PathLinkEndStructure }
     * 
     */
    public PathLinkEndStructure createPathLinkEndStructure() {
        return new PathLinkEndStructure();
    }

    /**
     * Create an instance of {@link MultiPointTripParamStructure }
     * 
     */
    public MultiPointTripParamStructure createMultiPointTripParamStructure() {
        return new MultiPointTripParamStructure();
    }

    /**
     * Create an instance of {@link MultiPointTripResultStructure }
     * 
     */
    public MultiPointTripResultStructure createMultiPointTripResultStructure() {
        return new MultiPointTripResultStructure();
    }

    /**
     * Create an instance of {@link TripRefineParamStructure }
     * 
     */
    public TripRefineParamStructure createTripRefineParamStructure() {
        return new TripRefineParamStructure();
    }

    /**
     * Create an instance of {@link TripChangeParamStructure }
     * 
     */
    public TripChangeParamStructure createTripChangeParamStructure() {
        return new TripChangeParamStructure();
    }

    /**
     * Create an instance of {@link InternationalTextStructure }
     * 
     */
    public InternationalTextStructure createInternationalTextStructure() {
        return new InternationalTextStructure();
    }

    /**
     * Create an instance of {@link WebLinkStructure }
     * 
     */
    public WebLinkStructure createWebLinkStructure() {
        return new WebLinkStructure();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailabilityProblemTypeEnumeration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AvailabilityProblemTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "AvailabilityProblemType", substitutionHeadNamespace = "http://www.vdv.de/ojp", substitutionHeadName = "ErrorType")
    public JAXBElement<AvailabilityProblemTypeEnumeration> createAvailabilityProblemType(AvailabilityProblemTypeEnumeration value) {
        return new JAXBElement<AvailabilityProblemTypeEnumeration>(_AvailabilityProblemType_QNAME, AvailabilityProblemTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ErrorType")
    public JAXBElement<String> createErrorType(String value) {
        return new JAXBElement<String>(_ErrorType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "OtherError")
    public JAXBElement<OJPErrorStructure> createOJPError(OJPErrorStructure value) {
        return new JAXBElement<OJPErrorStructure>(_OJPError_QNAME, OJPErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParticipantRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ParticipantRef")
    public JAXBElement<ParticipantRefStructure> createParticipantRef(ParticipantRefStructure value) {
        return new JAXBElement<ParticipantRefStructure>(_ParticipantRef_QNAME, ParticipantRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OperatorRef")
    public JAXBElement<OperatorRefStructure> createOperatorRef(OperatorRefStructure value) {
        return new JAXBElement<OperatorRefStructure>(_OperatorRef_QNAME, OperatorRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCategoryRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductCategoryRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ProductCategoryRef")
    public JAXBElement<ProductCategoryRefStructure> createProductCategoryRef(ProductCategoryRefStructure value) {
        return new JAXBElement<ProductCategoryRefStructure>(_ProductCategoryRef_QNAME, ProductCategoryRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "JourneyRef")
    public JAXBElement<JourneyRefStructure> createJourneyRef(JourneyRefStructure value) {
        return new JAXBElement<JourneyRefStructure>(_JourneyRef_QNAME, JourneyRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OwnerRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OwnerRef")
    public JAXBElement<OwnerRefStructure> createOwnerRef(OwnerRefStructure value) {
        return new JAXBElement<OwnerRefStructure>(_OwnerRef_QNAME, OwnerRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingDayRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingDayRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OperatingDayRef")
    public JAXBElement<OperatingDayRefStructure> createOperatingDayRef(OperatingDayRefStructure value) {
        return new JAXBElement<OperatingDayRefStructure>(_OperatingDayRef_QNAME, OperatingDayRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareAuthorityRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareAuthorityRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "FareAuthorityRef")
    public JAXBElement<FareAuthorityRefStructure> createFareAuthorityRef(FareAuthorityRefStructure value) {
        return new JAXBElement<FareAuthorityRefStructure>(_FareAuthorityRef_QNAME, FareAuthorityRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffZoneRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffZoneRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TariffZoneRef")
    public JAXBElement<TariffZoneRefStructure> createTariffZoneRef(TariffZoneRefStructure value) {
        return new JAXBElement<TariffZoneRefStructure>(_TariffZoneRef_QNAME, TariffZoneRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareProductRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareProductRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "FareProductRef")
    public JAXBElement<FareProductRefStructure> createFareProductRef(FareProductRefStructure value) {
        return new JAXBElement<FareProductRefStructure>(_FareProductRef_QNAME, FareProductRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareProblemTypeEnumeration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareProblemTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "FareProblemType", substitutionHeadNamespace = "http://www.vdv.de/ojp", substitutionHeadName = "ErrorType")
    public JAXBElement<FareProblemTypeEnumeration> createFareProblemType(FareProblemTypeEnumeration value) {
        return new JAXBElement<FareProblemTypeEnumeration>(_FareProblemType_QNAME, FareProblemTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineInformationProblemTypeEnumeration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LineInformationProblemTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "LineInformationProblemType", substitutionHeadNamespace = "http://www.vdv.de/ojp", substitutionHeadName = "ErrorType")
    public JAXBElement<LineInformationProblemTypeEnumeration> createLineInformationProblemType(LineInformationProblemTypeEnumeration value) {
        return new JAXBElement<LineInformationProblemTypeEnumeration>(_LineInformationProblemType_QNAME, LineInformationProblemTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "StopPlaceRef")
    public JAXBElement<StopPlaceRefStructure> createStopPlaceRef(StopPlaceRefStructure value) {
        return new JAXBElement<StopPlaceRefStructure>(_StopPlaceRef_QNAME, StopPlaceRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopographicPlaceRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopographicPlaceRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TopographicPlaceRef")
    public JAXBElement<TopographicPlaceRefStructure> createTopographicPlaceRef(TopographicPlaceRefStructure value) {
        return new JAXBElement<TopographicPlaceRefStructure>(_TopographicPlaceRef_QNAME, TopographicPlaceRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "PointOfInterestRef")
    public JAXBElement<PointOfInterestRefStructure> createPointOfInterestRef(PointOfInterestRefStructure value) {
        return new JAXBElement<PointOfInterestRefStructure>(_PointOfInterestRef_QNAME, PointOfInterestRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "AddressRef")
    public JAXBElement<AddressRefStructure> createAddressRef(AddressRefStructure value) {
        return new JAXBElement<AddressRefStructure>(_AddressRef_QNAME, AddressRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationProblemTypeEnumeration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocationProblemTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "LocationProblemType", substitutionHeadNamespace = "http://www.vdv.de/ojp", substitutionHeadName = "ErrorType")
    public JAXBElement<LocationProblemTypeEnumeration> createLocationProblemType(LocationProblemTypeEnumeration value) {
        return new JAXBElement<LocationProblemTypeEnumeration>(_LocationProblemType_QNAME, LocationProblemTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangePointsProblemTypeEnumeration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExchangePointsProblemTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ExchangePointsProblemType", substitutionHeadNamespace = "http://www.vdv.de/ojp", substitutionHeadName = "ErrorType")
    public JAXBElement<ExchangePointsProblemTypeEnumeration> createExchangePointsProblemType(ExchangePointsProblemTypeEnumeration value) {
        return new JAXBElement<ExchangePointsProblemTypeEnumeration>(_ExchangePointsProblemType_QNAME, ExchangePointsProblemTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPFareRequestStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPFareRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPFareRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPFareRequestStructure> createOJPFareRequest(OJPFareRequestStructure value) {
        return new JAXBElement<OJPFareRequestStructure>(_OJPFareRequest_QNAME, OJPFareRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPFareDeliveryStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPFareDeliveryStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPFareDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPFareDeliveryStructure> createOJPFareDelivery(OJPFareDeliveryStructure value) {
        return new JAXBElement<OJPFareDeliveryStructure>(_OJPFareDelivery_QNAME, OJPFareDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPLocationInformationRequestStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPLocationInformationRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPLocationInformationRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPLocationInformationRequestStructure> createOJPLocationInformationRequest(OJPLocationInformationRequestStructure value) {
        return new JAXBElement<OJPLocationInformationRequestStructure>(_OJPLocationInformationRequest_QNAME, OJPLocationInformationRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPLocationInformationDeliveryStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPLocationInformationDeliveryStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPLocationInformationDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPLocationInformationDeliveryStructure> createOJPLocationInformationDelivery(OJPLocationInformationDeliveryStructure value) {
        return new JAXBElement<OJPLocationInformationDeliveryStructure>(_OJPLocationInformationDelivery_QNAME, OJPLocationInformationDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPExchangePointsRequestStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPExchangePointsRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPExchangePointsRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPExchangePointsRequestStructure> createOJPExchangePointsRequest(OJPExchangePointsRequestStructure value) {
        return new JAXBElement<OJPExchangePointsRequestStructure>(_OJPExchangePointsRequest_QNAME, OJPExchangePointsRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPExchangePointsDeliveryStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPExchangePointsDeliveryStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPExchangePointsDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPExchangePointsDeliveryStructure> createOJPExchangePointsDelivery(OJPExchangePointsDeliveryStructure value) {
        return new JAXBElement<OJPExchangePointsDeliveryStructure>(_OJPExchangePointsDelivery_QNAME, OJPExchangePointsDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPStopEventRequestStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPStopEventRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPStopEventRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPStopEventRequestStructure> createOJPStopEventRequest(OJPStopEventRequestStructure value) {
        return new JAXBElement<OJPStopEventRequestStructure>(_OJPStopEventRequest_QNAME, OJPStopEventRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPStopEventDeliveryStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPStopEventDeliveryStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPStopEventDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPStopEventDeliveryStructure> createOJPStopEventDelivery(OJPStopEventDeliveryStructure value) {
        return new JAXBElement<OJPStopEventDeliveryStructure>(_OJPStopEventDelivery_QNAME, OJPStopEventDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPTripInfoRequestStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPTripInfoRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPTripInfoRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPTripInfoRequestStructure> createOJPTripInfoRequest(OJPTripInfoRequestStructure value) {
        return new JAXBElement<OJPTripInfoRequestStructure>(_OJPTripInfoRequest_QNAME, OJPTripInfoRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPTripInfoDeliveryStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPTripInfoDeliveryStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPTripInfoDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPTripInfoDeliveryStructure> createOJPTripInfoDelivery(OJPTripInfoDeliveryStructure value) {
        return new JAXBElement<OJPTripInfoDeliveryStructure>(_OJPTripInfoDelivery_QNAME, OJPTripInfoDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPTripRequestStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPTripRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPTripRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPTripRequestStructure> createOJPTripRequest(OJPTripRequestStructure value) {
        return new JAXBElement<OJPTripRequestStructure>(_OJPTripRequest_QNAME, OJPTripRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPTripDeliveryStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPTripDeliveryStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPTripDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPTripDeliveryStructure> createOJPTripDelivery(OJPTripDeliveryStructure value) {
        return new JAXBElement<OJPTripDeliveryStructure>(_OJPTripDelivery_QNAME, OJPTripDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPMultiPointTripRequestStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPMultiPointTripRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPMultiPointTripRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPMultiPointTripRequestStructure> createOJPMultiPointTripRequest(OJPMultiPointTripRequestStructure value) {
        return new JAXBElement<OJPMultiPointTripRequestStructure>(_OJPMultiPointTripRequest_QNAME, OJPMultiPointTripRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPMultiPointTripDeliveryStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPMultiPointTripDeliveryStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPMultiPointTripDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPMultiPointTripDeliveryStructure> createOJPMultiPointTripDelivery(OJPMultiPointTripDeliveryStructure value) {
        return new JAXBElement<OJPMultiPointTripDeliveryStructure>(_OJPMultiPointTripDelivery_QNAME, OJPMultiPointTripDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPStatusRequestStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPStatusRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPStatusRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPStatusRequestStructure> createOJPStatusRequest(OJPStatusRequestStructure value) {
        return new JAXBElement<OJPStatusRequestStructure>(_OJPStatusRequest_QNAME, OJPStatusRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPStatusDeliveryStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPStatusDeliveryStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPStatusDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPStatusDeliveryStructure> createOJPStatusDelivery(OJPStatusDeliveryStructure value) {
        return new JAXBElement<OJPStatusDeliveryStructure>(_OJPStatusDelivery_QNAME, OJPStatusDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPTripRefineRequestStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPTripRefineRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPTripRefineRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPTripRefineRequestStructure> createOJPTripRefineRequest(OJPTripRefineRequestStructure value) {
        return new JAXBElement<OJPTripRefineRequestStructure>(_OJPTripRefineRequest_QNAME, OJPTripRefineRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPTripRefineDeliveryStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPTripRefineDeliveryStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPTripRefineDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPTripRefineDeliveryStructure> createOJPTripRefineDelivery(OJPTripRefineDeliveryStructure value) {
        return new JAXBElement<OJPTripRefineDeliveryStructure>(_OJPTripRefineDelivery_QNAME, OJPTripRefineDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPAvailabilityRequestStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPAvailabilityRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPAvailabilityRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPAvailabilityRequestStructure> createOJPAvailabilityRequest(OJPAvailabilityRequestStructure value) {
        return new JAXBElement<OJPAvailabilityRequestStructure>(_OJPAvailabilityRequest_QNAME, OJPAvailabilityRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPAvailabilityDeliveryStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPAvailabilityDeliveryStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPAvailabilityDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPAvailabilityDeliveryStructure> createOJPAvailabilityDelivery(OJPAvailabilityDeliveryStructure value) {
        return new JAXBElement<OJPAvailabilityDeliveryStructure>(_OJPAvailabilityDelivery_QNAME, OJPAvailabilityDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPLineInformationRequestStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPLineInformationRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPLineInformationRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPLineInformationRequestStructure> createOJPLineInformationRequest(OJPLineInformationRequestStructure value) {
        return new JAXBElement<OJPLineInformationRequestStructure>(_OJPLineInformationRequest_QNAME, OJPLineInformationRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPLineInformationDeliveryStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPLineInformationDeliveryStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPLineInformationDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPLineInformationDeliveryStructure> createOJPLineInformationDelivery(OJPLineInformationDeliveryStructure value) {
        return new JAXBElement<OJPLineInformationDeliveryStructure>(_OJPLineInformationDelivery_QNAME, OJPLineInformationDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPTripChangeRequestStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPTripChangeRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPTripChangeRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<OJPTripChangeRequestStructure> createOJPTripChangeRequest(OJPTripChangeRequestStructure value) {
        return new JAXBElement<OJPTripChangeRequestStructure>(_OJPTripChangeRequest_QNAME, OJPTripChangeRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPTripChangeDeliveryStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPTripChangeDeliveryStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPTripChangeDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<OJPTripChangeDeliveryStructure> createOJPTripChangeDelivery(OJPTripChangeDeliveryStructure value) {
        return new JAXBElement<OJPTripChangeDeliveryStructure>(_OJPTripChangeDelivery_QNAME, OJPTripChangeDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPGenericProblemTypeEnumeration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPGenericProblemTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPGenericProblemType", substitutionHeadNamespace = "http://www.vdv.de/ojp", substitutionHeadName = "ErrorType")
    public JAXBElement<OJPGenericProblemTypeEnumeration> createOJPGenericProblemType(OJPGenericProblemTypeEnumeration value) {
        return new JAXBElement<OJPGenericProblemTypeEnumeration>(_OJPGenericProblemType_QNAME, OJPGenericProblemTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituationFullRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SituationFullRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "SituationFullRef")
    public JAXBElement<SituationFullRefStructure> createSituationFullRef(SituationFullRefStructure value) {
        return new JAXBElement<SituationFullRefStructure>(_SituationFullRef_QNAME, SituationFullRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopEventProblemTypeEnumeration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StopEventProblemTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "StopEventProblemType", substitutionHeadNamespace = "http://www.vdv.de/ojp", substitutionHeadName = "ErrorType")
    public JAXBElement<StopEventProblemTypeEnumeration> createStopEventProblemType(StopEventProblemTypeEnumeration value) {
        return new JAXBElement<StopEventProblemTypeEnumeration>(_StopEventProblemType_QNAME, StopEventProblemTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripInfoProblemTypeEnumeration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripInfoProblemTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TripInfoProblemType", substitutionHeadNamespace = "http://www.vdv.de/ojp", substitutionHeadName = "ErrorType")
    public JAXBElement<TripInfoProblemTypeEnumeration> createTripInfoProblemType(TripInfoProblemTypeEnumeration value) {
        return new JAXBElement<TripInfoProblemTypeEnumeration>(_TripInfoProblemType_QNAME, TripInfoProblemTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripProblemTypeEnumeration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripProblemTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TripProblemType", substitutionHeadNamespace = "http://www.vdv.de/ojp", substitutionHeadName = "ErrorType")
    public JAXBElement<TripProblemTypeEnumeration> createTripProblemType(TripProblemTypeEnumeration value) {
        return new JAXBElement<TripProblemTypeEnumeration>(_TripProblemType_QNAME, TripProblemTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripChangeProblemTypeEnumeration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripChangeProblemTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TripChangeProblemType", substitutionHeadNamespace = "http://www.vdv.de/ojp", substitutionHeadName = "ErrorType")
    public JAXBElement<TripChangeProblemTypeEnumeration> createTripChangeProblemType(TripChangeProblemTypeEnumeration value) {
        return new JAXBElement<TripChangeProblemTypeEnumeration>(_TripChangeProblemType_QNAME, TripChangeProblemTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusProblemTypeEnumeration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusProblemTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "StatusProblemType", substitutionHeadNamespace = "http://www.vdv.de/ojp", substitutionHeadName = "ErrorType")
    public JAXBElement<StatusProblemTypeEnumeration> createStatusProblemType(StatusProblemTypeEnumeration value) {
        return new JAXBElement<StatusProblemTypeEnumeration>(_StatusProblemType_QNAME, StatusProblemTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPStatusResponseStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPStatusResponseStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPStatusResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesResponse")
    public JAXBElement<OJPStatusResponseStructure> createOJPStatusResponse(OJPStatusResponseStructure value) {
        return new JAXBElement<OJPStatusResponseStructure>(_OJPStatusResponse_QNAME, OJPStatusResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPRequestStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPRequest")
    public JAXBElement<OJPRequestStructure> createOJPRequest(OJPRequestStructure value) {
        return new JAXBElement<OJPRequestStructure>(_OJPRequest_QNAME, OJPRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPResponseStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPResponseStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OJPResponse")
    public JAXBElement<OJPResponseStructure> createOJPResponse(OJPResponseStructure value) {
        return new JAXBElement<OJPResponseStructure>(_OJPResponse_QNAME, OJPResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "FromLegIdRef", scope = TripFareResultStructure.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTripFareResultStructureFromLegIdRef(String value) {
        return new JAXBElement<String>(_TripFareResultStructureFromLegIdRef_QNAME, String.class, TripFareResultStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ToLegIdRef", scope = TripFareResultStructure.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTripFareResultStructureToLegIdRef(String value) {
        return new JAXBElement<String>(_TripFareResultStructureToLegIdRef_QNAME, String.class, TripFareResultStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "DataFrameRef", scope = OJPStatusResponseStructure.class)
    public JAXBElement<DataFrameRefStructure> createOJPStatusResponseStructureDataFrameRef(DataFrameRefStructure value) {
        return new JAXBElement<DataFrameRefStructure>(_OJPStatusResponseStructureDataFrameRef_QNAME, DataFrameRefStructure.class, OJPStatusResponseStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "CalcTime", scope = OJPStatusResponseStructure.class)
    public JAXBElement<BigInteger> createOJPStatusResponseStructureCalcTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_OJPStatusResponseStructureCalcTime_QNAME, BigInteger.class, OJPStatusResponseStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ErrorCondition", scope = OJPStatusResponseStructure.class)
    public JAXBElement<OJPErrorStructure> createOJPStatusResponseStructureErrorCondition(OJPErrorStructure value) {
        return new JAXBElement<OJPErrorStructure>(_OJPStatusResponseStructureErrorCondition_QNAME, OJPErrorStructure.class, OJPStatusResponseStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ServiceStarted", scope = OJPStatusResponseStructure.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createOJPStatusResponseStructureServiceStarted(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_OJPStatusResponseStructureServiceStarted_QNAME, ZonedDateTime.class, OJPStatusResponseStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ServiceReady", scope = OJPStatusResponseStructure.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createOJPStatusResponseStructureServiceReady(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_OJPStatusResponseStructureServiceReady_QNAME, ZonedDateTime.class, OJPStatusResponseStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "LastTimetableUpdate", scope = OJPStatusResponseStructure.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createOJPStatusResponseStructureLastTimetableUpdate(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_OJPStatusResponseStructureLastTimetableUpdate_QNAME, ZonedDateTime.class, OJPStatusResponseStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ServerBuildVersion", scope = OJPStatusResponseStructure.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createOJPStatusResponseStructureServerBuildVersion(String value) {
        return new JAXBElement<String>(_OJPStatusResponseStructureServerBuildVersion_QNAME, String.class, OJPStatusResponseStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "DataFrameRef", scope = OJPTripChangeDeliveryStructure.class)
    public JAXBElement<DataFrameRefStructure> createOJPTripChangeDeliveryStructureDataFrameRef(DataFrameRefStructure value) {
        return new JAXBElement<DataFrameRefStructure>(_OJPStatusResponseStructureDataFrameRef_QNAME, DataFrameRefStructure.class, OJPTripChangeDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "CalcTime", scope = OJPTripChangeDeliveryStructure.class)
    public JAXBElement<BigInteger> createOJPTripChangeDeliveryStructureCalcTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_OJPStatusResponseStructureCalcTime_QNAME, BigInteger.class, OJPTripChangeDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ErrorCondition", scope = OJPTripChangeDeliveryStructure.class)
    public JAXBElement<OJPErrorStructure> createOJPTripChangeDeliveryStructureErrorCondition(OJPErrorStructure value) {
        return new JAXBElement<OJPErrorStructure>(_OJPStatusResponseStructureErrorCondition_QNAME, OJPErrorStructure.class, OJPTripChangeDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TripResponseContext", scope = OJPTripChangeDeliveryStructure.class)
    public JAXBElement<ResponseContextStructure> createOJPTripChangeDeliveryStructureTripResponseContext(ResponseContextStructure value) {
        return new JAXBElement<ResponseContextStructure>(_OJPTripChangeDeliveryStructureTripResponseContext_QNAME, ResponseContextStructure.class, OJPTripChangeDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripResultStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripResultStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TripResult", scope = OJPTripChangeDeliveryStructure.class)
    public JAXBElement<TripResultStructure> createOJPTripChangeDeliveryStructureTripResult(TripResultStructure value) {
        return new JAXBElement<TripResultStructure>(_OJPTripChangeDeliveryStructureTripResult_QNAME, TripResultStructure.class, OJPTripChangeDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "DataFrameRef", scope = OJPAvailabilityDeliveryStructure.class)
    public JAXBElement<DataFrameRefStructure> createOJPAvailabilityDeliveryStructureDataFrameRef(DataFrameRefStructure value) {
        return new JAXBElement<DataFrameRefStructure>(_OJPStatusResponseStructureDataFrameRef_QNAME, DataFrameRefStructure.class, OJPAvailabilityDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "CalcTime", scope = OJPAvailabilityDeliveryStructure.class)
    public JAXBElement<BigInteger> createOJPAvailabilityDeliveryStructureCalcTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_OJPStatusResponseStructureCalcTime_QNAME, BigInteger.class, OJPAvailabilityDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ErrorCondition", scope = OJPAvailabilityDeliveryStructure.class)
    public JAXBElement<OJPErrorStructure> createOJPAvailabilityDeliveryStructureErrorCondition(OJPErrorStructure value) {
        return new JAXBElement<OJPErrorStructure>(_OJPStatusResponseStructureErrorCondition_QNAME, OJPErrorStructure.class, OJPAvailabilityDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "AvailabilityResponseContext", scope = OJPAvailabilityDeliveryStructure.class)
    public JAXBElement<ResponseContextStructure> createOJPAvailabilityDeliveryStructureAvailabilityResponseContext(ResponseContextStructure value) {
        return new JAXBElement<ResponseContextStructure>(_OJPAvailabilityDeliveryStructureAvailabilityResponseContext_QNAME, ResponseContextStructure.class, OJPAvailabilityDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailabilityResultStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AvailabilityResultStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "AvailabilityResult", scope = OJPAvailabilityDeliveryStructure.class)
    public JAXBElement<AvailabilityResultStructure> createOJPAvailabilityDeliveryStructureAvailabilityResult(AvailabilityResultStructure value) {
        return new JAXBElement<AvailabilityResultStructure>(_OJPAvailabilityDeliveryStructureAvailabilityResult_QNAME, AvailabilityResultStructure.class, OJPAvailabilityDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "Extension", scope = OJPAvailabilityDeliveryStructure.class)
    public JAXBElement<Object> createOJPAvailabilityDeliveryStructureExtension(Object value) {
        return new JAXBElement<Object>(_OJPAvailabilityDeliveryStructureExtension_QNAME, Object.class, OJPAvailabilityDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingPTLegStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BookingPTLegStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "PublicTransport", scope = OJPAvailabilityRequestStructure.class)
    public JAXBElement<BookingPTLegStructure> createOJPAvailabilityRequestStructurePublicTransport(BookingPTLegStructure value) {
        return new JAXBElement<BookingPTLegStructure>(_OJPAvailabilityRequestStructurePublicTransport_QNAME, BookingPTLegStructure.class, OJPAvailabilityRequestStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingUserStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BookingUserStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "MobilityUser", scope = OJPAvailabilityRequestStructure.class)
    public JAXBElement<BookingUserStructure> createOJPAvailabilityRequestStructureMobilityUser(BookingUserStructure value) {
        return new JAXBElement<BookingUserStructure>(_OJPAvailabilityRequestStructureMobilityUser_QNAME, BookingUserStructure.class, OJPAvailabilityRequestStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "EarliestDepartureTime", scope = OJPAvailabilityRequestStructure.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createOJPAvailabilityRequestStructureEarliestDepartureTime(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_OJPAvailabilityRequestStructureEarliestDepartureTime_QNAME, ZonedDateTime.class, OJPAvailabilityRequestStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "LatestArrivalTime", scope = OJPAvailabilityRequestStructure.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createOJPAvailabilityRequestStructureLatestArrivalTime(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_OJPAvailabilityRequestStructureLatestArrivalTime_QNAME, ZonedDateTime.class, OJPAvailabilityRequestStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "Extension", scope = OJPAvailabilityRequestStructure.class)
    public JAXBElement<Object> createOJPAvailabilityRequestStructureExtension(Object value) {
        return new JAXBElement<Object>(_OJPAvailabilityDeliveryStructureExtension_QNAME, Object.class, OJPAvailabilityRequestStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "DataFrameRef", scope = OJPTripRefineDeliveryStructure.class)
    public JAXBElement<DataFrameRefStructure> createOJPTripRefineDeliveryStructureDataFrameRef(DataFrameRefStructure value) {
        return new JAXBElement<DataFrameRefStructure>(_OJPStatusResponseStructureDataFrameRef_QNAME, DataFrameRefStructure.class, OJPTripRefineDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "CalcTime", scope = OJPTripRefineDeliveryStructure.class)
    public JAXBElement<BigInteger> createOJPTripRefineDeliveryStructureCalcTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_OJPStatusResponseStructureCalcTime_QNAME, BigInteger.class, OJPTripRefineDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ErrorCondition", scope = OJPTripRefineDeliveryStructure.class)
    public JAXBElement<OJPErrorStructure> createOJPTripRefineDeliveryStructureErrorCondition(OJPErrorStructure value) {
        return new JAXBElement<OJPErrorStructure>(_OJPStatusResponseStructureErrorCondition_QNAME, OJPErrorStructure.class, OJPTripRefineDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TripResponseContext", scope = OJPTripRefineDeliveryStructure.class)
    public JAXBElement<ResponseContextStructure> createOJPTripRefineDeliveryStructureTripResponseContext(ResponseContextStructure value) {
        return new JAXBElement<ResponseContextStructure>(_OJPTripChangeDeliveryStructureTripResponseContext_QNAME, ResponseContextStructure.class, OJPTripRefineDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "UnknownLegRef", scope = OJPTripRefineDeliveryStructure.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createOJPTripRefineDeliveryStructureUnknownLegRef(String value) {
        return new JAXBElement<String>(_OJPTripRefineDeliveryStructureUnknownLegRef_QNAME, String.class, OJPTripRefineDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripResultStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripResultStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TripResult", scope = OJPTripRefineDeliveryStructure.class)
    public JAXBElement<TripResultStructure> createOJPTripRefineDeliveryStructureTripResult(TripResultStructure value) {
        return new JAXBElement<TripResultStructure>(_OJPTripChangeDeliveryStructureTripResult_QNAME, TripResultStructure.class, OJPTripRefineDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "DataFrameRef", scope = OJPStatusDeliveryStructure.class)
    public JAXBElement<DataFrameRefStructure> createOJPStatusDeliveryStructureDataFrameRef(DataFrameRefStructure value) {
        return new JAXBElement<DataFrameRefStructure>(_OJPStatusResponseStructureDataFrameRef_QNAME, DataFrameRefStructure.class, OJPStatusDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "CalcTime", scope = OJPStatusDeliveryStructure.class)
    public JAXBElement<BigInteger> createOJPStatusDeliveryStructureCalcTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_OJPStatusResponseStructureCalcTime_QNAME, BigInteger.class, OJPStatusDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ErrorCondition", scope = OJPStatusDeliveryStructure.class)
    public JAXBElement<OJPErrorStructure> createOJPStatusDeliveryStructureErrorCondition(OJPErrorStructure value) {
        return new JAXBElement<OJPErrorStructure>(_OJPStatusResponseStructureErrorCondition_QNAME, OJPErrorStructure.class, OJPStatusDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ServiceStarted", scope = OJPStatusDeliveryStructure.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createOJPStatusDeliveryStructureServiceStarted(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_OJPStatusResponseStructureServiceStarted_QNAME, ZonedDateTime.class, OJPStatusDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ServiceReady", scope = OJPStatusDeliveryStructure.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createOJPStatusDeliveryStructureServiceReady(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_OJPStatusResponseStructureServiceReady_QNAME, ZonedDateTime.class, OJPStatusDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "LastTimetableUpdate", scope = OJPStatusDeliveryStructure.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createOJPStatusDeliveryStructureLastTimetableUpdate(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_OJPStatusResponseStructureLastTimetableUpdate_QNAME, ZonedDateTime.class, OJPStatusDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ServerBuildVersion", scope = OJPStatusDeliveryStructure.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createOJPStatusDeliveryStructureServerBuildVersion(String value) {
        return new JAXBElement<String>(_OJPStatusResponseStructureServerBuildVersion_QNAME, String.class, OJPStatusDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "DataFrameRef", scope = OJPMultiPointTripDeliveryStructure.class)
    public JAXBElement<DataFrameRefStructure> createOJPMultiPointTripDeliveryStructureDataFrameRef(DataFrameRefStructure value) {
        return new JAXBElement<DataFrameRefStructure>(_OJPStatusResponseStructureDataFrameRef_QNAME, DataFrameRefStructure.class, OJPMultiPointTripDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "CalcTime", scope = OJPMultiPointTripDeliveryStructure.class)
    public JAXBElement<BigInteger> createOJPMultiPointTripDeliveryStructureCalcTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_OJPStatusResponseStructureCalcTime_QNAME, BigInteger.class, OJPMultiPointTripDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ErrorCondition", scope = OJPMultiPointTripDeliveryStructure.class)
    public JAXBElement<OJPErrorStructure> createOJPMultiPointTripDeliveryStructureErrorCondition(OJPErrorStructure value) {
        return new JAXBElement<OJPErrorStructure>(_OJPStatusResponseStructureErrorCondition_QNAME, OJPErrorStructure.class, OJPMultiPointTripDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiPointTypeEnumeration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiPointTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "MultiPointType", scope = OJPMultiPointTripDeliveryStructure.class, defaultValue = "anyPoint")
    public JAXBElement<MultiPointTypeEnumeration> createOJPMultiPointTripDeliveryStructureMultiPointType(MultiPointTypeEnumeration value) {
        return new JAXBElement<MultiPointTypeEnumeration>(_OJPMultiPointTripDeliveryStructureMultiPointType_QNAME, MultiPointTypeEnumeration.class, OJPMultiPointTripDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "MultiPointTripResponseContext", scope = OJPMultiPointTripDeliveryStructure.class)
    public JAXBElement<ResponseContextStructure> createOJPMultiPointTripDeliveryStructureMultiPointTripResponseContext(ResponseContextStructure value) {
        return new JAXBElement<ResponseContextStructure>(_OJPMultiPointTripDeliveryStructureMultiPointTripResponseContext_QNAME, ResponseContextStructure.class, OJPMultiPointTripDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiPointTripResultStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiPointTripResultStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "MultiPointTripResult", scope = OJPMultiPointTripDeliveryStructure.class)
    public JAXBElement<MultiPointTripResultStructure> createOJPMultiPointTripDeliveryStructureMultiPointTripResult(MultiPointTripResultStructure value) {
        return new JAXBElement<MultiPointTripResultStructure>(_OJPMultiPointTripDeliveryStructureMultiPointTripResult_QNAME, MultiPointTripResultStructure.class, OJPMultiPointTripDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "DataFrameRef", scope = OJPTripDeliveryStructure.class)
    public JAXBElement<DataFrameRefStructure> createOJPTripDeliveryStructureDataFrameRef(DataFrameRefStructure value) {
        return new JAXBElement<DataFrameRefStructure>(_OJPStatusResponseStructureDataFrameRef_QNAME, DataFrameRefStructure.class, OJPTripDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "CalcTime", scope = OJPTripDeliveryStructure.class)
    public JAXBElement<BigInteger> createOJPTripDeliveryStructureCalcTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_OJPStatusResponseStructureCalcTime_QNAME, BigInteger.class, OJPTripDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ErrorCondition", scope = OJPTripDeliveryStructure.class)
    public JAXBElement<OJPErrorStructure> createOJPTripDeliveryStructureErrorCondition(OJPErrorStructure value) {
        return new JAXBElement<OJPErrorStructure>(_OJPStatusResponseStructureErrorCondition_QNAME, OJPErrorStructure.class, OJPTripDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TripResponseContext", scope = OJPTripDeliveryStructure.class)
    public JAXBElement<ResponseContextStructure> createOJPTripDeliveryStructureTripResponseContext(ResponseContextStructure value) {
        return new JAXBElement<ResponseContextStructure>(_OJPTripChangeDeliveryStructureTripResponseContext_QNAME, ResponseContextStructure.class, OJPTripDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripResultStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripResultStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TripResult", scope = OJPTripDeliveryStructure.class)
    public JAXBElement<TripResultStructure> createOJPTripDeliveryStructureTripResult(TripResultStructure value) {
        return new JAXBElement<TripResultStructure>(_OJPTripChangeDeliveryStructureTripResult_QNAME, TripResultStructure.class, OJPTripDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "DataFrameRef", scope = OJPTripInfoDeliveryStructure.class)
    public JAXBElement<DataFrameRefStructure> createOJPTripInfoDeliveryStructureDataFrameRef(DataFrameRefStructure value) {
        return new JAXBElement<DataFrameRefStructure>(_OJPStatusResponseStructureDataFrameRef_QNAME, DataFrameRefStructure.class, OJPTripInfoDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "CalcTime", scope = OJPTripInfoDeliveryStructure.class)
    public JAXBElement<BigInteger> createOJPTripInfoDeliveryStructureCalcTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_OJPStatusResponseStructureCalcTime_QNAME, BigInteger.class, OJPTripInfoDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ErrorCondition", scope = OJPTripInfoDeliveryStructure.class)
    public JAXBElement<OJPErrorStructure> createOJPTripInfoDeliveryStructureErrorCondition(OJPErrorStructure value) {
        return new JAXBElement<OJPErrorStructure>(_OJPStatusResponseStructureErrorCondition_QNAME, OJPErrorStructure.class, OJPTripInfoDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TripInfoResponseContext", scope = OJPTripInfoDeliveryStructure.class)
    public JAXBElement<ResponseContextStructure> createOJPTripInfoDeliveryStructureTripInfoResponseContext(ResponseContextStructure value) {
        return new JAXBElement<ResponseContextStructure>(_OJPTripInfoDeliveryStructureTripInfoResponseContext_QNAME, ResponseContextStructure.class, OJPTripInfoDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripInfoResultStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripInfoResultStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TripInfoResult", scope = OJPTripInfoDeliveryStructure.class)
    public JAXBElement<TripInfoResultStructure> createOJPTripInfoDeliveryStructureTripInfoResult(TripInfoResultStructure value) {
        return new JAXBElement<TripInfoResultStructure>(_OJPTripInfoDeliveryStructureTripInfoResult_QNAME, TripInfoResultStructure.class, OJPTripInfoDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TrainNumber", scope = OJPTripInfoRequestStructure.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createOJPTripInfoRequestStructureTrainNumber(String value) {
        return new JAXBElement<String>(_OJPTripInfoRequestStructureTrainNumber_QNAME, String.class, OJPTripInfoRequestStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "OperatorRef", scope = OJPTripInfoRequestStructure.class)
    public JAXBElement<OperatorRefStructure> createOJPTripInfoRequestStructureOperatorRef(OperatorRefStructure value) {
        return new JAXBElement<OperatorRefStructure>(_OperatorRef_QNAME, OperatorRefStructure.class, OJPTripInfoRequestStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "TimeOfOperation", scope = OJPTripInfoRequestStructure.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createOJPTripInfoRequestStructureTimeOfOperation(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_OJPTripInfoRequestStructureTimeOfOperation_QNAME, ZonedDateTime.class, OJPTripInfoRequestStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripInfoParamStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripInfoParamStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "Params", scope = OJPTripInfoRequestStructure.class)
    public JAXBElement<TripInfoParamStructure> createOJPTripInfoRequestStructureParams(TripInfoParamStructure value) {
        return new JAXBElement<TripInfoParamStructure>(_OJPTripInfoRequestStructureParams_QNAME, TripInfoParamStructure.class, OJPTripInfoRequestStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "DataFrameRef", scope = OJPStopEventDeliveryStructure.class)
    public JAXBElement<DataFrameRefStructure> createOJPStopEventDeliveryStructureDataFrameRef(DataFrameRefStructure value) {
        return new JAXBElement<DataFrameRefStructure>(_OJPStatusResponseStructureDataFrameRef_QNAME, DataFrameRefStructure.class, OJPStopEventDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "CalcTime", scope = OJPStopEventDeliveryStructure.class)
    public JAXBElement<BigInteger> createOJPStopEventDeliveryStructureCalcTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_OJPStatusResponseStructureCalcTime_QNAME, BigInteger.class, OJPStopEventDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ErrorCondition", scope = OJPStopEventDeliveryStructure.class)
    public JAXBElement<OJPErrorStructure> createOJPStopEventDeliveryStructureErrorCondition(OJPErrorStructure value) {
        return new JAXBElement<OJPErrorStructure>(_OJPStatusResponseStructureErrorCondition_QNAME, OJPErrorStructure.class, OJPStopEventDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "StopEventResponseContext", scope = OJPStopEventDeliveryStructure.class)
    public JAXBElement<ResponseContextStructure> createOJPStopEventDeliveryStructureStopEventResponseContext(ResponseContextStructure value) {
        return new JAXBElement<ResponseContextStructure>(_OJPStopEventDeliveryStructureStopEventResponseContext_QNAME, ResponseContextStructure.class, OJPStopEventDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopEventResultStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StopEventResultStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "StopEventResult", scope = OJPStopEventDeliveryStructure.class)
    public JAXBElement<StopEventResultStructure> createOJPStopEventDeliveryStructureStopEventResult(StopEventResultStructure value) {
        return new JAXBElement<StopEventResultStructure>(_OJPStopEventDeliveryStructureStopEventResult_QNAME, StopEventResultStructure.class, OJPStopEventDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "DataFrameRef", scope = OJPExchangePointsDeliveryStructure.class)
    public JAXBElement<DataFrameRefStructure> createOJPExchangePointsDeliveryStructureDataFrameRef(DataFrameRefStructure value) {
        return new JAXBElement<DataFrameRefStructure>(_OJPStatusResponseStructureDataFrameRef_QNAME, DataFrameRefStructure.class, OJPExchangePointsDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "CalcTime", scope = OJPExchangePointsDeliveryStructure.class)
    public JAXBElement<BigInteger> createOJPExchangePointsDeliveryStructureCalcTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_OJPStatusResponseStructureCalcTime_QNAME, BigInteger.class, OJPExchangePointsDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ErrorCondition", scope = OJPExchangePointsDeliveryStructure.class)
    public JAXBElement<OJPErrorStructure> createOJPExchangePointsDeliveryStructureErrorCondition(OJPErrorStructure value) {
        return new JAXBElement<OJPErrorStructure>(_OJPStatusResponseStructureErrorCondition_QNAME, OJPErrorStructure.class, OJPExchangePointsDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ExchangePointsResponseContext", scope = OJPExchangePointsDeliveryStructure.class)
    public JAXBElement<ResponseContextStructure> createOJPExchangePointsDeliveryStructureExchangePointsResponseContext(ResponseContextStructure value) {
        return new JAXBElement<ResponseContextStructure>(_OJPExchangePointsDeliveryStructureExchangePointsResponseContext_QNAME, ResponseContextStructure.class, OJPExchangePointsDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ContinueAt", scope = OJPExchangePointsDeliveryStructure.class)
    public JAXBElement<BigInteger> createOJPExchangePointsDeliveryStructureContinueAt(BigInteger value) {
        return new JAXBElement<BigInteger>(_OJPExchangePointsDeliveryStructureContinueAt_QNAME, BigInteger.class, OJPExchangePointsDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangePointsResultStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExchangePointsResultStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ExchangePointsResult", scope = OJPExchangePointsDeliveryStructure.class)
    public JAXBElement<ExchangePointsResultStructure> createOJPExchangePointsDeliveryStructureExchangePointsResult(ExchangePointsResultStructure value) {
        return new JAXBElement<ExchangePointsResultStructure>(_OJPExchangePointsDeliveryStructureExchangePointsResult_QNAME, ExchangePointsResultStructure.class, OJPExchangePointsDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "DataFrameRef", scope = OJPLocationInformationDeliveryStructure.class)
    public JAXBElement<DataFrameRefStructure> createOJPLocationInformationDeliveryStructureDataFrameRef(DataFrameRefStructure value) {
        return new JAXBElement<DataFrameRefStructure>(_OJPStatusResponseStructureDataFrameRef_QNAME, DataFrameRefStructure.class, OJPLocationInformationDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "CalcTime", scope = OJPLocationInformationDeliveryStructure.class)
    public JAXBElement<BigInteger> createOJPLocationInformationDeliveryStructureCalcTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_OJPStatusResponseStructureCalcTime_QNAME, BigInteger.class, OJPLocationInformationDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ErrorCondition", scope = OJPLocationInformationDeliveryStructure.class)
    public JAXBElement<OJPErrorStructure> createOJPLocationInformationDeliveryStructureErrorCondition(OJPErrorStructure value) {
        return new JAXBElement<OJPErrorStructure>(_OJPStatusResponseStructureErrorCondition_QNAME, OJPErrorStructure.class, OJPLocationInformationDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "LocationInformationResponseContext", scope = OJPLocationInformationDeliveryStructure.class)
    public JAXBElement<ResponseContextStructure> createOJPLocationInformationDeliveryStructureLocationInformationResponseContext(ResponseContextStructure value) {
        return new JAXBElement<ResponseContextStructure>(_OJPLocationInformationDeliveryStructureLocationInformationResponseContext_QNAME, ResponseContextStructure.class, OJPLocationInformationDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ContinueAt", scope = OJPLocationInformationDeliveryStructure.class)
    public JAXBElement<BigInteger> createOJPLocationInformationDeliveryStructureContinueAt(BigInteger value) {
        return new JAXBElement<BigInteger>(_OJPExchangePointsDeliveryStructureContinueAt_QNAME, BigInteger.class, OJPLocationInformationDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlaceResultStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PlaceResultStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "PlaceResult", scope = OJPLocationInformationDeliveryStructure.class)
    public JAXBElement<PlaceResultStructure> createOJPLocationInformationDeliveryStructurePlaceResult(PlaceResultStructure value) {
        return new JAXBElement<PlaceResultStructure>(_OJPLocationInformationDeliveryStructurePlaceResult_QNAME, PlaceResultStructure.class, OJPLocationInformationDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "DataFrameRef", scope = OJPFareDeliveryStructure.class)
    public JAXBElement<DataFrameRefStructure> createOJPFareDeliveryStructureDataFrameRef(DataFrameRefStructure value) {
        return new JAXBElement<DataFrameRefStructure>(_OJPStatusResponseStructureDataFrameRef_QNAME, DataFrameRefStructure.class, OJPFareDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "CalcTime", scope = OJPFareDeliveryStructure.class)
    public JAXBElement<BigInteger> createOJPFareDeliveryStructureCalcTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_OJPStatusResponseStructureCalcTime_QNAME, BigInteger.class, OJPFareDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "ErrorCondition", scope = OJPFareDeliveryStructure.class)
    public JAXBElement<OJPErrorStructure> createOJPFareDeliveryStructureErrorCondition(OJPErrorStructure value) {
        return new JAXBElement<OJPErrorStructure>(_OJPStatusResponseStructureErrorCondition_QNAME, OJPErrorStructure.class, OJPFareDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "FareResponseContext", scope = OJPFareDeliveryStructure.class)
    public JAXBElement<ResponseContextStructure> createOJPFareDeliveryStructureFareResponseContext(ResponseContextStructure value) {
        return new JAXBElement<ResponseContextStructure>(_OJPFareDeliveryStructureFareResponseContext_QNAME, ResponseContextStructure.class, OJPFareDeliveryStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareResultStructure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareResultStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vdv.de/ojp", name = "FareResult", scope = OJPFareDeliveryStructure.class)
    public JAXBElement<FareResultStructure> createOJPFareDeliveryStructureFareResult(FareResultStructure value) {
        return new JAXBElement<FareResultStructure>(_OJPFareDeliveryStructureFareResult_QNAME, FareResultStructure.class, OJPFareDeliveryStructure.class, value);
    }

}
