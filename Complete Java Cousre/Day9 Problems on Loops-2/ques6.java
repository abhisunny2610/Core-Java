// ...Write a program to print alphabet diamond pattern... //

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number(how long): ");
        int size = scn.nextInt();
        int alpha = 65;
        int num = 0;

        // for upper
        for (int i = 1; i <= size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" "); // top half until the spaces need to be printed
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print((char) (alpha + num++));// top half until the char need tobe printed, next char can be
                                                         // achieved by incrementing the ASCII code by 1
            }
            num = 0;
            System.out.println();
        }

        // for lower
        for (int i = 1; i <= size - 1; i++) {
            for (int j = 0; j < i; j++) { // bottom half
                System.out.print(" ");
            }
            for (int k = (size - i) * 2 - 1; k > 0; k--) {
                System.out.print((char) (alpha + num++));
            }
            num = 0;
            System.out.println();
        }

        scn.close();
    }
}
