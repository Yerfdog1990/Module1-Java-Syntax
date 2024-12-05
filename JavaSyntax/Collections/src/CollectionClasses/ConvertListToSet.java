package CollectionClasses;

import java.util.ArrayList;
import java.util.HashSet;

import static java.util.Arrays.asList;

public class ConvertListToSet {
    public static void main(String[] args) {
        ArrayList<String> listofWords = new ArrayList<>(asList("A new series of Java programming books has been released: \"Java for Beginners\", \"Java for Professionals\", \"Java for Graduates\"".split(" ")));
        System.out.println("Number of words in the list: " +listofWords.size());
        HashSet<String > setofWords = listToSet(listofWords);
        System.out.println("Number of words in the set: " +setofWords.size());
    }

    private static HashSet<String> listToSet(ArrayList<String> listofWords) {
        return new HashSet<>(listofWords);
    }

}
