package observer.impl;

import entity.CustomArray;
import exception.CustomException;
import observer.ArrayEvent;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import warehouse.ArrayStatistic;
import warehouse.ArrayWarehouse;

import static org.testng.Assert.*;

public class ArrayObserverImplTest {

    private ArrayObserverImpl observer;
    private CustomArray customArray;
    private ArrayEvent event;
    private ArrayWarehouse warehouse;

    @BeforeMethod
    public void initialize() {
        observer = new ArrayObserverImpl();
        customArray = new CustomArray (new int[]{2,3,4,5});
        customArray.attach(observer);
        event = new ArrayEvent(customArray);
        warehouse = ArrayWarehouse.getInstance();
        warehouse.put(customArray.getId(), new ArrayStatistic(5, 5, 5, 5));
    }

    @Test
    public void testUpdateParametrs() throws CustomException {
        observer.updateParametrs(event);
        ArrayStatistic actual = warehouse.get(customArray.getId());
        ArrayStatistic expected = new ArrayStatistic(2, 5,14,3.5);
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void close() {
        observer = null;
        customArray = null;
        event = null;
        warehouse = null;
    }

}