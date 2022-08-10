//EXCEPTION IS AN EVENT THAT OCCURS WHEN A PROGRAM IS EXECUTED
//(DIFFERENTLY) DISRUPTINGTHE NORMAL FLOW OF INSTRUCTIONS.
//2 TYPES OF EXCEPTIONS:- 1)CHECKED EXCEPTIONS-I.E. COMPILE
//TIME EXCEPTION HANDLED BY COMPILER ; 2)UNCHECKED EXCEPTION- RUNTIME
//EXCEPTION.
//HANDLING SPECIFIC EXCEPTIONS
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int [] marks = new int[3];
		marks[0]=78;
		marks[1]=79;
		marks[2]=80;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE ARRAY INDEX: ");
		int ind = sc.nextInt();
		System.out.println("ENTER THE NUMBER YOU WANT TO DIVIDE THE VALUE WITH: ");
		int number = sc.nextInt();
		try{
		    System.out.println("THE VALUE AT ARRAY INDEX ENTERED IS: "+marks[ind]);
		    System.out.println("THE VALUE OF ARRAY'S VALUE/NUMBER IS: "+marks[ind]/number);
		}
		catch(ArithmeticException e){
		    System.out.println("ArithmeticException OCCURED.");
		    System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
		    System.out.println("ArrayIndexOutOfBoundsException OCCURED.");
		    System.out.println(e);
		}
		catch(Exception e){
		    System.out.println("SOME OTHER EXCEPTION OCCURED.");
		    System.out.println(e);
		}
	}
}
/*
OUTPUT->
ENTER THE ARRAY INDEX: 
2
ENTER THE NUMBER YOU WANT TO DIVIDE THE VALUE WITH: 
0
THE VALUE AT ARRAY INDEX ENTERED IS: 80
ArithmeticException OCCURED.
java.lang.ArithmeticException: / by zero
*/
