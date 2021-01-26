package org.cloudburstmc.api.form.response;

public interface SliderResponse extends Response {

    float getMinimum();

    float getMaximum();

    float getStep();

    float getValue();
}
