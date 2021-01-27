package org.cloudburstmc.api.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Preconditions;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public final class ElementStepSlider extends Element {

    private final List<String> steps = new ArrayList<>();
    @JsonProperty("default")
    private int defaultIndex = 0;

    public ElementStepSlider() {
        super(ElementType.STEP_SLIDER);
    }

    public ElementStepSlider(@Nonnull List<String> options) {
        super(ElementType.STEP_SLIDER);
        Preconditions.checkNotNull(options, "The provided step options can not be null");

        this.steps.addAll(options);
    }

    public ElementStepSlider(@Nonnull List<String> options, int defaultIndex) {
        super(ElementType.STEP_SLIDER);
        Preconditions.checkNotNull(options, "The provided step options can not be null");

        this.steps.addAll(options);
        this.defaultIndex = Preconditions.checkElementIndex(defaultIndex, options.size(), "Default option index");
    }

    public ElementStepSlider(@Nonnull String elementText) {
        super(ElementType.STEP_SLIDER, elementText);
    }

    public ElementStepSlider(@Nonnull String elementText, @Nonnull List<String> options) {
        super(ElementType.STEP_SLIDER, elementText);
        Preconditions.checkNotNull(options, "The provided step options can not be null");

        this.steps.addAll(options);
    }

    public ElementStepSlider(@Nonnull String elementText, @Nonnull List<String> options, int defaultIndex) {
        super(ElementType.STEP_SLIDER, elementText);
        Preconditions.checkNotNull(options, "The provided step options can not be null");

        this.steps.addAll(options);
        this.defaultIndex = Preconditions.checkElementIndex(defaultIndex, options.size(), "Default option index");
    }

    @Nonnull
    public List<String> getOptions() {
        return steps;
    }

    public void addOption(@Nonnull String option) {
        Preconditions.checkNotNull(option, "The provided step option can not be null");
        steps.add(option);
    }

    public void addOptions(@Nonnull List<String> options) {
        Preconditions.checkNotNull(options, "The provided step options can not be null");
        steps.addAll(options);
    }

    public int getDefaultStepIndex() {
        return defaultIndex;
    }

    public void setDefaultStepIndex(int index) {
        defaultIndex = Preconditions.checkElementIndex(index, steps.size(), "Default step index");
    }

    public void setDefaultStepIndex(@Nonnull String option) {
        Preconditions.checkNotNull(option, "The provided step option can not be null");
        if(steps.contains(option)) {
            defaultIndex = steps.indexOf(option);
        } else {
            steps.add(option);
            defaultIndex = steps.size() - 1;
        }
    }

    @Nonnull
    public ElementStepSlider option(@Nonnull String option) {
        addOption(option);
        return this;
    }

    @Nonnull
    public ElementStepSlider options(@Nonnull List<String> options) {
        addOptions(options);
        return this;
    }

    @Nonnull
    public ElementStepSlider defaultStepIndex(int index) {
        setDefaultStepIndex(index);
        return this;
    }

    @Nonnull
    public ElementStepSlider defaultStepIndex(@Nonnull String option) {
        setDefaultStepIndex(option);
        return this;
    }
}
