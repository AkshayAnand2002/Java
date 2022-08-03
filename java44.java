//RECURSIVE SUM OF FIRST N NATURAL NOS.
public class java44 {
    static int sumrecursion(int n){
        if(n==1){
            return 1;
        }
        return n+sumrecursion(n-1);
    }
    public static void main(String[] args) {
        int c=sumrecursion(3);
        System.out.println(c);
    }
}
