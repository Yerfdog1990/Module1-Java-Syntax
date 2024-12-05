package Enum;
//This is the orginal enum
public enum DayEnum {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    //Method to get days
    public String getName(){
        return name();
    }
    //Method to get ordinal of each day
    public int getOrdinal(){
        return ordinal();
    }
    //Method to check if day is weekend
    public boolean isWeekend(){
        return this == SUNDAY && this == SATURDAY;
    }
    //Method to check if day is weekday
    public boolean isWeekday(){
        return this != SUNDAY || this != SATURDAY;
    }

    public static void main(String[] args) {
        //Print all days
        System.out.println("Days of the week and their ordinal:");
        for(DayEnum day : DayEnum.values()){
            System.out.println("Day: " +day.getName()+ " ,Ordinal: " +day.getOrdinal());
        }
        //Check if Wednesday is a weekday or a weekend
        DayEnum day = DayEnum.WEDNESDAY;
        System.out.println("Wednesday is a weekday: " +day.isWeekday());
        System.out.println("Wednesday is a weekend: " +day.isWeekend());

        //Using valueOf() to get day of the week by ordinal
        DayEnum dayByOrdinal = DayEnum.values()[1];
        System.out.println("Day by ordinal 1: " +dayByOrdinal);
        //Using valueOf() to get enum constant by name
        DayEnum dayByName = DayEnum.valueOf("TUESDAY");
        System.out.println("Day by name: " +dayByName);
    }
}
