package lab10.service;

import lab10.model.Student;
import lab10.repository.StudentRepository;

public class Service {

    StudentRepository studentRepository = new StudentRepository(); // sau getInstance().
//    TeacherRepository teacherRepository = new TeacherRepository();

    public Student getStudentById(int id) {
        Student student = studentRepository.getStudentById(id);
        // ... procesare daca mai este nevoie
        return student;
    }

    // alte metode accesibile public.

    // service-ul encapsuleaza Repository/urile
    // service-ul expune mai departe metodele catre clasa Main.
    // service-ul face procesarea in general
}
