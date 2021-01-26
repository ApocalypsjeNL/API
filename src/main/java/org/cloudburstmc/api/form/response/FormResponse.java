package org.cloudburstmc.api.form.response;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface FormResponse {

    @Nullable
    DropdownResponse getDropdown(@Nonnull String elementId);

    @Nullable
    InputResponse getInput(@Nonnull String elementId);

    @Nullable
    SliderResponse getSlider(@Nonnull String elementId);

    @Nullable
    StepSliderResponse getStepSlider(@Nonnull String elementId);

    @Nullable
    ToggleResponse getToggle(@Nonnull String elementId);
}
