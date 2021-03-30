package interfaces.javafunctionalinterfaces;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        // Function
        Function<String, String[]> myFunction = str -> {
            String[] array = new String[1];
            array[0] = str;
            return array;
        };

        String[] array = myFunction.apply("MyString");
        for(String element: array) {
            System.out.println(element);
        }

        // Predicate

        Predicate<String> myPredicate = str -> str.endsWith("escu");

        System.out.println(myPredicate.test("Georgescu"));

        // Unary operator

        UnaryOperator<String> myUnaryOperator = str -> str.substring(2);
        System.out.println(myUnaryOperator.apply("MyString"));

        BinaryOperator<Integer> myBinaryOperator = (a, b) -> a + b;


        BinaryOperator<Integer> myBinaryOperator2 = Integer::sum; // method reference;
        BinaryOperator<Integer> myBinaryOperator3 =  (a, b) -> Integer.sum(a, b); // echivalent cu expresia de mai sus


        // Supplier
        Supplier<String> mySupplier = () ->  "myString"; // cand nu aveti parametru trebuie pus : ()

        System.out.println(mySupplier.get());

        // Consumer

        Consumer<String> myConsumer = str -> System.out.println("My string is " + str);

        myConsumer.accept("un string");

        Consumer<String> myConsumer2 = System.out::println; // method reference

    }
}
