package ComparableInterface;

// Defining the Person class which implements the Comparable interface
public class Person implements Comparable<Person>{
    private String name; // Private field for the name of the person
    private int age; // Private field for the age of the person

    // Constructor to initialize the name and age of the person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter method for name
    public String getName() {
        return name;
    }
    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
    // Getter method for age
    public int getAge() {
        return age;
    }
    // Setter method for name
    public void setAge(int age) {
        this.age = age;
    }
    // Overriding the compareTo method to define the natural ordering
    @Override
    public int compareTo(Person other){
        // Compare by age first
        if(this.age != other.age){
            return this.age - other.age;
        }else{// If ages are the same, compare by name
            return this.name.compareTo(other.name);
        }
    }
    // Overriding the toString method to provide a string representation of the Person object
    @Override
    public String toString(){
        return name + " (" +age+ ")";
    }
}
