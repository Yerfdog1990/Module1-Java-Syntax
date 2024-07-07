package ModifyString;
/*
Removes characters within the specified interval from the string
 */
public class DeleteString {
    public static void main(String[] args) {
        System.out.println(String.format("The corrected name after deleting \"Okoth\" is %s", deleteString("Okoth")));
    }
    public static String deleteString(String remove){
        StringBuilder str = new StringBuilder("Godfrey Okoth Ouma");
        String result = str.delete(7,13).toString();
        return result;
    }
}
