class Librarian extends User {
    private int librarianId;

    public Librarian(int librarianId, String username, String password) {
        super(username, password);
        this.librarianId = librarianId;
    }

    public int getLibrarianId() {
        return librarianId;
    }

    public void addMember(Member member) {
        Library.getMembers().add(member);
        System.out.println("Member added successfully.");
    }

    public void removeMember(Member member) {
        Library.getMembers().remove(member);
        System.out.println("Member removed successfully.");
    }

    public void addBook(Book book) {
        Library.getAllBooks().add(book);
        System.out.println("Book added successfully.");
    }

    public void removeBook(Book book) {
        Library.getAllBooks().remove(book);
        System.out.println("Book removed successfully.");
    }


    // Method to check if a member has returned a book on time

    public boolean checkMemberReturn(Member member) {
        Book borrowedBook = member.viewBorrowedBook();
        if (borrowedBook != null) {
            boolean isReturnedOnTime = member.returnBook();
            if (!isReturnedOnTime) {
                member.payFee(5.0); // Example fee amount, adjust as needed
                System.out.println("Member " + member.getUsername() + " has not returned the book on time. A fee of $5.0 is applied.");
            }
            return isReturnedOnTime;
        } else {
            System.out.println("Member " + member.getUsername() + " has not borrowed any book.");
            return false;
        }
    }
}
