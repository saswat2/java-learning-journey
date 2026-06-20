import java.util.Scanner;

/**
 * This program has to accept the distance (in kms) as input
 * and should calculate the delivery fee as below.
 * 1. for first 3 kms free delivery
 * 2. for next 3 kms, Rs. 6 per km
 * 3. for remaining kms, Rs. 12 per km
 */

public class DeliveryFeeCalculator {
    public static void main(String[] args){

        // connect Scanner to the keyboard input
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey ! enter the distance in kms");
        int distance = scan.nextInt();

        double  delivryfee = 0;
        if (distance <= 3){
           delivryfee = 0;
        } else if (distance <= 6 ) {
            delivryfee = (distance - 3) * 6 ;


        }
        else {
            delivryfee = 0 + 3 * 6 + (distance - 6) * 12;
        }
        System.out.println("Delivery fee is :"+ delivryfee);
        scan.close();
    }
}