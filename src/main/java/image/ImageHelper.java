package image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class ImageHelper {

    public static void saveBufferedImageToFile(BufferedImage bufferedImage) throws IOException {
        File outputFile = new File("src/test/resources/generated_barcodes/" + LocalDateTime.now() + "_sample.png");
        ImageIO.write(bufferedImage, "png", outputFile);
    }
}
