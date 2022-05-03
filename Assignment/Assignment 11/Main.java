public class Main {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard();
        CardHolder cardHolder = new CardHolder(creditCard);

        Thread thread1 = new Thread(cardHolder);
        thread1.setName("Jack");

        Thread thread2 = new Thread(cardHolder);
        thread2.setName("Jill");

        thread1.start();
        thread2.start();

    }
}
