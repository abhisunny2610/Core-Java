// ... Write a program to calculate the sum of the digits of a 3-digit number... //

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        int sum = 0;

        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        System.out.println("Sum: " + sum);
        scn.close();
    }
}
