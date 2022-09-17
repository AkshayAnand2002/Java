import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int [] a={10,9,15,18,7,20,12,16};
		int num,i,j;
		int s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ANY NUMBER: ");
		num=sc.nextInt();
		for(i=0;i<8;i++){
		    for(j=(i+1);j<8;j++){// if assumed 10,15 same as 15,10.
		    //else take j=0 if 10,15 not same as 15,10.
		        if(a[i]+a[j]==num){
		            System.out.println("PAIR SUM: "+a[i]+" "+a[j]);
		            s++;
		        }
		    }
		}
		System.out.println("TOTAL NO. OF PAIRS: "+s);
	}
}
