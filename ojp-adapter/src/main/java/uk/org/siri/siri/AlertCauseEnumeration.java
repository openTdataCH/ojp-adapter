//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AlertCauseEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AlertCauseEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="securityAlert"/&gt;
 *     &lt;enumeration value="emergencyServicesCall"/&gt;
 *     &lt;enumeration value="policeActivity"/&gt;
 *     &lt;enumeration value="policeOrder"/&gt;
 *     &lt;enumeration value="fire"/&gt;
 *     &lt;enumeration value="cableFire"/&gt;
 *     &lt;enumeration value="smokeDetectedOnVehicle"/&gt;
 *     &lt;enumeration value="fireAtStation"/&gt;
 *     &lt;enumeration value="fireRun"/&gt;
 *     &lt;enumeration value="fireBrigadeOrder"/&gt;
 *     &lt;enumeration value="explosion"/&gt;
 *     &lt;enumeration value="explosionHazard"/&gt;
 *     &lt;enumeration value="bombDisposal"/&gt;
 *     &lt;enumeration value="emergencyMedicalServices"/&gt;
 *     &lt;enumeration value="emergencyBrake"/&gt;
 *     &lt;enumeration value="vandalism"/&gt;
 *     &lt;enumeration value="cableTheft"/&gt;
 *     &lt;enumeration value="signalPassedAtDanger"/&gt;
 *     &lt;enumeration value="stationOverrun"/&gt;
 *     &lt;enumeration value="passengersBlockingDoors"/&gt;
 *     &lt;enumeration value="defectiveSecuritySystem"/&gt;
 *     &lt;enumeration value="overcrowded"/&gt;
 *     &lt;enumeration value="borderControl"/&gt;
 *     &lt;enumeration value="unattendedBag"/&gt;
 *     &lt;enumeration value="telephonedThreat"/&gt;
 *     &lt;enumeration value="suspectVehicle"/&gt;
 *     &lt;enumeration value="evacuation"/&gt;
 *     &lt;enumeration value="terroristIncident"/&gt;
 *     &lt;enumeration value="publicDisturbance"/&gt;
 *     &lt;enumeration value="technicalProblem"/&gt;
 *     &lt;enumeration value="vehicleFailure"/&gt;
 *     &lt;enumeration value="serviceDisruption"/&gt;
 *     &lt;enumeration value="doorFailure"/&gt;
 *     &lt;enumeration value="lightingFailure"/&gt;
 *     &lt;enumeration value="pointsProblem"/&gt;
 *     &lt;enumeration value="pointsFailure"/&gt;
 *     &lt;enumeration value="signalProblem"/&gt;
 *     &lt;enumeration value="signalFailure"/&gt;
 *     &lt;enumeration value="overheadWireFailure"/&gt;
 *     &lt;enumeration value="levelCrossingFailure"/&gt;
 *     &lt;enumeration value="trafficManagementSystemFailure"/&gt;
 *     &lt;enumeration value="engineFailure"/&gt;
 *     &lt;enumeration value="breakDown"/&gt;
 *     &lt;enumeration value="repairWork"/&gt;
 *     &lt;enumeration value="constructionWork"/&gt;
 *     &lt;enumeration value="maintenanceWork"/&gt;
 *     &lt;enumeration value="powerProblem"/&gt;
 *     &lt;enumeration value="trackCircuitProblem"/&gt;
 *     &lt;enumeration value="swingBridgeFailure"/&gt;
 *     &lt;enumeration value="escalatorFailure"/&gt;
 *     &lt;enumeration value="liftFailure"/&gt;
 *     &lt;enumeration value="gangwayProblem"/&gt;
 *     &lt;enumeration value="defectiveVehicle"/&gt;
 *     &lt;enumeration value="brokenRail"/&gt;
 *     &lt;enumeration value="poorRailConditions"/&gt;
 *     &lt;enumeration value="deicingWork"/&gt;
 *     &lt;enumeration value="wheelProblem"/&gt;
 *     &lt;enumeration value="routeBlockage"/&gt;
 *     &lt;enumeration value="congestion"/&gt;
 *     &lt;enumeration value="heavyTraffic"/&gt;
 *     &lt;enumeration value="routeDiversion"/&gt;
 *     &lt;enumeration value="roadworks"/&gt;
 *     &lt;enumeration value="unscheduledConstructionWork"/&gt;
 *     &lt;enumeration value="levelCrossingIncident"/&gt;
 *     &lt;enumeration value="sewerageMaintenance"/&gt;
 *     &lt;enumeration value="roadClosed"/&gt;
 *     &lt;enumeration value="roadwayDamage"/&gt;
 *     &lt;enumeration value="bridgeDamage"/&gt;
 *     &lt;enumeration value="personOnTheLine"/&gt;
 *     &lt;enumeration value="objectOnTheLine"/&gt;
 *     &lt;enumeration value="vehicleOnTheLine"/&gt;
 *     &lt;enumeration value="animalOnTheLine"/&gt;
 *     &lt;enumeration value="fallenTreeOnTheLine"/&gt;
 *     &lt;enumeration value="vegetation"/&gt;
 *     &lt;enumeration value="speedRestrictions"/&gt;
 *     &lt;enumeration value="precedingVehicle"/&gt;
 *     &lt;enumeration value="accident"/&gt;
 *     &lt;enumeration value="nearMiss"/&gt;
 *     &lt;enumeration value="personHitByVehicle"/&gt;
 *     &lt;enumeration value="vehicleStruckObject"/&gt;
 *     &lt;enumeration value="vehicleStruckAnimal"/&gt;
 *     &lt;enumeration value="derailment"/&gt;
 *     &lt;enumeration value="collision"/&gt;
 *     &lt;enumeration value="levelCrossingAccident"/&gt;
 *     &lt;enumeration value="poorWeather"/&gt;
 *     &lt;enumeration value="fog"/&gt;
 *     &lt;enumeration value="heavySnowFall"/&gt;
 *     &lt;enumeration value="heavyRain"/&gt;
 *     &lt;enumeration value="strongWinds"/&gt;
 *     &lt;enumeration value="ice"/&gt;
 *     &lt;enumeration value="hail"/&gt;
 *     &lt;enumeration value="highTemperatures"/&gt;
 *     &lt;enumeration value="flooding"/&gt;
 *     &lt;enumeration value="lowWaterLevel"/&gt;
 *     &lt;enumeration value="riskOfFlooding"/&gt;
 *     &lt;enumeration value="highWaterLevel"/&gt;
 *     &lt;enumeration value="fallenLeaves"/&gt;
 *     &lt;enumeration value="fallenTree"/&gt;
 *     &lt;enumeration value="landslide"/&gt;
 *     &lt;enumeration value="riskOfLandslide"/&gt;
 *     &lt;enumeration value="driftingSnow"/&gt;
 *     &lt;enumeration value="blizzardConditions"/&gt;
 *     &lt;enumeration value="stormDamage"/&gt;
 *     &lt;enumeration value="lightningStrike"/&gt;
 *     &lt;enumeration value="roughSea"/&gt;
 *     &lt;enumeration value="highTide"/&gt;
 *     &lt;enumeration value="lowTide"/&gt;
 *     &lt;enumeration value="iceDrift"/&gt;
 *     &lt;enumeration value="avalanches"/&gt;
 *     &lt;enumeration value="riskOfAvalanches"/&gt;
 *     &lt;enumeration value="flashFloods"/&gt;
 *     &lt;enumeration value="mudslide"/&gt;
 *     &lt;enumeration value="rockfalls"/&gt;
 *     &lt;enumeration value="subsidence"/&gt;
 *     &lt;enumeration value="earthquakeDamage"/&gt;
 *     &lt;enumeration value="grassFire"/&gt;
 *     &lt;enumeration value="wildlandFire"/&gt;
 *     &lt;enumeration value="iceOnRailway"/&gt;
 *     &lt;enumeration value="iceOnCarriages"/&gt;
 *     &lt;enumeration value="specialEvent"/&gt;
 *     &lt;enumeration value="procession"/&gt;
 *     &lt;enumeration value="demonstration"/&gt;
 *     &lt;enumeration value="industrialAction"/&gt;
 *     &lt;enumeration value="staffSickness"/&gt;
 *     &lt;enumeration value="staffAbsence"/&gt;
 *     &lt;enumeration value="operatorCeasedTrading"/&gt;
 *     &lt;enumeration value="previousDisturbances"/&gt;
 *     &lt;enumeration value="vehicleBlockingTrack"/&gt;
 *     &lt;enumeration value="foreignDisturbances"/&gt;
 *     &lt;enumeration value="awaitingShuttle"/&gt;
 *     &lt;enumeration value="changeInCarriages"/&gt;
 *     &lt;enumeration value="trainCoupling"/&gt;
 *     &lt;enumeration value="boardingDelay"/&gt;
 *     &lt;enumeration value="awaitingApproach"/&gt;
 *     &lt;enumeration value="overtaking"/&gt;
 *     &lt;enumeration value="provisionDelay"/&gt;
 *     &lt;enumeration value="miscellaneous"/&gt;
 *     &lt;enumeration value="undefinedAlertCause"/&gt;
 *     &lt;enumeration value="incident"/&gt;
 *     &lt;enumeration value="safetyViolation"/&gt;
 *     &lt;enumeration value="trainDoor"/&gt;
 *     &lt;enumeration value="altercation"/&gt;
 *     &lt;enumeration value="illVehicleOccupants"/&gt;
 *     &lt;enumeration value="serviceFailure"/&gt;
 *     &lt;enumeration value="bombExplosion"/&gt;
 *     &lt;enumeration value="fireBrigadeSafetyChecks"/&gt;
 *     &lt;enumeration value="civilEmergency"/&gt;
 *     &lt;enumeration value="airRaid"/&gt;
 *     &lt;enumeration value="sabotage"/&gt;
 *     &lt;enumeration value="bombAlert"/&gt;
 *     &lt;enumeration value="attack"/&gt;
 *     &lt;enumeration value="gunfireOnRoadway"/&gt;
 *     &lt;enumeration value="securityIncident"/&gt;
 *     &lt;enumeration value="linesideFire"/&gt;
 *     &lt;enumeration value="passengerAction"/&gt;
 *     &lt;enumeration value="staffAssault"/&gt;
 *     &lt;enumeration value="railwayCrime"/&gt;
 *     &lt;enumeration value="assault"/&gt;
 *     &lt;enumeration value="theft"/&gt;
 *     &lt;enumeration value="fatality"/&gt;
 *     &lt;enumeration value="personUnderTrain"/&gt;
 *     &lt;enumeration value="personHitByTrain"/&gt;
 *     &lt;enumeration value="personIllOnVehicle"/&gt;
 *     &lt;enumeration value="emergencyServices"/&gt;
 *     &lt;enumeration value="insufficientDemand"/&gt;
 *     &lt;enumeration value="leaderBoardFailure"/&gt;
 *     &lt;enumeration value="serviceIndicatorFailure"/&gt;
 *     &lt;enumeration value="operatorSuspended"/&gt;
 *     &lt;enumeration value="problemsAtBorderPost"/&gt;
 *     &lt;enumeration value="problemsAtCustomsPost"/&gt;
 *     &lt;enumeration value="levelCrossingIncident"/&gt;
 *     &lt;enumeration value="trainStruckAnimal"/&gt;
 *     &lt;enumeration value="trainStruckObject"/&gt;
 *     &lt;enumeration value="roadMaintenance"/&gt;
 *     &lt;enumeration value="asphalting"/&gt;
 *     &lt;enumeration value="paving"/&gt;
 *     &lt;enumeration value="march"/&gt;
 *     &lt;enumeration value="filterBlockade"/&gt;
 *     &lt;enumeration value="sightseersObstructingAccess"/&gt;
 *     &lt;enumeration value="holiday"/&gt;
 *     &lt;enumeration value="bridgeStrike"/&gt;
 *     &lt;enumeration value="viaductFailure"/&gt;
 *     &lt;enumeration value="overheadObstruction"/&gt;
 *     &lt;enumeration value="undefinedProblem"/&gt;
 *     &lt;enumeration value="logisticProblems"/&gt;
 *     &lt;enumeration value="problemsOnLocalRoad"/&gt;
 *     &lt;enumeration value="undefinedProblem"/&gt;
 *     &lt;enumeration value="staffInjury"/&gt;
 *     &lt;enumeration value="contractorStaffInjury"/&gt;
 *     &lt;enumeration value="staffInWrongPlace"/&gt;
 *     &lt;enumeration value="staffShortage"/&gt;
 *     &lt;enumeration value="unofficialIndustrialAction"/&gt;
 *     &lt;enumeration value="workToRule"/&gt;
 *     &lt;enumeration value="undefinedPersonnelProblem"/&gt;
 *     &lt;enumeration value="trainWarningSystemProblem"/&gt;
 *     &lt;enumeration value="signalAndSwitchFailure"/&gt;
 *     &lt;enumeration value="tractionFailure"/&gt;
 *     &lt;enumeration value="defectiveTrain"/&gt;
 *     &lt;enumeration value="wheelImpactLoad"/&gt;
 *     &lt;enumeration value="lackOfOperationalStock"/&gt;
 *     &lt;enumeration value="defectiveFireAlarmEquipment"/&gt;
 *     &lt;enumeration value="defectivePlatformEdgeDoors"/&gt;
 *     &lt;enumeration value="defectiveCctv"/&gt;
 *     &lt;enumeration value="defectivePublicAnnouncementSystem"/&gt;
 *     &lt;enumeration value="ticketingSystemNotAvailable"/&gt;
 *     &lt;enumeration value="emergencyEngineeringWork"/&gt;
 *     &lt;enumeration value="lateFinishToEngineeringWork"/&gt;
 *     &lt;enumeration value="fuelProblem"/&gt;
 *     &lt;enumeration value="closedForMaintenance"/&gt;
 *     &lt;enumeration value="fuelShortage"/&gt;
 *     &lt;enumeration value="slipperyTrack"/&gt;
 *     &lt;enumeration value="luggageCarouselProblem"/&gt;
 *     &lt;enumeration value="undefinedEquipmentProblem"/&gt;
 *     &lt;enumeration value="stormConditions"/&gt;
 *     &lt;enumeration value="tidalRestrictions"/&gt;
 *     &lt;enumeration value="slipperiness"/&gt;
 *     &lt;enumeration value="glazedFrost"/&gt;
 *     &lt;enumeration value="frozen"/&gt;
 *     &lt;enumeration value="sleet"/&gt;
 *     &lt;enumeration value="waterlogged"/&gt;
 *     &lt;enumeration value="sewerOverflow"/&gt;
 *     &lt;enumeration value="undefinedEnvironmentalProblem"/&gt;
 *     &lt;enumeration value="fireAtTheStation"/&gt;
 *     &lt;enumeration value="breakdown"/&gt;
 *     &lt;enumeration value="levelCrossingBlocked"/&gt;
 *     &lt;enumeration value="heavySnowfall"/&gt;
 *     &lt;enumeration value="waitingForTransferPassengers"/&gt;
 *     &lt;enumeration value="awaitingOncomingVehicle"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AlertCauseEnumeration")
@XmlEnum
public enum AlertCauseEnumeration {


    /**
     * TPEG Pts38_0, unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pts38_1, security alert
     * 
     */
    @XmlEnumValue("securityAlert")
    SECURITY_ALERT("securityAlert"),

    /**
     * TPEG Pts38_2, emergency services call
     * 
     */
    @XmlEnumValue("emergencyServicesCall")
    EMERGENCY_SERVICES_CALL("emergencyServicesCall"),

    /**
     * TPEG Pts38_3, police activity
     * 
     */
    @XmlEnumValue("policeActivity")
    POLICE_ACTIVITY("policeActivity"),

    /**
     * TPEG Pts38_4, police order
     * 
     */
    @XmlEnumValue("policeOrder")
    POLICE_ORDER("policeOrder"),

    /**
     * TPEG Pts38_5, fire
     * 
     */
    @XmlEnumValue("fire")
    FIRE("fire"),

    /**
     * TPEG Pts38_6, cable fire
     * 
     */
    @XmlEnumValue("cableFire")
    CABLE_FIRE("cableFire"),

    /**
     * TPEG Pts38_7, smoke detected on vehicle
     * 
     */
    @XmlEnumValue("smokeDetectedOnVehicle")
    SMOKE_DETECTED_ON_VEHICLE("smokeDetectedOnVehicle"),

    /**
     * TPEG Pts38_8, fire at the station
     * 
     */
    @XmlEnumValue("fireAtStation")
    FIRE_AT_STATION("fireAtStation"),

    /**
     * TPEG Pts38_9, fire run
     * 
     */
    @XmlEnumValue("fireRun")
    FIRE_RUN("fireRun"),

    /**
     * TPEG Pts38_10, fire brigade order
     * 
     */
    @XmlEnumValue("fireBrigadeOrder")
    FIRE_BRIGADE_ORDER("fireBrigadeOrder"),

    /**
     * TPEG Pts38_11, explosion
     * 
     */
    @XmlEnumValue("explosion")
    EXPLOSION("explosion"),

    /**
     * TPEG Pts38_12, explosion hazard
     * 
     */
    @XmlEnumValue("explosionHazard")
    EXPLOSION_HAZARD("explosionHazard"),

    /**
     * TPEG Pts38_13, bomb disposal
     * 
     */
    @XmlEnumValue("bombDisposal")
    BOMB_DISPOSAL("bombDisposal"),

    /**
     * TPEG Pts38_14, emergency medical services
     * 
     */
    @XmlEnumValue("emergencyMedicalServices")
    EMERGENCY_MEDICAL_SERVICES("emergencyMedicalServices"),

    /**
     * TPEG Pts38_15, emergency brake
     * 
     */
    @XmlEnumValue("emergencyBrake")
    EMERGENCY_BRAKE("emergencyBrake"),

    /**
     * TPEG Pts38_16, vandalism
     * 
     */
    @XmlEnumValue("vandalism")
    VANDALISM("vandalism"),

    /**
     * TPEG Pts38_17, cable theft
     * 
     */
    @XmlEnumValue("cableTheft")
    CABLE_THEFT("cableTheft"),

    /**
     * TPEG Pts38_18, signal passed at danger
     * 
     */
    @XmlEnumValue("signalPassedAtDanger")
    SIGNAL_PASSED_AT_DANGER("signalPassedAtDanger"),

    /**
     * TPEG Pts38_19, station overrun
     * 
     */
    @XmlEnumValue("stationOverrun")
    STATION_OVERRUN("stationOverrun"),

    /**
     * TPEG Pts38_20, passengers blocking doors
     * 
     */
    @XmlEnumValue("passengersBlockingDoors")
    PASSENGERS_BLOCKING_DOORS("passengersBlockingDoors"),

    /**
     * TPEG Pts38_21, defective security system
     * 
     */
    @XmlEnumValue("defectiveSecuritySystem")
    DEFECTIVE_SECURITY_SYSTEM("defectiveSecuritySystem"),

    /**
     * TPEG Pts38_22, overcrowded
     * 
     */
    @XmlEnumValue("overcrowded")
    OVERCROWDED("overcrowded"),

    /**
     * TPEG Pts38_23, border control
     * 
     */
    @XmlEnumValue("borderControl")
    BORDER_CONTROL("borderControl"),

    /**
     * TPEG Pts38_24, unattended bag
     * 
     */
    @XmlEnumValue("unattendedBag")
    UNATTENDED_BAG("unattendedBag"),

    /**
     * TPEG Pts38_25, telephoned threat
     * 
     */
    @XmlEnumValue("telephonedThreat")
    TELEPHONED_THREAT("telephonedThreat"),

    /**
     * TPEG Pts38_26, suspect vehicle
     * 
     */
    @XmlEnumValue("suspectVehicle")
    SUSPECT_VEHICLE("suspectVehicle"),

    /**
     * TPEG Pts38_27, evacuation
     * 
     */
    @XmlEnumValue("evacuation")
    EVACUATION("evacuation"),

    /**
     * TPEG Pts38_28, terrorist incident
     * 
     */
    @XmlEnumValue("terroristIncident")
    TERRORIST_INCIDENT("terroristIncident"),

    /**
     * TPEG Pts38_29, public disturbance
     * 
     */
    @XmlEnumValue("publicDisturbance")
    PUBLIC_DISTURBANCE("publicDisturbance"),

    /**
     * TPEG Pts38_30, technical problem
     * 
     */
    @XmlEnumValue("technicalProblem")
    TECHNICAL_PROBLEM("technicalProblem"),

    /**
     * TPEG Pts38_31, vehicle failure
     * 
     */
    @XmlEnumValue("vehicleFailure")
    VEHICLE_FAILURE("vehicleFailure"),

    /**
     * TPEG Pts38_32, service disruption
     * 
     */
    @XmlEnumValue("serviceDisruption")
    SERVICE_DISRUPTION("serviceDisruption"),

    /**
     * TPEG Pts38_33, door failure
     * 
     */
    @XmlEnumValue("doorFailure")
    DOOR_FAILURE("doorFailure"),

    /**
     * TPEG Pts38_34, lighting failure
     * 
     */
    @XmlEnumValue("lightingFailure")
    LIGHTING_FAILURE("lightingFailure"),

    /**
     * TPEG Pts38_35, points problem
     * 
     */
    @XmlEnumValue("pointsProblem")
    POINTS_PROBLEM("pointsProblem"),

    /**
     * TPEG Pts38_36, points failure
     * 
     */
    @XmlEnumValue("pointsFailure")
    POINTS_FAILURE("pointsFailure"),

    /**
     * TPEG Pts38_37, signal problem
     * 
     */
    @XmlEnumValue("signalProblem")
    SIGNAL_PROBLEM("signalProblem"),

    /**
     * TPEG Pts38_38, signal failure
     * 
     */
    @XmlEnumValue("signalFailure")
    SIGNAL_FAILURE("signalFailure"),

    /**
     * TPEG Pts38_39, overhead wire failure
     * 
     */
    @XmlEnumValue("overheadWireFailure")
    OVERHEAD_WIRE_FAILURE("overheadWireFailure"),

    /**
     * TPEG Pts38_40, level crossing failure
     * 
     */
    @XmlEnumValue("levelCrossingFailure")
    LEVEL_CROSSING_FAILURE("levelCrossingFailure"),

    /**
     * TPEG Pts38_41, traffic management system failure
     * 
     */
    @XmlEnumValue("trafficManagementSystemFailure")
    TRAFFIC_MANAGEMENT_SYSTEM_FAILURE("trafficManagementSystemFailure"),

    /**
     * TPEG Pts38_42, engine failure
     * 
     */
    @XmlEnumValue("engineFailure")
    ENGINE_FAILURE("engineFailure"),

    /**
     * TPEG Pts38_43, break down
     * 
     */
    @XmlEnumValue("breakDown")
    BREAK_DOWN("breakDown"),

    /**
     * TPEG Pts38_44, repair work
     * 
     */
    @XmlEnumValue("repairWork")
    REPAIR_WORK("repairWork"),

    /**
     * TPEG Pts38_45, construction work
     * 
     */
    @XmlEnumValue("constructionWork")
    CONSTRUCTION_WORK("constructionWork"),

    /**
     * TPEG Pts38_46, maintenance work
     * 
     */
    @XmlEnumValue("maintenanceWork")
    MAINTENANCE_WORK("maintenanceWork"),

    /**
     * TPEG Pts38_47, power problem
     * 
     */
    @XmlEnumValue("powerProblem")
    POWER_PROBLEM("powerProblem"),

    /**
     * TPEG Pts38_48, track circuit
     * 
     */
    @XmlEnumValue("trackCircuitProblem")
    TRACK_CIRCUIT_PROBLEM("trackCircuitProblem"),

    /**
     * TPEG Pts38_49, swing bridge failure
     * 
     */
    @XmlEnumValue("swingBridgeFailure")
    SWING_BRIDGE_FAILURE("swingBridgeFailure"),

    /**
     * TPEG Pts38_50, escalator failure
     * 
     */
    @XmlEnumValue("escalatorFailure")
    ESCALATOR_FAILURE("escalatorFailure"),

    /**
     * TPEG Pts38_51, lift failure
     * 
     */
    @XmlEnumValue("liftFailure")
    LIFT_FAILURE("liftFailure"),

    /**
     * TPEG Pts38_52, gangway problem
     * 
     */
    @XmlEnumValue("gangwayProblem")
    GANGWAY_PROBLEM("gangwayProblem"),

    /**
     * TPEG Pts38_53, defective vehicle
     * 
     */
    @XmlEnumValue("defectiveVehicle")
    DEFECTIVE_VEHICLE("defectiveVehicle"),

    /**
     * TPEG Pts38_54, broken rail
     * 
     */
    @XmlEnumValue("brokenRail")
    BROKEN_RAIL("brokenRail"),

    /**
     * TPEG Pts38_55, poor rail conditions
     * 
     */
    @XmlEnumValue("poorRailConditions")
    POOR_RAIL_CONDITIONS("poorRailConditions"),

    /**
     * TPEG Pts38_56, de-icing work
     * 
     */
    @XmlEnumValue("deicingWork")
    DEICING_WORK("deicingWork"),

    /**
     * TPEG Pts38_57, wheel problem
     * 
     */
    @XmlEnumValue("wheelProblem")
    WHEEL_PROBLEM("wheelProblem"),

    /**
     * TPEG Pts38_58, route blockage
     * 
     */
    @XmlEnumValue("routeBlockage")
    ROUTE_BLOCKAGE("routeBlockage"),

    /**
     * TPEG Pts38_59, congestion
     * 
     */
    @XmlEnumValue("congestion")
    CONGESTION("congestion"),

    /**
     * TPEG Pts38_60, heavy traffic
     * 
     */
    @XmlEnumValue("heavyTraffic")
    HEAVY_TRAFFIC("heavyTraffic"),

    /**
     * TPEG Pts38_61, route diversion
     * 
     */
    @XmlEnumValue("routeDiversion")
    ROUTE_DIVERSION("routeDiversion"),

    /**
     * TPEG Pts38_62, roadworks
     * 
     */
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),

    /**
     * TPEG Pts38_63, unscheduled construction work
     * 
     */
    @XmlEnumValue("unscheduledConstructionWork")
    UNSCHEDULED_CONSTRUCTION_WORK("unscheduledConstructionWork"),

    /**
     * TPEG Pts38_64, level crossing incident
     * 
     */
    @XmlEnumValue("levelCrossingIncident")
    LEVEL_CROSSING_INCIDENT("levelCrossingIncident"),

    /**
     * TPEG Pts38_65, sewerageMaintenance 
     * 
     */
    @XmlEnumValue("sewerageMaintenance")
    SEWERAGE_MAINTENANCE("sewerageMaintenance"),

    /**
     * TPEG Pts38_66, road closed
     * 
     */
    @XmlEnumValue("roadClosed")
    ROAD_CLOSED("roadClosed"),

    /**
     * TPEG Pts38_67, roadway damage
     * 
     */
    @XmlEnumValue("roadwayDamage")
    ROADWAY_DAMAGE("roadwayDamage"),

    /**
     * TPEG Pts38_68, bridge damage
     * 
     */
    @XmlEnumValue("bridgeDamage")
    BRIDGE_DAMAGE("bridgeDamage"),

    /**
     * TPEG Pts38_69, person on the line
     * 
     */
    @XmlEnumValue("personOnTheLine")
    PERSON_ON_THE_LINE("personOnTheLine"),

    /**
     * TPEG Pts38_70, object on the line
     * 
     */
    @XmlEnumValue("objectOnTheLine")
    OBJECT_ON_THE_LINE("objectOnTheLine"),

    /**
     * TPEG Pts38_71, vehicle on the line
     * 
     */
    @XmlEnumValue("vehicleOnTheLine")
    VEHICLE_ON_THE_LINE("vehicleOnTheLine"),

    /**
     * TPEG Pts38_72, animal on the line
     * 
     */
    @XmlEnumValue("animalOnTheLine")
    ANIMAL_ON_THE_LINE("animalOnTheLine"),

    /**
     * TPEG Pts38_73, fallen tree on the line
     * 
     */
    @XmlEnumValue("fallenTreeOnTheLine")
    FALLEN_TREE_ON_THE_LINE("fallenTreeOnTheLine"),

    /**
     * TPEG Pts38_74, vegetation
     * 
     */
    @XmlEnumValue("vegetation")
    VEGETATION("vegetation"),

    /**
     * TPEG Pts38_75, speed restrictions
     * 
     */
    @XmlEnumValue("speedRestrictions")
    SPEED_RESTRICTIONS("speedRestrictions"),

    /**
     * TPEG Pts38_76, preceding vehicle
     * 
     */
    @XmlEnumValue("precedingVehicle")
    PRECEDING_VEHICLE("precedingVehicle"),

    /**
     * TPEG Pts38_77, accident
     * 
     */
    @XmlEnumValue("accident")
    ACCIDENT("accident"),

    /**
     * TPEG Pts38_78, near miss
     * 
     */
    @XmlEnumValue("nearMiss")
    NEAR_MISS("nearMiss"),

    /**
     * TPEG Pts38_79, person hit by vehicle
     * 
     */
    @XmlEnumValue("personHitByVehicle")
    PERSON_HIT_BY_VEHICLE("personHitByVehicle"),

    /**
     * TPEG Pts38_80, vehicle struck object
     * 
     */
    @XmlEnumValue("vehicleStruckObject")
    VEHICLE_STRUCK_OBJECT("vehicleStruckObject"),

    /**
     * TPEG Pts38_81, vehicle struck animal
     * 
     */
    @XmlEnumValue("vehicleStruckAnimal")
    VEHICLE_STRUCK_ANIMAL("vehicleStruckAnimal"),

    /**
     * TPEG Pts38_82, derailment
     * 
     */
    @XmlEnumValue("derailment")
    DERAILMENT("derailment"),

    /**
     * TPEG Pts38_83, collision
     * 
     */
    @XmlEnumValue("collision")
    COLLISION("collision"),

    /**
     * TPEG Pts38_84, level crossing accident
     * 
     */
    @XmlEnumValue("levelCrossingAccident")
    LEVEL_CROSSING_ACCIDENT("levelCrossingAccident"),

    /**
     * TPEG Pts38_85, poor weather
     * 
     */
    @XmlEnumValue("poorWeather")
    POOR_WEATHER("poorWeather"),

    /**
     * TPEG Pts38_86, fog
     * 
     */
    @XmlEnumValue("fog")
    FOG("fog"),

    /**
     * TPEG Pts38_87, heavy snowfall
     * 
     */
    @XmlEnumValue("heavySnowFall")
    HEAVY_SNOW_FALL("heavySnowFall"),

    /**
     * TPEG Pts38_88, heavy rain
     * 
     */
    @XmlEnumValue("heavyRain")
    HEAVY_RAIN("heavyRain"),

    /**
     * TPEG Pts38_89, strong winds
     * 
     */
    @XmlEnumValue("strongWinds")
    STRONG_WINDS("strongWinds"),

    /**
     * TPEG Pts38_90, ice
     * 
     */
    @XmlEnumValue("ice")
    ICE("ice"),

    /**
     * TPEG Pts38_91, hail
     * 
     */
    @XmlEnumValue("hail")
    HAIL("hail"),

    /**
     * TPEG Pts38_92, high temperatures
     * 
     */
    @XmlEnumValue("highTemperatures")
    HIGH_TEMPERATURES("highTemperatures"),

    /**
     * TPEG Pts38_93, flooding
     * 
     */
    @XmlEnumValue("flooding")
    FLOODING("flooding"),

    /**
     * TPEG Pts38_94, low water level
     * 
     */
    @XmlEnumValue("lowWaterLevel")
    LOW_WATER_LEVEL("lowWaterLevel"),

    /**
     * TPEG Pts38_95, risk of flooding
     * 
     */
    @XmlEnumValue("riskOfFlooding")
    RISK_OF_FLOODING("riskOfFlooding"),

    /**
     * TPEG Pts38_96, high water level
     * 
     */
    @XmlEnumValue("highWaterLevel")
    HIGH_WATER_LEVEL("highWaterLevel"),

    /**
     * TPEG Pts38_97, fallen leaves
     * 
     */
    @XmlEnumValue("fallenLeaves")
    FALLEN_LEAVES("fallenLeaves"),

    /**
     * TPEG Pts38_98, fallen tree
     * 
     */
    @XmlEnumValue("fallenTree")
    FALLEN_TREE("fallenTree"),

    /**
     * TPEG Pts38_99, landslide
     * 
     */
    @XmlEnumValue("landslide")
    LANDSLIDE("landslide"),

    /**
     * TPEG Pts38_100, risk of landslide
     * 
     */
    @XmlEnumValue("riskOfLandslide")
    RISK_OF_LANDSLIDE("riskOfLandslide"),

    /**
     * TPEG Pts38_101, drifting snow
     * 
     */
    @XmlEnumValue("driftingSnow")
    DRIFTING_SNOW("driftingSnow"),

    /**
     * TPEG Pts38_102, blizzard conditions
     * 
     */
    @XmlEnumValue("blizzardConditions")
    BLIZZARD_CONDITIONS("blizzardConditions"),

    /**
     * TPEG Pts38_103, storm damage
     * 
     */
    @XmlEnumValue("stormDamage")
    STORM_DAMAGE("stormDamage"),

    /**
     * TPEG Pts38_104, lightning strike
     * 
     */
    @XmlEnumValue("lightningStrike")
    LIGHTNING_STRIKE("lightningStrike"),

    /**
     * TPEG Pts38_105, rough sea
     * 
     */
    @XmlEnumValue("roughSea")
    ROUGH_SEA("roughSea"),

    /**
     * TPEG Pts38_106, high tide
     * 
     */
    @XmlEnumValue("highTide")
    HIGH_TIDE("highTide"),

    /**
     * TPEG Pts38_107, low tide
     * 
     */
    @XmlEnumValue("lowTide")
    LOW_TIDE("lowTide"),

    /**
     * TPEG Pts38_108, ice drift
     * 
     */
    @XmlEnumValue("iceDrift")
    ICE_DRIFT("iceDrift"),

    /**
     * TPEG Pts38_109, avalanches
     * 
     */
    @XmlEnumValue("avalanches")
    AVALANCHES("avalanches"),

    /**
     * TPEG Pts38_110, risk of avalanches
     * 
     */
    @XmlEnumValue("riskOfAvalanches")
    RISK_OF_AVALANCHES("riskOfAvalanches"),

    /**
     * TPEG Pts38_111, flash floods
     * 
     */
    @XmlEnumValue("flashFloods")
    FLASH_FLOODS("flashFloods"),

    /**
     * TPEG Pts38_112, mudslide
     * 
     */
    @XmlEnumValue("mudslide")
    MUDSLIDE("mudslide"),

    /**
     * TPEG Pts38_113, rockfalls
     * 
     */
    @XmlEnumValue("rockfalls")
    ROCKFALLS("rockfalls"),

    /**
     * TPEG Pts38_114, subsidence
     * 
     */
    @XmlEnumValue("subsidence")
    SUBSIDENCE("subsidence"),

    /**
     * TPEG Pts38_115, earthquake damage
     * 
     */
    @XmlEnumValue("earthquakeDamage")
    EARTHQUAKE_DAMAGE("earthquakeDamage"),

    /**
     * TPEG Pts38_116, grass fire
     * 
     */
    @XmlEnumValue("grassFire")
    GRASS_FIRE("grassFire"),

    /**
     * TPEG Pts38_117, wildland fire
     * 
     */
    @XmlEnumValue("wildlandFire")
    WILDLAND_FIRE("wildlandFire"),

    /**
     * TPEG Pts38_118, ice on railway
     * 
     */
    @XmlEnumValue("iceOnRailway")
    ICE_ON_RAILWAY("iceOnRailway"),

    /**
     * TPEG Pts38_119, ice on carriages
     * 
     */
    @XmlEnumValue("iceOnCarriages")
    ICE_ON_CARRIAGES("iceOnCarriages"),

    /**
     * TPEG Pts38_120, special event
     * 
     */
    @XmlEnumValue("specialEvent")
    SPECIAL_EVENT("specialEvent"),

    /**
     * TPEG Pts38_121, procession
     * 
     */
    @XmlEnumValue("procession")
    PROCESSION("procession"),

    /**
     * TPEG Pts38_122, demonstration
     * 
     */
    @XmlEnumValue("demonstration")
    DEMONSTRATION("demonstration"),

    /**
     * TPEG Pts38_123, industrial action
     * 
     */
    @XmlEnumValue("industrialAction")
    INDUSTRIAL_ACTION("industrialAction"),

    /**
     * TPEG Pts38_124, staff sickness
     * 
     */
    @XmlEnumValue("staffSickness")
    STAFF_SICKNESS("staffSickness"),

    /**
     * TPEG Pts38_125, staff absence
     * 
     */
    @XmlEnumValue("staffAbsence")
    STAFF_ABSENCE("staffAbsence"),

    /**
     * TPEG Pts38_126, operator ceased trading
     * 
     */
    @XmlEnumValue("operatorCeasedTrading")
    OPERATOR_CEASED_TRADING("operatorCeasedTrading"),

    /**
     * TPEG Pts38_127, previous disturbances
     * 
     */
    @XmlEnumValue("previousDisturbances")
    PREVIOUS_DISTURBANCES("previousDisturbances"),

    /**
     * TPEG Pts38_128, vehicle blocking track
     * 
     */
    @XmlEnumValue("vehicleBlockingTrack")
    VEHICLE_BLOCKING_TRACK("vehicleBlockingTrack"),

    /**
     * TPEG Pts38_129, foreign disturbances
     * 
     */
    @XmlEnumValue("foreignDisturbances")
    FOREIGN_DISTURBANCES("foreignDisturbances"),

    /**
     * TPEG Pts38_130, awaiting shuttle
     * 
     */
    @XmlEnumValue("awaitingShuttle")
    AWAITING_SHUTTLE("awaitingShuttle"),

    /**
     * TPEG Pts38_131, change in carriages
     * 
     */
    @XmlEnumValue("changeInCarriages")
    CHANGE_IN_CARRIAGES("changeInCarriages"),

    /**
     * TPEG Pts38_132, train coupling
     * 
     */
    @XmlEnumValue("trainCoupling")
    TRAIN_COUPLING("trainCoupling"),

    /**
     * TPEG Pts38_133, boarding delay
     * 
     */
    @XmlEnumValue("boardingDelay")
    BOARDING_DELAY("boardingDelay"),

    /**
     * TPEG Pts38_134, awaiting approach
     * 
     */
    @XmlEnumValue("awaitingApproach")
    AWAITING_APPROACH("awaitingApproach"),

    /**
     * TPEG Pts38_135, overtaking
     * 
     */
    @XmlEnumValue("overtaking")
    OVERTAKING("overtaking"),

    /**
     * TPEG Pts38_136, provision delay
     * 
     */
    @XmlEnumValue("provisionDelay")
    PROVISION_DELAY("provisionDelay"),

    /**
     * TPEG Pts38_137, miscellaneous
     * 
     */
    @XmlEnumValue("miscellaneous")
    MISCELLANEOUS("miscellaneous"),

    /**
     * TPEG Pts38_255, undefined alert cause
     * 
     */
    @XmlEnumValue("undefinedAlertCause")
    UNDEFINED_ALERT_CAUSE("undefinedAlertCause"),

    /**
     * TPEG Pti19_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("incident")
    INCIDENT("incident"),

    /**
     * TPEG Pti19_1_2, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("safetyViolation")
    SAFETY_VIOLATION("safetyViolation"),

    /**
     * TPEG Pti19_1_5, DEPRECATED since SIRI 2.1 - replaced by Pts38_33, door failure
     * 
     */
    @XmlEnumValue("trainDoor")
    TRAIN_DOOR("trainDoor"),

    /**
     * TPEG Pti19_1_7, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("altercation")
    ALTERCATION("altercation"),

    /**
     * TPEG Pti19_1_8, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("illVehicleOccupants")
    ILL_VEHICLE_OCCUPANTS("illVehicleOccupants"),

    /**
     * TPEG Pti19_1_12, DEPRECATED since SIRI 2.1 - replaced by Pts38_32, service disruption
     * 
     */
    @XmlEnumValue("serviceFailure")
    SERVICE_FAILURE("serviceFailure"),

    /**
     * TPEG Pti19_2, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("bombExplosion")
    BOMB_EXPLOSION("bombExplosion"),

    /**
     * TPEG Pti19_3_2, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("fireBrigadeSafetyChecks")
    FIRE_BRIGADE_SAFETY_CHECKS("fireBrigadeSafetyChecks"),

    /**
     * TPEG Pti19_3_6, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("civilEmergency")
    CIVIL_EMERGENCY("civilEmergency"),

    /**
     * TPEG Pti19_3_7, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("airRaid")
    AIR_RAID("airRaid"),

    /**
     * TPEG Pti19_3_8, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("sabotage")
    SABOTAGE("sabotage"),

    /**
     * TPEG Pti19_3_9, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("bombAlert")
    BOMB_ALERT("bombAlert"),

    /**
     * TPEG Pti19_3_10, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("attack")
    ATTACK("attack"),

    /**
     * TPEG Pti19_3_13, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("gunfireOnRoadway")
    GUNFIRE_ON_ROADWAY("gunfireOnRoadway"),

    /**
     * TPEG Pti19_3_16, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("securityIncident")
    SECURITY_INCIDENT("securityIncident"),

    /**
     * TPEG Pti19_4_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("linesideFire")
    LINESIDE_FIRE("linesideFire"),

    /**
     * TPEG Pti19_5_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("passengerAction")
    PASSENGER_ACTION("passengerAction"),

    /**
     * TPEG Pti19_5_2, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("staffAssault")
    STAFF_ASSAULT("staffAssault"),

    /**
     * TPEG Pti19_5_3, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("railwayCrime")
    RAILWAY_CRIME("railwayCrime"),

    /**
     * TPEG Pti19_5_4, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("assault")
    ASSAULT("assault"),

    /**
     * TPEG Pti19_5_5, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("theft")
    THEFT("theft"),

    /**
     * TPEG Pti19_6_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("fatality")
    FATALITY("fatality"),

    /**
     * TPEG Pti19_6_2, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("personUnderTrain")
    PERSON_UNDER_TRAIN("personUnderTrain"),

    /**
     * TPEG Pti19_6_3, DEPRECATED since SIRI 2.1 - replaced by Pts38_79, person hit by vehicle
     * 
     */
    @XmlEnumValue("personHitByTrain")
    PERSON_HIT_BY_TRAIN("personHitByTrain"),

    /**
     * TPEG Pti19_6_4, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("personIllOnVehicle")
    PERSON_ILL_ON_VEHICLE("personIllOnVehicle"),

    /**
     * TPEG Pti19_6_5, DEPRECATED since SIRI 2.1 - replaced by Pts38_14, emergency medical services
     * 
     */
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),

    /**
     * TPEG Pti19_8, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("insufficientDemand")
    INSUFFICIENT_DEMAND("insufficientDemand"),

    /**
     * TPEG Pti19_10, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("leaderBoardFailure")
    LEADER_BOARD_FAILURE("leaderBoardFailure"),

    /**
     * TPEG Pti19_11, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("serviceIndicatorFailure")
    SERVICE_INDICATOR_FAILURE("serviceIndicatorFailure"),

    /**
     * TPEG Pti19_14, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("operatorSuspended")
    OPERATOR_SUSPENDED("operatorSuspended"),

    /**
     * TPEG Pti19_15_1, DEPRECATED since SIRI 2.1 - replaced by Pts38_23, border control
     * 
     */
    @XmlEnumValue("problemsAtBorderPost")
    PROBLEMS_AT_BORDER_POST("problemsAtBorderPost"),

    /**
     * TPEG Pti19_15_2, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("problemsAtCustomsPost")
    PROBLEMS_AT_CUSTOMS_POST("problemsAtCustomsPost"),

    /**
     * TPEG Pti19_19_3, DEPRECATED since SIRI 2.1 - replaced by Pts38_81, vehicle struck animal
     * 
     */
    @XmlEnumValue("trainStruckAnimal")
    TRAIN_STRUCK_ANIMAL("trainStruckAnimal"),

    /**
     * TPEG Pti19_19_4, DEPRECATED since SIRI 2.1 - replaced by Pts38_80, vehicle struck object
     * 
     */
    @XmlEnumValue("trainStruckObject")
    TRAIN_STRUCK_OBJECT("trainStruckObject"),

    /**
     * TPEG Pti19_23_2, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("roadMaintenance")
    ROAD_MAINTENANCE("roadMaintenance"),

    /**
     * TPEG Pti19_23_3, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("asphalting")
    ASPHALTING("asphalting"),

    /**
     * TPEG Pti19_23_4, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("paving")
    PAVING("paving"),

    /**
     * TPEG Pti19_24_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("march")
    MARCH("march"),

    /**
     * TPEG Pti19_24_5, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("filterBlockade")
    FILTER_BLOCKADE("filterBlockade"),

    /**
     * TPEG Pti19_24_6, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("sightseersObstructingAccess")
    SIGHTSEERS_OBSTRUCTING_ACCESS("sightseersObstructingAccess"),

    /**
     * TPEG Pti19_24_7, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("holiday")
    HOLIDAY("holiday"),

    /**
     * TPEG Pti19_25, DEPRECATED since SIRI 2.1 - replaced by Pts38_68, bridge damage
     * 
     */
    @XmlEnumValue("bridgeStrike")
    BRIDGE_STRIKE("bridgeStrike"),

    /**
     * TPEG Pti19_25_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("viaductFailure")
    VIADUCT_FAILURE("viaductFailure"),

    /**
     * TPEG Pti19_26, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("overheadObstruction")
    OVERHEAD_OBSTRUCTION("overheadObstruction"),

    /**
     * TPEG Pti19_255, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("undefinedProblem")
    UNDEFINED_PROBLEM("undefinedProblem"),

    /**
     * TPEG Pti19_255_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("logisticProblems")
    LOGISTIC_PROBLEMS("logisticProblems"),

    /**
     * TPEG Pti19_255_2, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("problemsOnLocalRoad")
    PROBLEMS_ON_LOCAL_ROAD("problemsOnLocalRoad"),

    /**
     * TPEG Pti20_1_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("staffInjury")
    STAFF_INJURY("staffInjury"),

    /**
     * TPEG Pti20_1_2, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("contractorStaffInjury")
    CONTRACTOR_STAFF_INJURY("contractorStaffInjury"),

    /**
     * TPEG Pti20_3, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("staffInWrongPlace")
    STAFF_IN_WRONG_PLACE("staffInWrongPlace"),

    /**
     * TPEG Pti20_4, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("staffShortage")
    STAFF_SHORTAGE("staffShortage"),

    /**
     * TPEG Pti20_5_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("unofficialIndustrialAction")
    UNOFFICIAL_INDUSTRIAL_ACTION("unofficialIndustrialAction"),

    /**
     * TPEG Pti20_6, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("workToRule")
    WORK_TO_RULE("workToRule"),

    /**
     * TPEG Pti20_255, DEPRECATED since SIRI 2.1 - replaced by Pts38_255, undefined alert cause
     * 
     */
    @XmlEnumValue("undefinedPersonnelProblem")
    UNDEFINED_PERSONNEL_PROBLEM("undefinedPersonnelProblem"),

    /**
     * TPEG Pti21_3_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("trainWarningSystemProblem")
    TRAIN_WARNING_SYSTEM_PROBLEM("trainWarningSystemProblem"),

    /**
     * TPEG Pti21_4_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("signalAndSwitchFailure")
    SIGNAL_AND_SWITCH_FAILURE("signalAndSwitchFailure"),

    /**
     * TPEG Pti21_6_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("tractionFailure")
    TRACTION_FAILURE("tractionFailure"),

    /**
     * TPEG Pti21_6_2, DEPRECATED since SIRI 2.1 - replaced by Pts38_53, defective vehicle
     * 
     */
    @XmlEnumValue("defectiveTrain")
    DEFECTIVE_TRAIN("defectiveTrain"),

    /**
     * TPEG Pti21_8_3, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("wheelImpactLoad")
    WHEEL_IMPACT_LOAD("wheelImpactLoad"),

    /**
     * TPEG Pti21_8_4, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("lackOfOperationalStock")
    LACK_OF_OPERATIONAL_STOCK("lackOfOperationalStock"),

    /**
     * TPEG Pti21_8_5, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("defectiveFireAlarmEquipment")
    DEFECTIVE_FIRE_ALARM_EQUIPMENT("defectiveFireAlarmEquipment"),

    /**
     * TPEG Pti21_8_6, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("defectivePlatformEdgeDoors")
    DEFECTIVE_PLATFORM_EDGE_DOORS("defectivePlatformEdgeDoors"),

    /**
     * TPEG Pti21_8_7, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("defectiveCctv")
    DEFECTIVE_CCTV("defectiveCctv"),

    /**
     * TPEG Pti21_8_8, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("defectivePublicAnnouncementSystem")
    DEFECTIVE_PUBLIC_ANNOUNCEMENT_SYSTEM("defectivePublicAnnouncementSystem"),

    /**
     * TPEG Pti21_8_9, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("ticketingSystemNotAvailable")
    TICKETING_SYSTEM_NOT_AVAILABLE("ticketingSystemNotAvailable"),

    /**
     * TPEG Pti21_11_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("emergencyEngineeringWork")
    EMERGENCY_ENGINEERING_WORK("emergencyEngineeringWork"),

    /**
     * TPEG Pti21_11_2, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("lateFinishToEngineeringWork")
    LATE_FINISH_TO_ENGINEERING_WORK("lateFinishToEngineeringWork"),

    /**
     * TPEG Pti21_13, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("fuelProblem")
    FUEL_PROBLEM("fuelProblem"),

    /**
     * TPEG Pti21_18, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("closedForMaintenance")
    CLOSED_FOR_MAINTENANCE("closedForMaintenance"),

    /**
     * TPEG Pti21_19, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("fuelShortage")
    FUEL_SHORTAGE("fuelShortage"),

    /**
     * TPEG Pti21_21_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("slipperyTrack")
    SLIPPERY_TRACK("slipperyTrack"),

    /**
     * TPEG Pti21_22, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("luggageCarouselProblem")
    LUGGAGE_CAROUSEL_PROBLEM("luggageCarouselProblem"),

    /**
     * TPEG Pti21_255, DEPRECATED since SIRI 2.1 - replaced by Pts38_255, undefined alert cause
     * 
     */
    @XmlEnumValue("undefinedEquipmentProblem")
    UNDEFINED_EQUIPMENT_PROBLEM("undefinedEquipmentProblem"),

    /**
     * TPEG Pti22_5_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("stormConditions")
    STORM_CONDITIONS("stormConditions"),

    /**
     * TPEG Pti22_6, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("tidalRestrictions")
    TIDAL_RESTRICTIONS("tidalRestrictions"),

    /**
     * TPEG Pti22_9_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("slipperiness")
    SLIPPERINESS("slipperiness"),

    /**
     * TPEG Pti22_9_3, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("glazedFrost")
    GLAZED_FROST("glazedFrost"),

    /**
     * TPEG Pti22_10, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("frozen")
    FROZEN("frozen"),

    /**
     * TPEG Pti22_11_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("sleet")
    SLEET("sleet"),

    /**
     * TPEG Pti22_14, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("waterlogged")
    WATERLOGGED("waterlogged"),

    /**
     * TPEG Pti22_255_2, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("sewerOverflow")
    SEWER_OVERFLOW("sewerOverflow"),

    /**
     * TPEG Pti22_255, DEPRECATED since SIRI 2.1 - replaced by Pts38_255, undefined alert cause
     * 
     */
    @XmlEnumValue("undefinedEnvironmentalProblem")
    UNDEFINED_ENVIRONMENTAL_PROBLEM("undefinedEnvironmentalProblem"),

    /**
     * See also TPEG Pts38_8 value 'fireAtStation'.
     * 
     */
    @XmlEnumValue("fireAtTheStation")
    FIRE_AT_THE_STATION("fireAtTheStation"),

    /**
     * See also TPEG Pts38_43 value 'breakDown'.
     * 
     */
    @XmlEnumValue("breakdown")
    BREAKDOWN("breakdown"),

    /**
     * See also TPEG Pts38_64 value 'levelCrossingIncident'.
     * 
     */
    @XmlEnumValue("levelCrossingBlocked")
    LEVEL_CROSSING_BLOCKED("levelCrossingBlocked"),

    /**
     * See also TPEG Pts38_87 value 'heavySnowFall'.
     * 
     */
    @XmlEnumValue("heavySnowfall")
    HEAVY_SNOWFALL("heavySnowfall"),

    /**
     * See also TPEG Pts38_130 value 'awaitingShuttle'.
     * 
     */
    @XmlEnumValue("waitingForTransferPassengers")
    WAITING_FOR_TRANSFER_PASSENGERS("waitingForTransferPassengers"),

    /**
     * See also TPEG Pts38_134 value 'awaitingApproach'.
     * 
     */
    @XmlEnumValue("awaitingOncomingVehicle")
    AWAITING_ONCOMING_VEHICLE("awaitingOncomingVehicle");
    private final String value;

    AlertCauseEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertCauseEnumeration fromValue(String v) {
        for (AlertCauseEnumeration c: AlertCauseEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
