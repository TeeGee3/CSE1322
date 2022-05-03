public class Checking_Account extends Bank_Account {
    private double daily_withdrawal_limit;

    public Checking_Account(String customer_name, String user_id, String user_pw) {
        super(customer_name, user_id, user_pw);
        daily_withdrawal_limit=300;
    }

    public double getDaily_withdrawal_limit() {
        return daily_withdrawal_limit;
    }

    public void setDaily_withdrawal_limit(double daily_withdrawal_limit) {
        this.daily_withdrawal_limit = daily_withdrawal_limit;
    }

    @Override
    public String toString() {
        return  super.toString()+ "\n Account Type: Checking"+"\n Account Daily Withdrawal Limit: " + daily_withdrawal_limit ;
    }
}