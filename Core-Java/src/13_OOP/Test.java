

class BankAccount {
    long accountNumber;
    String name;
    double balance;

    void deposite(double amount ) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposite :" + amount);
        } else {
            System.out.print("Amount is negative");
        }
    }

    void withdaw(double amount)    {
            if (amount > 0 && balance >= amount){
                balance -= amount;
                System.out.println("withdaw :" + amount);
            }
            else {
                System.out.println("Amount is negative or insufficiant balance");
            }
    }

    double checkBalance(){
            return balance;
    }


} // end of the BankAccount class

public class Test {
    public static void main (String[] args){
        BankAccount ac1 = new BankAccount();
        BankAccount ac2 = new BankAccount();

        // assign the values to the attributes
        ac1.accountNumber = 12345;
        ac1.name = "Saswat";
        ac1.balance =50000;

        // assign the values of the attribute
        ac2.accountNumber = 54321;
        ac2.name = "Ajit";
        ac2.balance = 60000;

        ac1.deposite(5000);
        ac2.withdaw(7246);
        ac1.withdaw(4128);
        ac2.deposite(3062);

        double balInAcc1 = ac1.checkBalance();
        double balInAcc2 = ac2.checkBalance();

        System.out.println("Balanve in bank account 1 :" + balInAcc1) ;
        System.out.println("Balance in bank account 2 :" + balInAcc2);
    }
}