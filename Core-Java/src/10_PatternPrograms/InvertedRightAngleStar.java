import java.util.Scanner;

public class InvertedRightAngleStar {
    public  static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = scan.nextInt();
        printInvertedRightAngleStar(n);
        scan.close();
    }

    private static void printInvertedRightAngleStar(int n) {
        //rows loop
        for (int i = 1; i <= n ; i++){
            //star loop
            for (int j = 1 ; j <= n-i+1 ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}