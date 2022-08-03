public class java40 {
    static int factorial_recursive(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial_recursive(n-1);
        }
    }
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product=1;
            for(int i=1;i<=n;i++){
                product*=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x=4;
        System.out.println("THE VALUE OF FACTORIAL X IS: "+factorial_recursive(x));
        System.out.println("THE VALUE OF FACTORIAL X IS: "+factorial_iterative(x));
    }
}
