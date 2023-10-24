// ...Write a program to print Fibonacci series of n terms where n is input by user... //

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Ente5r the number: ");
        int n = scn.nextInt();

        int a = 1; // initial two elements 1 ans 1
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        scn.close();
    }
}