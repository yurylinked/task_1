package observer.impl;

import entity.CustomArray;
import exception.CustomException;
import observer.ArrayEvent;
import observer.ArrayObserver;
import service.CustomArrayService;
import service.impl.CustomArrayServiceImpl;
import warehouse.ArrayStatistic;
import warehouse.ArrayWarehouse;

public class ArrayObserverImpl implements ArrayObserver {

    @Override
    public void updateParametrs(ArrayEvent event) throws CustomException {
        CustomArray customArray = event.getSource();
        long customArrayId = customArray.getId();
        CustomArrayService service=new CustomArrayServiceImpl();
        int sumOfElements = service.countSumOfElements(customArray);
        int maxValue = service.findMaxValue(customArray);
        int minValue = service.findMinValue(customArray);
        double averageValue = service.findAverageValue(customArray);

        ArrayStatistic statistic= new ArrayStatistic(minValue,maxValue,sumOfElements,averageValue);
        ArrayWarehouse warehouse= ArrayWarehouse.getInstance();
        warehouse.replace(customArrayId,statistic);
    }
}
