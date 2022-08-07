/*
A STRING IS SAID TO BE UNIQUE WHEN NO LETTER OF STRING REPEATS
ITSELF. EG- COMPUTER IS A UNIQUE STRING. BUT MADAM IS NOT A 
UNIQUE STRING.
IN BELOW PROGRAM IF COMPUTER IS INPUT THEN WHEN i IS AT 0 TH 
INDEX I.E. C THEN j RUNS FROM NEXT POSITION TO LAST ELEMENT OF 
STRING I.E. O TO R . THEN WHEN i IS AT O THEN j RUNS FROM P TO 
R AND SO ON.IF NO MATCH IS FOUND THEN f=0 AND THE STRING IS 
UNIQUE ELSE THE STRING IS NOT UNIQUE.
The nextLine() method of the java. util. Scanner class 
scans from the current position until it 
finds a line separator delimiter. The method returns the String
from the current position to the end of the line.
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str="";
		int i,j,f=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE LINE OF STRING: ");
		str=sc.nextLine();
		for(i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    for(j=i+1;j<str.length();j++){
		        char c=str.charAt(j);
		        if(ch==c){
		            f=1;
		            break;
		        }
		    }
		}
		   if(f==0){
		        System.out.println("STRING IS UNIQUE.");
		    }
		    else{
		        System.out.println("STRING IS NOT UNIQUE.");
		    }
	}
}
