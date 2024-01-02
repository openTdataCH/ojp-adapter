package swiss.opentransportdata.ojp.adapter.transmodel.passengerinformation.querymodel.commonquery;

import java.util.Locale;

/**
 * Transmodel: PI REQUEST POLICY
 * <p>
 * Optimisation criteria to be used when computing and decorating the results for the PI REQUEST.
 */
public interface PIRequestPolicy {

    // boolean includeAccessibility
    // boolean includeNotices
    // boolean includeFacilities

    /***
     * @return Preferred Language in which to return results.
     */
    Locale getPreferredLanguage();
}