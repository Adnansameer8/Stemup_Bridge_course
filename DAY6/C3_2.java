// Abstract base class: Shape
abstract class Shape {
    abstract double getArea();
}

// Subclass: Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass: Square
class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    double getArea() {
        return side * side;
    }
}

public class C3_2 {
    public static void main(String[] args) {
        // Create a polymorphic list of shapes
        Shape[] shapes = new Shape[] {
            new Circle(5.0),
            new Square(4.0),
            new Circle(3.0),
            new Square(6.0)
        };

        // Calculate and print areas
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
        }
    }
}
