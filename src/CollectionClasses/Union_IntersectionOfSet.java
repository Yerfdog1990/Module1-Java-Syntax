package CollectionClasses;

import java.util.HashSet;
import java.util.Set;

public class Union_IntersectionOfSet {
    public static int[] array1;
    public static int[] array2;
    public static void main(String[] args) {
        array1 = new int[]{1, 23, 5, 6, 7, 8, 2, 17};
        array2 = new int[]{3, 5, 6, 12, 18, 17, 2, 23};

        findUnion(array1, array2);
        findIntersection(array1, array2);
    }
    //Method to find union of a set
    public static void findUnion(int[] union1, int[] union2){
        //Initialize set
        Set<Integer> union = new HashSet<>();
        for (int i = 0; i < union1.length; i++) {
            union.add(union1[i]);
        }
        for (int i = 0; i < union2.length; i++) {
            union.add(union2[i]);
        }
        System.out.println("Union of set = " +union);
    }
    //Method to find intersection of a set
    public static void findIntersection(int[] intersection1, int[] intersection2){
        //Initialize set
        Set<Integer> intersection = new HashSet<>();
        for (int i = 0; i < intersection1.length; i++) {
            for (int j = 0; j < intersection2.length; j++) {
                if(intersection1[i] == intersection2[j]){
                    intersection.add(intersection1[i]);
                    intersection.add((intersection2[j]));
                }
            }
        }
        System.out.println("Intersection of set = " +intersection);
    }
}
