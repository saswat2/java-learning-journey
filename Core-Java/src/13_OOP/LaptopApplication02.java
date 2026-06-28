import java.util.Scanner;

class Laptop_02{
    String brand ;
    String model ;
    int price ;

    // Parameterized Construcor

    Laptop_02(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;

    }
    void disPlay(){
        System.out.println("/n===========Laptop Details======= ");
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }

}
public class LaptopApplication02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the laptop Brand : ");
        String brand = sc.nextLine();

        System.out.println("Enter Laptop Model : ");
        String model = sc.nextLine();

        System.out.println("Enter Laptop price : ");
        int price = sc.nextInt();

        Laptop_02 laptop02 = new Laptop_02(brand, model, price);
        laptop02.disPlay();

        sc.close();
    }
}