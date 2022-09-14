import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int[] array = new int [5];
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER ELEMENTS OF ARRAY: ");
		for (int i=0;i<5;i++){
		    array[i]=in.nextInt();
		}
		for(int i=0;i<array.length;i++){
		    boolean isprime=true;
		    for(int j=2;j<i;j++){
		        if(array[i]%j==0){
		            isprime=false;
		            break;
		        }
		    }
		    if(isprime){
		        System.out.println(array[i]+"is prime nos. in the array.");
		    }
		}
	}
}
