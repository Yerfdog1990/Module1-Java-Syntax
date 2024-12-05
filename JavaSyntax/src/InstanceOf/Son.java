package InstanceOf;
/*
The instanceof operator in Java is used to test whether an object is an instance of a specific class or
implements a specific interface.
It returns true if the object is an instance of the specified type, and false otherwise.

Key Points about instanceof:
1.Basic Usage: It checks if the left-hand side object is an instance of the right-hand side class/interface.
2.Compile-Time Check: The right-hand side must be a class or interface that the left-hand side could possibly
be an instance of, otherwise, the code will not compile.
3.Null Check: If the object being tested is null, instanceof will always return false.
Inheritance: It takes into account inheritance, so an object will return true for instanceof checks against
4.any of its superclasses or interfaces.
 */
public class Son {

}
class Cyril extends Son{

}
class Main{
    public static void main(String[] args) {
        Son son = new Son();
        Cyril cyril = new Cyril();
        Son cyrek = new Son();

        System.out.println("son is an instance of Son: " +(son instanceof Son));
        System.out.println("cyril is an instance of Cyril: " +(cyril instanceof Cyril));
        System.out.println("Cyril is an instance of son: " +(cyril instanceof Son));
        System.out.println("Son is an instance of Cyril: " +(son instanceof Cyril));
        System.out.println("Cyrek is an instance of son: " +(cyrek instanceof Son));
        System.out.println("Cyrek is an instance of cyril: " +(cyrek instanceof Cyril));
    }
}


