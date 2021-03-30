package upcastingvsdowncasting;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Student("12345", "person1"); // upcasting - referim obiectul prin intermediul superclasei

        Person person2 = new Student("0000", "person2");

        Student student = (Student) person2; // downcasting-ul nu se poate face implicit

        System.out.println(student.getRegistrationNumber());
    }

}
