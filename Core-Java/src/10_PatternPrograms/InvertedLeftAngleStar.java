import java.util.Scanner;

public class InvertedLeftAngleStar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row number");
        int n = scan.nextInt();
        printInvertedLeftAngleStar(n);
        scan.close();
    }

    private static void printInvertedLeftAngleStar(int n) {
        // rows loop
        for(int i=1; i<=n; i++){
            // spaces loop
            for(int s = 1; s <= 2 *(i-1); s++) {
                System.out.print(" "); // one space
            }
            // stars loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }

    }
}