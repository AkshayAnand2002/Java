public class java46 {
    static void pattern1_recur(int rows) {
        if(rows > 0) {
            for(int i=rows; i>0; i--) {
                System.out.print("*");
            }
            System.out.println("");
            pattern1_recur(rows-1);
        }
    }
    public static void main(String[] args) {
        int r = 4;
        pattern1_recur(r);
    }
}
/*PATTERN OF ABOVE PROGRAM--
 ****
 ***
 **
 *
 */
