public class Project8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=371;int result=0;
		int b=a;
		while(a!=0) {
			int remainder = a%10;
			result+=Math.pow(remainder, 3);
			a=a/10;
		}
		if(b==result) {
			System.out.println(b+" IS ARMSTRONG NO.");
		}
		else {
			System.out.println(b+" IS NOT AN ARMSTRONG NO.");
		}
	}

}
