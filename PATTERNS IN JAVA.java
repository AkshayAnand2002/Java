public class java43 {
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    /*PATTERN 1---
     *
     **
     ***
     ****
     *****
     ******
     *******
     */
    static void pattern2(int m){
        for(int i=0;i<m;i++){
            for(int j=m;j>i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    /* PATTERN 2---
     *******
     ******
     *****
     ****
     ***
     **
     *
     */
    public static void main(String[] args) {
        pattern1(7);
        //pattern2(7);
    }
}
