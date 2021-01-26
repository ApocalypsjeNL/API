package org.cloudburstmc.api.form;

import javax.annotation.Nonnull;

public interface ElementInput extends Element {

    @Nonnull
    String getPlaceholder();

    void setPlaceholder(String placeholder);

    @Nonnull
    String getDefault();

    void setDefault(String defaultText);
}
