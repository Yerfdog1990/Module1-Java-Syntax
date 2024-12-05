package Two_Dimensional_Arrays;
//Your first database
//****************************************************************************
//In the Solution class, you have a two-dimensional String array (the array field),
// which contains student data. In each row, the first element is the student ID,
// the second is the student's last name, and the third is his or her first name.
//
//Example:
// 123 Ikan Brad
//1425 Pendleton Maria
//387 Brad Andy
//98 Bradford Maria
//
//You need to implement the ability to search for student(s) by any field and displaying
// the search results on the screen as "<identifier> <last name> <first name>"
// (see the example output). That is, if the user enters a string from the keyboard,
// you need to display the row of the array if at least one element of the row exactly
// matches the entered search string.

//Examples:
//Input: Brad
//Output: 123 Ikan Brad
//387 Brad Andy
//Input: 1425
//Output: 1425 Pendleton Victor
//Input: Maria
//Output: 1425 Pendleton Maria
//       98 Bradford Maria
//Note: when your solution is tested, the array will be filled with different data.
//
//Requirements:
//        •	The program needs to read a string from the keyboard.
//        •	You need to implement the search function and display the results on the screen
//        in accordance with the task conditions.
public class challenge4_First_Database {
    public static String[][] array = new String[][]{{"123", "Ikan", "Brad"},
                                                    {"1425", "Pendleton", "Maria"},
                                                    {"37", "Brad", "Andy"},
                                                    {"98", "Bradford", "Maria"},
                                                    {"6285", "Prost", "Sandra"},
                                                    {"8", "Clover", "Ellen"},
                                                    {"754", "Colton", "Isaac"}};

    public static void main(String[] args) {
        //write your code here

    }
}
