package barcode4j;

import junit.framework.TestCase;

public class Barcode4jHelperTest extends TestCase {

    private static final String FISCAL_CODE_EXAMPLE = "PNCMRT95L52E253R";

    public void testGenerateEAN13BarcodeImage() {
        Barcode4jHelper.generateEAN13BarcodeImage("0075678164125");
    }

    public void testGenerateCode39BarcodeImage() {
        Barcode4jHelper.generateCode39BarcodeImage(FISCAL_CODE_EXAMPLE);
    }
}