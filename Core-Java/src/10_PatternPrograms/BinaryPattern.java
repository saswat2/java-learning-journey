import java.util.Scanner;

public class BinaryPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n =  scan.nextInt();
        printBinaryPattern(n);
        scan.close();
    }

    private static void printBinaryPattern(int n) {
        int k = 0;
        // rows loop
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                k = 0;
            }
            else {
                k = 1;
            }

            // numbers loop
            for(int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                if( k == 0)
                    k = 1;
                else
                    k = 0;
            } // end of numbers loop(inner loop)
            System.out.println();
        } // end of rows loop (outer loop)
    }
}
