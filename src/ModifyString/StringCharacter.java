package ModifyString;
/*
Returns the character in the string at the passed index
 */
public class StringCharacter {
    public static void main(String[] args) {
        System.out.println(String.format("The character at index 10 is %s", getCharacterAtIndex(10)));
    }
    public static char getCharacterAtIndex(int index){
        StringBuilder str = new StringBuilder("Godfrey Okoth Ouma");
        char result = str.charAt(index);
        return result;
    }
}
