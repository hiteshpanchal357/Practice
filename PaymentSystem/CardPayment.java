package PaymentSystem;

public class CardPayment implements Payment {

    @Override

    public void pay(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Amount");
            return;
        }

        System.out.println("Paid" + amount + "using Card");
    }
}
