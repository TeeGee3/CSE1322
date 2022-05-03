
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;



public class main {
    private static final int NO_OF_EXAMS = 3;
    private static final double PERCENTAGE_EXM_1 = 25;
    private static final double PERCENTAGE_EXM_2 = 25;
    private static final double PERCENTAGE_FINAL_EXM = 25;

    private static final int NO_OF_QUIZZES = 10;
    private static final double PERCENTAGE_QUIZZES = 25;

    private static final String OUTPUT_FILE = "FinalGradesFile.txt";
    private static final String ERROR_FILE = "ErrorGradesFile.txt";

    private static double getExmPercentage(double[] exmScores) {
        double exm1Score = exmScores[0];
        double exm2Score = exmScores[1];
        double finalExmScore = exmScores[2];

        // find the low score within exm1 and exm2
        if (exm1Score != -1 && exm1Score < exm2Score && exm1Score < finalExmScore) {
            exm1Score = finalExmScore;
        }
        else if (exm2Score != -1 && exm2Score < exm1Score && exm2Score < finalExmScore) {
            exm2Score = finalExmScore;
        }

        double exm1Percentage = 0, exm2Percentage = 0, finalExmPercentage = 0;
        if(exm1Percentage != -1) {
            exm1Percentage = exm1Score * PERCENTAGE_EXM_1 / 100;
        }
        if(exm2Percentage != -1) {
            exm2Percentage = exm2Score * PERCENTAGE_EXM_2 / 100;
        }
        if(exm1Percentage != -1) {
            finalExmPercentage = finalExmScore * PERCENTAGE_FINAL_EXM / 100;
        }

        return exm1Percentage + exm2Percentage + finalExmPercentage;
    }


    private static double getQuizPercentage(double[] quizScores) {
        double lowScore = 0;
        double sum = 0;

        for(int index = 0; index < quizScores.length; index++) {
            if(index == 0 || lowScore > quizScores[index]) {
                lowScore = quizScores[index];
            }
            sum += quizScores[index];;
        }
        sum -= lowScore;

        double avg = sum / (quizScores.length -1);
        double percentage = avg * PERCENTAGE_QUIZZES / 100;
        return percentage;
    }


    private static char getLetterGrade(double finalPercentage) {
        if(finalPercentage >= 89.5) {
            return 'A';
        }
        else if(finalPercentage >= 79.5) {
            return 'B';
        }
        else if(finalPercentage >= 69.5) {
            return 'C';
        }
        else if(finalPercentage >= 59.5) {
            return 'D';
        }
        else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name of input file: ");
            String inputFile = scan.nextLine();

        BufferedReader brReader = null;
        BufferedWriter bwOutputWriter = null;
        BufferedWriter bwErrorWriter = null;
        String line = "";

        try {
            brReader = new BufferedReader(new FileReader(inputFile));
            bwOutputWriter = new BufferedWriter(new FileWriter(OUTPUT_FILE));
            bwErrorWriter = new BufferedWriter(new FileWriter(ERROR_FILE));


            while((line = brReader.readLine()) != null) {

                String[] tokens = line.split(",");

                if (tokens[1] == null || tokens[1].trim() == "") {

                    bwErrorWriter.write(line + "\n");
                } else {
                    // Separate scores
                    double[] quizzes = new double[NO_OF_QUIZZES];
                    double[] exams = new double[NO_OF_EXAMS];

                    for (int index = 2; index < 2 + NO_OF_QUIZZES; index++) {
                        if (tokens[index] == null || tokens[index].trim() == "") {
                            quizzes[index - 2] = 0;
                        } else {
                            quizzes[index - 2] = Double.parseDouble(tokens[index]);
                        }
                    }

                        for (int index = 12; index < 12 + NO_OF_EXAMS; index++) {
                            if (tokens[index] == null || tokens[index].trim() == "") {
                                exams[index - 12] = 0;
                            } else {
                                exams[index - 12] = Double.parseDouble(tokens[index]);
                            }
                        }

                        double totalPercentage = getQuizPercentage(quizzes) + getExmPercentage(exams);
                        char letterGrade = getLetterGrade(totalPercentage);

                        bwOutputWriter.write(tokens[0] + " " + tokens[1] + " " + totalPercentage + " " + letterGrade + "\n");
                    }
                }
        } catch (FileNotFoundException e) {
            System.out.println("Input file " + inputFile + " does not exist");
        } catch (IOException e) {
            System.out.println("Error: IOException – error reading from or writing to files");
        } catch(NumberFormatException e) {
            System.out.println("Error: FormatException – student grades must be of type double Line: " + line);
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Error: IndexOutOfRangeException – must not attempt to access an array outside of its range: " + line);
            //e.printStackTrace();
        } finally {

            try {
                if (brReader != null)
                    brReader.close();
            } catch (IOException e) {
            }

            try {
                if (bwOutputWriter != null) {
                    bwOutputWriter.close();
                }
            }catch(IOException e) {

            }

            try {
                if (bwErrorWriter != null) {
                    bwErrorWriter.close();
                }
            }catch(IOException e) {

            }
        }

        scan.close();
    }
}





//        try {

//
//            System.out.println("Enter name of the RGF");
//            String RawGradesFile = scan.next(); //ingesting the file on the cpu
//            System.out.println("Enter name of the file2");
//            String filename2 = scan.next();

//            File RGF = new File(RawGradesFile);
//            Scanner ScanRGF = new Scanner(RGF); //opens RGF
//        }
//        catch(FileNotFoundException e){
//            System.out.println("Files do not exist");
//        }
//        catch (IOException ioex){
//            System.out.println("Error: "+ ioex.getMessage());
//        }
