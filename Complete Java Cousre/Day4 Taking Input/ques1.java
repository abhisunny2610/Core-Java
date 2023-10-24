
/* 
    Input name, roll number and field of interest from user and print in the format below :
    Name: xyz, Roll number: xyz, Field of interest: xyz
    Input : Single line format
    Aman Gupta 4053 Physics
    Output :
    Name: Aman Gupta
    Roll Number: 4053
    Field of interest: Physics
*/
import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String first_name = scn.next();
        String last_name = scn.next();
        int roll_num = scn.nextInt();
        String field_of_interest = scn.next();

        System.out.println("Name: " + first_name + " " + last_name);
        System.out.println("Roll Number: " + roll_num);
        System.out.println("Field of interest: " + field_of_interest);
        scn.close();
    }

}
