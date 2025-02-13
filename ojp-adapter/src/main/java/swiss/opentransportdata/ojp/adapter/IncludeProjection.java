package swiss.opentransportdata.ojp.adapter;

import de.vdv.ojp.v2.model.TripParamStructure;

/**
 * @see TripParamStructure#setIncludeLegProjection(Boolean)
 */
public interface IncludeProjection {

    default boolean isIncludeProjection() {
        return false;
    }
}
