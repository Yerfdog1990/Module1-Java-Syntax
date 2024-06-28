package AbstractionDemo;

public class Car extends Vehicle {
    @Override
    public void dreamCar() {

        System.out.println(String.format("My dream car is %s.", getModel()));
    }
    @Override
    public void startEngine() {
        System.out.println("The vehicle engine starts.");
    }
    @Override
    public void stopEngine(){

        System.out.println("The vehicle engine stops");
    }
}
