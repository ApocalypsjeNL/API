package org.cloudburstmc.api.form;

public interface ElementToggle extends Element {

    boolean isActivated();

    void setActivated(boolean activated);
}
