import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Hey ! enter the n value");
        int n = Scan.nextInt();
        int result = findSum(n);
        System.out.println("The sum of n Natural number is "+ result);

    }

    private static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n ;i++){
            sum = sum +i;

        }
        return sum;
    }
}