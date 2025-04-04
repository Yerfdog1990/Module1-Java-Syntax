package CollectionClasses.iteratecollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveExample {
    public static void main(String[] args) {
    List<Integer> numberList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Iterator<Integer> iterator = numberList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("List of odd numbers: " +numberList);
    }
}
