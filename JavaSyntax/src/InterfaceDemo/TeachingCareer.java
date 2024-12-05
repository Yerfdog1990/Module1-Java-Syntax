package InterfaceDemo;
/*
Here are the key points about interfaces in Java:
#1.Interfaces cannot be declared as private or protected. Only public and default modifiers are allowed.
#2.Every interface in Java is by default abstract.
#3.Every variable of an interface is by default public, static, and final, while every method of an interface is by default public and abstract.
#4.Interface variables must be initialized with some value at the time of declaration.
#5.A class implementing an interface cannot change the value of variables declared in the interface since they are declared as final by default.
#6.A class implementing an interface must implement all the methods of that interface; otherwise, the class must be declared as abstract.
#7.While implementing the method of an interface in a class, its visibility (access modifier) cannot be reduced.
#8.An interface can extend another interface, but it cannot implement it. Only classes can implement interfaces.
#9.A class can implement any number of interfaces.
#10.If a class implements two interfaces which have the same method name, then the implementation of the same name method once is enough.
#11.A class cannot implement two interfaces that have methods with the same name but different return types.
#12.Variable name conflicts can be resolved by using the interface name.
#13.The object of an implementing class can also be assigned to an interface type. Using such an object, you can only call the methods declared inside the interface.
#14.A class can extend another class and implement an interface as well.
 */
public interface TeachingCareer {
    String profession = "Physics/Mathematics Teacher";

    void aboutSchool();

}
