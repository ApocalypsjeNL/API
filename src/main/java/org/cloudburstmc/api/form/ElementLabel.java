package org.cloudburstmc.api.form;

import javax.annotation.Nonnull;

public final class ElementLabel extends Element {

    public ElementLabel() {
        super(ElementType.LABEL);
    }

    public ElementLabel(@Nonnull String elementText) {
        super(ElementType.LABEL, elementText);
    }
}
