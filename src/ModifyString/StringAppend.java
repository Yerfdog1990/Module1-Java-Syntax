package ModifyString;
/*
Converts the passed object to a string and appends it to the current string
 */
public class StringAppend {
    public static void main(String[] args) {

        System.out.println(String.format("The new string after modification is: %s", modifyString("Godfrey")));
    }
    public static String modifyString(String originalString){
        StringBuilder str = new StringBuilder(originalString);
        String modifiedString = str.append(" Okoth Ouma").toString();
        return modifiedString;
    }
}
