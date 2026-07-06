package myfirstproject;
// Author class representing the reference object
class Author {
    String authorName;

    // Constructor
    public Author(String authorName) {
        this.authorName = authorName;
    }
}

// Book class demonstrating shallow copy via Copy Constructor
class Book {
    String bookName;
    Author author; // Object reference

    // Parameterized Constructor
    public Book(String bookName, Author author) {
        this.bookName = bookName;
        this.author = author;
    }

    // Copy Constructor performing a Shallow Copy
    public Book(Book otherBook) {
        this.bookName = otherBook.bookName;
        this.author = otherBook.author; // Copying the reference, not creating a new Author object
    }

    // Method to display Book details
    public void displayBookDetails(String label) {
        System.out.println(label + " -> Book Name: " + this.bookName + ", Author Name: " + this.author.authorName);
    }
}

// Main class to execute the demonstration
public class ShallowCopyDemo {
    public static void main(String[] compass) {
        // 1. Create the original Author and Book objects
        Author originalAuthor = new Author("George Orwell");
        Book originalBook = new Book("184", originalAuthor);

        System.out.println("--- Before Modification ---");
        originalBook.displayBookDetails("Original Book");

        // 2. Create a copy of the book using the Copy Constructor (Shallow Copy)
        Book copiedBook = new Book(originalBook);
        copiedBook.displayBookDetails("Copied Book  ");

        // 3. Modify the author name in the copied object
        System.out.println("\n--- Modifying Author Name in Copied Book ---");
        copiedBook.author.authorName = "Arthur Conan Doyle";

        // 4. Display both objects to check if the change reflected in the original
        originalBook.displayBookDetails("Original Book");
        copiedBook.displayBookDetails("Copied Book  ");
        
        System.out.println("\nVerdict: The change reflected in the original object because it was a shallow copy!");
    }
}