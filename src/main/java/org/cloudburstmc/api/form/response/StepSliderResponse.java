package org.cloudburstmc.api.form.response;

import javax.annotation.Nonnull;

public interface StepSliderResponse extends Response {

    int getStepId();

    @Nonnull
    String getStepText();
}
