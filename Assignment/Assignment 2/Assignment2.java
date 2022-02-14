/*
Class:CSE1322L
Section:WJ1 Java
Term: Spring 2022
Instructor: Leul Endashaw
Name: Taylor Goff
Assignment 2
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int userChoice;

        Encryption message = new Encryption();


        do {
            System.out.println("1 Encrypt a message\n" + "2 Decrypt a message\n" + "3 Quit\n");
            System.out.println("Enter Choice: ");
            userChoice = sc.nextInt();
            String none = sc.nextLine();


            switch (userChoice) {

                case 1:
                    System.out.println("Enter the plain text message:");
                    String plaintext = sc.nextLine();
                    String EncryptedMessage = message.encrypt_message(plaintext);
                    System.out.println("Encrypted Msg: " + EncryptedMessage+"\n");
                    break; // Asks for message input then encrypts message
                case 2:
                    System.out.println("Enter the encrypted text message:");
                    String encryptedText = sc.nextLine();
                    String DecryptedMessage = message.decrypt_message(encryptedText);
                    System.out.println("Decrypted Msg: " + DecryptedMessage+"\n");
                    break; // Asks for message input then decrypts message;
                case 3: break;
                default: System.out.println("Error: Please enter valid input\n");
            }

        }while (userChoice != 3) ;


    }

}
