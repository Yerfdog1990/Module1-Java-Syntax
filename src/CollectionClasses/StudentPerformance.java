package CollectionClasses;

import java.util.HashMap;

public class StudentPerformance {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("List of students:");
        printStudents();
        System.out.print("Average grade mark: ");
        getAVerageMark();
    }
    public static void addStudents(){
        grades.put("Godfrey", 77d);
        grades.put("Jack", 79d);
        grades.put("Eugine", 74d);
        grades.put("Bill", 78d);
    }
    public static void printStudents(){
        for(String key : grades.keySet()){
            System.out.println(key);
        }
    }
    public static void getAVerageMark(){
        Double identity = 0d;
        for(Double value : grades.values()){
            identity += value;
        }
        System.out.println(identity/grades.size());
    }
}
