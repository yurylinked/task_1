package parser.impl;

import exception.CustomException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStringToIntParserImplTest {
    private ArrayStringToIntParserImpl stringToIntParser = new ArrayStringToIntParserImpl();
    String string = new String("2, 3, 4\n");



    @Test
    void parseInt() throws CustomException {
        int[] actual = stringToIntParser.parseInt(string);
        int[] expected = {2, 3, 4};
        assertArrayEquals(expected, actual);
    }


    @AfterMethod
    public void tearDown() {
    }

    @org.testng.annotations.Test
    public void testTestParseInt() {
    }
}