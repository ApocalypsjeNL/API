package org.cloudburstmc.api.form.window;

import org.cloudburstmc.api.player.Player;

import javax.annotation.Nonnull;

public interface Window {

    int getId();

    @Nonnull
    String getTitle();

    void setTitle(@Nonnull String title);

    void send(@Nonnull Player player);
}
