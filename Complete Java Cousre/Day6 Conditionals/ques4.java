// ...Write a program to print positive number entered by the user, if user enters a negative number, it is skipped... //

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("enter the number: ");
        int num = scn.nextInt();

        if (num < 0) {
            System.out.println("You enter a negative number and it is skipped.");
        } else {
            System.out.println("You entered a postive number.");
        }
        scn.close();
    }
}
