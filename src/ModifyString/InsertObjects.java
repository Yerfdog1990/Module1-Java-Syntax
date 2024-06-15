package ModifyString;
/*
Converts the passed object to a string and inserts it into the current string
 */
public class InsertObjects {
    public static void main(String[] args) {
        System.out.println(toInserObject("$"));
    }
    public static String toInserObject(String object){
        StringBuilder str = new StringBuilder("My salary is 2000");
        String insertObject = str.insert(13, object).toString();
        return insertObject;
    }
}
