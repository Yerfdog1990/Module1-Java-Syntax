package ForEachLoop;
/*
In Java, the for-each loop is used to iterate through elements of arrays and collections (like ArrayList).
It is also known as the enhanced for loop.
for-each Loop Syntax
The syntax of the Java for-each loop is:
for(dataType item : array) {
    ...
}
 */
public class EnhancedLoop {
    public static String[] array;
    public static void main(String[] args) {
        String[] array = {"Godfrey", "Okoth", "Ouma"};
        for(String name :array){
            System.out.println(name);
        }

    }
}
