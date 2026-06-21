import java.util.Scanner;

/*
 * The program has to accept two integers from a user
 * then it should the following.
 *  1. if they are equal then find the sum
 *  2. if they are not equal then find the product
 *  3. if any integer is negative then return -1
 *
*/
public class EqualSumOrProduct {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first integer");
        int num1 = scan.nextInt();

        System.out.println("Enter the second integer");
        int num2 = scan.nextInt();

        if (num1 < 0 || num2 < 0 )
            System.out.println("-1");
        else if (num1 == num2)
           System.out.println(num1+num2);

        else
            System.out.println(num1*num2);


        scan.close();

    }
}