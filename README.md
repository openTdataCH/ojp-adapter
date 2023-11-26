Author: [Peter Hirzel](https://github.com/phirzel), 2023
Licence: [Apache License, Version 2.0](https://opensource.org/license/apache-2-0/)

# About OJP-Adapter
This is a simple OJP-Adapter _library_ to request Public-Transportation queries against the **swiss public Open JourneyPlanner [OJP@Switzerland](https://opentransportdata.swiss/de/dataset/ojp2020)** abstracting the complex [VDV OJP v1.0.1 Schema](https://github.com/VDVde/OJP) by Java POJOs:

* the OJP.xsd is transformed into a JAVA POJO (by JAXB) by
    * open-source [blinksemlabs](https://github.com/bliksemlabs/ojp-java-model) or Maven
    * dependency [ojp-java-model](https://central.sonatype.com/artifact/de.vdv/ojp-java-model/1.0.3.1)
* Documentation of swiss [OJP cookbook](https://opentransportdata.swiss/de/cookbook/)

The provided **OJPAdapter** is able to query Swiss SKI+ OJP instances, if configured well:

* use _OJPAadapter_ for raw native XML handling in conversation with OJP protocol.

## Run it
1. Download repository
2. mvn clean install
3. copy ojp-adapter-integration/src/main/resources/ojp-SAMPLE.properties to ojp.properties and add your own key for SKI+ OJP Instance from [opentransportdata.swiss **passive instance**](https://opentransportdata.swiss/de/dataset/ojp2020)
4. run OJPAdapterAccessTest

Remark:
* At least the OJP passive key should be easy to get.
* For the OJP active instance key you probably need to contact the responsibles.

## Open issues

* **Currently, OJPAdapter deals with one SINGLE Journey-Planner request at a time**, though MULTIPLE requests could be performed at once.
* Complete OJP set of request-filters (currently the most relevant filters are adapted).
* Complete OJP response mapping (currently the most relevant properties are implemented).
* Implement further details marked by _TODO_
* Quality tests for correctly mapped output should be verified and confirmed by SKI+.


# Known usage of OJP-Adapter
This Software was developed for _SBB AG Switzerland, Personenverkehr, Customer Information_ by Peter Hirzel (Software Architect Journey-Planner) for experimental reasons:
* APIs (endpoints) under [**Journey-Service**](https://developer.sbb.ch/apis/journey-service/documentation) within tag **Open Journey Planner V3** 
