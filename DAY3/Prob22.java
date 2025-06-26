import java.util.Scanner;

public class Prob22 {
 
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int fact=sc.nextInt();

    int result=1;
    
    for(int i=2; i<=fact; i++){
     result = result *i;

 }  
 System.out.println(result);
 }
 
}
