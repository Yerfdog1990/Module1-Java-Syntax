package ComparingStrings;
/*
Compares strings, ignoring the case of letters (ignores whether they are uppercase or lowercase)
 */
public class BooleanEqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Godfrey";
        String str2 = "GODFREY";
        String str3 = "godfrey";
        System.out.println("Str1 is equal to str2: " +str1.equalsIgnoreCase(str2));
        System.out.println("Str1 is equal to str2: " +str1.equalsIgnoreCase(str3));
        System.out.println("Str1 is equal to str2: " +str2.equalsIgnoreCase(str1));
    }
}
