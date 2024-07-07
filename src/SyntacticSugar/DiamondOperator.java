package SyntacticSugar;

import java.util.ArrayList;

public class DiamondOperator {
    public static void main(String[] args) {
        //Indictaing both type of arraylist and the element
        ArrayList<String> name = new ArrayList<String>();
        name.add("Godfrey");
        name.add("Okoth");
        name.add("Ouma");
        System.out.println("My name is " +name.get(0)+ " " +name.get(1)+ " " +name.get(2)+ ".");

        //Using diamond operator: Indicating the arraylist type but not the element type.
        ArrayList<String> country = new ArrayList<>();
        country.add("Kenya");
        country.add("Burundi");
        country.add("Thailand");
        System.out.println("I have worked in " +country.get(0)+ ", " +country.get(1)+ ", and " +country.get(2)+ ".");
    }
}
