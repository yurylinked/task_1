package reader;

import exception.CustomException;

public interface CustomReader {
    String read(String filename) throws CustomException;
}
