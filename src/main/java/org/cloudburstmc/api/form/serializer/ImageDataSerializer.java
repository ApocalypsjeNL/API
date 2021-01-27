package org.cloudburstmc.api.form.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.cloudburstmc.api.form.util.ImageData;

import java.io.IOException;

public final class ImageDataSerializer extends JsonSerializer<ImageData> {

    @Override
    public void serialize(ImageData imageData, JsonGenerator generator, SerializerProvider provider) throws IOException {
        if (imageData.getImageData() == null || imageData.getImageData().isEmpty() || imageData.getImageType() == null) {
            generator.writeNull();
            return;
        }

        provider.defaultSerializeValue(imageData, generator);
    }
}
