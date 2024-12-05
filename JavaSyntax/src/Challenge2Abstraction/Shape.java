package Challenge2Abstraction;
/*
Write a Java program to create an abstract class Shape with
abstract methods calculateArea() and calculatePerimeter().
Create subclasses Circle and Triangle that extend the Shape class and
implement the respective methods to calculate the area and perimeter of each shape.
 */
public abstract class Shape {
    private double radius;
    private double side1;
    private double side2;
    private double height;
    private double base;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public abstract void calculateArea();
    public abstract void calculatePerimeter();
}
