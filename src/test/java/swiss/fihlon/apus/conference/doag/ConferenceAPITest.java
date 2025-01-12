/*
 * Apus - A social wall for conferences with additional features.
 * Copyright (C) Marcus Fihlon and the individual contributors to Apus.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package swiss.fihlon.apus.conference.doag;

import org.junit.jupiter.api.Test;
import swiss.fihlon.apus.conference.Session;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConferenceAPITest {

    @Test
    void importViaHttps() {
        final String location = "file:src/test/resources/DOAG.json";
        final ConferenceAPI conferenceAPI = new ConferenceAPI(location);
        final List<Session> sessions = conferenceAPI.getSessions();
        assertEquals(8, sessions.size());
    }

}
