/*Given an unsorted array arr[] of size N having both negative and positive integers, place   

         all negative elements at the end of array without changing the order of positive elements 

         and negative elements */

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of an array: ");
        int n = scn.nextInt();

        System.out.println("Enter an array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] ans = new int[n];

        int idx = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] >= 0) {

                ans[idx] = arr[i];

                idx++;

            }

        }

        for (int i = 0; i < n; i++) {

            if (arr[i] < 0) {

                ans[idx] = arr[i];

                idx++;

            }

        }

        for (int i = 0; i < n; i++) {

            System.out.print(ans[i] + " ");

        }

        scn.close();
    }
}
