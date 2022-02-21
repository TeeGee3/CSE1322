import java.math.BigDecimal;
import java.text.DecimalFormat;

public class AutoLoan extends Loan{

    private double downPayment;

    AutoLoan(String name, double amount, double rate, int months, double down){
        //Loan newCarLoan = new Loan(name, amount, rate, months);
        setCustomerName(name);
        setLoanBalance(amount);
        setInterestRate(rate);
        setNumberOfMonthlyPayments(months);
        downPayment = down;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    @Override
    public void calculateMonthlyPayment() {
        //super.calculateMonthlyPayment();
        double monthlyPay;
        monthlyPay = (((getInterestRate()/100) * (getLoanBalance() - getDownPayment()))/(1 - Math.pow(1 + (getInterestRate()/100), -(getNumberOfMonthlyPayments()))));
        DecimalFormat df = new DecimalFormat("0.00");
        monthlyPay = Double.parseDouble(df.format(monthlyPay));
        setMonthlyPayment(monthlyPay);
    }

    @Override
    public String toString() {
        return "Customer Name: " + getCustomerName()  +
                ", Account Number: " + getAccountNumber() +
                ", Loan Balance: " + getLoanBalance() +
                ", Monthly Payment: " + getMonthlyPayment() +
                ", Interest Rate: " + getInterestRate() +
                ", Number Of Monthly Payments: " + getNumberOfMonthlyPayments() +
                ", Down Payment: " + getDownPayment();
    }
}
