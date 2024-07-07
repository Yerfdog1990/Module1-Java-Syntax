package ModifyString;
/*
Returns the substring defined by the specified interval
 */
public class PartOfString {
    public static void main(String[] args) {
        System.out.println(String.format("The substring is %s", getSubString(4,8)));
    }
    public static String getSubString(int start, int end){
        StringBuilder str = new StringBuilder("Godfrey Okoth Ouma");
        String result = str.substring(start, end);
        return result;
    }
}
