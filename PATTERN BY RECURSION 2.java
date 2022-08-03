public class java47 {
    static void pattern2_recur(int n){
        if(n>0){
            pattern2_recur(n-1);//RECURSIVE CALL.
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        pattern2_recur(7);
    }
}
/*PATTERN FOR THE ABOVE PROGRAM---
 *
 **
 ***
 ****
 *****
 ******
 *******
 */
