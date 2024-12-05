package ObjectOrientedProgramming;
/*
Write a Java program to create a class called "Rectangle" with width and height attributes.
Calculate the area and perimeter of the rectangle.
 */

public class Rectangle {
    private double width;
    private double height;

   public Rectangle(){

   }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void isArea(double width, double height){
       double area = width * height;
        System.out.println(String.format("The area of the rectangle is: %.2fcm\u00B2", area));;
    }
    public void isPerimeter(double width, double height){
       double perimeter = 2*(width + height);
        System.out.println(String.format("The perimeter of the rectangle is: %.2fcm", perimeter));
    }

    public static void main(String[] args) {
  
    }
}
