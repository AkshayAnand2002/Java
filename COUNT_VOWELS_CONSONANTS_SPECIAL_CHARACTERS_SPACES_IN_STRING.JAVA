//COUNT VOWELS,CONSONANTS,SPECIAL CHARACTERS IN STRING
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ANY LINE OF STRING: ");
		str=sc.nextLine();
		str.toLowerCase();
		int v=0,c=0,n=0,sp=0,spchar=0;
		char ch;
		for(int i=0;i<str.length();i++){
		    ch=str.charAt(i);
		    if(ch>='a'&& ch<='z'){
		        if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
		        v++;
		        else
		        c++;
		    }
		    else if(ch>='0' && ch<='9'){
		        n++;
		    }
		    else if(ch==' '){
		        sp++;
		    }
		    else spchar++;//ANY LEFT ELEMENTS OTHER THAN 
		    //THOSE SEEN ABOVE WILL BE SPECIAL CHARACTER.
		}
		System.out.println("TOTAL NO. OF VOWELS= "+v);
		System.out.println("TOTAL NO. OF CONSONANTS= "+c);
		System.out.println("TOTAL NO. OF SPACES= "+sp);
		System.out.println("TOTAL NO. OF SPECIAL CHARACTER= "+spchar);
		System.out.println("TOTAL NO. OF NOS.= "+n);
	}
}
