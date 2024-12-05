package InstanceOf;
/*
This code demonstrates the use of the instanceof operator to determine the type of objects
at runtime and how to safely cast them to their respective types to perform type-specific operations.
 */
public class TypeSpecificOperations {
    static Object[] objects = {34, 1.5, "Godfrey"};

    public static void main(String[] args) {
        for (int i = 0; i < objects.length; i++) {
            if(objects[i] instanceof String){
                String name = (String) objects[i];
                System.out.println("My name is " +name);
            }
        }
        for (int i = 0; i < objects.length; i++) {
            if(objects[i] instanceof Integer){
                Integer age = (Integer) objects[i];
                System.out.println("I am " +age+ " years old.");
            }
        }
        for (int i = 0; i < objects.length; i++) {
            if(objects[i] instanceof Double){
                Double height = (Double) objects[i];
                System.out.println("My height is " +height+ " metres.");
            }
        }
    }
}

