package swiss.opentransportdata.ojp.adapter.model.trip.request;

/**
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#TripContentFilterGroup">OJP TripContentFilter::IncludeIntermediateStops</a>
 */
public enum IntermediateStopsEnum {

    /**
     * BOARDING_ALIGHTING + virtual Stop's
     */
    ALL,
    /**
     * OJP IncludeIntermediateStops=true
     */
    BOARDING_ALIGHTING,
    /**
     * OJP IncludeIntermediateStops=false
     */
    NONE;

    public static final String INTERMEDIATE_STOPS_ALL = "ALL";
    public static final String INTERMEDIATE_STOPS_BOARDING_ALIGHTING = "BOARDING_ALIGHTING";
    public static final String INTERMEDIATE_STOPS_NONE = "NONE";
}
