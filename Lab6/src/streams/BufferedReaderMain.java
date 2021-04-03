package streams;

import java.io.*;

public class BufferedReaderMain {

    public static void main(String[] args) {
        readWithBufferedReader();
        writeWithBufferedWriter();
    }

    static void readWithBufferedReader() {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("lab6.txt")))) {
            // \n - new line
            String line = bufferedReader.readLine();
            while(line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static void writeWithBufferedWriter() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("lab6-out.txt")))) {
            bufferedWriter.write("This is a string");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
