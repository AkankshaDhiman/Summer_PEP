package Bank_Management_System;

import java.time.LocalDateTime;
import java.util.Date;

public class Transaction {
    String transactionId;
    double amount;
    LocalDateTime timestamp;
    String sender;
    String receiver;

    public Transaction(String transactionId, double amount, String sender, String receiver) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
        this.timestamp = LocalDateTime.now();
        this.transactionId = String.valueOf(Math.random());
    }
    public void printtransactionId(){
        System.out.println("transaction id  "+transactionId);
    }
}
