package Bank_Management_System;
import Bank_Management_System.Customer;
import java.util.*;

public class Bank {
    Map<String, Customer> customers = new HashMap<>();
    List<Transaction> transactions = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.put(customer.accountNumber, customer);
    }

    public Customer loginCustomer(String username, StringBuffer password) {
        for (Customer c : customers.values()) {
            if (c.login(username, password)) {
                return c;
            }
        }
        return null;
    }


    public void viewBalance(Customer customer) {
        customer.viewBalance();
    }

    public double getBalance(Customer customer) {
        return customer.viewBalance();
    }

//    public void transfer(String fromAcc, String toAcc, double amount) {
//        Customer sender = customers.get(fromAcc);
//        Customer receiver = customers.get(toAcc);
//        if (sender != null && receiver != null && sender.balance >= amount) {
//            sender.balance -= amount;
//            receiver.balance += amount;
//            Transaction t = new Transaction(UUID.randomUUID().toString(), amount, fromAcc, toAcc);
//            transactions.add(t);
//            System.out.println("Transferred Rs. " + amount + " from " + fromAcc + " to " + toAcc);
//        } else {
//            System.out.println("Transfer failed. Check balance or account details.");
//        }
//    }

    public void withdraw(String accNo, double amount) {
        Customer customer = customers.get(accNo);
        if (customer != null && customer.balance >= amount) {
            customer.balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance or account doesn't exist.");
        }
    }
}
