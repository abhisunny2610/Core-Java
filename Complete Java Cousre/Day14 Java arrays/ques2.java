// ...Convert the list of string {"ab", "bc", "cd", "de", "ef", "gh", "ij"} into an array of string and print all strings stored on add indices of the array... //

public class ques2 {
    public static void main(String[] args) {
        String[] arr = { "ab", "bc", "cd", "de", "ef", "fg", "gh" };

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
