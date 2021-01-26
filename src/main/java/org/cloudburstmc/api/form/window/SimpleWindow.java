package org.cloudburstmc.api.form.window;

import org.cloudburstmc.api.form.ElementButton;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.function.Consumer;

public interface SimpleWindow extends Window {

    @Nonnull
    String getContent();

    void setContent(@Nonnull String content);

    void addButtons(@Nonnull List<ElementButton> buttons);

    void addButtons(@Nonnull ElementButton... buttons);

    void addButton(@Nonnull ElementButton button);

    void onClose(@Nonnull Consumer<Void> callback);
}
