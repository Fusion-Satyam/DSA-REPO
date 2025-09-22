package oops;

//Single Responsibility Principle (SRP) states that a class should have only one reason to change,
// meaning it should only have one job or responsibility.

/* 
❌ Bad Example:

A UserService that handles everything from user data to sending emails.

class UserService {
    public void registerUser(String name, String email) {
        // save to DB
        // send welcome email
    }
}

✅ Good Example (SRP Applied):
class UserService {
    public void registerUser(String name, String email) {
        // save to DB
    }
}

class EmailService {
    public void sendWelcomeEmail(String email) {
        // send email
    }
}


Now:

UserService handles only user logic

EmailService handles only email logic*/

public class SRP {
    // Class representing a Book
    static class Book { 
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }
    public static void main(String[] args) {
        Book book = new Book("Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides");
       
    
    }
    
}
