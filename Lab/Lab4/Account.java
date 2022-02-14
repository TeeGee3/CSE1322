/*
Class:CSE1322L
Section:WJ1 Java
Term: Spring 2022
Instructor: Leul Endashaw
Name: Taylor Goff
Lab#: 4
*/

public class Account {
    static int nextAcctNum = 1000;
    private int acctNum;
    private float acctBal;

    Account(){ //A constructor method which opens the account with a balance of 0
        acctNum = nextAcctNum;
        acctBal = 0;
        nextAcctNum++;
    }

    Account(float b){ //An overloaded constructor which opens the account with a specific amount which is passed to the constructor.
        acctNum = nextAcctNum;
        acctBal = b;
        nextAcctNum++;
    }

    int getAccountNum(){ //Getter method for accessing the account_number.
        return acctNum;
    }

    float getAcctBal(){ //getter for accessing balance
        return acctBal;
    }

    void setAcctBal(float b){ //setter for account balance
        acctBal=b;
    }

    void withdraw(float amt){ //A withdrawal method which takes a parameter of the amount to be withdrawn and deducts it from the balance.
        acctBal -= amt;
    }

    void deposit(float amt){ // A deposit method which takes a parameter of the amount to be deposited and adds it to the balance.
        acctBal+=amt;
    }
}
