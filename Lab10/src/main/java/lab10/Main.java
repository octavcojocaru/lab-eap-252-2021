package lab10;

import lab10.config.InitializeTable;
import lab10.config.SqlConfig;
import lab10.model.Student;
import lab10.repository.StudentRepository;

public class Main {

    public static void main(String[] args) {
        InitializeTable.setUpDb();

        StudentRepository studentRepository = new StudentRepository(); // ar putea fi facut si singleton
        studentRepository.insertStudent(new Student("Maria", "Popescu"));
        studentRepository.insertStudentCallableStatement(new Student("John", "Doe"));
        System.out.println(studentRepository.getStudentById(2));
        System.out.println(studentRepository.getAllStudents());

        studentRepository.updateStudentFirstnameById("Johnny", 3);

        SqlConfig.closeDataBaseConnection();

        // ideal interogarile ar trebui facute in service(uri) si metodele expuse mai departe ca sa fie accesate in Main
    }
}
