package org.cloudburstmc.api.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Preconditions;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public final class ElementDropdown extends Element {

    private final List<String> options = new ArrayList<>();
    @JsonProperty("default")
    private int defaultIndex = 0;

    public ElementDropdown() {
        super(ElementType.DROPDOWN);
    }

    public ElementDropdown(@Nonnull List<String> options) {
        super(ElementType.DROPDOWN);

        Preconditions.checkNotNull(options, "The provided dropdown options can not be null");
        this.options.addAll(options);
    }

    public ElementDropdown(@Nonnull List<String> options, int defaultOptionIndex) {
        super(ElementType.DROPDOWN);

        Preconditions.checkNotNull(options, "The provided dropdown options can not be null");
        this.options.addAll(options);

        this.defaultIndex = Preconditions.checkElementIndex(defaultOptionIndex, options.size(), "Default option index");
    }

    public ElementDropdown(@Nonnull String elementText) {
        super(ElementType.DROPDOWN, elementText);
    }

    public ElementDropdown(@Nonnull String elementText, @Nonnull List<String> options) {
        super(ElementType.DROPDOWN, elementText);

        Preconditions.checkNotNull(options, "The provided dropdown options can not be null");
        this.options.addAll(options);
    }

    public ElementDropdown(@Nonnull String elementText, @Nonnull List<String> options, int defaultOptionIndex) {
        super(ElementType.DROPDOWN, elementText);

        Preconditions.checkNotNull(options, "The provided dropdown options can not be null");
        this.options.addAll(options);

        this.defaultIndex = Preconditions.checkElementIndex(defaultOptionIndex, options.size(), "Default option index");
    }

    @Nonnull
    public List<String> getOptions() {
        return options;
    }

    public void addOption(@Nonnull String option) {
        Preconditions.checkNotNull(option, "The provided dropdown option can not be null");
        options.add(option);
    }

    public void addOptions(@Nonnull List<String> options) {
        Preconditions.checkNotNull(options, "The provided dropdown options can not be null");
        this.options.addAll(options);
    }

    public int getDefaultOptionIndex() {
        return defaultIndex;
    }

    public void setDefaultOptionIndex(int index) {
        defaultIndex = Preconditions.checkElementIndex(index, options.size(), "Default option index");
    }

    public void setDefaultOption(@Nonnull String option) {
        Preconditions.checkNotNull(option, "The provided dropdown option can not be null");
        if(options.contains(option)) {
            defaultIndex = options.indexOf(option);
        } else {
            options.add(option);
            defaultIndex = options.size() - 1;
        }
    }

    @Nonnull
    public ElementDropdown option(@Nonnull String option) {
        addOption(option);
        return this;
    }

    @Nonnull
    public ElementDropdown options(@Nonnull List<String> options) {
        addOptions(options);
        return this;
    }

    @Nonnull
    public ElementDropdown defaultIndex(int index) {
        setDefaultOptionIndex(index);
        return this;
    }

    @Nonnull
    public ElementDropdown defaultIndex(@Nonnull String option) {
        setDefaultOption(option);
        return this;
    }
}