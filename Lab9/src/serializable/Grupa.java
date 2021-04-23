package serializable;

import java.io.Serializable;

public class Grupa implements Serializable { // si Grupa trebuie sa fie Serializabil

    private String name;
    private int noOfStudents;

    public Grupa(String name, int noOfStudents) {
        this.name = name;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return "Grupa{" +
                "name='" + name + '\'' +
                ", noOfStudents=" + noOfStudents +
                '}';
    }
}
