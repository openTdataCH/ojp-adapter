Author: [Peter Hirzel (Software Architect SBB Journey Planner)](https://github.com/phirzel), 2023  
Licence: [Apache License, Version 2.0](https://opensource.org/license/apache-2-0/)

# About OJP-Adapter

This is a simple OJP-Adapter _library_ to request Public-Transportation queries against the **swiss public [_Open Journey-Planner (SKI)_](https://opentransportdata.swiss/de/dataset/ojp2020)**.

Remark about **OJP SKI**
* Public Transportation router in order to [BAV](https://www.bav.admin.ch/bav/de/home.html)
* Usage for e.g. by [öv-info.ch](https://www.öv-info.ch/de)

## Goals

Abstracting the complex [VDV OJP v1.0.1 Schema](https://github.com/VDVde/OJP) by Java POJOs, map response properly and provide low-level error-handling.

Anyone (for e.g. public transport-organisation) who plans to use the Swiss OJP router (or other european OJP instances supporting the same protocol version) may try this library to setup a quick working starting point.

The vdv ojp XSD might be quite complex and JAXB POJO generation therefore too!  
Besides, understanding the OJP semantics may mean a steep learning curve for non-insiders.

The author hopes using this OJP-Adapter library may "abstract" the above steps massively, though the resulting OJP model may still be complex to deal with (perhaps check the returned data for a more intuitive understanding as well).

## Content

* the OJP.xsd is transformed into a JAVA POJO (by JAXB) by
  * open-source [bliksemlabs](https://github.com/bliksemlabs/ojp-java-model) or Maven
  * dependency [ojp-java-model](https://central.sonatype.com/artifact/de.vdv/ojp-java-model/1.0.3.1)
* Further documentation:
  * Swiss [OJP cookbook](https://opentransportdata.swiss/de/cookbook/)
  * Semantic model description [OJP - Open API for distributed Journey Planning by jmaerki](https://jmaerki.github.io/OJP/generated/OJP.html)

The provided **OJPAdapter** is able to query Swiss SKI+ OJP instances, if configured well (by means your own access token):
* use _OJPAadapter_ for raw native XML handling in conversation with OJP protocol.

## Run it
1. Download repository
2. mvn clean install
3. copy ojp-adapter-integration/src/main/resources/ojp-SAMPLE.properties to ojp.properties and add your own key for SKI+ OJP Instance from [opentransportdata.swiss **passive instance**](https://opentransportdata.swiss/de/dataset/ojp2020) _"Manage the API key"_
4. run swiss.opentransportdata.ojp.adapter.v1.OJPAdapterAccessTest (to try out native OJP XML based request/response)
5. run swiss.opentransportdata.ojp.adapter.service.application.**OJPWebApplication** and open [OpenAPI 3 Swagger-UI](http://localhost:8082/swagger-ui/index.html)

Remark:
* At least the OJP passive key should be easy to get.
* For the OJP active instance key you probably need to contact the operation-responsibles.

## Open issues

### Module "ojp-adapter"

* **Currently, OJPAdapter deals with one SINGLE Journey-Planner request at a time**, though MULTIPLE requests could be performed at once.
* Complete OJP set of request-filters (currently the most relevant filters are adapted).
* Complete OJP response mapping (currently the most relevant properties are implemented).
* Implement further details marked by _TODO_
* Quality tests for correctly mapped output should be verified and confirmed by SKI+.

### Module "ojp-transmodel" & "Swagger-UI"

* Planned for the near future: **further extension of OJPController** like subset of [**SBB Journey-Service**](https://developer.sbb.ch/apis/journey-service/documentation) v0 APIs where supported by SKI+ OJP:
  * [Transmodel](https://www.transmodel-cen.eu/) like implementation model as used by SBB Customer Information
  * Model mapper between VDV specification to the Transmodel like implementaiton model
  * Simple [OpenApi 3](https://swagger.io/blog/news/whats-new-in-openapi-3-0/) REST API based application

## Known usage
This Software was originally developed for _SBB AG Switzerland, Personenverkehr, Customer Information_ by Peter Hirzel (Software Architect Journey-Planner) for experimental reasons:

* APIs (endpoints) under [**SBB Journey-Service**](https://developer.sbb.ch/apis/journey-service/documentation) within tag **Open Journey Planner V3**