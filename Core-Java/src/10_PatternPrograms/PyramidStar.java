import java.util.Scanner;

public class PyramidStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = scan.nextInt();
        printPyramidStar(n);
        scan.close();
    }

    private static void printPyramidStar(int n) {
        // rows loop
        for (int i = 1; i <= n; i++) {
            // spaces loop
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" "); //one space
            }
            // stars loop
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();


        }
    }
}
