//EXCEPTION CLASS
import java.util.Scanner;
class myexception extends Exception{
    public String toString(){
        return "I AM toString()";
    }
    public String getMessage(){
        return "I AM getMessage()";
    }
}
public class Main
{
	public static void main(String[] args) {
	      int a;
	      Scanner sc = new Scanner(System.in);
	      a=sc.nextInt();
	      if(a<9){
	          try{
	       //   throw new myexception();
	       throw new ArithmeticException("THIS IS AN EXCEPTION.");
	          }
	          catch(Exception e){
	              System.out.println(e.getMessage());
	              System.out.println(e.toString());
	              e.printStackTrace();
	              //printStackTrace tells the last error occured at which line.
	              System.out.println("FINISHED NOW.");
	          }
	      }
	      
	}
}
/*
OUTPUT->
4
THIS IS AN EXCEPTION.
java.lang.ArithmeticException: THIS IS AN EXCEPTION.
java.lang.ArithmeticException: THIS IS AN EXCEPTION.
	at Main.main(Main.java:20)
FINISHED NOW.
*/
