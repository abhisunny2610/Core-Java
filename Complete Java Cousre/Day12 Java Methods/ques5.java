// ...Write a Java method to find the smallest number among three numbers... //

import java.util.Scanner;

public class ques5 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter three Number: ");

        int a = scn.nextInt();

        int b = scn.nextInt();

        int c = scn.nextInt();

        System.out.print(smallest(a, b, c));

        scn.close();

    }

    public static int smallest(int a, int b, int c) {

        return Math.min(a, Math.min(b, c));

    }

}
