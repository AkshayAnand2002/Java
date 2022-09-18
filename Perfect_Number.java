import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int number = sc.nextInt();
        int sum =0;
        for(int i=1 ; i< number ; i++) {
        	if(number % i == 0 ) {
        		sum = sum+ i;
        		
        	}
        }
        if(sum==number) {
        	System.out.println("PERFECT NO.");
        }
        else {
        	System.out.println("NOT A PERFECT NO.");
        }
        sc.close();
	}

}
