import java.util.Scanner;
public class HollowSquareStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = scan.nextInt();
        printHollowSquareStar(n);
        scan.close();
    }

    private static void printHollowSquareStar(int n) {
        // rows loop
        for (int i = 1; i <= n; i++) {
            // stars loop
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  "); // two spaces
                }

            }
            System.out.println();
        }
    }
}


