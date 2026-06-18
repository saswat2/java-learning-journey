import java.util.Scanner;

public class Mulitiplication {

    public static void main(String[] args) {

        // connect the Scanner to the keyboard input
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value for a");
        int a = scan.nextInt();

        System.out.println("Enter value for b");
        int b = scan.nextInt();

        int c = a * b;

        System.out.println("product = " + c );
    }

}
