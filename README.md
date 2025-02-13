Author: [Peter Hirzel (Software Architect SBB Journey Planner)](https://github.com/phirzel), 2023  
Licence: [Apache License, Version 2.0](https://opensource.org/license/apache-2-0/)

# About OJP-Adapter

The project contains 2 targets:
1. a simple **OJPAdapter _library_** to request Public-Transportation queries against the **swiss public [_Open Journey-Planner (SKI)_](https://opentransportdata.swiss/de/dataset/ojp2-0)** based on OJP Specification [OJP.xsd](https://github.com/VDVde/OJP/blob/develop/OJP.xsd).
2. a RESTful **OJPController** with a Transmodel implemenation of a Journey-Planner interface

Remark about **OJP SKI+**
* Public Transportation router commissioned by [BAV](https://www.bav.admin.ch/bav/de/home.html)
* Usage for e.g. by [öv-info.ch](https://www.öv-info.ch/de)
* [OJP Wiki]( https://github.com/VDVde/OJP/wiki)
* [OJP-Demo shell and XML insights](https://tools.odpch.ch/beta-ojp-demo/search)

## Goals

Abstracting the complex [VDV OJP.xsd Schema](https://github.com/VDVde/OJP) by Java POJOs, map response properly and provide low-level error-handling.

Anyone (for e.g. public transport-organisation) who plans to use the Swiss OJP router (or other european OJP instances supporting the same protocol version) may try this library to setup a quick working starting point.

The vdv ojp XSD might be quite complex and JAXB POJO generation therefore too!  
Besides, understanding the OJP semantics may mean a steep learning curve for non-insiders.

The author hopes using this OJP-Adapter library may "abstract" the above steps massively, though the resulting OJP model may still be complex to deal with (perhaps check the returned data for a more intuitive understanding as well).

## Known usage

This Software was originally developed for _SBB AG Switzerland, Personenverkehr, CustomerInformation_ by Peter Hirzel (Software Architect Journey-Planner) for experimental reasons:
* APIs (endpoints) under [**SBB Journey-Service**](https://developer.sbb.ch/apis/journey-service/documentation) within tag **Open Journey Planner V3**

## Targets
### OJPAdapter _library_

Contains:
* the **OJP**.xsd **1.0** is transformed into a JAVA POJO (by JAXB) by
  * open-source [bliksemlabs](https://github.com/bliksemlabs/ojp-java-model) or Maven
  * dependency [ojp-java-model](https://central.sonatype.com/artifact/de.vdv/ojp-java-model/1.0.3.1)
* Further documentation:
  * Semantic model description [OJP v1 - Open API for distributed Journey Planning by jmaerki](https://jmaerki.github.io/OJP/generated/OJP.html)

The provided **OJPAdapter** is able to query Swiss SKI+ OJP instances, if configured well (by means your own access token):
* use _OJPAadapter_ for raw native XML handling in conversation with OJP protocol.
* Use of Swiss SKI+ OJP 2.0 API.
* Demonstration of easy filters and response analysis by **OJPAdapterAccessTest**

See:

* [VDV OJP 2.0 Model](https://github.com/VDVde/OJP) base for Java model [Doc](https://vdvde.github.io/OJP/index.html)
* [OJP 2.0 Cookbook](https://opentransportdata.swiss/de/cookbook/ojp2entwicklung/)
* [OJP 2.0 Demo](https://tools.odpch.ch/ojp-demo-v2/search)
* [OJP 2.0 API Explorer (OpenApi 3)](https://opentdatach.github.io/api-explorer2/#/default/OJP2.0)

### OJPController _RESTful Service_

Contains:
* [OJP/Transmodel mapping](https://github.com/VDVde/OJP/blob/develop/docs/transmodel_ojp_mapping/Mapping_OJP_TRANSMODEL_V3.0.xlsx)
* SpringBoot **OJPWebApplication**
* * **OJPController** like subset of [**SBB Journey-Service**](https://developer.sbb.ch/apis/journey-service/documentation) v3 APIs where supported by SKI+ OJP:
* [Transmodel](https://www.transmodel-cen.eu/) like implementation model as used by SBB Customer Information
* Covers **Place, Trip, DatedVehicleJourney (including Departures/Arrivals)**

## Run it

### OJP-Adapter <library>
1. Download repository
2. mvn clean install
3. copy ojp-adapter-integration/src/main/resources/ojp-SAMPLE.properties to ojp.properties and add your own key for SKI+ OJP Instance from [opentransportdata.swiss **passive instance** v2]( https://opentransportdata.swiss/de/dataset/ojp2-0) _"Manage the API key"_
4. run swiss.opentransportdata.ojp.adapter.**.OJPAdapterAccessTest (to try out native OJP XML based request/response)

### OJPWebApplication <service>

1. clone ojp-adapter-service/main/resources/application.yml to application-local.yml and set 'ojp.authorization'
2. run swiss.opentransportdata.ojp.adapter.service.application.**OJPWebApplication** with 'VM Options'=-Dspring.profiles.active=local
3. open [OpenAPI 3 Swagger-UI](http://localhost:8082/swagger-ui/index.html)

Remark:
* At least the OJP passive key should be easy to get.
* For the OJP active instance key you probably need to contact the operation-responsibles.
* If your just interested in Open API 3 Swagger-UI resulting out of ojp-adapter-service/../**OJPController**, see [JSON-specification](open-journey-planner-api_v0.9.0-SNAPSHOT.json)

## History

### ~~OJP v1.0 implementation (DEPRECATED)~~

See [OJP-Adapter v0.9.0-beta](https://github.com/openTdataCH/ojp-adapter/releases/tag/v0.9.0-beta)

* **Currently, OJPAdapter deals with one SINGLE Journey-Planner request at a time**, though MULTIPLE requests could be performed at once.
* Complete OJP set of request-filters (currently the most relevant filters are adapted).
* Complete OJP response mapping (currently the most relevant properties are implemented).
* Quality tests for correctly mapped output should be verified and confirmed by SKI+.