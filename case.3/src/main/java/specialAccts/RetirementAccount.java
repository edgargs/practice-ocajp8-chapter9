package specialAccts;

import accts.Account; //No access from outside package
import accts.SavingsAccount;

/**
 * Created by USER on 4/01/2019.
 */
public class RetirementAccount extends SavingsAccount{

    private String maturityDate;

    public String getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    public static void main(String... args){
        Account a = new Account(); //Not compile. Account class have default modifier

        RetirementAccount ra = new RetirementAccount();
        ra.balance = 100.0; //Account.balance is protected. Use because extends class.
        ra.accountNumber = 10; //Account.accountNumber is 'package access' (default)
        ra.setAccountNumber(10); //public setter in Account
        ra.interestRate = 7.0; //SavingsAccount's member is 'package private' (default)
        ra.setInterestRate(7.0); //public setter in SavingsAccount

        SavingsAccount sa = new SavingsAccount();
        sa.balance = 10.0; //Account.balance is protected. Don't use because instances class.
        sa.accountNumber = 10; //Not compile
        sa.interestRate = 7.0; //Not complie

        //Compare with TestClass.main method
    }
}
