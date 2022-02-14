
 Download
/*
Class:CSE1322L
Section:WJ1 Java
Term: Spring 2022
Instructor: Leul Endashaw
 */


import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args){

        StockItem milk = new StockItem("1 Gallon of Milk", 3.60f, 15);
        StockItem bread = new  StockItem("1 Loaf of Bread", 1.98f, 30);

//      System.out.print("1. Sold One Milk \n2. Sold One Bread \n3. Change price of Milk \n4. Change price of Bread \n5. Add Milk to Inventory \n6. Add Bread to Inventory \n7. See Inventory \n8. Quit \n");

        Scanner sc = new Scanner(System.in);
        int userChoice;


        do{
            System.out.print("1. Sold One Milk \n2. Sold One Bread \n3. Change price of Milk \n4. Change price of Bread \n5. Add Milk to Inventory \n6. Add Bread to Inventory \n7. See Inventory \n8. Quit \n");
            userChoice = sc.nextInt();

            switch (userChoice){
                case 1: milk.setLowerQuantity(1); break;

                case 2: bread.setLowerQuantity(1); break;

                case 3:
                    float price;
                    System.out.println("What is the new price of milk?");
                    price = sc.nextFloat(); milk.setPrice(price); break;

                case 4:
                    System.out.println("What is the new price of bread?");
                    price = sc.nextFloat(); bread.setPrice(price); break;

                case 5:
                    int quantity;
                    System.out.println("How much milk did we get?");
                    quantity = sc.nextInt(); milk.setRaisedQuantity(quantity); break;
                case 6:
                    System.out.println("How much bread did we get?");
                    quantity = sc.nextInt(); bread.setRaisedQuantity(quantity); break;
                case 7:

                    System.out.println(); System.out.println("MILK: Item number: 0 is "+milk.toString()); System.out.println("Bread: Item number: 1 is "+bread.toString()+"\n"); break;

            }

        }while ( userChoice != 8);


    }
}
