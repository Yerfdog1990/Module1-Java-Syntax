package SearchForSubstring;
/*
Checks whether the current string matches a pattern specified by a regular expression.
 */
public class StringMatches {
    public static void main(String[] args) {
        String str1 = "Godfrey, Okoth, Ouma";
        String str2 = "Cyrek Odhiambo Okoth";

        boolean stringMatch1 = str1.matches(".*Ouma.*");
        boolean stringMatch2 = str2.matches(".*Ouma.*");

        System.out.println("String 1 matches \"Ouma\": " +stringMatch1);
        System.out.println("String 2 matches \"Ouma\": " + stringMatch2);
    }
}
