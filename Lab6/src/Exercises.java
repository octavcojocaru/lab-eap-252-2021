import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
        readFromKeyboardAndWriteToFile();
    }

    static void readFromKeyboardAndWriteToFile() {
        Scanner scanner = new Scanner(System.in);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("exercise1.txt"))) {
            System.out.println("Input: ");
            String text = scanner.nextLine();
            bufferedWriter.write(text);
        } catch (IOException e) {
            throw new IllegalStateException("ex", e);
        }
    }
}
