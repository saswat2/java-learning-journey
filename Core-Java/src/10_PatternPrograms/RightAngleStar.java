import java.util.Scanner;

public class RightAngleStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n =  scan.nextInt();
        printRightAngleStar(n);
        scan.close();
    }
    private static void printRightAngleStar(int n) {
        // rows loop
        for (int i = 1; i <= n; i++) {
            // stars loop
            for(int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
