import java.util.Scanner;
public class ZPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n =  scan.nextInt();
        printZPattern(n);
        scan.close();
    }

    private static void printZPattern(int n) {
        // rows loop
        for (int i = 1; i <= n; i++) {
            // stars loop
            for (int j = 1; j <= n; j++) {
                if ( i == 1 || i == n || i + j == n+1)
                    System.out.print("*" + " ");
                else
                    System.out.print("  "); // two spaces
            }
            System.out.println();
        }
    }

}

