package ComparingStrings;
/*
Checks whether the current string ends with the string suffix
 */
public class BooleanEndsWith {
    public static void main(String[] args) {
        String str1 = "Godfrey Okoth Ouma";
        String str2 = "Cyril Okoth Okoth";
        String str3 = "Cyrek Okoth Ouma";
        System.out.println("Str1 starts with: " +str1.endsWith("Ouma"));
        System.out.println("Str2 starts with: " +str2.endsWith("Okoth"));
        System.out.println("Str3 starts with: " +str3.endsWith("Cyrek"));
    }
}
