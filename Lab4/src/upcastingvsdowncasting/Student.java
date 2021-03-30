package upcastingvsdowncasting;

public class Student extends Person {

    String registrationNumber;

    public Student(String registrationNumber, String name) {
        super(name);
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
