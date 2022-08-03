import java.util.Scanner;
public class java4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER MARKS OF PHYSICS:");
        float physics =sc.nextInt();
        System.out.println("ENTER MARKS OF CHEMISTRY:");
        float chemistry =sc.nextInt();
        System.out.println("ENTER MARKS OF MATHS:");
        float maths =sc.nextInt();
        System.out.println("ENTER MARKS OF PHYSICAL-EDUCATION:");
        float phyedu =sc.nextInt();
        System.out.println("ENTER MARKS OF ENGLISH:");
        float english =sc.nextInt();
        float sum=physics+chemistry+maths+phyedu+english;
        System.out.println("YOUR TOTAL MARKS: ");
        System.out.println(sum);
        System.out.println("YOUR TOTAL PERCENTAGE: ");
        System.out.println(sum/5);
    }
}
/*
import java.util.Scanner;
class percentage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Physics marks : ");
        int physics = scan.nextInt();
        System.out.println("Enter your English marks : ");
        int English = scan.nextInt();
        System.out.println("Enter your Chemistry marks : ");
        int chemistry = scan.nextInt();
        System.out.println("Enter your Mathematics marks : ");
        int mathematics = scan.nextInt();
        System.out.println("Enter your Computer Science marks : ");
        int computer = scan.nextInt();
        float percentage = ((physics + English + chemistry + mathematics + computer)/500.0f)*100;
        System.out.println("percentage : ");
        System.out.println(percentage);
    }
}
*/
//IN THE ABOVE PROGRAM TAKING ALL INPUTS IN INTEGER AND GENERATING THE OUTPUT IN FLOAT.(BY 500.0f)
