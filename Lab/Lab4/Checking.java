/*
Class:CSE1322L
Section:WJ1 Java
Term: Spring 2022
Instructor: Leul Endashaw
Name: Taylor Goff
Lab#: 4
*/

public class Checking extends Account {


    @Override
    void setAcctBal(float b) { //constructor to set the account balance.
        super.setAcctBal(b);
    }

    @Override
    void withdraw(float amt) { // if withdraw amount larger than account balance - overdraft condition if statement

        if(amt > getAcctBal()){
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            float overdraftFee = 20;
            super.withdraw(amt+overdraftFee);
        }
        else {super.withdraw(amt);}
    }






}



