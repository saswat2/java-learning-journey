class car_01{
    String brand ;
    String model ;
    int price ;

    car_01(String brand, String model, int price){
        this.brand =  brand;
        this.model = model;
        this.price = price;


    }
    void display(){
        System.out.println("Brand : "+ brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }
}
public class CarApplication {
    public static void main(String[] args){
        car_01 car01 = new car_01("Hyundai","Creta",150000000);
        car_01 car2 = new car_01("Tata","Nexon",12000000);

        car01.display();
        System.out.println();

        car2.display();
    }
}