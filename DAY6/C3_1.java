abstract class Employee {
    String name;
    Employee(String name) { this.name = name; }
    abstract double calculatePayroll();
}

class SalariedEmployee extends Employee {
    double salary;
    SalariedEmployee(String name, double salary) {
        super(name); this.salary = salary;
    }
    double calculatePayroll() { return salary; }
}

class HourlyEmployee extends Employee {
    double rate; int hours;
    HourlyEmployee(String name, double rate, int hours) {
        super(name); this.rate = rate; this.hours = hours;
    }
    double calculatePayroll() { return rate * hours; }
}

public class C3_1{
    public static void main(String[] args) {
        Employee[] emps = {
            new SalariedEmployee("Alice", 50000),
            new HourlyEmployee("Bob", 200, 100)
        };

        for (Employee e : emps)
            System.out.println(e.name + ": Rs. " + e.calculatePayroll());
    }
}
