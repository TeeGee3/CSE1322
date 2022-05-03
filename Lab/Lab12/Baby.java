import java.util.Random;

public class Baby implements Runnable {
    int time;
    String name;

    Baby(String name) {
        this.name = name;
        Random rand = new Random();
        time = rand.nextInt(5000);
    }

    @Override
    public void run() {
        System.out.println("My name is " + name + " I am going to sleep for " + time + "ms");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My name is " + name + " I'm awake, feed me!!!");
    }

    public static void main(String[] args) {
        Thread b1 = new Thread(new Baby("Noah"));
        Thread b2 = new Thread(new Baby("Olivia"));
        Thread b3 = new Thread(new Baby("Liam"));
        Thread b4 = new Thread(new Baby("Emma"));
        Thread b5 = new Thread(new Baby("Amelia"));


        b1.start();
        b2.start();
        b3.start();
        b4.start();
        b5.start();
    }
}
