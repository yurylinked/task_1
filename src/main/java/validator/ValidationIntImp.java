package validator;

import java.util.Arrays;

public class ValidationIntImp implements ValidationInt {
    private static final String REGULAR_DELIMETER_COMMA = ",";
    private static final String REGULAR_DIGITS_SPACES = "^[0-9-\\s]+$";


    @Override
    public boolean validateString(String string) {
        boolean isValid = Arrays.stream(string.split(REGULAR_DELIMETER_COMMA))
                .allMatch(s -> s.matches(REGULAR_DIGITS_SPACES));
        return isValid;
    }
}
