//THROW AND THROWS
//THROW KEYWORD IS USED TO THROW AN EXCEPTION EXPLICITLY BY
//THE PROGRAMMER.
//THROWS GIVE AN INFORMATION TO PROGRAMMER THAT THERE MIGHT BE
//AN EXCEPTION SO ITS BETTER TO BE PREPARED WITH TRY CATCH BLOCK.
//THROWS IS USED FOR AN EXCEPTION WHICH MAY/MAY NOT OCCUR.
//double area(int r) CAN OR MAY THROW NEGATIVE AREA EXCEPTION 
//SO WE WRITE public static double area(int r) throws negativeradiusexception.
import java.util.Scanner;
class negativeradiusexception extends Exception{
    public String toString(){
        return "RADIUS CAN'T BE NEGATIVE.";
    }
    public String getMessage(){
        return "RADIUS CAN NEVER BE NEGATIVE.";
    }
}
public class Main
{   public static double area(int r) throws negativeradiusexception{
            if(r<0){
                throw new negativeradiusexception();
            }
            double result = Math.PI*r*r;
            return result;
     }
    public static int division(int a,int b) throws ArithmeticException{
	          int result=a/b;
	          return result;
	      }
	public static void main(String[] args) {
	    try{
	   //int c = division(6,0);
	   // System.out.println(c);
	   //ABOVE STATEMENT RETURNS OUTPUT AS EXCEPTION 
	    double ar = area(6);
	    System.out.println(ar);
	    //OUTPUT IS 113.09733552923255 .
	    }
	    catch(Exception e){
	        System.out.println("EXCEPTION.");
	    }
	}
}
/*
OUTPUT->
113.09733552923255
*/
