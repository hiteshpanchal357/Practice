package PaymentSystem;

public class CashPayment implements Payment {
    
    @Override

    public void pay(double amount){

        if(amount <=0){
            System.out.println("Invalid amount");
            return;
        }

        System.out.println("Paid" + amount + "using Cash");
    }
}
