package ComparingStrings;
/*
Compares parts of strings
 */
public class BooleanRegionMatches {
    public static void main(String[] args) {
        String str1 = "Godfrey Okoth Ouma";
        String str2 = "Okoth";
        System.out.println(str1.regionMatches(8, str2, 0, 5));

    }
}
