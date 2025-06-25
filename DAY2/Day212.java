import java.util.Scanner;
public class Day212 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Is raining true or false:");
       boolean value= sc.nextBoolean();

       if (value == true) {
           System.out.println("Carry Umbrella");
       }else{
            System.out.println("Dont carry umbrella");
           }
       }
   }

