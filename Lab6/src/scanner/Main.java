package scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter age: ");
        int age = scanner.nextInt();
        System.out.println(age);

        System.out.println("Please enter name: ");
        String name = scanner.nextLine();
        System.out.println("Name is:" + name);

    }
}
