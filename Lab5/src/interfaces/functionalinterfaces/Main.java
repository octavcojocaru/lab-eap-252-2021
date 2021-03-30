package interfaces.functionalinterfaces;

public class Main {

    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() { // clasa anonima
            @Override
            public void doSomething(int a, int b) {
                System.out.println("something");
            }
        };

        MyFunctionalInterface myFunctionalInterface1 = (a, b) -> System.out.println("a = " + a + " b = " + b);
        myFunctionalInterface1.doSomething(500, 2000);

        Calculator calculator = (a, b, c) -> a + b + c;

        System.out.println(calculator.calculate(1, 10, 12));

        Calculator calculator2 = (a, b, c) -> {
            int result = a * b;
            int finalResult = result * c;
            return finalResult;
        };

        System.out.println(calculator2.calculate(3, 3, 3));

    }
}
