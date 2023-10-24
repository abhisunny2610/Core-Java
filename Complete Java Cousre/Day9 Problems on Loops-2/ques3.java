// ... Write a program to calculate the factorial of a number... //

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scn.nextInt();
        int ans = 1;

        for (int i = 1; i <= num; i++) {
            ans *= i;
        }

        System.out.println(ans);
        scn.close();
    }
}
