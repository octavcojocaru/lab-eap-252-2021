package exceptions;

public class MyCustomCheckedException extends Exception { // extindem clasa Exception si astfel cream o exceptie custom checked

    public MyCustomCheckedException(String message) {
        super(message);
    }
}
