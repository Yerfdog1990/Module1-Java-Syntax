package ComparatorInterface;

import java.util.Comparator;

// Comparator for Person class to sort by age, then by name
public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2){
        // Compare by age first
        if(p1.getAge() != p2.getAge()){
            return p1.getAge() - p2.getAge();
        }else{ // If ages are the same, compare by name
            return p1.getName().compareTo(p2.getName());
        }
    }
}
