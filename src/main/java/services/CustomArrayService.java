package services;

import entity.CustomArray;
import exception.CustomException;

public interface CustomArrayService {
    int findMaxValue(CustomArray arr);

    int findMaxValueStream(CustomArray arr);

    int findMinValue(CustomArray arr);

    int findMinValueStream(CustomArray arr);

    double findAverageValue(CustomArray arr) throws CustomException;

    double findAverageValueStream(CustomArray arr);

    int countSumOfElements(CustomArray arr) throws CustomException;

    int countSumOfElementsStream(CustomArray arr) throws CustomException;

    int countPositiveElements(CustomArray arr);

    int countPositiveElementsStream(CustomArray arr);

    int countNegativeElements(CustomArray arr);

    int countNegativeElementsStream(CustomArray arr);

    void replaceElementsByNegative(CustomArray arr, int newValue);

    void replaceElementsByNegativeStream(CustomArray arr, int newValue);
}
