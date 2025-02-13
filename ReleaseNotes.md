# v1.0.0

**Breaking changes (OJP v1.0.3 upgrade to OJP v2)**:

* OJP java-model (POJO) v1.0.3 upgraded to OJP v2.0
  * PTModeFilterStructure (OJP 1.0) replaced by ModeFilterStructure (OJP 2.0), property ptModeFilterStructure renamed to modeFilterStructure
* OJP URL configured to Swiss SKI+ OJP 2.0 passive instance
* AccessEnd::timeAimed nullable
* ConnectionEnd::timeAimed nullable
* TripRequestFilter::includeLegProjection renamed to ::includeProjection
* TripRequestFilter::excludeRealtime renamed to ::realtimeMode
* TripLegRequestFilter::projection renamed to ::includeProjection

**Improvements**:

* StopEventRequestFilter::realtimeMode added
* refactoring
  * Java 21
  * duplicates
  * TODOs minimized
  * OJP/SIRI object instantiation
* bug fixes
  * OJPController APIs return CONTEXT-LANGUAGE fallback by OJP router 
  * filtering for preferredLanguage

**Not supported currently (use OJP-Adapter v0.9.0-beta)**:

* OJP SKI+ active instance (Tests disabled)

# v0.9.0-beta
Initial Release, based on Swiss SKI+ OJP v1.0.3

* Contains class OJPAdapter to access OJP and provides functionally working access methods for Public Transportation (PT)
* Contains transmodel like restful controller and WebApplication (OpenAPI 3 RESTful endpoints (Swagger UI))
* Contains Transmodel interfaces derived from https://www.transmodel-cen.eu/downloads/ "Transmodelv6.eap" (Sparx enterprise UML)
* Documentation
* Tests