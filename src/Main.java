import java.util.List;

public class Main {

            public static void main(String[] args) {
                // Create library instance
                Library library = new Library();

                // Create librarian
                Librarian librarian = new Librarian(1, "librarian", "password");

                // Create members
                Member hasna1 = new Member(1, "Hasna", "password");
                Member hasna2 = new Member(2, "Hasna1", "password1");

                // Create books
                Book book1 = new Book(1, "Book 1", "Author 1");
                Book book2 = new Book(2, "Book 2", "Author 2");

                // Add members to the library
                librarian.addMember(hasna1);
                librarian.addMember(hasna2);

                // Add books to the library
                librarian.addBook(book1);
                librarian.addBook(book2);

                // Print all members in the library
                System.out.println("Members inside our library system:");
                List<Member> members = Library.getMembers();
                for (Member member : members) {
                    System.out.println("Member ID: " + member.getMemberId());
                    System.out.println("Username: " + member.getUsername());
                    System.out.println("Password: " + member.getPassword());
                }

                // Print all books in the library
                System.out.println("Books inside the library system:");
                List<Book> books = Library.getAllBooks();
                for (Book book : books) {
                    System.out.println("Book ID: " + book.getBookId());
                    System.out.println("Title: " + book.getTitle());
                    System.out.println("Author: " + book.getAuthor());
                }

                // Member borrows a book
                hasna1.borrowBook(book1);

                // Check if the member has borrowed a book
                Book borrowedBook = hasna1.viewBorrowedBook();
                if (borrowedBook != null) {
                    System.out.println("Member " + hasna1.getUsername() + " has borrowed the book: " + borrowedBook.getTitle());
                }

                // Member returns the book
                hasna1.returnBook();

                // Check if the member has returned the book
                borrowedBook = hasna1.viewBorrowedBook();
                if (borrowedBook == null) {
                    System.out.println("Member " + hasna1.getUsername() + " has returned the book.");
                }

                // Remove a member from the library
                librarian.removeMember(hasna2);

                // Remove a book from the library
                librarian.removeBook(book2);
            }
        }


