package CreatingSubstrings;
/*
String trim()
Removes all spaces at the beginning and end of a string
 */
public class TrimString {
    public static void main(String[] args) {
        String str1 = " Godfrey Okoth Ouma ";
        String str2 = " Cyril Okoth Okoth ";
        String str3 = " Cyrek Odhiambo Okoth ";
        System.out.println("Clear white spaces in string 1: " +str1.trim());
        System.out.println("Clear white spaces in string 2: " +str2.trim());
        System.out.println("Clear white spaces in string 3: " +str3.trim());
    }
}
