public class DefaultConstructorDemo {

    int id;
    String name;

    DefaultConstructorDemo() {
        id = 101;
        name = "Saswat";
    }

    void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {
        DefaultConstructorDemo obj = new DefaultConstructorDemo();
        obj.display();
    }
}