//FINALLY BLOCK CONTAINS THE CODE WHICH IS ALWAYS EXECUTED
//WHETHER THE EXCEPTION IS HANDLED OR NOT.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        try{
            int a =5;
            int b =0;
            int c=a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
        System.out.println("END OF PROGRAM.");
        }
	}
}
/*
OUTPUT->
java.lang.ArithmeticException: / by zero
END OF PROGRAM.
*/
