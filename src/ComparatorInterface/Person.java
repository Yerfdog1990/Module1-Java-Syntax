package ComparatorInterface;
/*
Key Features of Comparator Interface
1.Custom Ordering: The Comparator interface allows for custom ordering of objects that do not have a natural ordering or need an alternative ordering.
2.Functional Interface: It is a functional interface, meaning it can be implemented with a lambda expression or method reference.
3.Method: The primary method is compare(T o1, T o2), which compares its two arguments for order.
4.Multiple Comparators: Multiple comparators can be created to provide different ways of sorting the same set of objects.
5.Reusability: Comparators can be reused to sort objects in different collections or data structures.
 */

//Class to define person
public class Person  {
    private String name;
    private int age;

    //Constructor to initialize age and name
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Getter for name
    public String getName() {
        return name;
    }
    //Setter for name
    public void setName(String name) {
        this.name = name;
    }
    //Getter for age
    public int getAge() {
        return age;
    }
    //Setter for age
    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return name + " (" +age +")";
    }
}
