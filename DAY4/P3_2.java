
public class  P3_2 {

    public static int myPower(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        int base = 8;
        int exponent = 9;

        int customResult = myPower(base, exponent);
        double mathResult = Math.pow(base, exponent);

        System.out.println("Result using myPower(): " + customResult);
        System.out.println("Result using Math.pow(): " + mathResult);
    }
}
