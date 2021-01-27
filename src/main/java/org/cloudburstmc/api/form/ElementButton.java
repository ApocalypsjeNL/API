package org.cloudburstmc.api.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Preconditions;
import org.cloudburstmc.api.form.util.ImageData;
import org.cloudburstmc.api.form.util.ImageType;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class ElementButton {

    @JsonProperty("text")
    private String text;
    @JsonProperty("image")
    private ImageData imageData = new ImageData();

    public ElementButton() {
        this.text = "";
    }

    public ElementButton(@Nonnull String text) {
        Preconditions.checkNotNull(text, "The provided button text can not be null");

        this.text = text;
    }

    public ElementButton(@Nonnull String text, @Nullable ImageType imageType, @Nullable String imageData) {
        Preconditions.checkNotNull(text, "The provided button text can not be null");

        this.text = text;
        this.imageData = new ImageData(imageType, imageData);
    }

    @Nonnull
    public String getText() {
        return text;
    }

    public void setText(@Nonnull String text) {
        Preconditions.checkNotNull(text, "The provided button text can not be null");

        this.text = text;
    }

    @Nullable
    public ImageData getImageData() {
        return imageData;
    }

    public void setImageData(@Nullable ImageData imageData) {
        this.imageData = imageData;
    }

    @Nonnull
    public ElementButton text(@Nonnull String text) {
        setText(text);
        return this;
    }

    @Nonnull
    public ElementButton image(@Nullable ImageData imageData) {
        setImageData(imageData);
        return this;
    }
}
