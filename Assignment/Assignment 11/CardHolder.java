public class CardHolder implements Runnable {

    private CreditCard card; //customers credit card

    public CardHolder(CreditCard card) {
        this.card = card;
    }

    @Override
    public void run() {
        for (int index = 0; index < 6; index++) {
            makeWithdrawal(500);
        }

    }

    private synchronized void makeWithdrawal(double amount) {

        if (card.getBalance() < amount) {
            System.out.println("Not enough in " + Thread.currentThread().getName() + "'s account to withdraw $" + amount
                    + " The balance is $" + card.getBalance());
        }
        else {
            System.out.println(Thread.currentThread().getName() + " BEFORE withdrawing $" + amount + " Balance: $"
                    + card.getBalance());
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            card.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " AFTER withdrawing $" + amount + " Balance: $"
                    + card.getBalance());
        }
    }
}
