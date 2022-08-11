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
        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
                //THIS BREAKS OUT OF WHILE LOOP WHEN EXCEPTION
                //OCCURS.
            }
            finally{
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }
        try{
            System.out.println(50/3);//16
            System.out.println(5/0);//ARITHMETIC EXCEPTION
        }
        finally {
            System.out.println("Yes this is finally");
        }
}
}
/*
OUTPUT->
END OF PROGRAM.
25
0
I am finally for value of b = 9
0
I am finally for value of b = 8
1
I am finally for value of b = 7
1
I am finally for value of b = 6
1
I am finally for value of b = 5
1
I am finally for value of b = 4
2
I am finally for value of b = 3
3
I am finally for value of b = 2
7
I am finally for value of b = 1
java.lang.ArithmeticException: / by zero
I am finally for value of b = 0
16
Yes this is finally
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Main.main(Main.java:43)
*/
