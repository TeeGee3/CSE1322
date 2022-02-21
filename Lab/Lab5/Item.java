/*
Class:CSE1322L
Section:WJ1 Java
Term: Spring 2022
Instructor: Leul Endashaw
Name: Taylor Goff
Lab#: 5
*/

public abstract class Item {
    private  String title;

    Item(){
        title = "";
    }

    Item(String input){
        setTitle(input);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    abstract String getListing(); //getListing() is an abstract method that returns a string and is implemented in classes Book and Periodicals.
        // if you have at least one abstract method then the class is abstract!

    @Override
    public String toString() {
        return "Title: " + title;
    }
}
