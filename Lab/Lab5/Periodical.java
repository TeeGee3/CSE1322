/*
Class:CSE1322L
Section:WJ1 Java
Term: Spring 2022
Instructor: Leul Endashaw
Name: Taylor Goff
Lab#: 5
*/

public class Periodical extends Item{
    private int issueNum;

    Periodical(){
        setTitle("new periodical");
        setIssueNum(000);
    }

    Periodical(String title, int issue){
        setTitle(title);
        setIssueNum(issue);
    }

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    @Override
    String getListing() {
        return "Periodical Title - "+ getTitle()+"\n"+
                "Issue # - "+ getIssueNum()+"\n";
    }
}
