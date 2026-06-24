public class Product {

    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Product(Product p) {
        this.id = p.id;
        this.name = p.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop");
        Product p2 = new Product(p1);

        p1.display();
        p2.display();
    }
}