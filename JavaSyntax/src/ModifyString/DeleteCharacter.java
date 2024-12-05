package ModifyString;
/*
Removes the character with the specified index from the string
 */
public class DeleteCharacter {
    public static void main(String[] args) {
        System.out.println(String.format("The corrected name after deleting $ is %s", deleteChar('$')));
    }
    public static String deleteChar(char character){
        StringBuilder str = new StringBuilder("Godfrey O$koth Ouma");
        String result = str.deleteCharAt(9).toString();
        return result;
    }
}
