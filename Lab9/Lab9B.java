import java.util.Scanner;

public class Lab9B {

    public static String repeatNTimes(String s, int i){
        String sentence;
        if( i ==0){
            return "";
        }
        else{
            sentence =  s+repeatNTimes(s,i-1);
            //sentence = (new StringBuilder().append(s)).toString();
            return sentence;
        }
    }

    public static boolean isReverse(String s1, String s2) {
        if (s1.length() == 0 && s2.length() == 0) {
            return true;
        } else if (s1.length() == s2.length()) {
            int length = s2.length();
            char letter1 = (s1.charAt(0));
            char letter2 = (s2.charAt(length - 1));
            if (letter1 == letter2) {
                return isReverse(s1.substring(1), s2.substring(0, length - 1));
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(repeatNTimes("I must study recursion until it makes sense\n",100));

        System.out.println("Enter the first string");
            String s1 = sc.nextLine();
        System.out.println("Enter the second string");
            String s2 = sc.nextLine();
        if(isReverse(s1,s2)){
            System.out.println(s1 + " is the reverse of "+s2);}
        else{
            System.out.println(s1 + " is not the reverse of "+s2);}
        }

    }

