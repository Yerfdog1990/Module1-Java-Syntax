package CreatingSubstrings;
/*
String replace(char oldChar, char newChar)
Returns a new string: replaces the character oldChar with the character newChar
 */
public class ReplaceString {
    public static void main(String[] args) {
        String str1 = "Godfrey";
        String str2 = "Okoth";
        String str3 = "Ouma";
        System.out.println("Replace the string \"Godfrey\" with \"Yerfdog\": " +str1.replace("Godfrey","Yerfdog"));
        System.out.println("Replace the string \"Okoth\" with \"Thoko\": " +str2.replace("Okoth", "Thoko"));
        System.out.println("Replace the string \"Ouma\" with \"Amuo\": " +str3.replace("Ouma", "Amuo"));
    }
}
