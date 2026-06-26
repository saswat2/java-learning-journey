class person {
    String name = "Saswat";
    int age = 23;

    void displayPerson(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
// Chlid class
class Emp extends person{
    int emId = 101;
    double salary = 50000;

    void displayEmp(){
        System.out.println("Employee ID : "+emId);
        System.out.println("Salary : "+salary);

    }
}
public class InheritanceExample02 {
    public static void main(String[] args){
        Emp emp = new Emp();

        // parent class method
        emp.displayPerson();

        //Child class method
        emp.displayEmp();g

    }
}