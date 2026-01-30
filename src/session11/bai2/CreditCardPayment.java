package session11.bai2;

public class CreditCardPayment extends Payment implements Refundable{
    public CreditCardPayment(double amount) {
        super(amount);
    }
    @Override
    public void pay(){
        System.out.println("Paid" + amount + "by credit card.");
    }
    @Override
    public void refund() {
        System.out.println("Refunded" + amount + "to credit card.");
    }
}
