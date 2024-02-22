public class Abstraction {
    public static abstract class Shape {
        // Abstract method to calculate the area
        abstract double calculateArea();
    }

    public static class Circle extends Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        // Implementation of the abstract method for calculating the area of a circle
        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    public static class Rectangle extends Shape {
        double length;
        double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Implementation of the abstract method for calculating the area of a rectangle
        @Override
        double calculateArea() {
            return length * width;
        }
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

    }

}
