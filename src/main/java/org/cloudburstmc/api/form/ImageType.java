package org.cloudburstmc.api.form;

import javax.annotation.Nonnull;

public enum ImageType {

    URL("url"),
    FILE("path");

    private final String type;

    ImageType(@Nonnull String type) {
        this.type = type;
    }

    @Nonnull
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ImageType{type='" + type + "'}";
    }
}
