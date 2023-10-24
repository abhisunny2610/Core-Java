import java.util.Scanner;

/*        Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find 
          union between these two arrays and print the number of elements of the union set.
          Union of the two arrays can be defined as the set containing distinct elements from both 
          the arrays. If there are repetitions, then only one occurrence of element should be printed 
          in the union. */

public class ques2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of an array: ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = scn.nextInt();
        }

        for (int i = 0; i < m; i++) {
            arr2[i] = scn.nextInt();
            boolean check = false;

            for (int j = 0; j < n; j++) {
                if (arr2[i] == arr1[j]) {
                    check = true;
                    break;
                }
            }
            if (!check) {

                System.out.println(arr2[i]);

            }

        }
        scn.close();
    }
}
