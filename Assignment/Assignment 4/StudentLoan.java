public class StudentLoan extends Loan {
    private boolean isDeferred; //indicates weather the loan is in deferment

    StudentLoan(){

    }

    StudentLoan(String name, double amount, double rate, int months, boolean isDef) {
        //Loan newLoan = new Loan(name, amount, rate, months);
        setCustomerName(name);
        setLoanBalance(amount);
        setInterestRate(rate);
        setNumberOfMonthlyPayments(months);
        setDeferred(isDef);
    }

    public boolean getDeferred() {
        return isDeferred;
    }

    public void setDeferred(boolean deferred) {
        isDeferred = deferred;
    }

    @Override
    public void calculateMonthlyPayment() {
        if (isDeferred) {
            setMonthlyPayment(0);
        }else {
            super.calculateMonthlyPayment();
        }
    }

    @Override
    public String toString() {
        return "Customer Name: " + getCustomerName()  +
                ", Account Number: " + getAccountNumber() +
                ", Loan Balance: " + getLoanBalance() +
                ", Monthly Payment: " + getMonthlyPayment() +
                ", Interest Rate: " + getInterestRate() +
                ", Number Of Monthly Payments: " + getNumberOfMonthlyPayments() +
                ", is Deferred: " + getDeferred();
    }
}

