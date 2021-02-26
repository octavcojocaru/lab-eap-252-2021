package exercises;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        // reading from keyboard

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number here: ");
        int yourChosenNumber = scanner.nextInt();

        if(yourChosenNumber % 10 == 0) {
            System.out.println("Numarul se imparte la 10");
        } else {
            System.out.println("Numarul nu se imparte la 10 exact");
        }
    }
}
