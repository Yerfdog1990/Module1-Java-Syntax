package CollectionClasses;

import java.util.HashSet;
import java.util.Scanner;

public class PasswordChecker {
    //Initialize set
    public static HashSet<String> loginDetails = new HashSet<>();
    public static void main(String[] args) {
        //Create a scanner object for adding login details
        Scanner userInput1 = new Scanner(System.in);
        //Prompt user to enter email
        System.out.print("Enter your email: ");
        String userEmail = userInput1.nextLine();
        //Prompt user to enter passowrd
        System.out.print("Enter your user password: ");
        String userPassword = userInput1.nextLine();

        //Call the method to add user's account creation details to set
        addLoginDetails(userEmail, userPassword);

        //Create scanner object for access the account
        Scanner userInput2 = new Scanner(System.in);
        //Prompt user to enter email
        System.out.print("Email: ");
        String emailCheck = userInput2.nextLine();
        //Prompt user to enter password
        System.out.print("Password: ");
        String passwordCheck = userInput2.nextLine();
        //Call method to check user login details to allow access
        checkLoginDetails(emailCheck, passwordCheck);
    }
    //Method to add user's account creation details to set
    public static void addLoginDetails(String email1, String password1) {
        //Add username
        loginDetails.add(email1);
        //Add password
        loginDetails.add(password1);
        System.out.println("Sign up successful. Login to your account now.");
    }
    //Method to check user login details to allow access
    public  static void checkLoginDetails(String email2, String passwor2){
    //Check if the email and password used to allow access is contained in the set
        if(loginDetails.contains(email2) && loginDetails.contains(passwor2)){
            System.out.println("Login successful.");
        }else{
            System.out.println("Login unsuccessful. Either email or password is wrong. Try again.");
        }
    }
}
