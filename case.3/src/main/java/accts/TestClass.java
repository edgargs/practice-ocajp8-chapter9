package accts;

import specialAccts.RetirementAccount;

/**
 * Created by USER on 4/01/2019.
 */
public class TestClass {
    public static void main(String[] args){
        Account a = new Account(); //Compile.

        RetirementAccount ra = new RetirementAccount();
        ra.balance = 100.0; //Account.balance is protected. Use because extends class.
        ra.accountNumber = 10; //Account.acccountNumber is 'package access' (default)
        ra.setAccountNumber(10); //public setter in Account
        ra.interestRate = 7.0; //SavingsAccount's member is 'package private' (default)
        ra.setInterestRate(7.0); //public setter in SavingsAccount

        SavingsAccount sa = new SavingsAccount();
        sa.balance = 10.0; //ok
        sa.accountNumber = 10; //ok
        sa.interestRate = 7.0; //ok

    }
}
