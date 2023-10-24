
/* ...Given few lines of input(number of lines unknown) where each line has two
strings, concatenate the strings.

Input :
Hello World
Happy Faces
Sunny Day
Good Morning

Output :
HelloWorld
HappyFaces
SunnyDay
GoodMorning 
*/
import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (scn.hasNextLine()) {
            String a = scn.next();
            String b = scn.next();
            System.out.println(a + b);

        }
        scn.close();
    }
}
