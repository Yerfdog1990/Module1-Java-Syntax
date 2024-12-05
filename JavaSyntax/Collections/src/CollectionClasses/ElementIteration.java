package CollectionClasses;


import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

public class ElementIteration {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(asList("Godfrey,Okoth,Ouma".split(",")));
        System.out.println(list);
        //Iterate over the elements using while loop
        System.out.println("Iterating over the elements:");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //Iterate over the elements using for each loop
        System.out.println("Iterating over the elements:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //Iterate over the elements using enhanced loop
        System.out.println("Iterating over the elements:");
        for(String str : list){
            System.out.println(str);
        }
    }
}
