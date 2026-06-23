class  Employee{
    int empId;
    String empName;
    double monthlySalary;
    Employee(int empId, String empName, double monthlySalary){
        this.empId = empId;
        this.empName = empName;
        this.monthlySalary = monthlySalary;

    }
    double annualSalary(){
        return monthlySalary * 12;

    }
    void display(){
        System.out.println("Employee ID : "+empId);
        System.out.println("Employee Name :"+empName);
        System.out.println("Employee Salary :"+monthlySalary);
        System.out.println("Annual Salary :" +annualSalary());
    }
}
public class EmployeeDemo{
    public static void main(String[] args){
        Employee e = new Employee(101,"Saswat",5000);
        e.display();

   }
}