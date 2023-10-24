// ...Write a Java method to compute the average of three numbers... //

import java.util.Scanner;

public class ques1 {
    public static int avg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("Enter three number for calculate average ");
        System.out.print("Enter first number: ");
        int a = scn.nextInt();
        System.out.print("Enter second number: ");
        int b = scn.nextInt();
        System.out.print("Enter second number: ");
        int c = scn.nextInt();

        System.out.println(avg(a, b, c));
        scn.close();
    }
}
