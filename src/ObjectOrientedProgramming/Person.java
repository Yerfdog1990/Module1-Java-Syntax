package ObjectOrientedProgramming;
/*
 Write a Java program to create a class called "Person" with a name and age attribute.
 Create two instances of the "Person" class,
 set their attributes using the constructor, and
 print their name and age.
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public void display(){
        System.out.println(String.format("My name is %s and I am %d years old", name, age));
    }
    public static void main(String[] args) {
        Person person = new Person("Godfrey", 34);
        person.display();


    }
}
