package externalizable;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("teachers.txt"))) {
            Teacher teacher = new Teacher("Adina", "EAP", 35);
            teacher.writeExternal(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("teachers.txt"))) {
            Teacher teacher = new Teacher();
            teacher.readExternal(inputStream);
            System.out.println(teacher);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
