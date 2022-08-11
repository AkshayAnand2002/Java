//FINALLY BLOCK CONTAINS THE CODE WHICH IS ALWAYS EXECUTED
//WHETHER THE EXCEPTION IS HANDLED OR NOT.
import java.util.Scanner;

public class Main
{   public static int greet(){
        try{
            int a =50;
            int b =2;
            int c=a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
        System.out.println("END OF PROGRAM.");
        }
        return 0;
	}
	public static void main(String[] args){
	    int k = greet();
	    System.out.println(k);
}
}
/*
OUTPUT->
END OF PROGRAM.
25
*/
