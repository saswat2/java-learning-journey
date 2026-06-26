class  Employee_01 {
    int empId ;
    String empName ;

    void setData(int id , String Name){
        empId = id;
        empName = Name;

    }

    void  display(){
        System.out.println(empId +" "+ empName);
    }
}
public class ObjectExample2 {
    public static void main(String[] args){

        Employee_01 employee01 = new Employee_01();
        Employee_01 employee02 = new Employee_01();

        employee01.setData(101,"Rahul");
        employee02.setData(102, "Amit");

        employee02.display();
        employee01.display();
    }
}