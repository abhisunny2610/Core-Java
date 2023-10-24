import java.util.Scanner;

// Given an array of size n, find the total number of occurrences of given number x.

public class ques2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n = scn.nextInt();

        System.out.println("Enter an array: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the number: ");
        int x = scn.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println(count);
        scn.close();
    }
}
