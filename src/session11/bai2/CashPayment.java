package session11.bai2;

class CashPayment extends Payment{
    public CashPayment(double amount){
        super(amount);
    }
    @Override
    public void pay(){
        System.out.println("Paid" + amount + "in cash.");
    }
}
