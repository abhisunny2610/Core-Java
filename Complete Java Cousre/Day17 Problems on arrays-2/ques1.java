import java.util.Scanner;

/*
 * Given an array arr[] of size n, find the first repeating element. The element should occur more than
once and the index of its first occurrence should be the smallest. If no repeating element exists, print -1.
(Assume 1 based indexing)
 */

public class ques1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter The length of an array: ");
        int n = scn.nextInt();

        System.out.println("Enter an array: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
        System.out.println(-1);
        scn.close();
    }
}
