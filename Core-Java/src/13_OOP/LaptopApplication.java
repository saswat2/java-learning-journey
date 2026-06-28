class Laptop_o1{
    String brand ;
    String model ;
    int price ;
    // Parameterized Constructor
    Laptop_o1(String brand, String model, int price ){
        this.brand = brand;
        this.model = model;
        this.price = price;

    }
    void disPlay(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }

}
public class LaptopApplication {
    public static void main(String[] args){

        Laptop_o1 laptopO1 = new Laptop_o1("Dell","Inspiration",650000);
        Laptop_o1 laptopO2 = new Laptop_o1("HP","Pavilion", 72000);
        Laptop_o1 laptopO3 = new Laptop_o1("Lenovo", "IdealPad",58000);

        laptopO1.disPlay();
        System.out.println();

        laptopO2.disPlay();
        System.out.println();

        laptopO3.disPlay();
    }
}