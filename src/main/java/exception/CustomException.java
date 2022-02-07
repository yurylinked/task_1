package exception;

public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    public CustomException() {
    }

    public CustomException(Throwable cause) {
        super(cause);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
