package in.ashokit;

class Employee {
    private int empno;
    private String ename;
    private double sal;

    public Employee(int empno, String ename, double sal) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        if (sal < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                '}';
    }
}

public class Test_02 {
    public static void main(String[] args) {

        Employee emp = new Employee(7788, "Allen", 8000);
        System.out.println(emp);

        emp.setSal(15000);
        System.out.println(emp);
    }
}