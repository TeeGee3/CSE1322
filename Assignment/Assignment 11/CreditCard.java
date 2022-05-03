public class CreditCard {

    private double ccBalance;

    public CreditCard() {
        ccBalance = 5000.00;
    }

    public double getBalance() {
        return ccBalance;
    }

    public void withdraw(double bal) {
        this.ccBalance -= bal;
    }
}

