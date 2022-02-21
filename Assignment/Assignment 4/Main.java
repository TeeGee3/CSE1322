/*
Class:CSE1322L
Section:WJ1 Java
Term: Spring 2022
Instructor: Leul Endashaw
Name: Taylor Goff
Assignment 4
*/


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    //int accountType;
    static ArrayList<Loan> LoanList = new ArrayList<>();
    static boolean deferred = false;

    public static void addLoan(ArrayList<Loan> loanList){
//        boolean deferred = false;
        int accountType;

        System.out.println("\nEnter Loan Type (1 - Student, 2 - Auto): ");
        accountType = sc.nextInt();
       String nonee = sc.nextLine();


        System.out.println("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Loan Amount: ");
        double amount = sc.nextDouble();
        nonee = sc.nextLine();

        System.out.println("Enter Interest Rate: ");
        double rate = sc.nextDouble();
        nonee = sc.nextLine();

        System.out.println("Enter Number of Monthly Payments: ");
        int num = sc.nextInt();
        nonee = sc.nextLine();

        if(accountType == 1) { //studentLoan
            int goForward = 0;
            do {
                System.out.println("Is Loan Deferred (Y - Yes, N - No): ");
                char answer = sc.nextLine().toUpperCase().charAt(0);
                //nonee = sc.nextLine();


                switch (answer) {
                    case 'Y':
                        deferred = true;
                        goForward = 1;
                        break;

                    case 'N':
                        deferred = false;
                        goForward = 1;
                        break;

                    default:
                        System.out.println("Error: Please enter valid input: (y or n)\n");
                }
                }while (goForward == 0) ;

                StudentLoan newStudentLoan = new StudentLoan(name, amount, rate, num, deferred);
                loanList.add(newStudentLoan);



//            if (answer == 'n') {
//                deferred = false;
//                StudentLoan newStudentLoan = new StudentLoan(name, amount, rate, num, deferred);
//            } else if (answer == 'y') {
//                deferred = true;
//                Loan newStudentLoan = new StudentLoan(name, amount, rate, num, deferred);
//                loanList.add(newStudentLoan);
//            }

        }

        if(accountType == 2){ //autoLoan
            System.out.println("Enter Amount of Down Payment: ");
            double downPay = sc.nextDouble();
            nonee = sc.nextLine();

            AutoLoan newCarLoan = new AutoLoan(name, amount, rate, num, downPay);
            loanList.add(newCarLoan);
        }
    }

        public static void deleteLoan(ArrayList<Loan> loanList){ ////////////////////////////////////
            System.out.println("Enter Customer Name: ");
            String name = sc.nextLine().toLowerCase();
            //String none = sc.nextLine();
            boolean Found = false;

            //search for name in array list, if found remove it,
            do{
            for (Loan x : loanList) {
                int index;
                boolean matching;
                matching = x.getCustomerName().toLowerCase().matches(name);
                if (matching) { //x.getFullName() != null && x.getFullName().contains(name)
                    index = loanList.indexOf(x);
                    LoanList.remove(index);
                    Loan.decreaseNumberOfLoans();//removes one count from employee
                    Found = true;
                    break;
                }
            }


            }while (Found = false);

        }


        public static void calculateMonthlyLoanPayment(ArrayList<Loan> loanList){
            final DecimalFormat df = new DecimalFormat("0.00");
            //traverse all array and invoke calculateMonthlyPayment to do each object in array list
            for (Loan x : loanList){
                x.calculateMonthlyPayment();
            }
        }


        public static void printLoans(ArrayList<Loan> loanList){
            //traverse and print each object
            for (Loan x : loanList){
                System.out.println(x);
            }
        }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;

        do {
            System.out.println(" 1 - Add Loan\n 2 - Delete Loan\n 3 - Calculate Monthly Payments\n 4 - Print Loans\n 5 - Exit\n" );
            System.out.print("Enter Choice: ");
            userInput = sc.nextLine();
            //String none = sc.nextLine();
            System.out.println();


            switch (userInput) {

                case "1": addLoan(LoanList);
                    break;
                case "2": deleteLoan(LoanList);
                    break;
                case "3": calculateMonthlyLoanPayment(LoanList);
                    break;
                case "4": printLoans(LoanList);
                    break;

                default: System.out.println("Error: Please enter valid input\n");
                    //throw new IllegalStateException("Unexpected value: " + userInput);
            }
        } while (userInput != "5");
    }

}

