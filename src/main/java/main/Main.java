package main;

import creator.Creator;
import entity.CustomArray;
import exception.CustomException;
import observer.ArrayObserver;
import observer.impl.ArrayObserverImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import parser.ArrayStringToIntParser;
import parser.impl.ArrayStringToIntParserImpl;
import reader.CustomReader;
import reader.impl.CustomReaderImpl;
import repository.CustomRepository;
import repository.impl.CustomRepositoryImpl;
import service.CustomArrayService;
import service.impl.CustomArrayServiceImpl;
import warehouse.ArrayStatistic;
import warehouse.ArrayWarehouse;

import java.io.IOException;

public class Main {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws CustomException, IOException {
        CustomRepository customRepository = CustomRepositoryImpl.getInstance();
        ArrayWarehouse warehouse = ArrayWarehouse.getInstance();
        ArrayObserver observer = new ArrayObserverImpl();

        CustomArrayService customArrayService = new CustomArrayServiceImpl();
        CustomReader reader = new CustomReaderImpl();
        ArrayStringToIntParser arrayStringToIntParser = new ArrayStringToIntParserImpl();

        String read = reader.read("src/main/resources/data/array.txt");
        int[] ints = arrayStringToIntParser.parseInt(read);
        Creator creator = new Creator();
        CustomArray customArray = creator.createArrayFromInt(ints);
        System.out.println(customArray);

        customArray.attach(observer);
        ArrayStatistic statistic = new ArrayStatistic(customArrayService.findMinValue(customArray), customArrayService.findMaxValue(customArray),
                customArrayService.countSumOfElementsStream(customArray), customArrayService.findAverageValue(customArray));

        customRepository.add(customArray);
        warehouse.put(customArray.getId(), statistic);


    }
}
