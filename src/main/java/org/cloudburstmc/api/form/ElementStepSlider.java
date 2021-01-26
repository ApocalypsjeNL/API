package org.cloudburstmc.api.form;

import javax.annotation.Nonnull;
import java.util.List;

public interface ElementStepSlider extends Element {

    @Nonnull
    List<String> getOptions();

    void addOptions(@Nonnull List<String> options);

    void addOptions(@Nonnull String... options);

    void addOption(@Nonnull String option);

    int getDefaultIndex();

    void setDefaultIndex(int index);

    void setDefaultIndex(@Nonnull String option);
}
