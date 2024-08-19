package Decorators;

public class firstFloor extends HouseDecorator{
House house;

    public firstFloor(House house) {
        this.house = house;
    }

    @Override
    public int getPrice() {
        return house.getPrice() + 20_000;
    }

    @Override
    public String getInfo() {
        return house.getInfo() + " + first floor";
    }
}
