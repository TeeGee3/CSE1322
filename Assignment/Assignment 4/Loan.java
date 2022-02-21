/*
Class:CSE1322L
Section:WJ1 Java
Term: Spring 2022
Instructor: Leul Endashaw
Name: Taylor Goff
Assignment 4
*/


import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Loan {
    private String customerName; //customer's full name
    private  int accountNumber; //Unique account number
    private double loanBalance; //balance of customer loan
    private double monthlyPayment; //amount of each monthly payment
    private double interestRate; // amount of interest rate
    private int numberOfMonthlyPayments; // total amount of payments
    private static int numberOfLoans = 0; // unique identifier used as account numbers, initialized with zero (0) (incremented by one each time an object is created)

    Loan(){
        customerName = "new customer";
        accountNumber=++numberOfLoans;
        loanBalance = 0;
        monthlyPayment = 0;
        interestRate =0;
        numberOfMonthlyPayments = 0;
    }

    Loan(String name, double amount, double rate, int months){

        setCustomerName(name);
        setLoanBalance(amount);
        setInterestRate(rate);
        setNumberOfMonthlyPayments(months);

//        customerName = name;
//        loanBalance = amount;
//        interestRate = rate;
//        numberOfMonthlyPayments = months;
//        accountNumber = numberOfLoans; //setting accountNumber as numberOfLoans
//        ++numberOfLoans; //increment number of loans
    }

    public static int getNumberOfLoans() {
        return numberOfLoans;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getLoanBalance() {
        return loanBalance;
    }

    public void setLoanBalance(double loanBalance) {
        this.loanBalance = loanBalance;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getNumberOfMonthlyPayments() {
        return numberOfMonthlyPayments;
    }

    public void setNumberOfMonthlyPayments(int numberOfMonthlyPayments) {
        this.numberOfMonthlyPayments = numberOfMonthlyPayments;
    }


   public static void decreaseNumberOfLoans(){
        numberOfLoans--;
   }

   public void calculateMonthlyPayment(){

     double monthly = (((getInterestRate()/100) * getLoanBalance())/(1 - Math.pow(1 + (getInterestRate()/100), -(getNumberOfMonthlyPayments())))); // consider using the Math class method Power for exponents
       DecimalFormat df = new DecimalFormat("0.00");
       monthly = Double.parseDouble(df.format(monthly));
       setMonthlyPayment(monthly);
    }

    @Override
    public String toString() {
        return "Customer Name: " + getCustomerName()  +
                ", Account Number: " + getAccountNumber() +
                ", Loan Balance: " + getLoanBalance() +
                ", Monthly Payment: " + getMonthlyPayment() +
                ", Interest Rate: " + getInterestRate() +
                ", Number Of Monthly Payments: " + getNumberOfMonthlyPayments();
    }
}
