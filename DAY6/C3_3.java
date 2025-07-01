abstract class Shape {
    abstract double getArea();
}

// Circle class
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Square class
class Square extends Shape {
    double side;
    Square(double side) {
        this.side = side;
    }
    double getArea() {
        return side * side;
    }
}

public class C3_3 {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Square(4)};
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
    }
    }}