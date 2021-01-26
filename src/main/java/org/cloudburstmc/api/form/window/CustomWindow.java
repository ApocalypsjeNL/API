package org.cloudburstmc.api.form.window;

import org.cloudburstmc.api.form.Element;
import org.cloudburstmc.api.form.ImageType;
import org.cloudburstmc.api.form.response.FormResponse;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Map;
import java.util.function.Consumer;

public interface CustomWindow extends Window {

    @Nullable
    ImageType getIconType();

    void setIconType(@Nullable ImageType type);

    @Nullable
    String getIconData();

    void setIconData(@Nullable String data);

    @Nonnull
    Map<String, Element> getElements();

    void addElements(@Nonnull Map<String, Element> elements);

    void addElement(@Nonnull String elementId, @Nonnull Element element);

    void onResponse(@Nonnull Consumer<FormResponse> callback);
}
