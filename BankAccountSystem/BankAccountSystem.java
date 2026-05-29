

public class BankAccountSystem {

    // private Encapsulation

    private int accountHolderNumber;
    private String holderName;
    private double balance;

    // constructor

    public BankAccountSystem(int accountHolderNumber, String holderName, double balance) {

        this.accountHolderNumber = accountHolderNumber;
        this.holderName = holderName;
        this.balance = balance;

    }

    // getter
    public int getAccountHolderNumber() {
        return this.accountHolderNumber;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public double getBalance() {
        return this.balance;
    }

    // methods

    public void deposite(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Amount");

        } else {

            balance += amount;
        }

    }

    public void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insuficient Balance");

        } else if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else {

            balance -= amount;
        }
    }
    
    public void displayAccount() {
        System.out.println("Account Number: " + accountHolderNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccountSystem b1 = new BankAccountSystem(1001, "Hitesh", 100000);
       

        b1.deposite(1000);
        System.out.println(b1.getHolderName());
        System.out.println(b1.getBalance());
        b1.deposite(0);
        b1.deposite(-100);
        b1.withdraw(100478);
        System.out.println(b1.getBalance());
        b1.withdraw(100478);

    }
}
