public class Dog {
    static String species = "Canis familiaris";
    static int numLegs = 4;

    String name;
    String breed;
    int age;
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    public void bark() {
        System.out.println("Woof!");
    }

    // Main method to test the Dog class
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Labrador", 3);
        System.out.println("Name: " + myDog.name);
        System.out.println("Breed: " + myDog.breed);
        System.out.println("Age: " + myDog.age);
        System.out.println("Species: " + Dog.species);
        System.out.println("Number of Legs: " + Dog.numLegs);
        myDog.bark();
    }
}