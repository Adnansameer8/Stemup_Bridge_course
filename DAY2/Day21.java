 import java.util.Scanner;
 public class Day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Time:");
        int time = sc.nextInt();

        if (time >= 9) {
            System.out.println("Sleep now");
        }
    }
}

