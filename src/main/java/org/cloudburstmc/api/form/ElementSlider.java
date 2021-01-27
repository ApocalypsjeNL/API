package org.cloudburstmc.api.form;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Nonnull;

public final class ElementSlider extends Element {

    private float min = 0;
    private float max = 100;
    private int step = 10;
    @JsonProperty("default")
    private float defaultValue = 0;

    public ElementSlider(@Nonnull String elementText) {
        super(ElementType.SLIDER, elementText);
    }

    public ElementSlider(@Nonnull String elementText, float minimum, float maximum) {
        super(ElementType.SLIDER, elementText);

        if (minimum >= maximum) {
            throw new IllegalArgumentException("Maximal value can't be smaller or equal to the minimal value");
        }

        this.min = minimum;
        this.max = maximum;
        this.defaultValue = minimum;
    }

    public ElementSlider(@Nonnull String elementText, float minimum, float maximum, int step) {
        super(ElementType.SLIDER, elementText);

        if (minimum >= maximum) {
            throw new IllegalArgumentException("Maximal value can't be smaller or equal to the minimal value");
        }

        this.min = minimum;
        this.max = maximum;
        this.step = step;
        this.defaultValue = minimum;
    }

    public ElementSlider(@Nonnull String elementText, float minimum, float maximum, int step, float defaultValue) {
        super(ElementType.SLIDER, elementText);

        if (minimum >= maximum) {
            throw new IllegalArgumentException("Maximal value can't be smaller or equal to the minimal value");
        }

        if(defaultValue < minimum || defaultValue > maximum) {
            throw new IllegalArgumentException("The default value should lay between the minimum and maximum values");
        }

        this.min = minimum;
        this.max = maximum;
        this.step = step;
        this.defaultValue = defaultValue;
    }

    public float getMinimum() {
        return min;
    }

    public void setMinimum(float minimum) {
        this.min = minimum;
    }

    public float getMaximum() {
        return max;
    }

    public void setMaximum(float maximum) {
        this.max = maximum;
    }

    public int getSteps() {
        return step;
    }

    public void setSteps(int step) {
        this.step = step;
    }

    public float getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(float defaultValue) {
        if(defaultValue < min || defaultValue > max) {
            throw new IllegalArgumentException("The default value should lay between the minimum and maximum values");
        }

        this.defaultValue = defaultValue;
    }

    public ElementSlider min(float minimum) {
        setMinimum(minimum);
        return this;
    }

    public ElementSlider max(float maximum) {
        setMaximum(maximum);
        return this;
    }

    public ElementSlider steps(int step) {
        setSteps(step);
        return this;
    }

    public ElementSlider defaultValue(float defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }
}
