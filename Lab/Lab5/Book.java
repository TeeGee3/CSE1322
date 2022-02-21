/*
Class:CSE1322L
Section:WJ1 Java
Term: Spring 2022
Instructor: Leul Endashaw
Name: Taylor Goff
Lab#: 5
*/

public class Book extends Item{
    private long isbn_number; // 13 digits to identify book
    private String author;

    Book(){
        super.setTitle("new book");
        setAuthor("new author");
        setIsbn_number(0000000000000);
    }

    Book(String title, String author,  long isbn){
        super.setTitle(title);
        setAuthor(author);
        setIsbn_number(isbn);

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getIsbn_number() {
        return isbn_number;
    }

    public void setIsbn_number(long isbn_number) {
        this.isbn_number = isbn_number;
    }


    @Override
    String getListing() {
        return "Book Name - "+ getTitle()+"\n"+
                "Author - "+ getAuthor()+"\n"+
                "ISBN # - "+ getIsbn_number()+"\n";
    }
}
