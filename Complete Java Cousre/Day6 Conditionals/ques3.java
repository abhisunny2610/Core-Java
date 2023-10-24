/*
   Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and  calculate Profit 
   or Loss.
   Profit = S.P - C.P 
   Loss = C.P - S.P

   (S.P is Selling Price and C.P is Cost Price)

 */

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        int cp = scn.nextInt();
        System.out.print("Enter selling price: ");
        int sp = scn.nextInt();
        System.out.println("----------------------------------------------");

        int profit = sp - cp;
        int loss = cp - sp;

        if (sp > cp) {
            System.out.println("Profit of " + profit + " rs.");
        } else if (sp < cp) {
            System.out.println("Loss of " + loss + " rs.");
        } else {
            System.out.println("No Profit No Loss");
        }
        scn.close();
    }
}
