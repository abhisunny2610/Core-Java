/*Write a program to print the area of a rectangle by creating a class named 'Area' taking the values
of its length and breadth as parameters of its constructor and having a method named 'returnArea'
which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
imp*/

import java.util.Scanner;

class Area {
    int length;
    int breadth;

    public Area(int l, int b) {
        length = l;
        breadth = b;
    }

    public int getArea() {
        return length * breadth;
    }
}

public class ques3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int l, b;
        System.out.print("Enter the length: ");
        l = scn.nextInt();
        System.out.print("Enter the breath: ");
        b = scn.nextInt();

        Area a = new Area(l, b);
        System.out.println("Area of rectangle is: " + a.getArea());
        scn.close();
    }
}
