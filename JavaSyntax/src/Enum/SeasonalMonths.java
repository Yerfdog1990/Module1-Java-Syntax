package Enum;

//Define enum
public enum SeasonalMonths {
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
    //Method to get winter months
    public static SeasonalMonths[] getWinterMonths(){
        return new SeasonalMonths[]{DECEMBER, JANUARY, FEBRUARY};
    }
    //Method to get spring months
    public static SeasonalMonths[] getSpringMonths(){
        return new SeasonalMonths[]{MARCH, APRIL, MAY};
    }
    //Method to get summer months
    public static SeasonalMonths[] getSummerMonths(){
        return new SeasonalMonths[]{JUNE, JULY, AUGUST};
    }
    //method to get autumn months
    public static SeasonalMonths[] getAutumnMonths(){
        return new SeasonalMonths[]{SEPTEMBER, OCTOBER, NOVEMBER};
    }
    //Main method
    public static void main(String[] args) {
        //Print winter months
        System.out.println("Winter months:");
        for(SeasonalMonths winter : SeasonalMonths.getWinterMonths()){
            System.out.println(winter);
        }
        //Print spring months
        System.out.println("Spring months:");
        for(SeasonalMonths spring : SeasonalMonths.getSpringMonths()){
            System.out.println(spring);
        }
        //Print summer months
        System.out.println("Summer months:");
        for(SeasonalMonths summer : SeasonalMonths.getSummerMonths()){
            System.out.println(summer);
        }
        //Print autumn months
        System.out.println("Autumn months:");
        for(SeasonalMonths autumn : SeasonalMonths.getAutumnMonths()){
            System.out.println(autumn);
        }
    }
}
