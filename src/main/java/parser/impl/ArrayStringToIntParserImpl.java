package parser.impl;

import exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import parser.ArrayStringToIntParser;

import java.util.Arrays;

public class ArrayStringToIntParserImpl implements ArrayStringToIntParser {
    private static Logger logger = LogManager.getLogger();

    @Override
    public int[] parseInt(String string) throws CustomException {
        if (string.isEmpty()) {
            logger.error(" Data not found - string is empty.");
            throw new CustomException("Data not found - string is empty.");
        }

        int[] arr = Arrays.stream(string.substring(0, string.length() - 1).split(","))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();
        return arr;
    }
}

