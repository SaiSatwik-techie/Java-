
class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Withdrawal denied.");
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful!");
        System.out.println("Remaining balance: " + balance);
    }
}

public class CustomExceptionDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        try {
            account.withdraw(7000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Transaction completed.");
    }
}
