import java.util.Scanner;

public class FibonacciProgram {
    public static void main(String[] args){
        //connect scanner to keyboard input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci terms: ");
        int n =scan.nextInt();
        printFibonacci(n);
        scan.close();
        System.out.println();
    }

    private static void printFibonacci(int n) {
        int firstTerm = 0, secondTerm =1;
        for (int i = 1; i <= n ; i++){
            System.out.print(firstTerm+ " ");
            int nextTerm = firstTerm + secondTerm;
             firstTerm = secondTerm;
             secondTerm = nextTerm;
        }
    }
}