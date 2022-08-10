//EXCEPTION IS AN EVENT THAT OCCURS WHEN A PROGRAM IS EXECUTED
//(DIFFERENTLY) DISRUPTINGTHE NORMAL FLOW OF INSTRUCTIONS.
//2 TYPES OF EXCEPTIONS:- 1)CHECKED EXCEPTIONS-I.E. COMPILE
//TIME EXCEPTION HANDLED BY COMPILER ; 2)UNCHECKED EXCEPTION- RUNTIME
//EXCEPTION.
//NESTED TRY-CATCH-->try and catch inside try statement.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int [] marks = new int[3];
		marks[0]=78;
		marks[1]=79;
		marks[2]=80;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF INDEX: ");
		int ind = sc.nextInt();
	    try{
	        System.out.println("WELCOME");
	        try{
	            System.out.println(marks[ind]);
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
}
/*
OUTPUT->
ENTER THE VALUE OF INDEX: 
4
WELCOME
THIS INDEX DOES NOT EXIST.
EXCEPTION IN LEVEL 2.
*/
