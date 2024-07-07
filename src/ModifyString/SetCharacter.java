package ModifyString;
/*
Changes the character at the specified index to the passed character
 */
public class SetCharacter {
    public static void main(String[] args) {
        System.out.println(String.format("The new name after replacement is %s", setCharacter(0, 'G')));
    }

    public static String setCharacter(int index, char character) {
        StringBuilder str = new StringBuilder("Yodfrey Okoth Ouma");
        str.setCharAt(index, character);
        String result = str.toString();
        return result;
    }
}
