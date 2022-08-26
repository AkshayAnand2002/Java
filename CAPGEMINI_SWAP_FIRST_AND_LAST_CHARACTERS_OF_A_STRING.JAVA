/*SWAP THE FIRST AND LAST CHARACTER OF STRING AND PRINT THE STRING.
CONDITION:RETURN THE STRING IS LENGTH < 2.*/
import java.util.*;
public class Main
{
    public static String swap(String str){
        if(str.length()<2)
            return str;
        char[] ch = str.toCharArray();
        char temp=ch[0];
        ch[0]=ch[ch.length-1];
        ch[ch.length-1]=temp;
        return String.valueOf(ch);
        //valueOf returns the string representation.
    }
	public static void main(String[] args) {
	    String str = "java";
		System.out.println(swap(str));
	}
}
