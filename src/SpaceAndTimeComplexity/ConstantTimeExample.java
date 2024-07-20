package SpaceAndTimeComplexity;

import java.util.ArrayList;
import java.util.HashMap;

/*
O(1) - Constant Time
An operation with O(1) time complexity takes a constant amount of time regardless of the size of the input data.
This means that the operation's runtime does not increase as the collection grows.

Example in Java Collections:
1.Accessing an element in an ArrayList by index: list.get(index) is O(1) because it directly accesses the element at the given index.
2.Inserting an element in a HashMap: map.put(key, value) is typically O(1) because it calculates the hash code of the key and stores the value in the corresponding bucket.
 */
public class ConstantTimeExample {
    public static void main(String[] args) {
        //Accessing an element in an ArrayList by index
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Godfrey");
        arrayList.add("Okoth");
        arrayList.add("Ouma");

        System.out.println("The element at index 2 is: " +arrayList.get(2));

        //Inserting an element in a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Godfrey", 34);
        hashMap.put("Cyril", 5);
        hashMap.put("Cyrek", 1);
    }
}
