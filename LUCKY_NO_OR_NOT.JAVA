import java.util.Scanner;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("INPUT A FOUR DIGIT NO.");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int fourth=n%10;
		int third=(n/10)%10;
		int second=(n/100)%10;
		int first=(n/1000)%10;
		if(first+second == third+fourth){
		    System.out.println("LUCKY NO.");
		}
		else{
		    System.out.println("NOT LUCKY NO.");
		}
	}
}
