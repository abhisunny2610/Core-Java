
/* Given an array of positive and negative numbers, arrange them in an alternate fashion such that
every positive number is followed by a negative and vice-versa maintaining the order of appearance.
The number of positive and negative numbers need not be equal. Begin with a negative number.
If there are more positive numbers, they appear at the end of the array. If there are more negative
numbers, they too appear at the end of the array. */
import java.util.Scanner;

public class ques2 {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
System.out.println("Enter the length of the array: ”);
int n = scn.nextInt();
int[] arr = new int[n];
for(int i = 0; i < n; i++){
arr[i] = scn.nextInt();
}
int outofplace = -1; //An element is out of place if it is negative and at odd index (0-based index),
or if it is positive and at even index (0-based index).
for (int index = 0; index < n; index++) {
if (outofplace >= 0) {
if (((arr[index] >= 0) && (arr[outofplace] < 0)) || ((arr[index] < 0) && (arr[outofplace] >= 0))) {
rightrotate(arr, n, outofplace, index);
if (index - outofplace >= 2)
outofplace = outofplace + 2;
else
outofplace = -1;
}
}
if (outofplace == -1) { //if no entry has been flagged out-of-place
if (((arr[index] >= 0)
&& ((index & 0x01) == 0))
|| ((arr[index] < 0)
&& (index & 0x01) == 1))
outofplace = index;
}
}
for(int i = 0; i < n; i++){
System.out.print(arr[i] + " ");
}
}

    public static void rightrotate(int arr[], int n, int outofplace, int cur) {
        int tmp = arr[cur];
        for (int i = cur; i > outofplace; i--)
            arr[i] = arr[i - 1];
        arr[outofplace] = tmp;
    }
}