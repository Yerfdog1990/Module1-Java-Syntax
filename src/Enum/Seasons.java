package Enum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Create the enum season
public enum Seasons {
    SUMMER, AUTUMN, WINTER, SPRING;

    // Method to convert the enum values to a list
    private static List<Seasons> convertToList(){
        List<Seasons> seasonsList = new ArrayList<Seasons>();
        // Add the values in the array returned by the values() method
        Collections.addAll(seasonsList, values());
        //Return seasonList
        return seasonsList;
    }
    // Main class to demonstrate the usage
    public static void main(String[] args) {
        // Get the list of all days using the convertToList() method
        List<Seasons> seasonsList = Seasons.convertToList();
        // Print the days of the week
        for(Seasons list : seasonsList){
            System.out.println(list);
        }
    }
}
