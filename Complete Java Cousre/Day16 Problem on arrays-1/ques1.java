import java.util.Scanner;

/*Given an array sorted in increasing order of size n and an integer x, fing=d if there exists a 
 * pair in the array whose absolute difference is exactlyx.(n>1)
 */

public class ques1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of an array:");
        int n = scn.nextInt();

        System.out.println("Enter an array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter Difference: ");
        int x = scn.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] - arr[i] == x) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
        scn.close();
    }

}
