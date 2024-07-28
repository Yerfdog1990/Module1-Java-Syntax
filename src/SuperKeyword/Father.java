package SuperKeyword;
/*
Example 2 - Access the parent’s constructors in child class
Explicitly calling super() allows you to access both the default or parameterized constructor of the parent class in the child class.
Here’s an example of the parameterized constructor.
The parent i-e Father class’ constructor is called (using super()) in the child i-e Child class to set the attributes.
Run the program below to test the output for yourself.
 */
public class Father {
    String fatherName;

    //Parameterized Father class constructor
    public Father(String fatherName) {
        this.fatherName = fatherName;
    }
}
class Child extends Father{
    String myName;
    int age;
    //Parameterized Child class constructor
    public Child(String fatherName, String myName, int age) {
        super(fatherName);
        this.myName = myName;
        this.age = age;
    }
    //Main method
    public static void main(String[] args) {
        Child myProfile = new Child("Disterius", "Godfrey", 34);
        System.out.println("My name is " +myProfile.myName+".");
        System.out.println("My father's name is " +myProfile.fatherName+".");
        System.out.println("I am " +myProfile.age+ "years old.");
    }
}
