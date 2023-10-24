// ... Write a program which takes the values of length and breadth from user and check if it is  a square or not... //

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int length;
        System.out.print("Enter Length: ");
        length = scn.nextInt();
        int breadth;
        System.out.print("Enter Breadth: ");
        breadth = scn.nextInt();

        if (length == breadth) {
            System.out.println("It is a Square");
        } else {
            System.out.println("It is not a Square");
        }

        scn.close();
    }
}
