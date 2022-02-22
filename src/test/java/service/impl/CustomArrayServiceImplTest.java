package service.impl;

import entity.CustomArray;
import exception.CustomException;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArrayServiceImplTest {
    CustomArrayServiceImpl customArrayService;
    CustomArray customArray;
    int[] array = {2, 3, 4};

    @BeforeMethod
    public void setUp() {
        customArrayService = new CustomArrayServiceImpl();
        customArray = new CustomArray(array);
    }

    @Test
    public void testFindMaxValue() {
        int actual = customArrayService.findMaxValue(customArray);
        int expected = 4;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindMinValue() {
        int actual = customArrayService.findMinValue(customArray);
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testFindAverageValue() throws CustomException {
        double actual = customArrayService.findAverageValue(customArray);
        int expected = 3;
        Assert.assertEquals(actual, expected,0);
    }

}