//EXCEPTION IS AN EVENT THAT OCCURS WHEN A PROGRAM IS EXECUTED
//(DIFFERENTLY) DISRUPTINGTHE NORMAL FLOW OF INSTRUCTIONS.
//2 TYPES OF EXCEPTIONS:- 1)CHECKED EXCEPTIONS-I.E. COMPILE
//TIME EXCEPTION HANDLED BY COMPILER ; 2)UNCHECKED EXCEPTION- RUNTIME
//EXCEPTION.
//USING TRY BLOCK
public class Main
{
	public static void main(String[] args) {
		int a=60;
		int b=0;
		try{
		 int c=a/b;   
		 System.out.println("RESULT: "+c);
		}
		catch(Exception e){
		    System.out.println("FAILED TO DIVIDE.");
		    System.out.println(e);
		}
		//IF TRY BLOCK IS NOT ABLE TO PROCESS THE OUTPUT THEN EXECUTION
		//GOES TO CATCH BLOCK.
		System.out.println("END OF THE PROGRAM----");
	}
}
/*
OUTPUT->
FAILED TO DIVIDE.
java.lang.ArithmeticException: / by zero
END OF THE PROGRAM----
*/
