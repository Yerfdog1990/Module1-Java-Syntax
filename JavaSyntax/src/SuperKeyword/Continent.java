package SuperKeyword;
/*
What is the super keyword in Java?
Super is a keyword that can be used to invoke overridden methods of the superclass, as well as to refer to hidden fields of the superclass.
Why and when to use the super keyword?
The Java super keyword has three explicit uses.
    1.Access the data members of the parent class when the child class also has data members with the same name.
    2.Call the default or parameterized constructors of the parent class in the child class.
    3.Call the parent class methods in the child class if the child has overridden methods.
 */
//Example 1 - Access parent’s data members
public class Continent {
    String name = "Africa";
}
class Country extends Continent{
    String name = "Kenya";

    public void printMyCountry(){
        System.out.println(name);
    }
    public void printMyContinent(){
        // use super keyword to access
        // parent's data member / attribute
        System.out.println(super.name);
    }
    //Main method
    public static void main(String[] args) {
        Country myOrigin = new Country();
        System.out.print("My country is ");
        myOrigin.printMyCountry();
        // printing the parent's name
        // using the super keyword
        System.out.print("My continent is ");
        myOrigin.printMyContinent();
    }
}
