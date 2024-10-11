/*
 * Copyright 2024 Peter Hirzel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package swiss.opentransportdata.ojp.adapter.service.opentransportdata.transportmode;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import lombok.NonNull;
import lombok.experimental.UtilityClass;
import swiss.opentransportdata.ojp.adapter.service.error.DeveloperException;

/**
 * v580 de:Verkehrsmittelkategorien welche bei SBB-SKI als Opentransportdata "TransportModes" geführt werden.
 * <p>
 * Günter Matthias sagt: Was wir für NeTEx gemacht haben:
 * <ul>
 *     <li>Im CSV ist in Spalte O angegeben, was wir daraus für GTFS gemacht haben.</li>
 *     <li>Wir haben dann (in OJP?) möglichst viel über die ProductCategoryRef gemacht.</li>
 *     <li>OSDM uses TAP-TSI/UIC subset of SIRI Transport Modes.</li>
 * </ul>
 *
 * @see <a href="https://www.allianceswisspass.ch/de/Themen/TarifeVorschriften/V580/Produkte-der-V580-FIScommun-1">v580 Verkehrsmittellisten</a>
 * @see <a href="https://opentransportdata.swiss/de/dataset/vm-liste">Transportmodes table</a>
 * @see <a href="https://github.com/SchweizerischeBundesbahnen/journey-service/blob/master/TransportMode.md>About Transportmode</a>
 * @see swiss.opentransportdata.ojp.adapter.transmodel.v6.part10.alternativemodes.reusablecomponents.vehicletype.VehicleType
 */
@UtilityClass
public final class TransportModeData {

    /**
     * NeTex values - consumer should use Opentransportdata map itself See column "Ref_NeTEx".
     * <p>
     * Multiple reuse and less precise than v580!
     */
    public static final String NETEX_VEHICLE_MODE_RAIL = "RAIL";
    // also "coach"
    private static final String NETEX_VEHICLE_MODE_BUS = "BUS";
    private static final String NETEX_VEHICLE_MODE_METRO = "METRO";
    private static final String NETEX_VEHICLE_MODE_TRAM = "TRAM";
    private static final String NETEX_VEHICLE_MODE_WATER = "WATER";
    private static final String NETEX_VEHICLE_MODE_CABLEWAY = "CABLEWAY";
    private static final String NETEX_VEHICLE_MODE_FUNICULAR = "FUNICULAR";
    private static final String NETEX_VEHICLE_MODE_AIR = "AIR";
    private static final String NETEX_VEHICLE_MODE_OTHER = "OTHER";
    private static final String NETEX_VEHICLE_MODE_UNKNOWN = "UNKNOWN";

    private static final String TRANSPORT_MODE_OTD_CODE_UNKNOWN = "U";
    private static final String TRANSPORT_SUBMODE_OTD_CODE_UNKNOWN = "UUU";
    private static final String TRANSPORT_SUBMODE_OTD_CODE_PLANE = "AIR";

    private static final EnumMap<VehicleType, VehicleModeEnum> TRANSPORT_MODES = new EnumMap<>(VehicleType.class);

    private static final Map<String, VehicleModeEnum> TRANSPORT_MODES_BY_CODE = new HashMap<>();

    private static final EnumMap<VehicleType, String> TRANSPORT_MODES_NETEX = new EnumMap<>(VehicleType.class);

    /*
     * Allowed values for MODES of Public Transport applicable to timetabled public transport.
     *
     * NeTEx:
     * <code>
     *     <xsd:simpleType name="VehicleModeEnumeration">
     *              <xsd:annotation>
     *                     <xsd:documentation>Allowed values for MODES of Public Transport applicable to timetabled public transport.</xsd:documentation>
     *              </xsd:annotation>
     *              <xsd:restriction base="xsd:NMTOKEN">
     *                     <xsd:enumeration value="air"/>
     *                     <xsd:enumeration value="bus"/>
     *                     <xsd:enumeration value="coach"/>
     *                     <xsd:enumeration value="ferry"/>
     *                     <xsd:enumeration value="metro"/>
     *                     <xsd:enumeration value="rail"/>
     *                     <xsd:enumeration value="trolleyBus"/>
     *                     <xsd:enumeration value="tram"/>
     *                     <xsd:enumeration value="water"/>
     *                     <xsd:enumeration value="cableway"/>
     *                     <xsd:enumeration value="funicular"/>
     *                     <xsd:enumeration value="lift"/>
     *                     <xsd:enumeration value="snowAndIce"/>
     *                     <xsd:enumeration value="other"/>
     *              </xsd:restriction>
     *        </xsd:simpleType>
     *
     *        <xsd:simpleType name="VehicleModeListOfEnumerations">
     *              <xsd:annotation>
     *                     <xsd:documentation>Allowed values for List of PT MODES of transport applicable to timetabled public transport.</xsd:documentation>
     *              </xsd:annotation>
     *              <xsd:list itemType="VehicleModeEnumeration"/>
     *        </xsd:simpleType>
     *
     *        <xsd:element name="RoadVehicleMode" type="AllModesEnumeration">
     *              <xsd:annotation>
     *                     <xsd:documentation>Road Vehicle MODE: a characterisation of the operation according to the means of transport (bus, tram, coach).</xsd:documentation>
     *              </xsd:annotation>
     *        </xsd:element>
     *        <xsd:simpleType name="RoadVehicleModeEnumeration">
     *              <xsd:annotation>
     *                     <xsd:documentation>Allowed values for MODES of Public Transport applicable to timetabled public transport.</xsd:documentation>
     *              </xsd:annotation>
     *              <xsd:restriction base="xsd:NMTOKEN">
     *                     <xsd:enumeration value="bus"/>
     *                     <xsd:enumeration value="coach"/>
     *                      <xsd:enumeration value="trolleyBus"/>
     *                     <xsd:enumeration value="tram"/>
     *              </xsd:restriction>
     *        </xsd:simpleType>
     *
     *        <xsd:element name="AllVehicleModes" type="AllVehicleModesOfTransportEnumeration">
     *              <xsd:annotation>
     *                     <xsd:documentation>All MODEs including vehicle transport and self drive.</xsd:documentation>
     *              </xsd:annotation>
     *        </xsd:element>
     *        <xsd:simpleType name="AllModesEnumeration">
     *              <xsd:annotation>
     *                     <xsd:documentation>Allowed values for r MODES: TPEG pti_table 01.</xsd:documentation>
     *              </xsd:annotation>
     *              <xsd:restriction base="xsd:NMTOKEN">
     *                     <xsd:enumeration value="all"/>
     *                     <xsd:enumeration value="anyMode"/>
     *                     <xsd:enumeration value="unknown"/>
     *                     <xsd:enumeration value="air"/>
     *                     <xsd:enumeration value="bus"/>
     *                     <xsd:enumeration value="trolleyBus"/>
     *                     <xsd:enumeration value="tram"/>
     *                     <xsd:enumeration value="coach"/>
     *                     <xsd:enumeration value="rail"/>
     *                     <xsd:enumeration value="intercityRail"/>
     *                      <xsd:enumeration value="urbanRail"/>
     *                     <xsd:enumeration value="metro"/>
     *                     <xsd:enumeration value="water"/>
     *                     <xsd:enumeration value="ferry"/>
     *                     <xsd:enumeration value="cableway"/>
     *                     <xsd:enumeration value="funicular"/>
     *                     <xsd:enumeration value="lift"/>
     *                     <xsd:enumeration value="snowAndIce"/>
     *                     <xsd:enumeration value="taxi"/>
     *                     <xsd:enumeration value="selfDrive">
     *                            <xsd:annotation>
     *                                   <xsd:documentation>See pti12_x.</xsd:documentation>
     *                            </xsd:annotation>
     *                     </xsd:enumeration>
     *                     <xsd:enumeration value="foot"/>
     *                     <xsd:enumeration value="bicycle"/>
     *                     <xsd:enumeration value="motorcycle"/>
     *                     <xsd:enumeration value="scooter"/>
     *                     <xsd:enumeration value="car"/>
     *                     <xsd:enumeration value="shuttle"/>
     *                     <!-- NOT IN tpeg -->
     *                     <!-- NOT IN tpeg -->
     *              </xsd:restriction>
     *        </xsd:simpleType>
     * </code>
     */
    static {
        // Opentransportdata TransportModes:
        TRANSPORT_MODES.put(VehicleType.TRAIN, VehicleModeEnum.TRAIN);
        TRANSPORT_MODES.put(VehicleType.BUS, VehicleModeEnum.BUS);
        TRANSPORT_MODES.put(VehicleType.CHAIRLIFT, VehicleModeEnum.CHAIRLIFT);
        TRANSPORT_MODES.put(VehicleType.COG_RAILWAY, VehicleModeEnum.COG_RAILWAY);
        TRANSPORT_MODES.put(VehicleType.CABLEWAY /*GONDOLA !*/, VehicleModeEnum.GONDOLA);
        TRANSPORT_MODES.put(VehicleType.METRO, VehicleModeEnum.METRO);
        TRANSPORT_MODES.put(VehicleType.FUNICULAR, VehicleModeEnum.CABLEWAY);
        TRANSPORT_MODES.put(VehicleType.BOAT, VehicleModeEnum.SHIP);
        TRANSPORT_MODES.put(VehicleType.TRAMWAY, VehicleModeEnum.TRAMWAY);
        // NeTEx other; VehicleType.LIFT
        TRANSPORT_MODES.put(VehicleType.LIFT, VehicleModeEnum.ELEVATOR);
        // Non-PT: Mentioned by v580; NeTEx vehicle-enum; TAP TSI (OSDM)
        TRANSPORT_MODES.put(VehicleType.AIRPLANE, VehicleModeEnum.PLANE);
        TRANSPORT_MODES.put(VehicleType.TAXI, VehicleModeEnum.TAXI);

        TRANSPORT_MODES_BY_CODE.put("Z", VehicleModeEnum.TRAIN);
        TRANSPORT_MODES_BY_CODE.put("B", VehicleModeEnum.BUS);
        TRANSPORT_MODES_BY_CODE.put("E", VehicleModeEnum.CHAIRLIFT);
        TRANSPORT_MODES_BY_CODE.put("H", VehicleModeEnum.COG_RAILWAY);
        TRANSPORT_MODES_BY_CODE.put("L", VehicleModeEnum.GONDOLA);
        TRANSPORT_MODES_BY_CODE.put("M", VehicleModeEnum.METRO);
        TRANSPORT_MODES_BY_CODE.put("N", VehicleModeEnum.CABLEWAY);
        TRANSPORT_MODES_BY_CODE.put("S", VehicleModeEnum.SHIP);
        TRANSPORT_MODES_BY_CODE.put("T", VehicleModeEnum.TRAMWAY);
        TRANSPORT_MODES_BY_CODE.put("A" /*de: Aufzug*/, VehicleModeEnum.ELEVATOR);
        // and "Z" for UNKNOWN

        TRANSPORT_MODES_NETEX.put(VehicleType.TRAIN, NETEX_VEHICLE_MODE_RAIL);
        TRANSPORT_MODES_NETEX.put(VehicleType.BUS, NETEX_VEHICLE_MODE_BUS /*TODO or "coach", "trolley"*/);
        TRANSPORT_MODES_NETEX.put(VehicleType.CHAIRLIFT, NETEX_VEHICLE_MODE_CABLEWAY);
        TRANSPORT_MODES_NETEX.put(VehicleType.COG_RAILWAY, NETEX_VEHICLE_MODE_RAIL);
        TRANSPORT_MODES_NETEX.put(VehicleType.CABLEWAY /*GONDOLA !*/, NETEX_VEHICLE_MODE_CABLEWAY);
        TRANSPORT_MODES_NETEX.put(VehicleType.METRO, NETEX_VEHICLE_MODE_METRO);
        TRANSPORT_MODES_NETEX.put(VehicleType.FUNICULAR, NETEX_VEHICLE_MODE_FUNICULAR);
        TRANSPORT_MODES_NETEX.put(VehicleType.BOAT, NETEX_VEHICLE_MODE_WATER /*TODO or "ferry"*/);
        TRANSPORT_MODES_NETEX.put(VehicleType.TRAMWAY, NETEX_VEHICLE_MODE_TRAM);
        // NeTEx other; VehicleType.LIFT
        TRANSPORT_MODES_NETEX.put(VehicleType.LIFT, NETEX_VEHICLE_MODE_OTHER);
        // Non-PT: Mentioned by v580; NeTEx vehicle-enum; TAP TSI (OSDM)
        TRANSPORT_MODES_NETEX.put(VehicleType.AIRPLANE, NETEX_VEHICLE_MODE_AIR);
        TRANSPORT_MODES_NETEX.put(VehicleType.TAXI, "TAXI");
    }

    @NonNull
    public static VehicleModeEnum toVehicleModeEnum(@NonNull VehicleType vehicleType) {
        final VehicleModeEnum result = TRANSPORT_MODES.get(vehicleType);
        if (result == null) {
            throw new DeveloperException("Opendata.ch TransportModes data not available: " + vehicleType);
        }
        return result;
    }

    /**
     * @param vehicleType transport mode from OpenTransportData.ch in upper case
     * @return VehicleModeEnum or null if not mapped or unknown
     */
    public static VehicleModeEnum toVehicleModeEnumFromOtd(@NonNull String vehicleType, String vehicleSubMode) {
        if (TRANSPORT_MODE_OTD_CODE_UNKNOWN.equals(vehicleType)) {
            if (TRANSPORT_SUBMODE_OTD_CODE_PLANE.equals(vehicleSubMode)) {
                return VehicleModeEnum.PLANE;
            } else {
                // among other "UUU" for unknown
                return null;
            }
        }
        return TRANSPORT_MODES_BY_CODE.get(vehicleType);
    }

    public static final String TRAIN_ICON_SUFFIX = "t02";
    public static final String BUS_ICON_SUFFIX = "t06";
    public static final String TRAMWAY_ICON_SUFFIX = "t04";
    public static final String BOAT_ICON_SUFFIX = "t12";
    public static final String METRO_ICON_SUFFIX = "r";
    public static final String CABLEWAY_ICON_SUFFIX = "t22";
    public static final String CHAIRLIFT_ICON_SUFFIX = "t25";
    public static final String FUNICULAR_ICON_SUFFIX = "t21";
    public static final String COG_RAILWAY_ICON_SUFFIX = "r";
    public static final String TAXI_ICON_SUFFIX = "t29";
    public static final String LIFT_ICON_SUFFIX = "lift";
    public static final String AIRPLANE_ICON_SUFFIX = "t10";

    public static String getCorporateIdentityIcon(VehicleModeEnum vehicleMode) {
        if (vehicleMode == null) {
            return null;
        }
        return switch (vehicleMode) {
            case TRAIN:
                yield "SBB_oev_b_" + TRAIN_ICON_SUFFIX;
            case BUS:
                yield "SBB_oev_b_" + BUS_ICON_SUFFIX;
            case CHAIRLIFT:
                yield "SBB_oev_b_" + CHAIRLIFT_ICON_SUFFIX;
            case COG_RAILWAY:
                yield "SBB_oev_zahnradbahn_" + COG_RAILWAY_ICON_SUFFIX;
            case GONDOLA:
                yield "SBB_oev_b_" + CABLEWAY_ICON_SUFFIX;
            case METRO:
                yield "SBB_oev_metro_" + METRO_ICON_SUFFIX;
            case SHIP:
                yield "SBB_oev_b_" + BOAT_ICON_SUFFIX;
            case CABLEWAY:
                yield "SBB_oev_b_" + FUNICULAR_ICON_SUFFIX;
            case TRAMWAY:
                yield "SBB_oev_b_" + TRAMWAY_ICON_SUFFIX;
            case ELEVATOR:
                yield "SBB_oev_" + LIFT_ICON_SUFFIX;
            case PLANE:
                yield "SBB_oev_b_" + AIRPLANE_ICON_SUFFIX;
            case TAXI:
                yield "SBB_oev_b_" + TAXI_ICON_SUFFIX;
        };
    }

    /**
     * @param netexMode as given by OJP for e.g. "rail"
     * @return
     */
    @NonNull
    public static String mapToTransportMode(@NonNull String netexMode) {
        if (TransportModeData.NETEX_VEHICLE_MODE_RAIL.equalsIgnoreCase(netexMode)) {
            //TODO consider NeTexSubMode as well -> "rail" maps to TRAIN && COG_RAILWAY :(
            return VehicleModeEnum.TRAIN.name();
        }
        for (String netexCode : TRANSPORT_MODES_NETEX.values()) {
            if (netexCode.equals(netexMode.toUpperCase())) {
                return netexCode;
            }
        }
        throw new DeveloperException("OJP mode not mapped yet: " + netexMode);
    }
}
