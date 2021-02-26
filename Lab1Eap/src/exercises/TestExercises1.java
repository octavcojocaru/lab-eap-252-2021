package exercises;

public class TestExercises1 {
    public static void main(String[] args) {

        System.out.println("Fibonacci " + fibonacci(5));
        System.out.println("Factorial " + factorial(5));
        System.out.println("Last 3 letters uppercase " + last3UpperCase("someString"));
    }

    public static int factorial(int number) {
        int result = 1;
        if (number < 0) {
            System.out.println("Cannot calculate factorial of a negative number");
            return -1;
        }
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static int fibonacci(int index) {
        if (index <= 1) {
            return index;
        }
        return fibonacci(index - 1) + fibonacci(index - 2);
    }

    static String last3UpperCase(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        }
        return str.substring(0, str.length() - 3).concat(str.substring(str.length() - 3).toUpperCase());
    }

}
