package chessgame;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URL;

public final class ImageResources {
    private ImageResources() {
    }

    public static Image load(String path) {
        URL resource = ImageResources.class.getResource(path);
        if (resource == null) {
            throw new IllegalStateException("Image resource not found: " + path);
        }

        try {
            Image image = ImageIO.read(resource);
            if (image == null) {
                throw new IllegalStateException("Unsupported image resource: " + path);
            }
            return image;
        } catch (IOException e) {
            throw new UncheckedIOException("Unable to load image resource: " + path, e);
        }
    }
}
