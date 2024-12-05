package CreationalPattern;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Description: Used when we have a superclass with multiple subclasses and we need to return a subclass based on input.

The class doesn't know what type of object it should create.

Objects are created based on the inputs.
 */
public class Factory {
    public OS getCurrentOS(String inputOS){
        OS os = null;
        if(inputOS.equalsIgnoreCase("Windows")){
            os = new windowsOS();
        } else if (inputOS.equalsIgnoreCase("Linux")) {
            os = new linuxOS();
        }else if (inputOS.equalsIgnoreCase("Mac")){
            os = new macOS();
        }
        return os;
    }
}
interface OS{
    void getOS();
}
class windowsOS implements OS{

    @Override
    public void getOS() {
        System.out.println("Uses windows OS.");
    }
}
class linuxOS implements OS{

    @Override
    public void getOS() {
        System.out.println("Uses linux OS.");
    }
}
class macOS implements OS{

    @Override
    public void getOS() {
        System.out.println("Uses Mac OS.");
    }
}
class FactoryTest{
    public static void main(String[] args) {
        Factory factory = new Factory();
        try(Scanner userInput = new Scanner(System.in)) {
            System.out.print("Enter your OS: ");
            String userOS = userInput.nextLine();
            OS os = factory.getCurrentOS(userOS);
            os.getOS();
        }catch (NullPointerException e){
            System.out.println("Sorry! Only \"windows OS\", \"Mac OS\", or \"Linux OS\" is accepted. Please try again.");
        }
    }
}