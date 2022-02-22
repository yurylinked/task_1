package service.impl;

import entity.CustomArray;
import exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.CustomArrayService;

import java.util.Arrays;


public class CustomArrayServiceImpl implements CustomArrayService {
    private static Logger logger = LogManager.getLogger();

    @Override
    public int findMaxValue(CustomArray arr) {
        int[] array = arr.getArray();
        int value = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > value) {
                value = array[i];
            }
        }

        return value;
    }

    @Override
    public int findMaxValueStream(CustomArray arr) {
        int max = Arrays.stream(arr.getArray()).max().getAsInt();
        return max;
    }

    @Override
    public int findMinValue(CustomArray arr) {
        int[] array = arr.getArray();
        int value = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < value) {
                value = array[i];
            }
        }

        return value;
    }

    @Override
    public int findMinValueStream(CustomArray arr) {
        return Arrays.stream(arr.getArray()).min().getAsInt();
    }

    @Override
    public double findAverageValue(CustomArray arr) throws CustomException {
        int sum = countSumOfElements(arr);
        return (double) sum / arr.getArray().length;
    }

    @Override
    public double findAverageValueStream(CustomArray arr) {
        return Arrays.stream(arr.getArray()).average().getAsDouble();
    }

    @Override
    public int countSumOfElements(CustomArray arr) {
        int[] array = arr.getArray();
        int sumOfelements = array[0];
        for (int i = 1; i < array.length; i++) {
            sumOfelements += array[i];
        }
        return sumOfelements;
    }

    @Override
    public int countSumOfElementsStream(CustomArray arr) throws CustomException {
        return Arrays.stream(arr.getArray()).sum();
    }

    @Override
    public int countPositiveElements(CustomArray arr) {
        int[] array = arr.getArray();
        int countPositive = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                countPositive++;
        }
        return countPositive;
    }

    @Override
    public int countPositiveElementsStream(CustomArray arr) {
        return Arrays.stream(arr.getArray()).filter(n -> n > 0).sum();
    }


    @Override
    public int countNegativeElements(CustomArray arr) {
        int[] array = arr.getArray();
        int countPositive = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                countPositive++;
        }
        return countPositive;
    }

    @Override
    public int countNegativeElementsStream(CustomArray arr) {
        return Arrays.stream(arr.getArray()).filter(n -> n < 0).sum();
    }

    @Override
    public void replaceElementsByNegative(CustomArray arr) throws CustomException {
        int[] array = arr.getArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                array[i] = array[i] * (-1);
        }
        arr.setArray(array);
    }

    @Override
    public void replaceElementsByNegativeStream(CustomArray arr) throws CustomException {
        int[] ints = Arrays.stream(arr.getArray()).filter(n -> n > 0).map(n -> (-1) * n).toArray();
        arr.setArray(ints);
    }

    @Override
    public void bubbleSort(CustomArray arr) {
        int[] array = arr.getArray();
        boolean isSorted = false;
        int changeBox;
        while (isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    changeBox = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = changeBox;
                }
            }
        }
    }
}
