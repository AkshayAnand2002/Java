/*
Write a java program that will request the user input their initial and last name. Then it will
display a message enclosing the given name onto the console (screen). Here you need to
create another method which will perform this functionality and call it through main.
*/
import java.util.Scanner;
public class Main{
    String firstname;
    String lastname;
    void getdetails(Main ss){//inop ss is the object of inop class
        Scanner sc = new Scanner(System.in);
        ss.firstname=sc.nextLine();
        ss.lastname=sc.nextLine();
        sc.close();
    }
    void printdetails(){
        System.out.println("FIRST NAME: "+firstname);
        System.out.println("LAST NAME: "+lastname);
    }
    public static void main(String[] args) {
		Main p = new Main();
		p.getdetails(p);
		p.printdetails();
	}
}
/*
akshay
anand
FIRST NAME: akshay
LAST NAME: anand
*/
