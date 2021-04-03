package streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamsMain {

    public static void main(String[] args) {
        readFromFile();
        writeToFile();
    }

    static void readFromFile() {
        File file = new File("lab6.txt");
        try(FileInputStream fileInputStream = new FileInputStream(file)) {
            int c;
            while ((c = fileInputStream.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println("Encountered IOException");
        }
    }

    static void writeToFile() {
        File file = new File("lab6Out.txt");
        try(FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write("myText".getBytes());
        } catch (IOException e) {
            System.out.println("IO Exception surpressed");
        }
    }
}
