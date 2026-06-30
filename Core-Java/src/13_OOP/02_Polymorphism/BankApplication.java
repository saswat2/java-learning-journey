class Bank {

    public void interestRate() {
        System.out.println("Default Interest Rate");
    }
}

class SBI extends Bank {

    @Override
    public void interestRate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank {

    @Override
    public void interestRate() {
        System.out.println("HDFC Interest Rate: 7%");
    }
}

public class BankApplication {

    public static void main(String[] args) {

        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        b1.interestRate();
        b2.interestRate();
    }
}