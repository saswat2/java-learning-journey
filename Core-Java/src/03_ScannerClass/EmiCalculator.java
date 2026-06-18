// write a program to calculate EMI based on the given princeple amount , rate of inetrest and tenure.

import java.util.Scanner;
 public class EmiCalculator {
     public static void main(String[] args ){

         // connect Scanner to the keyboard input
         Scanner scan = new Scanner(System.in);

         System.out.println("Enter principle amount");
         int p = scan.nextInt();

         System.out.println("Enter rate of interest");
         double roiPerAnnaum = scan.nextDouble();

         System.out.println("Enter tenure in years");
         int tennure = scan.nextInt();

         //convert rate of intrest from annum to month
         double r = roiPerAnnaum/12/100;

         // convert tennure from years of months
         int n = tennure * 12 ;

         double emi = p * r * Math.pow(1 + r , n) / (Math.pow(1+r, n) - 1);
         System.out.println("Principle amount : " + p);
         System.out.println("monthly rate of interest : " + r);
         System.out.println("number of months : " + n);
         System.out.println("emi : " + emi);

         scan.close();
     }

 }
