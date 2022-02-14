public class Questions {
   private String question;
   private String answer;
   private int difficulty;

//general constructor
    public Questions (String q, String a, int d){
        question = q;
        answer = a;
        difficulty = d;
    }
//getter for question
    public String getQuestion() {
        return question;
    }
//setter for question
    public void setQuestion(String question) {
        this.question = question;
    }

//getter for answer
    public String getAnswer() {
        return answer;
    }
//setter for answer
    public void setAnswer(String answer) {
        this.answer = answer;
    }
//getter for difficulty
    public int getDifficulty() {
        return difficulty;
    }
//setter for difficulty
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString(){
        return "Question: "+question+" Answer: "+answer+" Level of Difficulty: "+difficulty;
    }



}
