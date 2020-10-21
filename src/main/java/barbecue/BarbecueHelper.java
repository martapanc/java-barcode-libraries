package barbecue;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;

import java.awt.image.BufferedImage;

public class BarbecueHelper {

    public static BufferedImage generateEAN13BarcodeImage(String barcodeText) throws Exception {
        Barcode barcode = BarcodeFactory.createEAN13(barcodeText);
        return BarcodeImageHandler.getImage(barcode);
    }

    public static BufferedImage generateCode39BarcodeImage(String barcodeText) throws Exception {
        Barcode barcode = BarcodeFactory.createCode39(barcodeText, false);
        return BarcodeImageHandler.getImage(barcode);
    }
}
