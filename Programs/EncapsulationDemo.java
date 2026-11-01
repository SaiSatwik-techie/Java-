
class BankAccount {

    // Private variables cannot be accessed directly outside this class
    private String accountHolder;
    private double balance;

    // Setter method to assign account holder name
    public void setAccountHolder(String name) {
        accountHolder = name;
    }

    // Getter method to retrieve account holder name
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter method to update balance
    public void setBalance(double amount) {

        // Allow only non-negative balance
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid balance amount");
        }
    }

    // Getter method to retrieve balance
    public double getBalance() {
        return balance;
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // Setting values using setter methods
        account.setAccountHolder("Sai");
        account.setBalance(10000);

        // Getting values using getter methods
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Balance: " + account.getBalance());

        // Trying to set an invalid balance
        account.setBalance(-500);
    }
}
