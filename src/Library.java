import java.util.ArrayList;
import java.util.List;

class Library extends Book {
    private String address;
    private List<Book> books = new ArrayList();


    public Library(String address) {
        this.address = address;

    }

    public void addBook(Book the_da_vinci_code) {
        books.add(the_da_vinci_code);
    }


    public void printAddress() {
        System.out.println(address);
    }

    public void borrowBook(String the_lord_of_the_rings) {
         /* Tasks
          1. Check if the book is available.
          2.Then borrow the book
          3.Remove the borrowed book from the list of available books
          4.Set the books status
          */
        if (super.isBorrowed()) {
            System.out.println("Sorry, this book is already borrowed.");
        } else {
            if (books.isEmpty()) {
                System.out.println("Sorry, this book is not in our catalog.");

            } else {

                for (Book book : books) {
                    if (book.getTitle().equals(the_lord_of_the_rings)) {
                        System.out.println("You successfully borrowed The Lord of the Rings");

                        //Removes the book from the list
                        int i = 0;
                        while (i < books.size()) {
                            if (books.get(i).getTitle().equals(the_lord_of_the_rings) ) {
                                books.remove(i);
                                break;
                            }
                            i++;

                        }
                        break;
                    }


                }

                //Book has been borrowed
                borrowed();

            }

        }
    }


    public void printAvailableBooks() {
          //Code to check if our book is successfully given out
        if(books.isEmpty()){
            System.out.print("No book in catalog");
        }else{
            int i= 0;
            while (i < books.size()){
                System.out.println(books.get(i).getTitle());
                i++;
            }
        }

    }

    public  void returnBook(String bookReturned){

        books.add(new Book(bookReturned));
        System.out.println("You successfully returned The Lord of the Rings");
        returned();
       }


    }




