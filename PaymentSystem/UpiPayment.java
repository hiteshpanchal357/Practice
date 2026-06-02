package PaymentSystem;

public class UpiPayment implements Payment {

    @Override

    public void pay(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Payment Amount");
            return;
        }

        System.out.println(
                "Paid " + amount + "using UPI");
    }
}