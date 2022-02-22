package entity.comparator;
import java.util.Comparator;
import entity.CustomArray;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Comparator;

import static org.testng.Assert.*;

public class ArrayComparatorTest {
    ArrayComparator arrayComparator;
    @DataProvider(name = "providerCompare")
    public Object[][] createData() {

        CustomArray customArray1 = new CustomArray(new int[]{2, 3, 4});
        CustomArray customArray2 = new CustomArray(new int[]{5, 3, 4});

        return new Object[][]{
                {ArrayComparator.COMPARE_BY_ID, customArray1, customArray2, -1},
                {ArrayComparator.COMPARE_BY_MAX, customArray1, customArray2, -1},
                {ArrayComparator.COMPARE_BY_LENGTH, customArray1, customArray2, 0},};
    }

    @Test(dataProvider = "providerCompare")
    public void testCompare(Comparator <CustomArray> comp, CustomArray c1, CustomArray c2, int expected){
            int actual = comp.compare(c1, c2);
            Assert.assertEquals(actual, expected);
        }




    @Test
    public void testValues() {
    }

    @Test
    public void testValueOf() {
    }
}