public class Person {

    int id;
    String name;

    Person() {
        this(101, "Saswat");
    }

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.display();
    }
}