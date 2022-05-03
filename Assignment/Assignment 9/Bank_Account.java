public class Bank_Account {
    private String customer_name;
    private int account_ID;
    private static int number_of_accounts = 0;
    private String user_id;
    private String user_pw;
    private double account_balance;

    public Bank_Account(String customer_name, String user_id, String user_pw) {
        super();
        this.customer_name = customer_name;
        this.user_id = user_id;
        this.user_pw = user_pw;
        number_of_accounts++;
        account_ID = number_of_accounts;
    }


    public void deposit_Amount(double accountBalance) {
        account_balance = account_balance + accountBalance;
    }

    public void withdraw_Amount(double accountBalance) {
        account_balance = account_balance - accountBalance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_pw() {
        return user_pw;
    }

    public void setUser_pw(String user_pw) {
        this.user_pw = user_pw;
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    public int getAccount_ID() {
        return account_ID;
    }

    public static int get_Number_of_accounts() {
        return number_of_accounts;
    }

    public static void decrease_number_of_accounts() {
        number_of_accounts--;
    }

    @Override
    public String toString() {
        return "\n Customer Name: " + customer_name + "\n Account Number: " + account_ID + "\n Account Balance: " + account_balance;
    }

}
