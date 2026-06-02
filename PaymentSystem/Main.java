package PaymentSystem;

public class Main {
    
    public static void main(String[] args){

        Payment p1 = new UpiPayment();

        Payment p2 = new CardPayment();

        Payment p3 = new CashPayment();

        p1.pay(10.26);
        p2.pay(45000);
        p3.pay(1000);
        p1.pay(78);
        p2.pay(-78);


    }
}
