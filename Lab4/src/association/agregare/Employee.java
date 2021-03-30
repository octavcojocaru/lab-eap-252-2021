package association.agregare;

public class Employee {

    private String employeeName;
    private String employeeNumber;

    public Employee(String employeeName, String employeeNumber) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}
