package Decorators;

public class WoodenHouse extends House{
    public WoodenHouse() {
        info = "Wooden House";
    }

    @Override
    public int getPrice() {
        return 25_000;
    }
}
