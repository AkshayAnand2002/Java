import java.util.Scanner;
public class Program3 {
	int basicprog;
	int maths;
	int computernetwork;
	public static void main(String[] args) {
		Program3 p = new Program3();
		int n=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			p.basicprog=sc.nextInt();
			p.maths=sc.nextInt();
			p.computernetwork=sc.nextInt();
			if(p.basicprog+p.maths+p.computernetwork >= 240 || p.basicprog+p.maths >= 165) {
				System.out.println("QUALIFIED");
			}
			else {
				System.out.println("NOT QUALIFIED");
			}
			sc.close();
		}
		
	}

}
