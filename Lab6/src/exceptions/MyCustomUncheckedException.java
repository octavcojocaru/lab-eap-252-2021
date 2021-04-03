package exceptions;

public class MyCustomUncheckedException extends RuntimeException { // extindem clasa RuntimeException si astfel cream o exceptie unchecked custom

    public MyCustomUncheckedException(String message) {
        super(message);
    }
}
