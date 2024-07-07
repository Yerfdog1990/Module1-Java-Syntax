package ObjectOrientedProgramming;
/*
Runtime polymorphism is achieved through method overriding –
a subclass has a method with the same name and same set of parameters as that of its superclass method.
However, it provides its own implementation of the method.
 */
public class RuntimePolymorphism extends RuntimeSuperClass{
    private String name, country;

    //Constructor
    public RuntimePolymorphism() {

    }
    //Child class method with same name, type, and number of parameter as the super class method
    @Override
    public void isKenyan(String name, String country){
        System.out.println("I am called " +name+ ", and I am from " +country);
    }
    //Main method
    public static void main(String[] args) {
        RuntimeSuperClass Obj = new RuntimePolymorphism();
        Obj.isKenyan("Godfrey Ouma", "Kenya");
    }
}
