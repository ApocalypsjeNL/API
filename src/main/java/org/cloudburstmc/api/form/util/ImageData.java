package org.cloudburstmc.api.form.util;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.cloudburstmc.api.form.serializer.ImageDataSerializer;

import javax.annotation.Nullable;

@JsonSerialize(using = ImageDataSerializer.class)
public final class ImageData {

    private final ImageType type;
    private final String data;

    public ImageData() {
        this.type = null;
        this.data = null;
    }

    public ImageData(@Nullable ImageType imageType, @Nullable String imageData) {
        this.type = imageType;
        this.data = imageData;
    }

    @Nullable
    public ImageType getImageType() {
        return type;
    }

    @Nullable
    public String getImageData() {
        return data;
    }
}