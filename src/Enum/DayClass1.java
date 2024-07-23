package Enum;

import java.util.ArrayList;
import java.util.List;

//Method 1 to convert the DayEnum to class
//Define class
public class DayClass1 {
    //Define static final constant for each day
    public static final DayClass1 MONDAY = new DayClass1("Monday", 0);
    public static final DayClass1 TUESDAY = new DayClass1("Tuesday", 1);
    public static final DayClass1 WEDNESDAY = new DayClass1("Wednesday", 2);
    public static final DayClass1 THURSDAY = new DayClass1("Thursday", 3);
    public static final DayClass1 FRIDAY = new DayClass1("Friday", 4);
    public static final DayClass1 SATURDAY = new DayClass1("Saturday", 5);
    public static final DayClass1 SUNDAY = new DayClass1("Sunday", 6);

    //List to add all day
    public static List<DayClass1> ALL_DAYS = new ArrayList<DayClass1>();
    static {
        //Initialize the lis with all days
        ALL_DAYS.add(MONDAY);
        ALL_DAYS.add(TUESDAY);
        ALL_DAYS.add(WEDNESDAY);
        ALL_DAYS.add(THURSDAY);
        ALL_DAYS.add(FRIDAY);
        ALL_DAYS.add(SATURDAY);
        ALL_DAYS.add(SUNDAY);
    }
    //Field to store the name and ordinal of teh day
    private final String name;
    private final int ordinal;

    //Private constructor to initialize the day
    private DayClass1(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }
    //Method to get all days
    public static List<DayClass1> getAllDays() {
        return ALL_DAYS;
    }
    //Method to get name of the day
    public String getName() {
        return name;
    }
    //Method to get ordinal of the day
    public int getOrdinal() {
        return ordinal;
    }
    //Method to get a day by its ordinal value
    public static DayClass1 findDayByOrdinal(int ordinal){
        for(DayClass1 day : ALL_DAYS){
            if(day.getOrdinal() == ordinal){
                return day;
            }
        }
        throw new IllegalArgumentException("Invalid ordinal value:" +ordinal);
    }
    // Method to get a day by its name
    public static DayClass1 findDayByName(String name) {
        for (DayClass1 day : ALL_DAYS) {
            if (day.getName().equalsIgnoreCase(name)) {
                return day;
            }
        }
        throw new IllegalArgumentException("Invalid day name: " + name);
    }
    //Method to check if a day is a weekday
    public boolean itIsWeekDay(){
        return this != SATURDAY || this != SUNDAY;
    }
    //Method to check if a day is a weekend
    public boolean itIsWeekEnd(){
        return this == SATURDAY && this == SUNDAY;
    }
    //Main method to demonstrate usage of DayClass1
    public static void main(String[] args) {
        //Print all days
        //Print all days
        System.out.println("Days of the week and their ordinal:");
        for(DayClass1 day : DayClass1.ALL_DAYS){
            System.out.println("Day: " +day.getName()+ " ,Ordinal: " +day.getOrdinal());
        }
        //Check if Wednesday is a weekday or a weekend
        DayClass1 day = DayClass1.WEDNESDAY;
        System.out.println("Wednesday is a weekday: " +day.itIsWeekDay());
        System.out.println("Wednesday is a weekend: " +day.itIsWeekDay());

        //Get day of the week by ordinal
        DayClass1 dayByOrdinal = DayClass1.findDayByOrdinal(1);
        System.out.println("Day by ordinal 1: " +dayByOrdinal.getName());
        //Get enum constant by name
        DayClass1 dayByName = DayClass1.findDayByName("TUESDAY");
        System.out.println("Day by name: " +dayByName.getName());
    }
}
