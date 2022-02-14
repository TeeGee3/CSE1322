import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    Scanner sc = new Scanner(System.in);
    String question;
    String answer;
    int difficulty;
    int userInput;
    String none;

    ArrayList<Questions> myQuestions=new ArrayList<>(); //array list for my questions


    public void add_question(){
        System.out.println("What is the question Text?");
            question = sc.nextLine();

        System.out.println("What is the answer?");
            answer = sc.nextLine();

        System.out.println("How Difficult (1-3)?");
            difficulty = sc.nextInt();
            none = sc.nextLine();

        Questions newQuestion=new Questions(question,answer,difficulty);//create object with the input Q+A+D

        myQuestions.add(newQuestion); //add question to array list
    }

    public void remove_question(){
        System.out.println("Choose the question to remove?");

        for(int i = 0; i < myQuestions.size(); i++){ //for loop to print all questions in the array list
            System.out.println(i+". "+myQuestions.get(i).getQuestion());
        }

        userInput = sc.nextInt();
        none = sc.nextLine();

        myQuestions.remove(userInput);
    }


    public void modify_question(){
        System.out.println("Choose the question to modify?");

        for(int i = 0; i < myQuestions.size(); i++){ //for loop to print all questions in the array list
            System.out.println(i+". "+myQuestions.get(i).getQuestion());
        }

        userInput = sc.nextInt();
        none = sc.nextLine();

        System.out.println("What is the question Text?");
            question = sc.nextLine();
            myQuestions.get(userInput).setQuestion(question);

        System.out.println("What is the answer?");
            answer = sc.nextLine();
            myQuestions.get(userInput).setAnswer(answer);

        System.out.println("How Difficult (1-3)?");
            difficulty = sc.nextInt();
            none = sc.nextLine();
            myQuestions.get(userInput).setDifficulty(difficulty);

    }

    public void give_quiz(){
        int totalCorrect = 0;

        for(int i = 0; i < myQuestions.size(); i++){ //for loop to print all questions in the array list
            String userAnswer;
            String output;


            System.out.println(myQuestions.get(i).getQuestion());
                userAnswer = sc.nextLine();

            if(myQuestions.get(i).getAnswer().equals(userAnswer)){

                output = "Correct";
                totalCorrect= totalCorrect +1;

            }
            else{
                output = "Incorrect";
            }

            System.out.println(output);

        }

        System.out.println("You got "+totalCorrect+" out of "+myQuestions.size());



    }


}
