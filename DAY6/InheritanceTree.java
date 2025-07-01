// Base class
class ElectronicDevice {
    void turnOn() {
        System.out.println("Device is ON");
    }
    void turnOff() {
        System.out.println("Device is OFF");
    }
}

// Subclass: Television
class Television extends ElectronicDevice {
    void changeChannel() {
        System.out.println("Changing TV channel");
    }
}

// Subclass: Laptop
class Laptop extends ElectronicDevice {
    void runProgram() {
        System.out.println("Running a program on Laptop");
    }
}

// Subclass: Smartphone
class Smartphone extends ElectronicDevice {
    void makeCall() {
        System.out.println("Making a call from Smartphone");
    }
}

// Main class
public class InheritanceTree {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.turnOn();
        tv.changeChannel();

        Laptop laptop = new Laptop();
        laptop.turnOn();
        laptop.runProgram();

        Smartphone phone = new Smartphone();
        phone.turnOn();
        phone.makeCall();
    }
}
