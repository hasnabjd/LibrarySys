import java.util.ArrayList;
import java.util.List;

class Library {
    private int libId;
    private static List<Member> members; // List to store library members
    private static List<Book> allBooks; // List to store all books in the library
    private List<Book> borrowedBooks; // List to store borrowed books

    public Library() {
        members = new ArrayList<>();
        allBooks = new ArrayList<>();
        borrowedBooks = new ArrayList<>();
    }

    public static List<Member> getMembers() {
        return members;
    }

    public static List<Book> getAllBooks() {
        return allBooks;
    }



    // Method to check if a book is returned on time by checking the list of borrowed books
    public boolean checkReturn(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            return true; // Book is returned on time
        } else {
            return false; // Book is not borrowed or returned late
        }
    }
}
