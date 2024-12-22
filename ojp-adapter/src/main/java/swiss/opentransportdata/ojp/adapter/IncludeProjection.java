package swiss.opentransportdata.ojp.adapter;

/**
 * @see de.vdv.ojp.release2.model.TripParamStructure#setIncludeLegProjection(Boolean)
 */
public interface IncludeProjection {

    default boolean isIncludeProjection() {
        return false;
    }
}
