//CLASS DISPLAYING NUMBER AFTER TAKING NUMBER AS INPUT FROM USER.
import java.util.Scanner;
class input{
Scanner sc = new Scanner (System.in);
int a = sc.nextInt();
}
public class Main
{
	public static void main(String[] args) {
		input i = new input ();
		System.out.print("your input number is : "+i.a);
	}
}
