// Parent class
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child classes inheriting from the parent class
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Main class to test polymorphism
public class PolymorphismExample1 {
    public static void main(String[] args) {
        // Create instances of the child classes
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        // Polymorphic method invocation
        shape1.draw();
        shape2.draw();
    }
}
