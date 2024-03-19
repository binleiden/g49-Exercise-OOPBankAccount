package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       BankAccount bankAccount = new BankAccount();
       bankAccount.setBalance(10000);
       bankAccount.setCustomerFirstName("Daniel");
       bankAccount.setCustomerLastName("Petersson");
        bankAccount.displayBankAccountInfo();
       bankAccount.withdrawal(900);
       bankAccount.displayBankAccountInfo();
    }
}
