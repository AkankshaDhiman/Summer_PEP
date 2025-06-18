public class Payment_Gateway {

}
interface PaymentMethod {
    void pay(double amount);
}

class PayPal implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using PayPal.");
    }
}

 class Paytm implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Paytm.");
    }
}

class Payment{
    private PaymentMethod paymentMethod;

    public Payment(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void pay(double amount) {
        paymentMethod.pay(amount);
    }
}

class Main{
    public static void main(String[] args) {
        Payment payment1 = new Payment(new PayPal());
        Payment payment2 = new Payment(new Paytm());
        payment1.pay(2500);
        payment2.pay(3000);

    }
}
