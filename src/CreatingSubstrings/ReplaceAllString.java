package CreatingSubstrings;
/*
String replaceAll(String regex, String replacement)
Replaces all substrings in the current string that match the regular expression.
 */
public class ReplaceAllString {
    public static void main(String[] args) {
        String str1 = "Godfrey Okoth Ouma";
        String str2 = "Cyril Okoth Okoth";
        String str3 = "Cyrek Odhiambo Okoth";
        System.out.println("Replace the all characters in string 1: " +str1.replaceAll("Godfrey Okoth Ouma","Yerfog"));
        System.out.println("Replace the all characters in string 2: " +str2.replaceAll("Cyril Okoth Okoth", "Junior"));
        System.out.println("Replace the all characters in string 3: " +str3.replaceAll("Cyrek Odhiambo Okoth", "Smallie"));
    }
}
