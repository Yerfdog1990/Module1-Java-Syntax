package DataTypes;

import java.util.Scanner;

/*
Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
 */
public class Challenge1_TemperatureConverter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit: ");
        double fahrenheit = userInput.nextDouble();
        System.out.println(String.format("%.2f\u00B0F = %.2f\u00B0C", fahrenheit, convertToCelsius(fahrenheit)));
        System.out.print("Enter temperature in celsius: ");
        double celsius = userInput.nextDouble();
        System.out.println(String.format("%.2f\u00B0C = %.2f\u00B0F", celsius, convertToFahrenheit(celsius)));
    }
    public static double convertToCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }
    public static double convertToFahrenheit(double celsius){
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
}
