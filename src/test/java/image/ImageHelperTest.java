package image;

import barbecue.BarbecueHelper;
import barcode4j.Barcode4jHelper;
import junit.framework.TestCase;

public class ImageHelperTest extends TestCase {

    private static final String FISCAL_CODE_EXAMPLE = "PNCMRT95L52E253R";
    private static final String EAN13_EXAMPLE = "0075678164125";

    public void testSaveBufferedImageToFile_Code39() throws Exception {
        ImageHelper.saveBufferedImageToFile(Barcode4jHelper.generateCode39BarcodeImage(FISCAL_CODE_EXAMPLE));
        ImageHelper.saveBufferedImageToFile(BarbecueHelper.generateCode39BarcodeImage(FISCAL_CODE_EXAMPLE));
    }

    public void testSaveBufferedImageToFile_EAN13() throws Exception {
        ImageHelper.saveBufferedImageToFile(Barcode4jHelper.generateEAN13BarcodeImage(EAN13_EXAMPLE));
//        ImageHelper.saveBufferedImageToFile(BarbecueHelper.generateEAN13BarcodeImage(EAN13_EXAMPLE));
    }
}