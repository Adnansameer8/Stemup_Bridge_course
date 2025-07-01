
// Base class
class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Subclass: Manager
class Manager extends Employee {
    Manager(String name, int id) {
        super(name, id);
    }

    void showRole() {
        System.out.println("Role: Manager");
    }
}

// Subclass: Developer
class Developer extends Employee {
    Developer(String name, int id) {
        super(name, id);
    }

    void showRole() {
        System.out.println("Role: Developer");
    }
}

// Main class
public class D6_1 {
    public static void main(String[] args) {
        Manager m = new Manager("Adnan", 101);
        Developer d = new Developer("Arman", 102);

        m.showDetails();
        m.showRole();

        System.out.println("---------------------------------------");

        d.showDetails();
        d.showRole();
    }
}
