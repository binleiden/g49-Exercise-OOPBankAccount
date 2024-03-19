package org.example;

import java.util.UUID;

public class BankAccount {
    //Fields
    private String accountNumber;
    private double balance;
    private String customerFirstName;
    private String customerLastName;
    private String email;
    private int phoneNumber;

    //Constructor
    public BankAccount(){
        this.accountNumber = BankAccountNumberGenerator();
    }
    public BankAccount (double balance, String customerFirstName, String customerLastName, String email, int phoneNumber){
        this.accountNumber = BankAccountNumberGenerator();
        this.balance = balance;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }
    //Getters and Setters

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance<=0){
            throw new IllegalArgumentException("Balance cannot be set to a negative value");
        }
        this.balance = balance;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        if (customerFirstName == null || customerFirstName.trim().isEmpty()) {
            throw new IllegalArgumentException("FirstName cannot be null or empty.");
        }
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        if (customerLastName == null || customerLastName.trim().isEmpty()) {
            throw new IllegalArgumentException("LastName cannot be null or empty.");
        }
        this.customerLastName = customerLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("email cannot be null or empty.");
        }
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        if (phoneNumber == 0) {
            throw new IllegalArgumentException("phoneNumber cannot be 0 or empty.");
        }
        this.phoneNumber = phoneNumber;
    }


    //methods

    public String BankAccountNumberGenerator(){
        return UUID.randomUUID().toString().substring(0, 10).toUpperCase();
    }
    public int withdrawal(int amount){
        if (amount>this.balance){
            throw new IllegalArgumentException("Amount out of balance");
        } else if (amount < this.balance) {
            this.balance -= amount;
        }
        return amount;
    }

    public void displayBankAccountInfo(){
        System.out.println("Accountnr: " + accountNumber + ", Balance: " + balance + ", Firstname: " + customerFirstName+ ", Lastname: " +customerLastName+ ", Email: "+email+ ", Phonenumber: " +phoneNumber );
    }


}
