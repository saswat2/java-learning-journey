//Write a program to covert celsius value into foreheit value
//formaula : f = (c * 1.8 ) + 32
//      or
// f = ( c  * 9/5) * 32

import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // connect Scanner to the keyboard input

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter celsius value : ");
        double c = scan.nextDouble();

        //convert celsius to forenheit
        double f = (c * 1.8) + 32 ;

        System.out.println("Enter celsius value : " + c);
        System.out.println("Enter celsius value : " + f);
        scan.close();


    }
}