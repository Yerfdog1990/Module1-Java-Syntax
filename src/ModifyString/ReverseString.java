package ModifyString;
/*
Reverses the current string.
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(String.format("The reversed string is %s", reverseString("Godfrey Okoth Ouma")));
    }
    public static String reverseString(String name){
        StringBuilder str = new StringBuilder(name);
        String result = str.reverse().toString();
        return result;
    }
}
