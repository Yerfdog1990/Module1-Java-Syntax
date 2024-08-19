package Decorators;

public class secondFloor extends HouseDecorator{
    House house;

    public secondFloor(House house) {
        this.house = house;
    }

    @Override
    public int getPrice() {
        return house.getPrice() + 22_000;
    }

    @Override
    public String getInfo() {
        return house.getInfo() + " + second floor";
    }
}
