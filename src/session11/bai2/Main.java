package session11.bai2;

public class Main {
    public static void main(String[] args) {
        Payment[] payments ={
                new CashPayment(100),
                new CashPayment(200),
                new CashPayment(300),
        };
    for (Payment payment : payments) {
        payment.printAmount();
        payment.pay();
        if (payment instanceof Refundable) {
            ((Refundable) payment).refund();
        }
        System.out.println("-------------------");
    }
    }
}
