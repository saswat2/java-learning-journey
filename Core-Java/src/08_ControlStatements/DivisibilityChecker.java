
/*
 * The program has to accept an integer from a user and
 * then it should do the following.
 *  1. if the integer is divisible by 3 then display "Zip"
 *  2. if the integer is divisible by 5 then display "Zap"
 *  3. if the integer is divisible by 3 and 5 then display "Rar"
 *  4. Otherwise, display "Jar"
 */

import java.util.Scanner;
public class DivisibilityChecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Integer ");
        int num = scan.nextInt();

        if (num % 3 == 0 && num % 5 == 0)
            System.out.println("Rar");
        else if ( num % 3 == 0)
            System.out.println("Zip");
        else if ( num % 5 == 0)
            System.out.println("Zap");
        else
            System.out.println("Jar");

        scan.close();
    }
}

