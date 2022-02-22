package reader.impl;

import exception.CustomException;

import reader.CustomReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import validator.impl.ValidationIntImp;

import java.io.*;


public class CustomReaderImpl implements CustomReader {
    static Logger logger = LogManager.getLogger();
    ValidationIntImp validationIntImp = new ValidationIntImp();

    public String read(String filename) throws CustomException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            while (line != null) {
                if (validationIntImp.validateString(line)) {
                    stringBuilder.append(line + "\n");
                }
                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            logger.error("File not found ", e.getClass(), e.getMessage());
            throw new CustomException(e);
        } catch (IOException e) {
            logger.error("Ioexception exception ", e.getClass(), e.getMessage());
            throw new CustomException(e);
        }
        return stringBuilder.toString();
    }
}


