//JAVA PROGRAM THAT ALLOWS US ACCESSING AN ARRAY UNTIL A VALID 
//INDEX IS GIVEN.IF MAX RETURNS EXCEED 5 PRINT ERROR.
import java.util.Scanner;

public class Main
{
	public static void main(String[] args){
	    boolean flag = true;
	    int [] marks = new int[3];
	    marks[0]=7;
	    marks[1]=56;
	    marks[2]=6;
	    Scanner sc = new Scanner(System.in);
	    int index;
	    int i=0;
	    while(flag && i<5){
	        try{
	        System.out.println("ENTER THE VALUE OF INDEX: ");
	        index=sc.nextInt();
	        System.out.println("THE VALUE OF marks[index] is: "+marks[index]);
	        break;
	        }
	        catch(Exception e){
	            System.out.println("INVALID INDEX");
	            i++;
	        }
	    }
	    if(i>=5){
	        System.out.println("ERROR");
	    }
}
}
/*
OUTPUT->
ENTER THE VALUE OF INDEX: 
11
INVALID INDEX
ENTER THE VALUE OF INDEX: 
12
INVALID INDEX
ENTER THE VALUE OF INDEX: 
13
INVALID INDEX
ENTER THE VALUE OF INDEX: 
14
INVALID INDEX
ENTER THE VALUE OF INDEX: 
15
INVALID INDEX
ERROR
*/
