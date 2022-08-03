//SUM OF FIRST N NATURAL NOS. BY ITERATIVE APPROACH.
public class java49 {
    static int nSum(int n) {
        int sum = 0;
        for(int i=1; i<n+1; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println("The sum of first " + num + " natural numbers is: " + nSum(num));
    }
}
