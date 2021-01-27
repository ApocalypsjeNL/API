package org.cloudburstmc.api.form.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ImageType {

    /**
     * Remote URL
     */
    @JsonProperty("url")
    URL,
    /**
     * Path on the server file system
     */
    @JsonProperty("path")
    FILE
}
