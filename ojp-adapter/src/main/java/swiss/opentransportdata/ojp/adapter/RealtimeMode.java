package swiss.opentransportdata.ojp.adapter;

import de.vdv.ojp.v2.model.UseRealtimeDataEnumeration;

/**
 * @see UseRealtimeDataEnumeration
 */
public interface RealtimeMode {

    default UseRealtimeDataEnumeration getRealtimeMode() {
        return UseRealtimeDataEnumeration.EXPLANATORY;
    }
}