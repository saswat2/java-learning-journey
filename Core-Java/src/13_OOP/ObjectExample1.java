class Student1 {
    int id = 101 ;
    String name = "Saswat";
void  display(){
    System.out.println("ID: "+id);
    System.out.println("Name: "+name);
}
}
public class ObjectExample1 {
    public static void main(String[] args){
        // Obejct creation
        Student1 s1 = new Student1();

        // method call
        s1.display();
    }
}