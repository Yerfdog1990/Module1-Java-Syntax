package AbstractionDemo;

public class Main{
    public static void main(String[] args) {
        Car obj = new Car();
        obj.dreamCar();
        obj.startEngine();
        obj.stopEngine();
        obj.setColor("White");
        obj.setYOM(2030);
        System.out.println(String.format("The color of the car will be %s.", obj.getColor()));
        System.out.println(String.format("The car will be manufactured in %d.", obj.getYOM()));
    }
}
