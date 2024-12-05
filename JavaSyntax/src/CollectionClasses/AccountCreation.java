package CollectionClasses;

import java.util.HashMap;
import java.util.Scanner;

public class AccountCreation {
    //Initialize set
    public static HashMap<String, String> loginDetails = new HashMap();
    public static void main(String[] args) {
        //Create a scanner object for adding login details
        Scanner userInput1 = new Scanner(System.in);
        //Prompt user to enter email
        System.out.print("Enter your email: ");
        String userEmail = userInput1.nextLine();
        //Prompt user to enter passowrd
        System.out.print("Enter your user password: ");
        String userPassword = userInput1.nextLine();

        //Call the method to create user's account
        createAccount(userEmail, userPassword);

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
    //Method to create user's account by adding details to Hashmap
    public static boolean createAccount(String email1, String password1) {
        //Check if account associated with that email already exist
        if(loginDetails.containsValue(email1)){
            System.out.println("Account with this email already exists.");
            return false;
        }else{
            //Add username and password to HashMap
            loginDetails.put(email1, password1);
            System.out.println("Sign up successful. Login to your account now.");
            return true;
        }
    }
    //Method to check user login details to allow access
    public  static void checkLoginDetails(String email2, String passwor2){
    //Check if the email and password used to allow access is contained in the set
        if(loginDetails.containsKey(email2) && loginDetails.containsValue(passwor2)){
            System.out.println("Login successful.");
        }else{
            System.out.println("Login unsuccessful. Either email or password is wrong. Try again.");
        }
    }
}
