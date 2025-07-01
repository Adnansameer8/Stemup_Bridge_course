
// Base class: Animal
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass: Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass: Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class
public class AnimalTest {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound(); // Output: The animal makes a sound.
        myDog.makeSound();    // Output: The dog barks.
        myCat.makeSound();    // Output: The cat meows.
    }
}
