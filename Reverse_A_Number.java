//REVERSE A NUMBER
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int num,rem,sum=0,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER: ");
		num=sc.nextInt();
		temp=num;//num copied in temp
		while(temp !=0){
		    rem=temp%10;
		    sum=sum*10+rem;
		    temp=temp/10;
		}
		System.out.println("REVERSE NUMBER: "+sum);
	}
}
