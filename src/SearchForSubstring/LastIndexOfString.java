package SearchForSubstring;
/*
int lastIndexOf(String str):
Searches for the string str in the current string, starting from the end.
Returns the index of the first occurrence.

int lastIndexOf(String str, int index):
Searches for the string str in the current string from the end,
skipping the first index characters.
 */
public class LastIndexOfString {
    public static void main(String[] args) {
        String str1 = "Godfrey, Okoth, Ouma";
        String str2 = "Godfrey Okoth Ouma";

        int lastIndexOf1 = str1.lastIndexOf("Ouma");
        int lastIndexOf2 = str2.lastIndexOf("Ouma");

        System.out.println("Last index in string 1: " +lastIndexOf1);
        System.out.println("Last index in string 2: " +lastIndexOf2);

    }
}
