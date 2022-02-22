package service;

import entity.CustomArray;
import exception.CustomException;

public interface CustomArrayService {
    int findMaxValue(CustomArray arr);

    int findMaxValueStream(CustomArray arr);

    int findMinValue(CustomArray arr);

    int findMinValueStream(CustomArray arr);

    double findAverageValue(CustomArray arr) throws CustomException;

    double findAverageValueStream(CustomArray arr);

    int countSumOfElements(CustomArray arr);

    int countSumOfElementsStream(CustomArray arr) throws CustomException;

    int countPositiveElements(CustomArray arr);

    int countPositiveElementsStream(CustomArray arr);

    int countNegativeElements(CustomArray arr);

    int countNegativeElementsStream(CustomArray arr);

    void replaceElementsByNegative(CustomArray arr) throws CustomException;

    void replaceElementsByNegativeStream(CustomArray arr) throws CustomException;

    void bubbleSort(CustomArray arr);
}
