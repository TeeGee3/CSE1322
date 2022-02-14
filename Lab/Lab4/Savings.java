/*
Class:CSE1322L
Section:WJ1 Java
Term: Spring 2022
Instructor: Leul Endashaw
Name: Taylor Goff
Lab#: 4
*/

public class Savings extends Account{

    @Override
    void setAcctBal(float b) { //constructor to set the account balance.
        super.setAcctBal(b);
    }

    @Override
    void withdraw(float amt) { // if withdraw amount larger than account balance - overdraft condition if statement
        float savingsMinimum = 500;
        float withdrawFee = 10;
        super.withdraw(amt); //acctBal -= amt;
        if(getAcctBal() < savingsMinimum){
            System.out.println("Charging a fee of $10 because account is below $500");
            super.withdraw(withdrawFee);
        }
    }

    int depositCount = 0;
    int depositCountMax = 5;
    int depositOverageFee = 10;

    @Override
    void deposit(float amt) { // deposit method so it implements the charge for more than 5 deposits
//        int depositCount = 0;
//        int depositCountMax = 5;
//        int depositOverageFee = 10;

        super.deposit(amt);
        depositCount++;
        System.out.println("This is deposit "+depositCount+" to this account");

        if(depositCount > depositCountMax){
            System.out.println("Charging a fee of $10");
            setAcctBal(getAcctBal() - depositOverageFee);//withdraw(depositOverageFee); //acctBal -= depositOverageFee;
        }
    }

    void savingsInterest(){ // method which adds 1.5% interest to the account
        float interestRate = 0.015F;
        float interestEarned;

        interestEarned = getAcctBal() * interestRate;
        System.out.println("Customer earned $"+interestEarned+" in interest");
        setAcctBal(getAcctBal()+interestEarned);  //acctBal += interestEarned;

    }



}
