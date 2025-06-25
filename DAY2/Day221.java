
import java.util.Scanner;
public class Day221 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Current Temp:");
       int currentTemp= sc.nextInt();
       

       if (currentTemp < 22.00 ) {
           System.out.println("Turning on heater");
       }else{
            System.out.println("Heater is off");
           }
       }
   }

