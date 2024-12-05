package CollectionClasses;
/*
Program to verify passport number at immigration office using Hashset
To implement a program that verifies identity at an immigration office to ensure no duplicate passports are used, we can utilize a HashSet in Java.
This data structure will help us track and ensure that each passport number is unique.
When a new passport number is added to the set, if it already exists, we will notify that it's a duplicate.
 */
import java.util.HashSet;
import java.util.Scanner;

public class ImmigrationOffice {
    //Initialize HashSet to store unique passport numbers
    private static HashSet<String> passportSet = new HashSet<>();
    //Method to check and add passport number
    public static boolean verifyPassport(String passportNumber){
        //Attempt to add passport number to the HashSet
        return passportSet.add(passportNumber);
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // Welcome message
        System.out.println("Welcome to the Immigration Office.");
        while(true){
            // Prompt user to enter passport number
            System.out.print("Please enter passport number to verify (or type 'exit' to quit): ");
            String passportNumber = userInput.nextLine();
            //Exit condition
            if(passportNumber.equalsIgnoreCase("exit")){
                break;
            }
            //Verify passport number
            if(verifyPassport(passportNumber)){
                System.out.println(String.format("Passport number \"%s\" is verified and added.", passportNumber));
            }else{
                System.out.println(String.format("Duplicate passport number \"%s\" has been detected.", passportNumber));
            }
        }
        //Close scanner
        userInput.close();
        //Print the list of passport numbers verified
        System.out.println("List of passport numbers verified:");
        for(String s : passportSet){
            System.out.println(s);
        }
        //Goodbye message
        System.out.println("Immigration office closed. Have a nice day.");
    }
}
