import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		str=sc.nextLine();
		str=str.trim();//to remove leafing and trailing spaces.
		str=str+" ";
		int size=0;
		String s="";
		String m="";
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(ch==' '){
		        int len=s.length();
		        if(len>size){
		            size=len;
		            m=s;//storing longest word.
		        }
		        s="";
		    }
		    else{
		        s=s+ch;
		    }
		}
		System.out.println("SIZE OF LONGEST WORD: "+size);
		System.out.println("LONGEST WORD: "+m);
	}
}
