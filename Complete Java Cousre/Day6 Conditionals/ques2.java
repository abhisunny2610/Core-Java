// ...Write a program to print negative value of a number entered by the user... //

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int x = scn.nextInt();

        if (x > 0) {
            x = x * -1;
        }

        System.out.println("Negative Value: " + x);
        scn.close();
    }
}
