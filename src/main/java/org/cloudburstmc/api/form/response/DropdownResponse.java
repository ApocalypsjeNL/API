package org.cloudburstmc.api.form.response;

import javax.annotation.Nonnull;

public interface DropdownResponse extends Response {

    int getOptionId();

    @Nonnull
    String getOptionText();
}
