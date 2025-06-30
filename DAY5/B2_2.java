public class B2_2 {
    String title;
    String author;
    boolean isOpen;
    String status;

    // Constructor
    B2_2(String t, String a, boolean o) {
        title = t;
        author = a;
        isOpen = o;
    }

        void displayStatus() {
            String status = isOpen ? "Open" : "Closed";
            System.out.println(title + " by " + author + " is " + status);
     }



    public static void main(String[] args) {
        B2_2 book1 = new B2_2("XYZ", "kuvempu", true);
        B2_2 book2 = new B2_2("ABC", "James", false);

        book1.displayStatus();
        book2.displayStatus();
    }
}
