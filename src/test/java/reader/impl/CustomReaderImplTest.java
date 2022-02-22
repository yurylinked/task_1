package reader.impl;


import exception.CustomException;
import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CustomReaderImplTest {
    private CustomReaderImpl customReaderImplTest;

    @BeforeMethod
    public void initialize() {
        customReaderImplTest = new CustomReaderImpl();
    }


    @Test
    public void testReadDataFromFile() throws CustomException {
        String actual = customReaderImplTest.read("src/main/resources/data/array.txt");
        String expected ="1, -5, -3, 2, 100, -900,\n" +
                "-43, -21, -43, -54, -76, -1,\n";
        Assert.assertEquals(actual, expected);
    }

}