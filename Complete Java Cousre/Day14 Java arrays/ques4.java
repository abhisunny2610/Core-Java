/* ...Calculate the minimum elemnt in the array in the array {2,-3,5,8,1,0,-4}
 * using standard library method for calculating the minimum element...
 */

public class ques4 {
    public static void main(String[] args) {
        int[] arr = { 2, -3, 5, 8, 1, 0, -4 };
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
