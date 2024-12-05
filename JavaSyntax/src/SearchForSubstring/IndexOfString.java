package SearchForSubstring;
/*
int indexOf(String str):
Searches for the string str in the current string.
Returns the index of the first character of the first occurrence.

int indexOf(String str, int index):
Searches for the string str in the current string, skipping the first index characters.
Returns the index of the occurrence.
 */
public class IndexOfString {
    public static void main(String[] args) {
        String str1 = "Godfrey";
        String str2 = "Godfrey Okoth Ouma";

        System.out.println("Index of character \"G\": " +str1.indexOf('G'));
        System.out.println("Index of character \"0\": " +str1.indexOf('o'));
        System.out.println("Index of character \"m\": " +str2.indexOf('m',14,17));
        System.out.println("Index of the string \"Ouma\": " +str2.indexOf("Ouma"));
    }
}
