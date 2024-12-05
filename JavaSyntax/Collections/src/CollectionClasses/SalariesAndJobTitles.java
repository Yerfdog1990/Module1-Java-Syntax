package CollectionClasses;

import java.util.Random;
import java.util.TreeMap;

public class SalariesAndJobTitles {
    public static void main(String[] args) {
        // Creating a TreeMap to store salary and job title pairs
        TreeMap<Integer, String > treeMap = new TreeMap<>();
        // Adding salary ranges and corresponding job titles to the map
        treeMap.put(0, "Newbie.");
        treeMap.put(20000, "Trainee.");
        treeMap.put(80000, "Junior developer.");
        treeMap.put(85000, "Strong junior developer.");
        treeMap.put(95000, "Mid-level developer.");
        treeMap.put(105000, "Strong mid-level developer.");
        treeMap.put(120000, "Senior developer.");

        // Creating a Random object to generate random salary values
        Random randon = new Random();
        // Looping 10 times to generate and display random treeMap and corresponding job titles
        for (int i = 0; i < 5; i++) {
        // Generating a random salary up to 120000
            int salary = randon.nextInt(120000);
            // Getting the job title corresponding to the generated salary
            String position = getJobTitle(treeMap, salary);
            // Printing the salary and corresponding job title
            System.out.printf("A salary of $%d corresponds to the job title \"%s\"%n", salary, position);
        }
    }
    // Method to get the job title based on the salary
    public static String getJobTitle(TreeMap<Integer, String> treeMap, Integer salary){
        // Getting the closest lower or equal salary entry and returning its value (job title)
        return treeMap.floorEntry(salary).getValue();
    }
}
