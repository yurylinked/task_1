package parser;

import exception.CustomException;

public interface ArrayStringToIntParser {
    int[] parseInt(String string) throws CustomException;
}
