/*  Write a program to enter the numbers till the user wants, the number can be positive,
    negative or zero. Calculate the sum of numbers until a negative number is encountered. I
    f the input is a negative number, current sum is discarded and print -1. */

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int sum = 0;
        System.out.print("Enter the numbers: ");

        while (scn.hasNextInt()) { // check if input exists or not

            int num = scn.nextInt();
            if (num >= 0) { // if input is positive or zero add it to the current sum
                sum += num;
            } else {
                sum = -1;// input is negative so change sum to -1 and break out of the loop
                break;
            }
        }

        System.out.print(sum);
        scn.close();
    }
}
