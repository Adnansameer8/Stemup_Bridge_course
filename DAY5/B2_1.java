public class B2_1  {
    String name;
    String breed;
    int age;

    // Constructor
    B2_1 (String n, String b, int a) {
        name = n;
        breed = b;
        age = a;
    }

    // Method
    void bark() {
        System.out.println(name + " says: woof!");
    }

    // Method to display dog info
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        B2_1  dog1 = new B2_1 ("Blacky", "pomeranian", 7);
       B2_1  dog2 = new B2_1 ("milky", "Golden Retriever", 3);

        dog1.bark();
        dog1.displayInfo();

        dog2.bark();
        dog2.displayInfo();
    }
}
