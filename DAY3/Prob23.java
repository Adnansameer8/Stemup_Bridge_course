public class Prob23 {
    public static void main(String[] args) {
    String str = "javajava";
    int totalcount= str .length();
         int removea = str .replace("a","").length();
         int count=totalcount-removea;
        System.out.println(count);
    }
}
