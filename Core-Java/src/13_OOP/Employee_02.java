public class Employee_02 {

    int empId;
    String empName;
    double salary;

    Employee_02(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void display() {
        System.out.println(empId + " " + empName + " " + salary);
    }

    public static void main(String[] args) {
        Employee_02 e1 = new Employee_02(101, "Saswat", 50000);
        e1.display();
    }
}