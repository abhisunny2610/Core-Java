// ...Write a program to print the cross pattern given below (in the shape of X)... //

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number(how long): ");
        int line = scn.nextInt();

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                if (i == j || i + j == line - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scn.close();
    }
}
