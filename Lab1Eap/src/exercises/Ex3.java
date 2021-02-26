package exercises;

public class Ex3 {

    public static void main(String[] args) {

        // if statement

        if (2 < 3) {
            System.out.println("2 e mai mic ca 3");
        }

        int a = 5;
        int b = 10;

        // if-then-else statement

        if (b % a == 0) {
            System.out.println("a este un divizor al lui b");
        } else {
            System.out.println("a nu este un divizior al lui b");
        }


        // a < b ? true : false // ternary operator

        String result = standardIfTernaryEquivalent(); // returns "yes"
        // vs
        String resultTernary = b % a == 0 ? "yes" : "no";


        // While statements

        int index = 0;
        // the condition is firstly evaluated and if true, then the instructions inside the curly braces block are executed
        while (index < 10) {
            System.out.println(index);
            index++; // equivalent to: index = index + 1;
        }

        int i = 10;
        // the instructions inside the curly braces block are executed and then the boolean condition is  evaluated
        // will always execute once, at least
        do {
            System.out.println(i);
            i++;
            // these instructions will execute once in our case
        } while (i < 10);

    }


    static String standardIfTernaryEquivalent() {

        int a = 5;
        int b = 10;

        if (b % a == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

}
