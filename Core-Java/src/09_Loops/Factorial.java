import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        // coonect Scanner to the keyboard input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scan.nextInt();

        long result = factorial(number);
        System.out.println("the factorial of " + number + " is " + result);
        scan.close();
    }

    private static long factorial(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++){
            fact = fact * i;

        }
        return fact;
    }
}