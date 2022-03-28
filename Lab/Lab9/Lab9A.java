import java.util.Scanner;

public class Lab9A {


    public static int recursive_multiply(int a, int b) {
        int result;
        if (a == 0) {
            result = 0;
        }
        if (b == 0) {
            result = 0;
        } else {
            result = a + recursive_multiply(a, (b - 1));
        }
        return result;
    }

    public static int recursive_div(int a, int b) {
        int result;
        result = 200;

        if (a == 0){
            result = 0;
        return result;}
        if (b == 0){
            result = -1;
        return result;}
        if (a == b) {
            result = 1;
        }
        if (a < b) {
            result = 0;
        } else {
            result = 1 + recursive_div(a - b, b);
            return result;
        }
        return result;
    }

    public static int recursive_mod(int a, int b) {
        int result;
        result = 0;

        if (a == 0)
            result = 0;
        if (b == 0)
            result = -1;
        if (a == b) {
            result = 1;
        }
        if (a < b) {
            result = a;
        } else {
            result = recursive_mod(a - b, b);
            return result;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userChoice;


        do {
            System.out.println("Choose from the following:\n" +
                    "0. Quit\n" +
                    "1. Multiply 2 numbers\n" +
                    "2. Div 2 numbers\n" +
                    "3. Mod 2 numbers");
            userChoice = sc.nextInt();
            String none = sc.nextLine();
            //System.out.print("\n");



            switch (userChoice) {

                case 1:
                    System.out.println("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter second number: ");
                    int b = sc.nextInt();
                    int result;
                    result = recursive_multiply(a, b);
                    System.out.println("answer: "+result);
                    break;

                case 2:
                    System.out.println("Enter first number: ");
                    a = sc.nextInt();
                    System.out.println("Enter second number: ");
                    b = sc.nextInt();

                    result = recursive_div(a, b);
                    System.out.println("answer: "+result);
                    break;

                case 3:
                    System.out.println("Enter first number: ");
                    a = sc.nextInt();
                    System.out.println("Enter second number: ");
                    b = sc.nextInt();
                    result = recursive_mod(a, b);
                    System.out.println("answer: "+result);
                    break;

                case 0:
                    System.out.println("");
                    break;

                default:
                    System.out.println("Error: Please enter valid input\n");
            }
        } while (userChoice != 0);


        //int ab = recursive_multiply(a,b);
        //int ab = recursive_div(a,b);
        //int ab = recursive_mod(a,b);

        //System.out.println(ab);
    }
}
