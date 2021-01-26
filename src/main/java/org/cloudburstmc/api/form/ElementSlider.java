package org.cloudburstmc.api.form;

public interface ElementSlider extends Element {

    float getMinimum();

    void setMinimum(float minimum);

    float getMaximum();

    void setMaximum(float maximum);

    int getSteps();

    void setSteps(int steps);

    float getDefault();

    void setDefault(float defaultValue);
}
