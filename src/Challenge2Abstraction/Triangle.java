package Challenge2Abstraction;

public class Triangle extends Shape{

    @Override
    public void calculateArea() {
        double area = 0.5 * getBase() * getHeight();
        System.out.println(String.format("Area of the triangle = %.2fcm\u00B2", area));
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = getSide1() + getSide1() + getBase();
        System.out.println(String.format("Perimeter of the triangle = %.2fcm", perimeter));
    }
}
