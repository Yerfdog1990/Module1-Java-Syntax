package ModifyString;
/*
Searches for a substring in the current string, starting from the end
 */
public class LastIndex {
    public static void main(String[] args) {
        System.out.println(String.format("The last occurence of the substring \"Ouma\" is %d", searchSubstring("Ouma")));
    }
    public static int searchSubstring(String subtring){
        StringBuilder str = new StringBuilder("Godfrey Okoth Ouma");
        int result = str.lastIndexOf(subtring);
        return result;
    }
}
