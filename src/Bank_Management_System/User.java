package Bank_Management_System;

import java.util.*;

// Base User class
public class User {
    protected String username;
    protected StringBuffer password;

    public User(String username, StringBuffer password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, StringBuffer password) {
        return this.username.equals(username) && this.password.toString().equals(password.toString());
    }

    public void changePassword(StringBuffer newPassword) {
        this.password = newPassword;
    }
}

// Customer class
class Customer extends User {
    String id;
    String email;
    String accountNumber;
    double balance;

    public Customer(String username, StringBuffer password, String id, String email, String accountNumber, double balance) {
        super(username, password);
        this.id = id;
        this.email = email;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double viewBalance() {
        return balance;
    }
    public boolean login(String username, StringBuffer password) {
        return this.username.equals(username) && this.password.toString().equals(password.toString());
    }

}

// Admin class
class Admin extends User {
    public Admin(String username, StringBuffer password) {
        super(username, password);

    }
    public boolean login(String username, StringBuffer password) {
        return this.username.equals(username) && this.password.toString().equals(password.toString());
    }

}