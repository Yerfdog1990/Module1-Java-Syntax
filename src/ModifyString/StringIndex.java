package ModifyString;
/*
Searches for a substring in the current string
 */
public class StringIndex {
    public static void main(String[] args) {
        System.out.println(String.format("The index of the substring \"Okoth\" is %s", searchSubstring("Okoth")));
    }
    public static int searchSubstring(String subtring){
        StringBuilder str = new StringBuilder("Godfrey Okoth Ouma");
        int result = str.indexOf(subtring);
        return result;
    }
}
