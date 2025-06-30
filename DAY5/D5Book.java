public class D5Book {
    String title;
    String author;
    int numPages;
    boolean isOpen;

     public D5Book(String title, String author, int numPages){
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.isOpen = true; 
    }
   
   
    public void openBook() {
        isOpen = true;
        System.out.println("The book is now open.");
    }
 public void closeBook() {
        isOpen = false;
        System.out.println("The book is now closed.");
    }


    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numPages);
        System.out.println("Is the book open? " +isOpen);
    }

    public static void main(String[] args) {
        D5Book myBook = new D5Book("MY BOOK", "Sameer", 100);
        myBook.displayInfo();
        myBook.openBook();
        myBook.closeBook();
        myBook.displayInfo();
    }
}