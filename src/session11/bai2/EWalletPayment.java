package session11.bai2;

public class EWalletPayment extends Payment implements Refundable{
    public EWalletPayment(double amount) {
        super(amount);
    }
    @Override
    public void pay(){
        System.out.println("Paid" + amount + "via e-wallet.");
    }
    @Override
    public void refund() {
        System.out.println("Refunded" + amount + "to e-wallet.");
    }
}
