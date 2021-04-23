package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentExample {

    public static void main(String[] args) {

        Student student1 = new Student(7.98f, "Alex");
        Student student2 = new Student(8.75f, "Matt");
        Student student3 = new Student(6.99f, "Cody");
        Student student4 = new Student(9.76f, "Dan");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        List<Student> sortedStudentList = studentList.stream()
                .sorted()
                .collect(Collectors.toList());

        for(Student student : sortedStudentList) {
            System.out.println(student);
        }

        List<Student> sortedStudentListByMark = studentList.stream()
//                .sorted(Comparator.comparing(Student::getMark))
                .sorted(Comparator.comparing(student -> student.getMark(), Comparator.reverseOrder()))
                .collect(Collectors.toList());

        for(Student student : sortedStudentListByMark) {
            System.out.println(student);
        }



        Student maxStudent = studentList.stream()
                .max(Comparator.comparing(student -> student.getMark()))
//                .orElse(student1) // in caz ca elementul este null, ii putem da un default
                .orElseThrow(() -> new IllegalStateException("Student with highest grade not found"));

        System.out.println(maxStudent);


        List<Student> emptyList = new ArrayList<>();
        emptyList.stream()
                .max(Comparator.comparing(student -> student.getMark()))
//                .orElse(student1) // in caz ca elementul este null, ii putem da un default
                .orElseThrow(() -> new IllegalStateException("Student with highest grade not found"));


    }
}
