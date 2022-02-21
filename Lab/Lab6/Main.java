import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userChoice;
        FibIteration i = new FibIteration();
        FibFormula f = new FibFormula();


        System.out.println("Enter the number you want to find the Fibonacci Series for: ");
        userChoice = sc.nextInt();
        String none = sc.nextLine();
        System.out.println("Fib of "+userChoice+" by iteration is: "+i.calculate_fib(userChoice));
        System.out.println("Fib of "+userChoice+" by formula is: "+f.calculate_fib(userChoice));

    }
}
