// ..Write a Java method to check whether a year (integer) entered by the user is a leap year or not... //

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = scn.nextInt();
        System.out.println(leapYear(year));
        scn.close();
    }

    public static boolean leapYear(int year) {
        boolean a = (year % 4 == 0);
        boolean b = (year % 100 != 0);
        boolean c = ((year % 100 == 0) && (year % 400 == 0));
        return a && (b || c);
    }
}
