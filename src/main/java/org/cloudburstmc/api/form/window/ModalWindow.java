package org.cloudburstmc.api.form.window;

import javax.annotation.Nonnull;
import java.util.function.Consumer;

public interface ModalWindow extends Window {

    @Nonnull
    String getContent();

    void setContent(@Nonnull String content);

    @Nonnull
    String getUpperButtonText();

    void setUpperButtonText(@Nonnull String text);

    @Nonnull
    String getLowerButtonText();

    void setLowerButtonText(@Nonnull String text);

    void onUpperButtonClick(@Nonnull Consumer<Void> callback);

    void onLowerButtonClick(@Nonnull Consumer<Void> callback);
}
