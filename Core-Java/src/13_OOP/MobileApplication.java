import java.util.Scanner;

class Mobile02{
    String comapny ;
    String model ;
    int price ;

    Mobile02(String comapny, String model, int price){
        this.comapny = comapny;
        this.model = model;
        this.price = price;

    }
    void display(){
        System.out.println("/n============Mobile Details==================");
        System.out.println("Company : "+ comapny);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }
}
public class MobileApplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Company : ");
        String comapny = sc.nextLine();

        System.out.println("Enter model : ");
        String model = sc.nextLine();

        System.out.println("Enter Price : ");
        int price = sc.nextInt();

        Mobile02 m1 = new Mobile02(comapny,model,price);

        m1.display();


    }
}