package CreationalPattern;
/*
Description: Restricts the creation of a class to a single instance, and provides access to that single instance.
The class's constructor is private.
The getInstance() method creates only one instance of the class.
 */
public class Singleton {
    private static Singleton instance = null;

    public Singleton() {
    }
    public static Singleton getInstane() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public void setUp(){
        System.out.println("Set up!");
    }
}

class SingletonTest{
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstane();
        singleton.setUp();
    }
}
