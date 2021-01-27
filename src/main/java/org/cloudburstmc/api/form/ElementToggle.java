package org.cloudburstmc.api.form;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Nonnull;

public final class ElementToggle extends Element {

    @JsonProperty("default")
    private boolean activated;

    public ElementToggle() {
        super(ElementType.TOGGLE);
    }

    public ElementToggle(boolean defaultActivated) {
        super(ElementType.TOGGLE);
        this.activated = defaultActivated;
    }

    public ElementToggle(@Nonnull String elementText) {
        super(ElementType.TOGGLE, elementText);
    }

    public ElementToggle(@Nonnull String elementText, boolean defaultActivated) {
        super(ElementType.TOGGLE, elementText);
        this.activated = defaultActivated;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public ElementToggle activated(boolean activated) {
        setActivated(activated);
        return this;
    }
}
