package ModifyString;

public class StringLength {
    public static void main(String[] args) {
        System.out.println(String.format("The string length is %d", getLength("Godfrey Okoth Ouma")));
    }
    public static int getLength(String name){
        StringBuilder str = new StringBuilder(name);
        int result = str.length();
        return result;
    }
}
