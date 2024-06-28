package AbstractionDemo;
/*
Abstract classes in Java have several key features that make them an important part of object-oriented programming:
#1:Cannot be Instantiated: You cannot create an instance of an abstract class directly; instead, create instances of concrete subclasses that extend it.
#2:Abstract Methods: Abstract classes can contain abstract methods, which are methods without an implementation. Subclasses must implement all abstract methods.
#3:Concrete Methods: Abstract classes can also contain concrete methods with a body, providing default behavior that can be shared among subclasses.
#4:Constructors: Abstract classes can have constructors to initialize fields and provide a base state for subclasses.
#5:Fields and Properties: Abstract classes can have fields and properties to store shared state or data among subclasses.
#6:Inheritance: Abstract classes are meant to be inherited from, with subclasses extending the abstract class to inherit its fields and methods.
#7:Cannot be Final: Abstract classes cannot be marked as final, as this would prevent them from being subclassed.
#8:Polymorphism: Abstract classes support polymorphism, allowing you to use an abstract class type to refer to objects of its concrete subclasses, enabling dynamic method dispatch and runtime polymorphism.
#9:Can Implement Interfaces: Abstract classes can implement interfaces, requiring subclasses to implement all abstract methods defined in those interfaces.
#10:Partial Implementation: Abstract classes can provide a partial implementation of a set of methods, with remaining methods left to be implemented by subclasses. This is useful for defining a template for related classes.
 */
public abstract class Vehicle {
    private String model = "Mercedes Benz GL 300d";
    private int YOM;
    private  String color;

    public Vehicle() {
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public int getYOM() {

        return YOM;
    }

    public void setYOM(int YOM) {
        this.YOM = YOM;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Abstract methods cannot have body to implement them
    public abstract void dreamCar();
    public abstract void startEngine();
    public abstract void stopEngine();
}
