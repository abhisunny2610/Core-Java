/* Write a Java method to display the middle character of a string.

Note: a) If the length of the string is even there will be two middle characters.

            b) If the length of the string is odd there will be one middle character*/

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = scn.nextLine();
        System.out.println(middle(s));
        scn.close();
    }

    public static String middle(String s) {
        if (s.length() % 2 == 0) {
            return s.substring(s.length() / 2, s.length() / 2 + 2);
        } else {
            return s.substring(s.length() / 2, s.length() / 2 + 1);
        }
    }
}
