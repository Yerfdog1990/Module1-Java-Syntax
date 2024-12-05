package Decorators;

public class Main {
    public static void main(String[] args) {
        House brickHouse = new BrickHouse();
        System.out.println("House feature(s): " +brickHouse.getInfo());
        System.out.println("Cost: " +"$" +brickHouse.getPrice());

        brickHouse = new firstFloor(brickHouse);
        System.out.println("House feature(s): " +brickHouse.getInfo());
        System.out.println("Cost: " +"$" +brickHouse.getPrice());

        brickHouse = new Garage(brickHouse);
        System.out.println("House feature(s): " +brickHouse.getInfo());
        System.out.println("Cost: " +"$" +brickHouse.getPrice());

        brickHouse = new secondFloor(brickHouse);
        System.out.println("House feature(s): " +brickHouse.getInfo());
        System.out.println("Cost: " +"$" +brickHouse.getPrice());

        House woodenHouse = new WoodenHouse();
        System.out.println("House feature(s): " +woodenHouse.getInfo());
        System.out.println("Cost: " +"$" +woodenHouse.getPrice());

        woodenHouse = new firstFloor(woodenHouse);
        System.out.println("House feature(s): " +woodenHouse.getInfo());
        System.out.println("Cost: " +"$" +woodenHouse.getPrice());

        woodenHouse = new Garage(woodenHouse);
        System.out.println("House feature(s): " +woodenHouse.getInfo());
        System.out.println("Cost: " +"$" +woodenHouse.getPrice());

        woodenHouse = new secondFloor(woodenHouse);
        System.out.println("House feature(s): " +woodenHouse.getInfo());
        System.out.println("Cost: " +"$" +woodenHouse.getPrice());

    }
}
