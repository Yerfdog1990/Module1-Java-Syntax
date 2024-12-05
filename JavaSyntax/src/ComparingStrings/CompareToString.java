package ComparingStrings;
/*
Compares strings lexicographically. Returns 0 if the strings are equal.
The return value is less than zero if the current string is less than the string parameter.
The return value is greater than if the current string is greater than the string parameter.
 */
public class CompareToString {
    public static void main(String[] args) {
        String str1 = "Godfrey";
        String str2 = "GODFREY";
        String str3 = "Godfrey";
        System.out.println("Str1 is equal to str2: " +str1.compareTo(str2));
        System.out.println("Str1 is equal to str2: " +str1.compareTo(str3));
        System.out.println("Str1 is equal to str2: " +str2.compareTo(str1));
    }
}
