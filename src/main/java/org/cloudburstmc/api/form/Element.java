package org.cloudburstmc.api.form;

import javax.annotation.Nonnull;

public interface Element {

    @Nonnull
    String getId();

    @Nonnull
    String getText();

    void setText(@Nonnull String text);
}
