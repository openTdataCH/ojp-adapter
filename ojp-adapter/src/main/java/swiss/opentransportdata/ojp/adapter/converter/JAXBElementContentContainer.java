/*
 * Copyright 2023 Peter Hirzel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package swiss.opentransportdata.ojp.adapter.converter;

import de.vdv.ojp.GeneralAttributeStructure;
import de.vdv.ojp.InternationalTextStructure;
import de.vdv.ojp.JourneyRefStructure;
import de.vdv.ojp.ModeStructure;
import de.vdv.ojp.OperatingDayRefStructure;
import de.vdv.ojp.model.DirectionRefStructure;
import de.vdv.ojp.model.LineRefStructure;
import de.vdv.ojp.model.OperatorRefStructure;
import de.vdv.ojp.model.StopPointRefStructure;
import jakarta.xml.bind.JAXBElement;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import swiss.opentransportdata.ojp.adapter.OJPAdapter;
import swiss.opentransportdata.ojp.adapter.OJPException;

/**
 * Nasty OJP 1.0 class, due to OJP's XML generic structure.
 *
 * @author Peter Hirzel
 * @deprecated OJP 2.0 provides these properties by {@link de.vdv.ojp.release2.model.DatedJourneyStructure}
 */
@Deprecated(since = "OJP 2.0")
@Slf4j
@Getter
public final class JAXBElementContentContainer {

    List<OperatingDayRefStructure> operatingDays = new ArrayList<>();

    List<JourneyRefStructure> journeyRefs = new ArrayList<>();

    List<LineRefStructure> lines = new ArrayList<>();

    List<GeneralAttributeStructure> generalAttributes = new ArrayList<>();

    List<DirectionRefStructure> directions = new ArrayList<>();

    List<ModeStructure> modes = new ArrayList<>();

    List<OperatorRefStructure> operators = new ArrayList<>();

    List<StopPointRefStructure> stopPoints = new ArrayList<>();

    List<String> publishedLineNames = new ArrayList<>();

    // TODO unused yet
    List<String> originTexts = new ArrayList<>();

    // TODO unused yet
    List<String> destinationStopPointRefTexts = new ArrayList<>();

    List<String> destinationTexts = new ArrayList<>();

    Boolean deviation;

    // TODO unused yet
    Boolean unplanned;

    /**
     * TODO remove OJP 1.0 way or still needed
     * @param jaxbElements generic list of JAXBElement's
     */
    @Deprecated(since = "OJP 2.0")
    public JAXBElementContentContainer(List<JAXBElement<?>> jaxbElements) {

        for (JAXBElement<?> jaxbElement : jaxbElements) {
            if (jaxbElement.getDeclaredType() == OperatingDayRefStructure.class) {
                operatingDays.add((OperatingDayRefStructure) jaxbElement.getValue());
            } else if (jaxbElement.getDeclaredType() == JourneyRefStructure.class) {
                journeyRefs.add((JourneyRefStructure) jaxbElement.getValue());
            } else if (jaxbElement.getDeclaredType() == LineRefStructure.class) {
                lines.add((LineRefStructure) jaxbElement.getValue());
            } else if (jaxbElement.getDeclaredType() == DirectionRefStructure.class) {
                directions.add((DirectionRefStructure) jaxbElement.getValue());
            } else if (jaxbElement.getDeclaredType() == ModeStructure.class) {
                modes.add((ModeStructure) jaxbElement.getValue());
            } else if (jaxbElement.getDeclaredType() == InternationalTextStructure.class) {
                if (isOjpNamespace(jaxbElement)) {
                    if ("PublishedLineName".equals(jaxbElement.getName().getLocalPart())) {
                        // scope: class de.vdv.ojp.DatedJourneyStructure
                        publishedLineNames.add(OJPAdapter.getText(((de.vdv.ojp.release2.model.InternationalTextStructure) jaxbElement.getValue())));
                    } else if ("OriginText".equals(jaxbElement.getName().getLocalPart())) {
                        // scope: class de.vdv.ojp.DatedJourneyStructure
                        originTexts.add(OJPAdapter.getText(((de.vdv.ojp.release2.model.InternationalTextStructure) jaxbElement.getValue())));
                    } else if ("DestinationText".equals(jaxbElement.getName().getLocalPart())) {
                        // scope: class de.vdv.ojp.DatedJourneyStructure
                        destinationTexts.add(OJPAdapter.getText(((de.vdv.ojp.release2.model.InternationalTextStructure) jaxbElement.getValue())));
                    } else if ("DestinationStopPointRef".equals(jaxbElement.getName().getLocalPart())) {
                        // scope: class de.vdv.ojp.DatedJourneyStructure
                        destinationStopPointRefTexts.add(OJPAdapter.getText(((de.vdv.ojp.release2.model.InternationalTextStructure) jaxbElement.getValue())));
                    } else {
                        //TODO JAXBElement unknown InternationalTextStructure=[text=[lang=de,value=Basel SBB]]
                        log.debug("JAXBElement unknown OJP::InternationalTextStructure={}", jaxbElement.getValue());
                    }
                } else {
                    //TODO JAXBElement unknown InternationalTextStructure=[text=[lang=de,value=Basel SBB]]
                    log.debug("JAXBElement unknown InternationalTextStructure={}", jaxbElement.getDeclaredType());
                }
            } else if (jaxbElement.getDeclaredType() == OperatorRefStructure.class) {
                operators.add((OperatorRefStructure) jaxbElement.getValue());
            } else if (jaxbElement.getDeclaredType() == GeneralAttributeStructure.class) {
                generalAttributes.add((GeneralAttributeStructure) jaxbElement.getValue());
            } else if (jaxbElement.getDeclaredType() == StopPointRefStructure.class) {
                stopPoints.add((StopPointRefStructure) jaxbElement.getValue());
            } else if (jaxbElement.getDeclaredType() == Boolean.class) {
                if (jaxbElement.getName().getLocalPart().equals("Deviation") && isOjpNamespace(jaxbElement)) {
                    // QName _DatedJourneyStructureDeviation_QNAME = new QName("http://www.vdv.de/ojp", "Deviation"); -> redirected Boolean
                    if (deviation != null) {
                        throw new OJPException("deviation multiple not expected");
                    }
                    deviation = (Boolean) jaxbElement.getValue();
                } else if (jaxbElement.getName().getLocalPart().equals("Unplanned") && isOjpNamespace(jaxbElement)) {
                    if (unplanned != null) {
                        throw new OJPException("unplanned multiple not expected");
                    }
                    unplanned = (Boolean) jaxbElement.getValue();
                } else {
                    log.warn("JAXBElement unknown Boolean name={}, declaredType={}", jaxbElement.getName(), jaxbElement.getDeclaredType());
                }
            } else {
                /*TODO see de.vdv.ojp.ObjectFactory; relates to https://jmaerki.github.io/OJP/generated/OJP.html#TripStatusGroup
                    "infeasible" -> Trip::valid seems not yet contained ?
                    "delayed" ?
                    QName _DatedJourneyStructureUnplanned_QNAME = new QName("http://www.vdv.de/ojp", "Unplanned");
                    QName _DatedJourneyStructureCancelled_QNAME = new QName("http://www.vdv.de/ojp", "Cancelled");
                    QName _DatedJourneyStructureOccupancy_QNAME = new QName("http://www.vdv.de/ojp", "Occupancy");
                    QName _DatedJourneyStructureBookingArrangements_QNAME = new QName("http://www.vdv.de/ojp", "BookingArrangements");
                 */
                log.warn("JAXBElement unknown name={}, declaredType={}", jaxbElement.getName(), jaxbElement.getDeclaredType());
            }
        }
    }

    private static boolean isOjpNamespace(JAXBElement<?> jaxbElement) {
        return "http://www.vdv.de/ojp" .equals(jaxbElement.getName().getNamespaceURI());
    }
}
