package ModifyString;
/*
In a given array of Strings, find the longest common prefix.
 */
public class Challenge1_LongestCommonString {
    public static void main(String[] args) {
        String[] array1 = {"Belief", "Below", "Belittle", "Believe", "Belong"};
        System.out.println(String.format("The longest common prefix: %s", findLongestCommonPrefix(array1)));
    }
    public static String findLongestCommonPrefix(String[] str){
        if(str == null || str.length == 0){
            return "";
        }
        String  prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
