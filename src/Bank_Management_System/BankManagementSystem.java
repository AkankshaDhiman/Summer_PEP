package Bank_Management_System;
import java.util.Scanner;


public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bank bank = new Bank();
        Customer c1 = new Customer("Akanksha", new StringBuffer("Akshi2004"), "C01", "ak@example.com", "123456", 1000);
        Admin admin = new Admin("admin", new StringBuffer("admin123"));
        bank.addCustomer(c1);

        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        StringBuffer password = new StringBuffer(input.nextLine());

        Customer customer = bank.loginCustomer(username, password);
        if (customer != null) {
            System.out.println("Customer logged in successfully!");
            System.out.print("What would you like to do? ");
            while(true) {
                System.out.println("\n 1.Check Balance \n 2.Transfer \n 3. exit \n Enter your choice: ");
                int choice = input.nextInt();
                if (choice == 1) {
                    bank.viewBalance(customer);
                    break;
                } else if (choice == 2) {
                    System.out.println("Enter Amount to withdraw: ");
                    double amount = input.nextDouble();
                    if (amount <= bank.getBalance(customer)) {
                        bank.withdraw(customer.accountNumber, 100);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                } else if (choice == 3) {
                    break;
                }
                else{
                    System.out.println("Invalid choice")
                    System.out.println("try again");;
                }
            }
        } else if (admin.login(username, password)) {
            double min_bal=1000;
            System.out.println("Admin logged in successfully!");
            System.out.print("What would you like to do? \n 1.AddCustomer \n 2.View balance of a customer \n 3. exit \n Enter your choice: ");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter new customer name: ");
                String name = input.nextLine();
                System.out.print("Enter new customer password: ");
                StringBuffer pass = new StringBuffer(input.nextLine());
                System.out.print("Enter new customer id: ");
                String id = input.nextLine();
                System.out.println("Enter new customer mail: ");
                String mail = input.nextLine();
                System.out.print("Enter new customer Acc No.: ");
                String accNo = input.nextLine();
                System.out.print("Enter balance customer wants to deposit: ");
                double balance = input.nextDouble();

                Customer c= new Customer(name,pass,id,mail,accNo,);
            }
            else if (choice == 2) {
                System.out.println("Enter Customer ID: ");
                String id = input.nextLine();
                Customer c= bank.loginCustomer(id);
                System.out.println("balance: "+bank.getBalance(c));
            }
        } else {
            System.out.println("Login failed.");
        }


    }
}