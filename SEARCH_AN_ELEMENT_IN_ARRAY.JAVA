import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n,x,flag=0,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NO. OF ELEMENTS IN ARRAY: ");
		n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("ENTER ALL ELEMENTS: ");
		for(i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		System.out.println("ENTER THE ELEMENT TO FIND: ");
		x=sc.nextInt();
		for(i=0;i<n;i++){
		    if(a[i]==x){
		        flag=1;
		        break;
		    }
		    else{
		        flag=0;
		    }
		}
		if(flag==1){
		    System.out.println("ELEMENT FOUND AT POSITION: "+(i+1));
		}
		else{
		    System.out.println("ELEMENT NOT FOUND");
		}
	}
}
