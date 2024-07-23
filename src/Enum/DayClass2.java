package Enum;
//Method 2 to convert the DayEnum to class

public class DayClass2 {
    // Field to store the day number and name
    private final String dayName;
    private final int dayNumber;
    // Private constructor to initialize the day number
    public DayClass2(String name, int dayNumber) {
        this.dayName = name;
        this.dayNumber = dayNumber;
    }
    //Method to get name
    public String getDayName() {
        return dayName;
    }
    //method to get day number
    public int getDayNumber() {
        return dayNumber;
    }
    // List of static constants for each day
    public static final DayClass2 MONDAY = new DayClass2("Monday", 0);
    public static final DayClass2 TUESDAY = new DayClass2("Tuesday", 1);
    public static final DayClass2 WEDNESDAY = new DayClass2("Wedsday", 2);
    public static final DayClass2 THURSDAY = new DayClass2("Thursday", 3);
    public static final DayClass2 FRIDAY = new DayClass2("Friday", 4);
    public static final DayClass2 SATURDAY = new DayClass2("Saturday", 5);
    public static final DayClass2 SUNDAY = new DayClass2("Sunday", 6);
    // Array of all days to simulate the values() method
    public static final DayClass2[] values = {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    // Method to get the name of the day
    public String name(){
        switch (this.dayNumber){
            case 0: return "Monday";
            case 1: return "Tuesday";
            case 2: return "Wednesday";
            case 3: return "Thursday";
            case 4: return "Friday";
            case 5: return "Saturday";
            case 6: return "Sunday";
            default: throw new IllegalArgumentException("Invalid day number");
        }
    }
    // Method to get a day by its ordinal value
    public static DayClass2 getDayByOrdinal(int ordinal){
        for(DayClass2 day : values){
            if(day.getDayNumber() == ordinal){
                return day;
            }
        }
        throw new IllegalArgumentException("Invalid ordinal value: " +ordinal);
    }
    // Method to get a day by its name
    public static DayClass2 getDayByName(String name){
        for(DayClass2 day : values){
            if(day.getDayName().equalsIgnoreCase(name)){
                return day;
            }
        }
        throw new IllegalArgumentException("Invalid day name: " +name);
    }
    // Method to check if it's a weekday
    public boolean isItWeekday(){
        return this != SUNDAY || this != SATURDAY;
    }
    // Method to check if it's a weekend
    public boolean isItWeekend(){
        return this == SUNDAY && this == SATURDAY;
    }
    // Main method to demonstrate the usage of the Day class
    public static void main(String[] args) {
        //Print all days
        System.out.println("Days of the week and their ordinal:");
        for(DayClass2 day : DayClass2.values){
            System.out.println("Day: " +day.getDayName()+ " ,Ordinal: " +day.getDayNumber());
        }
        //Check if Wednesday is a weekday or a weekend
        DayClass2 day = DayClass2.WEDNESDAY;
        System.out.println("Wednesday is a weekday: " +day.isItWeekday());
        System.out.println("Wednesday is a weekend: " +day.isItWeekend());

        //Get day of the week by ordinal
        DayClass2 dayByNumber = DayClass2.getDayByOrdinal(1);
        System.out.println("Day by ordinal 1: " +dayByNumber.getDayName());
        //Get enum constant by name
        DayClass2 dayByName = DayClass2.getDayByName("Tuesday");
        System.out.println("Day by name: " +dayByName.getDayName());
    }
}
