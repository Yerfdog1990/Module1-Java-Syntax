package StaticMethod;
/*
Non-Static Methods:
Must be called on an instance of the class.
Attempting to call them without creating an instance will result in a compilation error.
Static Methods:
Can be called without creating an instance because they belong to the class itself.
This means that they can be called from both static methods and ordinary ones.
There are no restrictions here.
As a result, static methods cannot access ordinary variables of a class.
The situation with calls to static variables is the same as with calls to static methods.
Static variables can be accessed from anywhere in the program.
That means that you can access them from static and ordinary methods.
 */
public class Example {
    private int x; //non-static variable
    private static int y; //static variable
    //Non-static method
    public void isNonStaticMethod(){
        System.out.println("This is a non-static method");
        //Calling static methods from ordinary method works perfectly
        isStaticMethod();
        //We use the keyword "this" when calling the static method with instance from ordinary method
        isStaticMethodWithInstance(this);
        //Accessing both static and non-static variable
        x = 30;
        y = 50;
    }
    //Static method without instance
    public static void isStaticMethod(){
        System.out.println("This is a static method");
        // Trying to use 'this' inside a static method will cause an error
        // System.out.println(this); // This would cause a compilation error

        // Trying to call a non-static method inside a static method will cause an error
        // nonStaticMethod(); // This would cause a compilation error

        //accessing static variable
        y = 50;
        //access non-static variable causes a compilation error
        //x = 30
    }
    //Static method with instance
    public static void isStaticMethodWithInstance(Example instance){
        System.out.println("This is a static method with an instance as the parameter");
        instance.isNonStaticMethod(); //This works because we are using an instance
    }
    //Main method
    public static void main(String[] args) {
        //Creating an instance for the non-static method
        Example example = new Example();
        //Calling non-static method using the instance
        example.isNonStaticMethod();
        //Calling static method using the class name
        Example.isStaticMethod();
        //Call static method without instance
        isStaticMethod();
        //Calling static method with instance parameter
        isStaticMethodWithInstance(example);

        Parent parentRef = new Parent();
        // Calls the overridden method in Child
        parentRef.isInstanceMethod();
        // Calls the static method in Parent
        Parent.isStaticMethod();
        //Calling a static method on a class.
        Example.isStaticMethod();
    }
}
