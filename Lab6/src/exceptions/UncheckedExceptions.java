package exceptions;

public class UncheckedExceptions {

    public static void main(String[] args) {
        doTriggerOutOfBoundsException();
        triggerOutOfBoundsExceptionAndRethrow();
        triggerNullPointerException();
    }

    static void doTriggerOutOfBoundsException() {
        String myString = "abcdefgh";
        try {
            String substring = myString.substring(1, 10); // obtinem StringIndexOutOfBoundsException (index 10 nu exista)
        }
        catch (StringIndexOutOfBoundsException e) { // prindem exceptia si ii facem surpress (nu aruncam alta exceptie)
            System.out.println(e);
            System.out.println("We went too far!");
        }
    }

    static void triggerOutOfBoundsExceptionAndRethrow() {
        String myString = "abcdefgh";
        try {
            String substring = myString.substring(1, 10);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
            throw new IllegalStateException(e); // am pasat exceptia prinsa la noua exceptie de tip IllegalStateException
        }
    }


    static void triggerNullPointerException() { // de obicei nu tratam NullPointerException - ar trebui sa ne asiguram ca obiectul accesat nu are referinta nula
        String s = null;
        s.substring(1, 2);
    }
}
