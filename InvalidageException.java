package OOPS.BuilderPattern;

public class InvalidageException extends RuntimeException{
    public InvalidageException() {
    }

    public InvalidageException(String message) {
        super(message);
    }

    public InvalidageException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidageException(Throwable cause) {
        super(cause);
    }

    public InvalidageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
