//JAVA PROGRAM TO PRINT "HAHA" DURING ArithmeticException AND 
//"HEHE" DURING IllegalArgumentException.
import java.util.Scanner;

public class Main
{
	public static void main(String[] args){
	    try{
	        int a = 669/0;
	    }
	    catch(IllegalArgumentException e){
	        System.out.println("hehe");
	    }
	    catch(ArithmeticException e){
	        System.out.println("haha");
	    }
}
}
/*
OUTPUT->
haha
*/
