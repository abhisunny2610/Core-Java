// ...Write a Java program to swap two numbers with the help of a third variable... //

public class ques5 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        System.out.println("Value of num1 before swaping: " + num1);
        System.out.println("Value of num2 before swaping: " + num2);
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Value of num1 after swaping: " + num1);
        System.out.println("Value of num2 after swaping: " + num2);
    }

}
