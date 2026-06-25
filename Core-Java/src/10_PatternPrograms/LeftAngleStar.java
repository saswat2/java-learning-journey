import java.util.Scanner;

public class LeftAngleStar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of row");

        int n = scan.nextInt();
        printLeftAngleStar(n);

    }

    private static void printLeftAngleStar(int n) {
        // rows loop
        for (int i = 1; i <= n; i++) {
            // spaces loop
            for(int s = 1; s <= 2 * (n-i); s++) {
                System.out.print(" "); // one space
            }
            // stars loop
            for(int j=1; j<=i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}