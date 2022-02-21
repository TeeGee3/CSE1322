/*
Class:CSE1322L
Section:WJ1 Java
Term: Spring 2022Í
Instructor: Leul Endashaw
Name: Taylor Goff
Lab#: 5
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] allItems = new Item[5];

        for (int i = 0; i < allItems.length; i++) {

            System.out.println("Please enter B for Book or P for Periodical");
                char itemChoice = sc.nextLine().toUpperCase().charAt(0);

                switch(itemChoice){
                    case 'B':
                            System.out.println("Please enter the name of the Book: ");
                                String title = sc.nextLine();
                            System.out.println("Please enter the author of the Book");
                                String author = sc.nextLine();
                            System.out.println("Please enter the ISBN of the Book");
                                long isbn = sc.nextLong();
                                sc.nextLine();

                            allItems[i] = new Book(title, author, isbn);
                            break;

                    case 'P':
                            System.out.println("Please enter the name of the Periodical: ");
                                title = sc.nextLine();
                            System.out.println("Please enter the issue number");
                                int issue = sc.nextInt();
                                sc.nextLine();
                            allItems[i] = new Periodical(title, issue);
                            break;

                    default: System.out.println("Error: Please enter valid input: (B or P)\n");

                }
        }

        System.out.println("\nYour Items: ");
        for (int i = 0; i < allItems.length ; i++){
            System.out.println(allItems[i].getListing());
        }

    }


//    public void MyCollection(){
//
//
//
//   }


}
