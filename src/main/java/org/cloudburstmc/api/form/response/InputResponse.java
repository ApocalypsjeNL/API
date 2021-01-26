package org.cloudburstmc.api.form.response;

import javax.annotation.Nonnull;

public interface InputResponse extends Response {

    @Nonnull
    String getInput();
}
