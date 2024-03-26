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
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import org.jetbrains.annotations.NotNull;
import swiss.fihlon.apus.service.SocialService;
import swiss.fihlon.apus.social.Message;

@CssImport(value = "./themes/apus/views/social-view.css")
public final class SocialView extends Div {

    public SocialView(@NotNull final SocialService socialService) {
        setId("social-view");
        add(new H2("#JavaLand on Mastodon"));
        final var messageContainer = new Div();
        for (final Message message : socialService.getMessages()) {
            messageContainer.add(new MessageView(message));
        }
        add(messageContainer);
    }

}