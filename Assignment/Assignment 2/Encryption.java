import java.util.ArrayList;
import java.util.Arrays;

public class Encryption {

//create array list
    ArrayList<Character> symbols = new ArrayList<Character>();
    ArrayList<Character> alphabets = new ArrayList<Character>();


    public Encryption(){
        {
            symbols.add('!');
            symbols.add('@');
            symbols.add('#');
            symbols.add('$');
            symbols.add('^');
            symbols.add('&');
            symbols.add('*');
            symbols.add('(');
            symbols.add(')');
            symbols.add('_');
            symbols.add('-');
            symbols.add('+');
            symbols.add('=');
            symbols.add('?');
            symbols.add(',');
            symbols.add('{');
            symbols.add('}');
            symbols.add('[');
            symbols.add(']');
            symbols.add('/');
            symbols.add('|');
            symbols.add(';');
            symbols.add(':');
            symbols.add('.');
            symbols.add('<');
            symbols.add('>');
            for(char letter='a';letter<='z';letter++)
            {
                alphabets.add(letter);
            }
        }
    }

    public char return_alphabet(int num){
        char letter;
        letter = alphabets.get(num); //gets letter at the index of variable num
        return letter;
    }

    public int return_alphabet_index(char x){
        int index;
        index = alphabets.indexOf(x); //gets index number for character of x
        return index;
    }

    public char return_symbol(int num){
        char symbol;
        symbol = symbols.get(num);
        return symbol;
    }

    public int return_symbol_index(char symbol){
        int index;
        index =  symbols.indexOf(symbol);
        return index;
    }

    public String encrypt_message(String input){
        String output;
        String plaintext;
        plaintext = input.toLowerCase();
        int charTotal = plaintext.length();
        char[] plaintextArray = plaintext.toCharArray();
        char[] encryptedArray = new char[charTotal]; //creating a char array

        for ( int i = 0 ; i < plaintextArray.length ; i++){
            char letter = plaintextArray[i];

            if (alphabets.contains(letter)){
                    int index = return_alphabet_index(letter); //returns index number of letter
                    char character = return_symbol(index);  //character = symbol from letter index
                    encryptedArray[i] = character; //new encrypted character symbol added each iteration
                }
            else{
                System.out.println("Error: Invalid Character");break; }


        }

        output = String.valueOf(encryptedArray);

        return output;
    }


    public String decrypt_message(String input){
        String output;
        //String encryptText;
        int charTotal = input.length();
        char[] encryptedMessage = input.toCharArray();
        char[] decryptedArray = new char[charTotal];

        for ( int i = 0 ; i < encryptedMessage.length ; i++) {
            char symbol = encryptedMessage[i];

            if (symbols.contains(symbol)) {
                int index = return_symbol_index(symbol);
                char character = return_alphabet(index);
                decryptedArray[i] = character;
            }
            else{
                System.out.println("Error: Invalid Symbol");
                break;
            }

        }

        output = String.valueOf(decryptedArray);

        return output;
    }





    }

