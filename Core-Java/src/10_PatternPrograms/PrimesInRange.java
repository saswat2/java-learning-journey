import java.util.Scanner;

public class PrimesInRange01 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number of range");
        int a = scan.nextInt();
        System.out.println("Enter the second number of the range ");
        int b = scan.nextInt();
        System.out.println("Prime Number between " + a + " and " + b + ":");
        printPrimeBetween(a, b);
        scan.close();
    }
}

    private static void printPrimeBetween(int a, int b) {

        for(int i = a; i <= b; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } // end of if
            } // end of j loop
            if(isPrime)
                System.out.print(i + " ");
        } // end of i loop
    }

void main() {
}

