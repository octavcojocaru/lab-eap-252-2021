package streams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

    public static void main(String[] args) {
        readUsingFileReader();
        // Similara scrierea cu FileWriter
    }

    static void readUsingFileReader() {
        try (FileReader fileReader = new FileReader(new File("lab6.txt"))) { // citire pe 2 bytes - char are 2 bytes - citire de caractere
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
