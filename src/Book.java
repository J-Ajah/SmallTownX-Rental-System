import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    boolean borrowed;

    public Book(){
    }
    // Creates a new Book
    public Book(String bookTitle) {
        this.title = bookTitle;
    }

    // Marks the book as rented
    public void borrowed() {
        this.borrowed = true;
    }

    // Marks the book as not rented
    public void returned() {
   this.borrowed = false;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        if (this.borrowed) {
            return true;
        } else {
            return false;
        }

    }

    // Returns the title of the book
    public String getTitle() {
        return this.title;


    }

}
