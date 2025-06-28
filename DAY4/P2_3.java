public class P2_3  {


    public static double calculateDiscount(double originalPrice, double discountPercentage) {
        return originalPrice - (originalPrice * discountPercentage / 100);
    }
    public static double calculateTax(double amount, double taxRate) {
        return amount + (amount * taxRate / 100);
    }
    public static double calculateFinalPrice(double itemPrice, double discountPerc, double taxRate) {
        double priceAfterDiscount = calculateDiscount(itemPrice, discountPerc);
        double finalPrice = calculateTax(priceAfterDiscount, taxRate);
        return finalPrice;
    }
    public static void main(String[] args) {
        double itemPrice = 1000.0;
        double discountPercentage = 10.0;
        double taxRate = 8.0;

        double finalPrice = calculateFinalPrice(itemPrice, discountPercentage, taxRate);
        System.out.println("Final Price after Discount and Tax: ₹" + finalPrice);
    }
}
