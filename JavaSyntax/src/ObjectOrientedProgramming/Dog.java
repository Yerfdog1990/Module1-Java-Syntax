package ObjectOrientedProgramming;
/*
Write a Java program to create a class called "Dog" with a name and breed attribute.
Create two instances of the "Dog" class,
set their attributes using the constructor and
modify the attributes using the setter methods and print the updated values.
 */
public class Dog extends Animal{
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = "Ford";
        this.breed = "German Shephard";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void display() {
        System.out.println(String.format("The dog\'s name is %s and its breed is %s.", name, breed));
    }

}
