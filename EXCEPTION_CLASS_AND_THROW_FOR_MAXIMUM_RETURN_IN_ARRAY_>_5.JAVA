//JAVA PROGRAM THAT ALLOWS US ACCESSING AN ARRAY UNTIL A VALID 
//INDEX IS GIVEN.IF MAX RETURNS EXCEED 5 PRINT ERROR.
//THROW A CUSTOM EXCEPTION OR EXCEPTION CLASS IF MAX RETURNS > 5.
import java.util.Scanner;
class RetryException extends Exception{
    public String toString(){
        return "Error";
    }
    public String getMessage(){
        return "Error";
    }
}
public class Main
{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;

        int i = 1;
        while (true) {
            System.out.println("Enter the value of your index");
            int b = sc.nextInt();
            if (i < 5) {
                try {
                    System.out.println("Your value" + a[b]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    i++;
                    System.out.println("You have crossed limit" + i);
                }
            }
            else {
                try {
                    throw new RetryException();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    break;
                }
            }
        }
}
}
/*
OUTPUT->
Enter the value of your index
21
You have crossed limit2
Enter the value of your index
22
You have crossed limit3
Enter the value of your index
23
You have crossed limit4
Enter the value of your index
24
You have crossed limit5
Enter the value of your index
25
Error
*/
