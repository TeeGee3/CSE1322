import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BlueRayCollection brc1 = new BlueRayCollection();

        boolean retry = true;
        int choice = 0;

        do {
            System.out.println("\n0. Quit \n1. Add BlueRay to collection \n2. See collection");
            choice = Integer.parseInt(scan.nextLine().strip());

            if (choice == 1) {
                System.out.println("What is the title?");
                    String title = scan.nextLine().strip();

                System.out.println("What is the director?");
                    String director = scan.nextLine().strip();

                System.out.println("What is the year of release?");
                    int release = Integer.parseInt(scan.nextLine().strip());

                System.out.println("What is the cost?");
                    double cost = Double.parseDouble(scan.nextLine().strip());

                brc1.add(title, director, release, cost);
            }
            else if (choice == 2) {
                brc1.show_all();
            }
            else {
                retry = false;
            }
        } while (retry);
    }
}
