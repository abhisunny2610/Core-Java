// ...Swap two numbers without the use of third variable... //

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter First Number");
        int x = scn.nextInt();
        System.out.println("Enter Second Number");
        int y = scn.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("First number after Swapping: " + x);
        System.out.println("First second after Swapping: " + y);

        scn.close();
    }
}
