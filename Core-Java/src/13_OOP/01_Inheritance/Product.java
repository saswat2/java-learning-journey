public class Product {

    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void bill(int quantity) {
        System.out.println("Total Bill = ₹" + (price * quantity));
    }

    public static void main(String[] args) {

        Product p = new Product(101, "Keyboard", 700);

        p.bill(3);
    }
}