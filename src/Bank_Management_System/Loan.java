package Bank_Management_System;

public class Loan {
    double amount;
    String userID;
    double interestRate;
    int time;

    public Loan(double amount, String userID, double interestRate, int time) {
        this.amount = amount;
        this.userID = userID;
        this.interestRate = interestRate;
        this.time = time;
    }

    public double getEMI() {
        double r = interestRate / (12 * 100);
        int n = time * 12;
        return (amount * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    }
}
