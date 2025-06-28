
public class p3_1{

    
    public static void customGreet(String name, String greeting) {
        System.out.println(greeting + ", " + name + "!");
    }

    public static void customGreet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void customGreet() {
        System.out.println("Hello, Guest!");
    }

    public static void main(String[] args) {
      
        customGreet("Adnan", "Good Night"); 
        customGreet("Sameer");                  
        customGreet();                         
    }
}


