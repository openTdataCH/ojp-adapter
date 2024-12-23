package swiss.opentransportdata.ojp.adapter;

import de.vdv.ojp.release2.model.UseRealtimeDataEnumeration;

/**
 * @see de.vdv.ojp.release2.model.UseRealtimeDataEnumeration
 */
public interface RealtimeMode {

    default UseRealtimeDataEnumeration getRealtimeMode() {
        return UseRealtimeDataEnumeration.EXPLANATORY;
    }
}