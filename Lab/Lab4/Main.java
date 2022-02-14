/*
Class:CSE1322L
Section:WJ1 Java
Term: Spring 2022
Instructor: Leul Endashaw
Name: Taylor Goff
Lab#: 4
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userChoice;
        float amount;


        Checking c1 = new Checking();
        Savings s1 = new Savings();

        //Driver
        do {
            System.out.println("1. Withdraw from Checking\n" +
                    "2. Withdraw from Savings\n" +
                    "3. Deposit to Checking\n" +
                    "4. Deposit to Savings\n" +
                    "5. Balance of Checking\n" +
                    "6. Balance of Savings\n" +
                    "7. Award Interest to Savings now\n" +
                    "8. Quit");

            userChoice = sc.nextInt();
            String none = sc.nextLine();


            switch (userChoice) {

                case 1: //withdraw from checking
                    //    System.out.println();
                    System.out.println("How much would you like to withdraw from Checking?");
                    amount = sc.nextFloat();
                    none = sc.nextLine();
                    c1.withdraw(amount);
                    break;

                case 2: //withdraw from savings
                    System.out.println("How much would you like to withdraw from Savings?");
                    amount = sc.nextFloat();
                    none = sc.nextLine();
                    s1.withdraw(amount);
                    break;

                case 3:  //deposit into checking
                    System.out.println("How much would you like to deposit into Checking?");
                    amount = sc.nextFloat();
                    none = sc.nextLine();
                    c1.deposit(amount);
                    break;

                case 4:  //Deposit into savings
                    System.out.println("How much would you like to deposit into Savings?");
                    amount = sc.nextFloat();
                    none = sc.nextLine();
                    s1.deposit(amount);
                    break;

                case 5: //Balance of Checking
                    System.out.println("Your balance for checking " + c1.getAccountNum() + " is $" + c1.getAcctBal());
                    break;

                case 6: //Balance of Savings
                    System.out.println("Your balance for checking " + s1.getAccountNum() + " is $" + s1.getAcctBal());
                    break;

                case 7: //Annual manual teller call to Award Interest to Savings now
                    s1.savingsInterest();
            }

        } while (userChoice != 8);
    }
}
