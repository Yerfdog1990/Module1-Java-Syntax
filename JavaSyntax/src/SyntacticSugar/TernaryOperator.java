package SyntacticSugar;

public class TernaryOperator {
    public static void main(String[] args) {
        int age = 24;

        //if-else condition
        if(age >= 18){
            System.out.println("You are eligible voter.");
        }else{
            System.out.println("You are not eligible to vote.");
        }
        //Ternary operator
        String eligibility = (age >= 18)? "You are eligible voter." : "You are not eligible to vote.";
        System.out.println(eligibility);
    }
}
