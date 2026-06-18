// write a program to convert value to celsius value
// formula C = (f-32)/ 1.8

import java.util.Scanner;
public class FarhrenheitTocelsius {
    public static void main(String[] args){

        // connected Scanner class to the keyboard input
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter forenheit value : ");
        double f = scan.nextDouble();

        //convert forenheit to celsius
        double c = (f - 32) / 1.8;
        System.out.println("forenheit value = " + f);
        System.out.println("celsius value = " + c);

        scan.close();



    }
}