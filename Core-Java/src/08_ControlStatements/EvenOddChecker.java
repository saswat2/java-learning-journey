import java.util.Scanner;

/**
 * The program has to check whether a given
 * number is even or odd.
 */
public class EvenOddChecker {
    public  static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Hey ! enter a number");
        int num = scan.nextInt();

        if (num % 2 == 0)
            System.out.println(num +"is even!");
        else
            System.out.println(num + "is odd!");
        scan.close();
    }
}