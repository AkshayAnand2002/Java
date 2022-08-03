import java.util.Scanner;
public class java20 {
    public static void main(String[] args) {
        System.out.println("PLS. TYPE YEAR TO CHECK: ");
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
//        if(year%100==0){
//            if(year%400==0){
//                System.out.println("THIS IS A LEAP YEAR.");
//            }
//            else{
//                System.out.println("THIS IS NOT A LEAP YEAR.");
//            }
//        }
//        else if(year%4==0){
//            System.out.println("THIS IS A LEAP YEAR.");
//        }
        if(year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println("Given year is Leap Year");
        }
        else
        {
            System.out.println("Given year is not Leap Year");
        }
    }
}
