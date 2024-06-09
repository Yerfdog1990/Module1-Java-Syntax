package ComparingStrings;
/*
Strings are considered equal if all of their characters match.
 */
public class BooleanEquals {
    public static void main(String[] args) {
        String str1 = "Godfrey";
        String str2 = "Godfrey";
        String str3 = "godfrey";
        System.out.println("Str1 is equal to str2: " +str1.equals(str2));
        System.out.println("Str1 is equal to str2: " +str1.equals(str3));
        System.out.println("Str1 is equal to str2: " +str2.equals(str1));
    }
}
