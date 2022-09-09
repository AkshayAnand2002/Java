import java.util.Scanner;
public class Program2 {
	String studentname;
	int enrollno;
	String collegename;
	long mobileno;
	String city;
	public static void main(String[] args) {
		Program2 p = new Program2();
		Scanner sc = new Scanner(System.in);
		// sc.nextLine -> 
		p.studentname = sc.nextLine();
		p.enrollno=sc.nextInt();
		p.collegename=sc.next();
		p.mobileno = sc.nextLong();
		p.city=sc.next();
		System.out.println(p.studentname);
		System.out.println(p.enrollno);
		System.out.println(p.collegename);
		System.out.println(p.mobileno);
		System.out.println(p.city);
		sc.close();
	}

}
