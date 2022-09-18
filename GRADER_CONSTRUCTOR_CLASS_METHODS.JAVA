/*
Write a class, Grader, which has an instance variable, score, an appropriate constructor and 
appropriate methods. A method, letterGrade() that returns the letter grade as O/E/A/B/C/F. 
Now write a demo class to test the Grader class by reading a score from the user, using it to 
create a Grader object after validating that the value is not negative and is not greater than 100.
 Finally, call the letterGrade() method to get and print the grade
*/
import java.util.Scanner;
class Grader{
	private int score;
	public Grader(int score) {
		this.score=score;
	}
	public char letterGrade() {
		char grade;
		if(score>=90) {
			grade='O';
		}
		else if(score>=80 && score<90) {
			grade='E';
		}
		else if(score>=70 && score<80) {
			grade='A';
		}
		else if(score>=60 && score<70) {
			grade='B';
		}
		else if(score>=50 && score<60) {
			grade='C';
		}
		else {
			grade='F';
		}
		return grade;
	}
}
public class GraderTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER SCORE: ");
		int score=sc.nextInt();
		if(score>100 || score<0) {
			System.out.println("INVALID SCORE.");
			System.exit(0);
		}
		Grader grade = new Grader(score);//CONSTRUCTOR CALL
		System.out.println("THE GRADE IS: "+grade.letterGrade());
		sc.close();
	}
}
