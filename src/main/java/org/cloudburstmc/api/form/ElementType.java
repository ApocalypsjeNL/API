package org.cloudburstmc.api.form;

import com.fasterxml.jackson.annotation.JsonProperty;

enum ElementType {

    @JsonProperty("dropdown")
    DROPDOWN,
    @JsonProperty("input")
    INPUT,
    @JsonProperty("label")
    LABEL,
    @JsonProperty("slider")
    SLIDER,
    @JsonProperty("step_slider")
    STEP_SLIDER,
    @JsonProperty("toggle")
    TOGGLE
}
