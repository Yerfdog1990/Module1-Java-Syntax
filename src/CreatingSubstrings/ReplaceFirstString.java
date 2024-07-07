package CreatingSubstrings;
/*
String replaceFirst(String regex, String replacement)
Replaces the first substring, specified by a regular expression, in the current string.
 */
public class ReplaceFirstString {
    public static void main(String[] args) {
        String str1 = "Godfrey Okoth Ouma";
        String str2 = "Cyril Okoth Okoth";
        String str3 = "Cyrek Odhiambo Okoth";
        System.out.println("Replace the string \"Godfrey\" with \"Yerfdog\": " +str1.replaceFirst("Godfrey","Yerfdog"));
        System.out.println("Replace the string \"Cyril\" with \"Rilcy\": " +str2.replaceFirst("Cyril", "Rilcy"));
        System.out.println("Replace the string \"Cyrek\" with \"Keryc\": " +str3.replace("Cyrek", "Keryc"));
    }
}
