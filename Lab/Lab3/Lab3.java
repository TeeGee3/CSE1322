/*
Class:CSE1322L
Section:WJ1 Java
Term: Spring 2022
Instructor: Leul Endashaw
Name: Taylor Goff
Lab#: 3
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userChoice;

        Quiz Quiz1 = new Quiz();


        do{
            System.out.println("What would you like to do?\n"+
                "1. Add a question to the quiz\n" +
                "2. Remove a question from the quiz\n" +
                "3. Modify a question in the quiz\n" +
                "4. Take the quiz\n" +
                "5. Quit");

            userChoice = sc.nextInt();
            String none = sc.nextLine();



            switch (userChoice){

                case 1:  Quiz1.add_question();    break; // add q to quiz
                case 2:  Quiz1.remove_question(); break; // remove q from quiz
                case 3:  Quiz1.modify_question(); break; // modify q in quiz
                case 4:  Quiz1.give_quiz();       break; // take quiz


            }



        }while (userChoice !=5);




    }
}
