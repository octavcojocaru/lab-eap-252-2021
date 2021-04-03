package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptions {

    public static void main(String[] args) {
        read();
        read2();
        read3();
        try {
            read4(); // am propagat exceptia pana in metoda apelanta si ori o tratam ori adaugam throws IOException la metoda curenta
        } catch (IOException e) {
            System.out.println("blabla");
        }
        try {
            read5();
        } catch (MyCustomCheckedException e) { // am propagat exceptia pana in metoda apelanta si prindem exceptia noastra custom
            //...
        }
    }

    static void read() { // exemplu cu multiple catch-uri
        File file = new File("lab1.txt");
        try {                                       // try-catch clasic (nu este try-with-resources)
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println(fileInputStream.read());
            throw new IOException("My IO Exception");
        } catch (FileNotFoundException e) { // multiple catch blocks
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage()); // surpress
        }
    }

    static void read2() { // exemplu cu multi-catch
        File file = new File("lab1.txt");
        try {                                       // try-catch clasic (nu este try-with-resources)
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println(fileInputStream.read());
            throw new NullPointerException();
        } catch (NullPointerException | IOException e) {
            System.out.println("Caught exception: " + e.toString()); // surpress
        }
    }

    static void read3() {
        File file = new File("lab1.txt");
        FileInputStream fileInputStream = null;
        try {                                       // try-catch clasic (nu este try-with-resources)
            fileInputStream = new FileInputStream(file);
            System.out.println(fileInputStream.read());
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.toString()); // surpress
        } finally {
            System.out.println("In finally!!!"); // se executa orice ar fi - dupa try sau catch
        }
    }

    static void read4() throws IOException { // exemplu unde aruncam exceptia mai departe
        File file = new File("lab1.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println(fileInputStream.read());
    }

    static void read5() throws MyCustomCheckedException {
        try {
            File file = new File("lab1.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println(fileInputStream.read());
        } catch (IOException e) {
            System.out.println(e.toString());
            throw new MyCustomCheckedException(e.getMessage()); // checked exception
        }
    }
}
