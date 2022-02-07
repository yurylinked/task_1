package main;

import entity.CustomArray;
import exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import parser.ArrayStringToIntParser;
import parser.impl.ArrayStringToIntParserImpl;
import reader.CustomReader;
import reader.impl.CustomReaderImpl;
import services.CustomArrayService;
import services.impl.CustomArrayServiceImpl;

import java.io.IOException;

public class Main {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws CustomException, IOException {

        CustomArrayService customArrayService = new CustomArrayServiceImpl();
        CustomReader reader = new CustomReaderImpl();
        ArrayStringToIntParser arrayStringToIntParser = new ArrayStringToIntParserImpl();

        String read = reader.read("src/main/resources/data/array.txt");
        System.out.println(read);
        int[] ints = arrayStringToIntParser.parseInt(read);
        CustomArray customArray = new CustomArray(ints);

        int maxValue = customArrayService.findMaxValue(customArray);
        int minValue = customArrayService.findMinValue(customArray);
        System.out.println(maxValue);
        System.out.println(minValue);

    }
}