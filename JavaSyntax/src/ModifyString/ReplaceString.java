package ModifyString;
/*
Replaces the part of the string specified by the start..end interval with the passed string
 */
public class ReplaceString {
    public static void main(String[] args) {
        System.out.println(String.format("The new name after replacement is %s", replaceString("Godfrey")));
    }
    public static String replaceString(String name){
        StringBuilder str = new StringBuilder("Yerfdog Okoth Ouma");
        String replaceWith = str.replace(0,7, name).toString();
        return replaceWith;
    }
}
