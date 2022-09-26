import java.util.Scanner;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("INPUT AS NO1<SPACE><OPERATOR><SPACE>NO2");
		Scanner sc = new Scanner(System.in);
		double d1=sc.nextDouble();
		char op=sc.next().charAt(0);
		double d2=sc.nextDouble();
		if(op=='+'){
		    System.out.println(d1+d2);
		}
		if(op=='-'){
		    System.out.println(d1-d2);
		}
		if(op=='*'){
		    System.out.println(d1*d2);
		}
		if(op=='/'){
		    System.out.println(d1/d2);
		}
	}
}
