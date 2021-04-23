package serializable;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (ObjectOutputStream fOut = new ObjectOutputStream(new FileOutputStream("students.txt"))) {
            Student studentToWrite = new Student(10, "Matei", new Grupa("Gr252", 25));
            fOut.writeObject(studentToWrite);
        } catch (IOException e) {
            System.err.println("Cannot write to file." + e.getMessage());
        }

        try(ObjectInputStream fInputStream = new ObjectInputStream(new FileInputStream("students.txt"))) {
            Student student = (Student) fInputStream.readObject();
            System.out.println("Student read from file: " + student);
        } catch (IOException e) {
            System.err.println("Cannot write to file." + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found." + e.getMessage());
        }
    }
}
