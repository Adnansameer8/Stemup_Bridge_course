import java.util.Scanner;
public class Day213 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Is raining true or false:");
       boolean value= sc.nextBoolean();

       if (value == true) {
           System.out.println("go with car");
       }else{
            System.out.println("go with bike");
           }
       }
   }
