import java.util.Scanner;
public class java12 {
    public static void main(String[] args) {
        float a=6.7698f;
        float b = 5.6454f;
        System.out.printf("THE VALUE OF a is %.3f AND THE VALUE OF b IS %9.2f.",a,b);
        System.out.format("THE VALUE OF a is %f AND THE VALUE OF b IS %f.",a,b);
        //System.out.printf And System.out.format both give same output.
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();//to print whole line of string input as the String st = sc.next
        //will print only the first word of the whole input string.
        System.out.println(st);
    }
}
