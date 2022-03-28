import java.util.Scanner;

public class Main {


    //recursive method decimal2Binary
    public static String decimal2Binary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else {
            int d2b = Integer.parseInt(decimal2Binary(decimal / 2));
            String answer = Integer.toString(decimal % 2 + 10 * d2b);

            return answer;
        }
    }


    //recursive method decimal2Hexidecimal
    public static String decimal2Hexadecimal(int decimal) {


        String result = "";
        //int n = Integer.parseInt(s);
        int remainder = decimal % 16;

        if (decimal == 0) {
            return "";
        } else {
            switch (remainder) {
                case 10:
                    result = "A";
                    break;
                case 11:
                    result = "B";
                    break;
                case 12:
                    result = "C";
                    break;
                case 13:
                    result = "D";
                    break;
                case 14:
                    result = "E";
                    break;
                case 15:
                    result = "F";
                    break;
                default:
                    result = remainder + result;
                    break;
            }
            return decimal2Hexadecimal(Integer.parseInt(Integer.toString(decimal / 16))) + result;
        }
    }


    //recursive method convertIpAddress
    public static String convertIpAddress(String[] array, int index) {

        if(index == array.length-1){
            String ip = array[index];
            int decimal = Integer.parseInt(ip);
            String binary = decimal2Binary(decimal);
            return binary;
        }
        else {
            String binary = "";
            //String ip = convertIpAddress(array, index - 1);
            String ip = array[index];
            int decimal = Integer.parseInt(ip);
            binary = decimal2Binary(decimal)+".";
            convertIpAddress(array, index + 1);
            return binary;
        }
    }


    //recursive method convertMacAddress
    public static String convertMacAddress(String[] array, int index) {
        String results = "";
        if (index == array.length - 1) {
            String mac = array[index];
            int decimal = Integer.parseInt(mac);
            String hexD = decimal2Hexadecimal(decimal);
            return hexD;
        } else {
            String binary = "";
            //String ip = convertIpAddress(array, index - 1);
            String mac = array[index];
            int decimal = Integer.parseInt(mac);
            String hexD = decimal2Hexadecimal(decimal)+":";
            convertMacAddress(array, index + 1);
            return hexD;
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userChoice;

        /*
        -presents menu and reads user choice
        -provides error msg for invalid input
        -presents user with second prompt and read in detail info
        -allows user to reenter choose in case of valid user input
        -invokes correct method based on user choice
         */


        do {
            System.out.println("1 – Convert Decimal Number to Binary Number\n" +
                    "2 – Convert Decimal Number to Hexadecimal Number\n" +
                    "3 – Convert Decimal IP Address to Binary IP Address\n"+
                    "4 – Convert Decimal MAC Address to Hexadecimal MAC Address\n"+
                    "5 - Exit\n");
            System.out.print("Enter Choice: ");
            userChoice = sc.nextInt();
            String none = sc.nextLine();
            System.out.print("\n");


            switch (userChoice) {

                case 1: //health insurance
                    System.out.print("Enter Decimal Integer: ");
                    int integer = sc.nextInt();
                     sc.nextLine();
                    System.out.println("Decimal Number: "+integer);
                    System.out.println("Binary Number: "+ decimal2Binary(integer));
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter Decimal Integer: ");
                    integer = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Decimal Number: "+integer);
                    System.out.println("Hexadecimal Number: "+ decimal2Hexadecimal(integer));
                    System.out.println();
                    break;

                case 3:
                    //IP address
                    System.out.print("Please enter an IP Address: ");
                    String ip = sc.nextLine();
                    String[] octetArray = ip.split("\\.");
                    System.out.println("Decimal IP Address: "+ip);
                    System.out.print("Binary IP Address: ");


                    for( int i = 0; i < octetArray.length; i++ ){
                        String result = convertIpAddress(octetArray, i);
                        System.out.print(result);

                    }
                    System.out.println("\n");
                    break;

                case 4:
                    //Mac Address
                    System.out.print("Please enter a MAC Address: ");
                    String mac = sc.nextLine();
                    String[] macArray = mac.split("\\:");
                    System.out.println("Decimal Mac Address: "+mac);
                    System.out.print("Hexadecimal IP Address: ");

                    for( int i = 0; i < macArray.length; i++ ){
                        String result = convertMacAddress(macArray, i);
                        System.out.print(result);
                    }
                    System.out.println("\n");
                    break;
                case 5:
                    break;

                default: System.out.println("Error: Please enter valid input\n");
            }

        } while (userChoice != 5);

    }
}
