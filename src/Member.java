import java.util.ArrayList;
import java.util.List;

class Member extends User {
    private int memberId; // Member ID
    private Book borrowedBook; // Book currently borrowed by the member

    public Member(int memberId, String username, String password) {
        super(username, password);
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }

    // Method to borrow a book
    public boolean borrowBook(Book book) {
        // Check if the member can borrow a book
        if (borrowedBook == null) {
            borrowedBook = book;
            System.out.println("Book borrowed successfully.");
            return true;
        } else {
            System.out.println("You have a borrowed book.");
            return false;
        }
    }

    public boolean returnBook() {
        // Check if the member can return a book
        if (borrowedBook != null) {
            borrowedBook = null;
            System.out.println("Book returned successfully.");
            return true;
        } else {
            System.out.println("You have not borrowed any book.");
            return false;
        }
    }


    public List<Book> searchBook(String keyword, Book[] books) {
        List<Book> searchResults = new ArrayList<>();

        for (Book book : books) {
            String bookTitle = book.getTitle().toLowerCase();
            String bookAuthor = book.getAuthor().toLowerCase();

            if (bookTitle.contains(keyword.toLowerCase()) || bookAuthor.contains(keyword.toLowerCase())) {
                searchResults.add(book);
            }
        }

        return searchResults;
    }


    public Book viewBorrowedBook() {
        return borrowedBook;
    }


        public void payFee(double amount) {
            if (amount > 0) {
                System.out.println("Payment of $" + amount + "" +
                        " successful.");
            } else {
                System.out.println("Invalid payment amount.");
            }
        }


    }

