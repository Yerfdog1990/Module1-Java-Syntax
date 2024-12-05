package Enum;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    //Method to find the nex month
    public static Month getNextMonth(Month month) {
        int ordinal = month == Month.DECEMBER ? 0 : month.ordinal() + 1;
        return Month.values()[ordinal];
    }
    //Main method
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }
}
