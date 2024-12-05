package StaticMethod;

public class Child extends Parent {
    // Overriding non-static method
    @Override
    public void isInstanceMethod(){
        System.out.println("This is child's instance method");
    }
    //Hidng static method
    public static void isStaticMethod(){
        System.out.println("This is child's static method");
    }
}
