package CreatingSubstrings;
/*
String substring(int beginIndex, int endIndex):
Returns the substring specified by the index range beginIndex..endIndex.
 */
public class ReturnSubstring {
    public static void main(String[] args) {
        String str1 = "Godfrey";
        String str2 = "Okoth";
        String str3 = "Ouma";
        System.out.println("First three characters from the string \"Godfrey\": " +str1.substring(0,3));
        System.out.println("Last three characters from the string \"Okoth\": " +str2.substring(2,5));
        System.out.println("Last three characters from the string \"Ouma\": " +str3.substring(1,4));
    }
}
