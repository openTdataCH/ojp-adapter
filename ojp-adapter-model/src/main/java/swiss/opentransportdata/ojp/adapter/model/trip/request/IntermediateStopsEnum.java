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

    /**
     * First entry becomes defaultValue by OpenApi if not further restricted!
     */
    public static final String ALL_AS_STRING = "ALL";
    public static final String BOARDING_ALIGHTING_AS_STRING = "BOARDING_ALIGHTING";
    public static final String NONE_AS_STRING = "NONE";
}
