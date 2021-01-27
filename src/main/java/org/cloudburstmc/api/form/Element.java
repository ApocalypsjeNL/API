package org.cloudburstmc.api.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Preconditions;

import javax.annotation.Nonnull;

public class Element {

    private final ElementType type;
    @JsonProperty("text")
    private String title;

    Element(@Nonnull ElementType type) {
        Preconditions.checkNotNull(type, "The provided element type can not be null");

        this.type = type;
        this.title = "";
    }

    Element(@Nonnull ElementType type, @Nonnull String title) {
        Preconditions.checkNotNull(type, "The provided element type can not be null");
        Preconditions.checkNotNull(title, "The provided element title can not be null");

        this.type = type;
        this.title = title;
    }

    @Nonnull
    public ElementType getType() {
        return type;
    }

    @Nonnull
    public String getTitle() {
        return title;
    }

    public void setTitle(@Nonnull String title) {
        Preconditions.checkNotNull(title, "The provided element title can not be null");
        this.title = title;
    }

    @Nonnull
    public Element title(@Nonnull String title) {
        setTitle(title);
        return this;
    }
}
