import java.util.Scanner;

interface PaymentMethod {
    boolean pay(double amount);

}

class Payment{
    private PaymentMethod paymentMethod;

    public Payment(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public boolean pay(double amount) {
        return paymentMethod.pay(amount);
    }
}

public class Payment_Gateway{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Payment payment =null;
        while(true) {
            System.out.print("Select Payment Method \n 1. PayPal \n 2. Paytm \n");
            int choice = in.nextInt();

            final double[] accountBalance = {15740};
            if (choice == 1) {
                payment = new Payment(amount1 -> {
                    if (amount1 > accountBalance[0]) {
                        System.out.println("Insufficient balance for PayPal.");
                        return false; // Fail if not enough funds
                    } else {
                        // Deduct amount from balance
                        accountBalance[0] -= amount1;
                        System.out.println("Paying " + amount1 + " using PayPal.");
                        return true;
                    }
                });
                break;
            } else if (choice == 2) {
                payment = new Payment(amount1 -> {
                    if (amount1 > accountBalance[0]) {
                        System.out.println("Insufficient balance for Paytm.");
                        return false; // Fail if not enough funds
                    } else {
                        // Deduct amount from balance
                        accountBalance[0] -= amount1;
                        System.out.println("Paying " + amount1 + " using Paytm.");
                        return true;
                    }
                });
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        System.out.println("Enter Amount to pay: ");
        double amount = in.nextDouble();
        if(payment.pay(amount)){
            System.out.println("Payment successful. remaining amount is " + amount);
        }else {
            System.out.println("Payment failed.");
        }
    }
}
