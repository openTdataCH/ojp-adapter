//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.List;
import javax.xml.namespace.QName;
import org.rutebanken.util.DurationXmlAdapter;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the uk.org.siri.siri package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema
 * type definitions, element declarations and model groups.  Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OtherError_QNAME = new QName("http://www.siri.org.uk/siri", "OtherError");
    private final static QName _ErrorCode_QNAME = new QName("http://www.siri.org.uk/siri", "ErrorCode");
    private final static QName _AbstractFunctionalServiceRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractFunctionalServiceRequest");
    private final static QName _AbstractServiceRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractServiceRequest");
    private final static QName _AbstractRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractRequest");
    private final static QName _AbstractFunctionalServiceDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractFunctionalServiceDelivery");
    private final static QName _AbstractResponse_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractResponse");
    private final static QName _AbstractFunctionalServiceCapabilitiesResponse_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractFunctionalServiceCapabilitiesResponse");
    private final static QName _Extensions_QNAME = new QName("http://www.siri.org.uk/siri", "Extensions");
    private final static QName _SrsName_QNAME = new QName("http://www.siri.org.uk/siri", "SrsName");
    private final static QName _ServiceFeatureRef_QNAME = new QName("http://www.siri.org.uk/siri", "ServiceFeatureRef");
    private final static QName _FeatureRef_QNAME = new QName("http://www.siri.org.uk/siri", "FeatureRef");
    private final static QName _VehicleMode_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleMode");
    private final static QName _RailSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "RailSubmode");
    private final static QName _CoachSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "CoachSubmode");
    private final static QName _MetroSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "MetroSubmode");
    private final static QName _BusSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "BusSubmode");
    private final static QName _TramSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "TramSubmode");
    private final static QName _WaterSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "WaterSubmode");
    private final static QName _AirSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "AirSubmode");
    private final static QName _TelecabinSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "TelecabinSubmode");
    private final static QName _FunicularSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "FunicularSubmode");
    private final static QName _TaxiSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "TaxiSubmode");
    private final static QName _SelfDriveSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "SelfDriveSubmode");
    private final static QName _KeyList_QNAME = new QName("http://www.siri.org.uk/siri", "KeyList");
    private final static QName _TypesOfValue_QNAME = new QName("http://www.siri.org.uk/siri", "TypesOfValue");
    private final static QName _TypeOfValue_QNAME = new QName("http://www.siri.org.uk/siri", "TypeOfValue");
    private final static QName _ValueSet_QNAME = new QName("http://www.siri.org.uk/siri", "ValueSet");
    private final static QName _RequestTimestamp_QNAME = new QName("http://www.siri.org.uk/siri", "RequestTimestamp");
    private final static QName _RequestorRef_QNAME = new QName("http://www.siri.org.uk/siri", "RequestorRef");
    private final static QName _ResponseTimestamp_QNAME = new QName("http://www.siri.org.uk/siri", "ResponseTimestamp");
    private final static QName _IncludeTranslations_QNAME = new QName("http://www.siri.org.uk/siri", "IncludeTranslations");
    private final static QName _IncludeInterchanges_QNAME = new QName("http://www.siri.org.uk/siri", "IncludeInterchanges");
    private final static QName _IncludeJourneyRelations_QNAME = new QName("http://www.siri.org.uk/siri", "IncludeJourneyRelations");
    private final static QName _IncludeTrainFormations_QNAME = new QName("http://www.siri.org.uk/siri", "IncludeTrainFormations");
    private final static QName _ErrorCondition_QNAME = new QName("http://www.siri.org.uk/siri", "ErrorCondition");
    private final static QName _ErrorConditionElement_QNAME = new QName("http://www.siri.org.uk/siri", "ErrorConditionElement");
    private final static QName _ServiceDeliveryErrorConditionElement_QNAME = new QName("http://www.siri.org.uk/siri", "ServiceDeliveryErrorConditionElement");
    private final static QName _UnapprovedKeyAccessError_QNAME = new QName("http://www.siri.org.uk/siri", "UnapprovedKeyAccessError");
    private final static QName _UnknownParticipantError_QNAME = new QName("http://www.siri.org.uk/siri", "UnknownParticipantError");
    private final static QName _UnknownEndpointError_QNAME = new QName("http://www.siri.org.uk/siri", "UnknownEndpointError");
    private final static QName _EndpointDeniedAccessError_QNAME = new QName("http://www.siri.org.uk/siri", "EndpointDeniedAccessError");
    private final static QName _EndpointNotAvailableAccessError_QNAME = new QName("http://www.siri.org.uk/siri", "EndpointNotAvailableAccessError");
    private final static QName _ServiceNotAvailableError_QNAME = new QName("http://www.siri.org.uk/siri", "ServiceNotAvailableError");
    private final static QName _CapabilityNotSupportedError_QNAME = new QName("http://www.siri.org.uk/siri", "CapabilityNotSupportedError");
    private final static QName _BeyondDataHorizon_QNAME = new QName("http://www.siri.org.uk/siri", "BeyondDataHorizon");
    private final static QName _AccessNotAllowedError_QNAME = new QName("http://www.siri.org.uk/siri", "AccessNotAllowedError");
    private final static QName _NoInfoForTopicError_QNAME = new QName("http://www.siri.org.uk/siri", "NoInfoForTopicError");
    private final static QName _InvalidDataReferencesError_QNAME = new QName("http://www.siri.org.uk/siri", "InvalidDataReferencesError");
    private final static QName _ParametersIgnoredError_QNAME = new QName("http://www.siri.org.uk/siri", "ParametersIgnoredError");
    private final static QName _UnknownExtensionsError_QNAME = new QName("http://www.siri.org.uk/siri", "UnknownExtensionsError");
    private final static QName _AllowedResourceUsageExceededError_QNAME = new QName("http://www.siri.org.uk/siri", "AllowedResourceUsageExceededError");
    private final static QName _UnknownSubscriberError_QNAME = new QName("http://www.siri.org.uk/siri", "UnknownSubscriberError");
    private final static QName _UnknownSubscriptionError_QNAME = new QName("http://www.siri.org.uk/siri", "UnknownSubscriptionError");
    private final static QName _AuthenticatedRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AuthenticatedRequest");
    private final static QName _AbstractTrackedRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractTrackedRequest");
    private final static QName _AbstractFunctionalServiceSubscriptionRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractFunctionalServiceSubscriptionRequest");
    private final static QName _Status_QNAME = new QName("http://www.siri.org.uk/siri", "Status");
    private final static QName _ProducerRequest_QNAME = new QName("http://www.siri.org.uk/siri", "ProducerRequest");
    private final static QName _AbstractFunctionalServiceCapabilitiesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractFunctionalServiceCapabilitiesRequest");
    private final static QName _AbstractDiscoveryRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractDiscoveryRequest");
    private final static QName _AbstractDiscoveryDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractDiscoveryDelivery");
    private final static QName _TerminateSubscriptionRequest_QNAME = new QName("http://www.siri.org.uk/siri", "TerminateSubscriptionRequest");
    private final static QName _TerminateSubscriptionResponse_QNAME = new QName("http://www.siri.org.uk/siri", "TerminateSubscriptionResponse");
    private final static QName _SubscriptionTerminatedNotification_QNAME = new QName("http://www.siri.org.uk/siri", "SubscriptionTerminatedNotification");
    private final static QName _ResponseStatus_QNAME = new QName("http://www.siri.org.uk/siri", "ResponseStatus");
    private final static QName _SubscriptionResponse_QNAME = new QName("http://www.siri.org.uk/siri", "SubscriptionResponse");
    private final static QName _DataReadyNotification_QNAME = new QName("http://www.siri.org.uk/siri", "DataReadyNotification");
    private final static QName _DataReadyAcknowledgement_QNAME = new QName("http://www.siri.org.uk/siri", "DataReadyAcknowledgement");
    private final static QName _DataSupplyRequest_QNAME = new QName("http://www.siri.org.uk/siri", "DataSupplyRequest");
    private final static QName _DataReceivedAcknowledgement_QNAME = new QName("http://www.siri.org.uk/siri", "DataReceivedAcknowledgement");
    private final static QName _CheckStatusRequest_QNAME = new QName("http://www.siri.org.uk/siri", "CheckStatusRequest");
    private final static QName _CheckStatusResponse_QNAME = new QName("http://www.siri.org.uk/siri", "CheckStatusResponse");
    private final static QName _HeartbeatNotification_QNAME = new QName("http://www.siri.org.uk/siri", "HeartbeatNotification");
    private final static QName _CapabilitiesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "CapabilitiesRequest");
    private final static QName _CapabilitiesResponse_QNAME = new QName("http://www.siri.org.uk/siri", "CapabilitiesResponse");
    private final static QName _AccessFacility_QNAME = new QName("http://www.siri.org.uk/siri", "AccessFacility");
    private final static QName _AccommodationFacility_QNAME = new QName("http://www.siri.org.uk/siri", "AccommodationFacility");
    private final static QName _AssistanceFacility_QNAME = new QName("http://www.siri.org.uk/siri", "AssistanceFacility");
    private final static QName _FareClassFacility_QNAME = new QName("http://www.siri.org.uk/siri", "FareClassFacility");
    private final static QName _HireFacility_QNAME = new QName("http://www.siri.org.uk/siri", "HireFacility");
    private final static QName _LuggageFacility_QNAME = new QName("http://www.siri.org.uk/siri", "LuggageFacility");
    private final static QName _MobilityFacility_QNAME = new QName("http://www.siri.org.uk/siri", "MobilityFacility");
    private final static QName _NuisanceFacility_QNAME = new QName("http://www.siri.org.uk/siri", "NuisanceFacility");
    private final static QName _ParkingFacility_QNAME = new QName("http://www.siri.org.uk/siri", "ParkingFacility");
    private final static QName _PassengerInformationFacility_QNAME = new QName("http://www.siri.org.uk/siri", "PassengerInformationFacility");
    private final static QName _PassengerCommsFacility_QNAME = new QName("http://www.siri.org.uk/siri", "PassengerCommsFacility");
    private final static QName _RefreshmentFacility_QNAME = new QName("http://www.siri.org.uk/siri", "RefreshmentFacility");
    private final static QName _ReservedSpaceFacility_QNAME = new QName("http://www.siri.org.uk/siri", "ReservedSpaceFacility");
    private final static QName _RetailFacility_QNAME = new QName("http://www.siri.org.uk/siri", "RetailFacility");
    private final static QName _SanitaryFacility_QNAME = new QName("http://www.siri.org.uk/siri", "SanitaryFacility");
    private final static QName _TicketingFacility_QNAME = new QName("http://www.siri.org.uk/siri", "TicketingFacility");
    private final static QName _DayType_QNAME = new QName("http://www.siri.org.uk/siri", "DayType");
    private final static QName _SituationRef_QNAME = new QName("http://www.siri.org.uk/siri", "SituationRef");
    private final static QName _SituationSimpleRef_QNAME = new QName("http://www.siri.org.uk/siri", "SituationSimpleRef");
    private final static QName _SituationNumber_QNAME = new QName("http://www.siri.org.uk/siri", "SituationNumber");
    private final static QName _SituationFullRef_QNAME = new QName("http://www.siri.org.uk/siri", "SituationFullRef");
    private final static QName _VersionRef_QNAME = new QName("http://www.siri.org.uk/siri", "VersionRef");
    private final static QName _VisitNumber_QNAME = new QName("http://www.siri.org.uk/siri", "VisitNumber");
    private final static QName _Order_QNAME = new QName("http://www.siri.org.uk/siri", "Order");
    private final static QName _StopPointRef_QNAME = new QName("http://www.siri.org.uk/siri", "StopPointRef");
    private final static QName _StopPointName_QNAME = new QName("http://www.siri.org.uk/siri", "StopPointName");
    private final static QName _TimingPoint_QNAME = new QName("http://www.siri.org.uk/siri", "TimingPoint");
    private final static QName _VehicleAtStop_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleAtStop");
    private final static QName _ConnectionLinkRef_QNAME = new QName("http://www.siri.org.uk/siri", "ConnectionLinkRef");
    private final static QName _JourneyPatternRef_QNAME = new QName("http://www.siri.org.uk/siri", "JourneyPatternRef");
    private final static QName _LineRef_QNAME = new QName("http://www.siri.org.uk/siri", "LineRef");
    private final static QName _PublishedLineName_QNAME = new QName("http://www.siri.org.uk/siri", "PublishedLineName");
    private final static QName _RouteName_QNAME = new QName("http://www.siri.org.uk/siri", "RouteName");
    private final static QName _VehicleRef_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleRef");
    private final static QName _SiteRef_QNAME = new QName("http://www.siri.org.uk/siri", "SiteRef");
    private final static QName _VehicleJourneyRef_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleJourneyRef");
    private final static QName _DatedVehicleJourneyRef_QNAME = new QName("http://www.siri.org.uk/siri", "DatedVehicleJourneyRef");
    private final static QName _InterchangeRef_QNAME = new QName("http://www.siri.org.uk/siri", "InterchangeRef");
    private final static QName _TrainElementRef_QNAME = new QName("http://www.siri.org.uk/siri", "TrainElementRef");
    private final static QName _TrainComponentRef_QNAME = new QName("http://www.siri.org.uk/siri", "TrainComponentRef");
    private final static QName _TrainRef_QNAME = new QName("http://www.siri.org.uk/siri", "TrainRef");
    private final static QName _CompoundTrainRef_QNAME = new QName("http://www.siri.org.uk/siri", "CompoundTrainRef");
    private final static QName _TrainInCompoundTrainRef_QNAME = new QName("http://www.siri.org.uk/siri", "TrainInCompoundTrainRef");
    private final static QName _EntranceToVehicleRef_QNAME = new QName("http://www.siri.org.uk/siri", "EntranceToVehicleRef");
    private final static QName _OriginRef_QNAME = new QName("http://www.siri.org.uk/siri", "OriginRef");
    private final static QName _ViaRef_QNAME = new QName("http://www.siri.org.uk/siri", "ViaRef");
    private final static QName _DestinationRef_QNAME = new QName("http://www.siri.org.uk/siri", "DestinationRef");
    private final static QName _FareClass_QNAME = new QName("http://www.siri.org.uk/siri", "FareClass");
    private final static QName _FareClasses_QNAME = new QName("http://www.siri.org.uk/siri", "FareClasses");
    private final static QName _ProductCategory_QNAME = new QName("http://www.siri.org.uk/siri", "ProductCategory");
    private final static QName _ServiceFeature_QNAME = new QName("http://www.siri.org.uk/siri", "ServiceFeature");
    private final static QName _VehicleFeature_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleFeature");
    private final static QName _OriginName_QNAME = new QName("http://www.siri.org.uk/siri", "OriginName");
    private final static QName _ViaName_QNAME = new QName("http://www.siri.org.uk/siri", "ViaName");
    private final static QName _DestinationName_QNAME = new QName("http://www.siri.org.uk/siri", "DestinationName");
    private final static QName _FirstOrLastJourney_QNAME = new QName("http://www.siri.org.uk/siri", "FirstOrLastJourney");
    private final static QName _JourneyNote_QNAME = new QName("http://www.siri.org.uk/siri", "JourneyNote");
    private final static QName _Direction_QNAME = new QName("http://www.siri.org.uk/siri", "Direction");
    private final static QName _AimedFlexibleArea_QNAME = new QName("http://www.siri.org.uk/siri", "AimedFlexibleArea");
    private final static QName _AimedFlexibleAreaRef_QNAME = new QName("http://www.siri.org.uk/siri", "AimedFlexibleAreaRef");
    private final static QName _AimedLocationName_QNAME = new QName("http://www.siri.org.uk/siri", "AimedLocationName");
    private final static QName _QuayType_QNAME = new QName("http://www.siri.org.uk/siri", "QuayType");
    private final static QName _PredictionInaccurate_QNAME = new QName("http://www.siri.org.uk/siri", "PredictionInaccurate");
    private final static QName _PredictionInaccurateReason_QNAME = new QName("http://www.siri.org.uk/siri", "PredictionInaccurateReason");
    private final static QName _Occupancy_QNAME = new QName("http://www.siri.org.uk/siri", "Occupancy");
    private final static QName _AimedArrivalTime_QNAME = new QName("http://www.siri.org.uk/siri", "AimedArrivalTime");
    private final static QName _ActualArrivalTime_QNAME = new QName("http://www.siri.org.uk/siri", "ActualArrivalTime");
    private final static QName _ExpectedArrivalTime_QNAME = new QName("http://www.siri.org.uk/siri", "ExpectedArrivalTime");
    private final static QName _ArrivalStatus_QNAME = new QName("http://www.siri.org.uk/siri", "ArrivalStatus");
    private final static QName _ArrivalCancellationReason_QNAME = new QName("http://www.siri.org.uk/siri", "ArrivalCancellationReason");
    private final static QName _ArrivalProximityText_QNAME = new QName("http://www.siri.org.uk/siri", "ArrivalProximityText");
    private final static QName _ArrivalPlatformName_QNAME = new QName("http://www.siri.org.uk/siri", "ArrivalPlatformName");
    private final static QName _ArrivalBoardingActivity_QNAME = new QName("http://www.siri.org.uk/siri", "ArrivalBoardingActivity");
    private final static QName _ArrivalFormationAssignment_QNAME = new QName("http://www.siri.org.uk/siri", "ArrivalFormationAssignment");
    private final static QName _ArrivalOrientationRelativeToQuay_QNAME = new QName("http://www.siri.org.uk/siri", "ArrivalOrientationRelativeToQuay");
    private final static QName _ArrivalOperatorRefs_QNAME = new QName("http://www.siri.org.uk/siri", "ArrivalOperatorRefs");
    private final static QName _AimedDepartureTime_QNAME = new QName("http://www.siri.org.uk/siri", "AimedDepartureTime");
    private final static QName _ActualDepartureTime_QNAME = new QName("http://www.siri.org.uk/siri", "ActualDepartureTime");
    private final static QName _ExpectedDepartureTime_QNAME = new QName("http://www.siri.org.uk/siri", "ExpectedDepartureTime");
    private final static QName _AimedLatestPassengerAccessTime_QNAME = new QName("http://www.siri.org.uk/siri", "AimedLatestPassengerAccessTime");
    private final static QName _ExpectedLatestPassengerAccessTime_QNAME = new QName("http://www.siri.org.uk/siri", "ExpectedLatestPassengerAccessTime");
    private final static QName _DepartureStatus_QNAME = new QName("http://www.siri.org.uk/siri", "DepartureStatus");
    private final static QName _DepartureCancellationReason_QNAME = new QName("http://www.siri.org.uk/siri", "DepartureCancellationReason");
    private final static QName _DepartureProximityText_QNAME = new QName("http://www.siri.org.uk/siri", "DepartureProximityText");
    private final static QName _DeparturePlatformName_QNAME = new QName("http://www.siri.org.uk/siri", "DeparturePlatformName");
    private final static QName _DepartureBoardingActivity_QNAME = new QName("http://www.siri.org.uk/siri", "DepartureBoardingActivity");
    private final static QName _DepartureFormationAssignment_QNAME = new QName("http://www.siri.org.uk/siri", "DepartureFormationAssignment");
    private final static QName _DepartureOrientationRelativeToQuay_QNAME = new QName("http://www.siri.org.uk/siri", "DepartureOrientationRelativeToQuay");
    private final static QName _ExpectedDepartureOccupancy_QNAME = new QName("http://www.siri.org.uk/siri", "ExpectedDepartureOccupancy");
    private final static QName _ExpectedDepartureCapacities_QNAME = new QName("http://www.siri.org.uk/siri", "ExpectedDepartureCapacities");
    private final static QName _RecordedDepartureOccupancy_QNAME = new QName("http://www.siri.org.uk/siri", "RecordedDepartureOccupancy");
    private final static QName _RecordedDepartureCapacities_QNAME = new QName("http://www.siri.org.uk/siri", "RecordedDepartureCapacities");
    private final static QName _DepartureOperatorRefs_QNAME = new QName("http://www.siri.org.uk/siri", "DepartureOperatorRefs");
    private final static QName _AimedHeadwayInterval_QNAME = new QName("http://www.siri.org.uk/siri", "AimedHeadwayInterval");
    private final static QName _ExpectedHeadwayInterval_QNAME = new QName("http://www.siri.org.uk/siri", "ExpectedHeadwayInterval");
    private final static QName _ActualHeadwayInterval_QNAME = new QName("http://www.siri.org.uk/siri", "ActualHeadwayInterval");
    private final static QName _RelatedJourney_QNAME = new QName("http://www.siri.org.uk/siri", "RelatedJourney");
    private final static QName _FormationCondition_QNAME = new QName("http://www.siri.org.uk/siri", "FormationCondition");
    private final static QName _TrainElement_QNAME = new QName("http://www.siri.org.uk/siri", "TrainElement");
    private final static QName _TrainComponent_QNAME = new QName("http://www.siri.org.uk/siri", "TrainComponent");
    private final static QName _Train_QNAME = new QName("http://www.siri.org.uk/siri", "Train");
    private final static QName _CompoundTrain_QNAME = new QName("http://www.siri.org.uk/siri", "CompoundTrain");
    private final static QName _TrainInCompoundTrain_QNAME = new QName("http://www.siri.org.uk/siri", "TrainInCompoundTrain");
    private final static QName _FacilityRef_QNAME = new QName("http://www.siri.org.uk/siri", "FacilityRef");
    private final static QName _FacilityConditionElement_QNAME = new QName("http://www.siri.org.uk/siri", "FacilityConditionElement");
    private final static QName _FacilityChangeElement_QNAME = new QName("http://www.siri.org.uk/siri", "FacilityChangeElement");
    private final static QName _DatedVehicleJourney_QNAME = new QName("http://www.siri.org.uk/siri", "DatedVehicleJourney");
    private final static QName _DatedCall_QNAME = new QName("http://www.siri.org.uk/siri", "DatedCall");
    private final static QName _InterchangeCode_QNAME = new QName("http://www.siri.org.uk/siri", "InterchangeCode");
    private final static QName _ExtraInterchange_QNAME = new QName("http://www.siri.org.uk/siri", "ExtraInterchange");
    private final static QName _ReasonForRemoval_QNAME = new QName("http://www.siri.org.uk/siri", "ReasonForRemoval");
    private final static QName _FeederRef_QNAME = new QName("http://www.siri.org.uk/siri", "FeederRef");
    private final static QName _FeederArrivalStopRef_QNAME = new QName("http://www.siri.org.uk/siri", "FeederArrivalStopRef");
    private final static QName _FeederVisitNumber_QNAME = new QName("http://www.siri.org.uk/siri", "FeederVisitNumber");
    private final static QName _FeederStopOrder_QNAME = new QName("http://www.siri.org.uk/siri", "FeederStopOrder");
    private final static QName _AimedArrivalTimeOfFeeder_QNAME = new QName("http://www.siri.org.uk/siri", "AimedArrivalTimeOfFeeder");
    private final static QName _DistributorRef_QNAME = new QName("http://www.siri.org.uk/siri", "DistributorRef");
    private final static QName _DistributorDepartureStopRef_QNAME = new QName("http://www.siri.org.uk/siri", "DistributorDepartureStopRef");
    private final static QName _DistributorVisitNumber_QNAME = new QName("http://www.siri.org.uk/siri", "DistributorVisitNumber");
    private final static QName _DistributorStopOrder_QNAME = new QName("http://www.siri.org.uk/siri", "DistributorStopOrder");
    private final static QName _AimedDepartureTimeOfDistributor_QNAME = new QName("http://www.siri.org.uk/siri", "AimedDepartureTimeOfDistributor");
    private final static QName _ReportType_QNAME = new QName("http://www.siri.org.uk/siri", "ReportType");
    private final static QName _InterchangeStatusType_QNAME = new QName("http://www.siri.org.uk/siri", "InterchangeStatusType");
    private final static QName _TicketRestrictionType_QNAME = new QName("http://www.siri.org.uk/siri", "TicketRestrictionType");
    private final static QName _BookingStatusType_QNAME = new QName("http://www.siri.org.uk/siri", "BookingStatusType");
    private final static QName _StopPointType_QNAME = new QName("http://www.siri.org.uk/siri", "StopPointType");
    private final static QName _RoutePointType_QNAME = new QName("http://www.siri.org.uk/siri", "RoutePointType");
    private final static QName _TimetableType_QNAME = new QName("http://www.siri.org.uk/siri", "TimetableType");
    private final static QName _AlertCause_QNAME = new QName("http://www.siri.org.uk/siri", "AlertCause");
    private final static QName _UnknownReason_QNAME = new QName("http://www.siri.org.uk/siri", "UnknownReason");
    private final static QName _UndefinedReason_QNAME = new QName("http://www.siri.org.uk/siri", "UndefinedReason");
    private final static QName _MiscellaneousReason_QNAME = new QName("http://www.siri.org.uk/siri", "MiscellaneousReason");
    private final static QName _MiscellaneousSubReason_QNAME = new QName("http://www.siri.org.uk/siri", "MiscellaneousSubReason");
    private final static QName _PersonnelReason_QNAME = new QName("http://www.siri.org.uk/siri", "PersonnelReason");
    private final static QName _PersonnelSubReason_QNAME = new QName("http://www.siri.org.uk/siri", "PersonnelSubReason");
    private final static QName _EquipmentReason_QNAME = new QName("http://www.siri.org.uk/siri", "EquipmentReason");
    private final static QName _EquipmentSubReason_QNAME = new QName("http://www.siri.org.uk/siri", "EquipmentSubReason");
    private final static QName _EnvironmentReason_QNAME = new QName("http://www.siri.org.uk/siri", "EnvironmentReason");
    private final static QName _EnvironmentSubReason_QNAME = new QName("http://www.siri.org.uk/siri", "EnvironmentSubReason");
    private final static QName _Severity_QNAME = new QName("http://www.siri.org.uk/siri", "Severity");
    private final static QName _Condition_QNAME = new QName("http://www.siri.org.uk/siri", "Condition");
    private final static QName _VerificationStatus_QNAME = new QName("http://www.siri.org.uk/siri", "VerificationStatus");
    private final static QName _Predictability_QNAME = new QName("http://www.siri.org.uk/siri", "Predictability");
    private final static QName _PtSituationElement_QNAME = new QName("http://www.siri.org.uk/siri", "PtSituationElement");
    private final static QName _RoadSituationElement_QNAME = new QName("http://www.siri.org.uk/siri", "RoadSituationElement");
    private final static QName _PublishToWebAction_QNAME = new QName("http://www.siri.org.uk/siri", "PublishToWebAction");
    private final static QName _PublishToMobileAction_QNAME = new QName("http://www.siri.org.uk/siri", "PublishToMobileAction");
    private final static QName _PublishToDisplayAction_QNAME = new QName("http://www.siri.org.uk/siri", "PublishToDisplayAction");
    private final static QName _PublishToAlertsAction_QNAME = new QName("http://www.siri.org.uk/siri", "PublishToAlertsAction");
    private final static QName _PublishToTvAction_QNAME = new QName("http://www.siri.org.uk/siri", "PublishToTvAction");
    private final static QName _NotifyBySmsAction_QNAME = new QName("http://www.siri.org.uk/siri", "NotifyBySmsAction");
    private final static QName _NotifyByEmailAction_QNAME = new QName("http://www.siri.org.uk/siri", "NotifyByEmailAction");
    private final static QName _NotifyByPagerAction_QNAME = new QName("http://www.siri.org.uk/siri", "NotifyByPagerAction");
    private final static QName _NotifyUserAction_QNAME = new QName("http://www.siri.org.uk/siri", "NotifyUserAction");
    private final static QName _PassengerInformationAction_QNAME = new QName("http://www.siri.org.uk/siri", "PassengerInformationAction");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.org.siri.siri
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceDeliveryStructure }
     */
    public ServiceDeliveryStructure createServiceDeliveryStructure() {
        return new ServiceDeliveryStructure();
    }

    /**
     * Create an instance of {@link PublishingActionStructure }
     */
    public PublishingActionStructure createPublishingActionStructure() {
        return new PublishingActionStructure();
    }

    /**
     * Create an instance of {@link PushedActionStructure }
     */
    public PushedActionStructure createPushedActionStructure() {
        return new PushedActionStructure();
    }

    /**
     * Create an instance of {@link PtConsequenceStructure }
     */
    public PtConsequenceStructure createPtConsequenceStructure() {
        return new PtConsequenceStructure();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure }
     */
    public AffectsScopeStructure createAffectsScopeStructure() {
        return new AffectsScopeStructure();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure.Networks }
     */
    public AffectsScopeStructure.Networks createAffectsScopeStructureNetworks() {
        return new AffectsScopeStructure.Networks();
    }

    /**
     * Create an instance of {@link AffectedStopPlaceComponentStructure }
     */
    public AffectedStopPlaceComponentStructure createAffectedStopPlaceComponentStructure() {
        return new AffectedStopPlaceComponentStructure();
    }

    /**
     * Create an instance of {@link AffectedStopPlaceStructure }
     */
    public AffectedStopPlaceStructure createAffectedStopPlaceStructure() {
        return new AffectedStopPlaceStructure();
    }

    /**
     * Create an instance of {@link AffectedStopPointStructure }
     */
    public AffectedStopPointStructure createAffectedStopPointStructure() {
        return new AffectedStopPointStructure();
    }

    /**
     * Create an instance of {@link AffectedCallStructure }
     */
    public AffectedCallStructure createAffectedCallStructure() {
        return new AffectedCallStructure();
    }

    /**
     * Create an instance of {@link AffectedVehicleJourneyStructure }
     */
    public AffectedVehicleJourneyStructure createAffectedVehicleJourneyStructure() {
        return new AffectedVehicleJourneyStructure();
    }

    /**
     * Create an instance of {@link AffectedRouteStructure }
     */
    public AffectedRouteStructure createAffectedRouteStructure() {
        return new AffectedRouteStructure();
    }

    /**
     * Create an instance of {@link AffectedSectionStructure }
     */
    public AffectedSectionStructure createAffectedSectionStructure() {
        return new AffectedSectionStructure();
    }

    /**
     * Create an instance of {@link AffectedLineStructure }
     */
    public AffectedLineStructure createAffectedLineStructure() {
        return new AffectedLineStructure();
    }

    /**
     * Create an instance of {@link AffectedModesStructure }
     */
    public AffectedModesStructure createAffectedModesStructure() {
        return new AffectedModesStructure();
    }

    /**
     * Create an instance of {@link RemovedDatedVehicleJourneyStructure }
     */
    public RemovedDatedVehicleJourneyStructure createRemovedDatedVehicleJourneyStructure() {
        return new RemovedDatedVehicleJourneyStructure();
    }

    /**
     * Create an instance of {@link EquipmentAvailabilityStructure }
     */
    public EquipmentAvailabilityStructure createEquipmentAvailabilityStructure() {
        return new EquipmentAvailabilityStructure();
    }

    /**
     * Create an instance of {@link MonitoredCountingStructure }
     */
    public MonitoredCountingStructure createMonitoredCountingStructure() {
        return new MonitoredCountingStructure();
    }

    /**
     * Create an instance of {@link FacilityStructure }
     */
    public FacilityStructure createFacilityStructure() {
        return new FacilityStructure();
    }

    /**
     * Create an instance of {@link JourneyRelationStructure }
     */
    public JourneyRelationStructure createJourneyRelationStructure() {
        return new JourneyRelationStructure();
    }

    /**
     * Create an instance of {@link MonitoredVehicleJourneyStructure }
     */
    public MonitoredVehicleJourneyStructure createMonitoredVehicleJourneyStructure() {
        return new MonitoredVehicleJourneyStructure();
    }

    /**
     * Create an instance of {@link CheckStatusResponseBodyStructure }
     */
    public CheckStatusResponseBodyStructure createCheckStatusResponseBodyStructure() {
        return new CheckStatusResponseBodyStructure();
    }

    /**
     * Create an instance of {@link TerminationResponseStatusStructure }
     */
    public TerminationResponseStatusStructure createTerminationResponseStatusStructure() {
        return new TerminationResponseStatusStructure();
    }

    /**
     * Create an instance of {@link CapabilityGeneralInteractionStructure }
     */
    public CapabilityGeneralInteractionStructure createCapabilityGeneralInteractionStructure() {
        return new CapabilityGeneralInteractionStructure();
    }

    /**
     * Create an instance of {@link ActionDataStructure }
     */
    public ActionDataStructure createActionDataStructure() {
        return new ActionDataStructure();
    }

    /**
     * Create an instance of {@link RoadSituationElementStructure }
     */
    public RoadSituationElementStructure createRoadSituationElementStructure() {
        return new RoadSituationElementStructure();
    }

    /**
     * Create an instance of {@link RoadSituationElementStructure.Images }
     */
    public RoadSituationElementStructure.Images createRoadSituationElementStructureImages() {
        return new RoadSituationElementStructure.Images();
    }

    /**
     * Create an instance of {@link RoadSituationElementStructure.SecondaryReasons }
     */
    public RoadSituationElementStructure.SecondaryReasons createRoadSituationElementStructureSecondaryReasons() {
        return new RoadSituationElementStructure.SecondaryReasons();
    }

    /**
     * Create an instance of {@link DatedVehicleJourneyStructure }
     */
    public DatedVehicleJourneyStructure createDatedVehicleJourneyStructure() {
        return new DatedVehicleJourneyStructure();
    }

    /**
     * Create an instance of {@link FacilityConditionStructure }
     */
    public FacilityConditionStructure createFacilityConditionStructure() {
        return new FacilityConditionStructure();
    }

    /**
     * Create an instance of {@link TrainInCompoundTrainStructure }
     */
    public TrainInCompoundTrainStructure createTrainInCompoundTrainStructure() {
        return new TrainInCompoundTrainStructure();
    }

    /**
     * Create an instance of {@link CompoundTrainStructure }
     */
    public CompoundTrainStructure createCompoundTrainStructure() {
        return new CompoundTrainStructure();
    }

    /**
     * Create an instance of {@link TrainStructure }
     */
    public TrainStructure createTrainStructure() {
        return new TrainStructure();
    }

    /**
     * Create an instance of {@link DataReceivedResponseStructure }
     */
    public DataReceivedResponseStructure createDataReceivedResponseStructure() {
        return new DataReceivedResponseStructure();
    }

    /**
     * Create an instance of {@link DataReadyResponseStructure }
     */
    public DataReadyResponseStructure createDataReadyResponseStructure() {
        return new DataReadyResponseStructure();
    }

    /**
     * Create an instance of {@link OtherErrorStructure }
     */
    public OtherErrorStructure createOtherErrorStructure() {
        return new OtherErrorStructure();
    }

    /**
     * Create an instance of {@link ErrorCodeStructure }
     */
    public ErrorCodeStructure createErrorCodeStructure() {
        return new ErrorCodeStructure();
    }

    /**
     * Create an instance of {@link ParticipantRefStructure }
     */
    public ParticipantRefStructure createParticipantRefStructure() {
        return new ParticipantRefStructure();
    }

    /**
     * Create an instance of {@link OperatorRefStructure }
     */
    public OperatorRefStructure createOperatorRefStructure() {
        return new OperatorRefStructure();
    }

    /**
     * Create an instance of {@link ProductCategoryRefStructure }
     */
    public ProductCategoryRefStructure createProductCategoryRefStructure() {
        return new ProductCategoryRefStructure();
    }

    /**
     * Create an instance of {@link AbstractServiceCapabilitiesResponseStructure }
     */
    public AbstractServiceCapabilitiesResponseStructure createAbstractServiceCapabilitiesResponseStructure() {
        return new AbstractServiceCapabilitiesResponseStructure();
    }

    /**
     * Create an instance of {@link ExtensionsStructure }
     */
    public ExtensionsStructure createExtensionsStructure() {
        return new ExtensionsStructure();
    }

    /**
     * Create an instance of {@link ServiceFeatureRefStructure }
     */
    public ServiceFeatureRefStructure createServiceFeatureRefStructure() {
        return new ServiceFeatureRefStructure();
    }

    /**
     * Create an instance of {@link FeatureRefStructure }
     */
    public FeatureRefStructure createFeatureRefStructure() {
        return new FeatureRefStructure();
    }

    /**
     * Create an instance of {@link KeyListStructure }
     */
    public KeyListStructure createKeyListStructure() {
        return new KeyListStructure();
    }

    /**
     * Create an instance of {@link TypesOfValueStructure }
     */
    public TypesOfValueStructure createTypesOfValueStructure() {
        return new TypesOfValueStructure();
    }

    /**
     * Create an instance of {@link TypeOfValueStructure }
     */
    public TypeOfValueStructure createTypeOfValueStructure() {
        return new TypeOfValueStructure();
    }

    /**
     * Create an instance of {@link ValueSetStructure }
     */
    public ValueSetStructure createValueSetStructure() {
        return new ValueSetStructure();
    }

    /**
     * Create an instance of {@link ErrorConditionStructure }
     */
    public ErrorConditionStructure createErrorConditionStructure() {
        return new ErrorConditionStructure();
    }

    /**
     * Create an instance of {@link ErrorConditionElementStructure }
     */
    public ErrorConditionElementStructure createErrorConditionElementStructure() {
        return new ErrorConditionElementStructure();
    }

    /**
     * Create an instance of {@link ServiceDeliveryErrorConditionStructure }
     */
    public ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorConditionStructure() {
        return new ServiceDeliveryErrorConditionStructure();
    }

    /**
     * Create an instance of {@link UnapprovedKeyAccessStructure }
     */
    public UnapprovedKeyAccessStructure createUnapprovedKeyAccessStructure() {
        return new UnapprovedKeyAccessStructure();
    }

    /**
     * Create an instance of {@link UnknownParticipantErrorStructure }
     */
    public UnknownParticipantErrorStructure createUnknownParticipantErrorStructure() {
        return new UnknownParticipantErrorStructure();
    }

    /**
     * Create an instance of {@link UnknownEndpointErrorStructure }
     */
    public UnknownEndpointErrorStructure createUnknownEndpointErrorStructure() {
        return new UnknownEndpointErrorStructure();
    }

    /**
     * Create an instance of {@link EndpointDeniedAccessStructure }
     */
    public EndpointDeniedAccessStructure createEndpointDeniedAccessStructure() {
        return new EndpointDeniedAccessStructure();
    }

    /**
     * Create an instance of {@link EndpointNotAvailableAccessStructure }
     */
    public EndpointNotAvailableAccessStructure createEndpointNotAvailableAccessStructure() {
        return new EndpointNotAvailableAccessStructure();
    }

    /**
     * Create an instance of {@link ServiceNotAvailableErrorStructure }
     */
    public ServiceNotAvailableErrorStructure createServiceNotAvailableErrorStructure() {
        return new ServiceNotAvailableErrorStructure();
    }

    /**
     * Create an instance of {@link CapabilityNotSupportedErrorStructure }
     */
    public CapabilityNotSupportedErrorStructure createCapabilityNotSupportedErrorStructure() {
        return new CapabilityNotSupportedErrorStructure();
    }

    /**
     * Create an instance of {@link BeyondDataHorizonErrorStructure }
     */
    public BeyondDataHorizonErrorStructure createBeyondDataHorizonErrorStructure() {
        return new BeyondDataHorizonErrorStructure();
    }

    /**
     * Create an instance of {@link AccessNotAllowedErrorStructure }
     */
    public AccessNotAllowedErrorStructure createAccessNotAllowedErrorStructure() {
        return new AccessNotAllowedErrorStructure();
    }

    /**
     * Create an instance of {@link NoInfoForTopicErrorStructure }
     */
    public NoInfoForTopicErrorStructure createNoInfoForTopicErrorStructure() {
        return new NoInfoForTopicErrorStructure();
    }

    /**
     * Create an instance of {@link InvalidDataReferencesErrorStructure }
     */
    public InvalidDataReferencesErrorStructure createInvalidDataReferencesErrorStructure() {
        return new InvalidDataReferencesErrorStructure();
    }

    /**
     * Create an instance of {@link ParametersIgnoredErrorStructure }
     */
    public ParametersIgnoredErrorStructure createParametersIgnoredErrorStructure() {
        return new ParametersIgnoredErrorStructure();
    }

    /**
     * Create an instance of {@link UnknownExtensionsErrorStructure }
     */
    public UnknownExtensionsErrorStructure createUnknownExtensionsErrorStructure() {
        return new UnknownExtensionsErrorStructure();
    }

    /**
     * Create an instance of {@link AllowedResourceUsageExceededErrorStructure }
     */
    public AllowedResourceUsageExceededErrorStructure createAllowedResourceUsageExceededErrorStructure() {
        return new AllowedResourceUsageExceededErrorStructure();
    }

    /**
     * Create an instance of {@link UnknownSubscriberErrorStructure }
     */
    public UnknownSubscriberErrorStructure createUnknownSubscriberErrorStructure() {
        return new UnknownSubscriberErrorStructure();
    }

    /**
     * Create an instance of {@link UnknownSubscriptionErrorStructure }
     */
    public UnknownSubscriptionErrorStructure createUnknownSubscriptionErrorStructure() {
        return new UnknownSubscriptionErrorStructure();
    }

    /**
     * Create an instance of {@link RequestStructure }
     */
    public RequestStructure createRequestStructure() {
        return new RequestStructure();
    }

    /**
     * Create an instance of {@link ProducerRequestEndpointStructure }
     */
    public ProducerRequestEndpointStructure createProducerRequestEndpointStructure() {
        return new ProducerRequestEndpointStructure();
    }

    /**
     * Create an instance of {@link AbstractDiscoveryDeliveryStructure }
     */
    public AbstractDiscoveryDeliveryStructure createAbstractDiscoveryDeliveryStructure() {
        return new AbstractDiscoveryDeliveryStructure();
    }

    /**
     * Create an instance of {@link TerminateSubscriptionRequestStructure }
     */
    public TerminateSubscriptionRequestStructure createTerminateSubscriptionRequestStructure() {
        return new TerminateSubscriptionRequestStructure();
    }

    /**
     * Create an instance of {@link TerminateSubscriptionResponseStructure }
     */
    public TerminateSubscriptionResponseStructure createTerminateSubscriptionResponseStructure() {
        return new TerminateSubscriptionResponseStructure();
    }

    /**
     * Create an instance of {@link SubscriptionTerminatedNotificationStructure }
     */
    public SubscriptionTerminatedNotificationStructure createSubscriptionTerminatedNotificationStructure() {
        return new SubscriptionTerminatedNotificationStructure();
    }

    /**
     * Create an instance of {@link StatusResponseStructure }
     */
    public StatusResponseStructure createStatusResponseStructure() {
        return new StatusResponseStructure();
    }

    /**
     * Create an instance of {@link SubscriptionResponseStructure }
     */
    public SubscriptionResponseStructure createSubscriptionResponseStructure() {
        return new SubscriptionResponseStructure();
    }

    /**
     * Create an instance of {@link DataReadyRequestStructure }
     */
    public DataReadyRequestStructure createDataReadyRequestStructure() {
        return new DataReadyRequestStructure();
    }

    /**
     * Create an instance of {@link DataSupplyRequestStructure }
     */
    public DataSupplyRequestStructure createDataSupplyRequestStructure() {
        return new DataSupplyRequestStructure();
    }

    /**
     * Create an instance of {@link CheckStatusRequestStructure }
     */
    public CheckStatusRequestStructure createCheckStatusRequestStructure() {
        return new CheckStatusRequestStructure();
    }

    /**
     * Create an instance of {@link CheckStatusResponseStructure }
     */
    public CheckStatusResponseStructure createCheckStatusResponseStructure() {
        return new CheckStatusResponseStructure();
    }

    /**
     * Create an instance of {@link HeartbeatNotificationStructure }
     */
    public HeartbeatNotificationStructure createHeartbeatNotificationStructure() {
        return new HeartbeatNotificationStructure();
    }

    /**
     * Create an instance of {@link ServiceRequest }
     */
    public ServiceRequest createServiceRequest() {
        return new ServiceRequest();
    }

    /**
     * Create an instance of {@link ServiceRequestStructure }
     */
    public ServiceRequestStructure createServiceRequestStructure() {
        return new ServiceRequestStructure();
    }

    /**
     * Create an instance of {@link ServiceRequestContextStructure }
     */
    public ServiceRequestContextStructure createServiceRequestContextStructure() {
        return new ServiceRequestContextStructure();
    }

    /**
     * Create an instance of {@link MessageQualifierStructure }
     */
    public MessageQualifierStructure createMessageQualifierStructure() {
        return new MessageQualifierStructure();
    }

    /**
     * Create an instance of {@link SubscriptionRequest }
     */
    public SubscriptionRequest createSubscriptionRequest() {
        return new SubscriptionRequest();
    }

    /**
     * Create an instance of {@link SubscriptionRequestStructure }
     */
    public SubscriptionRequestStructure createSubscriptionRequestStructure() {
        return new SubscriptionRequestStructure();
    }

    /**
     * Create an instance of {@link SubscriptionContextStructure }
     */
    public SubscriptionContextStructure createSubscriptionContextStructure() {
        return new SubscriptionContextStructure();
    }

    /**
     * Create an instance of {@link ServiceDelivery }
     */
    public ServiceDelivery createServiceDelivery() {
        return new ServiceDelivery();
    }

    /**
     * Create an instance of {@link ProducerResponseStructure }
     */
    public ProducerResponseStructure createProducerResponseStructure() {
        return new ProducerResponseStructure();
    }

    /**
     * Create an instance of {@link MessageRefStructure }
     */
    public MessageRefStructure createMessageRefStructure() {
        return new MessageRefStructure();
    }

    /**
     * Create an instance of {@link ServiceDeliveryStructure.ErrorCondition }
     */
    public ServiceDeliveryStructure.ErrorCondition createServiceDeliveryStructureErrorCondition() {
        return new ServiceDeliveryStructure.ErrorCondition();
    }

    /**
     * Create an instance of {@link CapabilitiesRequestStructure }
     */
    public CapabilitiesRequestStructure createCapabilitiesRequestStructure() {
        return new CapabilitiesRequestStructure();
    }

    /**
     * Create an instance of {@link CapabilitiesResponseStructure }
     */
    public CapabilitiesResponseStructure createCapabilitiesResponseStructure() {
        return new CapabilitiesResponseStructure();
    }

    /**
     * Create an instance of {@link SituationRefStructure }
     */
    public SituationRefStructure createSituationRefStructure() {
        return new SituationRefStructure();
    }

    /**
     * Create an instance of {@link SituationSimpleRefStructure }
     */
    public SituationSimpleRefStructure createSituationSimpleRefStructure() {
        return new SituationSimpleRefStructure();
    }

    /**
     * Create an instance of {@link EntryQualifierStructure }
     */
    public EntryQualifierStructure createEntryQualifierStructure() {
        return new EntryQualifierStructure();
    }

    /**
     * Create an instance of {@link SituationFullRefStructure }
     */
    public SituationFullRefStructure createSituationFullRefStructure() {
        return new SituationFullRefStructure();
    }

    /**
     * Create an instance of {@link StopPointRefStructure }
     */
    public StopPointRefStructure createStopPointRefStructure() {
        return new StopPointRefStructure();
    }

    /**
     * Create an instance of {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure createNaturalLanguageStringStructure() {
        return new NaturalLanguageStringStructure();
    }

    /**
     * Create an instance of {@link ConnectionLinkRefStructure }
     */
    public ConnectionLinkRefStructure createConnectionLinkRefStructure() {
        return new ConnectionLinkRefStructure();
    }

    /**
     * Create an instance of {@link JourneyPatternRefStructure }
     */
    public JourneyPatternRefStructure createJourneyPatternRefStructure() {
        return new JourneyPatternRefStructure();
    }

    /**
     * Create an instance of {@link LineRefStructure }
     */
    public LineRefStructure createLineRefStructure() {
        return new LineRefStructure();
    }

    /**
     * Create an instance of {@link VehicleRefStructure }
     */
    public VehicleRefStructure createVehicleRefStructure() {
        return new VehicleRefStructure();
    }

    /**
     * Create an instance of {@link SiteRefStructure }
     */
    public SiteRefStructure createSiteRefStructure() {
        return new SiteRefStructure();
    }

    /**
     * Create an instance of {@link VehicleJourneyRefStructure }
     */
    public VehicleJourneyRefStructure createVehicleJourneyRefStructure() {
        return new VehicleJourneyRefStructure();
    }

    /**
     * Create an instance of {@link DatedVehicleJourneyRefStructure }
     */
    public DatedVehicleJourneyRefStructure createDatedVehicleJourneyRefStructure() {
        return new DatedVehicleJourneyRefStructure();
    }

    /**
     * Create an instance of {@link InterchangeRefStructure }
     */
    public InterchangeRefStructure createInterchangeRefStructure() {
        return new InterchangeRefStructure();
    }

    /**
     * Create an instance of {@link TrainElementRefStructure }
     */
    public TrainElementRefStructure createTrainElementRefStructure() {
        return new TrainElementRefStructure();
    }

    /**
     * Create an instance of {@link TrainComponentRefStructure }
     */
    public TrainComponentRefStructure createTrainComponentRefStructure() {
        return new TrainComponentRefStructure();
    }

    /**
     * Create an instance of {@link TrainRefStructure }
     */
    public TrainRefStructure createTrainRefStructure() {
        return new TrainRefStructure();
    }

    /**
     * Create an instance of {@link CompoundTrainRefStructure }
     */
    public CompoundTrainRefStructure createCompoundTrainRefStructure() {
        return new CompoundTrainRefStructure();
    }

    /**
     * Create an instance of {@link TrainInCompoundTrainRefStructure }
     */
    public TrainInCompoundTrainRefStructure createTrainInCompoundTrainRefStructure() {
        return new TrainInCompoundTrainRefStructure();
    }

    /**
     * Create an instance of {@link EntranceToVehicleRefStructure }
     */
    public EntranceToVehicleRefStructure createEntranceToVehicleRefStructure() {
        return new EntranceToVehicleRefStructure();
    }

    /**
     * Create an instance of {@link JourneyPlaceRefStructure }
     */
    public JourneyPlaceRefStructure createJourneyPlaceRefStructure() {
        return new JourneyPlaceRefStructure();
    }

    /**
     * Create an instance of {@link DestinationRefStructure }
     */
    public DestinationRefStructure createDestinationRefStructure() {
        return new DestinationRefStructure();
    }

    /**
     * Create an instance of {@link ProductCategoryStructure }
     */
    public ProductCategoryStructure createProductCategoryStructure() {
        return new ProductCategoryStructure();
    }

    /**
     * Create an instance of {@link ServiceFeatureStructure }
     */
    public ServiceFeatureStructure createServiceFeatureStructure() {
        return new ServiceFeatureStructure();
    }

    /**
     * Create an instance of {@link VehicleFeaturesStructure }
     */
    public VehicleFeaturesStructure createVehicleFeaturesStructure() {
        return new VehicleFeaturesStructure();
    }

    /**
     * Create an instance of {@link NaturalLanguagePlaceNameStructure }
     */
    public NaturalLanguagePlaceNameStructure createNaturalLanguagePlaceNameStructure() {
        return new NaturalLanguagePlaceNameStructure();
    }

    /**
     * Create an instance of {@link DirectionStructure }
     */
    public DirectionStructure createDirectionStructure() {
        return new DirectionStructure();
    }

    /**
     * Create an instance of {@link FlexibleAreaStructure }
     */
    public FlexibleAreaStructure createFlexibleAreaStructure() {
        return new FlexibleAreaStructure();
    }

    /**
     * Create an instance of {@link FlexibleAreaRefStructure }
     */
    public FlexibleAreaRefStructure createFlexibleAreaRefStructure() {
        return new FlexibleAreaRefStructure();
    }

    /**
     * Create an instance of {@link FormationAssignmentStructure }
     */
    public FormationAssignmentStructure createFormationAssignmentStructure() {
        return new FormationAssignmentStructure();
    }

    /**
     * Create an instance of {@link VehicleOrientationRelativeToQuay }
     */
    public VehicleOrientationRelativeToQuay createVehicleOrientationRelativeToQuay() {
        return new VehicleOrientationRelativeToQuay();
    }

    /**
     * Create an instance of {@link VehicleOccupancyStructure }
     */
    public VehicleOccupancyStructure createVehicleOccupancyStructure() {
        return new VehicleOccupancyStructure();
    }

    /**
     * Create an instance of {@link PassengerCapacityStructure }
     */
    public PassengerCapacityStructure createPassengerCapacityStructure() {
        return new PassengerCapacityStructure();
    }

    /**
     * Create an instance of {@link RelatedJourneyStructure }
     */
    public RelatedJourneyStructure createRelatedJourneyStructure() {
        return new RelatedJourneyStructure();
    }

    /**
     * Create an instance of {@link FormationConditionStructure }
     */
    public FormationConditionStructure createFormationConditionStructure() {
        return new FormationConditionStructure();
    }

    /**
     * Create an instance of {@link TrainElementStructure }
     */
    public TrainElementStructure createTrainElementStructure() {
        return new TrainElementStructure();
    }

    /**
     * Create an instance of {@link TrainComponentStructure }
     */
    public TrainComponentStructure createTrainComponentStructure() {
        return new TrainComponentStructure();
    }

    /**
     * Create an instance of {@link FacilityRefStructure }
     */
    public FacilityRefStructure createFacilityRefStructure() {
        return new FacilityRefStructure();
    }

    /**
     * Create an instance of {@link FacilityChangeStructure }
     */
    public FacilityChangeStructure createFacilityChangeStructure() {
        return new FacilityChangeStructure();
    }

    /**
     * Create an instance of {@link DatedCallStructure }
     */
    public DatedCallStructure createDatedCallStructure() {
        return new DatedCallStructure();
    }

    /**
     * Create an instance of {@link ConnectingJourneyRefStructure }
     */
    public ConnectingJourneyRefStructure createConnectingJourneyRefStructure() {
        return new ConnectingJourneyRefStructure();
    }

    /**
     * Create an instance of {@link PtSituationElementStructure }
     */
    public PtSituationElementStructure createPtSituationElementStructure() {
        return new PtSituationElementStructure();
    }

    /**
     * Create an instance of {@link PublishToWebActionStructure }
     */
    public PublishToWebActionStructure createPublishToWebActionStructure() {
        return new PublishToWebActionStructure();
    }

    /**
     * Create an instance of {@link PublishToMobileActionStructure }
     */
    public PublishToMobileActionStructure createPublishToMobileActionStructure() {
        return new PublishToMobileActionStructure();
    }

    /**
     * Create an instance of {@link PublishToDisplayActionStructure }
     */
    public PublishToDisplayActionStructure createPublishToDisplayActionStructure() {
        return new PublishToDisplayActionStructure();
    }

    /**
     * Create an instance of {@link PublishToAlertsActionStructure }
     */
    public PublishToAlertsActionStructure createPublishToAlertsActionStructure() {
        return new PublishToAlertsActionStructure();
    }

    /**
     * Create an instance of {@link PublishToTvActionStructure }
     */
    public PublishToTvActionStructure createPublishToTvActionStructure() {
        return new PublishToTvActionStructure();
    }

    /**
     * Create an instance of {@link ManualAction }
     */
    public ManualAction createManualAction() {
        return new ManualAction();
    }

    /**
     * Create an instance of {@link ManualActionStructure }
     */
    public ManualActionStructure createManualActionStructure() {
        return new ManualActionStructure();
    }

    /**
     * Create an instance of {@link ParameterisedActionStructure }
     */
    public ParameterisedActionStructure createParameterisedActionStructure() {
        return new ParameterisedActionStructure();
    }

    /**
     * Create an instance of {@link SimpleActionStructure }
     */
    public SimpleActionStructure createSimpleActionStructure() {
        return new SimpleActionStructure();
    }

    /**
     * Create an instance of {@link ClosedTimestampRangeStructure }
     */
    public ClosedTimestampRangeStructure createClosedTimestampRangeStructure() {
        return new ClosedTimestampRangeStructure();
    }

    /**
     * Create an instance of {@link NotifyBySmsActionStructure }
     */
    public NotifyBySmsActionStructure createNotifyBySmsActionStructure() {
        return new NotifyBySmsActionStructure();
    }

    /**
     * Create an instance of {@link NotifyByEmailActionStructure }
     */
    public NotifyByEmailActionStructure createNotifyByEmailActionStructure() {
        return new NotifyByEmailActionStructure();
    }

    /**
     * Create an instance of {@link NotifyByPagerActionStructure }
     */
    public NotifyByPagerActionStructure createNotifyByPagerActionStructure() {
        return new NotifyByPagerActionStructure();
    }

    /**
     * Create an instance of {@link NotifyUserActionStructure }
     */
    public NotifyUserActionStructure createNotifyUserActionStructure() {
        return new NotifyUserActionStructure();
    }

    /**
     * Create an instance of {@link PassengerInformationActionStructure }
     */
    public PassengerInformationActionStructure createPassengerInformationActionStructure() {
        return new PassengerInformationActionStructure();
    }

    /**
     * Create an instance of {@link CoordinatesStructure }
     */
    public CoordinatesStructure createCoordinatesStructure() {
        return new CoordinatesStructure();
    }

    /**
     * Create an instance of {@link LocationStructure }
     */
    public LocationStructure createLocationStructure() {
        return new LocationStructure();
    }

    /**
     * Create an instance of {@link BoundingBoxStructure }
     */
    public BoundingBoxStructure createBoundingBoxStructure() {
        return new BoundingBoxStructure();
    }

    /**
     * Create an instance of {@link LineShapeStructure }
     */
    public LineShapeStructure createLineShapeStructure() {
        return new LineShapeStructure();
    }

    /**
     * Create an instance of {@link CircularAreaStructure }
     */
    public CircularAreaStructure createCircularAreaStructure() {
        return new CircularAreaStructure();
    }

    /**
     * Create an instance of {@link VehicleFeatureRefStructure }
     */
    public VehicleFeatureRefStructure createVehicleFeatureRefStructure() {
        return new VehicleFeatureRefStructure();
    }

    /**
     * Create an instance of {@link KeyValueStructure }
     */
    public KeyValueStructure createKeyValueStructure() {
        return new KeyValueStructure();
    }

    /**
     * Create an instance of {@link ValuesStructure }
     */
    public ValuesStructure createValuesStructure() {
        return new ValuesStructure();
    }

    /**
     * Create an instance of {@link TypeOfValueRefStructure }
     */
    public TypeOfValueRefStructure createTypeOfValueRefStructure() {
        return new TypeOfValueRefStructure();
    }

    /**
     * Create an instance of {@link SubscriptionQualifierStructure }
     */
    public SubscriptionQualifierStructure createSubscriptionQualifierStructure() {
        return new SubscriptionQualifierStructure();
    }

    /**
     * Create an instance of {@link SubscriptionRefStructure }
     */
    public SubscriptionRefStructure createSubscriptionRefStructure() {
        return new SubscriptionRefStructure();
    }

    /**
     * Create an instance of {@link SubscriptionFilterStructure }
     */
    public SubscriptionFilterStructure createSubscriptionFilterStructure() {
        return new SubscriptionFilterStructure();
    }

    /**
     * Create an instance of {@link SubscriptionFilterRefStructure }
     */
    public SubscriptionFilterRefStructure createSubscriptionFilterRefStructure() {
        return new SubscriptionFilterRefStructure();
    }

    /**
     * Create an instance of {@link ItemRefStructure }
     */
    public ItemRefStructure createItemRefStructure() {
        return new ItemRefStructure();
    }

    /**
     * Create an instance of {@link CapabilityRefStructure }
     */
    public CapabilityRefStructure createCapabilityRefStructure() {
        return new CapabilityRefStructure();
    }

    /**
     * Create an instance of {@link ErrorDescriptionStructure }
     */
    public ErrorDescriptionStructure createErrorDescriptionStructure() {
        return new ErrorDescriptionStructure();
    }

    /**
     * Create an instance of {@link ConsumerRequestEndpointStructure }
     */
    public ConsumerRequestEndpointStructure createConsumerRequestEndpointStructure() {
        return new ConsumerRequestEndpointStructure();
    }

    /**
     * Create an instance of {@link ConsumerResponseEndpointStructure }
     */
    public ConsumerResponseEndpointStructure createConsumerResponseEndpointStructure() {
        return new ConsumerResponseEndpointStructure();
    }

    /**
     * Create an instance of {@link ResponseEndpointStructure }
     */
    public ResponseEndpointStructure createResponseEndpointStructure() {
        return new ResponseEndpointStructure();
    }

    /**
     * Create an instance of {@link ProducerResponseEndpointStructure }
     */
    public ProducerResponseEndpointStructure createProducerResponseEndpointStructure() {
        return new ProducerResponseEndpointStructure();
    }

    /**
     * Create an instance of {@link ServiceCapabilitiesRequestStructure }
     */
    public ServiceCapabilitiesRequestStructure createServiceCapabilitiesRequestStructure() {
        return new ServiceCapabilitiesRequestStructure();
    }

    /**
     * Create an instance of {@link AbstractCapabilitiesStructure }
     */
    public AbstractCapabilitiesStructure createAbstractCapabilitiesStructure() {
        return new AbstractCapabilitiesStructure();
    }

    /**
     * Create an instance of {@link CapabilityRequestPolicyStructure }
     */
    public CapabilityRequestPolicyStructure createCapabilityRequestPolicyStructure() {
        return new CapabilityRequestPolicyStructure();
    }

    /**
     * Create an instance of {@link CapabilitySubscriptionPolicyStructure }
     */
    public CapabilitySubscriptionPolicyStructure createCapabilitySubscriptionPolicyStructure() {
        return new CapabilitySubscriptionPolicyStructure();
    }

    /**
     * Create an instance of {@link TransportDescriptionStructure }
     */
    public TransportDescriptionStructure createTransportDescriptionStructure() {
        return new TransportDescriptionStructure();
    }

    /**
     * Create an instance of {@link DataNameSpacesStructure }
     */
    public DataNameSpacesStructure createDataNameSpacesStructure() {
        return new DataNameSpacesStructure();
    }

    /**
     * Create an instance of {@link SubscriptionResponseBodyStructure }
     */
    public SubscriptionResponseBodyStructure createSubscriptionResponseBodyStructure() {
        return new SubscriptionResponseBodyStructure();
    }

    /**
     * Create an instance of {@link TerminateSubscriptionRequestBodyStructure }
     */
    public TerminateSubscriptionRequestBodyStructure createTerminateSubscriptionRequestBodyStructure() {
        return new TerminateSubscriptionRequestBodyStructure();
    }

    /**
     * Create an instance of {@link DataSupplyRequestBodyStructure }
     */
    public DataSupplyRequestBodyStructure createDataSupplyRequestBodyStructure() {
        return new DataSupplyRequestBodyStructure();
    }

    /**
     * Create an instance of {@link SiriSchema }
     */
    public SiriSchema createSiriSchema() {
        return new SiriSchema();
    }

    /**
     * Create an instance of {@link ServiceDeliveryBodyStructure }
     */
    public ServiceDeliveryBodyStructure createServiceDeliveryBodyStructure() {
        return new ServiceDeliveryBodyStructure();
    }

    /**
     * Create an instance of {@link AllFacilitiesFeatureStructure }
     */
    public AllFacilitiesFeatureStructure createAllFacilitiesFeatureStructure() {
        return new AllFacilitiesFeatureStructure();
    }

    /**
     * Create an instance of {@link OrganisationRefStructure }
     */
    public OrganisationRefStructure createOrganisationRefStructure() {
        return new OrganisationRefStructure();
    }

    /**
     * Create an instance of {@link ClosedTimeRangeStructure }
     */
    public ClosedTimeRangeStructure createClosedTimeRangeStructure() {
        return new ClosedTimeRangeStructure();
    }

    /**
     * Create an instance of {@link HalfOpenTimeRangeStructure }
     */
    public HalfOpenTimeRangeStructure createHalfOpenTimeRangeStructure() {
        return new HalfOpenTimeRangeStructure();
    }

    /**
     * Create an instance of {@link HalfOpenTimestampInputRangeStructure }
     */
    public HalfOpenTimestampInputRangeStructure createHalfOpenTimestampInputRangeStructure() {
        return new HalfOpenTimestampInputRangeStructure();
    }

    /**
     * Create an instance of {@link HalfOpenTimestampOutputRangeStructure }
     */
    public HalfOpenTimestampOutputRangeStructure createHalfOpenTimestampOutputRangeStructure() {
        return new HalfOpenTimestampOutputRangeStructure();
    }

    /**
     * Create an instance of {@link SituationVersion }
     */
    public SituationVersion createSituationVersion() {
        return new SituationVersion();
    }

    /**
     * Create an instance of {@link SituationSharedRefStructure }
     */
    public SituationSharedRefStructure createSituationSharedRefStructure() {
        return new SituationSharedRefStructure();
    }

    /**
     * Create an instance of {@link VersionRefStructure }
     */
    public VersionRefStructure createVersionRefStructure() {
        return new VersionRefStructure();
    }

    /**
     * Create an instance of {@link ClearDownRefStructure }
     */
    public ClearDownRefStructure createClearDownRefStructure() {
        return new ClearDownRefStructure();
    }

    /**
     * Create an instance of {@link StopAreaRefStructure }
     */
    public StopAreaRefStructure createStopAreaRefStructure() {
        return new StopAreaRefStructure();
    }

    /**
     * Create an instance of {@link QuayRefStructure }
     */
    public QuayRefStructure createQuayRefStructure() {
        return new QuayRefStructure();
    }

    /**
     * Create an instance of {@link BoardingPositionRefStructure }
     */
    public BoardingPositionRefStructure createBoardingPositionRefStructure() {
        return new BoardingPositionRefStructure();
    }

    /**
     * Create an instance of {@link MonitoringRefStructure }
     */
    public MonitoringRefStructure createMonitoringRefStructure() {
        return new MonitoringRefStructure();
    }

    /**
     * Create an instance of {@link ModesStructure }
     */
    public ModesStructure createModesStructure() {
        return new ModesStructure();
    }

    /**
     * Create an instance of {@link LineDirectionStructure }
     */
    public LineDirectionStructure createLineDirectionStructure() {
        return new LineDirectionStructure();
    }

    /**
     * Create an instance of {@link GroupOfLinesRefStructure }
     */
    public GroupOfLinesRefStructure createGroupOfLinesRefStructure() {
        return new GroupOfLinesRefStructure();
    }

    /**
     * Create an instance of {@link RouteRefStructure }
     */
    public RouteRefStructure createRouteRefStructure() {
        return new RouteRefStructure();
    }

    /**
     * Create an instance of {@link DirectionRefStructure }
     */
    public DirectionRefStructure createDirectionRefStructure() {
        return new DirectionRefStructure();
    }

    /**
     * Create an instance of {@link RouteLinkRefStructure }
     */
    public RouteLinkRefStructure createRouteLinkRefStructure() {
        return new RouteLinkRefStructure();
    }

    /**
     * Create an instance of {@link PlaceNameStructure }
     */
    public PlaceNameStructure createPlaceNameStructure() {
        return new PlaceNameStructure();
    }

    /**
     * Create an instance of {@link DriverRefStructure }
     */
    public DriverRefStructure createDriverRefStructure() {
        return new DriverRefStructure();
    }

    /**
     * Create an instance of {@link NoteStructure }
     */
    public NoteStructure createNoteStructure() {
        return new NoteStructure();
    }

    /**
     * Create an instance of {@link InfoChannelRefStructure }
     */
    public InfoChannelRefStructure createInfoChannelRefStructure() {
        return new InfoChannelRefStructure();
    }

    /**
     * Create an instance of {@link BrandingRefStructure }
     */
    public BrandingRefStructure createBrandingRefStructure() {
        return new BrandingRefStructure();
    }

    /**
     * Create an instance of {@link BrandingStructure }
     */
    public BrandingStructure createBrandingStructure() {
        return new BrandingStructure();
    }

    /**
     * Create an instance of {@link DatedVehicleJourneyIndirectRefStructure }
     */
    public DatedVehicleJourneyIndirectRefStructure createDatedVehicleJourneyIndirectRefStructure() {
        return new DatedVehicleJourneyIndirectRefStructure();
    }

    /**
     * Create an instance of {@link FramedVehicleJourneyRefStructure }
     */
    public FramedVehicleJourneyRefStructure createFramedVehicleJourneyRefStructure() {
        return new FramedVehicleJourneyRefStructure();
    }

    /**
     * Create an instance of {@link DataFrameRefStructure }
     */
    public DataFrameRefStructure createDataFrameRefStructure() {
        return new DataFrameRefStructure();
    }

    /**
     * Create an instance of {@link TrainPartRefStructure }
     */
    public TrainPartRefStructure createTrainPartRefStructure() {
        return new TrainPartRefStructure();
    }

    /**
     * Create an instance of {@link BlockRefStructure }
     */
    public BlockRefStructure createBlockRefStructure() {
        return new BlockRefStructure();
    }

    /**
     * Create an instance of {@link CourseOfJourneyRefStructure }
     */
    public CourseOfJourneyRefStructure createCourseOfJourneyRefStructure() {
        return new CourseOfJourneyRefStructure();
    }

    /**
     * Create an instance of {@link JourneyPartRefStructure }
     */
    public JourneyPartRefStructure createJourneyPartRefStructure() {
        return new JourneyPartRefStructure();
    }

    /**
     * Create an instance of {@link TrainNumberRefStructure }
     */
    public TrainNumberRefStructure createTrainNumberRefStructure() {
        return new TrainNumberRefStructure();
    }

    /**
     * Create an instance of {@link JourneyPartInfoStructure }
     */
    public JourneyPartInfoStructure createJourneyPartInfoStructure() {
        return new JourneyPartInfoStructure();
    }

    /**
     * Create an instance of {@link DatedJourneyPartInfoStructure }
     */
    public DatedJourneyPartInfoStructure createDatedJourneyPartInfoStructure() {
        return new DatedJourneyPartInfoStructure();
    }

    /**
     * Create an instance of {@link TrainBlockPartStructure }
     */
    public TrainBlockPartStructure createTrainBlockPartStructure() {
        return new TrainBlockPartStructure();
    }

    /**
     * Create an instance of {@link PreviousCallsStructure }
     */
    public PreviousCallsStructure createPreviousCallsStructure() {
        return new PreviousCallsStructure();
    }

    /**
     * Create an instance of {@link PreviousCallStructure }
     */
    public PreviousCallStructure createPreviousCallStructure() {
        return new PreviousCallStructure();
    }

    /**
     * Create an instance of {@link MonitoredCallStructure }
     */
    public MonitoredCallStructure createMonitoredCallStructure() {
        return new MonitoredCallStructure();
    }

    /**
     * Create an instance of {@link SimpleContactStructure }
     */
    public SimpleContactStructure createSimpleContactStructure() {
        return new SimpleContactStructure();
    }

    /**
     * Create an instance of {@link ViaNameStructure }
     */
    public ViaNameStructure createViaNameStructure() {
        return new ViaNameStructure();
    }

    /**
     * Create an instance of {@link DestinationStructure }
     */
    public DestinationStructure createDestinationStructure() {
        return new DestinationStructure();
    }

    /**
     * Create an instance of {@link ProgressBetweenStopsStructure }
     */
    public ProgressBetweenStopsStructure createProgressBetweenStopsStructure() {
        return new ProgressBetweenStopsStructure();
    }

    /**
     * Create an instance of {@link AbstractCallStructure }
     */
    public AbstractCallStructure createAbstractCallStructure() {
        return new AbstractCallStructure();
    }

    /**
     * Create an instance of {@link AbstractMonitoredCallStructure }
     */
    public AbstractMonitoredCallStructure createAbstractMonitoredCallStructure() {
        return new AbstractMonitoredCallStructure();
    }

    /**
     * Create an instance of {@link OnwardCallsStructure }
     */
    public OnwardCallsStructure createOnwardCallsStructure() {
        return new OnwardCallsStructure();
    }

    /**
     * Create an instance of {@link OnwardCallStructure }
     */
    public OnwardCallStructure createOnwardCallStructure() {
        return new OnwardCallStructure();
    }

    /**
     * Create an instance of {@link PredictionQualityStructure }
     */
    public PredictionQualityStructure createPredictionQualityStructure() {
        return new PredictionQualityStructure();
    }

    /**
     * Create an instance of {@link StopAssignmentStructure }
     */
    public StopAssignmentStructure createStopAssignmentStructure() {
        return new StopAssignmentStructure();
    }

    /**
     * Create an instance of {@link PlannedStopAssignmentStructure }
     */
    public PlannedStopAssignmentStructure createPlannedStopAssignmentStructure() {
        return new PlannedStopAssignmentStructure();
    }

    /**
     * Create an instance of {@link JourneyRelationsStructure }
     */
    public JourneyRelationsStructure createJourneyRelationsStructure() {
        return new JourneyRelationsStructure();
    }

    /**
     * Create an instance of {@link RelatedCallStructure }
     */
    public RelatedCallStructure createRelatedCallStructure() {
        return new RelatedCallStructure();
    }

    /**
     * Create an instance of {@link RelatedJourneyPartStructure }
     */
    public RelatedJourneyPartStructure createRelatedJourneyPartStructure() {
        return new RelatedJourneyPartStructure();
    }

    /**
     * Create an instance of {@link FormationStatusStructure }
     */
    public FormationStatusStructure createFormationStatusStructure() {
        return new FormationStatusStructure();
    }

    /**
     * Create an instance of {@link VehicleInFormationStatusStructure }
     */
    public VehicleInFormationStatusStructure createVehicleInFormationStatusStructure() {
        return new VehicleInFormationStatusStructure();
    }

    /**
     * Create an instance of {@link RecommendedActionStructure }
     */
    public RecommendedActionStructure createRecommendedActionStructure() {
        return new RecommendedActionStructure();
    }

    /**
     * Create an instance of {@link GroupReservationStructure }
     */
    public GroupReservationStructure createGroupReservationStructure() {
        return new GroupReservationStructure();
    }

    /**
     * Create an instance of {@link PassageBetweenTrainsStructure }
     */
    public PassageBetweenTrainsStructure createPassageBetweenTrainsStructure() {
        return new PassageBetweenTrainsStructure();
    }

    /**
     * Create an instance of {@link AnnotatedFacilityStructure }
     */
    public AnnotatedFacilityStructure createAnnotatedFacilityStructure() {
        return new AnnotatedFacilityStructure();
    }

    /**
     * Create an instance of {@link FacilityStatusStructure }
     */
    public FacilityStatusStructure createFacilityStatusStructure() {
        return new FacilityStatusStructure();
    }

    /**
     * Create an instance of {@link FacilityLocationStructure }
     */
    public FacilityLocationStructure createFacilityLocationStructure() {
        return new FacilityLocationStructure();
    }

    /**
     * Create an instance of {@link RemedyStructure }
     */
    public RemedyStructure createRemedyStructure() {
        return new RemedyStructure();
    }

    /**
     * Create an instance of {@link MonitoringInformationStructure }
     */
    public MonitoringInformationStructure createMonitoringInformationStructure() {
        return new MonitoringInformationStructure();
    }

    /**
     * Create an instance of {@link MonitoringValidityConditionStructure }
     */
    public MonitoringValidityConditionStructure createMonitoringValidityConditionStructure() {
        return new MonitoringValidityConditionStructure();
    }

    /**
     * Create an instance of {@link MobilityDisruptionStructure }
     */
    public MobilityDisruptionStructure createMobilityDisruptionStructure() {
        return new MobilityDisruptionStructure();
    }

    /**
     * Create an instance of {@link TypeOfVehicleFuelStructure }
     */
    public TypeOfVehicleFuelStructure createTypeOfVehicleFuelStructure() {
        return new TypeOfVehicleFuelStructure();
    }

    /**
     * Create an instance of {@link FromServiceJourneyInterchangeStructure }
     */
    public FromServiceJourneyInterchangeStructure createFromServiceJourneyInterchangeStructure() {
        return new FromServiceJourneyInterchangeStructure();
    }

    /**
     * Create an instance of {@link ToServiceJourneyInterchangeStructure }
     */
    public ToServiceJourneyInterchangeStructure createToServiceJourneyInterchangeStructure() {
        return new ToServiceJourneyInterchangeStructure();
    }

    /**
     * Create an instance of {@link ServiceJourneyInterchangeStructure }
     */
    public ServiceJourneyInterchangeStructure createServiceJourneyInterchangeStructure() {
        return new ServiceJourneyInterchangeStructure();
    }

    /**
     * Create an instance of {@link RemovedServiceJourneyInterchangeStructure }
     */
    public RemovedServiceJourneyInterchangeStructure createRemovedServiceJourneyInterchangeStructure() {
        return new RemovedServiceJourneyInterchangeStructure();
    }

    /**
     * Create an instance of {@link TargetedInterchangeStructure }
     */
    public TargetedInterchangeStructure createTargetedInterchangeStructure() {
        return new TargetedInterchangeStructure();
    }

    /**
     * Create an instance of {@link ContextualisedConnectionLinkStructure }
     */
    public ContextualisedConnectionLinkStructure createContextualisedConnectionLinkStructure() {
        return new ContextualisedConnectionLinkStructure();
    }

    /**
     * Create an instance of {@link ZoneRefStructure }
     */
    public ZoneRefStructure createZoneRefStructure() {
        return new ZoneRefStructure();
    }

    /**
     * Create an instance of {@link AffectedConnectionLinkStructure }
     */
    public AffectedConnectionLinkStructure createAffectedConnectionLinkStructure() {
        return new AffectedConnectionLinkStructure();
    }

    /**
     * Create an instance of {@link AffectedPathLinkStructure }
     */
    public AffectedPathLinkStructure createAffectedPathLinkStructure() {
        return new AffectedPathLinkStructure();
    }

    /**
     * Create an instance of {@link AffectedInterchangeStructure }
     */
    public AffectedInterchangeStructure createAffectedInterchangeStructure() {
        return new AffectedInterchangeStructure();
    }

    /**
     * Create an instance of {@link NetworkRefStructure }
     */
    public NetworkRefStructure createNetworkRefStructure() {
        return new NetworkRefStructure();
    }

    /**
     * Create an instance of {@link OperationalUnitRefStructure }
     */
    public OperationalUnitRefStructure createOperationalUnitRefStructure() {
        return new OperationalUnitRefStructure();
    }

    /**
     * Create an instance of {@link AffectedOperatorStructure }
     */
    public AffectedOperatorStructure createAffectedOperatorStructure() {
        return new AffectedOperatorStructure();
    }

    /**
     * Create an instance of {@link NetworkStructure }
     */
    public NetworkStructure createNetworkStructure() {
        return new NetworkStructure();
    }

    /**
     * Create an instance of {@link SectionRefStructure }
     */
    public SectionRefStructure createSectionRefStructure() {
        return new SectionRefStructure();
    }

    /**
     * Create an instance of {@link AdviceRefStructure }
     */
    public AdviceRefStructure createAdviceRefStructure() {
        return new AdviceRefStructure();
    }

    /**
     * Create an instance of {@link OffsetStructure }
     */
    public OffsetStructure createOffsetStructure() {
        return new OffsetStructure();
    }

    /**
     * Create an instance of {@link AffectedNetworkStructure }
     */
    public AffectedNetworkStructure createAffectedNetworkStructure() {
        return new AffectedNetworkStructure();
    }

    /**
     * Create an instance of {@link AffectedVehicleStructure }
     */
    public AffectedVehicleStructure createAffectedVehicleStructure() {
        return new AffectedVehicleStructure();
    }

    /**
     * Create an instance of {@link AffectedFacilityStructure }
     */
    public AffectedFacilityStructure createAffectedFacilityStructure() {
        return new AffectedFacilityStructure();
    }

    /**
     * Create an instance of {@link AffectedPlaceStructure }
     */
    public AffectedPlaceStructure createAffectedPlaceStructure() {
        return new AffectedPlaceStructure();
    }

    /**
     * Create an instance of {@link AffectedStopPlaceElementStructure }
     */
    public AffectedStopPlaceElementStructure createAffectedStopPlaceElementStructure() {
        return new AffectedStopPlaceElementStructure();
    }

    /**
     * Create an instance of {@link CasualtiesStructure }
     */
    public CasualtiesStructure createCasualtiesStructure() {
        return new CasualtiesStructure();
    }

    /**
     * Create an instance of {@link AbstractSituationElementStructure }
     */
    public AbstractSituationElementStructure createAbstractSituationElementStructure() {
        return new AbstractSituationElementStructure();
    }

    /**
     * Create an instance of {@link SituationElementStructure }
     */
    public SituationElementStructure createSituationElementStructure() {
        return new SituationElementStructure();
    }

    /**
     * Create an instance of {@link ReferencesStructure }
     */
    public ReferencesStructure createReferencesStructure() {
        return new ReferencesStructure();
    }

    /**
     * Create an instance of {@link RelatedSituationStructure }
     */
    public RelatedSituationStructure createRelatedSituationStructure() {
        return new RelatedSituationStructure();
    }

    /**
     * Create an instance of {@link AffectedRoadStructure }
     */
    public AffectedRoadStructure createAffectedRoadStructure() {
        return new AffectedRoadStructure();
    }

    /**
     * Create an instance of {@link SituationSourceStructure }
     */
    public SituationSourceStructure createSituationSourceStructure() {
        return new SituationSourceStructure();
    }

    /**
     * Create an instance of {@link AffectedRoadsStructure }
     */
    public AffectedRoadsStructure createAffectedRoadsStructure() {
        return new AffectedRoadsStructure();
    }

    /**
     * Create an instance of {@link ImageStructure }
     */
    public ImageStructure createImageStructure() {
        return new ImageStructure();
    }

    /**
     * Create an instance of {@link DefaultedTextStructure }
     */
    public DefaultedTextStructure createDefaultedTextStructure() {
        return new DefaultedTextStructure();
    }

    /**
     * Create an instance of {@link InfoLinkStructure }
     */
    public InfoLinkStructure createInfoLinkStructure() {
        return new InfoLinkStructure();
    }

    /**
     * Create an instance of {@link PtConsequencesStructure }
     */
    public PtConsequencesStructure createPtConsequencesStructure() {
        return new PtConsequencesStructure();
    }

    /**
     * Create an instance of {@link BoardingStructure }
     */
    public BoardingStructure createBoardingStructure() {
        return new BoardingStructure();
    }

    /**
     * Create an instance of {@link PtAdviceStructure }
     */
    public PtAdviceStructure createPtAdviceStructure() {
        return new PtAdviceStructure();
    }

    /**
     * Create an instance of {@link BlockingStructure }
     */
    public BlockingStructure createBlockingStructure() {
        return new BlockingStructure();
    }

    /**
     * Create an instance of {@link EasementsStructure }
     */
    public EasementsStructure createEasementsStructure() {
        return new EasementsStructure();
    }

    /**
     * Create an instance of {@link DelaysStructure }
     */
    public DelaysStructure createDelaysStructure() {
        return new DelaysStructure();
    }

    /**
     * Create an instance of {@link ActionsStructure }
     */
    public ActionsStructure createActionsStructure() {
        return new ActionsStructure();
    }

    /**
     * Create an instance of {@link DescriptionContentStructure }
     */
    public DescriptionContentStructure createDescriptionContentStructure() {
        return new DescriptionContentStructure();
    }

    /**
     * Create an instance of {@link ConsequenceContentStructure }
     */
    public ConsequenceContentStructure createConsequenceContentStructure() {
        return new ConsequenceContentStructure();
    }

    /**
     * Create an instance of {@link DurationContentStructure }
     */
    public DurationContentStructure createDurationContentStructure() {
        return new DurationContentStructure();
    }

    /**
     * Create an instance of {@link ReasonContentStructure }
     */
    public ReasonContentStructure createReasonContentStructure() {
        return new ReasonContentStructure();
    }

    /**
     * Create an instance of {@link RecommendationContentStructure }
     */
    public RecommendationContentStructure createRecommendationContentStructure() {
        return new RecommendationContentStructure();
    }

    /**
     * Create an instance of {@link RemarkContentStructure }
     */
    public RemarkContentStructure createRemarkContentStructure() {
        return new RemarkContentStructure();
    }

    /**
     * Create an instance of {@link SummaryContentStructure }
     */
    public SummaryContentStructure createSummaryContentStructure() {
        return new SummaryContentStructure();
    }

    /**
     * Create an instance of {@link TextualContentStructure }
     */
    public TextualContentStructure createTextualContentStructure() {
        return new TextualContentStructure();
    }

    /**
     * Create an instance of {@link PublishingActionStructure.PublishAtScope }
     */
    public PublishingActionStructure.PublishAtScope createPublishingActionStructurePublishAtScope() {
        return new PublishingActionStructure.PublishAtScope();
    }

    /**
     * Create an instance of {@link PushedActionStructure.BeforeNotices }
     */
    public PushedActionStructure.BeforeNotices createPushedActionStructureBeforeNotices() {
        return new PushedActionStructure.BeforeNotices();
    }

    /**
     * Create an instance of {@link PtConsequenceStructure.Suitabilities }
     */
    public PtConsequenceStructure.Suitabilities createPtConsequenceStructureSuitabilities() {
        return new PtConsequenceStructure.Suitabilities();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure.Operators }
     */
    public AffectsScopeStructure.Operators createAffectsScopeStructureOperators() {
        return new AffectsScopeStructure.Operators();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure.StopPoints }
     */
    public AffectsScopeStructure.StopPoints createAffectsScopeStructureStopPoints() {
        return new AffectsScopeStructure.StopPoints();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure.StopPlaces }
     */
    public AffectsScopeStructure.StopPlaces createAffectsScopeStructureStopPlaces() {
        return new AffectsScopeStructure.StopPlaces();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure.Places }
     */
    public AffectsScopeStructure.Places createAffectsScopeStructurePlaces() {
        return new AffectsScopeStructure.Places();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure.VehicleJourneys }
     */
    public AffectsScopeStructure.VehicleJourneys createAffectsScopeStructureVehicleJourneys() {
        return new AffectsScopeStructure.VehicleJourneys();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure.Vehicles }
     */
    public AffectsScopeStructure.Vehicles createAffectsScopeStructureVehicles() {
        return new AffectsScopeStructure.Vehicles();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure.Networks.AffectedNetwork }
     */
    public AffectsScopeStructure.Networks.AffectedNetwork createAffectsScopeStructureNetworksAffectedNetwork() {
        return new AffectsScopeStructure.Networks.AffectedNetwork();
    }

    /**
     * Create an instance of {@link AffectedStopPlaceComponentStructure.AffectedFacilities }
     */
    public AffectedStopPlaceComponentStructure.AffectedFacilities createAffectedStopPlaceComponentStructureAffectedFacilities() {
        return new AffectedStopPlaceComponentStructure.AffectedFacilities();
    }

    /**
     * Create an instance of {@link AffectedStopPlaceStructure.AffectedFacilities }
     */
    public AffectedStopPlaceStructure.AffectedFacilities createAffectedStopPlaceStructureAffectedFacilities() {
        return new AffectedStopPlaceStructure.AffectedFacilities();
    }

    /**
     * Create an instance of {@link AffectedStopPlaceStructure.AffectedComponents }
     */
    public AffectedStopPlaceStructure.AffectedComponents createAffectedStopPlaceStructureAffectedComponents() {
        return new AffectedStopPlaceStructure.AffectedComponents();
    }

    /**
     * Create an instance of {@link AffectedStopPlaceStructure.AffectedNavigationPaths }
     */
    public AffectedStopPlaceStructure.AffectedNavigationPaths createAffectedStopPlaceStructureAffectedNavigationPaths() {
        return new AffectedStopPlaceStructure.AffectedNavigationPaths();
    }

    /**
     * Create an instance of {@link AffectedStopPlaceStructure.Lines }
     */
    public AffectedStopPlaceStructure.Lines createAffectedStopPlaceStructureLines() {
        return new AffectedStopPlaceStructure.Lines();
    }

    /**
     * Create an instance of {@link AffectedStopPointStructure.ConnectionLinks }
     */
    public AffectedStopPointStructure.ConnectionLinks createAffectedStopPointStructureConnectionLinks() {
        return new AffectedStopPointStructure.ConnectionLinks();
    }

    /**
     * Create an instance of {@link AffectedStopPointStructure.Lines }
     */
    public AffectedStopPointStructure.Lines createAffectedStopPointStructureLines() {
        return new AffectedStopPointStructure.Lines();
    }

    /**
     * Create an instance of {@link AffectedCallStructure.AffectedInterchanges }
     */
    public AffectedCallStructure.AffectedInterchanges createAffectedCallStructureAffectedInterchanges() {
        return new AffectedCallStructure.AffectedInterchanges();
    }

    /**
     * Create an instance of {@link AffectedVehicleJourneyStructure.TrainNumbers }
     */
    public AffectedVehicleJourneyStructure.TrainNumbers createAffectedVehicleJourneyStructureTrainNumbers() {
        return new AffectedVehicleJourneyStructure.TrainNumbers();
    }

    /**
     * Create an instance of {@link AffectedVehicleJourneyStructure.JourneyParts }
     */
    public AffectedVehicleJourneyStructure.JourneyParts createAffectedVehicleJourneyStructureJourneyParts() {
        return new AffectedVehicleJourneyStructure.JourneyParts();
    }

    /**
     * Create an instance of {@link AffectedVehicleJourneyStructure.Calls }
     */
    public AffectedVehicleJourneyStructure.Calls createAffectedVehicleJourneyStructureCalls() {
        return new AffectedVehicleJourneyStructure.Calls();
    }

    /**
     * Create an instance of {@link AffectedVehicleJourneyStructure.Facilities }
     */
    public AffectedVehicleJourneyStructure.Facilities createAffectedVehicleJourneyStructureFacilities() {
        return new AffectedVehicleJourneyStructure.Facilities();
    }

    /**
     * Create an instance of {@link AffectedRouteStructure.Sections }
     */
    public AffectedRouteStructure.Sections createAffectedRouteStructureSections() {
        return new AffectedRouteStructure.Sections();
    }

    /**
     * Create an instance of {@link AffectedRouteStructure.StopPoints }
     */
    public AffectedRouteStructure.StopPoints createAffectedRouteStructureStopPoints() {
        return new AffectedRouteStructure.StopPoints();
    }

    /**
     * Create an instance of {@link AffectedRouteStructure.RouteLinks }
     */
    public AffectedRouteStructure.RouteLinks createAffectedRouteStructureRouteLinks() {
        return new AffectedRouteStructure.RouteLinks();
    }

    /**
     * Create an instance of {@link AffectedSectionStructure.IndirectSectionRef }
     */
    public AffectedSectionStructure.IndirectSectionRef createAffectedSectionStructureIndirectSectionRef() {
        return new AffectedSectionStructure.IndirectSectionRef();
    }

    /**
     * Create an instance of {@link AffectedLineStructure.Routes }
     */
    public AffectedLineStructure.Routes createAffectedLineStructureRoutes() {
        return new AffectedLineStructure.Routes();
    }

    /**
     * Create an instance of {@link AffectedLineStructure.Sections }
     */
    public AffectedLineStructure.Sections createAffectedLineStructureSections() {
        return new AffectedLineStructure.Sections();
    }

    /**
     * Create an instance of {@link AffectedLineStructure.StopPoints }
     */
    public AffectedLineStructure.StopPoints createAffectedLineStructureStopPoints() {
        return new AffectedLineStructure.StopPoints();
    }

    /**
     * Create an instance of {@link AffectedLineStructure.StopPlaces }
     */
    public AffectedLineStructure.StopPlaces createAffectedLineStructureStopPlaces() {
        return new AffectedLineStructure.StopPlaces();
    }

    /**
     * Create an instance of {@link AffectedModesStructure.Mode }
     */
    public AffectedModesStructure.Mode createAffectedModesStructureMode() {
        return new AffectedModesStructure.Mode();
    }

    /**
     * Create an instance of {@link RemovedDatedVehicleJourneyStructure.TrainNumbers }
     */
    public RemovedDatedVehicleJourneyStructure.TrainNumbers createRemovedDatedVehicleJourneyStructureTrainNumbers() {
        return new RemovedDatedVehicleJourneyStructure.TrainNumbers();
    }

    /**
     * Create an instance of {@link EquipmentAvailabilityStructure.EquipmentFeatures }
     */
    public EquipmentAvailabilityStructure.EquipmentFeatures createEquipmentAvailabilityStructureEquipmentFeatures() {
        return new EquipmentAvailabilityStructure.EquipmentFeatures();
    }

    /**
     * Create an instance of {@link MonitoredCountingStructure.CountedItemsIdList }
     */
    public MonitoredCountingStructure.CountedItemsIdList createMonitoredCountingStructureCountedItemsIdList() {
        return new MonitoredCountingStructure.CountedItemsIdList();
    }

    /**
     * Create an instance of {@link FacilityStructure.Features }
     */
    public FacilityStructure.Features createFacilityStructureFeatures() {
        return new FacilityStructure.Features();
    }

    /**
     * Create an instance of {@link FacilityStructure.Limitations }
     */
    public FacilityStructure.Limitations createFacilityStructureLimitations() {
        return new FacilityStructure.Limitations();
    }

    /**
     * Create an instance of {@link FacilityStructure.Suitabilities }
     */
    public FacilityStructure.Suitabilities createFacilityStructureSuitabilities() {
        return new FacilityStructure.Suitabilities();
    }

    /**
     * Create an instance of {@link JourneyRelationStructure.JourneyParts }
     */
    public JourneyRelationStructure.JourneyParts createJourneyRelationStructureJourneyParts() {
        return new JourneyRelationStructure.JourneyParts();
    }

    /**
     * Create an instance of {@link MonitoredVehicleJourneyStructure.TrainNumbers }
     */
    public MonitoredVehicleJourneyStructure.TrainNumbers createMonitoredVehicleJourneyStructureTrainNumbers() {
        return new MonitoredVehicleJourneyStructure.TrainNumbers();
    }

    /**
     * Create an instance of {@link MonitoredVehicleJourneyStructure.JourneyParts }
     */
    public MonitoredVehicleJourneyStructure.JourneyParts createMonitoredVehicleJourneyStructureJourneyParts() {
        return new MonitoredVehicleJourneyStructure.JourneyParts();
    }

    /**
     * Create an instance of {@link MonitoredVehicleJourneyStructure.TrainElements }
     */
    public MonitoredVehicleJourneyStructure.TrainElements createMonitoredVehicleJourneyStructureTrainElements() {
        return new MonitoredVehicleJourneyStructure.TrainElements();
    }

    /**
     * Create an instance of {@link MonitoredVehicleJourneyStructure.Trains }
     */
    public MonitoredVehicleJourneyStructure.Trains createMonitoredVehicleJourneyStructureTrains() {
        return new MonitoredVehicleJourneyStructure.Trains();
    }

    /**
     * Create an instance of {@link MonitoredVehicleJourneyStructure.CompoundTrains }
     */
    public MonitoredVehicleJourneyStructure.CompoundTrains createMonitoredVehicleJourneyStructureCompoundTrains() {
        return new MonitoredVehicleJourneyStructure.CompoundTrains();
    }

    /**
     * Create an instance of {@link CheckStatusResponseBodyStructure.ErrorCondition }
     */
    public CheckStatusResponseBodyStructure.ErrorCondition createCheckStatusResponseBodyStructureErrorCondition() {
        return new CheckStatusResponseBodyStructure.ErrorCondition();
    }

    /**
     * Create an instance of {@link TerminationResponseStatusStructure.ErrorCondition }
     */
    public TerminationResponseStatusStructure.ErrorCondition createTerminationResponseStatusStructureErrorCondition() {
        return new TerminationResponseStatusStructure.ErrorCondition();
    }

    /**
     * Create an instance of {@link CapabilityGeneralInteractionStructure.Interaction }
     */
    public CapabilityGeneralInteractionStructure.Interaction createCapabilityGeneralInteractionStructureInteraction() {
        return new CapabilityGeneralInteractionStructure.Interaction();
    }

    /**
     * Create an instance of {@link CapabilityGeneralInteractionStructure.Delivery }
     */
    public CapabilityGeneralInteractionStructure.Delivery createCapabilityGeneralInteractionStructureDelivery() {
        return new CapabilityGeneralInteractionStructure.Delivery();
    }

    /**
     * Create an instance of {@link ActionDataStructure.PublishAtScope }
     */
    public ActionDataStructure.PublishAtScope createActionDataStructurePublishAtScope() {
        return new ActionDataStructure.PublishAtScope();
    }

    /**
     * Create an instance of {@link RoadSituationElementStructure.Repetitions }
     */
    public RoadSituationElementStructure.Repetitions createRoadSituationElementStructureRepetitions() {
        return new RoadSituationElementStructure.Repetitions();
    }

    /**
     * Create an instance of {@link RoadSituationElementStructure.InfoLinks }
     */
    public RoadSituationElementStructure.InfoLinks createRoadSituationElementStructureInfoLinks() {
        return new RoadSituationElementStructure.InfoLinks();
    }

    /**
     * Create an instance of {@link RoadSituationElementStructure.Images.Image }
     */
    public RoadSituationElementStructure.Images.Image createRoadSituationElementStructureImagesImage() {
        return new RoadSituationElementStructure.Images.Image();
    }

    /**
     * Create an instance of {@link RoadSituationElementStructure.SecondaryReasons.Reason }
     */
    public RoadSituationElementStructure.SecondaryReasons.Reason createRoadSituationElementStructureSecondaryReasonsReason() {
        return new RoadSituationElementStructure.SecondaryReasons.Reason();
    }

    /**
     * Create an instance of {@link DatedVehicleJourneyStructure.TrainNumbers }
     */
    public DatedVehicleJourneyStructure.TrainNumbers createDatedVehicleJourneyStructureTrainNumbers() {
        return new DatedVehicleJourneyStructure.TrainNumbers();
    }

    /**
     * Create an instance of {@link DatedVehicleJourneyStructure.JourneyParts }
     */
    public DatedVehicleJourneyStructure.JourneyParts createDatedVehicleJourneyStructureJourneyParts() {
        return new DatedVehicleJourneyStructure.JourneyParts();
    }

    /**
     * Create an instance of {@link DatedVehicleJourneyStructure.DatedCalls }
     */
    public DatedVehicleJourneyStructure.DatedCalls createDatedVehicleJourneyStructureDatedCalls() {
        return new DatedVehicleJourneyStructure.DatedCalls();
    }

    /**
     * Create an instance of {@link FacilityConditionStructure.MonitoredCounting }
     */
    public FacilityConditionStructure.MonitoredCounting createFacilityConditionStructureMonitoredCounting() {
        return new FacilityConditionStructure.MonitoredCounting();
    }

    /**
     * Create an instance of {@link TrainInCompoundTrainStructure.Passages }
     */
    public TrainInCompoundTrainStructure.Passages createTrainInCompoundTrainStructurePassages() {
        return new TrainInCompoundTrainStructure.Passages();
    }

    /**
     * Create an instance of {@link CompoundTrainStructure.MaximumPassengerCapacities }
     */
    public CompoundTrainStructure.MaximumPassengerCapacities createCompoundTrainStructureMaximumPassengerCapacities() {
        return new CompoundTrainStructure.MaximumPassengerCapacities();
    }

    /**
     * Create an instance of {@link CompoundTrainStructure.Facilities }
     */
    public CompoundTrainStructure.Facilities createCompoundTrainStructureFacilities() {
        return new CompoundTrainStructure.Facilities();
    }

    /**
     * Create an instance of {@link CompoundTrainStructure.TrainsInCompoundTrain }
     */
    public CompoundTrainStructure.TrainsInCompoundTrain createCompoundTrainStructureTrainsInCompoundTrain() {
        return new CompoundTrainStructure.TrainsInCompoundTrain();
    }

    /**
     * Create an instance of {@link TrainStructure.TrainComponents }
     */
    public TrainStructure.TrainComponents createTrainStructureTrainComponents() {
        return new TrainStructure.TrainComponents();
    }

    /**
     * Create an instance of {@link DataReceivedResponseStructure.ErrorCondition }
     */
    public DataReceivedResponseStructure.ErrorCondition createDataReceivedResponseStructureErrorCondition() {
        return new DataReceivedResponseStructure.ErrorCondition();
    }

    /**
     * Create an instance of {@link DataReadyResponseStructure.ErrorCondition }
     */
    public DataReadyResponseStructure.ErrorCondition createDataReadyResponseStructureErrorCondition() {
        return new DataReadyResponseStructure.ErrorCondition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherErrorStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OtherErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "OtherError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<OtherErrorStructure> createOtherError(OtherErrorStructure value) {
        return new JAXBElement<OtherErrorStructure>(_OtherError_QNAME, OtherErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorCodeStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ErrorCodeStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ErrorCode")
    public JAXBElement<ErrorCodeStructure> createErrorCode(ErrorCodeStructure value) {
        return new JAXBElement<ErrorCodeStructure>(_ErrorCode_QNAME, ErrorCodeStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractFunctionalServiceRequestStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AbstractFunctionalServiceRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractFunctionalServiceRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractServiceRequest")
    public JAXBElement<AbstractFunctionalServiceRequestStructure> createAbstractFunctionalServiceRequest(AbstractFunctionalServiceRequestStructure value) {
        return new JAXBElement<AbstractFunctionalServiceRequestStructure>(_AbstractFunctionalServiceRequest_QNAME, AbstractFunctionalServiceRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractServiceRequestStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AbstractServiceRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractServiceRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractRequest")
    public JAXBElement<AbstractServiceRequestStructure> createAbstractServiceRequest(AbstractServiceRequestStructure value) {
        return new JAXBElement<AbstractServiceRequestStructure>(_AbstractServiceRequest_QNAME, AbstractServiceRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractRequestStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AbstractRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractRequest")
    public JAXBElement<AbstractRequestStructure> createAbstractRequest(AbstractRequestStructure value) {
        return new JAXBElement<AbstractRequestStructure>(_AbstractRequest_QNAME, AbstractRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractServiceDeliveryStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AbstractServiceDeliveryStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractFunctionalServiceDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<AbstractServiceDeliveryStructure> createAbstractFunctionalServiceDelivery(AbstractServiceDeliveryStructure value) {
        return new JAXBElement<AbstractServiceDeliveryStructure>(_AbstractFunctionalServiceDelivery_QNAME, AbstractServiceDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ResponseStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractResponse")
    public JAXBElement<ResponseStructure> createAbstractResponse(ResponseStructure value) {
        return new JAXBElement<ResponseStructure>(_AbstractResponse_QNAME, ResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractServiceCapabilitiesResponseStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AbstractServiceCapabilitiesResponseStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractFunctionalServiceCapabilitiesResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<AbstractServiceCapabilitiesResponseStructure> createAbstractFunctionalServiceCapabilitiesResponse(AbstractServiceCapabilitiesResponseStructure value) {
        return new JAXBElement<AbstractServiceCapabilitiesResponseStructure>(_AbstractFunctionalServiceCapabilitiesResponse_QNAME, AbstractServiceCapabilitiesResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionsStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ExtensionsStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Extensions")
    public JAXBElement<ExtensionsStructure> createExtensions(ExtensionsStructure value) {
        return new JAXBElement<ExtensionsStructure>(_Extensions_QNAME, ExtensionsStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SrsName")
    public JAXBElement<String> createSrsName(String value) {
        return new JAXBElement<String>(_SrsName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFeatureRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ServiceFeatureRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ServiceFeatureRef")
    public JAXBElement<ServiceFeatureRefStructure> createServiceFeatureRef(ServiceFeatureRefStructure value) {
        return new JAXBElement<ServiceFeatureRefStructure>(_ServiceFeatureRef_QNAME, ServiceFeatureRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FeatureRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FeatureRef")
    public JAXBElement<FeatureRefStructure> createFeatureRef(FeatureRefStructure value) {
        return new JAXBElement<FeatureRefStructure>(_FeatureRef_QNAME, FeatureRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleModesOfTransportEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link VehicleModesOfTransportEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleMode", defaultValue = "unknown")
    public JAXBElement<VehicleModesOfTransportEnumeration> createVehicleMode(VehicleModesOfTransportEnumeration value) {
        return new JAXBElement<VehicleModesOfTransportEnumeration>(_VehicleMode_QNAME, VehicleModesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RailSubmodesOfTransportEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RailSubmodesOfTransportEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RailSubmode", defaultValue = "unknown")
    public JAXBElement<RailSubmodesOfTransportEnumeration> createRailSubmode(RailSubmodesOfTransportEnumeration value) {
        return new JAXBElement<RailSubmodesOfTransportEnumeration>(_RailSubmode_QNAME, RailSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoachSubmodesOfTransportEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CoachSubmodesOfTransportEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CoachSubmode", defaultValue = "unknown")
    public JAXBElement<CoachSubmodesOfTransportEnumeration> createCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
        return new JAXBElement<CoachSubmodesOfTransportEnumeration>(_CoachSubmode_QNAME, CoachSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetroSubmodesOfTransportEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link MetroSubmodesOfTransportEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "MetroSubmode", defaultValue = "unknown")
    public JAXBElement<MetroSubmodesOfTransportEnumeration> createMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
        return new JAXBElement<MetroSubmodesOfTransportEnumeration>(_MetroSubmode_QNAME, MetroSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusSubmodesOfTransportEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BusSubmodesOfTransportEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "BusSubmode", defaultValue = "unknown")
    public JAXBElement<BusSubmodesOfTransportEnumeration> createBusSubmode(BusSubmodesOfTransportEnumeration value) {
        return new JAXBElement<BusSubmodesOfTransportEnumeration>(_BusSubmode_QNAME, BusSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TramSubmodesOfTransportEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TramSubmodesOfTransportEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TramSubmode", defaultValue = "unknown")
    public JAXBElement<TramSubmodesOfTransportEnumeration> createTramSubmode(TramSubmodesOfTransportEnumeration value) {
        return new JAXBElement<TramSubmodesOfTransportEnumeration>(_TramSubmode_QNAME, TramSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterSubmodesOfTransportEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link WaterSubmodesOfTransportEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "WaterSubmode", defaultValue = "unknown")
    public JAXBElement<WaterSubmodesOfTransportEnumeration> createWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
        return new JAXBElement<WaterSubmodesOfTransportEnumeration>(_WaterSubmode_QNAME, WaterSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirSubmodesOfTransportEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AirSubmodesOfTransportEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AirSubmode", defaultValue = "unknown")
    public JAXBElement<AirSubmodesOfTransportEnumeration> createAirSubmode(AirSubmodesOfTransportEnumeration value) {
        return new JAXBElement<AirSubmodesOfTransportEnumeration>(_AirSubmode_QNAME, AirSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelecabinSubmodesOfTransportEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TelecabinSubmodesOfTransportEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TelecabinSubmode", defaultValue = "unknown")
    public JAXBElement<TelecabinSubmodesOfTransportEnumeration> createTelecabinSubmode(TelecabinSubmodesOfTransportEnumeration value) {
        return new JAXBElement<TelecabinSubmodesOfTransportEnumeration>(_TelecabinSubmode_QNAME, TelecabinSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FunicularSubmodesOfTransportEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FunicularSubmodesOfTransportEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FunicularSubmode", defaultValue = "unknown")
    public JAXBElement<FunicularSubmodesOfTransportEnumeration> createFunicularSubmode(FunicularSubmodesOfTransportEnumeration value) {
        return new JAXBElement<FunicularSubmodesOfTransportEnumeration>(_FunicularSubmode_QNAME, FunicularSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxiSubmodesOfTransportEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TaxiSubmodesOfTransportEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TaxiSubmode", defaultValue = "unknown")
    public JAXBElement<TaxiSubmodesOfTransportEnumeration> createTaxiSubmode(TaxiSubmodesOfTransportEnumeration value) {
        return new JAXBElement<TaxiSubmodesOfTransportEnumeration>(_TaxiSubmode_QNAME, TaxiSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelfDriveSubmodesOfTransportEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SelfDriveSubmodesOfTransportEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SelfDriveSubmode", defaultValue = "unknown")
    public JAXBElement<SelfDriveSubmodesOfTransportEnumeration> createSelfDriveSubmode(SelfDriveSubmodesOfTransportEnumeration value) {
        return new JAXBElement<SelfDriveSubmodesOfTransportEnumeration>(_SelfDriveSubmode_QNAME, SelfDriveSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyListStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link KeyListStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "KeyList")
    public JAXBElement<KeyListStructure> createKeyList(KeyListStructure value) {
        return new JAXBElement<KeyListStructure>(_KeyList_QNAME, KeyListStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypesOfValueStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TypesOfValueStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TypesOfValue")
    public JAXBElement<TypesOfValueStructure> createTypesOfValue(TypesOfValueStructure value) {
        return new JAXBElement<TypesOfValueStructure>(_TypesOfValue_QNAME, TypesOfValueStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOfValueStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TypeOfValueStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TypeOfValue")
    public JAXBElement<TypeOfValueStructure> createTypeOfValue(TypeOfValueStructure value) {
        return new JAXBElement<TypeOfValueStructure>(_TypeOfValue_QNAME, TypeOfValueStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueSetStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ValueSetStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ValueSet")
    public JAXBElement<ValueSetStructure> createValueSet(ValueSetStructure value) {
        return new JAXBElement<ValueSetStructure>(_ValueSet_QNAME, ValueSetStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RequestTimestamp")
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createRequestTimestamp(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_RequestTimestamp_QNAME, ZonedDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ParticipantRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RequestorRef")
    public JAXBElement<ParticipantRefStructure> createRequestorRef(ParticipantRefStructure value) {
        return new JAXBElement<ParticipantRefStructure>(_RequestorRef_QNAME, ParticipantRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ResponseTimestamp")
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createResponseTimestamp(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_ResponseTimestamp_QNAME, ZonedDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "IncludeTranslations", defaultValue = "false")
    public JAXBElement<Boolean> createIncludeTranslations(Boolean value) {
        return new JAXBElement<Boolean>(_IncludeTranslations_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "IncludeInterchanges", defaultValue = "true")
    public JAXBElement<Boolean> createIncludeInterchanges(Boolean value) {
        return new JAXBElement<Boolean>(_IncludeInterchanges_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "IncludeJourneyRelations", defaultValue = "true")
    public JAXBElement<Boolean> createIncludeJourneyRelations(Boolean value) {
        return new JAXBElement<Boolean>(_IncludeJourneyRelations_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "IncludeTrainFormations", defaultValue = "true")
    public JAXBElement<Boolean> createIncludeTrainFormations(Boolean value) {
        return new JAXBElement<Boolean>(_IncludeTrainFormations_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorConditionStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ErrorConditionStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ErrorCondition")
    public JAXBElement<ErrorConditionStructure> createErrorCondition(ErrorConditionStructure value) {
        return new JAXBElement<ErrorConditionStructure>(_ErrorCondition_QNAME, ErrorConditionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorConditionElementStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ErrorConditionElementStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ErrorConditionElement")
    public JAXBElement<ErrorConditionElementStructure> createErrorConditionElement(ErrorConditionElementStructure value) {
        return new JAXBElement<ErrorConditionElementStructure>(_ErrorConditionElement_QNAME, ErrorConditionElementStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDeliveryErrorConditionStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ServiceDeliveryErrorConditionStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ServiceDeliveryErrorConditionElement")
    public JAXBElement<ServiceDeliveryErrorConditionStructure> createServiceDeliveryErrorConditionElement(ServiceDeliveryErrorConditionStructure value) {
        return new JAXBElement<ServiceDeliveryErrorConditionStructure>(_ServiceDeliveryErrorConditionElement_QNAME, ServiceDeliveryErrorConditionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnapprovedKeyAccessStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UnapprovedKeyAccessStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UnapprovedKeyAccessError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<UnapprovedKeyAccessStructure> createUnapprovedKeyAccessError(UnapprovedKeyAccessStructure value) {
        return new JAXBElement<UnapprovedKeyAccessStructure>(_UnapprovedKeyAccessError_QNAME, UnapprovedKeyAccessStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownParticipantErrorStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UnknownParticipantErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UnknownParticipantError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<UnknownParticipantErrorStructure> createUnknownParticipantError(UnknownParticipantErrorStructure value) {
        return new JAXBElement<UnknownParticipantErrorStructure>(_UnknownParticipantError_QNAME, UnknownParticipantErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownEndpointErrorStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UnknownEndpointErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UnknownEndpointError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<UnknownEndpointErrorStructure> createUnknownEndpointError(UnknownEndpointErrorStructure value) {
        return new JAXBElement<UnknownEndpointErrorStructure>(_UnknownEndpointError_QNAME, UnknownEndpointErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointDeniedAccessStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EndpointDeniedAccessStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EndpointDeniedAccessError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<EndpointDeniedAccessStructure> createEndpointDeniedAccessError(EndpointDeniedAccessStructure value) {
        return new JAXBElement<EndpointDeniedAccessStructure>(_EndpointDeniedAccessError_QNAME, EndpointDeniedAccessStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointNotAvailableAccessStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EndpointNotAvailableAccessStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EndpointNotAvailableAccessError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<EndpointNotAvailableAccessStructure> createEndpointNotAvailableAccessError(EndpointNotAvailableAccessStructure value) {
        return new JAXBElement<EndpointNotAvailableAccessStructure>(_EndpointNotAvailableAccessError_QNAME, EndpointNotAvailableAccessStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceNotAvailableErrorStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ServiceNotAvailableErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ServiceNotAvailableError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<ServiceNotAvailableErrorStructure> createServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
        return new JAXBElement<ServiceNotAvailableErrorStructure>(_ServiceNotAvailableError_QNAME, ServiceNotAvailableErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapabilityNotSupportedErrorStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CapabilityNotSupportedErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CapabilityNotSupportedError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<CapabilityNotSupportedErrorStructure> createCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
        return new JAXBElement<CapabilityNotSupportedErrorStructure>(_CapabilityNotSupportedError_QNAME, CapabilityNotSupportedErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeyondDataHorizonErrorStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BeyondDataHorizonErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "BeyondDataHorizon", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<BeyondDataHorizonErrorStructure> createBeyondDataHorizon(BeyondDataHorizonErrorStructure value) {
        return new JAXBElement<BeyondDataHorizonErrorStructure>(_BeyondDataHorizon_QNAME, BeyondDataHorizonErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessNotAllowedErrorStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AccessNotAllowedErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AccessNotAllowedError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<AccessNotAllowedErrorStructure> createAccessNotAllowedError(AccessNotAllowedErrorStructure value) {
        return new JAXBElement<AccessNotAllowedErrorStructure>(_AccessNotAllowedError_QNAME, AccessNotAllowedErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoInfoForTopicErrorStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NoInfoForTopicErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "NoInfoForTopicError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<NoInfoForTopicErrorStructure> createNoInfoForTopicError(NoInfoForTopicErrorStructure value) {
        return new JAXBElement<NoInfoForTopicErrorStructure>(_NoInfoForTopicError_QNAME, NoInfoForTopicErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidDataReferencesErrorStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link InvalidDataReferencesErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "InvalidDataReferencesError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<InvalidDataReferencesErrorStructure> createInvalidDataReferencesError(InvalidDataReferencesErrorStructure value) {
        return new JAXBElement<InvalidDataReferencesErrorStructure>(_InvalidDataReferencesError_QNAME, InvalidDataReferencesErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametersIgnoredErrorStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ParametersIgnoredErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ParametersIgnoredError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<ParametersIgnoredErrorStructure> createParametersIgnoredError(ParametersIgnoredErrorStructure value) {
        return new JAXBElement<ParametersIgnoredErrorStructure>(_ParametersIgnoredError_QNAME, ParametersIgnoredErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownExtensionsErrorStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UnknownExtensionsErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UnknownExtensionsError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<UnknownExtensionsErrorStructure> createUnknownExtensionsError(UnknownExtensionsErrorStructure value) {
        return new JAXBElement<UnknownExtensionsErrorStructure>(_UnknownExtensionsError_QNAME, UnknownExtensionsErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowedResourceUsageExceededErrorStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AllowedResourceUsageExceededErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AllowedResourceUsageExceededError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<AllowedResourceUsageExceededErrorStructure> createAllowedResourceUsageExceededError(AllowedResourceUsageExceededErrorStructure value) {
        return new JAXBElement<AllowedResourceUsageExceededErrorStructure>(_AllowedResourceUsageExceededError_QNAME, AllowedResourceUsageExceededErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownSubscriberErrorStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UnknownSubscriberErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UnknownSubscriberError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<UnknownSubscriberErrorStructure> createUnknownSubscriberError(UnknownSubscriberErrorStructure value) {
        return new JAXBElement<UnknownSubscriberErrorStructure>(_UnknownSubscriberError_QNAME, UnknownSubscriberErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownSubscriptionErrorStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UnknownSubscriptionErrorStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UnknownSubscriptionError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<UnknownSubscriptionErrorStructure> createUnknownSubscriptionError(UnknownSubscriptionErrorStructure value) {
        return new JAXBElement<UnknownSubscriptionErrorStructure>(_UnknownSubscriptionError_QNAME, UnknownSubscriptionErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticatedRequestStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AuthenticatedRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AuthenticatedRequest")
    public JAXBElement<AuthenticatedRequestStructure> createAuthenticatedRequest(AuthenticatedRequestStructure value) {
        return new JAXBElement<AuthenticatedRequestStructure>(_AuthenticatedRequest_QNAME, AuthenticatedRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractTrackedRequest")
    public JAXBElement<RequestStructure> createAbstractTrackedRequest(RequestStructure value) {
        return new JAXBElement<RequestStructure>(_AbstractTrackedRequest_QNAME, RequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSubscriptionStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AbstractSubscriptionStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractFunctionalServiceSubscriptionRequest")
    public JAXBElement<AbstractSubscriptionStructure> createAbstractFunctionalServiceSubscriptionRequest(AbstractSubscriptionStructure value) {
        return new JAXBElement<AbstractSubscriptionStructure>(_AbstractFunctionalServiceSubscriptionRequest_QNAME, AbstractSubscriptionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Status", defaultValue = "true")
    public JAXBElement<Boolean> createStatus(Boolean value) {
        return new JAXBElement<Boolean>(_Status_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducerRequestEndpointStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ProducerRequestEndpointStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ProducerRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AuthenticatedRequest")
    public JAXBElement<ProducerRequestEndpointStructure> createProducerRequest(ProducerRequestEndpointStructure value) {
        return new JAXBElement<ProducerRequestEndpointStructure>(_ProducerRequest_QNAME, ProducerRequestEndpointStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractServiceRequestStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AbstractServiceRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractFunctionalServiceCapabilitiesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractServiceRequest")
    public JAXBElement<AbstractServiceRequestStructure> createAbstractFunctionalServiceCapabilitiesRequest(AbstractServiceRequestStructure value) {
        return new JAXBElement<AbstractServiceRequestStructure>(_AbstractFunctionalServiceCapabilitiesRequest_QNAME, AbstractServiceRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractDiscoveryRequestStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AbstractDiscoveryRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractDiscoveryRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AuthenticatedRequest")
    public JAXBElement<AbstractDiscoveryRequestStructure> createAbstractDiscoveryRequest(AbstractDiscoveryRequestStructure value) {
        return new JAXBElement<AbstractDiscoveryRequestStructure>(_AbstractDiscoveryRequest_QNAME, AbstractDiscoveryRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractDiscoveryDeliveryStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AbstractDiscoveryDeliveryStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractDiscoveryDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<AbstractDiscoveryDeliveryStructure> createAbstractDiscoveryDelivery(AbstractDiscoveryDeliveryStructure value) {
        return new JAXBElement<AbstractDiscoveryDeliveryStructure>(_AbstractDiscoveryDelivery_QNAME, AbstractDiscoveryDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminateSubscriptionRequestStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TerminateSubscriptionRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TerminateSubscriptionRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AuthenticatedRequest")
    public JAXBElement<TerminateSubscriptionRequestStructure> createTerminateSubscriptionRequest(TerminateSubscriptionRequestStructure value) {
        return new JAXBElement<TerminateSubscriptionRequestStructure>(_TerminateSubscriptionRequest_QNAME, TerminateSubscriptionRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminateSubscriptionResponseStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TerminateSubscriptionResponseStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TerminateSubscriptionResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<TerminateSubscriptionResponseStructure> createTerminateSubscriptionResponse(TerminateSubscriptionResponseStructure value) {
        return new JAXBElement<TerminateSubscriptionResponseStructure>(_TerminateSubscriptionResponse_QNAME, TerminateSubscriptionResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionTerminatedNotificationStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SubscriptionTerminatedNotificationStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SubscriptionTerminatedNotification", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<SubscriptionTerminatedNotificationStructure> createSubscriptionTerminatedNotification(SubscriptionTerminatedNotificationStructure value) {
        return new JAXBElement<SubscriptionTerminatedNotificationStructure>(_SubscriptionTerminatedNotification_QNAME, SubscriptionTerminatedNotificationStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusResponseStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link StatusResponseStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ResponseStatus")
    public JAXBElement<StatusResponseStructure> createResponseStatus(StatusResponseStructure value) {
        return new JAXBElement<StatusResponseStructure>(_ResponseStatus_QNAME, StatusResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionResponseStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SubscriptionResponseStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SubscriptionResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<SubscriptionResponseStructure> createSubscriptionResponse(SubscriptionResponseStructure value) {
        return new JAXBElement<SubscriptionResponseStructure>(_SubscriptionResponse_QNAME, SubscriptionResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataReadyRequestStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DataReadyRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DataReadyNotification", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ProducerRequest")
    public JAXBElement<DataReadyRequestStructure> createDataReadyNotification(DataReadyRequestStructure value) {
        return new JAXBElement<DataReadyRequestStructure>(_DataReadyNotification_QNAME, DataReadyRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataReadyResponseStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DataReadyResponseStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DataReadyAcknowledgement", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<DataReadyResponseStructure> createDataReadyAcknowledgement(DataReadyResponseStructure value) {
        return new JAXBElement<DataReadyResponseStructure>(_DataReadyAcknowledgement_QNAME, DataReadyResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSupplyRequestStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DataSupplyRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DataSupplyRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractRequest")
    public JAXBElement<DataSupplyRequestStructure> createDataSupplyRequest(DataSupplyRequestStructure value) {
        return new JAXBElement<DataSupplyRequestStructure>(_DataSupplyRequest_QNAME, DataSupplyRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataReceivedResponseStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DataReceivedResponseStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DataReceivedAcknowledgement", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<DataReceivedResponseStructure> createDataReceivedAcknowledgement(DataReceivedResponseStructure value) {
        return new JAXBElement<DataReceivedResponseStructure>(_DataReceivedAcknowledgement_QNAME, DataReceivedResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckStatusRequestStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CheckStatusRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CheckStatusRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractTrackedRequest")
    public JAXBElement<CheckStatusRequestStructure> createCheckStatusRequest(CheckStatusRequestStructure value) {
        return new JAXBElement<CheckStatusRequestStructure>(_CheckStatusRequest_QNAME, CheckStatusRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckStatusResponseStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CheckStatusResponseStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CheckStatusResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<CheckStatusResponseStructure> createCheckStatusResponse(CheckStatusResponseStructure value) {
        return new JAXBElement<CheckStatusResponseStructure>(_CheckStatusResponse_QNAME, CheckStatusResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeartbeatNotificationStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link HeartbeatNotificationStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "HeartbeatNotification", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ProducerRequest")
    public JAXBElement<HeartbeatNotificationStructure> createHeartbeatNotification(HeartbeatNotificationStructure value) {
        return new JAXBElement<HeartbeatNotificationStructure>(_HeartbeatNotification_QNAME, HeartbeatNotificationStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapabilitiesRequestStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CapabilitiesRequestStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CapabilitiesRequest")
    public JAXBElement<CapabilitiesRequestStructure> createCapabilitiesRequest(CapabilitiesRequestStructure value) {
        return new JAXBElement<CapabilitiesRequestStructure>(_CapabilitiesRequest_QNAME, CapabilitiesRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapabilitiesResponseStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CapabilitiesResponseStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CapabilitiesResponse")
    public JAXBElement<CapabilitiesResponseStructure> createCapabilitiesResponse(CapabilitiesResponseStructure value) {
        return new JAXBElement<CapabilitiesResponseStructure>(_CapabilitiesResponse_QNAME, CapabilitiesResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessFacilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AccessFacilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AccessFacility", defaultValue = "unknown")
    public JAXBElement<AccessFacilityEnumeration> createAccessFacility(AccessFacilityEnumeration value) {
        return new JAXBElement<AccessFacilityEnumeration>(_AccessFacility_QNAME, AccessFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationFacilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AccommodationFacilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AccommodationFacility", defaultValue = "unknown")
    public JAXBElement<AccommodationFacilityEnumeration> createAccommodationFacility(AccommodationFacilityEnumeration value) {
        return new JAXBElement<AccommodationFacilityEnumeration>(_AccommodationFacility_QNAME, AccommodationFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssistanceFacilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AssistanceFacilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AssistanceFacility", defaultValue = "unknown")
    public JAXBElement<AssistanceFacilityEnumeration> createAssistanceFacility(AssistanceFacilityEnumeration value) {
        return new JAXBElement<AssistanceFacilityEnumeration>(_AssistanceFacility_QNAME, AssistanceFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareClassFacilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FareClassFacilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FareClassFacility", defaultValue = "unknown")
    public JAXBElement<FareClassFacilityEnumeration> createFareClassFacility(FareClassFacilityEnumeration value) {
        return new JAXBElement<FareClassFacilityEnumeration>(_FareClassFacility_QNAME, FareClassFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HireFacilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link HireFacilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "HireFacility", defaultValue = "unknown")
    public JAXBElement<HireFacilityEnumeration> createHireFacility(HireFacilityEnumeration value) {
        return new JAXBElement<HireFacilityEnumeration>(_HireFacility_QNAME, HireFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LuggageFacilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link LuggageFacilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "LuggageFacility", defaultValue = "unknown")
    public JAXBElement<LuggageFacilityEnumeration> createLuggageFacility(LuggageFacilityEnumeration value) {
        return new JAXBElement<LuggageFacilityEnumeration>(_LuggageFacility_QNAME, LuggageFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobilityFacilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link MobilityFacilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "MobilityFacility", defaultValue = "unknown")
    public JAXBElement<MobilityFacilityEnumeration> createMobilityFacility(MobilityFacilityEnumeration value) {
        return new JAXBElement<MobilityFacilityEnumeration>(_MobilityFacility_QNAME, MobilityFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NuisanceFacilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NuisanceFacilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "NuisanceFacility", defaultValue = "unknown")
    public JAXBElement<NuisanceFacilityEnumeration> createNuisanceFacility(NuisanceFacilityEnumeration value) {
        return new JAXBElement<NuisanceFacilityEnumeration>(_NuisanceFacility_QNAME, NuisanceFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParkingFacilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ParkingFacilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ParkingFacility")
    public JAXBElement<ParkingFacilityEnumeration> createParkingFacility(ParkingFacilityEnumeration value) {
        return new JAXBElement<ParkingFacilityEnumeration>(_ParkingFacility_QNAME, ParkingFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerInformationFacilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PassengerInformationFacilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PassengerInformationFacility", defaultValue = "unknown")
    public JAXBElement<PassengerInformationFacilityEnumeration> createPassengerInformationFacility(PassengerInformationFacilityEnumeration value) {
        return new JAXBElement<PassengerInformationFacilityEnumeration>(_PassengerInformationFacility_QNAME, PassengerInformationFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerCommsFacilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PassengerCommsFacilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PassengerCommsFacility", defaultValue = "unknown")
    public JAXBElement<PassengerCommsFacilityEnumeration> createPassengerCommsFacility(PassengerCommsFacilityEnumeration value) {
        return new JAXBElement<PassengerCommsFacilityEnumeration>(_PassengerCommsFacility_QNAME, PassengerCommsFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefreshmentFacilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RefreshmentFacilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RefreshmentFacility", defaultValue = "unknown")
    public JAXBElement<RefreshmentFacilityEnumeration> createRefreshmentFacility(RefreshmentFacilityEnumeration value) {
        return new JAXBElement<RefreshmentFacilityEnumeration>(_RefreshmentFacility_QNAME, RefreshmentFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservedSpaceFacilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ReservedSpaceFacilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ReservedSpaceFacility", defaultValue = "unknown")
    public JAXBElement<ReservedSpaceFacilityEnumeration> createReservedSpaceFacility(ReservedSpaceFacilityEnumeration value) {
        return new JAXBElement<ReservedSpaceFacilityEnumeration>(_ReservedSpaceFacility_QNAME, ReservedSpaceFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailFacilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RetailFacilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RetailFacility", defaultValue = "unknown")
    public JAXBElement<RetailFacilityEnumeration> createRetailFacility(RetailFacilityEnumeration value) {
        return new JAXBElement<RetailFacilityEnumeration>(_RetailFacility_QNAME, RetailFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SanitaryFacilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SanitaryFacilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SanitaryFacility", defaultValue = "unknown")
    public JAXBElement<SanitaryFacilityEnumeration> createSanitaryFacility(SanitaryFacilityEnumeration value) {
        return new JAXBElement<SanitaryFacilityEnumeration>(_SanitaryFacility_QNAME, SanitaryFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketingFacilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TicketingFacilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TicketingFacility", defaultValue = "unknown")
    public JAXBElement<TicketingFacilityEnumeration> createTicketingFacility(TicketingFacilityEnumeration value) {
        return new JAXBElement<TicketingFacilityEnumeration>(_TicketingFacility_QNAME, TicketingFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayTypeEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DayTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DayType", defaultValue = "everyDay")
    public JAXBElement<DayTypeEnumeration> createDayType(DayTypeEnumeration value) {
        return new JAXBElement<DayTypeEnumeration>(_DayType_QNAME, DayTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituationRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SituationRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SituationRef")
    public JAXBElement<SituationRefStructure> createSituationRef(SituationRefStructure value) {
        return new JAXBElement<SituationRefStructure>(_SituationRef_QNAME, SituationRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituationSimpleRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SituationSimpleRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SituationSimpleRef")
    public JAXBElement<SituationSimpleRefStructure> createSituationSimpleRef(SituationSimpleRefStructure value) {
        return new JAXBElement<SituationSimpleRefStructure>(_SituationSimpleRef_QNAME, SituationSimpleRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntryQualifierStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EntryQualifierStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SituationNumber")
    public JAXBElement<EntryQualifierStructure> createSituationNumber(EntryQualifierStructure value) {
        return new JAXBElement<EntryQualifierStructure>(_SituationNumber_QNAME, EntryQualifierStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituationFullRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SituationFullRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SituationFullRef")
    public JAXBElement<SituationFullRefStructure> createSituationFullRef(SituationFullRefStructure value) {
        return new JAXBElement<SituationFullRefStructure>(_SituationFullRef_QNAME, SituationFullRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VersionRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVersionRef(String value) {
        return new JAXBElement<String>(_VersionRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VisitNumber")
    public JAXBElement<BigInteger> createVisitNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_VisitNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Order")
    public JAXBElement<BigInteger> createOrder(BigInteger value) {
        return new JAXBElement<BigInteger>(_Order_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPointRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link StopPointRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopPointRef")
    public JAXBElement<StopPointRefStructure> createStopPointRef(StopPointRefStructure value) {
        return new JAXBElement<StopPointRefStructure>(_StopPointRef_QNAME, StopPointRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopPointName")
    public JAXBElement<NaturalLanguageStringStructure> createStopPointName(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_StopPointName_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TimingPoint", defaultValue = "true")
    public JAXBElement<Boolean> createTimingPoint(Boolean value) {
        return new JAXBElement<Boolean>(_TimingPoint_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleAtStop", defaultValue = "false")
    public JAXBElement<Boolean> createVehicleAtStop(Boolean value) {
        return new JAXBElement<Boolean>(_VehicleAtStop_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionLinkRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ConnectionLinkRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ConnectionLinkRef")
    public JAXBElement<ConnectionLinkRefStructure> createConnectionLinkRef(ConnectionLinkRefStructure value) {
        return new JAXBElement<ConnectionLinkRefStructure>(_ConnectionLinkRef_QNAME, ConnectionLinkRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourneyPatternRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link JourneyPatternRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "JourneyPatternRef")
    public JAXBElement<JourneyPatternRefStructure> createJourneyPatternRef(JourneyPatternRefStructure value) {
        return new JAXBElement<JourneyPatternRefStructure>(_JourneyPatternRef_QNAME, JourneyPatternRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "LineRef")
    public JAXBElement<LineRefStructure> createLineRef(LineRefStructure value) {
        return new JAXBElement<LineRefStructure>(_LineRef_QNAME, LineRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PublishedLineName")
    public JAXBElement<NaturalLanguageStringStructure> createPublishedLineName(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_PublishedLineName_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RouteName")
    public JAXBElement<NaturalLanguageStringStructure> createRouteName(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_RouteName_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link VehicleRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleRef")
    public JAXBElement<VehicleRefStructure> createVehicleRef(VehicleRefStructure value) {
        return new JAXBElement<VehicleRefStructure>(_VehicleRef_QNAME, VehicleRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SiteRef")
    public JAXBElement<SiteRefStructure> createSiteRef(SiteRefStructure value) {
        return new JAXBElement<SiteRefStructure>(_SiteRef_QNAME, SiteRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleJourneyRef")
    public JAXBElement<VehicleJourneyRefStructure> createVehicleJourneyRef(VehicleJourneyRefStructure value) {
        return new JAXBElement<VehicleJourneyRefStructure>(_VehicleJourneyRef_QNAME, VehicleJourneyRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatedVehicleJourneyRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DatedVehicleJourneyRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DatedVehicleJourneyRef")
    public JAXBElement<DatedVehicleJourneyRefStructure> createDatedVehicleJourneyRef(DatedVehicleJourneyRefStructure value) {
        return new JAXBElement<DatedVehicleJourneyRefStructure>(_DatedVehicleJourneyRef_QNAME, DatedVehicleJourneyRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterchangeRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link InterchangeRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "InterchangeRef")
    public JAXBElement<InterchangeRefStructure> createInterchangeRef(InterchangeRefStructure value) {
        return new JAXBElement<InterchangeRefStructure>(_InterchangeRef_QNAME, InterchangeRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrainElementRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TrainElementRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TrainElementRef")
    public JAXBElement<TrainElementRefStructure> createTrainElementRef(TrainElementRefStructure value) {
        return new JAXBElement<TrainElementRefStructure>(_TrainElementRef_QNAME, TrainElementRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrainComponentRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TrainComponentRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TrainComponentRef")
    public JAXBElement<TrainComponentRefStructure> createTrainComponentRef(TrainComponentRefStructure value) {
        return new JAXBElement<TrainComponentRefStructure>(_TrainComponentRef_QNAME, TrainComponentRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TrainRef")
    public JAXBElement<TrainRefStructure> createTrainRef(TrainRefStructure value) {
        return new JAXBElement<TrainRefStructure>(_TrainRef_QNAME, TrainRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompoundTrainRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CompoundTrainRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CompoundTrainRef")
    public JAXBElement<CompoundTrainRefStructure> createCompoundTrainRef(CompoundTrainRefStructure value) {
        return new JAXBElement<CompoundTrainRefStructure>(_CompoundTrainRef_QNAME, CompoundTrainRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrainInCompoundTrainRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TrainInCompoundTrainRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TrainInCompoundTrainRef")
    public JAXBElement<TrainInCompoundTrainRefStructure> createTrainInCompoundTrainRef(TrainInCompoundTrainRefStructure value) {
        return new JAXBElement<TrainInCompoundTrainRefStructure>(_TrainInCompoundTrainRef_QNAME, TrainInCompoundTrainRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntranceToVehicleRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EntranceToVehicleRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EntranceToVehicleRef")
    public JAXBElement<EntranceToVehicleRefStructure> createEntranceToVehicleRef(EntranceToVehicleRefStructure value) {
        return new JAXBElement<EntranceToVehicleRefStructure>(_EntranceToVehicleRef_QNAME, EntranceToVehicleRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourneyPlaceRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link JourneyPlaceRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "OriginRef")
    public JAXBElement<JourneyPlaceRefStructure> createOriginRef(JourneyPlaceRefStructure value) {
        return new JAXBElement<JourneyPlaceRefStructure>(_OriginRef_QNAME, JourneyPlaceRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourneyPlaceRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link JourneyPlaceRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ViaRef")
    public JAXBElement<JourneyPlaceRefStructure> createViaRef(JourneyPlaceRefStructure value) {
        return new JAXBElement<JourneyPlaceRefStructure>(_ViaRef_QNAME, JourneyPlaceRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DestinationRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DestinationRef")
    public JAXBElement<DestinationRefStructure> createDestinationRef(DestinationRefStructure value) {
        return new JAXBElement<DestinationRefStructure>(_DestinationRef_QNAME, DestinationRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareClassEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FareClassEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FareClass", defaultValue = "unknown")
    public JAXBElement<FareClassEnumeration> createFareClass(FareClassEnumeration value) {
        return new JAXBElement<FareClassEnumeration>(_FareClass_QNAME, FareClassEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link FareClassEnumeration }{@code >}{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link FareClassEnumeration }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FareClasses")
    public JAXBElement<List<FareClassEnumeration>> createFareClasses(List<FareClassEnumeration> value) {
        return new JAXBElement<List<FareClassEnumeration>>(_FareClasses_QNAME, ((Class) List.class), null, ((List<FareClassEnumeration>) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCategoryStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ProductCategoryStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ProductCategory")
    public JAXBElement<ProductCategoryStructure> createProductCategory(ProductCategoryStructure value) {
        return new JAXBElement<ProductCategoryStructure>(_ProductCategory_QNAME, ProductCategoryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFeatureStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ServiceFeatureStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ServiceFeature")
    public JAXBElement<ServiceFeatureStructure> createServiceFeature(ServiceFeatureStructure value) {
        return new JAXBElement<ServiceFeatureStructure>(_ServiceFeature_QNAME, ServiceFeatureStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleFeaturesStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link VehicleFeaturesStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleFeature")
    public JAXBElement<VehicleFeaturesStructure> createVehicleFeature(VehicleFeaturesStructure value) {
        return new JAXBElement<VehicleFeaturesStructure>(_VehicleFeature_QNAME, VehicleFeaturesStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguagePlaceNameStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NaturalLanguagePlaceNameStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "OriginName")
    public JAXBElement<NaturalLanguagePlaceNameStructure> createOriginName(NaturalLanguagePlaceNameStructure value) {
        return new JAXBElement<NaturalLanguagePlaceNameStructure>(_OriginName_QNAME, NaturalLanguagePlaceNameStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguagePlaceNameStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NaturalLanguagePlaceNameStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ViaName")
    public JAXBElement<NaturalLanguagePlaceNameStructure> createViaName(NaturalLanguagePlaceNameStructure value) {
        return new JAXBElement<NaturalLanguagePlaceNameStructure>(_ViaName_QNAME, NaturalLanguagePlaceNameStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguagePlaceNameStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NaturalLanguagePlaceNameStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DestinationName")
    public JAXBElement<NaturalLanguagePlaceNameStructure> createDestinationName(NaturalLanguagePlaceNameStructure value) {
        return new JAXBElement<NaturalLanguagePlaceNameStructure>(_DestinationName_QNAME, NaturalLanguagePlaceNameStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirstOrLastJourneyEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FirstOrLastJourneyEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FirstOrLastJourney", defaultValue = "unspecified")
    public JAXBElement<FirstOrLastJourneyEnumeration> createFirstOrLastJourney(FirstOrLastJourneyEnumeration value) {
        return new JAXBElement<FirstOrLastJourneyEnumeration>(_FirstOrLastJourney_QNAME, FirstOrLastJourneyEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "JourneyNote")
    public JAXBElement<NaturalLanguageStringStructure> createJourneyNote(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_JourneyNote_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectionStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DirectionStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Direction")
    public JAXBElement<DirectionStructure> createDirection(DirectionStructure value) {
        return new JAXBElement<DirectionStructure>(_Direction_QNAME, DirectionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlexibleAreaStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FlexibleAreaStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AimedFlexibleArea")
    public JAXBElement<FlexibleAreaStructure> createAimedFlexibleArea(FlexibleAreaStructure value) {
        return new JAXBElement<FlexibleAreaStructure>(_AimedFlexibleArea_QNAME, FlexibleAreaStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlexibleAreaRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FlexibleAreaRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AimedFlexibleAreaRef")
    public JAXBElement<FlexibleAreaRefStructure> createAimedFlexibleAreaRef(FlexibleAreaRefStructure value) {
        return new JAXBElement<FlexibleAreaRefStructure>(_AimedFlexibleAreaRef_QNAME, FlexibleAreaRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AimedLocationName")
    public JAXBElement<NaturalLanguageStringStructure> createAimedLocationName(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_AimedLocationName_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOfNestedQuayEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TypeOfNestedQuayEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "QuayType")
    public JAXBElement<TypeOfNestedQuayEnumeration> createQuayType(TypeOfNestedQuayEnumeration value) {
        return new JAXBElement<TypeOfNestedQuayEnumeration>(_QuayType_QNAME, TypeOfNestedQuayEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PredictionInaccurate", defaultValue = "false")
    public JAXBElement<Boolean> createPredictionInaccurate(Boolean value) {
        return new JAXBElement<Boolean>(_PredictionInaccurate_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PredictionInaccurateReasonEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PredictionInaccurateReasonEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PredictionInaccurateReason")
    public JAXBElement<PredictionInaccurateReasonEnumeration> createPredictionInaccurateReason(PredictionInaccurateReasonEnumeration value) {
        return new JAXBElement<PredictionInaccurateReasonEnumeration>(_PredictionInaccurateReason_QNAME, PredictionInaccurateReasonEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OccupancyEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OccupancyEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Occupancy")
    public JAXBElement<OccupancyEnumeration> createOccupancy(OccupancyEnumeration value) {
        return new JAXBElement<OccupancyEnumeration>(_Occupancy_QNAME, OccupancyEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AimedArrivalTime")
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createAimedArrivalTime(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_AimedArrivalTime_QNAME, ZonedDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ActualArrivalTime")
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createActualArrivalTime(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_ActualArrivalTime_QNAME, ZonedDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ExpectedArrivalTime")
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createExpectedArrivalTime(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_ExpectedArrivalTime_QNAME, ZonedDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallStatusEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CallStatusEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ArrivalStatus")
    public JAXBElement<CallStatusEnumeration> createArrivalStatus(CallStatusEnumeration value) {
        return new JAXBElement<CallStatusEnumeration>(_ArrivalStatus_QNAME, CallStatusEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ArrivalCancellationReason")
    public JAXBElement<NaturalLanguageStringStructure> createArrivalCancellationReason(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_ArrivalCancellationReason_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ArrivalProximityText")
    public JAXBElement<NaturalLanguageStringStructure> createArrivalProximityText(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_ArrivalProximityText_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ArrivalPlatformName")
    public JAXBElement<NaturalLanguageStringStructure> createArrivalPlatformName(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_ArrivalPlatformName_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrivalBoardingActivityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrivalBoardingActivityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ArrivalBoardingActivity", defaultValue = "alighting")
    public JAXBElement<ArrivalBoardingActivityEnumeration> createArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        return new JAXBElement<ArrivalBoardingActivityEnumeration>(_ArrivalBoardingActivity_QNAME, ArrivalBoardingActivityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormationAssignmentStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FormationAssignmentStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ArrivalFormationAssignment")
    public JAXBElement<FormationAssignmentStructure> createArrivalFormationAssignment(FormationAssignmentStructure value) {
        return new JAXBElement<FormationAssignmentStructure>(_ArrivalFormationAssignment_QNAME, FormationAssignmentStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleOrientationRelativeToQuay }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link VehicleOrientationRelativeToQuay }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ArrivalOrientationRelativeToQuay")
    public JAXBElement<VehicleOrientationRelativeToQuay> createArrivalOrientationRelativeToQuay(VehicleOrientationRelativeToQuay value) {
        return new JAXBElement<VehicleOrientationRelativeToQuay>(_ArrivalOrientationRelativeToQuay_QNAME, VehicleOrientationRelativeToQuay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ArrivalOperatorRefs")
    public JAXBElement<OperatorRefStructure> createArrivalOperatorRefs(OperatorRefStructure value) {
        return new JAXBElement<OperatorRefStructure>(_ArrivalOperatorRefs_QNAME, OperatorRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AimedDepartureTime")
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createAimedDepartureTime(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_AimedDepartureTime_QNAME, ZonedDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ActualDepartureTime")
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createActualDepartureTime(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_ActualDepartureTime_QNAME, ZonedDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ExpectedDepartureTime")
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createExpectedDepartureTime(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_ExpectedDepartureTime_QNAME, ZonedDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AimedLatestPassengerAccessTime")
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createAimedLatestPassengerAccessTime(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_AimedLatestPassengerAccessTime_QNAME, ZonedDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ExpectedLatestPassengerAccessTime")
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createExpectedLatestPassengerAccessTime(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_ExpectedLatestPassengerAccessTime_QNAME, ZonedDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallStatusEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CallStatusEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DepartureStatus")
    public JAXBElement<CallStatusEnumeration> createDepartureStatus(CallStatusEnumeration value) {
        return new JAXBElement<CallStatusEnumeration>(_DepartureStatus_QNAME, CallStatusEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DepartureCancellationReason")
    public JAXBElement<NaturalLanguageStringStructure> createDepartureCancellationReason(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_DepartureCancellationReason_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DepartureProximityText")
    public JAXBElement<NaturalLanguageStringStructure> createDepartureProximityText(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_DepartureProximityText_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DeparturePlatformName")
    public JAXBElement<NaturalLanguageStringStructure> createDeparturePlatformName(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_DeparturePlatformName_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartureBoardingActivityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DepartureBoardingActivityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DepartureBoardingActivity", defaultValue = "boarding")
    public JAXBElement<DepartureBoardingActivityEnumeration> createDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        return new JAXBElement<DepartureBoardingActivityEnumeration>(_DepartureBoardingActivity_QNAME, DepartureBoardingActivityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormationAssignmentStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FormationAssignmentStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DepartureFormationAssignment")
    public JAXBElement<FormationAssignmentStructure> createDepartureFormationAssignment(FormationAssignmentStructure value) {
        return new JAXBElement<FormationAssignmentStructure>(_DepartureFormationAssignment_QNAME, FormationAssignmentStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleOrientationRelativeToQuay }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link VehicleOrientationRelativeToQuay }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DepartureOrientationRelativeToQuay")
    public JAXBElement<VehicleOrientationRelativeToQuay> createDepartureOrientationRelativeToQuay(VehicleOrientationRelativeToQuay value) {
        return new JAXBElement<VehicleOrientationRelativeToQuay>(_DepartureOrientationRelativeToQuay_QNAME, VehicleOrientationRelativeToQuay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleOccupancyStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link VehicleOccupancyStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ExpectedDepartureOccupancy")
    public JAXBElement<VehicleOccupancyStructure> createExpectedDepartureOccupancy(VehicleOccupancyStructure value) {
        return new JAXBElement<VehicleOccupancyStructure>(_ExpectedDepartureOccupancy_QNAME, VehicleOccupancyStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerCapacityStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PassengerCapacityStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ExpectedDepartureCapacities")
    public JAXBElement<PassengerCapacityStructure> createExpectedDepartureCapacities(PassengerCapacityStructure value) {
        return new JAXBElement<PassengerCapacityStructure>(_ExpectedDepartureCapacities_QNAME, PassengerCapacityStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleOccupancyStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link VehicleOccupancyStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RecordedDepartureOccupancy")
    public JAXBElement<VehicleOccupancyStructure> createRecordedDepartureOccupancy(VehicleOccupancyStructure value) {
        return new JAXBElement<VehicleOccupancyStructure>(_RecordedDepartureOccupancy_QNAME, VehicleOccupancyStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerCapacityStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PassengerCapacityStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RecordedDepartureCapacities")
    public JAXBElement<PassengerCapacityStructure> createRecordedDepartureCapacities(PassengerCapacityStructure value) {
        return new JAXBElement<PassengerCapacityStructure>(_RecordedDepartureCapacities_QNAME, PassengerCapacityStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DepartureOperatorRefs")
    public JAXBElement<OperatorRefStructure> createDepartureOperatorRefs(OperatorRefStructure value) {
        return new JAXBElement<OperatorRefStructure>(_DepartureOperatorRefs_QNAME, OperatorRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AimedHeadwayInterval")
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    public JAXBElement<Duration> createAimedHeadwayInterval(Duration value) {
        return new JAXBElement<Duration>(_AimedHeadwayInterval_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ExpectedHeadwayInterval")
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    public JAXBElement<Duration> createExpectedHeadwayInterval(Duration value) {
        return new JAXBElement<Duration>(_ExpectedHeadwayInterval_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ActualHeadwayInterval")
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    public JAXBElement<Duration> createActualHeadwayInterval(Duration value) {
        return new JAXBElement<Duration>(_ActualHeadwayInterval_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedJourneyStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RelatedJourneyStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RelatedJourney")
    public JAXBElement<RelatedJourneyStructure> createRelatedJourney(RelatedJourneyStructure value) {
        return new JAXBElement<RelatedJourneyStructure>(_RelatedJourney_QNAME, RelatedJourneyStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormationConditionStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FormationConditionStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FormationCondition")
    public JAXBElement<FormationConditionStructure> createFormationCondition(FormationConditionStructure value) {
        return new JAXBElement<FormationConditionStructure>(_FormationCondition_QNAME, FormationConditionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrainElementStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TrainElementStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TrainElement")
    public JAXBElement<TrainElementStructure> createTrainElement(TrainElementStructure value) {
        return new JAXBElement<TrainElementStructure>(_TrainElement_QNAME, TrainElementStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrainComponentStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TrainComponentStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TrainComponent")
    public JAXBElement<TrainComponentStructure> createTrainComponent(TrainComponentStructure value) {
        return new JAXBElement<TrainComponentStructure>(_TrainComponent_QNAME, TrainComponentStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrainStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TrainStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Train")
    public JAXBElement<TrainStructure> createTrain(TrainStructure value) {
        return new JAXBElement<TrainStructure>(_Train_QNAME, TrainStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompoundTrainStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CompoundTrainStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CompoundTrain")
    public JAXBElement<CompoundTrainStructure> createCompoundTrain(CompoundTrainStructure value) {
        return new JAXBElement<CompoundTrainStructure>(_CompoundTrain_QNAME, CompoundTrainStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrainInCompoundTrainStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TrainInCompoundTrainStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TrainInCompoundTrain")
    public JAXBElement<TrainInCompoundTrainStructure> createTrainInCompoundTrain(TrainInCompoundTrainStructure value) {
        return new JAXBElement<TrainInCompoundTrainStructure>(_TrainInCompoundTrain_QNAME, TrainInCompoundTrainStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FacilityRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FacilityRef")
    public JAXBElement<FacilityRefStructure> createFacilityRef(FacilityRefStructure value) {
        return new JAXBElement<FacilityRefStructure>(_FacilityRef_QNAME, FacilityRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityConditionStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FacilityConditionStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FacilityConditionElement")
    public JAXBElement<FacilityConditionStructure> createFacilityConditionElement(FacilityConditionStructure value) {
        return new JAXBElement<FacilityConditionStructure>(_FacilityConditionElement_QNAME, FacilityConditionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityChangeStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FacilityChangeStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FacilityChangeElement")
    public JAXBElement<FacilityChangeStructure> createFacilityChangeElement(FacilityChangeStructure value) {
        return new JAXBElement<FacilityChangeStructure>(_FacilityChangeElement_QNAME, FacilityChangeStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatedVehicleJourneyStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DatedVehicleJourneyStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DatedVehicleJourney")
    public JAXBElement<DatedVehicleJourneyStructure> createDatedVehicleJourney(DatedVehicleJourneyStructure value) {
        return new JAXBElement<DatedVehicleJourneyStructure>(_DatedVehicleJourney_QNAME, DatedVehicleJourneyStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatedCallStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DatedCallStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DatedCall")
    public JAXBElement<DatedCallStructure> createDatedCall(DatedCallStructure value) {
        return new JAXBElement<DatedCallStructure>(_DatedCall_QNAME, DatedCallStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "InterchangeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInterchangeCode(String value) {
        return new JAXBElement<String>(_InterchangeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ExtraInterchange", defaultValue = "false")
    public JAXBElement<Boolean> createExtraInterchange(Boolean value) {
        return new JAXBElement<Boolean>(_ExtraInterchange_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ReasonForRemoval")
    public JAXBElement<NaturalLanguageStringStructure> createReasonForRemoval(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_ReasonForRemoval_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectingJourneyRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ConnectingJourneyRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FeederRef")
    public JAXBElement<ConnectingJourneyRefStructure> createFeederRef(ConnectingJourneyRefStructure value) {
        return new JAXBElement<ConnectingJourneyRefStructure>(_FeederRef_QNAME, ConnectingJourneyRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPointRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link StopPointRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FeederArrivalStopRef")
    public JAXBElement<StopPointRefStructure> createFeederArrivalStopRef(StopPointRefStructure value) {
        return new JAXBElement<StopPointRefStructure>(_FeederArrivalStopRef_QNAME, StopPointRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FeederVisitNumber")
    public JAXBElement<BigInteger> createFeederVisitNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_FeederVisitNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FeederStopOrder")
    public JAXBElement<BigInteger> createFeederStopOrder(BigInteger value) {
        return new JAXBElement<BigInteger>(_FeederStopOrder_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AimedArrivalTimeOfFeeder")
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createAimedArrivalTimeOfFeeder(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_AimedArrivalTimeOfFeeder_QNAME, ZonedDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectingJourneyRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ConnectingJourneyRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DistributorRef")
    public JAXBElement<ConnectingJourneyRefStructure> createDistributorRef(ConnectingJourneyRefStructure value) {
        return new JAXBElement<ConnectingJourneyRefStructure>(_DistributorRef_QNAME, ConnectingJourneyRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPointRefStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link StopPointRefStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DistributorDepartureStopRef")
    public JAXBElement<StopPointRefStructure> createDistributorDepartureStopRef(StopPointRefStructure value) {
        return new JAXBElement<StopPointRefStructure>(_DistributorDepartureStopRef_QNAME, StopPointRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DistributorVisitNumber")
    public JAXBElement<BigInteger> createDistributorVisitNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_DistributorVisitNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DistributorStopOrder")
    public JAXBElement<BigInteger> createDistributorStopOrder(BigInteger value) {
        return new JAXBElement<BigInteger>(_DistributorStopOrder_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AimedDepartureTimeOfDistributor")
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    public JAXBElement<ZonedDateTime> createAimedDepartureTimeOfDistributor(ZonedDateTime value) {
        return new JAXBElement<ZonedDateTime>(_AimedDepartureTimeOfDistributor_QNAME, ZonedDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportTypeEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ReportTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ReportType", defaultValue = "unknown")
    public JAXBElement<ReportTypeEnumeration> createReportType(ReportTypeEnumeration value) {
        return new JAXBElement<ReportTypeEnumeration>(_ReportType_QNAME, ReportTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterchangeStatusEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link InterchangeStatusEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "InterchangeStatusType", defaultValue = "unknown")
    public JAXBElement<InterchangeStatusEnumeration> createInterchangeStatusType(InterchangeStatusEnumeration value) {
        return new JAXBElement<InterchangeStatusEnumeration>(_InterchangeStatusType_QNAME, InterchangeStatusEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketRestrictionEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TicketRestrictionEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TicketRestrictionType", defaultValue = "unknown")
    public JAXBElement<TicketRestrictionEnumeration> createTicketRestrictionType(TicketRestrictionEnumeration value) {
        return new JAXBElement<TicketRestrictionEnumeration>(_TicketRestrictionType_QNAME, TicketRestrictionEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingStatusEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BookingStatusEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "BookingStatusType", defaultValue = "unknown")
    public JAXBElement<BookingStatusEnumeration> createBookingStatusType(BookingStatusEnumeration value) {
        return new JAXBElement<BookingStatusEnumeration>(_BookingStatusType_QNAME, BookingStatusEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPointTypeEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link StopPointTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopPointType", defaultValue = "unknown")
    public JAXBElement<StopPointTypeEnumeration> createStopPointType(StopPointTypeEnumeration value) {
        return new JAXBElement<StopPointTypeEnumeration>(_StopPointType_QNAME, StopPointTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePointTypeEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RoutePointTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RoutePointType", defaultValue = "unknown")
    public JAXBElement<RoutePointTypeEnumeration> createRoutePointType(RoutePointTypeEnumeration value) {
        return new JAXBElement<RoutePointTypeEnumeration>(_RoutePointType_QNAME, RoutePointTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimetableTypeEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TimetableTypeEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TimetableType", defaultValue = "unknown")
    public JAXBElement<TimetableTypeEnumeration> createTimetableType(TimetableTypeEnumeration value) {
        return new JAXBElement<TimetableTypeEnumeration>(_TimetableType_QNAME, TimetableTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertCauseEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AlertCauseEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AlertCause")
    public JAXBElement<AlertCauseEnumeration> createAlertCause(AlertCauseEnumeration value) {
        return new JAXBElement<AlertCauseEnumeration>(_AlertCause_QNAME, AlertCauseEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UnknownReason")
    public JAXBElement<String> createUnknownReason(String value) {
        return new JAXBElement<String>(_UnknownReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UndefinedReason")
    public JAXBElement<String> createUndefinedReason(String value) {
        return new JAXBElement<String>(_UndefinedReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "MiscellaneousReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMiscellaneousReason(String value) {
        return new JAXBElement<String>(_MiscellaneousReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "MiscellaneousSubReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMiscellaneousSubReason(String value) {
        return new JAXBElement<String>(_MiscellaneousSubReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PersonnelReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPersonnelReason(String value) {
        return new JAXBElement<String>(_PersonnelReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PersonnelSubReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPersonnelSubReason(String value) {
        return new JAXBElement<String>(_PersonnelSubReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EquipmentReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEquipmentReason(String value) {
        return new JAXBElement<String>(_EquipmentReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EquipmentSubReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEquipmentSubReason(String value) {
        return new JAXBElement<String>(_EquipmentSubReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EnvironmentReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEnvironmentReason(String value) {
        return new JAXBElement<String>(_EnvironmentReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EnvironmentSubReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEnvironmentSubReason(String value) {
        return new JAXBElement<String>(_EnvironmentSubReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeverityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SeverityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Severity", defaultValue = "normal")
    public JAXBElement<SeverityEnumeration> createSeverity(SeverityEnumeration value) {
        return new JAXBElement<SeverityEnumeration>(_Severity_QNAME, SeverityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceConditionEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ServiceConditionEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Condition")
    public JAXBElement<ServiceConditionEnumeration> createCondition(ServiceConditionEnumeration value) {
        return new JAXBElement<ServiceConditionEnumeration>(_Condition_QNAME, ServiceConditionEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificationStatusEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link VerificationStatusEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VerificationStatus")
    public JAXBElement<VerificationStatusEnumeration> createVerificationStatus(VerificationStatusEnumeration value) {
        return new JAXBElement<VerificationStatusEnumeration>(_VerificationStatus_QNAME, VerificationStatusEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PredictabilityEnumeration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PredictabilityEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Predictability")
    public JAXBElement<PredictabilityEnumeration> createPredictability(PredictabilityEnumeration value) {
        return new JAXBElement<PredictabilityEnumeration>(_Predictability_QNAME, PredictabilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PtSituationElementStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PtSituationElementStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PtSituationElement")
    public JAXBElement<PtSituationElementStructure> createPtSituationElement(PtSituationElementStructure value) {
        return new JAXBElement<PtSituationElementStructure>(_PtSituationElement_QNAME, PtSituationElementStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoadSituationElementStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RoadSituationElementStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RoadSituationElement")
    public JAXBElement<RoadSituationElementStructure> createRoadSituationElement(RoadSituationElementStructure value) {
        return new JAXBElement<RoadSituationElementStructure>(_RoadSituationElement_QNAME, RoadSituationElementStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishToWebActionStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PublishToWebActionStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PublishToWebAction")
    public JAXBElement<PublishToWebActionStructure> createPublishToWebAction(PublishToWebActionStructure value) {
        return new JAXBElement<PublishToWebActionStructure>(_PublishToWebAction_QNAME, PublishToWebActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishToMobileActionStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PublishToMobileActionStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PublishToMobileAction")
    public JAXBElement<PublishToMobileActionStructure> createPublishToMobileAction(PublishToMobileActionStructure value) {
        return new JAXBElement<PublishToMobileActionStructure>(_PublishToMobileAction_QNAME, PublishToMobileActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishToDisplayActionStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PublishToDisplayActionStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PublishToDisplayAction")
    public JAXBElement<PublishToDisplayActionStructure> createPublishToDisplayAction(PublishToDisplayActionStructure value) {
        return new JAXBElement<PublishToDisplayActionStructure>(_PublishToDisplayAction_QNAME, PublishToDisplayActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishToAlertsActionStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PublishToAlertsActionStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PublishToAlertsAction")
    public JAXBElement<PublishToAlertsActionStructure> createPublishToAlertsAction(PublishToAlertsActionStructure value) {
        return new JAXBElement<PublishToAlertsActionStructure>(_PublishToAlertsAction_QNAME, PublishToAlertsActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishToTvActionStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PublishToTvActionStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PublishToTvAction")
    public JAXBElement<PublishToTvActionStructure> createPublishToTvAction(PublishToTvActionStructure value) {
        return new JAXBElement<PublishToTvActionStructure>(_PublishToTvAction_QNAME, PublishToTvActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyBySmsActionStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NotifyBySmsActionStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "NotifyBySmsAction")
    public JAXBElement<NotifyBySmsActionStructure> createNotifyBySmsAction(NotifyBySmsActionStructure value) {
        return new JAXBElement<NotifyBySmsActionStructure>(_NotifyBySmsAction_QNAME, NotifyBySmsActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyByEmailActionStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NotifyByEmailActionStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "NotifyByEmailAction")
    public JAXBElement<NotifyByEmailActionStructure> createNotifyByEmailAction(NotifyByEmailActionStructure value) {
        return new JAXBElement<NotifyByEmailActionStructure>(_NotifyByEmailAction_QNAME, NotifyByEmailActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyByPagerActionStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NotifyByPagerActionStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "NotifyByPagerAction")
    public JAXBElement<NotifyByPagerActionStructure> createNotifyByPagerAction(NotifyByPagerActionStructure value) {
        return new JAXBElement<NotifyByPagerActionStructure>(_NotifyByPagerAction_QNAME, NotifyByPagerActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyUserActionStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NotifyUserActionStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "NotifyUserAction")
    public JAXBElement<NotifyUserActionStructure> createNotifyUserAction(NotifyUserActionStructure value) {
        return new JAXBElement<NotifyUserActionStructure>(_NotifyUserAction_QNAME, NotifyUserActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerInformationActionStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PassengerInformationActionStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PassengerInformationAction")
    public JAXBElement<PassengerInformationActionStructure> createPassengerInformationAction(PassengerInformationActionStructure value) {
        return new JAXBElement<PassengerInformationActionStructure>(_PassengerInformationAction_QNAME, PassengerInformationActionStructure.class, null, value);
    }

}
