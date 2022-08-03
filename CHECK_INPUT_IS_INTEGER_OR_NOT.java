import java.util.Scanner;
public class java6 {
    public static void main(String args[]){
        System.out.println("PLS. TYPE THE NUMBER WHICH IS TO BE CHECKED INTEGER OR NOT: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        //sc.hasNextInt() returns True if the input no. is an integer else returns False.
    }
}
