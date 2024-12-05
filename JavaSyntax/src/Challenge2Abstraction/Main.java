package Challenge2Abstraction;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setBase(4.5);
        triangle.setHeight(5.9);
        triangle.setSide1(3.7);
        triangle.setSide2(8.1);
        triangle.calculateArea();
        triangle.calculatePerimeter();

        Circle circle = new Circle();
        circle.setRadius(8.5);
        circle.calculateArea();
        circle.calculatePerimeter();
    }
}
