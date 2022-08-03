import java.util.Scanner;
public class java41 {
    // Formula - fib(n-1)+fib(n-2)
    static int fib(int n){
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        num = sc.nextInt();
        System.out.println("PRINTING FIBONACCI SERIES SERIES TILL THE NO. OF TERMS YOU ENTERED.");
        for (int i = 0;i<=num-1;i++){
            System.out.println(fib(i));
        }
        System.out.println("THE TERM AT THE POSITION YOU ENTERED: ");
        System.out.println(fib(num-1));
    }
}
