package NestedClasses;

//Outer class
public class OuterClass1 {
    public static String name = "Godfrey";
    public int age = 34;

    //Static nested class
    static class StaticNestestClass{
        public static String country = "Kenya";
        static void isStatic(){
            //Can access static member of the outer class directly
            System.out.println(String.format("My name is %s", name));
            //Cannot access non-static member of the outer class directly
            //System.out.println(String.format("My age is %d years", age));
        }
    }

    public static void main(String[] args) {
        // Create an instance of the StaticNestestClass.
        StaticNestestClass obj = new StaticNestestClass();
        // Call the instance method isStatic() on the obj instance.
        obj.isStatic();
        // Call the static method isStatic() directly on the class StaticNestestClass.
        // Call the static method isStatic() directly on the class StaticNestestClass.
        StaticNestestClass.isStatic();

    }
}
