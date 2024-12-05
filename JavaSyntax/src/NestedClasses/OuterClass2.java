package NestedClasses;

public class OuterClass2 {
    public static String name = "Godfrey";
    public int age = 34;
    //Non-static nested class
    public class  NonStaticNestedClass {
        void isNonStatic() {
            //Can access both the static and non-static members of the outer class directly
            System.out.println(String.format("My name is %s.", name));
            System.out.println(String.format("My age is %d years.", age));
        }
    }
    //Main method
    public static void main(String[] args) {
        //Instantiate outer class
        OuterClass2 outerObj = new OuterClass2();
        //Instantiate inner class
        OuterClass2.NonStaticNestedClass innerObj = outerObj.new NonStaticNestedClass();
        innerObj.isNonStatic();

        //Accessing the static nested class from outside the OuterClass1 context.
        OuterClass1.StaticNestestClass obj = new OuterClass1.StaticNestestClass();

        //Accessing the static method in the static nested class from the OuterClass1 context
        OuterClass1.StaticNestestClass.isStatic();

        //Accessing the static variable in the static nested class from the OuterClass1 context
        System.out.println(String.format("I am from %s.", OuterClass1.StaticNestestClass.country));

    }
}
