package org.cloudburstmc.api.form;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class ElementInput extends Element {

    private String placeholder;
    @JsonProperty("default")
    private String defaultText;

    public ElementInput() {
        super(ElementType.INPUT);
    }

    public ElementInput(@Nonnull String elementText) {
        super(ElementType.INPUT, elementText);
    }

    public ElementInput(@Nonnull String elementText, @Nullable String placeholder) {
        super(ElementType.INPUT, elementText);

        this.placeholder = placeholder;
    }

    public ElementInput(@Nonnull String elementText, @Nullable String placeholder, @Nullable String defaultText) {
        super(ElementType.INPUT, elementText);
        this.placeholder = placeholder;
        this.defaultText = defaultText;
    }

    @Nullable
    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(@Nullable String placeholder) {
        this.placeholder = placeholder;
    }

    @Nullable
    public String getDefaultText() {
        return defaultText;
    }

    public void setDefaultText(@Nullable String defaultText) {
        this.defaultText = defaultText;
    }

    @Nonnull
    public ElementInput placeholder(@Nullable String placeholder) {
        setPlaceholder(placeholder);
        return this;
    }

    @Nonnull
    public ElementInput defaultText(@Nullable String defaultText) {
        setDefaultText(defaultText);
        return this;
    }
}
