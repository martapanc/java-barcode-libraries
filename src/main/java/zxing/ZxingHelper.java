package zxing;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code39Writer;
import com.google.zxing.oned.EAN13Writer;

import java.awt.image.BufferedImage;

public class ZxingHelper {

    public static BufferedImage generateEAN13BarcodeImage(String barcodeText) {
        EAN13Writer barcodeWriter = new EAN13Writer();
        BitMatrix bitMatrix = barcodeWriter.encode(barcodeText, BarcodeFormat.EAN_13, 300, 150);

        return MatrixToImageWriter.toBufferedImage(bitMatrix);
    }

    public static BufferedImage generateCode39BarcodeImage(String barcodeText) {
        Code39Writer barcodeWriter = new Code39Writer();
        BitMatrix bitMatrix = barcodeWriter.encode(barcodeText, BarcodeFormat.CODE_39, 1000, 150);

        return MatrixToImageWriter.toBufferedImage(bitMatrix);
    }
}
