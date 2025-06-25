import java.util.Scanner;
public class Day222 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("!motion Detected true or false:");
       boolean value= sc.nextBoolean();

       if (value == false) {
           System.out.println("Turning off lights.");
       }else{
            System.out.println("Lights remain on.");
           }
       }
   }
