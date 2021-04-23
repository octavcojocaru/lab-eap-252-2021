package serializable;

import java.io.Serializable;

public class Student implements Serializable { // Student trebuie sa fie Serializable

    private int grade;
    private transient String name;
    private Grupa grupa;

    public Student(int grade, String name, Grupa grupa) {
        this.grade = grade;
        this.name = name;
        this.grupa = grupa;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                ", grupa=" + grupa +
                '}';
    }
}
