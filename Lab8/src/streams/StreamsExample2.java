package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample2 {

    public static void main(String[] args) {

        String student1 = "Alex";
        String student2 = "Mark";
        String student3 = "Brian";

        List<String> names = new ArrayList<>();
        names.add(student1);
        names.add(student2);
        names.add(student3);

        List<Person> studentList = names.stream()
                .map(Person::new) // method reference - se returneaza un stream de obiecte Person
//                .map(name -> new Student(name)) - echivalent
                .collect(Collectors.toList());

        for (Person student : studentList) {
            System.out.println(student);
        }
    }
}
