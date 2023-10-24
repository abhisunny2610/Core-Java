// ...Create a calculator using switch statement to perform addition, subtraction, multiplication  and division... //

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Double num1;
        Double num2;
        Double ans;
        char oper;

        System.out.print("Enter first number: ");
        num1 = scn.nextDouble();
        System.out.print("Enter Operator: ");
        oper = scn.next().charAt(0);
        System.out.print("Enter second number: ");
        num2 = scn.nextDouble();

        switch (oper) {
            case '+':

                ans = num1 + num2;

                System.out.println(num1 + " + " + num2 + " = " + ans);

                break;

            case '-':

                ans = num1 - num2;

                System.out.println(num1 + " - " + num2 + " = " + ans);

                break;

            case '*':

                ans = num1 * num2;

                System.out.println(num1 + " * " + num2 + " = " + ans);

                break;

            case '/':

                ans = num1 / num2;

                System.out.println(num1 + " / " + num2 + " = " + ans);

                break;

            default:

                System.out.println("Error! The operator is not correct");

                break;

        }
        scn.close();
    }
}
