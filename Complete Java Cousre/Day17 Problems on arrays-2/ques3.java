import java.util.Scanner;
import java.util.Arrays;

/*
 *  Minimum Platforms
Given arrival and departure times of all trains that reach a railway station. Find the minimum number
of platforms required for the railway station so that no train is kept waiting.
Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure
time can never be the same for a train but we can have arrival time of one train equal to departure time
of the other. At any given instance of time, same platform can not be used for both departure of a train
and arrival of another train. In such cases, we need different platforms.
 */

public class ques3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int n = scn.nextInt();

        System.out.println("Enter the arrival array: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the departure array: ");
        int[] dep = new int[n];

        for (int i = 0; i < n; i++) {
            dep[i] = scn.nextInt();
        }

        Arrays.sort(arr);
        Arrays.sort(dep);

        int plat_needed = 1, result = 1;
        int i = 1, j = 0;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                plat_needed++;
                i++;
            } else if (arr[i] > dep[j]) {
                plat_needed--;
                j++;
            }
            if (plat_needed > result) {
                result = plat_needed;
            }
            System.out.println(result);
        }

        scn.close();
    }
}
