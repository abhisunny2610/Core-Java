// ...Given an array of the integer number (2,3,4,5,-1,3-3,-8,-5) and print only postive value present in the array...

public class ques1 {
    public static void main(String[] args) {

        int[] arr1 = { 2, 3, 4, 5, -1, 3 - 3, -8, -5 };

        for (int val : arr1) {
            if (val >= 0) {
                System.out.println(val);
            }
        }

    }
}
