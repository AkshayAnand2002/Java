//TO SUM UP THE PRODUCTS OF MULTIPLICATION.
public class java27 {
    public static void main(String[] args) {
        int n=8;
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+n*i;//n*i is the multiplication of 8 and i i.e. 8X1,8X2,8X3,...
            //sum=sum+n*i to add them.
        }
        System.out.println(sum);
    }
}
