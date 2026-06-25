import java.util.Scanner;

public class HollowDiamondStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n = scan.nextInt();
        printHollowDiamondStar(n);
        scan.close();
    }

    private static void printHollowDiamondStar(int n) {
        // rows loop (for upper part)
        for (int i = 1; i <= n; i++) {
            // spaces loop
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" "); //one space
            }
            // stars loop
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*" + " ");
                else
                    System.out.print("  "); // two spaces

            }
            System.out.println();
        }

        //rows loop (for lower part)
        for (int i = 1; i <= n - 1; i++) {
            // spaces loop
            for (int s = 1; s <= 2 * i; s++) {
                System.out.print(" "); //one space
            }
            // stars loop
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                if (j == 1 || j == 2 * (n - i) - 1)
                    System.out.print("*" + " ");
                else
                    System.out.print("  "); // 2 spaces
            }
            System.out.println();
        }

    }

}
