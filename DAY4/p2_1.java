
public class p2_1 {
// static String globalMessage = "I am global!";
static void displayMessages() {
    String localMessage = "I am local!";
 System.out.println(localMessage);
}

// System.out.println(globalMessage);
public static void main(String[] args) {
displayMessages();
// Try to print localMessage here and observe the error.
}
}
