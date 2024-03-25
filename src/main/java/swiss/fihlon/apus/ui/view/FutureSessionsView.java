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
package swiss.fihlon.apus.ui.view;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.jetbrains.annotations.NotNull;
import swiss.fihlon.apus.conference.Session;
import swiss.fihlon.apus.service.ConferenceService;

@CssImport(value = "./themes/apus/views/future-sessions-view.css")
public class FutureSessionsView extends VerticalLayout {

    public FutureSessionsView(@NotNull final ConferenceService conferenceService) {
        final HorizontalLayout futureSessions = new HorizontalLayout();
        for (final Session session : conferenceService.getFutureSessions()) {
            futureSessions.add(new FutureSessionView(session));
        }
        add(new H3("Future Sessions"), futureSessions);
    }

}