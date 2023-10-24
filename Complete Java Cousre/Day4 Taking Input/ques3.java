/* ...f the marks of Robert in three subjects are entered through keyboard (each out of 100), write a program
to calculate his total marks and percentage marks... */

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int first_subject = src.nextInt();
        int second_subject = src.nextInt();
        int third_subject = src.nextInt();

        System.out.println("Marks in first subject: " + first_subject);
        System.out.println("Marks in second subject: " + second_subject);
        System.out.println("Marks in third subject: " + third_subject);

        int result = first_subject + second_subject + third_subject;
        double percentage = (result / 3);
        System.out.println("===========================================");
        System.out.println("Total Marks" + result);
        System.out.println("Percentage: " + percentage);
        src.close();

    }
}
