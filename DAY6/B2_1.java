abstract class Payment{
    abstract void processPayment(double amount);
}

class CreditCard extends Payment {
    void processPayment(double amount) {
        System.out.println(" My Card has: ₹" + amount);
    }
}

class Phonepe extends Payment{
    void processPayment(double amount) {
        System.out.println("My balance in Phonepe is : ₹" + amount);
    }
}

public class B2_1 {
    public static void main(String[] args) {
        Payment a = new CreditCard();
        Payment b = new Phonepe();
        a.processPayment(20000);
        b.processPayment(12000);

        // Payment p = new Payment(); // ❌ Error: abstract class cannot be instantiated
    }
}
