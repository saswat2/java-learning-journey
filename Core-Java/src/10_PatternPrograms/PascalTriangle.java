import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n =  scan.nextInt();
        printPascalTriangle(n);
        scan.close();
    }

    private static void printPascalTriangle(int n) {
        // rows loop
        for(int i = 0; i < n; i++) {
            // spaces loop
            for(int s = 1; s <= n - i - 1; s++) {
                System.out.print(" "); // one space
            } // end of spaces loop

            //numbers loop
            for(int j = 0; j <= i; j++) {
                int num = factorial(i) / (factorial(j) * factorial(i - j));
                System.out.print(num + " ");
            } // end of numbers loop
            System.out.println();
        } // end of rows loop
    }

    private static int factorial(int i) {
        int fact = 1;
        for(int k = 1; k <= i; k++) {
            fact *= k;
        }
        return fact;
    }
}
