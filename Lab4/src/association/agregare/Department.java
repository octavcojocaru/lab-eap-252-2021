package association.agregare;

public class Department {

    private String departmentName;
    private Employee[] employees; // one-to-many - departamentul contine 1 sau mai multi angajati
    // Employees are o referinta catre obiectul Employees[] original

    public Department(String departmentName, Employee[] employees) {
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "0001");
        Employee employee2 = new Employee("Mary", "0002");
        Employee[] employees = {employee1, employee2};

        Department department = new Department("Development", employees);
        department.getEmployees()[0].setEmployeeNumber("1111");

        System.out.println("Employee 1: " + employee1.getEmployeeNumber());

    }
}
