package ComparingStrings;
/*
Compares strings lexicographically while ignoring case. Returns 0 if the strings are equal.
The return value is negative if the current string is less than the string parameter.
The return value is greater than if the current string is greater than the string parameter.
 */
public class CompareToIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Godfrey";
        String str2 = "GODFREY";
        String str3 = "Godfrey";
        System.out.println("Str1 is equal to str2: " +str1.compareToIgnoreCase(str2));
        System.out.println("Str1 is equal to str2: " +str1.compareToIgnoreCase(str3));
        System.out.println("Str1 is equal to str2: " +str2.compareToIgnoreCase(str1));
    }
}
