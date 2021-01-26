package org.cloudburstmc.api.form;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.function.Consumer;

public interface ElementButton {

    @Nonnull
    String getText();

    void setText(@Nonnull String text);

    @Nullable
    ImageType getImageType();

    void setImageType(@Nullable ImageType type);

    @Nullable
    String getImageData();

    void setImageData(@Nullable String data);

    void onClick(@Nonnull Consumer<Void> callback);
}
