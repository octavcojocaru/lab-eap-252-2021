package lab10.repository;

import lab10.config.SqlConfig;
import lab10.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    public void insertStudent(Student student) {
        String sql = "INSERT INTO student (first_name, last_name) VALUES (?,?)";
        Connection connection = SqlConfig.getDataBaseConnection();

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, student.getFirstName());
            statement.setString(2, student.getLastName());

            statement.executeUpdate();
            System.out.println("Added student");
        } catch (SQLException exception) {
            System.err.println("Cannot insert into table");
        }
    }

    public void insertStudentCallableStatement(Student student) {
        String sql = "{call insertStudent(?,?,?)}"; // referentiaza o procedura stocata in DB
        Connection connection = SqlConfig.getDataBaseConnection();

        try {
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.setString(2, student.getFirstName());
            callableStatement.setString(3, student.getLastName());

            callableStatement.registerOutParameter(1, Types.INTEGER);

            callableStatement.execute();

            System.out.println("Added student with id: " + callableStatement.getInt(1));

        } catch (SQLException exception) {
            System.err.println("Cannot insert student into table");
        }
    }

    public Student getStudentById(int id) {
        String sql = "SELECT * FROM student WHERE id=?";
        Connection connection = SqlConfig.getDataBaseConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Student student = new Student(resultSet.getString(2), resultSet.getString(3));
                student.setId(resultSet.getInt(1)); // accessam fiecare cololana cu resultSet.getInt/getString...etc
                return student;
            }

        } catch (SQLException exception) {
            System.err.println("Could not get student");
        }
        return null; // or exception
    }

    public List<Student> getAllStudents() {
        String sql = "SELECT * FROM student";
        Connection connection = SqlConfig.getDataBaseConnection();
        List<Student> allStudents = new ArrayList<Student>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql); // executeQuery - pentru ca avem QUERY

            while (resultSet.next()) {
                Student currentStudent = new Student(resultSet.getString(2), resultSet.getString(3));
                currentStudent.setId(resultSet.getInt(1));
                allStudents.add(currentStudent);
            }

        } catch (SQLException exception) {
            System.err.println("Could not get students");
        }
        return allStudents;
    }

    public void updateStudentFirstnameById(String newFirstName, int id) {
        String sql = "UPDATE student SET first_name=? WHERE id=?";
        Connection connection = SqlConfig.getDataBaseConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newFirstName);
            preparedStatement.setInt(2, id);

            preparedStatement.executeUpdate(); // executeUpdate - avem instructiune de tip UPDATE

            System.out.println("Updated name of student with id " + id);

        } catch (SQLException exception) {
            System.err.println("Error while updating student with id " + id);
        }
    }

}
