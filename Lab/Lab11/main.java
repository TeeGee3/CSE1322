import java.util.*;
import java.io.*;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{

//            File myFile1 = new File("/Users/groot/IdeaProjects/Lab11/HBD2U.txt");
//            File myFile2 = new File("/Users/groot/IdeaProjects/Lab11/HBD2ME.txt");

            System.out.println("Enter name of the file1");
                String filename1 = scan.next(); //ingesting the file on the cpu
                //File myFile1 = new File(filename1); -- the short way if we were not taking user input? create file then scanner
            System.out.println("Enter name of the file2");
                String filename2 = scan.next();
                //File myFile2 = new File(filename2);


            /* The Long Way to Open Files in Layers ========================
            FileInputStream fis1 = new FileInputStream(filename1);
            InputStreamReader isr1 = new InputStreamReader(fis1);
            BufferedReader br1 = new BufferedReader(isr1);

            FileInputStream fis2 = new FileInputStream(filename2);
            InputStreamReader isr2 = new InputStreamReader(fis2);
            BufferedReader br2 = new BufferedReader(isr2);
             */

            //shortcut for layering - creates file and then scans in one line
            File file1 = new File(filename1);
                Scanner scanFile1 = new Scanner(file1); //opens file1
            File file2 = new File(filename2);
                Scanner scanFile2 = new Scanner(file2);


            int lineCount = 1;
            while(scanFile1.hasNextLine()){
                String line1 = scanFile1.nextLine();
                String line2 = "";

                try {
                    line2 = scanFile2.nextLine();
                }
                catch(NoSuchElementException e){
                    System.out.println("Files have different number of lines");
                    break;
                }

                if(!line1.equals(line2)){
                    System.out.println("Line "+ lineCount);
                    System.out.println("< "+line1);
                    System.out.println("> "+line2);
                }
                lineCount++;
            }

            if(scanFile2.hasNext()){
                System.out.println("Files have different number of lines");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Files do not exist");
        }
        catch (IOException ioex){
            System.out.println("Error: "+ ioex.getMessage());
        }
    }
}



