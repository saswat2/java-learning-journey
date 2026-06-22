import java.util.Scanner;

public class PrimeNumber {
    public static  void main(String[] args){
        //connect Scanner to the keyboard input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        long number = scan.nextLong();
        boolean flag = isPrime(number);
        if (flag==true){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not a prime Number");
        }
        scan.close();
    }

    private static boolean isPrime(long number) {
        for (long i = 2; i < Math.sqrt(number) ; i ++ ) {
            if ( number % i == 0){
                return  false;
            }

        }
        return true;
    }
}