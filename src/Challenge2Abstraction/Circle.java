package Challenge2Abstraction;

public class Circle extends Shape{

    @Override
    public void calculateArea() {
        double area = Math.PI*Math.pow(getRadius(),2);
        System.out.println(String.format("The are of the circle = %.2fcm\u00B2", area));
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = Math.PI*2*getRadius();
        System.out.println(String.format("Perimeter of the circle = %.2fcm", perimeter));
    }
}
