package ObjectOrientedProgramming;
/*
Compile-time polymorphism is achieved through method overloading –
multiple methods have the same name but different type or number of parameters.
 */
public class CompileTmePolymorphism {
    //First method
    public double calculateArea(double length1, double width1) {
        double area = length1 * width1;
        return area;
    }
    //Second method with same name of methods and number of parameters, but different type
    public int calculateArea(int length2, int width2) {
        int area = length2 * width2;
        return area;
    }
    //Third method with same name of methods and type but, different number of parameters
    public double calculateArea(int number, double length3, double width3) {
        double area = length3 * width3 * number;
        return area;
    }
    //Main method
    public static void main(String[] args) {
        CompileTmePolymorphism areaObj = new CompileTmePolymorphism();
        System.out.println(String.format("The area of the rectangle is %.2fm\u00B2", areaObj.calculateArea(2.35,4.55)));
        System.out.println(String.format("The area of the rectangle is %dm\u00B2", areaObj.calculateArea(50,34)));
        System.out.println(String.format("The area of 5 rectangles is %.2fm\u00B2", areaObj.calculateArea(5, 2.35,4.55)));
    }
}
