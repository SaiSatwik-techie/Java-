
class Bank {
    void getInterestRate() {
        System.out.println("General Bank Interest Rate");
    }
}

class SBI extends Bank {
    @Override
    void getInterestRate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank {
    @Override
    void getInterestRate() {
        System.out.println("HDFC Interest Rate: 7%");
    }
}

public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        b.getInterestRate();

        b = new HDFC();
        b.getInterestRate();

        b = new Bank();
        b.getInterestRate();
    }
}
