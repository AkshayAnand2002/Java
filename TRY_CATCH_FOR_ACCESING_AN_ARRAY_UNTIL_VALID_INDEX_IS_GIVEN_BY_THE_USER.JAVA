//WRITE A JAVA PROGRAM THAT ALLOWS US TO KEEP ACCESSING AN
//ARRAY UNTIL A VALID INDEX IS GIVEN AS USER.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int [] marks = new int[3];
		marks[0]=78;
		marks[1]=79;
		marks[2]=80;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag){
		System.out.println("ENTER THE VALUE OF INDEX: ");
		int ind = sc.nextInt();
	    try{
	        System.out.println("WELCOME TO PROGRAM.");
	        try{
	            System.out.println(marks[ind]);
	            flag=false;
	        }
	        catch(ArrayIndexOutOfBoundsException e){
	            System.out.println("THIS INDEX DOES NOT EXIST.");
	            System.out.println("EXCEPTION IN LEVEL 2.");
	        }
	    }	
	    catch(Exception e){
	        System.out.println("EXCEPTION IN LEVEL 1.");
	    }
		}
		System.out.println("THANKS FOR USING THE PROGRAM.");
	}
}
/*
OUTPUT->
ENTER THE VALUE OF INDEX: 
123
WELCOME TO PROGRAM.
THIS INDEX DOES NOT EXIST.
EXCEPTION IN LEVEL 2.
ENTER THE VALUE OF INDEX: 
23
WELCOME TO PROGRAM.
THIS INDEX DOES NOT EXIST.
EXCEPTION IN LEVEL 2.
ENTER THE VALUE OF INDEX: 
2
WELCOME TO PROGRAM.
80
THANKS FOR USING THE PROGRAM.
*/
